package androidx.datastore.preferences.protobuf;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import p.a320;
import p.ac01;
import p.alh1;
import p.b010;
import p.bhn0;
import p.cy30;
import p.elh1;
import p.eng0;
import p.ihc;
import p.jc9;
import p.l1d;
import p.mul1;
import p.n290;
import p.piy0;
import p.ptc0;
import p.pul1;
import p.pze0;
import p.qkh1;
import p.qwg;
import p.rng0;
import p.tm41;
import p.u9o0;
import p.v8i0;
import p.wz00;
import p.xih1;
import p.xng0;
import p.yvz0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g implements tm41 {
    public static final int[] o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f0p;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final u9o0 k;
    public final ptc0 l;
    public final j m;
    public final xng0 n;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new qkh1((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f0p = unsafe;
    }

    public g(int[] iArr, Object[] objArr, int i, int i2, a aVar, boolean z, int[] iArr2, int i3, int i4, u9o0 u9o0Var, ptc0 ptc0Var, j jVar, b010 b010Var, xng0 xng0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof e;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = u9o0Var;
        this.l = ptc0Var;
        this.m = jVar;
        this.e = aVar;
        this.n = xng0Var;
    }

    public static int B(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void E(int i, Object obj, jc9 jc9Var) {
        if (obj instanceof String) {
            jc9Var.a0(i, (String) obj);
        } else {
            jc9Var.v(i, (ihc) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0385  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e1  */
    public static g t(yvz0 yvz0Var, u9o0 u9o0Var, ptc0 ptc0Var, j jVar, b010 b010Var, xng0 xng0Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        int[] iArr2;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        int i22;
        int i23;
        Field fieldY;
        int i24;
        char cCharAt9;
        int i25;
        int i26;
        Field fieldY2;
        Field fieldY3;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        char cCharAt14;
        if (!(yvz0Var instanceof yvz0)) {
            v8i0.l(yvz0Var);
            throw null;
        }
        int i33 = 0;
        boolean z2 = (yvz0Var.d & 1) != 1;
        String str = yvz0Var.b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i34 = iCharAt3 & 8191;
            int i35 = 1;
            int i36 = 13;
            while (true) {
                i = i35 + 1;
                cCharAt14 = str.charAt(i35);
                if (cCharAt14 < 55296) {
                    break;
                }
                i34 |= (cCharAt14 & 8191) << i36;
                i36 += 13;
                i35 = i;
            }
            iCharAt3 = i34 | (cCharAt14 << i36);
        } else {
            i = 1;
        }
        int i37 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i38 = iCharAt4 & 8191;
            int i39 = 13;
            while (true) {
                i32 = i37 + 1;
                cCharAt13 = str.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i32;
            }
            iCharAt4 = i38 | (cCharAt13 << i39);
            i37 = i32;
        }
        if (iCharAt4 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            iArr = o;
            i5 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt5 = str.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt8 = str.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt5 = i41 | (cCharAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt6 = str.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt7 = str.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt6 = i44 | (cCharAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt7 = str.charAt(i43);
            if (iCharAt7 >= 55296) {
                int i47 = iCharAt7 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt6 = str.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt7 = i47 | (cCharAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            int iCharAt8 = str.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt5 = str.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt8 = i50 | (cCharAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            iCharAt = str.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt4 = str.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            iCharAt2 = str.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt3 = str.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt2 = i56 | (cCharAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i8 = i60 + 1;
                    cCharAt2 = str.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i60 = i8;
                }
                iCharAt9 = i59 | (cCharAt2 << i61);
                i2 = i8;
            } else {
                i2 = i58;
            }
            int i62 = i2 + 1;
            int iCharAt10 = str.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i7 = i64 + 1;
                    cCharAt = str.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i64 = i7;
                }
                iCharAt10 = i63 | (cCharAt << i65);
                i62 = i7;
            }
            int[] iArr3 = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i3 = (iCharAt5 * 2) + iCharAt6;
            int i66 = iCharAt7;
            iArr = iArr3;
            i4 = i66;
            i5 = iCharAt8;
            i6 = iCharAt10;
            i33 = iCharAt5;
            i37 = i62;
        }
        Object[] objArr = yvz0Var.c;
        Class<?> cls = yvz0Var.a.getClass();
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i67 = iCharAt2 + i6;
        int i68 = i6;
        int i69 = i67;
        int i70 = 0;
        int i71 = 0;
        while (i37 < length) {
            int i72 = i37 + 1;
            int iCharAt11 = str.charAt(i37);
            int i73 = i33;
            if (iCharAt11 >= 55296) {
                int i74 = iCharAt11 & 8191;
                int i75 = i72;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    cCharAt12 = str.charAt(i75);
                    i15 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                    length = i15;
                }
                iCharAt11 = i74 | (cCharAt12 << i76);
                i16 = i31;
            } else {
                i15 = length;
                i16 = i72;
            }
            int i77 = i16 + 1;
            int iCharAt12 = str.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i78 = iCharAt12 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i29 = i79 + 1;
                    cCharAt11 = str.charAt(i79);
                    i30 = i78;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 = i30 | ((cCharAt11 & 8191) << i80);
                    i80 += 13;
                    i79 = i29;
                }
                iCharAt12 = i30 | (cCharAt11 << i80);
                i17 = i29;
            } else {
                i17 = i77;
            }
            int i81 = iCharAt3;
            int i82 = iCharAt12 & 255;
            int i83 = i4;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            Unsafe unsafe = f0p;
            int i84 = iCharAt11;
            if (i82 >= 51) {
                int i85 = i17 + 1;
                int iCharAt13 = str.charAt(i17);
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i27 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        i28 = i86;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 = i28 | ((cCharAt10 & 8191) << i88);
                        i88 += 13;
                        i87 = i27;
                    }
                    iCharAt13 = i28 | (cCharAt10 << i88);
                    i26 = i27;
                } else {
                    i26 = i85;
                }
                int i89 = iCharAt13;
                int i90 = i82 - 51;
                int i91 = i26;
                if (i90 == 9 || i90 == 17) {
                    i18 = i5;
                    objArr2[cy30.x(i70, 3, 2, 1)] = objArr[i3];
                    i3++;
                } else if (i90 == 12) {
                    i18 = i5;
                    if ((i81 & 1) == 1) {
                        objArr2[cy30.x(i70, 3, 2, 1)] = objArr[i3];
                        i3++;
                    }
                } else {
                    i18 = i5;
                }
                int i92 = i89 * 2;
                Object obj = objArr[i92];
                if (obj instanceof Field) {
                    fieldY2 = (Field) obj;
                } else {
                    fieldY2 = y(cls, (String) obj);
                    objArr[i92] = fieldY2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldY2);
                int i93 = i92 + 1;
                Object obj2 = objArr[i93];
                if (obj2 instanceof Field) {
                    fieldY3 = (Field) obj2;
                } else {
                    fieldY3 = y(cls, (String) obj2);
                    objArr[i93] = fieldY3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY3);
                int i94 = i3;
                str = str;
                i22 = i94;
                i70 = i70;
                i23 = iObjectFieldOffset3;
                z = z2;
                iArr2 = iArr;
                i20 = i91;
                i21 = 0;
            } else {
                i18 = i5;
                int i95 = i3 + 1;
                Field fieldY4 = y(cls, (String) objArr[i3]);
                if (i82 == 9 || i82 == 17) {
                    z = z2;
                    iArr2 = iArr;
                    objArr2[cy30.x(i70, 3, 2, 1)] = fieldY4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        z = z2;
                        iArr2 = iArr;
                        i25 = i3 + 2;
                        objArr2[cy30.x(i70, 3, 2, 1)] = objArr[i95];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        z = z2;
                        iArr2 = iArr;
                        if ((i81 & 1) == 1) {
                            i25 = i3 + 2;
                            objArr2[cy30.x(i70, 3, 2, 1)] = objArr[i95];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                        if ((i81 & 1) == 1 || i82 > 17) {
                            i20 = i17;
                            i21 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i20 = i17 + 1;
                            int iCharAt14 = str.charAt(i17);
                            if (iCharAt14 >= 55296) {
                                int i96 = iCharAt14 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i24 = i20 + 1;
                                    cCharAt9 = str.charAt(i20);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i20 = i24;
                                }
                                iCharAt14 = i96 | (cCharAt9 << i97);
                                i20 = i24;
                            }
                            int i98 = (iCharAt14 / 32) + (i73 * 2);
                            Object obj3 = objArr[i98];
                            if (obj3 instanceof Field) {
                                fieldY = (Field) obj3;
                            } else {
                                fieldY = y(cls, (String) obj3);
                                objArr[i98] = fieldY;
                            }
                            i21 = iCharAt14 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY);
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr2[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        if (i82 == 50) {
                            int i99 = i68 + 1;
                            iArr[i68] = i70;
                            int i100 = (i70 / 3) * 2;
                            int i101 = i3 + 2;
                            objArr2[i100] = objArr[i95];
                            if ((iCharAt12 & 2048) != 0) {
                                i19 = i3 + 3;
                                objArr2[i100 + 1] = objArr[i101];
                                z = z2;
                                iArr2 = iArr;
                                i68 = i99;
                            } else {
                                iArr2 = iArr;
                                i19 = i101;
                                i68 = i99;
                                z = z2;
                            }
                        } else {
                            z = z2;
                            iArr2 = iArr;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                        if ((i81 & 1) == 1) {
                            i20 = i17;
                            i21 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i20 = i17;
                            i21 = 0;
                            iObjectFieldOffset2 = 0;
                        }
                        if (i82 >= 18) {
                            iArr2[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                    i19 = i25;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                    if ((i81 & 1) == 1) {
                        i20 = i17;
                        i21 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        i20 = i17;
                        i21 = 0;
                        iObjectFieldOffset2 = 0;
                    }
                    if (i82 >= 18) {
                        iArr2[i69] = iObjectFieldOffset;
                        i69++;
                    }
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
                i19 = i95;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                if ((i81 & 1) == 1) {
                    i20 = i17;
                    i21 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i20 = i17;
                    i21 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i82 >= 18) {
                    iArr2[i69] = iObjectFieldOffset;
                    i69++;
                }
                i22 = i19;
                i23 = iObjectFieldOffset;
            }
            int i102 = i70 + 1;
            iArr4[i70] = i84;
            int i103 = i70 + 2;
            iArr4[i102] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? 536870912 : 0) | (i82 << 20) | i23;
            i70 += 3;
            iArr4[i103] = (i21 << 20) | iObjectFieldOffset2;
            String str2 = str;
            i3 = i22;
            str = str2;
            i37 = i20;
            iArr = iArr2;
            iCharAt3 = i81;
            i33 = i73;
            i4 = i83;
            length = i15;
            z2 = z;
            i5 = i18;
        }
        return new g(iArr4, objArr2, i4, i5, yvz0Var.a, z2, iArr, i6, i67, u9o0Var, ptc0Var, jVar, b010Var, xng0Var);
    }

    public static long u(int i) {
        return i & 1048575;
    }

    public static int v(long j, Object obj) {
        return ((Integer) elh1.j(j, obj)).intValue();
    }

    public static long w(long j, Object obj) {
        return ((Long) elh1.j(j, obj)).longValue();
    }

    public static Field y(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbT = l1d.t("Field ", str, " for ");
            sbT.append(cls.getName());
            sbT.append(" not found. Known fields are ");
            sbT.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbT.toString());
        }
    }

    public final void A(int i, int i2, Object obj) {
        elh1.n(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int C(int i) {
        return this.a[i + 1];
    }

    public final void D(Object obj, jc9 jc9Var) {
        int i;
        int i2;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int iC = C(i6);
            int i7 = iArr[i6];
            int iB = B(iC);
            boolean z = this.g;
            Unsafe unsafe = f0p;
            if (z || iB > 17) {
                i = 1048575;
                i2 = 0;
            } else {
                int i8 = iArr[i6 + 2];
                i = 1048575;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            }
            long j = iC & i;
            switch (iB) {
                case 0:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.x(elh1.d.e(j, obj), i7);
                        continue;
                    }
                    break;
                case 1:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.G(elh1.d.f(j, obj), i7);
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.M(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.e0(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.K(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.E(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.C(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.t(i7, elh1.d.b(j, obj));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        E(i7, unsafe.getObject(obj, j), jc9Var);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.P(i7, unsafe.getObject(obj, j), n(i3));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.v(i7, (ihc) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.c0(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.A(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.R(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.T(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.V(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.X(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        jc9Var.I(i7, unsafe.getObject(obj, j), n(i3));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    i3 = i6;
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = i.a;
                    if (list != null && !list.isEmpty()) {
                        jc9Var.y(i10, list, false);
                    }
                    break;
                case 19:
                    i3 = i6;
                    int i11 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls2 = i.a;
                    if (list2 != null && !list2.isEmpty()) {
                        jc9Var.H(i11, list2, false);
                    }
                    break;
                case 20:
                    i3 = i6;
                    int i12 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = i.a;
                    if (list3 != null && !list3.isEmpty()) {
                        jc9Var.N(i12, list3, false);
                    }
                    break;
                case 21:
                    i3 = i6;
                    int i13 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Class cls4 = i.a;
                    if (list4 != null && !list4.isEmpty()) {
                        jc9Var.f0(i13, list4, false);
                    }
                    break;
                case 22:
                    i3 = i6;
                    int i14 = iArr[i3];
                    List list5 = (List) unsafe.getObject(obj, j);
                    Class cls5 = i.a;
                    if (list5 != null && !list5.isEmpty()) {
                        jc9Var.L(i14, list5, false);
                    }
                    break;
                case 23:
                    i3 = i6;
                    int i15 = iArr[i3];
                    List list6 = (List) unsafe.getObject(obj, j);
                    Class cls6 = i.a;
                    if (list6 != null && !list6.isEmpty()) {
                        jc9Var.F(i15, list6, false);
                    }
                    break;
                case 24:
                    i3 = i6;
                    int i16 = iArr[i3];
                    List list7 = (List) unsafe.getObject(obj, j);
                    Class cls7 = i.a;
                    if (list7 != null && !list7.isEmpty()) {
                        jc9Var.D(i16, list7, false);
                    }
                    break;
                case 25:
                    i3 = i6;
                    int i17 = iArr[i3];
                    List list8 = (List) unsafe.getObject(obj, j);
                    Class cls8 = i.a;
                    if (list8 != null && !list8.isEmpty()) {
                        jc9Var.u(i17, list8, false);
                    }
                    break;
                case 26:
                    i3 = i6;
                    int i18 = iArr[i3];
                    List list9 = (List) unsafe.getObject(obj, j);
                    Class cls9 = i.a;
                    if (list9 != null && !list9.isEmpty()) {
                        jc9Var.b0(i18, list9);
                    }
                    break;
                case 27:
                    i3 = i6;
                    int i19 = iArr[i3];
                    List list10 = (List) unsafe.getObject(obj, j);
                    tm41 tm41VarN = n(i3);
                    Class cls10 = i.a;
                    if (list10 != null && !list10.isEmpty()) {
                        jc9Var.Q(i19, list10, tm41VarN);
                    }
                    break;
                case 28:
                    i3 = i6;
                    int i20 = iArr[i3];
                    List list11 = (List) unsafe.getObject(obj, j);
                    Class cls11 = i.a;
                    if (list11 != null && !list11.isEmpty()) {
                        jc9Var.w(i20, list11);
                    }
                    break;
                case 29:
                    i3 = i6;
                    int i21 = iArr[i3];
                    List list12 = (List) unsafe.getObject(obj, j);
                    Class cls12 = i.a;
                    if (list12 != null && !list12.isEmpty()) {
                        jc9Var.d0(i21, list12, false);
                    }
                    break;
                case 30:
                    i3 = i6;
                    int i22 = iArr[i3];
                    List list13 = (List) unsafe.getObject(obj, j);
                    Class cls13 = i.a;
                    if (list13 != null && !list13.isEmpty()) {
                        jc9Var.B(i22, list13, false);
                    }
                    break;
                case 31:
                    i3 = i6;
                    int i23 = iArr[i3];
                    List list14 = (List) unsafe.getObject(obj, j);
                    Class cls14 = i.a;
                    if (list14 != null && !list14.isEmpty()) {
                        jc9Var.S(i23, list14, false);
                    }
                    break;
                case 32:
                    i3 = i6;
                    int i24 = iArr[i3];
                    List list15 = (List) unsafe.getObject(obj, j);
                    Class cls15 = i.a;
                    if (list15 != null && !list15.isEmpty()) {
                        jc9Var.U(i24, list15, false);
                    }
                    break;
                case 33:
                    i3 = i6;
                    int i25 = iArr[i3];
                    List list16 = (List) unsafe.getObject(obj, j);
                    Class cls16 = i.a;
                    if (list16 != null && !list16.isEmpty()) {
                        jc9Var.W(i25, list16, false);
                    }
                    break;
                case 34:
                    i3 = i6;
                    int i26 = iArr[i3];
                    List list17 = (List) unsafe.getObject(obj, j);
                    Class cls17 = i.a;
                    if (list17 != null && !list17.isEmpty()) {
                        jc9Var.Y(i26, list17, false);
                    }
                    break;
                case 35:
                    i3 = i6;
                    int i27 = iArr[i3];
                    List list18 = (List) unsafe.getObject(obj, j);
                    Class cls18 = i.a;
                    if (list18 != null && !list18.isEmpty()) {
                        jc9Var.y(i27, list18, true);
                    }
                    break;
                case 36:
                    i3 = i6;
                    int i28 = iArr[i3];
                    List list19 = (List) unsafe.getObject(obj, j);
                    Class cls19 = i.a;
                    if (list19 != null && !list19.isEmpty()) {
                        jc9Var.H(i28, list19, true);
                    }
                    break;
                case 37:
                    i3 = i6;
                    int i29 = iArr[i3];
                    List list20 = (List) unsafe.getObject(obj, j);
                    Class cls20 = i.a;
                    if (list20 != null && !list20.isEmpty()) {
                        jc9Var.N(i29, list20, true);
                    }
                    break;
                case 38:
                    i3 = i6;
                    int i30 = iArr[i3];
                    List list21 = (List) unsafe.getObject(obj, j);
                    Class cls21 = i.a;
                    if (list21 != null && !list21.isEmpty()) {
                        jc9Var.f0(i30, list21, true);
                    }
                    break;
                case 39:
                    i3 = i6;
                    int i31 = iArr[i3];
                    List list22 = (List) unsafe.getObject(obj, j);
                    Class cls22 = i.a;
                    if (list22 != null && !list22.isEmpty()) {
                        jc9Var.L(i31, list22, true);
                    }
                    break;
                case 40:
                    i3 = i6;
                    int i32 = iArr[i3];
                    List list23 = (List) unsafe.getObject(obj, j);
                    Class cls23 = i.a;
                    if (list23 != null && !list23.isEmpty()) {
                        jc9Var.F(i32, list23, true);
                    }
                    break;
                case 41:
                    i3 = i6;
                    int i33 = iArr[i3];
                    List list24 = (List) unsafe.getObject(obj, j);
                    Class cls24 = i.a;
                    if (list24 != null && !list24.isEmpty()) {
                        jc9Var.D(i33, list24, true);
                    }
                    break;
                case 42:
                    i3 = i6;
                    int i34 = iArr[i3];
                    List list25 = (List) unsafe.getObject(obj, j);
                    Class cls25 = i.a;
                    if (list25 != null && !list25.isEmpty()) {
                        jc9Var.u(i34, list25, true);
                    }
                    break;
                case 43:
                    i3 = i6;
                    int i35 = iArr[i3];
                    List list26 = (List) unsafe.getObject(obj, j);
                    Class cls26 = i.a;
                    if (list26 != null && !list26.isEmpty()) {
                        jc9Var.d0(i35, list26, true);
                    }
                    break;
                case 44:
                    i3 = i6;
                    int i36 = iArr[i3];
                    List list27 = (List) unsafe.getObject(obj, j);
                    Class cls27 = i.a;
                    if (list27 != null && !list27.isEmpty()) {
                        jc9Var.B(i36, list27, true);
                    }
                    break;
                case 45:
                    i3 = i6;
                    int i37 = iArr[i3];
                    List list28 = (List) unsafe.getObject(obj, j);
                    Class cls28 = i.a;
                    if (list28 != null && !list28.isEmpty()) {
                        jc9Var.S(i37, list28, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    i3 = i6;
                    int i38 = iArr[i3];
                    List list29 = (List) unsafe.getObject(obj, j);
                    Class cls29 = i.a;
                    if (list29 != null && !list29.isEmpty()) {
                        jc9Var.U(i38, list29, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    i3 = i6;
                    int i39 = iArr[i3];
                    List list30 = (List) unsafe.getObject(obj, j);
                    Class cls30 = i.a;
                    if (list30 != null && !list30.isEmpty()) {
                        jc9Var.W(i39, list30, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    i3 = i6;
                    int i40 = iArr[i3];
                    List list31 = (List) unsafe.getObject(obj, j);
                    Class cls31 = i.a;
                    if (list31 != null && !list31.isEmpty()) {
                        jc9Var.Y(i40, list31, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    i3 = i6;
                    int i41 = iArr[i3];
                    List list32 = (List) unsafe.getObject(obj, j);
                    tm41 tm41VarN2 = n(i3);
                    Class cls32 = i.a;
                    if (list32 != null && !list32.isEmpty()) {
                        jc9Var.J(i41, list32, tm41VarN2);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    i3 = i6;
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objM = m(i3);
                        this.n.getClass();
                        jc9Var.O(i7, ((eng0) objM).a, (rng0) object);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.x(((Double) elh1.j(j, obj)).doubleValue(), i7);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.G(((Float) elh1.j(j, obj)).floatValue(), i7);
                    }
                    break;
                case 53:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.M(i7, w(j, obj));
                    }
                    break;
                case 54:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.e0(i7, w(j, obj));
                    }
                    break;
                case 55:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.K(i7, v(j, obj));
                    }
                    break;
                case 56:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.E(i7, w(j, obj));
                    }
                    break;
                case 57:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.C(i7, v(j, obj));
                    }
                    break;
                case 58:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.t(i7, ((Boolean) elh1.j(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        E(i7, unsafe.getObject(obj, j), jc9Var);
                    }
                    break;
                case 60:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.P(i7, unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                case 61:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.v(i7, (ihc) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.c0(i7, v(j, obj));
                    }
                    break;
                case 63:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.A(i7, v(j, obj));
                    }
                    break;
                case 64:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.R(i7, v(j, obj));
                    }
                    break;
                case 65:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.T(i7, w(j, obj));
                    }
                    break;
                case 66:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.V(i7, v(j, obj));
                    }
                    break;
                case 67:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.X(i7, w(j, obj));
                    }
                    break;
                case 68:
                    i3 = i6;
                    if (p(i7, i3, obj)) {
                        jc9Var.I(i7, unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                default:
                    i3 = i6;
                    break;
            }
        }
        ((xih1) this.m).getClass();
        ((e) obj).unknownFields.d(jc9Var);
    }

    @Override // p.tm41
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jC = C(iArr[i2]) & 1048575;
            Object objJ = elh1.j(jC, obj);
            if (objJ != null) {
                this.n.getClass();
                ((rng0) objJ).a = false;
                elh1.p(obj, jC, objJ);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        ((xih1) this.m).getClass();
        ((e) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    @Override // p.tm41
    public final boolean b(Object obj) {
        int i;
        int iB;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zO = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int iC = C(i5);
            boolean z = this.g;
            if (z) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f0p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & iC) == 0) {
                iB = B(iC);
                if (iB != 9 || iB == 17) {
                    if (z) {
                        zO = o(i5, obj);
                    } else if ((i & i4) == 0) {
                        zO = false;
                    }
                    if (!zO || n(i5).b(elh1.j(iC & 1048575, obj))) {
                        i3++;
                    }
                } else {
                    if (iB != 27) {
                        if (iB == 60 || iB == 68) {
                            if (!p(i6, i5, obj) || n(i5).b(elh1.j(iC & 1048575, obj))) {
                                i3++;
                            }
                        } else if (iB != 49) {
                            if (iB != 50) {
                                continue;
                            } else {
                                Object objJ = elh1.j(iC & 1048575, obj);
                                this.n.getClass();
                                rng0 rng0Var = (rng0) objJ;
                                if (!rng0Var.isEmpty() && ((mul1) ((eng0) m(i5)).a.c).a == pul1.i) {
                                    tm41 tm41VarA = null;
                                    for (Object obj2 : rng0Var.values()) {
                                        if (tm41VarA == null) {
                                            tm41VarA = piy0.c.a(obj2.getClass());
                                        }
                                        if (!tm41VarA.b(obj2)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                    List list = (List) elh1.j(iC & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        tm41 tm41VarN = n(i5);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (tm41VarN.b(list.get(i9))) {
                            }
                        }
                    }
                    i3++;
                }
            } else {
                if (z ? o(i5, obj) : (i4 & i) != 0) {
                    iB = B(iC);
                    if (iB != 9) {
                    }
                    if (z) {
                        zO = o(i5, obj);
                    } else if ((i & i4) == 0) {
                        zO = false;
                    }
                    if (!zO) {
                        continue;
                    }
                    i3++;
                }
            }
            return false;
        }
    }

    @Override // p.tm41
    public final Object c() {
        this.k.getClass();
        return ((e) this.e).d(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p.tm41
    public final int d(a aVar) {
        int iP0;
        int iA;
        j jVar;
        xng0 xng0Var;
        int i;
        int iT0;
        int iR0;
        int iZ0;
        int i2;
        int iT1;
        int iZ1;
        int iA2;
        j jVar2 = this.m;
        xng0 xng0Var2 = this.n;
        int i3 = 1048575;
        Unsafe unsafe = f0p;
        boolean z = this.g;
        int[] iArr = this.a;
        if (z) {
            int i4 = 0;
            iP0 = 0;
            while (i4 < iArr.length) {
                int iC = C(i4);
                int iB = B(iC);
                int i5 = iArr[i4];
                long j = iC & i3;
                if (iB >= a320.b.a() && iB <= a320.c.a()) {
                    int i6 = iArr[i4 + 2];
                }
                switch (iB) {
                    case 0:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.t0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 1:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.y0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 2:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.D0(i5, elh1.i(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 3:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.U0(i5, elh1.i(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 4:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.B0(i5, elh1.h(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 5:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.x0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 6:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.w0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 7:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.p0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 8:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            Object objJ = elh1.j(j, aVar);
                            iP0 = (objJ instanceof ihc ? qwg.r0(i5, (ihc) objJ) : qwg.P0(i5, (String) objJ)) + iP0;
                        }
                        break;
                    case 9:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            Object objJ2 = elh1.j(j, aVar);
                            tm41 tm41VarN = n(i4);
                            Class cls = i.a;
                            iT1 = qwg.F0(i5, (a) objJ2, tm41VarN);
                            iP0 += iT1;
                        }
                        break;
                    case 10:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.r0(i5, (ihc) elh1.j(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 11:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.S0(i5, elh1.h(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 12:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.u0(i5, elh1.h(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 13:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.J0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 14:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.K0(i5);
                            iP0 += iT1;
                        }
                        break;
                    case 15:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.L0(i5, elh1.h(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 16:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.N0(i5, elh1.i(j, aVar));
                            iP0 += iT1;
                        }
                        break;
                    case 17:
                        i2 = i3;
                        if (o(i4, aVar)) {
                            iT1 = qwg.z0(i5, (a) elh1.j(j, aVar), n(i4));
                            iP0 += iT1;
                        }
                        break;
                    case 18:
                        i2 = i3;
                        iT1 = i.f(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 19:
                        i2 = i3;
                        iT1 = i.d(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 20:
                        i2 = i3;
                        iT1 = i.j(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 21:
                        i2 = i3;
                        iT1 = i.t(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 22:
                        i2 = i3;
                        iT1 = i.h(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 23:
                        i2 = i3;
                        iT1 = i.f(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 24:
                        i2 = i3;
                        iT1 = i.d(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 25:
                        i2 = i3;
                        List list = (List) elh1.j(j, aVar);
                        Class cls2 = i.a;
                        int size = list.size();
                        iP0 += size == 0 ? 0 : qwg.p0(i5) * size;
                        break;
                    case 26:
                        i2 = i3;
                        iT1 = i.q(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 27:
                        i2 = i3;
                        iT1 = i.l(i5, (List) elh1.j(j, aVar), n(i4));
                        iP0 += iT1;
                        break;
                    case 28:
                        i2 = i3;
                        iT1 = i.a(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 29:
                        i2 = i3;
                        iT1 = i.r(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 30:
                        i2 = i3;
                        iT1 = i.b(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 31:
                        i2 = i3;
                        iT1 = i.d(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 32:
                        i2 = i3;
                        iT1 = i.f(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 33:
                        i2 = i3;
                        iT1 = i.m(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 34:
                        i2 = i3;
                        iT1 = i.o(i5, (List) elh1.j(j, aVar));
                        iP0 += iT1;
                        break;
                    case 35:
                        i2 = i3;
                        int iG = i.g((List) unsafe.getObject(aVar, j));
                        if (iG > 0) {
                            iP0 = cy30.c(iG, qwg.R0(i5), iG, iP0);
                        }
                        break;
                    case 36:
                        i2 = i3;
                        int iE = i.e((List) unsafe.getObject(aVar, j));
                        if (iE > 0) {
                            iP0 = cy30.c(iE, qwg.R0(i5), iE, iP0);
                        }
                        break;
                    case 37:
                        i2 = i3;
                        int iK = i.k((List) unsafe.getObject(aVar, j));
                        if (iK > 0) {
                            iP0 = cy30.c(iK, qwg.R0(i5), iK, iP0);
                        }
                        break;
                    case 38:
                        i2 = i3;
                        int iU = i.u((List) unsafe.getObject(aVar, j));
                        if (iU > 0) {
                            iP0 = cy30.c(iU, qwg.R0(i5), iU, iP0);
                        }
                        break;
                    case 39:
                        i2 = i3;
                        int i7 = i.i((List) unsafe.getObject(aVar, j));
                        if (i7 > 0) {
                            iP0 = cy30.c(i7, qwg.R0(i5), i7, iP0);
                        }
                        break;
                    case 40:
                        i2 = i3;
                        int iG2 = i.g((List) unsafe.getObject(aVar, j));
                        if (iG2 > 0) {
                            iP0 = cy30.c(iG2, qwg.R0(i5), iG2, iP0);
                        }
                        break;
                    case 41:
                        i2 = i3;
                        int iE2 = i.e((List) unsafe.getObject(aVar, j));
                        if (iE2 > 0) {
                            iP0 = cy30.c(iE2, qwg.R0(i5), iE2, iP0);
                        }
                        break;
                    case 42:
                        i2 = i3;
                        List list2 = (List) unsafe.getObject(aVar, j);
                        Class cls3 = i.a;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            iP0 = cy30.c(size2, qwg.R0(i5), size2, iP0);
                        }
                        break;
                    case 43:
                        i2 = i3;
                        int iS = i.s((List) unsafe.getObject(aVar, j));
                        if (iS > 0) {
                            iP0 = cy30.c(iS, qwg.R0(i5), iS, iP0);
                        }
                        break;
                    case 44:
                        i2 = i3;
                        int iC2 = i.c((List) unsafe.getObject(aVar, j));
                        if (iC2 > 0) {
                            iP0 = cy30.c(iC2, qwg.R0(i5), iC2, iP0);
                        }
                        break;
                    case 45:
                        i2 = i3;
                        int iE3 = i.e((List) unsafe.getObject(aVar, j));
                        if (iE3 > 0) {
                            iP0 = cy30.c(iE3, qwg.R0(i5), iE3, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        i2 = i3;
                        int iG3 = i.g((List) unsafe.getObject(aVar, j));
                        if (iG3 > 0) {
                            iP0 = cy30.c(iG3, qwg.R0(i5), iG3, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        i2 = i3;
                        int iN = i.n((List) unsafe.getObject(aVar, j));
                        if (iN > 0) {
                            iP0 = cy30.c(iN, qwg.R0(i5), iN, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        i2 = i3;
                        int iP = i.p((List) unsafe.getObject(aVar, j));
                        if (iP > 0) {
                            iP0 = cy30.c(iP, qwg.R0(i5), iP, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        List list3 = (List) elh1.j(j, aVar);
                        tm41 tm41VarN2 = n(i4);
                        Class cls4 = i.a;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iZ1 = 0;
                        } else {
                            int i8 = 0;
                            iZ1 = 0;
                            while (i8 < size3) {
                                iZ1 += qwg.z0(i5, (a) list3.get(i8), tm41VarN2);
                                i8++;
                                i3 = i3;
                            }
                        }
                        i2 = i3;
                        iP0 += iZ1;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        Object objJ3 = elh1.j(j, aVar);
                        Object objM = m(i4);
                        xng0Var2.getClass();
                        iA2 = xng0.a(i5, objJ3, objM);
                        iP0 += iA2;
                        i2 = i3;
                        break;
                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.t0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.y0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 53:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.D0(i5, w(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 54:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.U0(i5, w(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 55:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.B0(i5, v(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 56:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.x0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 57:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.w0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 58:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.p0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 59:
                        if (p(i5, i4, aVar)) {
                            Object objJ4 = elh1.j(j, aVar);
                            iP0 = (objJ4 instanceof ihc ? qwg.r0(i5, (ihc) objJ4) : qwg.P0(i5, (String) objJ4)) + iP0;
                        }
                        i2 = i3;
                        break;
                    case 60:
                        if (p(i5, i4, aVar)) {
                            Object objJ5 = elh1.j(j, aVar);
                            tm41 tm41VarN3 = n(i4);
                            Class cls5 = i.a;
                            iA2 = qwg.F0(i5, (a) objJ5, tm41VarN3);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 61:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.r0(i5, (ihc) elh1.j(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 62:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.S0(i5, v(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 63:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.u0(i5, v(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 64:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.J0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 65:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.K0(i5);
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 66:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.L0(i5, v(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 67:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.N0(i5, w(j, aVar));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    case 68:
                        if (p(i5, i4, aVar)) {
                            iA2 = qwg.z0(i5, (a) elh1.j(j, aVar), n(i4));
                            iP0 += iA2;
                        }
                        i2 = i3;
                        break;
                    default:
                        i2 = i3;
                        break;
                }
                i4 += 3;
                i3 = i2;
            }
            ((xih1) jVar2).getClass();
            iA = ((e) aVar).unknownFields.a();
        } else {
            int i9 = -1;
            int i10 = 0;
            iP0 = 0;
            int i11 = 0;
            while (i10 < iArr.length) {
                int iC3 = C(i10);
                int i12 = iArr[i10];
                int iB2 = B(iC3);
                if (iB2 <= 17) {
                    int i13 = iArr[i10 + 2];
                    int i14 = i13 & 1048575;
                    i = 1 << (i13 >>> 20);
                    jVar = jVar2;
                    xng0Var = xng0Var2;
                    if (i14 != i9) {
                        i11 = unsafe.getInt(aVar, i14);
                        i9 = i14;
                    }
                } else {
                    jVar = jVar2;
                    xng0Var = xng0Var2;
                    i = 0;
                }
                long j2 = iC3 & 1048575;
                switch (iB2) {
                    case 0:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.t0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 1:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.y0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 2:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.D0(i12, unsafe.getLong(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 3:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.U0(i12, unsafe.getLong(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 4:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.B0(i12, unsafe.getInt(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 5:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.x0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 6:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.w0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 7:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.p0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 8:
                        if ((i11 & i) != 0) {
                            Object object = unsafe.getObject(aVar, j2);
                            iR0 = object instanceof ihc ? qwg.r0(i12, (ihc) object) : qwg.P0(i12, (String) object);
                            iP0 = iR0 + iP0;
                        }
                        break;
                    case 9:
                        if ((i11 & i) != 0) {
                            Object object2 = unsafe.getObject(aVar, j2);
                            tm41 tm41VarN4 = n(i10);
                            Class cls6 = i.a;
                            iT0 = qwg.F0(i12, (a) object2, tm41VarN4);
                            iP0 += iT0;
                        }
                        break;
                    case 10:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.r0(i12, (ihc) unsafe.getObject(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 11:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.S0(i12, unsafe.getInt(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 12:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.u0(i12, unsafe.getInt(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 13:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.J0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 14:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.K0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 15:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.L0(i12, unsafe.getInt(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 16:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.N0(i12, unsafe.getLong(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 17:
                        if ((i11 & i) != 0) {
                            iT0 = qwg.z0(i12, (a) unsafe.getObject(aVar, j2), n(i10));
                            iP0 += iT0;
                        }
                        break;
                    case 18:
                        iT0 = i.f(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 19:
                        iT0 = i.d(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 20:
                        iT0 = i.j(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 21:
                        iT0 = i.t(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 22:
                        iT0 = i.h(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 23:
                        iT0 = i.f(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 24:
                        iT0 = i.d(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(aVar, j2);
                        Class cls7 = i.a;
                        int size4 = list4.size();
                        iP0 += size4 == 0 ? 0 : qwg.p0(i12) * size4;
                        break;
                    case 26:
                        iT0 = i.q(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 27:
                        iT0 = i.l(i12, (List) unsafe.getObject(aVar, j2), n(i10));
                        iP0 += iT0;
                        break;
                    case 28:
                        iT0 = i.a(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 29:
                        iT0 = i.r(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 30:
                        iT0 = i.b(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 31:
                        iT0 = i.d(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 32:
                        iT0 = i.f(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 33:
                        iT0 = i.m(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 34:
                        iT0 = i.o(i12, (List) unsafe.getObject(aVar, j2));
                        iP0 += iT0;
                        break;
                    case 35:
                        int iG4 = i.g((List) unsafe.getObject(aVar, j2));
                        if (iG4 > 0) {
                            iP0 = cy30.c(iG4, qwg.R0(i12), iG4, iP0);
                        }
                        break;
                    case 36:
                        int iE4 = i.e((List) unsafe.getObject(aVar, j2));
                        if (iE4 > 0) {
                            iP0 = cy30.c(iE4, qwg.R0(i12), iE4, iP0);
                        }
                        break;
                    case 37:
                        int iK2 = i.k((List) unsafe.getObject(aVar, j2));
                        if (iK2 > 0) {
                            iP0 = cy30.c(iK2, qwg.R0(i12), iK2, iP0);
                        }
                        break;
                    case 38:
                        int iU2 = i.u((List) unsafe.getObject(aVar, j2));
                        if (iU2 > 0) {
                            iP0 = cy30.c(iU2, qwg.R0(i12), iU2, iP0);
                        }
                        break;
                    case 39:
                        int i15 = i.i((List) unsafe.getObject(aVar, j2));
                        if (i15 > 0) {
                            iP0 = cy30.c(i15, qwg.R0(i12), i15, iP0);
                        }
                        break;
                    case 40:
                        int iG5 = i.g((List) unsafe.getObject(aVar, j2));
                        if (iG5 > 0) {
                            iP0 = cy30.c(iG5, qwg.R0(i12), iG5, iP0);
                        }
                        break;
                    case 41:
                        int iE5 = i.e((List) unsafe.getObject(aVar, j2));
                        if (iE5 > 0) {
                            iP0 = cy30.c(iE5, qwg.R0(i12), iE5, iP0);
                        }
                        break;
                    case 42:
                        List list5 = (List) unsafe.getObject(aVar, j2);
                        Class cls8 = i.a;
                        int size5 = list5.size();
                        if (size5 > 0) {
                            iP0 = cy30.c(size5, qwg.R0(i12), size5, iP0);
                        }
                        break;
                    case 43:
                        int iS2 = i.s((List) unsafe.getObject(aVar, j2));
                        if (iS2 > 0) {
                            iP0 = cy30.c(iS2, qwg.R0(i12), iS2, iP0);
                        }
                        break;
                    case 44:
                        int iC4 = i.c((List) unsafe.getObject(aVar, j2));
                        if (iC4 > 0) {
                            iP0 = cy30.c(iC4, qwg.R0(i12), iC4, iP0);
                        }
                        break;
                    case 45:
                        int iE6 = i.e((List) unsafe.getObject(aVar, j2));
                        if (iE6 > 0) {
                            iP0 = cy30.c(iE6, qwg.R0(i12), iE6, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        int iG6 = i.g((List) unsafe.getObject(aVar, j2));
                        if (iG6 > 0) {
                            iP0 = cy30.c(iG6, qwg.R0(i12), iG6, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        int iN2 = i.n((List) unsafe.getObject(aVar, j2));
                        if (iN2 > 0) {
                            iP0 = cy30.c(iN2, qwg.R0(i12), iN2, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        int iP2 = i.p((List) unsafe.getObject(aVar, j2));
                        if (iP2 > 0) {
                            iP0 = cy30.c(iP2, qwg.R0(i12), iP2, iP0);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        List list6 = (List) unsafe.getObject(aVar, j2);
                        tm41 tm41VarN5 = n(i10);
                        Class cls9 = i.a;
                        int size6 = list6.size();
                        if (size6 == 0) {
                            iZ0 = 0;
                        } else {
                            iZ0 = 0;
                            for (int i16 = 0; i16 < size6; i16++) {
                                iZ0 += qwg.z0(i12, (a) list6.get(i16), tm41VarN5);
                            }
                        }
                        iP0 += iZ0;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        Object object3 = unsafe.getObject(aVar, j2);
                        Object objM2 = m(i10);
                        xng0Var.getClass();
                        iT0 = xng0.a(i12, object3, objM2);
                        iP0 += iT0;
                        break;
                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.t0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.y0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 53:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.D0(i12, w(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 54:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.U0(i12, w(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 55:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.B0(i12, v(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 56:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.x0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 57:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.w0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 58:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.p0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 59:
                        if (p(i12, i10, aVar)) {
                            Object object4 = unsafe.getObject(aVar, j2);
                            iR0 = object4 instanceof ihc ? qwg.r0(i12, (ihc) object4) : qwg.P0(i12, (String) object4);
                            iP0 = iR0 + iP0;
                        }
                        break;
                    case 60:
                        if (p(i12, i10, aVar)) {
                            Object object5 = unsafe.getObject(aVar, j2);
                            tm41 tm41VarN6 = n(i10);
                            Class cls10 = i.a;
                            iT0 = qwg.F0(i12, (a) object5, tm41VarN6);
                            iP0 += iT0;
                        }
                        break;
                    case 61:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.r0(i12, (ihc) unsafe.getObject(aVar, j2));
                            iP0 += iT0;
                        }
                        break;
                    case 62:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.S0(i12, v(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 63:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.u0(i12, v(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 64:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.J0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 65:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.K0(i12);
                            iP0 += iT0;
                        }
                        break;
                    case 66:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.L0(i12, v(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 67:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.N0(i12, w(j2, aVar));
                            iP0 += iT0;
                        }
                        break;
                    case 68:
                        if (p(i12, i10, aVar)) {
                            iT0 = qwg.z0(i12, (a) unsafe.getObject(aVar, j2), n(i10));
                            iP0 += iT0;
                        }
                        break;
                }
                i10 += 3;
                jVar2 = jVar;
                xng0Var2 = xng0Var;
            }
            ((xih1) jVar2).getClass();
            iA = ((e) aVar).unknownFields.a();
        }
        return iA + iP0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // p.tm41
    public final void e(e eVar, e eVar2) {
        e eVar3;
        eVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                e eVar4 = eVar;
                if (this.g) {
                    return;
                }
                i.w(this.m, eVar4, eVar2);
                return;
            }
            int iC = C(i);
            long j = 1048575 & iC;
            int i2 = iArr[i];
            switch (B(iC)) {
                case 0:
                    if (!o(i, eVar2)) {
                        eVar3 = eVar;
                    } else {
                        alh1 alh1Var = elh1.d;
                        eVar3 = eVar;
                        alh1Var.i(eVar3, j, alh1Var.e(j, eVar2));
                        z(i, eVar3);
                    }
                    break;
                case 1:
                    if (o(i, eVar2)) {
                        alh1 alh1Var2 = elh1.d;
                        alh1Var2.j(eVar, j, alh1Var2.f(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 2:
                    if (o(i, eVar2)) {
                        elh1.o(eVar, j, elh1.i(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 3:
                    if (o(i, eVar2)) {
                        elh1.o(eVar, j, elh1.i(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 4:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 5:
                    if (o(i, eVar2)) {
                        elh1.o(eVar, j, elh1.i(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 6:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 7:
                    if (o(i, eVar2)) {
                        alh1 alh1Var3 = elh1.d;
                        alh1Var3.g(eVar, j, alh1Var3.b(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 8:
                    if (o(i, eVar2)) {
                        elh1.p(eVar, j, elh1.j(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 9:
                    r(eVar, eVar2, i);
                    eVar3 = eVar;
                    break;
                case 10:
                    if (o(i, eVar2)) {
                        elh1.p(eVar, j, elh1.j(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 11:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 12:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 13:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 14:
                    if (o(i, eVar2)) {
                        elh1.o(eVar, j, elh1.i(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 15:
                    if (o(i, eVar2)) {
                        elh1.n(eVar, elh1.h(j, eVar2), j);
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 16:
                    if (o(i, eVar2)) {
                        elh1.o(eVar, j, elh1.i(j, eVar2));
                        z(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 17:
                    r(eVar, eVar2, i);
                    eVar3 = eVar;
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
                    this.l.b(eVar, eVar2, j);
                    eVar3 = eVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    Class cls = i.a;
                    Object objJ = elh1.j(j, eVar);
                    Object objJ2 = elh1.j(j, eVar2);
                    this.n.getClass();
                    elh1.p(eVar, j, xng0.b(objJ, objJ2));
                    eVar3 = eVar;
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
                    if (p(i2, i, eVar2)) {
                        elh1.p(eVar, j, elh1.j(j, eVar2));
                        A(i2, i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 60:
                    s(eVar, eVar2, i);
                    eVar3 = eVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(i2, i, eVar2)) {
                        elh1.p(eVar, j, elh1.j(j, eVar2));
                        A(i2, i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 68:
                    s(eVar, eVar2, i);
                    eVar3 = eVar;
                    break;
                default:
                    eVar3 = eVar;
                    break;
            }
            i += 3;
            eVar = eVar3;
        }
    }

    @Override // p.tm41
    public final void f(Object obj, jc9 jc9Var) {
        jc9Var.getClass();
        if (!this.g) {
            D(obj, jc9Var);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iC = C(i);
            int i2 = iArr[i];
            switch (B(iC)) {
                case 0:
                    if (o(i, obj)) {
                        jc9Var.x(elh1.d.e(iC & 1048575, obj), i2);
                    }
                    break;
                case 1:
                    if (o(i, obj)) {
                        jc9Var.G(elh1.d.f(iC & 1048575, obj), i2);
                    }
                    break;
                case 2:
                    if (o(i, obj)) {
                        jc9Var.M(i2, elh1.i(iC & 1048575, obj));
                    }
                    break;
                case 3:
                    if (o(i, obj)) {
                        jc9Var.e0(i2, elh1.i(iC & 1048575, obj));
                    }
                    break;
                case 4:
                    if (o(i, obj)) {
                        jc9Var.K(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 5:
                    if (o(i, obj)) {
                        jc9Var.E(i2, elh1.i(iC & 1048575, obj));
                    }
                    break;
                case 6:
                    if (o(i, obj)) {
                        jc9Var.C(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 7:
                    if (o(i, obj)) {
                        jc9Var.t(i2, elh1.d.b(iC & 1048575, obj));
                    }
                    break;
                case 8:
                    if (o(i, obj)) {
                        E(i2, elh1.j(iC & 1048575, obj), jc9Var);
                    }
                    break;
                case 9:
                    if (o(i, obj)) {
                        jc9Var.P(i2, elh1.j(iC & 1048575, obj), n(i));
                    }
                    break;
                case 10:
                    if (o(i, obj)) {
                        jc9Var.v(i2, (ihc) elh1.j(iC & 1048575, obj));
                    }
                    break;
                case 11:
                    if (o(i, obj)) {
                        jc9Var.c0(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 12:
                    if (o(i, obj)) {
                        jc9Var.A(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 13:
                    if (o(i, obj)) {
                        jc9Var.R(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 14:
                    if (o(i, obj)) {
                        jc9Var.T(i2, elh1.i(iC & 1048575, obj));
                    }
                    break;
                case 15:
                    if (o(i, obj)) {
                        jc9Var.V(i2, elh1.h(iC & 1048575, obj));
                    }
                    break;
                case 16:
                    if (o(i, obj)) {
                        jc9Var.X(i2, elh1.i(iC & 1048575, obj));
                    }
                    break;
                case 17:
                    if (o(i, obj)) {
                        jc9Var.I(i2, elh1.j(iC & 1048575, obj), n(i));
                    }
                    break;
                case 18:
                    int i3 = iArr[i];
                    List list = (List) elh1.j(iC & 1048575, obj);
                    Class cls = i.a;
                    if (list != null && !list.isEmpty()) {
                        jc9Var.y(i3, list, false);
                    }
                    break;
                case 19:
                    int i4 = iArr[i];
                    List list2 = (List) elh1.j(iC & 1048575, obj);
                    Class cls2 = i.a;
                    if (list2 != null && !list2.isEmpty()) {
                        jc9Var.H(i4, list2, false);
                    }
                    break;
                case 20:
                    int i5 = iArr[i];
                    List list3 = (List) elh1.j(iC & 1048575, obj);
                    Class cls3 = i.a;
                    if (list3 != null && !list3.isEmpty()) {
                        jc9Var.N(i5, list3, false);
                    }
                    break;
                case 21:
                    int i6 = iArr[i];
                    List list4 = (List) elh1.j(iC & 1048575, obj);
                    Class cls4 = i.a;
                    if (list4 != null && !list4.isEmpty()) {
                        jc9Var.f0(i6, list4, false);
                    }
                    break;
                case 22:
                    int i7 = iArr[i];
                    List list5 = (List) elh1.j(iC & 1048575, obj);
                    Class cls5 = i.a;
                    if (list5 != null && !list5.isEmpty()) {
                        jc9Var.L(i7, list5, false);
                    }
                    break;
                case 23:
                    int i8 = iArr[i];
                    List list6 = (List) elh1.j(iC & 1048575, obj);
                    Class cls6 = i.a;
                    if (list6 != null && !list6.isEmpty()) {
                        jc9Var.F(i8, list6, false);
                    }
                    break;
                case 24:
                    int i9 = iArr[i];
                    List list7 = (List) elh1.j(iC & 1048575, obj);
                    Class cls7 = i.a;
                    if (list7 != null && !list7.isEmpty()) {
                        jc9Var.D(i9, list7, false);
                    }
                    break;
                case 25:
                    int i10 = iArr[i];
                    List list8 = (List) elh1.j(iC & 1048575, obj);
                    Class cls8 = i.a;
                    if (list8 != null && !list8.isEmpty()) {
                        jc9Var.u(i10, list8, false);
                    }
                    break;
                case 26:
                    int i11 = iArr[i];
                    List list9 = (List) elh1.j(iC & 1048575, obj);
                    Class cls9 = i.a;
                    if (list9 != null && !list9.isEmpty()) {
                        jc9Var.b0(i11, list9);
                    }
                    break;
                case 27:
                    int i12 = iArr[i];
                    List list10 = (List) elh1.j(iC & 1048575, obj);
                    tm41 tm41VarN = n(i);
                    Class cls10 = i.a;
                    if (list10 != null && !list10.isEmpty()) {
                        jc9Var.Q(i12, list10, tm41VarN);
                    }
                    break;
                case 28:
                    int i13 = iArr[i];
                    List list11 = (List) elh1.j(iC & 1048575, obj);
                    Class cls11 = i.a;
                    if (list11 != null && !list11.isEmpty()) {
                        jc9Var.w(i13, list11);
                    }
                    break;
                case 29:
                    int i14 = iArr[i];
                    List list12 = (List) elh1.j(iC & 1048575, obj);
                    Class cls12 = i.a;
                    if (list12 != null && !list12.isEmpty()) {
                        jc9Var.d0(i14, list12, false);
                    }
                    break;
                case 30:
                    int i15 = iArr[i];
                    List list13 = (List) elh1.j(iC & 1048575, obj);
                    Class cls13 = i.a;
                    if (list13 != null && !list13.isEmpty()) {
                        jc9Var.B(i15, list13, false);
                    }
                    break;
                case 31:
                    int i16 = iArr[i];
                    List list14 = (List) elh1.j(iC & 1048575, obj);
                    Class cls14 = i.a;
                    if (list14 != null && !list14.isEmpty()) {
                        jc9Var.S(i16, list14, false);
                    }
                    break;
                case 32:
                    int i17 = iArr[i];
                    List list15 = (List) elh1.j(iC & 1048575, obj);
                    Class cls15 = i.a;
                    if (list15 != null && !list15.isEmpty()) {
                        jc9Var.U(i17, list15, false);
                    }
                    break;
                case 33:
                    int i18 = iArr[i];
                    List list16 = (List) elh1.j(iC & 1048575, obj);
                    Class cls16 = i.a;
                    if (list16 != null && !list16.isEmpty()) {
                        jc9Var.W(i18, list16, false);
                    }
                    break;
                case 34:
                    int i19 = iArr[i];
                    List list17 = (List) elh1.j(iC & 1048575, obj);
                    Class cls17 = i.a;
                    if (list17 != null && !list17.isEmpty()) {
                        jc9Var.Y(i19, list17, false);
                    }
                    break;
                case 35:
                    int i20 = iArr[i];
                    List list18 = (List) elh1.j(iC & 1048575, obj);
                    Class cls18 = i.a;
                    if (list18 != null && !list18.isEmpty()) {
                        jc9Var.y(i20, list18, true);
                    }
                    break;
                case 36:
                    int i21 = iArr[i];
                    List list19 = (List) elh1.j(iC & 1048575, obj);
                    Class cls19 = i.a;
                    if (list19 != null && !list19.isEmpty()) {
                        jc9Var.H(i21, list19, true);
                    }
                    break;
                case 37:
                    int i22 = iArr[i];
                    List list20 = (List) elh1.j(iC & 1048575, obj);
                    Class cls20 = i.a;
                    if (list20 != null && !list20.isEmpty()) {
                        jc9Var.N(i22, list20, true);
                    }
                    break;
                case 38:
                    int i23 = iArr[i];
                    List list21 = (List) elh1.j(iC & 1048575, obj);
                    Class cls21 = i.a;
                    if (list21 != null && !list21.isEmpty()) {
                        jc9Var.f0(i23, list21, true);
                    }
                    break;
                case 39:
                    int i24 = iArr[i];
                    List list22 = (List) elh1.j(iC & 1048575, obj);
                    Class cls22 = i.a;
                    if (list22 != null && !list22.isEmpty()) {
                        jc9Var.L(i24, list22, true);
                    }
                    break;
                case 40:
                    int i25 = iArr[i];
                    List list23 = (List) elh1.j(iC & 1048575, obj);
                    Class cls23 = i.a;
                    if (list23 != null && !list23.isEmpty()) {
                        jc9Var.F(i25, list23, true);
                    }
                    break;
                case 41:
                    int i26 = iArr[i];
                    List list24 = (List) elh1.j(iC & 1048575, obj);
                    Class cls24 = i.a;
                    if (list24 != null && !list24.isEmpty()) {
                        jc9Var.D(i26, list24, true);
                    }
                    break;
                case 42:
                    int i27 = iArr[i];
                    List list25 = (List) elh1.j(iC & 1048575, obj);
                    Class cls25 = i.a;
                    if (list25 != null && !list25.isEmpty()) {
                        jc9Var.u(i27, list25, true);
                    }
                    break;
                case 43:
                    int i28 = iArr[i];
                    List list26 = (List) elh1.j(iC & 1048575, obj);
                    Class cls26 = i.a;
                    if (list26 != null && !list26.isEmpty()) {
                        jc9Var.d0(i28, list26, true);
                    }
                    break;
                case 44:
                    int i29 = iArr[i];
                    List list27 = (List) elh1.j(iC & 1048575, obj);
                    Class cls27 = i.a;
                    if (list27 != null && !list27.isEmpty()) {
                        jc9Var.B(i29, list27, true);
                    }
                    break;
                case 45:
                    int i30 = iArr[i];
                    List list28 = (List) elh1.j(iC & 1048575, obj);
                    Class cls28 = i.a;
                    if (list28 != null && !list28.isEmpty()) {
                        jc9Var.S(i30, list28, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    int i31 = iArr[i];
                    List list29 = (List) elh1.j(iC & 1048575, obj);
                    Class cls29 = i.a;
                    if (list29 != null && !list29.isEmpty()) {
                        jc9Var.U(i31, list29, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    int i32 = iArr[i];
                    List list30 = (List) elh1.j(iC & 1048575, obj);
                    Class cls30 = i.a;
                    if (list30 != null && !list30.isEmpty()) {
                        jc9Var.W(i32, list30, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    int i33 = iArr[i];
                    List list31 = (List) elh1.j(iC & 1048575, obj);
                    Class cls31 = i.a;
                    if (list31 != null && !list31.isEmpty()) {
                        jc9Var.Y(i33, list31, true);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    int i34 = iArr[i];
                    List list32 = (List) elh1.j(iC & 1048575, obj);
                    tm41 tm41VarN2 = n(i);
                    Class cls32 = i.a;
                    if (list32 != null && !list32.isEmpty()) {
                        jc9Var.J(i34, list32, tm41VarN2);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    Object objJ = elh1.j(iC & 1048575, obj);
                    if (objJ != null) {
                        Object objM = m(i);
                        this.n.getClass();
                        jc9Var.O(i2, ((eng0) objM).a, (rng0) objJ);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (p(i2, i, obj)) {
                        jc9Var.x(((Double) elh1.j(iC & 1048575, obj)).doubleValue(), i2);
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (p(i2, i, obj)) {
                        jc9Var.G(((Float) elh1.j(iC & 1048575, obj)).floatValue(), i2);
                    }
                    break;
                case 53:
                    if (p(i2, i, obj)) {
                        jc9Var.M(i2, w(iC & 1048575, obj));
                    }
                    break;
                case 54:
                    if (p(i2, i, obj)) {
                        jc9Var.e0(i2, w(iC & 1048575, obj));
                    }
                    break;
                case 55:
                    if (p(i2, i, obj)) {
                        jc9Var.K(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 56:
                    if (p(i2, i, obj)) {
                        jc9Var.E(i2, w(iC & 1048575, obj));
                    }
                    break;
                case 57:
                    if (p(i2, i, obj)) {
                        jc9Var.C(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 58:
                    if (p(i2, i, obj)) {
                        jc9Var.t(i2, ((Boolean) elh1.j(iC & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (p(i2, i, obj)) {
                        E(i2, elh1.j(iC & 1048575, obj), jc9Var);
                    }
                    break;
                case 60:
                    if (p(i2, i, obj)) {
                        jc9Var.P(i2, elh1.j(iC & 1048575, obj), n(i));
                    }
                    break;
                case 61:
                    if (p(i2, i, obj)) {
                        jc9Var.v(i2, (ihc) elh1.j(iC & 1048575, obj));
                    }
                    break;
                case 62:
                    if (p(i2, i, obj)) {
                        jc9Var.c0(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 63:
                    if (p(i2, i, obj)) {
                        jc9Var.A(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 64:
                    if (p(i2, i, obj)) {
                        jc9Var.R(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 65:
                    if (p(i2, i, obj)) {
                        jc9Var.T(i2, w(iC & 1048575, obj));
                    }
                    break;
                case 66:
                    if (p(i2, i, obj)) {
                        jc9Var.V(i2, v(iC & 1048575, obj));
                    }
                    break;
                case 67:
                    if (p(i2, i, obj)) {
                        jc9Var.X(i2, w(iC & 1048575, obj));
                    }
                    break;
                case 68:
                    if (p(i2, i, obj)) {
                        jc9Var.I(i2, elh1.j(iC & 1048575, obj), n(i));
                    }
                    break;
            }
        }
        ((xih1) this.m).getClass();
        ((e) obj).unknownFields.d(jc9Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.tm41
    public final int g(e eVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iC = C(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iC;
            int i6 = 1237;
            int iHashCode = 37;
            switch (B(iC)) {
                case 0:
                    i = i3 * 53;
                    iB = n290.b(Double.doubleToLongBits(elh1.d.e(j, eVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(elh1.d.f(j, eVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = n290.b(elh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = n290.b(elh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = n290.b(elh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zB = elh1.d.b(j, eVar);
                    Charset charset = n290.a;
                    if (zB) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) elh1.j(j, eVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objJ = elh1.j(j, eVar);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = elh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = n290.b(elh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = elh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = n290.b(elh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = elh1.j(j, eVar);
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
                    iB = elh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    i = i3 * 53;
                    iB = elh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(Double.doubleToLongBits(((Double) elh1.j(j, eVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) elh1.j(j, eVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(w(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(w(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(w(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (p(i5, i4, eVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) elh1.j(j, eVar)).booleanValue();
                        Charset charset2 = n290.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = ((String) elh1.j(j, eVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = elh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = elh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(w(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = v(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = n290.b(w(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (p(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = elh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((xih1) this.m).getClass();
        return eVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p.tm41
    public final boolean h(e eVar, e eVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iC = C(i);
                long j = iC & 1048575;
                switch (B(iC)) {
                    case 0:
                        if (!j(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var = elh1.d;
                            if (Double.doubleToLongBits(alh1Var.e(j, eVar)) != Double.doubleToLongBits(alh1Var.e(j, eVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var2 = elh1.d;
                            if (Float.floatToIntBits(alh1Var2.f(j, eVar)) != Float.floatToIntBits(alh1Var2.f(j, eVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(eVar, eVar2, i) || elh1.i(j, eVar) != elh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 3:
                        if (!j(eVar, eVar2, i) || elh1.i(j, eVar) != elh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 4:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 5:
                        if (!j(eVar, eVar2, i) || elh1.i(j, eVar) != elh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 6:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 7:
                        if (!j(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var3 = elh1.d;
                            if (alh1Var3.b(j, eVar) != alh1Var3.b(j, eVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(eVar, eVar2, i) || !i.x(elh1.j(j, eVar), elh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 9:
                        if (!j(eVar, eVar2, i) || !i.x(elh1.j(j, eVar), elh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 10:
                        if (!j(eVar, eVar2, i) || !i.x(elh1.j(j, eVar), elh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 11:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 12:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 13:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 14:
                        if (!j(eVar, eVar2, i) || elh1.i(j, eVar) != elh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 15:
                        if (!j(eVar, eVar2, i) || elh1.h(j, eVar) != elh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 16:
                        if (!j(eVar, eVar2, i) || elh1.i(j, eVar) != elh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 17:
                        if (!j(eVar, eVar2, i) || !i.x(elh1.j(j, eVar), elh1.j(j, eVar2))) {
                            zX = false;
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
                        zX = i.x(elh1.j(j, eVar), elh1.j(j, eVar2));
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        zX = i.x(elh1.j(j, eVar), elh1.j(j, eVar2));
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
                        if (elh1.h(j2, eVar) != elh1.h(j2, eVar2) || !i.x(elh1.j(j, eVar), elh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                xih1 xih1Var = (xih1) this.m;
                xih1Var.getClass();
                k kVar = eVar.unknownFields;
                xih1Var.getClass();
                if (kVar.equals(eVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p.tm41
    public final void i(java.lang.Object r19, p.ac01 r20, p.wz00 r21) {
        /*
            Method dump skipped, instruction units count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.g.i(java.lang.Object, p.ac01, p.wz00):void");
    }

    public final boolean j(e eVar, Object obj, int i) {
        return o(i, eVar) == o(i, obj);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (elh1.j(C(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        pze0.m(this.b[cy30.x(i, 3, 2, 1)]);
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final tm41 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        tm41 tm41Var = (tm41) objArr[i2];
        if (tm41Var != null) {
            return tm41Var;
        }
        tm41 tm41VarA = piy0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = tm41VarA;
        return tm41VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea A[RETURN] */
    public final boolean o(int i, Object obj) {
        if (!this.g) {
            int i2 = this.a[i + 2];
            if ((elh1.h(i2 & 1048575, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iC = C(i);
        long j = iC & 1048575;
        switch (B(iC)) {
            case 0:
                if (elh1.d.e(j, obj) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (elh1.d.f(j, obj) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (elh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (elh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (elh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return elh1.d.b(j, obj);
            case 8:
                Object objJ = elh1.j(j, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof ihc) {
                    return !ihc.c.equals(objJ);
                }
                bhn0.q();
                return false;
            case 9:
                if (elh1.j(j, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ihc.c.equals(elh1.j(j, obj));
            case 11:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (elh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (elh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (elh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (elh1.j(j, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final boolean p(int i, int i2, Object obj) {
        return elh1.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void q(Object obj, int i, Object obj2, wz00 wz00Var, ac01 ac01Var) {
        long jC = C(i) & 1048575;
        Object objJ = elh1.j(jC, obj);
        xng0 xng0Var = this.n;
        if (objJ == null) {
            xng0Var.getClass();
            objJ = rng0.b.b();
            elh1.p(obj, jC, objJ);
        } else {
            xng0Var.getClass();
            if (!((rng0) objJ).a) {
                Object objB = rng0.b.b();
                xng0.b(objB, objJ);
                elh1.p(obj, jC, objB);
                objJ = objB;
            }
        }
        xng0Var.getClass();
        ac01Var.L((rng0) objJ, ((eng0) obj2).a, wz00Var);
    }

    public final void r(e eVar, Object obj, int i) {
        long jC = C(i) & 1048575;
        if (o(i, obj)) {
            Object objJ = elh1.j(jC, eVar);
            Object objJ2 = elh1.j(jC, obj);
            if (objJ != null && objJ2 != null) {
                elh1.p(eVar, jC, n290.c(objJ, objJ2));
                z(i, eVar);
            } else if (objJ2 != null) {
                elh1.p(eVar, jC, objJ2);
                z(i, eVar);
            }
        }
    }

    public final void s(e eVar, Object obj, int i) {
        int iC = C(i);
        int i2 = this.a[i];
        long j = iC & 1048575;
        if (p(i2, i, obj)) {
            Object objJ = elh1.j(j, eVar);
            Object objJ2 = elh1.j(j, obj);
            if (objJ != null && objJ2 != null) {
                elh1.p(eVar, j, n290.c(objJ, objJ2));
                A(i2, i, eVar);
            } else if (objJ2 != null) {
                elh1.p(eVar, j, objJ2);
                A(i2, i, eVar);
            }
        }
    }

    public final void x(Object obj, int i, ac01 ac01Var) {
        if ((536870912 & i) != 0) {
            elh1.p(obj, i & 1048575, ac01Var.G());
        } else if (this.f) {
            elh1.p(obj, i & 1048575, ac01Var.y());
        } else {
            elh1.p(obj, i & 1048575, ac01Var.n());
        }
    }

    public final void z(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        elh1.n(obj, elh1.h(j, obj) | (1 << (i2 >>> 20)), j);
    }
}
