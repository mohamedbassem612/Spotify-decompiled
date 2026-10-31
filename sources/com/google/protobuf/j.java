package com.google.protobuf;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.ab80;
import p.alh1;
import p.bhn0;
import p.cy30;
import p.dlh1;
import p.dng0;
import p.eg;
import p.gf40;
import p.gvg;
import p.hg91;
import p.hhc;
import p.hhg1;
import p.i6b;
import p.it8;
import p.jah;
import p.jzi0;
import p.kul1;
import p.l1d;
import p.l220;
import p.l290;
import p.l36;
import p.lwg;
import p.ng91;
import p.nul1;
import p.nvb0;
import p.nwg;
import p.oiy0;
import p.otc0;
import p.p9o0;
import p.phc;
import p.poz0;
import p.qkh1;
import p.rwg;
import p.s2j0;
import p.s8;
import p.sm41;
import p.sng0;
import p.uz00;
import p.w6e0;
import p.xvz0;
import p.xz00;
import p.z190;
import p.z220;
import p.zb01;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j implements sm41 {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final s2j0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final p9o0 l;
    public final otc0 m;
    public final m n;
    public final xz00 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sng0 f3p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new qkh1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public j(int[] iArr, Object[] objArr, int i, int i2, s2j0 s2j0Var, boolean z, int[] iArr2, int i3, int i4, p9o0 p9o0Var, otc0 otc0Var, m mVar, xz00 xz00Var, sng0 sng0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = s2j0Var instanceof h;
        this.f = xz00Var != null && xz00Var.e(s2j0Var);
        this.h = z;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = p9o0Var;
        this.m = otc0Var;
        this.n = mVar;
        this.o = xz00Var;
        this.e = s2j0Var;
        this.f3p = sng0Var;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0357  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:193:0x03be  */
    public static j B(jzi0 jzi0Var, p9o0 p9o0Var, otc0 otc0Var, m mVar, xz00 xz00Var, sng0 sng0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldG;
        char cCharAt9;
        int i24;
        int i25;
        Field fieldG2;
        Field fieldG3;
        int i26;
        char cCharAt10;
        int i27;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (!(jzi0Var instanceof xvz0)) {
            throw null;
        }
        xvz0 xvz0Var = (xvz0) jzi0Var;
        String str = xvz0Var.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (str.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = str.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i5 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i7 = 0;
            iArr = q;
            i6 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = str.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = str.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = str.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
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
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
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
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = str.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = str.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = str.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = str.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i59 = (iCharAt3 * 2) + iCharAt4;
            int i60 = iCharAt7;
            i2 = iCharAt5;
            i3 = i60;
            i4 = iCharAt6;
            i5 = i59;
            iArr = iArr2;
            i6 = iCharAt3;
            i7 = iCharAt9;
            i32 = i56;
        }
        Object[] objArr = xvz0Var.c;
        Class<?> cls = xvz0Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i61 = i7 + i3;
        int i62 = i61;
        int i63 = i7;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = str.charAt(i32);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                    length = i17;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i18 = i28;
            } else {
                i17 = length;
                i18 = i70;
            }
            int i74 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            int i75 = iCharAt10;
            Unsafe unsafe = r;
            if (i74 >= 51) {
                int i76 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i27 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i27 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i26;
                    }
                    iCharAt12 = i27 | (cCharAt10 << i79);
                    i25 = i26;
                } else {
                    i25 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i74 - 51;
                int i82 = i25;
                if (i81 == 9 || i81 == 17) {
                    objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i5];
                    i5++;
                } else if (i81 == 12 && (l1d.d(xvz0Var.c(), 1) || (iCharAt11 & 2048) != 0)) {
                    objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i5];
                    i5++;
                }
                int i83 = i80 * 2;
                Object obj = objArr[i83];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G(cls, (String) obj);
                    objArr[i83] = fieldG2;
                }
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG2);
                int i84 = i83 + 1;
                Object obj2 = objArr[i84];
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G(cls, (String) obj2);
                    objArr[i84] = fieldG3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG3);
                i19 = i61;
                i23 = iObjectFieldOffset2;
                i20 = i82;
                i22 = 0;
            } else {
                i6 = i6;
                int i85 = i5 + 1;
                Field fieldG4 = G(cls, (String) objArr[i5]);
                if (i74 == 9 || i74 == 17) {
                    i19 = i61;
                    objArr2[cy30.x(i64, 3, 2, 1)] = fieldG4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i19 = i61;
                        i24 = i5 + 2;
                        objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i85];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i19 = i61;
                        if (xvz0Var.c() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i5 + 2;
                            objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i85];
                        }
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG4);
                        if ((iCharAt11 & 4096) != 0 || i74 > 17) {
                            iObjectFieldOffset = 1048575;
                            i20 = i18;
                            i21 = 0;
                        } else {
                            int i86 = i18 + 1;
                            int iCharAt13 = str.charAt(i18);
                            if (iCharAt13 >= 55296) {
                                int i87 = iCharAt13 & 8191;
                                int i88 = 13;
                                while (true) {
                                    i20 = i86 + 1;
                                    cCharAt9 = str.charAt(i86);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i87 |= (cCharAt9 & 8191) << i88;
                                    i88 += 13;
                                    i86 = i20;
                                }
                                iCharAt13 = i87 | (cCharAt9 << i88);
                            } else {
                                i20 = i86;
                            }
                            int i89 = (iCharAt13 / 32) + (i6 * 2);
                            Object obj3 = objArr[i89];
                            if (obj3 instanceof Field) {
                                fieldG = (Field) obj3;
                            } else {
                                fieldG = G(cls, (String) obj3);
                                objArr[i89] = fieldG;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG);
                            i21 = iCharAt13 % 32;
                        }
                        if (i74 < 18 && i74 <= 49) {
                            iArr[i62] = iObjectFieldOffset3;
                            i62++;
                        }
                        i22 = i21;
                        i23 = iObjectFieldOffset3;
                    } else {
                        if (i74 == 50) {
                            int i90 = i63 + 1;
                            iArr[i63] = i64;
                            int i91 = (i64 / 3) * 2;
                            int i92 = i5 + 2;
                            objArr2[i91] = objArr[i85];
                            if ((iCharAt11 & 2048) != 0) {
                                i5 += 3;
                                objArr2[i91 + 1] = objArr[i92];
                            } else {
                                i5 = i92;
                            }
                            i63 = i90;
                            i19 = i61;
                        } else {
                            i19 = i61;
                        }
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset = 1048575;
                            i20 = i18;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset = 1048575;
                            i20 = i18;
                            i21 = 0;
                        }
                        if (i74 < 18) {
                        }
                        i22 = i21;
                        i23 = iObjectFieldOffset4;
                    }
                    i5 = i24;
                    int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldG4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset = 1048575;
                        i20 = i18;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset = 1048575;
                        i20 = i18;
                        i21 = 0;
                    }
                    if (i74 < 18) {
                    }
                    i22 = i21;
                    i23 = iObjectFieldOffset5;
                }
                i5 = i85;
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldG4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    iObjectFieldOffset = 1048575;
                    i20 = i18;
                    i21 = 0;
                }
                if (i74 < 18) {
                }
                i22 = i21;
                i23 = iObjectFieldOffset6;
            }
            int i93 = i64 + 1;
            iArr4[i64] = i75;
            int i94 = i64 + 2;
            String str2 = str;
            iArr4[i93] = ((iCharAt11 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i23;
            i64 += 3;
            iArr4[i94] = (i22 << 20) | iObjectFieldOffset;
            iArr3 = iArr4;
            str = str2;
            i32 = i20;
            length = i17;
            i61 = i19;
            i6 = i6;
            c = 55296;
        }
        return new j(iArr3, objArr2, i2, i4, xvz0Var.a, false, iArr, i7, i61, p9o0Var, otc0Var, mVar, xz00Var, sng0Var);
    }

    public static int C(long j, Object obj) {
        return ((Integer) dlh1.j(j, obj)).intValue();
    }

    public static long D(long j, Object obj) {
        return ((Long) dlh1.j(j, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbN = gvg.n("Field ", str, " for ", name, " not found. Known fields are ");
            sbN.append(string);
            throw new RuntimeException(sbN.toString(), e);
        }
    }

    public static int M(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int m(byte[] bArr, int i, int i2, kul1 kul1Var, Class cls, l36 l36Var) {
        switch (kul1Var.ordinal()) {
            case 0:
                l36Var.c = Double.valueOf(a.d(bArr, i));
                return i + 8;
            case 1:
                l36Var.c = Float.valueOf(a.k(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int iJ = a.J(bArr, i, l36Var);
                l36Var.c = Long.valueOf(l36Var.b);
                return iJ;
            case 4:
            case 12:
            case 13:
                int iH = a.H(bArr, i, l36Var);
                l36Var.c = Integer.valueOf(l36Var.a);
                return iH;
            case 5:
            case 15:
                l36Var.c = Long.valueOf(a.i(bArr, i));
                return i + 8;
            case 6:
            case 14:
                l36Var.c = Integer.valueOf(a.g(bArr, i));
                return i + 4;
            case 7:
                int iJ2 = a.J(bArr, i, l36Var);
                l36Var.c = Boolean.valueOf(l36Var.b != 0);
                return iJ2;
            case 8:
                return a.E(bArr, i, l36Var);
            case 9:
            default:
                jah.g("unsupported field type.");
                return 0;
            case 10:
                return a.o(oiy0.c.a(cls), bArr, i, i2, l36Var);
            case 11:
                return a.b(bArr, i, l36Var);
            case 16:
                int iH2 = a.H(bArr, i, l36Var);
                l36Var.c = Integer.valueOf(lwg.b(l36Var.a));
                return iH2;
            case 17:
                int iJ3 = a.J(bArr, i, l36Var);
                l36Var.c = Long.valueOf(lwg.c(l36Var.b));
                return iJ3;
        }
    }

    public static n r(Object obj) {
        h hVar = (h) obj;
        n nVar = hVar.unknownFields;
        if (nVar != n.f) {
            return nVar;
        }
        n nVar2 = new n();
        hVar.unknownFields = nVar2;
        return nVar2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof h) {
            return ((h) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i, int i2, Object obj) {
        sm41 sm41VarQ = q(i2);
        if (!v(i, i2, obj)) {
            return sm41VarQ.c();
        }
        Object object = r.getObject(obj, N(i2) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objC = sm41VarQ.c();
        if (object != null) {
            sm41VarQ.d(objC, object);
        }
        return objC;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int E(java.lang.Object r31, byte[] r32, int r33, int r4, int r35, p.l36 r36) {
        /*
            Method dump skipped, instruction units count: 2578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.E(java.lang.Object, byte[], int, int, int, p.l36):int");
    }

    public final void F(int i, Object obj, zb01 zb01Var) {
        if ((536870912 & i) != 0) {
            dlh1.q(obj, i & 1048575, zb01Var.G());
        } else if (this.g) {
            dlh1.q(obj, i & 1048575, zb01Var.y());
        } else {
            dlh1.q(obj, i & 1048575, zb01Var.n());
        }
    }

    public final void H(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        dlh1.o(obj, (1 << (i2 >>> 20)) | dlh1.h(j, obj), j);
    }

    public final void I(int i, int i2, Object obj) {
        dlh1.o(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int J(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void K(int i, Object obj, Object obj2) {
        r.putObject(obj, N(i) & 1048575, obj2);
        H(i, obj);
    }

    public final void L(Object obj, int i, int i2, Object obj2) {
        r.putObject(obj, N(i2) & 1048575, obj2);
        I(i, i2, obj);
    }

    public final int N(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[SYNTHETIC] */
    @Override // p.sm41
    public final void a(Object obj) {
        if (u(obj)) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                hVar.clearMemoizedSerializedSize();
                hVar.clearMemoizedHashCode();
                hVar.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iN = N(i);
                long j = 1048575 & iN;
                int iM = M(iN);
                Unsafe unsafe = r;
                if (iM != 9) {
                    if (iM != 60 && iM != 68) {
                        switch (iM) {
                            case 17:
                                if (s(i, obj)) {
                                    q(i).a(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                            case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                            case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                                this.m.c(j, obj);
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f3p.i(object));
                                }
                                break;
                        }
                    } else if (v(iArr[i], i, obj)) {
                        q(i).a(unsafe.getObject(obj, j));
                    }
                } else if (s(i, obj)) {
                    q(i).a(unsafe.getObject(obj, j));
                }
            }
            ((o) this.n).getClass();
            n nVar = ((h) obj).unknownFields;
            if (nVar.e) {
                nVar.e = false;
            }
            if (this.f) {
                this.o.f(obj);
            }
        }
    }

    @Override // p.sm41
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.j) {
            int i6 = this.i[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iN = N(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = r.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iN) == 0 || t(obj, i6, i, i2, i10)) {
                int iM = M(iN);
                if (iM != 9 && iM != 17) {
                    if (iM != 27) {
                        if (iM == 60 || iM == 68) {
                            if (!v(i7, i6, obj) || q(i6).b(dlh1.j(iN & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (iM != 49) {
                            if (iM != 50) {
                                continue;
                            } else {
                                Object objJ = dlh1.j(iN & 1048575, obj);
                                sng0 sng0Var = this.f3p;
                                Map mapH = sng0Var.h(objJ);
                                if (!mapH.isEmpty() && ((kul1) sng0Var.e(p(i6)).e).a == nul1.i) {
                                    sm41 sm41VarA = null;
                                    for (Object obj2 : mapH.values()) {
                                        if (sm41VarA == null) {
                                            sm41VarA = oiy0.c.a(obj2.getClass());
                                        }
                                        if (!sm41VarA.b(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) dlh1.j(iN & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        sm41 sm41VarQ = q(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (sm41VarQ.b(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!t(obj, i6, i, i2, i10) || q(i6).b(dlh1.j(iN & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
        }
        return !this.f || this.o.c(obj).g();
    }

    @Override // p.sm41
    public final Object c() {
        return this.l.a(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p.sm41
    public final void d(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                l.m(this.n, obj4, obj2);
                if (this.f) {
                    l.l(this.o, obj4, obj2);
                    return;
                }
                return;
            }
            int iN = N(i);
            long j = 1048575 & iN;
            int i2 = iArr[i];
            switch (M(iN)) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        alh1 alh1Var = dlh1.c;
                        obj3 = obj;
                        alh1Var.i(obj3, j, alh1Var.e(j, obj2));
                        H(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        alh1 alh1Var2 = dlh1.c;
                        alh1Var2.j(obj, j, alh1Var2.f(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        dlh1.p(obj, j, dlh1.i(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        dlh1.p(obj, j, dlh1.i(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        dlh1.p(obj, j, dlh1.i(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        alh1 alh1Var3 = dlh1.c;
                        alh1Var3.g(obj, j, alh1Var3.b(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        dlh1.q(obj, j, dlh1.j(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        dlh1.q(obj, j, dlh1.j(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        dlh1.p(obj, j, dlh1.i(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        dlh1.o(obj, dlh1.h(j, obj2), j);
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        dlh1.p(obj, j, dlh1.i(j, obj2));
                        H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    this.m.a(obj, j, obj2);
                    obj3 = obj;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    Class cls = l.a;
                    dlh1.q(obj, j, this.f3p.d(dlh1.j(j, obj), dlh1.j(j, obj2)));
                    obj3 = obj;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (v(i2, i, obj2)) {
                        dlh1.q(obj, j, dlh1.j(j, obj2));
                        I(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i2, i, obj2)) {
                        dlh1.q(obj, j, dlh1.j(j, obj2));
                        I(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.sm41
    public final int e(h hVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iN = N(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iN;
            int i6 = 1237;
            int iHashCode = 37;
            switch (M(iN)) {
                case 0:
                    i = i3 * 53;
                    iB = l290.b(Double.doubleToLongBits(dlh1.c.e(j, hVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(dlh1.c.f(j, hVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = l290.b(dlh1.i(j, hVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = l290.b(dlh1.i(j, hVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = l290.b(dlh1.i(j, hVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zB = dlh1.c.b(j, hVar);
                    Charset charset = l290.a;
                    if (zB) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) dlh1.j(j, hVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objJ = dlh1.j(j, hVar);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = dlh1.j(j, hVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = l290.b(dlh1.i(j, hVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = dlh1.h(j, hVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = l290.b(dlh1.i(j, hVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = dlh1.j(j, hVar);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    i = i3 * 53;
                    iB = dlh1.j(j, hVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    i = i3 * 53;
                    iB = dlh1.j(j, hVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(Double.doubleToLongBits(((Double) dlh1.j(j, hVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) dlh1.j(j, hVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(D(j, hVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(D(j, hVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(D(j, hVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (v(i5, i4, hVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) dlh1.j(j, hVar)).booleanValue();
                        Charset charset2 = l290.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = ((String) dlh1.j(j, hVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = dlh1.j(j, hVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = dlh1.j(j, hVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(D(j, hVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = C(j, hVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = l290.b(D(j, hVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (v(i5, i4, hVar)) {
                        i = i3 * 53;
                        iB = dlh1.j(j, hVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((o) this.n).getClass();
        int iHashCode2 = hVar.unknownFields.hashCode() + (i3 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        return this.o.c(hVar).a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:168:0x039c  */
    @Override // p.sm41
    public final int f(h hVar) {
        int i;
        int iE;
        int iE2;
        int iE3;
        int iG;
        int iE4;
        int iG2;
        int iE5;
        int iE6;
        int iE7;
        int serializedSize;
        int iF;
        int iA;
        int iE8;
        int serializedSize2;
        int iC;
        int iE9;
        int size;
        int i2;
        int iE10;
        int iE11;
        int size2;
        int iE12;
        int iF2;
        int serializedSize3;
        int iE13;
        int iE14;
        int iG3;
        j jVar = this;
        h hVar2 = hVar;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iA2 = 0;
        while (true) {
            int[] iArr = jVar.a;
            if (i5 >= iArr.length) {
                ((o) jVar.n).getClass();
                int iC2 = hVar2.unknownFields.c() + iA2;
                if (!jVar.f) {
                    return iC2;
                }
                hg91 hg91Var = jVar.o.c(hVar2).a;
                int i7 = hg91Var.b;
                int iE15 = 0;
                for (int i8 = 0; i8 < i7; i8++) {
                    ng91 ng91VarC = hg91Var.c(i8);
                    iE15 += l220.e((gf40) ng91VarC.a, ng91VarC.b);
                }
                for (Map.Entry entry : hg91Var.d()) {
                    iE15 += l220.e((gf40) entry.getKey(), entry.getValue());
                }
                return iC2 + iE15;
            }
            int iN = jVar.N(i5);
            int iM = M(iN);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i3;
            Unsafe unsafe = r;
            if (iM <= 17) {
                if (i11 != i4) {
                    i6 = i11 == i3 ? 0 : unsafe.getInt(hVar2, i11);
                    i4 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iN & i3;
            if (iM < z220.b.a || iM > z220.c.a) {
                i11 = 0;
            }
            boolean z = jVar.h;
            switch (iM) {
                case 0:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE = rwg.e(i9);
                        iC = iE + 8;
                        iA2 += iC;
                    }
                    break;
                case 1:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE2 = rwg.e(i9);
                        iE6 = iE2 + 4;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 2:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(hVar2, j);
                        iE3 = rwg.e(i9);
                        iG = rwg.g(j2);
                        iA2 += iG + iE3;
                    }
                    jVar = this;
                    break;
                case 3:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(hVar2, j);
                        iE3 = rwg.e(i9);
                        iG = rwg.g(j3);
                        iA2 += iG + iE3;
                    }
                    jVar = this;
                    break;
                case 4:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(hVar2, j);
                        iE4 = rwg.e(i9);
                        iG2 = rwg.g(i12);
                        iA = iG2 + iE4;
                        iA2 += iA;
                    }
                    jVar = this;
                    break;
                case 5:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE5 = rwg.e(i9);
                        iE6 = iE5 + 8;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 6:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE2 = rwg.e(i9);
                        iE6 = iE2 + 4;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 7:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE6 = rwg.e(i9) + 1;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 8:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(hVar2, j);
                        iA2 = (object instanceof phc ? rwg.a(i9, (phc) object) : rwg.d((String) object) + rwg.e(i9)) + iA2;
                    }
                    jVar = this;
                    break;
                case 9:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(hVar2, j);
                        sm41 sm41VarQ = jVar.q(i5);
                        Class cls = l.a;
                        iE7 = rwg.e(i9);
                        serializedSize = ((s8) object2).getSerializedSize(sm41VarQ);
                        iF = rwg.f(serializedSize);
                        iA2 += iF + serializedSize + iE7;
                    }
                    break;
                case 10:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iA = rwg.a(i9, (phc) unsafe.getObject(hVar2, j));
                        iA2 += iA;
                    }
                    jVar = this;
                    break;
                case 11:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(hVar2, j);
                        iE4 = rwg.e(i9);
                        iG2 = rwg.f(i13);
                        iA = iG2 + iE4;
                        iA2 += iA;
                    }
                    jVar = this;
                    break;
                case 12:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(hVar2, j);
                        iE4 = rwg.e(i9);
                        iG2 = rwg.g(i14);
                        iA = iG2 + iE4;
                        iA2 += iA;
                    }
                    jVar = this;
                    break;
                case 13:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE2 = rwg.e(i9);
                        iE6 = iE2 + 4;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 14:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        iE5 = rwg.e(i9);
                        iE6 = iE5 + 8;
                        iA2 += iE6;
                    }
                    jVar = this;
                    hVar2 = hVar;
                    break;
                case 15:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        int i15 = unsafe.getInt(hVar2, j);
                        iE4 = rwg.e(i9);
                        iG2 = rwg.b(i15);
                        iA = iG2 + iE4;
                        iA2 += iA;
                    }
                    jVar = this;
                    break;
                case 16:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(hVar2, j);
                        iE3 = rwg.e(i9);
                        iG = rwg.c(j4);
                        iA2 += iG + iE3;
                    }
                    jVar = this;
                    break;
                case 17:
                    if (jVar.t(hVar2, i5, i4, i6, i)) {
                        s2j0 s2j0Var = (s2j0) unsafe.getObject(hVar2, j);
                        sm41 sm41VarQ2 = jVar.q(i5);
                        iE8 = rwg.e(i9) * 2;
                        serializedSize2 = ((s8) s2j0Var).getSerializedSize(sm41VarQ2);
                        iC = serializedSize2 + iE8;
                        iA2 += iC;
                    }
                    break;
                case 18:
                    iC = l.c(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 19:
                    iC = l.b(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(hVar2, j);
                    Class cls2 = l.a;
                    if (list.size() == 0) {
                        iE9 = 0;
                    } else {
                        iE9 = (rwg.e(i9) * list.size()) + l.e(list);
                    }
                    iA2 += iE9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(hVar2, j);
                    Class cls3 = l.a;
                    size = list2.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.i(list2);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(hVar2, j);
                    Class cls4 = l.a;
                    size = list3.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.d(list3);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 23:
                    iC = l.c(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 24:
                    iC = l.b(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(hVar2, j);
                    Class cls5 = l.a;
                    int size3 = list4.size();
                    iA2 += size3 == 0 ? 0 : (rwg.e(i9) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(hVar2, j);
                    Class cls6 = l.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iE9 = 0;
                    } else {
                        iE9 = rwg.e(i9) * size4;
                        if (list5 instanceof nvb0) {
                            nvb0 nvb0Var = (nvb0) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object objJ = nvb0Var.j(i16);
                                if (objJ instanceof phc) {
                                    int size5 = ((phc) objJ).size();
                                    iE9 = rwg.f(size5) + size5 + iE9;
                                } else {
                                    iE9 = rwg.d((String) objJ) + iE9;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof phc) {
                                    int size6 = ((phc) obj).size();
                                    iE9 = rwg.f(size6) + size6 + iE9;
                                } else {
                                    iE9 = rwg.d((String) obj) + iE9;
                                }
                            }
                        }
                    }
                    iA2 += iE9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(hVar2, j);
                    sm41 sm41VarQ3 = jVar.q(i5);
                    Class cls7 = l.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iE11 = 0;
                    } else {
                        iE11 = rwg.e(i9) * size7;
                        for (int i18 = 0; i18 < size7; i18++) {
                            int serializedSize4 = ((s8) list6.get(i18)).getSerializedSize(sm41VarQ3);
                            iE11 += rwg.f(serializedSize4) + serializedSize4;
                        }
                    }
                    iA2 += iE11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(hVar2, j);
                    Class cls8 = l.a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iE9 = 0;
                    } else {
                        iE9 = rwg.e(i9) * size8;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int size9 = ((phc) list7.get(i19)).size();
                            iE9 += rwg.f(size9) + size9;
                        }
                    }
                    iA2 += iE9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(hVar2, j);
                    Class cls9 = l.a;
                    size = list8.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.h(list8);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(hVar2, j);
                    Class cls10 = l.a;
                    size = list9.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.a(list9);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 31:
                    iC = l.b(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 32:
                    iC = l.c(i9, (List) unsafe.getObject(hVar2, j));
                    iA2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(hVar2, j);
                    Class cls11 = l.a;
                    size = list10.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.f(list10);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(hVar2, j);
                    Class cls12 = l.a;
                    size = list11.size();
                    if (size == 0) {
                        iE9 = 0;
                    } else {
                        i2 = l.g(list11);
                        iE10 = rwg.e(i9);
                        iE9 = (iE10 * size) + i2;
                    }
                    iA2 += iE9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(hVar2, j);
                    Class cls13 = l.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(hVar2, j);
                    Class cls14 = l.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 37:
                    size2 = l.e((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 38:
                    size2 = l.i((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 39:
                    size2 = l.d((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(hVar2, j);
                    Class cls15 = l.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(hVar2, j);
                    Class cls16 = l.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(hVar2, j);
                    Class cls17 = l.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 43:
                    size2 = l.h((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 44:
                    size2 = l.a((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(hVar2, j);
                    Class cls18 = l.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    List list18 = (List) unsafe.getObject(hVar2, j);
                    Class cls19 = l.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    size2 = l.f((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    size2 = l.g((List) unsafe.getObject(hVar2, j));
                    if (size2 > 0) {
                        if (z) {
                            unsafe.putInt(hVar2, i11, size2);
                        }
                        iE12 = rwg.e(i9);
                        iF2 = rwg.f(size2);
                        iA2 += iF2 + iE12 + size2;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    List list19 = (List) unsafe.getObject(hVar2, j);
                    sm41 sm41VarQ4 = jVar.q(i5);
                    Class cls20 = l.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        serializedSize3 = 0;
                    } else {
                        serializedSize3 = 0;
                        for (int i20 = 0; i20 < size10; i20++) {
                            serializedSize3 += ((s8) ((s2j0) list19.get(i20))).getSerializedSize(sm41VarQ4) + (rwg.e(i9) * 2);
                        }
                    }
                    iA2 += serializedSize3;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    iC = jVar.f3p.j(i9, unsafe.getObject(hVar2, j), jVar.p(i5));
                    iA2 += iC;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE = rwg.e(i9);
                        iC = iE + 8;
                        iA2 += iC;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE13 = rwg.e(i9);
                        iC = iE13 + 4;
                        iA2 += iC;
                    }
                    break;
                case 53:
                    if (jVar.v(i9, i5, hVar2)) {
                        long jD = D(j, hVar2);
                        iE8 = rwg.e(i9);
                        serializedSize2 = rwg.g(jD);
                        iC = serializedSize2 + iE8;
                        iA2 += iC;
                    }
                    break;
                case 54:
                    if (jVar.v(i9, i5, hVar2)) {
                        long jD2 = D(j, hVar2);
                        iE8 = rwg.e(i9);
                        serializedSize2 = rwg.g(jD2);
                        iC = serializedSize2 + iE8;
                        iA2 += iC;
                    }
                    break;
                case 55:
                    if (jVar.v(i9, i5, hVar2)) {
                        int iC3 = C(j, hVar2);
                        iE14 = rwg.e(i9);
                        iG3 = rwg.g(iC3);
                        iC = iG3 + iE14;
                        iA2 += iC;
                    }
                    break;
                case 56:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE = rwg.e(i9);
                        iC = iE + 8;
                        iA2 += iC;
                    }
                    break;
                case 57:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE13 = rwg.e(i9);
                        iC = iE13 + 4;
                        iA2 += iC;
                    }
                    break;
                case 58:
                    if (jVar.v(i9, i5, hVar2)) {
                        iC = rwg.e(i9) + 1;
                        iA2 += iC;
                    }
                    break;
                case 59:
                    if (jVar.v(i9, i5, hVar2)) {
                        Object object3 = unsafe.getObject(hVar2, j);
                        iA2 = (object3 instanceof phc ? rwg.a(i9, (phc) object3) : rwg.d((String) object3) + rwg.e(i9)) + iA2;
                    }
                    break;
                case 60:
                    if (jVar.v(i9, i5, hVar2)) {
                        Object object4 = unsafe.getObject(hVar2, j);
                        sm41 sm41VarQ5 = jVar.q(i5);
                        Class cls21 = l.a;
                        iE7 = rwg.e(i9);
                        serializedSize = ((s8) object4).getSerializedSize(sm41VarQ5);
                        iF = rwg.f(serializedSize);
                        iA2 += iF + serializedSize + iE7;
                    }
                    break;
                case 61:
                    if (jVar.v(i9, i5, hVar2)) {
                        iC = rwg.a(i9, (phc) unsafe.getObject(hVar2, j));
                        iA2 += iC;
                    }
                    break;
                case 62:
                    if (jVar.v(i9, i5, hVar2)) {
                        int iC4 = C(j, hVar2);
                        iE14 = rwg.e(i9);
                        iG3 = rwg.f(iC4);
                        iC = iG3 + iE14;
                        iA2 += iC;
                    }
                    break;
                case 63:
                    if (jVar.v(i9, i5, hVar2)) {
                        int iC5 = C(j, hVar2);
                        iE14 = rwg.e(i9);
                        iG3 = rwg.g(iC5);
                        iC = iG3 + iE14;
                        iA2 += iC;
                    }
                    break;
                case 64:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE13 = rwg.e(i9);
                        iC = iE13 + 4;
                        iA2 += iC;
                    }
                    break;
                case 65:
                    if (jVar.v(i9, i5, hVar2)) {
                        iE = rwg.e(i9);
                        iC = iE + 8;
                        iA2 += iC;
                    }
                    break;
                case 66:
                    if (jVar.v(i9, i5, hVar2)) {
                        int iC6 = C(j, hVar2);
                        iE14 = rwg.e(i9);
                        iG3 = rwg.b(iC6);
                        iC = iG3 + iE14;
                        iA2 += iC;
                    }
                    break;
                case 67:
                    if (jVar.v(i9, i5, hVar2)) {
                        long jD3 = D(j, hVar2);
                        iE8 = rwg.e(i9);
                        serializedSize2 = rwg.c(jD3);
                        iC = serializedSize2 + iE8;
                        iA2 += iC;
                    }
                    break;
                case 68:
                    if (jVar.v(i9, i5, hVar2)) {
                        s2j0 s2j0Var2 = (s2j0) unsafe.getObject(hVar2, j);
                        sm41 sm41VarQ6 = jVar.q(i5);
                        iE8 = rwg.e(i9) * 2;
                        serializedSize2 = ((s8) s2j0Var2).getSerializedSize(sm41VarQ6);
                        iC = serializedSize2 + iE8;
                        iA2 += iC;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p.sm41
    public final boolean g(h hVar, h hVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zN = true;
            if (i < length) {
                int iN = N(i);
                long j = iN & 1048575;
                switch (M(iN)) {
                    case 0:
                        if (!k(hVar, hVar2, i)) {
                            zN = false;
                        } else {
                            alh1 alh1Var = dlh1.c;
                            if (Double.doubleToLongBits(alh1Var.e(j, hVar)) != Double.doubleToLongBits(alh1Var.e(j, hVar2))) {
                                zN = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(hVar, hVar2, i)) {
                            zN = false;
                        } else {
                            alh1 alh1Var2 = dlh1.c;
                            if (Float.floatToIntBits(alh1Var2.f(j, hVar)) != Float.floatToIntBits(alh1Var2.f(j, hVar2))) {
                                zN = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(hVar, hVar2, i) || dlh1.i(j, hVar) != dlh1.i(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 3:
                        if (!k(hVar, hVar2, i) || dlh1.i(j, hVar) != dlh1.i(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 4:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 5:
                        if (!k(hVar, hVar2, i) || dlh1.i(j, hVar) != dlh1.i(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 6:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 7:
                        if (!k(hVar, hVar2, i)) {
                            zN = false;
                        } else {
                            alh1 alh1Var3 = dlh1.c;
                            if (alh1Var3.b(j, hVar) != alh1Var3.b(j, hVar2)) {
                                zN = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(hVar, hVar2, i) || !l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2))) {
                            zN = false;
                        }
                        break;
                    case 9:
                        if (!k(hVar, hVar2, i) || !l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2))) {
                            zN = false;
                        }
                        break;
                    case 10:
                        if (!k(hVar, hVar2, i) || !l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2))) {
                            zN = false;
                        }
                        break;
                    case 11:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 12:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 13:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 14:
                        if (!k(hVar, hVar2, i) || dlh1.i(j, hVar) != dlh1.i(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 15:
                        if (!k(hVar, hVar2, i) || dlh1.h(j, hVar) != dlh1.h(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 16:
                        if (!k(hVar, hVar2, i) || dlh1.i(j, hVar) != dlh1.i(j, hVar2)) {
                            zN = false;
                        }
                        break;
                    case 17:
                        if (!k(hVar, hVar2, i) || !l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2))) {
                            zN = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        zN = l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2));
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        zN = l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2));
                        break;
                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (dlh1.h(j2, hVar) != dlh1.h(j2, hVar2) || !l.n(dlh1.j(j, hVar), dlh1.j(j, hVar2))) {
                            zN = false;
                        }
                        break;
                }
                if (zN) {
                    i += 3;
                }
            } else {
                o oVar = (o) this.n;
                oVar.getClass();
                n nVar = hVar.unknownFields;
                oVar.getClass();
                if (nVar.equals(hVar2.unknownFields)) {
                    if (!this.f) {
                        return true;
                    }
                    xz00 xz00Var = this.o;
                    return xz00Var.c(hVar).equals(xz00Var.c(hVar2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // p.sm41
    public final void h(Object obj, i6b i6bVar) {
        Map.Entry entry;
        Iterator it;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        j jVar = this;
        i6bVar.getClass();
        boolean z2 = jVar.f;
        xz00 xz00Var = jVar.o;
        if (z2) {
            l220 l220VarC = xz00Var.c(obj);
            if (l220VarC.a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itI = l220VarC.i();
                entry = (Map.Entry) itI.next();
                it = itI;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = jVar.a;
        int length = iArr.length;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (i6 < length) {
            int iN = jVar.N(i6);
            int i9 = iArr[i6];
            int iM = M(iN);
            Unsafe unsafe = r;
            if (iM <= 17) {
                int i10 = iArr[i6 + 2];
                Map.Entry entry3 = entry;
                int i11 = i10 & 1048575;
                if (i11 != i7) {
                    i8 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                    i7 = i11;
                }
                int i12 = 1 << (i10 >>> 20);
                int i13 = i8;
                i3 = i12;
                i2 = i7;
                i = i13;
                entry2 = entry3;
            } else {
                int i14 = i7;
                i = i8;
                entry2 = entry;
                i2 = i14;
                i3 = 0;
            }
            while (true) {
                i4 = i2;
                if (entry2 != null && xz00Var.a(entry2) <= i9) {
                    xz00Var.j(i6bVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    i2 = i4;
                }
            }
            int i15 = iN & 1048575;
            Iterator it2 = it;
            long j = i15;
            switch (iM) {
                case 0:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.y(dlh1.c.e(j, obj), i9);
                    }
                    break;
                case 1:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.H(dlh1.c.f(j, obj), i9);
                    }
                    jVar = this;
                    break;
                case 2:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.N(i9, unsafe.getLong(obj, j));
                    }
                    jVar = this;
                    break;
                case 3:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.g0(i9, unsafe.getLong(obj, j));
                    }
                    jVar = this;
                    break;
                case 4:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.L(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 5:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.F(i9, unsafe.getLong(obj, j));
                    }
                    jVar = this;
                    break;
                case 6:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.D(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 7:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.r(i9, dlh1.c.b(j, obj));
                    }
                    jVar = this;
                    break;
                case 8:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            i6bVar.c0(i9, (String) object);
                        } else {
                            i6bVar.t(i9, (phc) object);
                        }
                    }
                    jVar = this;
                    break;
                case 9:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.Q(i9, unsafe.getObject(obj, j), jVar.q(i6));
                    }
                    break;
                case 10:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.t(i9, (phc) unsafe.getObject(obj, j));
                    }
                    jVar = this;
                    break;
                case 11:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.e0(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 12:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.B(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 13:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.T(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 14:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.V(i9, unsafe.getLong(obj, j));
                    }
                    jVar = this;
                    break;
                case 15:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.X(i9, unsafe.getInt(obj, j));
                    }
                    jVar = this;
                    break;
                case 16:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.Z(i9, unsafe.getLong(obj, j));
                    }
                    jVar = this;
                    break;
                case 17:
                    i5 = i4;
                    if (jVar.t(obj, i6, i5, i, i3)) {
                        i6bVar.J(i9, unsafe.getObject(obj, j), jVar.q(i6));
                    }
                    break;
                case 18:
                    int i16 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = l.a;
                    if (list == null || list.isEmpty()) {
                        z = false;
                    } else {
                        z = false;
                        i6bVar.z(i16, list, false);
                    }
                    i5 = i4;
                    break;
                case 19:
                    int i17 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls2 = l.a;
                    if (list2 != null && !list2.isEmpty()) {
                        i6bVar.I(i17, list2, false);
                    }
                    i5 = i4;
                    break;
                case 20:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = l.a;
                    if (list3 != null && !list3.isEmpty()) {
                        i6bVar.O(i18, list3, false);
                    }
                    i5 = i4;
                    break;
                case 21:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Class cls4 = l.a;
                    if (list4 != null && !list4.isEmpty()) {
                        i6bVar.h0(i19, list4, false);
                    }
                    i5 = i4;
                    break;
                case 22:
                    int i20 = iArr[i6];
                    List list5 = (List) unsafe.getObject(obj, j);
                    Class cls5 = l.a;
                    if (list5 != null && !list5.isEmpty()) {
                        i6bVar.M(i20, list5, false);
                    }
                    i5 = i4;
                    break;
                case 23:
                    int i21 = iArr[i6];
                    List list6 = (List) unsafe.getObject(obj, j);
                    Class cls6 = l.a;
                    if (list6 != null && !list6.isEmpty()) {
                        i6bVar.G(i21, list6, false);
                    }
                    i5 = i4;
                    break;
                case 24:
                    int i22 = iArr[i6];
                    List list7 = (List) unsafe.getObject(obj, j);
                    Class cls7 = l.a;
                    if (list7 != null && !list7.isEmpty()) {
                        i6bVar.E(i22, list7, false);
                    }
                    i5 = i4;
                    break;
                case 25:
                    int i23 = iArr[i6];
                    List list8 = (List) unsafe.getObject(obj, j);
                    Class cls8 = l.a;
                    if (list8 != null && !list8.isEmpty()) {
                        i6bVar.s(i23, list8, false);
                    }
                    i5 = i4;
                    break;
                case 26:
                    int i24 = iArr[i6];
                    List list9 = (List) unsafe.getObject(obj, j);
                    Class cls9 = l.a;
                    if (list9 != null && !list9.isEmpty()) {
                        i6bVar.d0(i24, list9);
                    }
                    i5 = i4;
                    break;
                case 27:
                    int i25 = iArr[i6];
                    List list10 = (List) unsafe.getObject(obj, j);
                    sm41 sm41VarQ = jVar.q(i6);
                    Class cls10 = l.a;
                    if (list10 != null && !list10.isEmpty()) {
                        i6bVar.R(i25, list10, sm41VarQ);
                    }
                    i5 = i4;
                    break;
                case 28:
                    int i26 = iArr[i6];
                    List list11 = (List) unsafe.getObject(obj, j);
                    Class cls11 = l.a;
                    if (list11 != null && !list11.isEmpty()) {
                        i6bVar.u(i26, list11);
                    }
                    i5 = i4;
                    break;
                case 29:
                    int i27 = iArr[i6];
                    List list12 = (List) unsafe.getObject(obj, j);
                    Class cls12 = l.a;
                    if (list12 != null && !list12.isEmpty()) {
                        i6bVar.f0(i27, list12, false);
                    }
                    i5 = i4;
                    break;
                case 30:
                    int i28 = iArr[i6];
                    List list13 = (List) unsafe.getObject(obj, j);
                    Class cls13 = l.a;
                    if (list13 != null && !list13.isEmpty()) {
                        i6bVar.C(i28, list13, false);
                    }
                    i5 = i4;
                    break;
                case 31:
                    int i29 = iArr[i6];
                    List list14 = (List) unsafe.getObject(obj, j);
                    Class cls14 = l.a;
                    if (list14 != null && !list14.isEmpty()) {
                        i6bVar.U(i29, list14, false);
                    }
                    i5 = i4;
                    break;
                case 32:
                    int i30 = iArr[i6];
                    List list15 = (List) unsafe.getObject(obj, j);
                    Class cls15 = l.a;
                    if (list15 != null && !list15.isEmpty()) {
                        i6bVar.W(i30, list15, false);
                    }
                    i5 = i4;
                    break;
                case 33:
                    int i31 = iArr[i6];
                    List list16 = (List) unsafe.getObject(obj, j);
                    Class cls16 = l.a;
                    if (list16 != null && !list16.isEmpty()) {
                        i6bVar.Y(i31, list16, false);
                    }
                    i5 = i4;
                    break;
                case 34:
                    int i32 = iArr[i6];
                    List list17 = (List) unsafe.getObject(obj, j);
                    Class cls17 = l.a;
                    if (list17 != null && !list17.isEmpty()) {
                        i6bVar.a0(i32, list17, false);
                    }
                    i5 = i4;
                    break;
                case 35:
                    int i33 = iArr[i6];
                    List list18 = (List) unsafe.getObject(obj, j);
                    Class cls18 = l.a;
                    if (list18 != null && !list18.isEmpty()) {
                        i6bVar.z(i33, list18, true);
                    }
                    i5 = i4;
                    break;
                case 36:
                    int i34 = iArr[i6];
                    List list19 = (List) unsafe.getObject(obj, j);
                    Class cls19 = l.a;
                    if (list19 != null && !list19.isEmpty()) {
                        i6bVar.I(i34, list19, true);
                    }
                    i5 = i4;
                    break;
                case 37:
                    int i35 = iArr[i6];
                    List list20 = (List) unsafe.getObject(obj, j);
                    Class cls20 = l.a;
                    if (list20 != null && !list20.isEmpty()) {
                        i6bVar.O(i35, list20, true);
                    }
                    i5 = i4;
                    break;
                case 38:
                    int i36 = iArr[i6];
                    List list21 = (List) unsafe.getObject(obj, j);
                    Class cls21 = l.a;
                    if (list21 != null && !list21.isEmpty()) {
                        i6bVar.h0(i36, list21, true);
                    }
                    i5 = i4;
                    break;
                case 39:
                    int i37 = iArr[i6];
                    List list22 = (List) unsafe.getObject(obj, j);
                    Class cls22 = l.a;
                    if (list22 != null && !list22.isEmpty()) {
                        i6bVar.M(i37, list22, true);
                    }
                    i5 = i4;
                    break;
                case 40:
                    int i38 = iArr[i6];
                    List list23 = (List) unsafe.getObject(obj, j);
                    Class cls23 = l.a;
                    if (list23 != null && !list23.isEmpty()) {
                        i6bVar.G(i38, list23, true);
                    }
                    i5 = i4;
                    break;
                case 41:
                    int i39 = iArr[i6];
                    List list24 = (List) unsafe.getObject(obj, j);
                    Class cls24 = l.a;
                    if (list24 != null && !list24.isEmpty()) {
                        i6bVar.E(i39, list24, true);
                    }
                    i5 = i4;
                    break;
                case 42:
                    int i40 = iArr[i6];
                    List list25 = (List) unsafe.getObject(obj, j);
                    Class cls25 = l.a;
                    if (list25 != null && !list25.isEmpty()) {
                        i6bVar.s(i40, list25, true);
                    }
                    i5 = i4;
                    break;
                case 43:
                    int i41 = iArr[i6];
                    List list26 = (List) unsafe.getObject(obj, j);
                    Class cls26 = l.a;
                    if (list26 != null && !list26.isEmpty()) {
                        i6bVar.f0(i41, list26, true);
                    }
                    i5 = i4;
                    break;
                case 44:
                    int i42 = iArr[i6];
                    List list27 = (List) unsafe.getObject(obj, j);
                    Class cls27 = l.a;
                    if (list27 != null && !list27.isEmpty()) {
                        i6bVar.C(i42, list27, true);
                    }
                    i5 = i4;
                    break;
                case 45:
                    int i43 = iArr[i6];
                    List list28 = (List) unsafe.getObject(obj, j);
                    Class cls28 = l.a;
                    if (list28 != null && !list28.isEmpty()) {
                        i6bVar.U(i43, list28, true);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    int i44 = iArr[i6];
                    List list29 = (List) unsafe.getObject(obj, j);
                    Class cls29 = l.a;
                    if (list29 != null && !list29.isEmpty()) {
                        i6bVar.W(i44, list29, true);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    int i45 = iArr[i6];
                    List list30 = (List) unsafe.getObject(obj, j);
                    Class cls30 = l.a;
                    if (list30 != null && !list30.isEmpty()) {
                        i6bVar.Y(i45, list30, true);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    int i46 = iArr[i6];
                    List list31 = (List) unsafe.getObject(obj, j);
                    Class cls31 = l.a;
                    if (list31 != null && !list31.isEmpty()) {
                        i6bVar.a0(i46, list31, true);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    int i47 = iArr[i6];
                    List list32 = (List) unsafe.getObject(obj, j);
                    sm41 sm41VarQ2 = jVar.q(i6);
                    Class cls32 = l.a;
                    if (list32 != null && !list32.isEmpty()) {
                        i6bVar.K(i47, list32, sm41VarQ2);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objP = jVar.p(i6);
                        sng0 sng0Var = jVar.f3p;
                        i6bVar.P(i9, sng0Var.e(objP), sng0Var.h(object2));
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.y(((Double) dlh1.j(j, obj)).doubleValue(), i9);
                    }
                    i5 = i4;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.H(((Float) dlh1.j(j, obj)).floatValue(), i9);
                    }
                    i5 = i4;
                    break;
                case 53:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.N(i9, D(j, obj));
                    }
                    i5 = i4;
                    break;
                case 54:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.g0(i9, D(j, obj));
                    }
                    i5 = i4;
                    break;
                case 55:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.L(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 56:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.F(i9, D(j, obj));
                    }
                    i5 = i4;
                    break;
                case 57:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.D(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 58:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.r(i9, ((Boolean) dlh1.j(j, obj)).booleanValue());
                    }
                    i5 = i4;
                    break;
                case 59:
                    if (jVar.v(i9, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            i6bVar.c0(i9, (String) object3);
                        } else {
                            i6bVar.t(i9, (phc) object3);
                        }
                    }
                    i5 = i4;
                    break;
                case 60:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.Q(i9, unsafe.getObject(obj, j), jVar.q(i6));
                    }
                    i5 = i4;
                    break;
                case 61:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.t(i9, (phc) unsafe.getObject(obj, j));
                    }
                    i5 = i4;
                    break;
                case 62:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.e0(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 63:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.B(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 64:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.T(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 65:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.V(i9, D(j, obj));
                    }
                    i5 = i4;
                    break;
                case 66:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.X(i9, C(j, obj));
                    }
                    i5 = i4;
                    break;
                case 67:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.Z(i9, D(j, obj));
                    }
                    i5 = i4;
                    break;
                case 68:
                    if (jVar.v(i9, i6, obj)) {
                        i6bVar.J(i9, unsafe.getObject(obj, j), jVar.q(i6));
                    }
                    i5 = i4;
                    break;
                default:
                    i5 = i4;
                    break;
            }
            i6 += 3;
            i8 = i;
            it = it2;
            i7 = i5;
            entry = entry2;
        }
        Iterator it3 = it;
        while (entry != null) {
            xz00Var.j(i6bVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        ((o) jVar.n).getClass();
        ((h) obj).unknownFields.g(i6bVar);
    }

    @Override // p.sm41
    public final void i(Object obj, byte[] bArr, int i, int i2, l36 l36Var) {
        E(obj, bArr, i, i2, 0, l36Var);
    }

    /* JADX WARN: Code duplicated, block: B:272:0x0836 A[Catch: all -> 0x083d, TryCatch #15 {all -> 0x083d, blocks: (B:270:0x0831, B:272:0x0836, B:276:0x0840), top: B:313:0x0831 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x084b A[LOOP:2: B:279:0x0849->B:280:0x084b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x085d  */
    /* JADX WARN: Code duplicated, block: B:295:0x0881 A[LOOP:3: B:294:0x087f->B:295:0x0881, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x0890  */
    /* JADX WARN: Code duplicated, block: B:366:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:? A[RETURN, SYNTHETIC] */
    @Override // p.sm41
    public final void j(Object obj, zb01 zb01Var, uz00 uz00Var) throws Throwable {
        Object obj2;
        Object objN;
        int i;
        Object obj3;
        Object objA;
        m mVar;
        Object objN2;
        m mVar2;
        l220 l220Var;
        uz00 uz00Var2;
        Object objN3;
        int i2;
        m mVar3;
        Object obj4;
        Object obj5;
        uz00 uz00Var3;
        Object obj6;
        m mVar4;
        j jVar = this;
        uz00 uz00Var4 = uz00Var;
        uz00Var4.getClass();
        l(obj);
        m mVar5 = jVar.n;
        int[] iArr = jVar.i;
        int i3 = jVar.k;
        int i4 = jVar.j;
        Object objA2 = null;
        l220 l220VarD = null;
        while (true) {
            try {
                int iZ = zb01Var.z();
                try {
                    int iJ = (iZ < jVar.c || iZ > jVar.d) ? -1 : jVar.J(iZ, 0);
                    if (iJ >= 0) {
                        mVar = mVar5;
                        objA = objA2;
                        obj2 = obj;
                        zb01 zb01Var2 = zb01Var;
                        try {
                            int iN = jVar.N(iJ);
                            try {
                                int iM = M(iN);
                                otc0 otc0Var = jVar.m;
                                switch (iM) {
                                    case 0:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        jVar = jVar;
                                        zb01Var2 = zb01Var2;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        try {
                                            objA = objA;
                                            try {
                                                dlh1.c.i(obj, iN & 1048575, zb01Var2.readDouble());
                                                obj2 = obj;
                                                try {
                                                    jVar.H(iJ, obj2);
                                                    objA2 = objA;
                                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                                    objA2 = objA;
                                                    try {
                                                        mVar2.getClass();
                                                        if (objA2 == null) {
                                                            objA2 = mVar2.a(obj2);
                                                        }
                                                        if (!mVar2.b(0, objA2, zb01Var2)) {
                                                            objN3 = objA2;
                                                            i2 = i4;
                                                            while (i2 < i3) {
                                                                objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                                i2++;
                                                                jVar = this;
                                                            }
                                                            mVar3 = mVar2;
                                                            if (objN3 != null) {
                                                                mVar3.c(obj2, objN3);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        mVar5 = mVar2;
                                                        objN = objA2;
                                                        for (i = i4; i < i3; i++) {
                                                            objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                        }
                                                        if (objN != null) {
                                                            mVar5.c(obj2, objN);
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    objA2 = objA;
                                                    mVar5 = mVar2;
                                                    objN = objA2;
                                                    while (i < i3) {
                                                        objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                    }
                                                    if (objN != null) {
                                                        mVar5.c(obj2, objN);
                                                    }
                                                    throw th;
                                                }
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                                obj2 = obj;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj2 = obj;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            obj2 = obj;
                                            objA = objA;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj;
                                            objA = objA;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 1:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar2 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.c.j(obj2, iN & 1048575, zb01Var2.readFloat());
                                        jVar2.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 2:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar3 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.p(obj2, iN & 1048575, zb01Var2.F());
                                        jVar3.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 3:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar4 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.p(obj2, iN & 1048575, zb01Var2.r());
                                        jVar4.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 4:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar5 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.o(obj2, zb01Var2.o(), iN & 1048575);
                                        jVar5.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 5:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar6 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.p(obj2, iN & 1048575, zb01Var2.a());
                                        jVar6.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 6:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar7 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.o(obj2, zb01Var2.t(), iN & 1048575);
                                        jVar7.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 7:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar8 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.c.g(obj2, iN & 1048575, zb01Var2.d());
                                        jVar8.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 8:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar9 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        jVar9.F(iN, obj2, zb01Var2);
                                        jVar9.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 9:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar10 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        s2j0 s2j0Var = (s2j0) jVar10.z(iJ, obj2);
                                        zb01Var2.I(s2j0Var, jVar10.q(iJ), uz00Var2);
                                        jVar10.K(iJ, obj2, s2j0Var);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 10:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar11 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.q(obj2, iN & 1048575, zb01Var2.n());
                                        jVar11.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 11:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar12 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.o(obj2, zb01Var2.g(), iN & 1048575);
                                        jVar12.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 12:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar13 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        int iJ2 = zb01Var2.j();
                                        z190 z190VarO = jVar13.o(iJ);
                                        if (z190VarO == null || z190VarO.isInRange(iJ2)) {
                                            dlh1.o(obj2, iJ2, iN & 1048575);
                                            jVar13.H(iJ, obj2);
                                            objA = obj4;
                                            objA2 = objA;
                                        } else {
                                            objA2 = l.o(obj2, iZ, iJ2, obj4, mVar2);
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 13:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar14 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.o(obj2, zb01Var2.C(), iN & 1048575);
                                        jVar14.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 14:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar15 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.p(obj2, iN & 1048575, zb01Var2.e());
                                        jVar15.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 15:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        j jVar16 = jVar;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        dlh1.o(obj2, zb01Var2.k(), iN & 1048575);
                                        jVar16.H(iJ, obj2);
                                        objA = obj4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 16:
                                        obj2 = obj2;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar = jVar;
                                        zb01Var2 = zb01Var2;
                                        obj4 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        i4 = i4;
                                        try {
                                            dlh1.p(obj2, iN & 1048575, zb01Var2.x());
                                            jVar.H(iJ, obj2);
                                            objA = obj4;
                                            objA2 = objA;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            objA2 = obj4;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            objA2 = obj4;
                                            mVar5 = mVar2;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 17:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        j jVar17 = jVar;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        s2j0 s2j0Var2 = (s2j0) jVar17.z(iJ, obj2);
                                        zb01Var2.J(s2j0Var2, jVar17.q(iJ), uz00Var2);
                                        jVar17.K(iJ, obj2, s2j0Var2);
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 18:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.E(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 19:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.B(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 20:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.h(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 21:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.f(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 22:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.v(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 23:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.p(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 24:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.w(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 25:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.l(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 26:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        if ((536870912 & iN) != 0) {
                                            zb01Var2.m(otc0Var.b(iN & 1048575, obj2));
                                        } else {
                                            zb01Var2.A(otc0Var.b(iN & 1048575, obj2));
                                        }
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 27:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        j jVar18 = jVar;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.K(otc0Var.b(iN & 1048575, obj2), jVar18.q(iJ), uz00Var2);
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 28:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.D(otc0Var.b(iN & 1048575, obj2));
                                        objA = obj5;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 29:
                                        obj2 = obj2;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar = jVar;
                                        zb01Var2 = zb01Var2;
                                        obj5 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        try {
                                            zb01Var2.s(otc0Var.b(iN & 1048575, obj2));
                                            objA = obj5;
                                            i4 = i4;
                                            objA2 = objA;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                            objA2 = obj5;
                                            i4 = i4;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            objA2 = obj5;
                                            i4 = i4;
                                            mVar5 = mVar2;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 30:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar = jVar;
                                        obj2 = obj2;
                                        zb01Var2 = zb01Var2;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        try {
                                            List listB = otc0Var.b(iN & 1048575, obj2);
                                            zb01Var2.i(listB);
                                            try {
                                                Object objK = l.k(obj2, iZ, listB, jVar.o(iJ), objA, mVar5);
                                                mVar2 = mVar5;
                                                objA2 = objK;
                                                i4 = i4;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                                obj2 = obj2;
                                                obj5 = objA;
                                                mVar2 = mVar5;
                                                objA2 = obj5;
                                                i4 = i4;
                                                mVar2.getClass();
                                                if (objA2 == null) {
                                                    objA2 = mVar2.a(obj2);
                                                }
                                                if (!mVar2.b(0, objA2, zb01Var2)) {
                                                    objN3 = objA2;
                                                    i2 = i4;
                                                    while (i2 < i3) {
                                                        objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                        i2++;
                                                        jVar = this;
                                                    }
                                                    mVar3 = mVar2;
                                                    if (objN3 != null) {
                                                        mVar3.c(obj2, objN3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                obj2 = obj2;
                                                obj5 = objA;
                                                mVar2 = mVar5;
                                                objA2 = obj5;
                                                i4 = i4;
                                                mVar5 = mVar2;
                                                objN = objA2;
                                                while (i < i3) {
                                                    objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                }
                                                if (objN != null) {
                                                    mVar5.c(obj2, objN);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                            obj5 = objA;
                                            mVar2 = mVar5;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            objA2 = objA;
                                            i4 = i4;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 31:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.b(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 32:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.u(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 33:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.q(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 34:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.c(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 35:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.E(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 36:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.B(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 37:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.h(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 38:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.f(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 39:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.v(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 40:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.p(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 41:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.w(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 42:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2.l(otc0Var.b(iN & 1048575, obj2));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar5;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 43:
                                        obj2 = obj2;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar5 = mVar;
                                        jVar = jVar;
                                        uz00Var2 = uz00Var4;
                                        zb01Var2 = zb01Var2;
                                        try {
                                            zb01Var2.s(otc0Var.b(iN & 1048575, obj2));
                                            i4 = i4;
                                            objA = objA;
                                            mVar2 = mVar5;
                                            objA2 = objA;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                            i4 = i4;
                                            objA2 = objA;
                                            mVar2 = mVar5;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            objA2 = objA;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 44:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar = jVar;
                                        zb01Var2 = zb01Var2;
                                        uz00 uz00Var5 = uz00Var4;
                                        try {
                                            List listB2 = otc0Var.b(iN & 1048575, obj2);
                                            zb01Var2.i(listB2);
                                            uz00Var2 = uz00Var5;
                                            try {
                                                objA2 = l.k(obj2, iZ, listB2, jVar.o(iJ), objA, mVar);
                                                mVar2 = mVar;
                                                i4 = i4;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                                mVar2 = mVar;
                                                objA2 = objA;
                                                obj2 = obj2;
                                                i4 = i4;
                                                mVar2.getClass();
                                                if (objA2 == null) {
                                                    objA2 = mVar2.a(obj2);
                                                }
                                                if (!mVar2.b(0, objA2, zb01Var2)) {
                                                    objN3 = objA2;
                                                    i2 = i4;
                                                    while (i2 < i3) {
                                                        objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                        i2++;
                                                        jVar = this;
                                                    }
                                                    mVar3 = mVar2;
                                                    if (objN3 != null) {
                                                        mVar3.c(obj2, objN3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                obj2 = obj2;
                                                objA = objA;
                                                mVar5 = mVar;
                                                objA2 = objA;
                                                objN = objA2;
                                                while (i < i3) {
                                                    objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                }
                                                if (objN != null) {
                                                    mVar5.c(obj2, objN);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                            mVar5 = mVar;
                                            uz00Var2 = uz00Var5;
                                            obj2 = obj2;
                                            i4 = i4;
                                            objA2 = objA;
                                            mVar2 = mVar5;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            obj2 = obj2;
                                            mVar5 = mVar;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 45:
                                        uz00Var3 = uz00Var4;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj6 = obj2;
                                        zb01Var2.b(otc0Var.b(iN & 1048575, obj6));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var3;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                                        uz00Var3 = uz00Var4;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj6 = obj2;
                                        zb01Var2.u(otc0Var.b(iN & 1048575, obj6));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var3;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                                        uz00Var3 = uz00Var4;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj6 = obj2;
                                        zb01Var2.q(otc0Var.b(iN & 1048575, obj6));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var3;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                                        uz00Var3 = uz00Var4;
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        obj6 = obj2;
                                        zb01Var2.c(otc0Var.b(iN & 1048575, obj6));
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var3;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar = jVar;
                                        obj6 = obj2;
                                        zb01Var2 = zb01Var2;
                                        uz00Var3 = uz00Var4;
                                        try {
                                            zb01Var2.H(otc0Var.b(iN & 1048575, obj6), jVar.q(iJ), uz00Var3);
                                            i4 = i4;
                                            objA = objA;
                                            mVar2 = mVar;
                                            uz00Var2 = uz00Var3;
                                            objA2 = objA;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                            obj2 = obj6;
                                            i4 = i4;
                                            objA2 = objA;
                                            mVar2 = mVar;
                                            uz00Var2 = uz00Var3;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            obj2 = obj6;
                                            mVar5 = mVar;
                                            objA2 = objA;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        try {
                                            obj2 = obj2;
                                            try {
                                                jVar.w(obj2, iJ, jVar.p(iJ), uz00Var, zb01Var2);
                                                obj6 = obj2;
                                                uz00Var3 = uz00Var;
                                                i4 = i4;
                                                objA = objA;
                                                mVar2 = mVar;
                                                uz00Var2 = uz00Var3;
                                                objA2 = objA;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                                jVar = jVar;
                                                zb01Var2 = zb01Var2;
                                                i4 = i4;
                                                objA2 = objA;
                                                mVar2 = mVar;
                                                uz00Var2 = uz00Var;
                                                mVar2.getClass();
                                                if (objA2 == null) {
                                                    objA2 = mVar2.a(obj2);
                                                }
                                                if (!mVar2.b(0, objA2, zb01Var2)) {
                                                    objN3 = objA2;
                                                    i2 = i4;
                                                    while (i2 < i3) {
                                                        objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                        i2++;
                                                        jVar = this;
                                                    }
                                                    mVar3 = mVar2;
                                                    if (objN3 != null) {
                                                        mVar3.c(obj2, objN3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                mVar5 = mVar;
                                                objA2 = objA;
                                                objN = objA2;
                                                while (i < i3) {
                                                    objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                }
                                                if (objN != null) {
                                                    mVar5.c(obj2, objN);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                                            jVar = jVar;
                                            zb01Var2 = zb01Var2;
                                            obj2 = obj2;
                                            i4 = i4;
                                            objA2 = objA;
                                            mVar2 = mVar;
                                            uz00Var2 = uz00Var;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            obj6 = obj2;
                                            obj2 = obj6;
                                            mVar5 = mVar;
                                            objA2 = objA;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Double.valueOf(zb01Var2.readDouble()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Float.valueOf(zb01Var2.readFloat()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 53:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Long.valueOf(zb01Var2.F()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 54:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Long.valueOf(zb01Var2.r()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 55:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Integer.valueOf(zb01Var2.o()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 56:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Long.valueOf(zb01Var2.a()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 57:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Integer.valueOf(zb01Var2.t()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 58:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Boolean.valueOf(zb01Var2.d()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 59:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        jVar.F(iN, obj2, zb01Var2);
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 60:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        s2j0 s2j0Var3 = (s2j0) jVar.A(iZ, iJ, obj2);
                                        zb01Var2.I(s2j0Var3, jVar.q(iJ), uz00Var4);
                                        jVar.L(obj2, iZ, iJ, s2j0Var3);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 61:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, zb01Var2.n());
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 62:
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        dlh1.q(obj2, iN & 1048575, Integer.valueOf(zb01Var2.g()));
                                        jVar.I(iZ, iJ, obj2);
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 63:
                                        try {
                                            int iJ3 = zb01Var2.j();
                                            z190 z190VarO2 = jVar.o(iJ);
                                            try {
                                                if (z190VarO2 != null) {
                                                    try {
                                                        if (!z190VarO2.isInRange(iJ3)) {
                                                            Object objO = l.o(obj2, iZ, iJ3, objA, mVar);
                                                            l220Var = l220VarD;
                                                            iArr = iArr;
                                                            i4 = i4;
                                                            mVar2 = mVar;
                                                            uz00Var2 = uz00Var4;
                                                            objA2 = objO;
                                                        }
                                                        mVar5 = mVar2;
                                                        jVar = this;
                                                        iArr = iArr;
                                                        uz00Var4 = uz00Var2;
                                                        l220VarD = l220Var;
                                                        i4 = i4;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        mVar = mVar;
                                                        obj2 = obj2;
                                                        iArr = iArr;
                                                        mVar5 = mVar;
                                                        objA2 = objA;
                                                        objN = objA2;
                                                        while (i < i3) {
                                                            objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                        }
                                                        if (objN != null) {
                                                            mVar5.c(obj2, objN);
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                dlh1.q(obj2, iN & 1048575, Integer.valueOf(iJ3));
                                                jVar.I(iZ, iJ, obj2);
                                                mVar2 = mVar;
                                                uz00Var2 = uz00Var4;
                                                objA2 = objA;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused14) {
                                                objA2 = objA;
                                                mVar2 = mVar;
                                                uz00Var2 = uz00Var4;
                                                mVar2.getClass();
                                                if (objA2 == null) {
                                                    objA2 = mVar2.a(obj2);
                                                }
                                                if (!mVar2.b(0, objA2, zb01Var2)) {
                                                    objN3 = objA2;
                                                    i2 = i4;
                                                    while (i2 < i3) {
                                                        objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                        i2++;
                                                        jVar = this;
                                                    }
                                                    mVar3 = mVar2;
                                                    if (objN3 != null) {
                                                        mVar3.c(obj2, objN3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                obj2 = obj2;
                                                mVar5 = mVar;
                                                objA2 = objA;
                                                objN = objA2;
                                                while (i < i3) {
                                                    objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                }
                                                if (objN != null) {
                                                    mVar5.c(obj2, objN);
                                                }
                                                throw th;
                                            }
                                            mVar = mVar;
                                            l220Var = l220VarD;
                                            iArr = iArr;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused15) {
                                            iArr = iArr;
                                            mVar = mVar;
                                            l220Var = l220VarD;
                                        } catch (Throwable th17) {
                                            th = th17;
                                            iArr = iArr;
                                            mVar = mVar;
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 64:
                                        mVar4 = mVar;
                                        dlh1.q(obj2, iN & 1048575, Integer.valueOf(zb01Var2.C()));
                                        jVar.I(iZ, iJ, obj2);
                                        uz00Var2 = uz00Var4;
                                        iArr = iArr;
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar4;
                                        l220Var = l220VarD;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 65:
                                        mVar4 = mVar;
                                        dlh1.q(obj2, iN & 1048575, Long.valueOf(zb01Var2.e()));
                                        jVar.I(iZ, iJ, obj2);
                                        uz00Var2 = uz00Var4;
                                        iArr = iArr;
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar4;
                                        l220Var = l220VarD;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 66:
                                        mVar4 = mVar;
                                        dlh1.q(obj2, iN & 1048575, Integer.valueOf(zb01Var2.k()));
                                        jVar.I(iZ, iJ, obj2);
                                        uz00Var2 = uz00Var4;
                                        iArr = iArr;
                                        i4 = i4;
                                        objA = objA;
                                        mVar2 = mVar4;
                                        l220Var = l220VarD;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 67:
                                        mVar4 = mVar;
                                        try {
                                            try {
                                                dlh1.q(obj2, iN & 1048575, Long.valueOf(zb01Var2.x()));
                                                jVar.I(iZ, iJ, obj2);
                                                uz00Var2 = uz00Var4;
                                                iArr = iArr;
                                                i4 = i4;
                                                objA = objA;
                                                mVar2 = mVar4;
                                                l220Var = l220VarD;
                                                objA2 = objA;
                                            } catch (Throwable th18) {
                                                th = th18;
                                                obj2 = obj2;
                                                iArr = iArr;
                                                i4 = i4;
                                                objA2 = objA;
                                                mVar5 = mVar4;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused16) {
                                            uz00Var2 = uz00Var4;
                                            obj2 = obj2;
                                            iArr = iArr;
                                            i4 = i4;
                                            zb01Var2 = zb01Var2;
                                            objA2 = objA;
                                            mVar2 = mVar4;
                                            l220Var = l220VarD;
                                            jVar = jVar;
                                            mVar2.getClass();
                                            if (objA2 == null) {
                                                objA2 = mVar2.a(obj2);
                                            }
                                            if (!mVar2.b(0, objA2, zb01Var2)) {
                                                objN3 = objA2;
                                                i2 = i4;
                                                while (i2 < i3) {
                                                    objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                    i2++;
                                                    jVar = this;
                                                }
                                                mVar3 = mVar2;
                                                if (objN3 != null) {
                                                    mVar3.c(obj2, objN3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    case 68:
                                        s2j0 s2j0Var4 = (s2j0) jVar.A(iZ, iJ, obj2);
                                        zb01Var2.J(s2j0Var4, jVar.q(iJ), uz00Var4);
                                        jVar.L(obj2, iZ, iJ, s2j0Var4);
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        objA2 = objA;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                    default:
                                        if (objA == null) {
                                            try {
                                                objA = mVar.a(obj2);
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused17) {
                                                l220Var = l220VarD;
                                                iArr = iArr;
                                                objA2 = objA;
                                                mVar2 = mVar;
                                                uz00Var2 = uz00Var4;
                                                mVar2.getClass();
                                                if (objA2 == null) {
                                                    objA2 = mVar2.a(obj2);
                                                }
                                                if (!mVar2.b(0, objA2, zb01Var2)) {
                                                    objN3 = objA2;
                                                    i2 = i4;
                                                    while (i2 < i3) {
                                                        objN3 = jVar.n(obj2, iArr[i2], objN3, mVar2, obj);
                                                        i2++;
                                                        jVar = this;
                                                    }
                                                    mVar3 = mVar2;
                                                    if (objN3 != null) {
                                                        mVar3.c(obj2, objN3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                obj2 = obj2;
                                                iArr = iArr;
                                                mVar5 = mVar;
                                                objA2 = objA;
                                                objN = objA2;
                                                while (i < i3) {
                                                    objN = n(obj2, iArr[i], objN, mVar5, obj);
                                                }
                                                if (objN != null) {
                                                    mVar5.c(obj2, objN);
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!mVar.b(0, objA, zb01Var2)) {
                                            objN2 = objA;
                                            while (i4 < i3) {
                                                Object obj7 = obj2;
                                                objN2 = jVar.n(obj7, iArr[i4], objN2, mVar, obj);
                                                obj2 = obj7;
                                                i4++;
                                            }
                                            if (objN2 == null) {
                                                return;
                                            }
                                            mVar.c(obj2, objN2);
                                            return;
                                        }
                                        l220Var = l220VarD;
                                        iArr = iArr;
                                        i4 = i4;
                                        objA2 = objA;
                                        mVar2 = mVar;
                                        uz00Var2 = uz00Var4;
                                        mVar5 = mVar2;
                                        jVar = this;
                                        iArr = iArr;
                                        uz00Var4 = uz00Var2;
                                        l220VarD = l220Var;
                                        i4 = i4;
                                        break;
                                        break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused18) {
                                obj2 = obj2;
                                l220Var = l220VarD;
                                iArr = iArr;
                                i4 = i4;
                                objA = objA;
                                jVar = jVar;
                                zb01Var2 = zb01Var2;
                                mVar2 = mVar;
                                uz00Var2 = uz00Var4;
                            } catch (Throwable th20) {
                                th = th20;
                                obj2 = obj2;
                                iArr = iArr;
                                i4 = i4;
                                objA = objA;
                                mVar2 = mVar;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            obj2 = obj2;
                            mVar5 = mVar;
                            obj3 = objA;
                            objA2 = obj3;
                        }
                    } else {
                        if (iZ == Integer.MAX_VALUE) {
                            Object objN4 = objA2;
                            while (i4 < i3) {
                                objN4 = jVar.n(obj, iArr[i4], objN4, mVar5, obj);
                                i4++;
                                jVar = jVar;
                            }
                            if (objN4 != null) {
                                mVar5.c(obj, objN4);
                                return;
                            }
                            return;
                        }
                        j jVar19 = jVar;
                        try {
                            boolean z = jVar19.f;
                            xz00 xz00Var = jVar19.o;
                            Object objB = !z ? null : xz00Var.b(uz00Var4, jVar19.e, iZ);
                            if (objB != null) {
                                if (l220VarD == null) {
                                    try {
                                        l220VarD = xz00Var.d(obj);
                                    } catch (Throwable th22) {
                                        th = th22;
                                        obj2 = obj;
                                        iArr = iArr;
                                        i4 = i4;
                                        objN = objA2;
                                        while (i < i3) {
                                            objN = n(obj2, iArr[i], objN, mVar5, obj);
                                        }
                                        if (objN != null) {
                                            mVar5.c(obj2, objN);
                                        }
                                        throw th;
                                    }
                                }
                                l220 l220Var2 = l220VarD;
                                m mVar6 = mVar5;
                                try {
                                    Object objG = xz00Var.g(obj, zb01Var, objB, uz00Var4, l220Var2, objA2, mVar6);
                                    l220VarD = l220Var2;
                                    mVar5 = mVar6;
                                    objA2 = objG;
                                    jVar = jVar19;
                                } catch (Throwable th23) {
                                    th = th23;
                                    obj2 = obj;
                                    mVar5 = mVar6;
                                    iArr = iArr;
                                    i4 = i4;
                                    objN = objA2;
                                    while (i < i3) {
                                        objN = n(obj2, iArr[i], objN, mVar5, obj);
                                    }
                                    if (objN != null) {
                                        mVar5.c(obj2, objN);
                                    }
                                    throw th;
                                }
                            } else {
                                obj2 = obj;
                                objA = objA2;
                                try {
                                    mVar5.getClass();
                                    if (objA == null) {
                                        try {
                                            objA = mVar5.a(obj2);
                                        } catch (Throwable th24) {
                                            th = th24;
                                            iArr = iArr;
                                            objA2 = objA;
                                            objN = objA2;
                                            while (i < i3) {
                                                objN = n(obj2, iArr[i], objN, mVar5, obj);
                                            }
                                            if (objN != null) {
                                                mVar5.c(obj2, objN);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!mVar5.b(0, objA, zb01Var)) {
                                        objN2 = objA;
                                        while (i4 < i3) {
                                            j jVar20 = jVar19;
                                            objN2 = jVar20.n(obj2, iArr[i4], objN2, mVar5, obj);
                                            i4++;
                                            mVar5 = mVar5;
                                            jVar19 = jVar20;
                                        }
                                        mVar = mVar5;
                                        obj2 = obj2;
                                        if (objN2 == null) {
                                            return;
                                        }
                                        mVar.c(obj2, objN2);
                                        return;
                                    }
                                    jVar = jVar19;
                                    objA2 = objA;
                                } catch (Throwable th25) {
                                    th = th25;
                                    mVar = mVar5;
                                    iArr = iArr;
                                    mVar5 = mVar;
                                    objA2 = objA;
                                    objN = objA2;
                                    while (i < i3) {
                                        objN = n(obj2, iArr[i], objN, mVar5, obj);
                                    }
                                    if (objN != null) {
                                        mVar5.c(obj2, objN);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th26) {
                            th = th26;
                            obj2 = obj;
                            iArr = iArr;
                            i4 = i4;
                            mVar5 = mVar5;
                        }
                    }
                } catch (Throwable th27) {
                    th = th27;
                    obj2 = obj;
                    obj3 = objA2;
                }
            } catch (Throwable th28) {
                th = th28;
                obj2 = obj;
            }
            objN = objA2;
            while (i < i3) {
                objN = n(obj2, iArr[i], objN, mVar5, obj);
            }
            if (objN != null) {
                mVar5.c(obj2, objN);
            }
            throw th;
        }
    }

    public final boolean k(h hVar, h hVar2, int i) {
        return s(i, hVar) == s(i, hVar2);
    }

    public final Object n(Object obj, int i, Object obj2, m mVar, Object obj3) {
        z190 z190VarO;
        int i2 = this.a[i];
        Object objJ = dlh1.j(N(i) & 1048575, obj);
        if (objJ == null || (z190VarO = o(i)) == null) {
            return obj2;
        }
        sng0 sng0Var = this.f3p;
        Map mapF = sng0Var.f(objJ);
        w6e0 w6e0VarE = sng0Var.e(p(i));
        Iterator it = mapF.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z190VarO.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = mVar.a(obj3);
                }
                it8 it8Var = new it8(dng0.a(w6e0VarE, entry.getKey(), entry.getValue()));
                nwg nwgVarJ = it8Var.j();
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    l220.n(nwgVarJ, (kul1) w6e0VarE.d, 1, key);
                    l220.n(nwgVarJ, (kul1) w6e0VarE.e, 2, value);
                    hhc hhcVarG = it8Var.g();
                    ((o) mVar).getClass();
                    ((n) obj2).f(poz0.E(i2, 2), hhcVarG);
                    it.remove();
                } catch (IOException e) {
                    eg.j(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final z190 o(int i) {
        return (z190) this.b[cy30.x(i, 3, 2, 1)];
    }

    public final Object p(int i) {
        return this.b[(i / 3) * 2];
    }

    public final sm41 q(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        sm41 sm41Var = (sm41) objArr[i2];
        if (sm41Var != null) {
            return sm41Var;
        }
        sm41 sm41VarA = oiy0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = sm41VarA;
        return sm41VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & dlh1.h(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iN = N(i);
        long j2 = iN & 1048575;
        switch (M(iN)) {
            case 0:
                if (Double.doubleToRawLongBits(dlh1.c.e(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(dlh1.c.f(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (dlh1.i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (dlh1.i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (dlh1.i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return dlh1.c.b(j2, obj);
            case 8:
                Object objJ = dlh1.j(j2, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof phc) {
                    return !phc.b.equals(objJ);
                }
                bhn0.q();
                return false;
            case 9:
                if (dlh1.j(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !phc.b.equals(dlh1.j(j2, obj));
            case 11:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (dlh1.i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (dlh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (dlh1.i(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (dlh1.j(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean v(int i, int i2, Object obj) {
        return dlh1.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void w(Object obj, int i, Object obj2, uz00 uz00Var, zb01 zb01Var) {
        long jN = N(i) & 1048575;
        Object objJ = dlh1.j(jN, obj);
        sng0 sng0Var = this.f3p;
        if (objJ == null) {
            objJ = sng0Var.g(obj2);
            dlh1.q(obj, jN, objJ);
        } else if (sng0Var.k(objJ)) {
            Object objG = sng0Var.g(obj2);
            sng0Var.d(objG, objJ);
            dlh1.q(obj, jN, objG);
            objJ = objG;
        }
        zb01Var.L(sng0Var.f(objJ), sng0Var.e(obj2), uz00Var);
    }

    public final void x(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                eg.m(ab80.n("Source subfield ", " is present but null: ", this.a[i], String.valueOf(obj2)));
                return;
            }
            sm41 sm41VarQ = q(i);
            if (!s(i, obj)) {
                if (u(object)) {
                    Object objC = sm41VarQ.c();
                    sm41VarQ.d(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!u(object2)) {
                Object objC2 = sm41VarQ.c();
                sm41VarQ.d(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            sm41VarQ.d(object2, object);
        }
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (v(i2, i, obj2)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                eg.m(ab80.n("Source subfield ", " is present but null: ", iArr[i], String.valueOf(obj2)));
                return;
            }
            sm41 sm41VarQ = q(i);
            if (!v(i2, i, obj)) {
                if (u(object)) {
                    Object objC = sm41VarQ.c();
                    sm41VarQ.d(objC, object);
                    unsafe.putObject(obj, jN, objC);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                I(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!u(object2)) {
                Object objC2 = sm41VarQ.c();
                sm41VarQ.d(objC2, object2);
                unsafe.putObject(obj, jN, objC2);
                object2 = objC2;
            }
            sm41VarQ.d(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        sm41 sm41VarQ = q(i);
        long jN = N(i) & 1048575;
        if (!s(i, obj)) {
            return sm41VarQ.c();
        }
        Object object = r.getObject(obj, jN);
        if (u(object)) {
            return object;
        }
        Object objC = sm41VarQ.c();
        if (object != null) {
            sm41VarQ.d(objC, object);
        }
        return objC;
    }
}
