package com.aa65535.tabikaeruarchivemodifier.model;

import com.aa65535.tabikaeruarchivemodifier.utils.Constants;

import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings("unused")
public abstract class Data<T> implements Constants {
    final long offset;
    final int length;
    final RandomAccessFile r;

    Data() {
        this.offset = -1;
        this.r = null;
        this.length = -1;
    }

    Data(RandomAccessFile r, T arg) throws IOException {
        this.offset = r.getFilePointer();
        this.r = r;
        initialize(arg);
        this.length = (int) (r.getFilePointer() - this.offset);
    }

    protected abstract void initialize(T arg) throws IOException;

    public final long offset() {
        return offset;
    }

    public final int length() {
        return length;
    }

    /**
     * remove data from the save file
     */
    final boolean remove() {
        try {
            long len = r.length();
            long off = offset + length();
            r.seek(off);
            byte[] buf = new byte[(int) (len - off)];
            r.readFully(buf);
            r.seek(offset);
            r.write(buf);
            r.setLength(len - length());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public abstract boolean save();

    public abstract boolean write(RandomAccessFile r);
}
