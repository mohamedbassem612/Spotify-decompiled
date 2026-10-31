package p;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ljn1 {
    public static final ljn1 b = new ljn1();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:189:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:207:0x043c  */
    /* JADX WARN: Code duplicated, block: B:208:0x043f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0444  */
    /* JADX WARN: Code duplicated, block: B:212:0x0447  */
    /* JADX WARN: Code duplicated, block: B:214:0x044a  */
    /* JADX WARN: Code duplicated, block: B:215:0x044d  */
    public final qjn1 a(Class cls) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
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
        qjn1 ijn1Var;
        int i18;
        int i19;
        int i20;
        int[] iArr2;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int i23;
        Field fieldV;
        int i24;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field fieldV2;
        Field fieldV3;
        int i33;
        char cCharAt9;
        int i34;
        int i35;
        char cCharAt10;
        int i36;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (qjn1) obj;
        }
        int i39 = phn1.a;
        if (!rin1.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            int i40 = 3;
            njn1 njn1Var = (njn1) rin1.l(cls.asSubclass(rin1.class)).u(3);
            int iCharAt = 0;
            if ((njn1Var.d & 2) == 2) {
                ijn1Var = new jjn1(njn1Var.a);
            } else {
                cen1 cen1Var = njn1Var.a() + (-1) != 1 ? wpo1.a : null;
                Unsafe unsafe = ijn1.k;
                if (unsafe == null) {
                    jah.g("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                    return null;
                }
                if (!(njn1Var instanceof njn1)) {
                    bhn0.d();
                    return null;
                }
                String str = njn1Var.b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i41 = 1;
                    while (true) {
                        i = i41 + 1;
                        if (str.charAt(i41) < 55296) {
                            break;
                        }
                        i41 = i;
                    }
                } else {
                    i = 1;
                }
                int i42 = i + 1;
                int iCharAt2 = str.charAt(i);
                if (iCharAt2 >= 55296) {
                    int i43 = iCharAt2 & 8191;
                    int i44 = 13;
                    while (true) {
                        i38 = i42 + 1;
                        cCharAt12 = str.charAt(i42);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i43 |= (cCharAt12 & 8191) << i44;
                        i44 += 13;
                        i42 = i38;
                    }
                    iCharAt2 = i43 | (cCharAt12 << i44);
                    i42 = i38;
                }
                if (iCharAt2 == 0) {
                    i40 = 3;
                    i6 = 0;
                    i8 = 0;
                    i9 = 0;
                    i7 = 0;
                    i4 = 0;
                    iArr = ijn1.j;
                    i5 = 0;
                } else {
                    int i45 = i42 + 1;
                    int iCharAt3 = str.charAt(i42);
                    if (iCharAt3 >= 55296) {
                        int i46 = iCharAt3 & 8191;
                        int i47 = 13;
                        while (true) {
                            i17 = i45 + 1;
                            cCharAt7 = str.charAt(i45);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i46 |= (cCharAt7 & 8191) << i47;
                            i47 += 13;
                            i45 = i17;
                        }
                        iCharAt3 = i46 | (cCharAt7 << i47);
                        i45 = i17;
                    }
                    int i48 = i45 + 1;
                    int iCharAt4 = str.charAt(i45);
                    if (iCharAt4 >= 55296) {
                        int i49 = iCharAt4 & 8191;
                        int i50 = 13;
                        while (true) {
                            i16 = i48 + 1;
                            cCharAt6 = str.charAt(i48);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i49 |= (cCharAt6 & 8191) << i50;
                            i50 += 13;
                            i48 = i16;
                        }
                        iCharAt4 = i49 | (cCharAt6 << i50);
                        i48 = i16;
                    }
                    int i51 = i48 + 1;
                    int iCharAt5 = str.charAt(i48);
                    if (iCharAt5 >= 55296) {
                        int i52 = iCharAt5 & 8191;
                        int i53 = 13;
                        while (true) {
                            i15 = i51 + 1;
                            cCharAt5 = str.charAt(i51);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i52 |= (cCharAt5 & 8191) << i53;
                            i53 += 13;
                            i51 = i15;
                        }
                        iCharAt5 = i52 | (cCharAt5 << i53);
                        i51 = i15;
                    }
                    int i54 = i51 + 1;
                    int iCharAt6 = str.charAt(i51);
                    if (iCharAt6 >= 55296) {
                        int i55 = iCharAt6 & 8191;
                        int i56 = 13;
                        while (true) {
                            i14 = i54 + 1;
                            cCharAt4 = str.charAt(i54);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i55 |= (cCharAt4 & 8191) << i56;
                            i56 += 13;
                            i54 = i14;
                        }
                        iCharAt6 = i55 | (cCharAt4 << i56);
                        i54 = i14;
                    }
                    int i57 = i54 + 1;
                    int iCharAt7 = str.charAt(i54);
                    if (iCharAt7 >= 55296) {
                        int i58 = iCharAt7 & 8191;
                        int i59 = i57;
                        int i60 = 13;
                        while (true) {
                            i13 = i59 + 1;
                            cCharAt3 = str.charAt(i59);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i58 |= (cCharAt3 & 8191) << i60;
                            i60 += 13;
                            i59 = i13;
                        }
                        iCharAt7 = i58 | (cCharAt3 << i60);
                        i2 = i13;
                    } else {
                        i2 = i57;
                    }
                    int i61 = i2 + 1;
                    iCharAt = str.charAt(i2);
                    if (iCharAt >= 55296) {
                        int i62 = iCharAt & 8191;
                        int i63 = i61;
                        int i64 = 13;
                        while (true) {
                            i12 = i63 + 1;
                            cCharAt2 = str.charAt(i63);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i62 |= (cCharAt2 & 8191) << i64;
                            i64 += 13;
                            i63 = i12;
                        }
                        iCharAt = i62 | (cCharAt2 << i64);
                        i3 = i12;
                    } else {
                        i3 = i61;
                    }
                    int i65 = i3 + 1;
                    if (str.charAt(i3) >= 55296) {
                        do {
                            i11 = i65;
                            i65 = i11 + 1;
                        } while (str.charAt(i11) >= 55296);
                    }
                    int i66 = i65;
                    int i67 = i66 + 1;
                    int iCharAt8 = str.charAt(i66);
                    if (iCharAt8 >= 55296) {
                        int i68 = iCharAt8 & 8191;
                        int i69 = i67;
                        int i70 = 13;
                        while (true) {
                            i10 = i69 + 1;
                            cCharAt = str.charAt(i69);
                            if (cCharAt < 55296) {
                                break;
                            }
                            i68 |= (cCharAt & 8191) << i70;
                            i70 += 13;
                            i69 = i10;
                        }
                        iCharAt8 = i68 | (cCharAt << i70);
                        i67 = i10;
                    }
                    i4 = iCharAt3 + iCharAt3 + iCharAt4;
                    int i71 = iCharAt7;
                    iArr = new int[iCharAt8 + iCharAt + iCharAt3];
                    i5 = i71;
                    i6 = iCharAt3;
                    i42 = i67;
                    i7 = iCharAt8;
                    i8 = iCharAt5;
                    i9 = iCharAt6;
                }
                Object[] objArr = njn1Var.c;
                Class<?> cls2 = njn1Var.a.getClass();
                int i72 = i7 + iCharAt;
                int i73 = i5 + i5;
                int[] iArr3 = new int[i5 * 3];
                Object[] objArr2 = new Object[i73];
                int i74 = i6;
                int i75 = i72;
                int i76 = i7;
                int i77 = 0;
                int i78 = 0;
                while (i42 < length) {
                    int i79 = i42 + 1;
                    int iCharAt9 = str.charAt(i42);
                    int i80 = length;
                    if (iCharAt9 >= 55296) {
                        int i81 = iCharAt9 & 8191;
                        int i82 = i79;
                        int i83 = 13;
                        while (true) {
                            i37 = i82 + 1;
                            cCharAt11 = str.charAt(i82);
                            i18 = i72;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i81 |= (cCharAt11 & 8191) << i83;
                            i83 += 13;
                            i82 = i37;
                            i72 = i18;
                        }
                        iCharAt9 = i81 | (cCharAt11 << i83);
                        i19 = i37;
                    } else {
                        i18 = i72;
                        i19 = i79;
                    }
                    int i84 = i19 + 1;
                    int iCharAt10 = str.charAt(i19);
                    if (iCharAt10 >= 55296) {
                        int i85 = iCharAt10 & 8191;
                        int i86 = i84;
                        int i87 = 13;
                        while (true) {
                            i35 = i86 + 1;
                            cCharAt10 = str.charAt(i86);
                            i36 = i85;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i85 = i36 | ((cCharAt10 & 8191) << i87);
                            i87 += 13;
                            i86 = i35;
                        }
                        iCharAt10 = i36 | (cCharAt10 << i87);
                        i20 = i35;
                    } else {
                        i20 = i84;
                    }
                    int i88 = iCharAt9;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i78] = i77;
                        i78++;
                    }
                    int i89 = iCharAt10 & 255;
                    Object[] objArr3 = objArr2;
                    int i90 = iCharAt10 & 2048;
                    if (i89 >= 51) {
                        int i91 = i20 + 1;
                        int iCharAt11 = str.charAt(i20);
                        if (iCharAt11 >= 55296) {
                            int i92 = iCharAt11 & 8191;
                            int i93 = i91;
                            int i94 = 13;
                            while (true) {
                                i33 = i93 + 1;
                                cCharAt9 = str.charAt(i93);
                                i34 = i92;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i92 = i34 | ((cCharAt9 & 8191) << i94);
                                i94 += 13;
                                i93 = i33;
                            }
                            iCharAt11 = i34 | (cCharAt9 << i94);
                            i31 = i33;
                        } else {
                            i31 = i91;
                        }
                        int i95 = iCharAt11;
                        int i96 = i89 - 51;
                        i21 = i31;
                        if (i96 == 9 || i96 == 17) {
                            objArr3[lqn1.s(i77, i40, 1)] = objArr[i4];
                            i32 = i90;
                            i4++;
                        } else if (i96 != 12) {
                            i32 = i90;
                        } else if (njn1Var.a() == 1 || i90 != 0) {
                            objArr3[lqn1.s(i77, i40, 1)] = objArr[i4];
                            i4++;
                            i32 = i90;
                        } else {
                            i32 = 0;
                        }
                        int i97 = i95 + i95;
                        Object obj2 = objArr[i97];
                        int i98 = i32;
                        if (obj2 instanceof Field) {
                            fieldV2 = (Field) obj2;
                        } else {
                            fieldV2 = ijn1.v(cls2, (String) obj2);
                            objArr[i97] = fieldV2;
                            iArr[i75] = i77;
                            i75++;
                        }
                        iArr2 = iArr3;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV2);
                        int i99 = i97 + 1;
                        Object obj3 = objArr[i99];
                        if (obj3 instanceof Field) {
                            fieldV3 = (Field) obj3;
                        } else {
                            fieldV3 = ijn1.v(cls2, (String) obj3);
                            objArr[i99] = fieldV3;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV3);
                        i8 = i8;
                        i22 = iObjectFieldOffset3;
                        i23 = i98;
                    } else {
                        iArr2 = iArr3;
                        int i100 = i4 + 1;
                        Field fieldV4 = ijn1.v(cls2, (String) objArr[i4]);
                        if (i89 == 9 || i89 == 17) {
                            objArr3[lqn1.s(i77, 3, 1)] = fieldV4.getType();
                        } else {
                            if (i89 != 27) {
                                if (i89 == 49) {
                                    i4 += 2;
                                    i26 = 3;
                                    i27 = 1;
                                } else if (i89 == 12 || i89 == 30 || i89 == 44) {
                                    i8 = i8;
                                    if (njn1Var.a() == 1 || i90 != 0) {
                                        i4 += 2;
                                        objArr3[lqn1.s(i77, 3, 1)] = objArr[i100];
                                    } else {
                                        i4 = i100;
                                        i90 = 0;
                                    }
                                } else if (i89 == 50) {
                                    int i101 = i4 + 2;
                                    i76++;
                                    iArr[i76] = i77;
                                    int i102 = i77 / 3;
                                    int i103 = i102 + i102;
                                    objArr3[i103] = objArr[i100];
                                    if (i90 != 0) {
                                        i4 += 3;
                                        objArr3[i103 + 1] = objArr[i101];
                                    } else {
                                        i4 = i101;
                                        i90 = 0;
                                    }
                                    i8 = i8;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i89 > 17) {
                                    i21 = i20;
                                    i22 = iObjectFieldOffset;
                                    i23 = i90;
                                } else {
                                    int i104 = i20 + 1;
                                    int iCharAt12 = str.charAt(i20);
                                    if (iCharAt12 >= 55296) {
                                        int i105 = iCharAt12 & 8191;
                                        int i106 = 13;
                                        while (true) {
                                            i25 = i104 + 1;
                                            cCharAt8 = str.charAt(i104);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i105 |= (cCharAt8 & 8191) << i106;
                                            i106 += 13;
                                            i104 = i25;
                                        }
                                        iCharAt12 = i105 | (cCharAt8 << i106);
                                        i104 = i25;
                                    }
                                    int i107 = (iCharAt12 / 32) + i74 + i74;
                                    Object obj4 = objArr[i107];
                                    i77 = i77;
                                    if (obj4 instanceof Field) {
                                        fieldV = (Field) obj4;
                                    } else {
                                        fieldV = ijn1.v(cls2, (String) obj4);
                                        objArr[i107] = fieldV;
                                    }
                                    str = str;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                                    i24 = iCharAt12 % 32;
                                    i22 = iObjectFieldOffset;
                                    i21 = i104;
                                    i23 = i90;
                                }
                                int i108 = i77 + 1;
                                iArr2[i77] = i88;
                                int i109 = i77 + 2;
                                if ((iCharAt10 & 512) != 0) {
                                    i28 = 536870912;
                                } else {
                                    i28 = 0;
                                }
                                if ((iCharAt10 & 256) != 0) {
                                    i29 = 268435456;
                                } else {
                                    i29 = 0;
                                }
                                if (i23 != 0) {
                                    i30 = Integer.MIN_VALUE;
                                } else {
                                    i30 = 0;
                                }
                                iArr2[i108] = i29 | i28 | i30 | (i89 << 20) | i22;
                                iArr2[i109] = (i24 << 20) | iObjectFieldOffset2;
                                i77 += 3;
                                str = str;
                                length = i80;
                                objArr2 = objArr3;
                                i72 = i18;
                                i8 = i8;
                                i42 = i21;
                                iArr3 = iArr2;
                                i40 = 3;
                            } else {
                                i26 = 3;
                                i27 = 1;
                                i4 += 2;
                            }
                            objArr3[lqn1.s(i77, i26, i27)] = objArr[i100];
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                            }
                            i21 = i20;
                            i22 = iObjectFieldOffset;
                            i23 = i90;
                        }
                        i4 = i100;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                        }
                        i21 = i20;
                        i22 = iObjectFieldOffset;
                        i23 = i90;
                    }
                    i24 = 0;
                    int i1010 = i77 + 1;
                    iArr2[i77] = i88;
                    int i1011 = i77 + 2;
                    if ((iCharAt10 & 512) != 0) {
                        i28 = 536870912;
                    } else {
                        i28 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i29 = 268435456;
                    } else {
                        i29 = 0;
                    }
                    if (i23 != 0) {
                        i30 = Integer.MIN_VALUE;
                    } else {
                        i30 = 0;
                    }
                    iArr2[i1010] = i29 | i28 | i30 | (i89 << 20) | i22;
                    iArr2[i1011] = (i24 << 20) | iObjectFieldOffset2;
                    i77 += 3;
                    str = str;
                    length = i80;
                    objArr2 = objArr3;
                    i72 = i18;
                    i8 = i8;
                    i42 = i21;
                    iArr3 = iArr2;
                    i40 = 3;
                }
                ijn1Var = new ijn1(iArr3, objArr2, i8, i9, njn1Var.a, iArr, i7, i72, cen1Var);
            }
            qjn1 qjn1Var = (qjn1) concurrentHashMap.putIfAbsent(cls, ijn1Var);
            return qjn1Var != null ? qjn1Var : ijn1Var;
        } catch (Exception e) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
