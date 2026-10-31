package p;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class igo1 {
    public static final igo1 c = new igo1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ceo1 a = new ceo1();

    /* JADX WARN: Code duplicated, block: B:187:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:202:0x0411  */
    /* JADX WARN: Code duplicated, block: B:205:0x0418  */
    /* JADX WARN: Code duplicated, block: B:208:0x0428  */
    public final sgo1 a(Class cls) {
        sgo1 zfo1Var;
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
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
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        int i19;
        int i20;
        Field fieldY;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        int i24;
        Field fieldY2;
        Field fieldY3;
        int i25;
        char cCharAt10;
        int i26;
        int i27;
        char cCharAt11;
        int i28;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        Charset charset = wbo1.a;
        if (cls == null) {
            bhn0.i("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        sgo1 sgo1Var = (sgo1) concurrentHashMap.get(cls);
        if (sgo1Var != null) {
            return sgo1Var;
        }
        fen1 fen1Var = ygo1.a;
        if (!iao1.class.isAssignableFrom(cls)) {
            int i31 = z3o1.a;
        }
        ogo1 ogo1VarZzb = this.a.a.zzb(cls);
        int i32 = 0;
        if ((ogo1VarZzb.d & 2) == 2) {
            int i33 = z3o1.a;
            fen1 fen1Var2 = ygo1.a;
            p9n1 p9n1Var = t8o1.a;
            zfo1Var = new zfo1(fen1Var2, ogo1VarZzb.a);
        } else {
            int i34 = z3o1.a;
            int i35 = fgo1.a;
            int i36 = hdo1.a;
            fen1 fen1Var3 = ygo1.a;
            p9n1 p9n1Var2 = ogo1VarZzb.a() + (-1) != 1 ? t8o1.a : null;
            int i37 = reo1.a;
            int[] iArr2 = ufo1.j;
            if (!(ogo1VarZzb instanceof ogo1)) {
                bhn0.d();
                return null;
            }
            String str = ogo1VarZzb.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i38 = 1;
                while (true) {
                    i = i38 + 1;
                    if (str.charAt(i38) < 55296) {
                        break;
                    }
                    i38 = i;
                }
            } else {
                i = 1;
            }
            int i39 = i + 1;
            int iCharAt4 = str.charAt(i);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i30 = i39 + 1;
                    cCharAt13 = str.charAt(i39);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt13 & 8191) << i41;
                    i41 += 13;
                    i39 = i30;
                }
                iCharAt4 = i40 | (cCharAt13 << i41);
                i39 = i30;
            }
            if (iCharAt4 == 0) {
                i4 = 0;
                iCharAt = 0;
                iCharAt2 = 0;
                iCharAt3 = 0;
                i5 = 0;
                iArr = ufo1.j;
                i3 = 0;
            } else {
                int i42 = i39 + 1;
                int iCharAt5 = str.charAt(i39);
                if (iCharAt5 >= 55296) {
                    int i43 = iCharAt5 & 8191;
                    int i44 = 13;
                    while (true) {
                        i13 = i42 + 1;
                        cCharAt8 = str.charAt(i42);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i43 |= (cCharAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i13;
                    }
                    iCharAt5 = i43 | (cCharAt8 << i44);
                    i42 = i13;
                }
                int i45 = i42 + 1;
                int iCharAt6 = str.charAt(i42);
                if (iCharAt6 >= 55296) {
                    int i46 = iCharAt6 & 8191;
                    int i47 = 13;
                    while (true) {
                        i12 = i45 + 1;
                        cCharAt7 = str.charAt(i45);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i46 |= (cCharAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i12;
                    }
                    iCharAt6 = i46 | (cCharAt7 << i47);
                    i45 = i12;
                }
                int i48 = i45 + 1;
                iCharAt = str.charAt(i45);
                if (iCharAt >= 55296) {
                    int i49 = iCharAt & 8191;
                    int i50 = 13;
                    while (true) {
                        i11 = i48 + 1;
                        cCharAt6 = str.charAt(i48);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i49 |= (cCharAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i11;
                    }
                    iCharAt = i49 | (cCharAt6 << i50);
                    i48 = i11;
                }
                int i51 = i48 + 1;
                iCharAt2 = str.charAt(i48);
                if (iCharAt2 >= 55296) {
                    int i52 = iCharAt2 & 8191;
                    int i53 = 13;
                    while (true) {
                        i10 = i51 + 1;
                        cCharAt5 = str.charAt(i51);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i52 |= (cCharAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i10;
                    }
                    iCharAt2 = i52 | (cCharAt5 << i53);
                    i51 = i10;
                }
                int i54 = i51 + 1;
                iCharAt3 = str.charAt(i51);
                if (iCharAt3 >= 55296) {
                    int i55 = iCharAt3 & 8191;
                    int i56 = 13;
                    while (true) {
                        i9 = i54 + 1;
                        cCharAt4 = str.charAt(i54);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i55 |= (cCharAt4 & 8191) << i56;
                        i56 += 13;
                        i54 = i9;
                    }
                    iCharAt3 = i55 | (cCharAt4 << i56);
                    i54 = i9;
                }
                int i57 = i54 + 1;
                int iCharAt7 = str.charAt(i54);
                if (iCharAt7 >= 55296) {
                    int i58 = iCharAt7 & 8191;
                    int i59 = 13;
                    while (true) {
                        i8 = i57 + 1;
                        cCharAt3 = str.charAt(i57);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i58 |= (cCharAt3 & 8191) << i59;
                        i59 += 13;
                        i57 = i8;
                    }
                    iCharAt7 = i58 | (cCharAt3 << i59);
                    i57 = i8;
                }
                int i60 = i57 + 1;
                int iCharAt8 = str.charAt(i57);
                if (iCharAt8 >= 55296) {
                    int i61 = iCharAt8 & 8191;
                    int i62 = i60;
                    int i63 = 13;
                    while (true) {
                        i7 = i62 + 1;
                        cCharAt2 = str.charAt(i62);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i61 |= (cCharAt2 & 8191) << i63;
                        i63 += 13;
                        i62 = i7;
                    }
                    iCharAt8 = i61 | (cCharAt2 << i63);
                    i2 = i7;
                } else {
                    i2 = i60;
                }
                int i64 = i2 + 1;
                int iCharAt9 = str.charAt(i2);
                if (iCharAt9 >= 55296) {
                    int i65 = iCharAt9 & 8191;
                    int i66 = i64;
                    int i67 = 13;
                    while (true) {
                        i6 = i66 + 1;
                        cCharAt = str.charAt(i66);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i65 |= (cCharAt & 8191) << i67;
                        i67 += 13;
                        i66 = i6;
                    }
                    iCharAt9 = i65 | (cCharAt << i67);
                    i64 = i6;
                }
                int i68 = iCharAt9 + iCharAt7 + iCharAt8;
                int i69 = iCharAt5 + iCharAt5 + iCharAt6;
                int[] iArr3 = new int[i68];
                int i70 = iCharAt7;
                iArr = iArr3;
                i3 = i70;
                i4 = i69;
                i5 = iCharAt9;
                i32 = iCharAt5;
                i39 = i64;
            }
            Unsafe unsafe = ufo1.k;
            Object[] objArr2 = ogo1VarZzb.c;
            int i71 = i39;
            Class<?> cls2 = ogo1VarZzb.a.getClass();
            int i72 = i3 + i5;
            int i73 = i32;
            int i74 = iCharAt3 + iCharAt3;
            int[] iArr4 = new int[iCharAt3 * 3];
            Object[] objArr3 = new Object[i74];
            int i75 = i4;
            int i76 = i71;
            int i77 = i72;
            int i78 = i5;
            int i79 = 0;
            int i80 = 0;
            while (i76 < length) {
                int i81 = i76 + 1;
                int iCharAt10 = str.charAt(i76);
                int i82 = length;
                if (iCharAt10 >= 55296) {
                    int i83 = iCharAt10 & 8191;
                    int i84 = i81;
                    int i85 = 13;
                    while (true) {
                        i29 = i84 + 1;
                        cCharAt12 = str.charAt(i84);
                        objArr = objArr3;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i83 |= (cCharAt12 & 8191) << i85;
                        i85 += 13;
                        i84 = i29;
                        objArr3 = objArr;
                    }
                    iCharAt10 = i83 | (cCharAt12 << i85);
                    i14 = i29;
                } else {
                    objArr = objArr3;
                    i14 = i81;
                }
                int i86 = i14 + 1;
                int iCharAt11 = str.charAt(i14);
                if (iCharAt11 >= 55296) {
                    int i87 = iCharAt11 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i27 = i88 + 1;
                        cCharAt11 = str.charAt(i88);
                        i28 = i87;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i87 = i28 | ((cCharAt11 & 8191) << i89);
                        i89 += 13;
                        i88 = i27;
                    }
                    iCharAt11 = i28 | (cCharAt11 << i89);
                    i15 = i27;
                } else {
                    i15 = i86;
                }
                int i90 = i72;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i80] = i79;
                    i80++;
                }
                int i91 = iCharAt11 & 255;
                int i92 = iCharAt10;
                int i93 = iCharAt11 & 2048;
                if (i91 >= 51) {
                    int i94 = i15 + 1;
                    int iCharAt12 = str.charAt(i15);
                    if (iCharAt12 >= 55296) {
                        int i95 = iCharAt12 & 8191;
                        int i96 = i94;
                        int i97 = 13;
                        while (true) {
                            i25 = i96 + 1;
                            cCharAt10 = str.charAt(i96);
                            i26 = i95;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i95 = i26 | ((cCharAt10 & 8191) << i97);
                            i97 += 13;
                            i96 = i25;
                        }
                        iCharAt12 = i26 | (cCharAt10 << i97);
                        i23 = i25;
                    } else {
                        i23 = i94;
                    }
                    int i98 = iCharAt12;
                    int i99 = i91 - 51;
                    int i100 = i23;
                    if (i99 == 9 || i99 == 17) {
                        objArr[lqn1.s(i79, 3, 1)] = objArr2[i75];
                        i24 = i93;
                        i75++;
                    } else if (i99 != 12) {
                        i24 = i93;
                    } else if (ogo1VarZzb.a() == 1 || i93 != 0) {
                        objArr[lqn1.s(i79, 3, 1)] = objArr2[i75];
                        i75++;
                        i24 = i93;
                    } else {
                        i24 = 0;
                    }
                    int i101 = i98 + i98;
                    Object obj = objArr2[i101];
                    int i102 = i24;
                    if (obj instanceof Field) {
                        fieldY2 = (Field) obj;
                    } else {
                        fieldY2 = ufo1.y(cls2, (String) obj);
                        objArr2[i101] = fieldY2;
                    }
                    i16 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldY2);
                    int i103 = i101 + 1;
                    Object obj2 = objArr2[i103];
                    if (obj2 instanceof Field) {
                        fieldY3 = (Field) obj2;
                    } else {
                        fieldY3 = ufo1.y(cls2, (String) obj2);
                        objArr2[i103] = fieldY3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY3);
                    iCharAt2 = iCharAt2;
                    i20 = iObjectFieldOffset3;
                    i93 = i102;
                    i17 = i100;
                    i19 = 0;
                } else {
                    i16 = iCharAt;
                    int i104 = i75 + 1;
                    Field fieldY4 = ufo1.y(cls2, (String) objArr2[i75]);
                    if (i91 == 9 || i91 == 17) {
                        objArr[lqn1.s(i79, 3, 1)] = fieldY4.getType();
                    } else {
                        if (i91 != 27) {
                            if (i91 == 49) {
                                i75 += 2;
                                i21 = 3;
                                i22 = 1;
                            } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                                iCharAt2 = iCharAt2;
                                if (ogo1VarZzb.a() == 1 || i93 != 0) {
                                    i75 += 2;
                                    objArr[lqn1.s(i79, 3, 1)] = objArr2[i104];
                                } else {
                                    i75 = i104;
                                    i93 = 0;
                                }
                            } else if (i91 == 50) {
                                int i105 = i75 + 2;
                                i78++;
                                iArr[i78] = i79;
                                int i106 = i79 / 3;
                                int i107 = i106 + i106;
                                objArr[i107] = objArr2[i104];
                                if (i93 != 0) {
                                    i75 += 3;
                                    objArr[i107 + 1] = objArr2[i105];
                                } else {
                                    i75 = i105;
                                    i93 = 0;
                                }
                                iCharAt2 = iCharAt2;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) != 0 || i91 > 17) {
                                i17 = i15;
                                i18 = 0;
                            } else {
                                int i108 = i15 + 1;
                                int iCharAt13 = str.charAt(i15);
                                if (iCharAt13 >= 55296) {
                                    int i109 = iCharAt13 & 8191;
                                    int i110 = 13;
                                    while (true) {
                                        i17 = i108 + 1;
                                        cCharAt9 = str.charAt(i108);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i109 |= (cCharAt9 & 8191) << i110;
                                        i110 += 13;
                                        i108 = i17;
                                    }
                                    iCharAt13 = i109 | (cCharAt9 << i110);
                                } else {
                                    i17 = i108;
                                }
                                int i111 = (iCharAt13 / 32) + i73 + i73;
                                Object obj3 = objArr2[i111];
                                if (obj3 instanceof Field) {
                                    fieldY = (Field) obj3;
                                } else {
                                    fieldY = ufo1.y(cls2, (String) obj3);
                                    objArr2[i111] = fieldY;
                                }
                                i18 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY);
                            }
                            if (i91 >= 18 || i91 > 49) {
                                i19 = i18;
                                i20 = iObjectFieldOffset;
                            } else {
                                iArr[i77] = iObjectFieldOffset;
                                i19 = i18;
                                i20 = iObjectFieldOffset;
                                i77++;
                            }
                        } else {
                            i21 = 3;
                            i22 = 1;
                            i75 += 2;
                        }
                        objArr[lqn1.s(i79, i21, i22)] = objArr2[i104];
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0) {
                            i17 = i15;
                            i18 = 0;
                        } else {
                            i17 = i15;
                            i18 = 0;
                        }
                        if (i91 >= 18) {
                            i19 = i18;
                            i20 = iObjectFieldOffset;
                        } else {
                            i19 = i18;
                            i20 = iObjectFieldOffset;
                        }
                    }
                    i75 = i104;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i17 = i15;
                        i18 = 0;
                    } else {
                        i17 = i15;
                        i18 = 0;
                    }
                    if (i91 >= 18) {
                        i19 = i18;
                        i20 = iObjectFieldOffset;
                    } else {
                        i19 = i18;
                        i20 = iObjectFieldOffset;
                    }
                }
                int i112 = i79 + 1;
                iArr4[i79] = i92;
                int i113 = i79 + 2;
                String str2 = str;
                iArr4[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i93 != 0 ? Integer.MIN_VALUE : 0) | (i91 << 20) | i20;
                i79 += 3;
                iArr4[i113] = (i19 << 20) | iObjectFieldOffset2;
                i76 = i17;
                i72 = i90;
                length = i82;
                str = str2;
                objArr3 = objArr;
                iCharAt2 = iCharAt2;
                iCharAt = i16;
            }
            zfo1Var = new ufo1(iArr4, objArr3, iCharAt, iCharAt2, ogo1VarZzb.a, iArr, i5, i72, fen1Var3, p9n1Var2);
        }
        sgo1 sgo1Var2 = (sgo1) concurrentHashMap.putIfAbsent(cls, zfo1Var);
        return sgo1Var2 != null ? sgo1Var2 : zfo1Var;
    }
}
