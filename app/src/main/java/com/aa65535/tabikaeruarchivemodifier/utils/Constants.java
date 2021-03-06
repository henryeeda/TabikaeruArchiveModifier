package com.aa65535.tabikaeruarchivemodifier.utils;

public interface Constants {
    int VERSION_MIN = 10400;
    int VERSION_105 = 10500;
    int VERSION_106 = 10600;
    int VERSION_120 = 12000;
    int VERSION_121 = 12100;

    int SHORT_STR_LEN = 0x14;
    int STR_LEN = 0x28;

    int MAX_ALBUM_PAGE = 1014;

    long ACHIEVE_FLAGS_BITS = 0x1fcf;
    int ACHIEVE_FLAGS_BITS_LEN = 13;

    long COLLECT_FLAGS_BITS = 0x17fffe;
    int COLLECT_FLAGS_BITS_LEN = 21;

    long SPECIALTY_FLAGS_BITS = 0xfffff7fffeL;
    int SPECIALTY_FLAGS_BITS_LEN = 40;

    int[] ALL_ITEMS_ARRAY = new int[]{
            0x0000_63, 0x0001_63, 0x0002_63, 0x0003_63, 0x0004_63, 0x0005_63, 0x0006_63, 0x0007_63,
            0x0008_63, 0x0009_63, 0x000a_63, 0x000b_63, 0x000c_63, 0x000d_63, 0x000e_63,
            0x03e8_63, 0x03e9_01, 0x03ea_63, 0x03eb_63, 0x03ec_63, 0x03ed_63, 0x03ee_63, 0x03ef_63,
            0x03f0_63, 0x03f1_63, 0x03f2_63,
            0x07d0_01, 0x07d1_01, 0x07d2_01, 0x07d3_01, 0x07d4_01, 0x07d5_01, 0x07d6_01, 0x07d7_01,
            0x07d8_01, 0x07d9_01, 0x07da_01, 0x07db_01,
            0x0bb9_63, 0x0bba_63, 0x0bbb_63, 0x0bbc_63, 0x0bbd_63, 0x0bbe_63, 0x0bbf_63, 0x0bc0_63,
            0x0bc1_63, 0x0bc2_63, 0x0bc3_63, 0x0bc4_63, 0x0bc5_63, 0x0bc6_63, 0x0bc7_63, 0x0bc8_63,
            0x0bc9_63, 0x0bca_63, 0x0bcc_63, 0x0bcd_63,
            0x0fa0_63, 0x0fa1_63, 0x0fa2_63, 0x0fa3_63, 0x0fa4_63, 0x0fa5_63, 0x0fa6_63, 0x0fa7_63,
            0x0fa8_63, 0x0fa9_63, 0x0faa_63, 0x0fab_63, 0x0fac_63, 0x0fad_63, 0x0fae_63, 0x0faf_63,
            0x0fb0_63, 0x0fb1_63,
            0x2328_01,
    };
}
