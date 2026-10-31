package p;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qjp1 {
    public static final qjp1 c = new qjp1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ejp1 a = new ejp1();

    /* JADX WARN: Code duplicated, block: B:185:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:200:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:206:0x040b  */
    public final ujp1 a(Class cls) {
        ujp1 mjp1Var;
        int i;
        int iCharAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        int i11;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        Object[] objArr;
        int i14;
        int i15;
        int[] iArr2;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        int i18;
        int i19;
        Field fieldK;
        char cCharAt7;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldK2;
        Field fieldK3;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        char cCharAt9;
        int i27;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        Charset charset = mip1.a;
        if (cls == null) {
            bhn0.i("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        ujp1 ujp1Var = (ujp1) concurrentHashMap.get(cls);
        if (ujp1Var != null) {
            return ujp1Var;
        }
        wbn1 wbn1Var = wjp1.a;
        if (!cip1.class.isAssignableFrom(cls)) {
            int i30 = wgp1.a;
        }
        tjp1 tjp1VarZzc = this.a.a.zzc(cls);
        int i31 = 0;
        if ((tjp1VarZzc.d & 2) == 2) {
            int i32 = wgp1.a;
            wbn1 wbn1Var2 = wjp1.a;
            p9n1 p9n1Var = ohp1.a;
            mjp1Var = new mjp1(wbn1Var2, tjp1VarZzc.a);
        } else {
            int i33 = wgp1.a;
            int i34 = ojp1.a;
            int i35 = wip1.a;
            wbn1 wbn1Var3 = wjp1.a;
            p9n1 p9n1Var2 = tjp1VarZzc.a() + (-1) != 1 ? ohp1.a : null;
            int i36 = hjp1.a;
            int[] iArr3 = kjp1.g;
            if (!(tjp1VarZzc instanceof tjp1)) {
                bhn0.d();
                return null;
            }
            String str = tjp1VarZzc.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i = i37 + 1;
                    if (str.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i;
                }
            } else {
                i = 1;
            }
            int i38 = i + 1;
            int iCharAt2 = str.charAt(i);
            if (iCharAt2 >= 55296) {
                int i39 = iCharAt2 & 8191;
                int i40 = 13;
                while (true) {
                    i29 = i38 + 1;
                    cCharAt11 = str.charAt(i38);
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt11 & 8191) << i40;
                    i40 += 13;
                    i38 = i29;
                }
                iCharAt2 = i39 | (cCharAt11 << i40);
                i38 = i29;
            }
            if (iCharAt2 == 0) {
                i4 = 0;
                iCharAt = 0;
                i5 = 0;
                iArr = kjp1.g;
                i3 = 0;
            } else {
                int i41 = i38 + 1;
                int iCharAt3 = str.charAt(i38);
                if (iCharAt3 >= 55296) {
                    int i42 = iCharAt3 & 8191;
                    int i43 = 13;
                    while (true) {
                        i13 = i41 + 1;
                        cCharAt6 = str.charAt(i41);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt6 & 8191) << i43;
                        i43 += 13;
                        i41 = i13;
                    }
                    iCharAt3 = i42 | (cCharAt6 << i43);
                    i41 = i13;
                }
                int i44 = i41 + 1;
                int iCharAt4 = str.charAt(i41);
                if (iCharAt4 >= 55296) {
                    int i45 = iCharAt4 & 8191;
                    int i46 = 13;
                    while (true) {
                        i12 = i44 + 1;
                        cCharAt5 = str.charAt(i44);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt5 & 8191) << i46;
                        i46 += 13;
                        i44 = i12;
                    }
                    iCharAt4 = i45 | (cCharAt5 << i46);
                    i44 = i12;
                }
                int i47 = i44 + 1;
                if (str.charAt(i44) >= 55296) {
                    while (true) {
                        i11 = i47 + 1;
                        if (str.charAt(i47) < 55296) {
                            break;
                        }
                        i47 = i11;
                    }
                    i47 = i11;
                }
                int i48 = i47 + 1;
                if (str.charAt(i47) >= 55296) {
                    while (true) {
                        i10 = i48 + 1;
                        if (str.charAt(i48) < 55296) {
                            break;
                        }
                        i48 = i10;
                    }
                    i48 = i10;
                }
                int i49 = i48 + 1;
                iCharAt = str.charAt(i48);
                if (iCharAt >= 55296) {
                    int i50 = iCharAt & 8191;
                    int i51 = 13;
                    while (true) {
                        i9 = i49 + 1;
                        cCharAt4 = str.charAt(i49);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt4 & 8191) << i51;
                        i51 += 13;
                        i49 = i9;
                    }
                    iCharAt = i50 | (cCharAt4 << i51);
                    i49 = i9;
                }
                int i52 = i49 + 1;
                int iCharAt5 = str.charAt(i49);
                if (iCharAt5 >= 55296) {
                    int i53 = iCharAt5 & 8191;
                    int i54 = 13;
                    while (true) {
                        i8 = i52 + 1;
                        cCharAt3 = str.charAt(i52);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt3 & 8191) << i54;
                        i54 += 13;
                        i52 = i8;
                    }
                    iCharAt5 = i53 | (cCharAt3 << i54);
                    i52 = i8;
                }
                int i55 = i52 + 1;
                int iCharAt6 = str.charAt(i52);
                if (iCharAt6 >= 55296) {
                    int i56 = iCharAt6 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i7 = i57 + 1;
                        cCharAt2 = str.charAt(i57);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i56 |= (cCharAt2 & 8191) << i58;
                        i58 += 13;
                        i57 = i7;
                    }
                    iCharAt6 = i56 | (cCharAt2 << i58);
                    i2 = i7;
                } else {
                    i2 = i55;
                }
                int i59 = i2 + 1;
                int iCharAt7 = str.charAt(i2);
                if (iCharAt7 >= 55296) {
                    int i60 = iCharAt7 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i6 = i61 + 1;
                        cCharAt = str.charAt(i61);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i60 |= (cCharAt & 8191) << i62;
                        i62 += 13;
                        i61 = i6;
                    }
                    iCharAt7 = i60 | (cCharAt << i62);
                    i59 = i6;
                }
                int i63 = iCharAt7 + iCharAt5 + iCharAt6;
                int i64 = iCharAt3 + iCharAt3 + iCharAt4;
                int[] iArr4 = new int[i63];
                int i65 = iCharAt5;
                iArr = iArr4;
                i3 = i65;
                i4 = i64;
                i5 = iCharAt7;
                i31 = iCharAt3;
                i38 = i59;
            }
            Unsafe unsafe = kjp1.h;
            Object[] objArr2 = tjp1VarZzc.c;
            int i66 = i38;
            Class<?> cls2 = tjp1VarZzc.a.getClass();
            int i67 = i31;
            int i68 = iCharAt + iCharAt;
            int[] iArr5 = new int[iCharAt * 3];
            Object[] objArr3 = new Object[i68];
            int i69 = i4;
            int i70 = i3 + i5;
            int i71 = i66;
            int i72 = i69;
            int i73 = i5;
            int i74 = 0;
            int i75 = 0;
            while (i71 < length) {
                int i76 = i71 + 1;
                int iCharAt8 = str.charAt(i71);
                int i77 = length;
                if (iCharAt8 >= 55296) {
                    int i78 = iCharAt8 & 8191;
                    int i79 = i76;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = str.charAt(i79);
                        objArr = objArr3;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        objArr3 = objArr;
                    }
                    iCharAt8 = i78 | (cCharAt10 << i80);
                    i14 = i28;
                } else {
                    objArr = objArr3;
                    i14 = i76;
                }
                int i81 = i14 + 1;
                int iCharAt9 = str.charAt(i14);
                if (iCharAt9 >= 55296) {
                    int i82 = iCharAt9 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i26 = i83 + 1;
                        cCharAt9 = str.charAt(i83);
                        i27 = i82;
                        if (cCharAt9 < 55296) {
                            break;
                        }
                        i82 = i27 | ((cCharAt9 & 8191) << i84);
                        i84 += 13;
                        i83 = i26;
                    }
                    iCharAt9 = i27 | (cCharAt9 << i84);
                    i15 = i26;
                } else {
                    i15 = i81;
                }
                int i85 = iCharAt8;
                if ((iCharAt9 & 1024) != 0) {
                    iArr[i75] = i74;
                    i75++;
                }
                int i86 = iCharAt9 & 255;
                int i87 = i70;
                int i88 = iCharAt9 & 2048;
                if (i86 >= 51) {
                    int i89 = i15 + 1;
                    int iCharAt10 = str.charAt(i15);
                    if (iCharAt10 >= 55296) {
                        int i90 = iCharAt10 & 8191;
                        int i91 = i89;
                        int i92 = 13;
                        while (true) {
                            i24 = i91 + 1;
                            cCharAt8 = str.charAt(i91);
                            i25 = i90;
                            if (cCharAt8 < 55296) {
                                break;
                            }
                            i90 = i25 | ((cCharAt8 & 8191) << i92);
                            i92 += 13;
                            i91 = i24;
                        }
                        iCharAt10 = i25 | (cCharAt8 << i92);
                        i22 = i24;
                    } else {
                        i22 = i89;
                    }
                    int i93 = iCharAt10;
                    int i94 = i86 - 51;
                    int i95 = i22;
                    if (i94 == 9 || i94 == 17) {
                        objArr[lqn1.s(i74, 3, 1)] = objArr2[i72];
                        i23 = i88;
                        i72++;
                    } else if (i94 != 12) {
                        i23 = i88;
                    } else if (tjp1VarZzc.a() == 1 || i88 != 0) {
                        objArr[lqn1.s(i74, 3, 1)] = objArr2[i72];
                        i72++;
                        i23 = i88;
                    } else {
                        i23 = 0;
                    }
                    int i96 = i93 + i93;
                    Object obj = objArr2[i96];
                    int i97 = i23;
                    if (obj instanceof Field) {
                        fieldK2 = (Field) obj;
                    } else {
                        fieldK2 = kjp1.k(cls2, (String) obj);
                        objArr2[i96] = fieldK2;
                    }
                    iArr2 = iArr5;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK2);
                    int i98 = i96 + 1;
                    Object obj2 = objArr2[i98];
                    if (obj2 instanceof Field) {
                        fieldK3 = (Field) obj2;
                    } else {
                        fieldK3 = kjp1.k(cls2, (String) obj2);
                        objArr2[i98] = fieldK3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                    iArr = iArr;
                    i19 = iObjectFieldOffset3;
                    i88 = i97;
                    i16 = i95;
                    i18 = 0;
                } else {
                    iArr2 = iArr5;
                    int i99 = i72 + 1;
                    Field fieldK4 = kjp1.k(cls2, (String) objArr2[i72]);
                    if (i86 == 9 || i86 == 17) {
                        objArr[lqn1.s(i74, 3, 1)] = fieldK4.getType();
                    } else {
                        if (i86 != 27) {
                            if (i86 == 49) {
                                i72 += 2;
                                i20 = 3;
                                i21 = 1;
                            } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                                iArr = iArr;
                                if (tjp1VarZzc.a() == 1 || i88 != 0) {
                                    i72 += 2;
                                    objArr[lqn1.s(i74, 3, 1)] = objArr2[i99];
                                } else {
                                    i72 = i99;
                                    i88 = 0;
                                }
                            } else if (i86 == 50) {
                                int i100 = i72 + 2;
                                i73++;
                                iArr[i73] = i74;
                                int i101 = i74 / 3;
                                int i102 = i101 + i101;
                                objArr[i102] = objArr2[i99];
                                if (i88 != 0) {
                                    i72 += 3;
                                    objArr[i102 + 1] = objArr2[i100];
                                } else {
                                    i72 = i100;
                                    i88 = 0;
                                }
                                iArr = iArr;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt9 & 4096) != 0 || i86 > 17) {
                                i16 = i15;
                                i17 = 0;
                            } else {
                                int i103 = i15 + 1;
                                int iCharAt11 = str.charAt(i15);
                                if (iCharAt11 >= 55296) {
                                    int i104 = iCharAt11 & 8191;
                                    int i105 = 13;
                                    while (true) {
                                        i16 = i103 + 1;
                                        cCharAt7 = str.charAt(i103);
                                        if (cCharAt7 < 55296) {
                                            break;
                                        }
                                        i104 |= (cCharAt7 & 8191) << i105;
                                        i105 += 13;
                                        i103 = i16;
                                    }
                                    iCharAt11 = i104 | (cCharAt7 << i105);
                                } else {
                                    i16 = i103;
                                }
                                int i106 = (iCharAt11 / 32) + i67 + i67;
                                Object obj3 = objArr2[i106];
                                if (obj3 instanceof Field) {
                                    fieldK = (Field) obj3;
                                } else {
                                    fieldK = kjp1.k(cls2, (String) obj3);
                                    objArr2[i106] = fieldK;
                                }
                                i17 = iCharAt11 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK);
                            }
                            if (i86 >= 18 || i86 > 49) {
                                i18 = i17;
                                i19 = iObjectFieldOffset;
                            } else {
                                iArr[i87] = iObjectFieldOffset;
                                i18 = i17;
                                i19 = iObjectFieldOffset;
                                i87++;
                            }
                        } else {
                            i20 = 3;
                            i21 = 1;
                            i72 += 2;
                        }
                        objArr[lqn1.s(i74, i20, i21)] = objArr2[i99];
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) != 0) {
                            i16 = i15;
                            i17 = 0;
                        } else {
                            i16 = i15;
                            i17 = 0;
                        }
                        if (i86 >= 18) {
                            i18 = i17;
                            i19 = iObjectFieldOffset;
                        } else {
                            i18 = i17;
                            i19 = iObjectFieldOffset;
                        }
                    }
                    i72 = i99;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt9 & 4096) != 0) {
                        i16 = i15;
                        i17 = 0;
                    } else {
                        i16 = i15;
                        i17 = 0;
                    }
                    if (i86 >= 18) {
                        i18 = i17;
                        i19 = iObjectFieldOffset;
                    } else {
                        i18 = i17;
                        i19 = iObjectFieldOffset;
                    }
                }
                int i107 = i74 + 1;
                iArr2[i74] = i85;
                int i108 = i74 + 2;
                String str2 = str;
                iArr2[i107] = ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 256) != 0 ? 268435456 : 0) | (i88 != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | i19;
                i74 += 3;
                iArr2[i108] = (i18 << 20) | iObjectFieldOffset2;
                i71 = i16;
                str = str2;
                length = i77;
                i70 = i87;
                objArr3 = objArr;
                iArr = iArr;
                iArr5 = iArr2;
            }
            mjp1Var = new kjp1(iArr5, objArr3, tjp1VarZzc.a, iArr, i5, wbn1Var3, p9n1Var2);
        }
        Charset charset2 = mip1.a;
        ujp1 ujp1Var2 = (ujp1) concurrentHashMap.putIfAbsent(cls, mjp1Var);
        return ujp1Var2 != null ? ujp1Var2 : mjp1Var;
    }
}
