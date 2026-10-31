package p;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w5o1 {
    public static final w5o1 c = new w5o1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ifl1 a = new ifl1((byte) 2);

    public static w5o1 a() {
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:202:0x0459  */
    /* JADX WARN: Code duplicated, block: B:203:0x045c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0461  */
    /* JADX WARN: Code duplicated, block: B:207:0x0464  */
    /* JADX WARN: Code duplicated, block: B:209:0x0467  */
    /* JADX WARN: Code duplicated, block: B:210:0x046a  */
    public final r6o1 b(Class cls) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        qrn1 qrn1Var;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        char cCharAt;
        int i11;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        c5o1 z4o1Var;
        int[] iArr2;
        int i18;
        int i19;
        int[] iArr3;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        Field fieldV;
        int i23;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Field fieldV2;
        Field fieldV3;
        int i32;
        char cCharAt9;
        int i33;
        int i34;
        char cCharAt10;
        int i35;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (r6o1) obj;
        }
        y1x0 y1x0Var = y6o1.a;
        if (!vyn1.class.isAssignableFrom(cls)) {
            int i38 = asn1.a;
        }
        g6o1 g6o1VarZzc = ((lxh1) this.a.b).zzc(cls);
        int i39 = g6o1VarZzc.d;
        qrn1 qrn1Var2 = g6o1VarZzc.a;
        if ((i39 & 2) == 2) {
            int i40 = asn1.a;
            y1x0 y1x0Var2 = y6o1.a;
            own1 own1Var = twn1.a;
            z4o1Var = new c5o1(y1x0Var2, qrn1Var2);
        } else {
            int i41 = asn1.a;
            int i42 = j5o1.a;
            int i43 = r1o1.a;
            y1x0 y1x0Var3 = y6o1.a;
            own1 own1Var2 = g6o1VarZzc.a() + (-1) != 1 ? twn1.a : null;
            int i44 = u3o1.a;
            int[] iArr4 = z4o1.j;
            String str = g6o1VarZzc.b;
            int length = str.length();
            int iCharAt2 = 0;
            if (str.charAt(0) >= 55296) {
                int i45 = 1;
                while (true) {
                    i = i45 + 1;
                    if (str.charAt(i45) < 55296) {
                        break;
                    }
                    i45 = i;
                }
            } else {
                i = 1;
            }
            int i46 = i + 1;
            int iCharAt3 = str.charAt(i);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i37 = i46 + 1;
                    cCharAt12 = str.charAt(i46);
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt12 & 8191) << i48;
                    i48 += 13;
                    i46 = i37;
                }
                iCharAt3 = i47 | (cCharAt12 << i48);
                i46 = i37;
            }
            if (iCharAt3 == 0) {
                qrn1Var = qrn1Var2;
                i7 = 0;
                i5 = 0;
                i6 = 0;
                iCharAt = 0;
                i9 = 0;
                iArr = z4o1.j;
                i8 = 0;
            } else {
                int i49 = i46 + 1;
                int iCharAt4 = str.charAt(i46);
                if (iCharAt4 >= 55296) {
                    int i50 = iCharAt4 & 8191;
                    int i51 = 13;
                    while (true) {
                        i17 = i49 + 1;
                        cCharAt7 = str.charAt(i49);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt7 & 8191) << i51;
                        i51 += 13;
                        i49 = i17;
                    }
                    iCharAt4 = i50 | (cCharAt7 << i51);
                    i49 = i17;
                }
                int i52 = i49 + 1;
                int iCharAt5 = str.charAt(i49);
                if (iCharAt5 >= 55296) {
                    int i53 = iCharAt5 & 8191;
                    int i54 = 13;
                    while (true) {
                        i16 = i52 + 1;
                        cCharAt6 = str.charAt(i52);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt6 & 8191) << i54;
                        i54 += 13;
                        i52 = i16;
                    }
                    iCharAt5 = i53 | (cCharAt6 << i54);
                    i52 = i16;
                }
                int i55 = i52 + 1;
                int iCharAt6 = str.charAt(i52);
                if (iCharAt6 >= 55296) {
                    int i56 = iCharAt6 & 8191;
                    int i57 = 13;
                    while (true) {
                        i15 = i55 + 1;
                        cCharAt5 = str.charAt(i55);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i56 |= (cCharAt5 & 8191) << i57;
                        i57 += 13;
                        i55 = i15;
                    }
                    iCharAt6 = i56 | (cCharAt5 << i57);
                    i55 = i15;
                }
                int i58 = i55 + 1;
                iCharAt = str.charAt(i55);
                if (iCharAt >= 55296) {
                    int i59 = iCharAt & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i14 = i60 + 1;
                        cCharAt4 = str.charAt(i60);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i59 |= (cCharAt4 & 8191) << i61;
                        i61 += 13;
                        i60 = i14;
                    }
                    iCharAt = i59 | (cCharAt4 << i61);
                    i2 = i14;
                } else {
                    i2 = i58;
                }
                int i62 = i2 + 1;
                iCharAt2 = str.charAt(i2);
                if (iCharAt2 >= 55296) {
                    int i63 = iCharAt2 & 8191;
                    int i64 = i62;
                    int i65 = 13;
                    while (true) {
                        i13 = i64 + 1;
                        cCharAt3 = str.charAt(i64);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i63 |= (cCharAt3 & 8191) << i65;
                        i65 += 13;
                        i64 = i13;
                    }
                    iCharAt2 = i63 | (cCharAt3 << i65);
                    i3 = i13;
                } else {
                    i3 = i62;
                }
                int i66 = i3 + 1;
                int iCharAt7 = str.charAt(i3);
                if (iCharAt7 >= 55296) {
                    int i67 = iCharAt7 & 8191;
                    int i68 = i66;
                    int i69 = 13;
                    while (true) {
                        i12 = i68 + 1;
                        cCharAt2 = str.charAt(i68);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i67 |= (cCharAt2 & 8191) << i69;
                        i69 += 13;
                        i68 = i12;
                    }
                    iCharAt7 = i67 | (cCharAt2 << i69);
                    i4 = i12;
                } else {
                    i4 = i66;
                }
                int i70 = i4 + 1;
                if (str.charAt(i4) >= 55296) {
                    do {
                        i11 = i70;
                        i70 = i11 + 1;
                    } while (str.charAt(i11) >= 55296);
                }
                int i71 = i70;
                int i72 = i71 + 1;
                int iCharAt8 = str.charAt(i71);
                if (iCharAt8 >= 55296) {
                    int i73 = iCharAt8 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i10 = i74 + 1;
                        cCharAt = str.charAt(i74);
                        qrn1Var = qrn1Var2;
                        if (cCharAt < 55296) {
                            break;
                        }
                        i73 |= (cCharAt & 8191) << i75;
                        i75 += 13;
                        i74 = i10;
                        qrn1Var2 = qrn1Var;
                    }
                    iCharAt8 = i73 | (cCharAt << i75);
                    i72 = i10;
                } else {
                    qrn1Var = qrn1Var2;
                }
                i5 = iCharAt4 + iCharAt4 + iCharAt5;
                int[] iArr5 = new int[iCharAt8 + iCharAt7 + iCharAt4];
                int i76 = iCharAt6;
                i6 = iCharAt8;
                i7 = iCharAt7;
                iArr = iArr5;
                i8 = i76;
                int i77 = i72;
                i9 = iCharAt4;
                i46 = i77;
            }
            Unsafe unsafe = z4o1.k;
            int i78 = i7;
            Object[] objArr = g6o1VarZzc.c;
            Class<?> cls2 = qrn1Var.getClass();
            int i79 = i6 + i78;
            int i80 = iCharAt2;
            int i81 = i46;
            int i82 = 3;
            int[] iArr6 = new int[i80 * 3];
            Object[] objArr2 = new Object[i80 + i80];
            int i83 = i5;
            int i84 = i6;
            int i85 = i79;
            int i86 = i81;
            int i87 = 0;
            int i88 = 0;
            while (i86 < length) {
                int i89 = i86 + 1;
                int iCharAt9 = str.charAt(i86);
                int i90 = length;
                if (iCharAt9 >= 55296) {
                    int i91 = iCharAt9 & 8191;
                    int i92 = i89;
                    int i93 = 13;
                    while (true) {
                        i36 = i92 + 1;
                        cCharAt11 = str.charAt(i92);
                        iArr2 = iArr6;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i91 |= (cCharAt11 & 8191) << i93;
                        i93 += 13;
                        i92 = i36;
                        iArr6 = iArr2;
                    }
                    iCharAt9 = i91 | (cCharAt11 << i93);
                    i18 = i36;
                } else {
                    iArr2 = iArr6;
                    i18 = i89;
                }
                int i94 = i18 + 1;
                int iCharAt10 = str.charAt(i18);
                if (iCharAt10 >= 55296) {
                    int i95 = iCharAt10 & 8191;
                    int i96 = i94;
                    int i97 = 13;
                    while (true) {
                        i34 = i96 + 1;
                        cCharAt10 = str.charAt(i96);
                        i35 = i95;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i95 = i35 | ((cCharAt10 & 8191) << i97);
                        i97 += 13;
                        i96 = i34;
                    }
                    iCharAt10 = i35 | (cCharAt10 << i97);
                    i19 = i34;
                } else {
                    i19 = i94;
                }
                int i98 = iCharAt9;
                if ((iCharAt10 & 1024) != 0) {
                    iArr[i88] = i87;
                    i88++;
                }
                int i99 = iCharAt10 & 255;
                int i100 = i8;
                int i101 = iCharAt10 & 2048;
                if (i99 >= 51) {
                    int i102 = i19 + 1;
                    int iCharAt11 = str.charAt(i19);
                    if (iCharAt11 >= 55296) {
                        int i103 = iCharAt11 & 8191;
                        int i104 = i102;
                        int i105 = 13;
                        while (true) {
                            i32 = i104 + 1;
                            cCharAt9 = str.charAt(i104);
                            i33 = i103;
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i103 = i33 | ((cCharAt9 & 8191) << i105);
                            i105 += 13;
                            i104 = i32;
                        }
                        iCharAt11 = i33 | (cCharAt9 << i105);
                        i30 = i32;
                    } else {
                        i30 = i102;
                    }
                    int i106 = iCharAt11;
                    int i107 = i99 - 51;
                    i20 = i30;
                    if (i107 == 9 || i107 == 17) {
                        objArr2[lqn1.s(i87, i82, 1)] = objArr[i83];
                        i31 = i101;
                        i83++;
                    } else if (i107 != 12) {
                        i31 = i101;
                    } else if (g6o1VarZzc.a() == 1 || i101 != 0) {
                        objArr2[lqn1.s(i87, i82, 1)] = objArr[i83];
                        i83++;
                        i31 = i101;
                    } else {
                        i31 = 0;
                    }
                    int i108 = i106 + i106;
                    Object obj2 = objArr[i108];
                    int i109 = i31;
                    if (obj2 instanceof Field) {
                        fieldV2 = (Field) obj2;
                    } else {
                        fieldV2 = z4o1.v(cls2, (String) obj2);
                        objArr[i108] = fieldV2;
                        iArr[i85] = i87;
                        i85++;
                    }
                    iArr3 = iArr;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV2);
                    int i110 = i108 + 1;
                    Object obj3 = objArr[i110];
                    if (obj3 instanceof Field) {
                        fieldV3 = (Field) obj3;
                    } else {
                        fieldV3 = z4o1.v(cls2, (String) obj3);
                        objArr[i110] = fieldV3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
                    i6 = i6;
                    i21 = iObjectFieldOffset3;
                    i22 = i109;
                } else {
                    iArr3 = iArr;
                    int i111 = i83 + 1;
                    Field fieldV4 = z4o1.v(cls2, (String) objArr[i83]);
                    if (i99 == 9 || i99 == 17) {
                        objArr2[lqn1.s(i87, 3, 1)] = fieldV4.getType();
                    } else {
                        if (i99 != 27) {
                            if (i99 == 49) {
                                i83 += 2;
                                i25 = 3;
                                i26 = 1;
                            } else if (i99 == 12 || i99 == 30 || i99 == 44) {
                                i6 = i6;
                                if (g6o1VarZzc.a() == 1 || i101 != 0) {
                                    i83 += 2;
                                    objArr2[lqn1.s(i87, 3, 1)] = objArr[i111];
                                } else {
                                    i83 = i111;
                                    i101 = 0;
                                }
                            } else if (i99 == 50) {
                                int i112 = i83 + 2;
                                i84++;
                                iArr3[i84] = i87;
                                int i113 = i87 / 3;
                                int i114 = i113 + i113;
                                objArr2[i114] = objArr[i111];
                                if (i101 != 0) {
                                    i83 += 3;
                                    objArr2[i114 + 1] = objArr[i112];
                                } else {
                                    i83 = i112;
                                    i101 = 0;
                                }
                                i6 = i6;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0 || i99 > 17) {
                                i20 = i19;
                                i21 = iObjectFieldOffset;
                                i22 = i101;
                            } else {
                                int i115 = i19 + 1;
                                int iCharAt12 = str.charAt(i19);
                                if (iCharAt12 >= 55296) {
                                    int i116 = iCharAt12 & 8191;
                                    int i117 = 13;
                                    while (true) {
                                        i24 = i115 + 1;
                                        cCharAt8 = str.charAt(i115);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i116 |= (cCharAt8 & 8191) << i117;
                                        i117 += 13;
                                        i115 = i24;
                                    }
                                    iCharAt12 = i116 | (cCharAt8 << i117);
                                    i115 = i24;
                                }
                                int i118 = (iCharAt12 / 32) + i9 + i9;
                                Object obj4 = objArr[i118];
                                str = str;
                                if (obj4 instanceof Field) {
                                    fieldV = (Field) obj4;
                                } else {
                                    fieldV = z4o1.v(cls2, (String) obj4);
                                    objArr[i118] = fieldV;
                                }
                                i87 = i87;
                                i23 = iCharAt12 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                                i21 = iObjectFieldOffset;
                                i20 = i115;
                                i22 = i101;
                            }
                            int i119 = i87 + 1;
                            iArr2[i87] = i98;
                            int i120 = i87 + 2;
                            int i121 = i87;
                            if ((iCharAt10 & 512) != 0) {
                                i27 = 536870912;
                            } else {
                                i27 = 0;
                            }
                            if ((iCharAt10 & 256) != 0) {
                                i28 = 268435456;
                            } else {
                                i28 = 0;
                            }
                            if (i22 != 0) {
                                i29 = Integer.MIN_VALUE;
                            } else {
                                i29 = 0;
                            }
                            iArr2[i119] = i27 | i28 | i29 | (i99 << 20) | i21;
                            iArr2[i120] = (i23 << 20) | iObjectFieldOffset2;
                            i87 = i121 + 3;
                            length = i90;
                            i8 = i100;
                            iArr6 = iArr2;
                            i6 = i6;
                            str = str;
                            i86 = i20;
                            iArr = iArr3;
                            i82 = 3;
                        } else {
                            i25 = 3;
                            i26 = 1;
                            i83 += 2;
                        }
                        objArr2[lqn1.s(i87, i25, i26)] = objArr[i111];
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                        }
                        i20 = i19;
                        i21 = iObjectFieldOffset;
                        i22 = i101;
                    }
                    i83 = i111;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    i20 = i19;
                    i21 = iObjectFieldOffset;
                    i22 = i101;
                }
                i23 = 0;
                int i1110 = i87 + 1;
                iArr2[i87] = i98;
                int i122 = i87 + 2;
                int i123 = i87;
                if ((iCharAt10 & 512) != 0) {
                    i27 = 536870912;
                } else {
                    i27 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i28 = 268435456;
                } else {
                    i28 = 0;
                }
                if (i22 != 0) {
                    i29 = Integer.MIN_VALUE;
                } else {
                    i29 = 0;
                }
                iArr2[i1110] = i27 | i28 | i29 | (i99 << 20) | i21;
                iArr2[i122] = (i23 << 20) | iObjectFieldOffset2;
                i87 = i123 + 3;
                length = i90;
                i8 = i100;
                iArr6 = iArr2;
                i6 = i6;
                str = str;
                i86 = i20;
                iArr = iArr3;
                i82 = 3;
            }
            z4o1Var = new z4o1(iArr6, objArr2, i8, iCharAt, g6o1VarZzc.a, iArr, i6, i79, y1x0Var3, own1Var2);
        }
        r6o1 r6o1Var = (r6o1) concurrentHashMap.putIfAbsent(cls, z4o1Var);
        return r6o1Var != null ? r6o1Var : z4o1Var;
    }
}
