package com.google.crypto.tink.shaded.protobuf;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import p.a010;
import p.alh1;
import p.bhn0;
import p.clh1;
import p.cy30;
import p.g290;
import p.h9;
import p.k290;
import p.l1d;
import p.m36;
import p.miy0;
import p.ngc;
import p.ntc0;
import p.ohc;
import p.png0;
import p.pze0;
import p.qkh1;
import p.rm41;
import p.s9o0;
import p.soi1;
import p.tz00;
import p.u8;
import p.v8i0;
import p.vng0;
import p.wih1;
import p.wvz0;
import p.y220;
import p.y3o1;
import p.yb01;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g implements rm41 {
    public static final int[] o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f2p;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final u8 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final s9o0 k;
    public final ntc0 l;
    public final j m;
    public final vng0 n;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new qkh1((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f2p = unsafe;
    }

    public g(int[] iArr, Object[] objArr, int i, int i2, u8 u8Var, boolean z, int[] iArr2, int i3, int i4, s9o0 s9o0Var, ntc0 ntc0Var, j jVar, a010 a010Var, vng0 vng0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = u8Var instanceof e;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = s9o0Var;
        this.l = ntc0Var;
        this.m = jVar;
        this.e = u8Var;
        this.n = vng0Var;
    }

    public static Field D(Class cls, String str) {
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

    public static int H(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void J(int i, Object obj, d dVar) {
        if (obj instanceof String) {
            dVar.H(i, (String) obj);
        } else {
            dVar.d(i, (ohc) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0385  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e1  */
    public static g u(wvz0 wvz0Var, s9o0 s9o0Var, ntc0 ntc0Var, j jVar, a010 a010Var, vng0 vng0Var) {
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
        Field fieldD;
        int i24;
        char cCharAt9;
        int i25;
        int i26;
        Field fieldD2;
        Field fieldD3;
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
        if (!(wvz0Var instanceof wvz0)) {
            v8i0.k(wvz0Var);
            throw null;
        }
        int i33 = 0;
        boolean z2 = (wvz0Var.d & 1) != 1;
        String str = wvz0Var.b;
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
        Object[] objArr = wvz0Var.c;
        Class<?> cls = wvz0Var.a.getClass();
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
            Unsafe unsafe = f2p;
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
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr[i92] = fieldD2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                int i93 = i92 + 1;
                Object obj2 = objArr[i93];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr[i93] = fieldD3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
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
                Field fieldD4 = D(cls, (String) objArr[i3]);
                if (i82 == 9 || i82 == 17) {
                    z = z2;
                    iArr2 = iArr;
                    objArr2[cy30.x(i70, 3, 2, 1)] = fieldD4.getType();
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
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
                                fieldD = (Field) obj3;
                            } else {
                                fieldD = D(cls, (String) obj3);
                                objArr[i98] = fieldD;
                            }
                            i21 = iCharAt14 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
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
        return new g(iArr4, objArr2, i4, i5, wvz0Var.a, z2, iArr, i6, i67, s9o0Var, ntc0Var, jVar, a010Var, vng0Var);
    }

    public static long v(int i) {
        return i & 1048575;
    }

    public static int w(long j, Object obj) {
        return ((Integer) clh1.j(j, obj)).intValue();
    }

    public static long x(long j, Object obj) {
        return ((Long) clh1.j(j, obj)).longValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int A(java.lang.Object r26, byte[] r27, int r28, int r29, int r30, p.m36 r31) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.g.A(java.lang.Object, byte[], int, int, int, p.m36):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int B(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, m36 m36Var) {
        int iU;
        Unsafe unsafe = f2p;
        g290 g290VarH = (g290) unsafe.getObject(obj, j2);
        if (!((h9) g290VarH).a) {
            int size = g290VarH.size();
            g290VarH = g290VarH.h(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, g290VarH);
        }
        g290 g290Var = g290VarH;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    return y3o1.D(bArr, i, g290Var, m36Var);
                }
                if (i4 == 1) {
                    return y3o1.r(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 19:
            case 36:
                if (i4 == 2) {
                    return y3o1.G(bArr, i, g290Var, m36Var);
                }
                if (i4 == 5) {
                    return y3o1.x(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    return y3o1.K(bArr, i, g290Var, m36Var);
                }
                if (i4 == 0) {
                    return y3o1.W(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return y3o1.J(bArr, i, g290Var, m36Var);
                }
                if (i4 == 0) {
                    return y3o1.U(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                if (i4 == 2) {
                    return y3o1.F(bArr, i, g290Var, m36Var);
                }
                if (i4 == 1) {
                    return y3o1.v(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    return y3o1.E(bArr, i, g290Var, m36Var);
                }
                if (i4 == 5) {
                    return y3o1.t(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 25:
            case 42:
                if (i4 == 2) {
                    return y3o1.C(bArr, i, g290Var, m36Var);
                }
                if (i4 == 0) {
                    return y3o1.n(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 26:
                if (i4 == 2) {
                    return (j & 536870912) == 0 ? y3o1.O(i3, bArr, i, i2, g290Var, m36Var) : y3o1.P(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 27:
                if (i4 == 2) {
                    return y3o1.B(o(i5), i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 28:
                if (i4 == 2) {
                    return y3o1.p(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        iU = y3o1.U(i3, bArr, i, i2, g290Var, m36Var);
                    }
                    return i;
                }
                iU = y3o1.J(bArr, i, g290Var, m36Var);
                e eVar = (e) obj;
                k kVar = eVar.unknownFields;
                if (kVar == k.f) {
                    kVar = null;
                }
                m(i5);
                Class cls = i.a;
                if (kVar != null) {
                    eVar.unknownFields = kVar;
                }
                return iU;
            case 33:
            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                if (i4 == 2) {
                    return y3o1.H(bArr, i, g290Var, m36Var);
                }
                if (i4 == 0) {
                    return y3o1.L(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case 34:
            case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                if (i4 == 2) {
                    return y3o1.I(bArr, i, g290Var, m36Var);
                }
                if (i4 == 0) {
                    return y3o1.M(i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                if (i4 == 3) {
                    return y3o1.z(o(i5), i3, bArr, i, i2, g290Var, m36Var);
                }
                return i;
            default:
                return i;
        }
    }

    public final void C(Object obj, int i, yb01 yb01Var) {
        if ((536870912 & i) != 0) {
            clh1.p(obj, i & 1048575, yb01Var.G());
        } else if (this.f) {
            clh1.p(obj, i & 1048575, yb01Var.y());
        } else {
            clh1.p(obj, i & 1048575, yb01Var.n());
        }
    }

    public final void E(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        clh1.n(obj, clh1.h(j, obj) | (1 << (i2 >>> 20)), j);
    }

    public final void F(int i, int i2, Object obj) {
        clh1.n(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int G(int i, int i2) {
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

    public final int I(int i) {
        return this.a[i + 1];
    }

    @Override // p.rm41
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
            long jI = I(iArr[i2]) & 1048575;
            Object objJ = clh1.j(jI, obj);
            if (objJ != null) {
                this.n.getClass();
                ((png0) objJ).g();
                clh1.p(obj, jI, objJ);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        ((wih1) this.m).getClass();
        ((e) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    @Override // p.rm41
    public final boolean b(Object obj) {
        int i;
        int iH;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zP = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int I = I(i5);
            boolean z = this.g;
            if (z) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f2p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & I) == 0) {
                iH = H(I);
                if (iH != 9 || iH == 17) {
                    if (z) {
                        zP = p(i5, obj);
                    } else if ((i & i4) == 0) {
                        zP = false;
                    }
                    if (!zP || o(i5).b(clh1.j(I & 1048575, obj))) {
                        i3++;
                    }
                } else {
                    if (iH != 27) {
                        if (iH == 60 || iH == 68) {
                            if (!q(i6, i5, obj) || o(i5).b(clh1.j(I & 1048575, obj))) {
                            }
                        } else if (iH != 49) {
                            if (iH != 50) {
                                continue;
                            } else {
                                Object objJ = clh1.j(I & 1048575, obj);
                                this.n.getClass();
                                if (!((png0) objJ).isEmpty()) {
                                    pze0.m(n(i5));
                                    throw null;
                                }
                            }
                        }
                        i3++;
                    }
                    List list = (List) clh1.j(I & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        rm41 rm41VarO = o(i5);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (rm41VarO.b(list.get(i9))) {
                            }
                        }
                    }
                    i3++;
                }
            } else {
                if (z ? p(i5, obj) : (i4 & i) != 0) {
                    iH = H(I);
                    if (iH != 9) {
                    }
                    if (z) {
                        zP = p(i5, obj);
                    } else if ((i & i4) == 0) {
                        zP = false;
                    }
                    if (!zP) {
                        continue;
                    }
                    i3++;
                }
            }
            return false;
        }
    }

    @Override // p.rm41
    public final Object c() {
        this.k.getClass();
        return ((e) this.e).f(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p.rm41
    public final void d(Object obj, d dVar) throws Throwable {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        dVar.getClass();
        j jVar = this.m;
        Throwable th = null;
        vng0 vng0Var = this.n;
        int i2 = 1048575;
        boolean z4 = true;
        boolean z5 = this.g;
        int[] iArr = this.a;
        if (z5) {
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int I = I(i3);
                int i4 = iArr[i3];
                switch (H(I)) {
                    case 0:
                        if (p(i3, obj)) {
                            dVar.f(clh1.d.e(I & 1048575, obj), i4);
                        }
                        break;
                    case 1:
                        if (p(i3, obj)) {
                            dVar.o(clh1.d.f(I & 1048575, obj), i4);
                        }
                        break;
                    case 2:
                        if (p(i3, obj)) {
                            dVar.u(i4, clh1.i(I & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (p(i3, obj)) {
                            dVar.L(i4, clh1.i(I & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (p(i3, obj)) {
                            dVar.s(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (p(i3, obj)) {
                            dVar.m(i4, clh1.i(I & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (p(i3, obj)) {
                            dVar.k(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (p(i3, obj)) {
                            dVar.b(i4, clh1.d.b(I & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (p(i3, obj)) {
                            J(i4, clh1.j(I & 1048575, obj), dVar);
                        }
                        break;
                    case 9:
                        if (p(i3, obj)) {
                            dVar.w(i4, clh1.j(I & 1048575, obj), o(i3));
                        }
                        break;
                    case 10:
                        if (p(i3, obj)) {
                            dVar.d(i4, (ohc) clh1.j(I & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (p(i3, obj)) {
                            dVar.J(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (p(i3, obj)) {
                            dVar.i(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (p(i3, obj)) {
                            dVar.y(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (p(i3, obj)) {
                            dVar.A(i4, clh1.i(I & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (p(i3, obj)) {
                            dVar.C(i4, clh1.h(I & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (p(i3, obj)) {
                            dVar.E(i4, clh1.i(I & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (p(i3, obj)) {
                            dVar.q(i4, clh1.j(I & 1048575, obj), o(i3));
                        }
                        break;
                    case 18:
                        int i5 = iArr[i3];
                        List list = (List) clh1.j(I & 1048575, obj);
                        Class cls = i.a;
                        if (list != null && !list.isEmpty()) {
                            dVar.g(i5, list, false);
                        }
                        break;
                    case 19:
                        int i6 = iArr[i3];
                        List list2 = (List) clh1.j(I & 1048575, obj);
                        Class cls2 = i.a;
                        if (list2 != null && !list2.isEmpty()) {
                            dVar.p(i6, list2, false);
                        }
                        break;
                    case 20:
                        int i7 = iArr[i3];
                        List list3 = (List) clh1.j(I & 1048575, obj);
                        Class cls3 = i.a;
                        if (list3 != null && !list3.isEmpty()) {
                            dVar.v(i7, list3, false);
                        }
                        break;
                    case 21:
                        int i8 = iArr[i3];
                        List list4 = (List) clh1.j(I & 1048575, obj);
                        Class cls4 = i.a;
                        if (list4 != null && !list4.isEmpty()) {
                            dVar.M(i8, list4, false);
                        }
                        break;
                    case 22:
                        int i9 = iArr[i3];
                        List list5 = (List) clh1.j(I & 1048575, obj);
                        Class cls5 = i.a;
                        if (list5 != null && !list5.isEmpty()) {
                            dVar.t(i9, list5, false);
                        }
                        break;
                    case 23:
                        int i10 = iArr[i3];
                        List list6 = (List) clh1.j(I & 1048575, obj);
                        Class cls6 = i.a;
                        if (list6 != null && !list6.isEmpty()) {
                            dVar.n(i10, list6, false);
                        }
                        break;
                    case 24:
                        int i11 = iArr[i3];
                        List list7 = (List) clh1.j(I & 1048575, obj);
                        Class cls7 = i.a;
                        if (list7 != null && !list7.isEmpty()) {
                            dVar.l(i11, list7, false);
                        }
                        break;
                    case 25:
                        int i12 = iArr[i3];
                        List list8 = (List) clh1.j(I & 1048575, obj);
                        Class cls8 = i.a;
                        if (list8 != null && !list8.isEmpty()) {
                            dVar.c(i12, list8, false);
                        }
                        break;
                    case 26:
                        int i13 = iArr[i3];
                        List list9 = (List) clh1.j(I & 1048575, obj);
                        Class cls9 = i.a;
                        if (list9 != null && !list9.isEmpty()) {
                            dVar.I(i13, list9);
                        }
                        break;
                    case 27:
                        int i14 = iArr[i3];
                        List list10 = (List) clh1.j(I & 1048575, obj);
                        rm41 rm41VarO = o(i3);
                        Class cls10 = i.a;
                        if (list10 != null && !list10.isEmpty()) {
                            dVar.x(i14, list10, rm41VarO);
                        }
                        break;
                    case 28:
                        int i15 = iArr[i3];
                        List list11 = (List) clh1.j(I & 1048575, obj);
                        Class cls11 = i.a;
                        if (list11 != null && !list11.isEmpty()) {
                            dVar.e(i15, list11);
                        }
                        break;
                    case 29:
                        int i16 = iArr[i3];
                        List list12 = (List) clh1.j(I & 1048575, obj);
                        Class cls12 = i.a;
                        if (list12 != null && !list12.isEmpty()) {
                            dVar.K(i16, list12, false);
                        }
                        break;
                    case 30:
                        int i17 = iArr[i3];
                        List list13 = (List) clh1.j(I & 1048575, obj);
                        Class cls13 = i.a;
                        if (list13 != null && !list13.isEmpty()) {
                            dVar.j(i17, list13, false);
                        }
                        break;
                    case 31:
                        int i18 = iArr[i3];
                        List list14 = (List) clh1.j(I & 1048575, obj);
                        Class cls14 = i.a;
                        if (list14 != null && !list14.isEmpty()) {
                            dVar.z(i18, list14, false);
                        }
                        break;
                    case 32:
                        int i19 = iArr[i3];
                        List list15 = (List) clh1.j(I & 1048575, obj);
                        Class cls15 = i.a;
                        if (list15 != null && !list15.isEmpty()) {
                            dVar.B(i19, list15, false);
                        }
                        break;
                    case 33:
                        int i20 = iArr[i3];
                        List list16 = (List) clh1.j(I & 1048575, obj);
                        Class cls16 = i.a;
                        if (list16 != null && !list16.isEmpty()) {
                            dVar.D(i20, list16, false);
                        }
                        break;
                    case 34:
                        int i21 = iArr[i3];
                        List list17 = (List) clh1.j(I & 1048575, obj);
                        Class cls17 = i.a;
                        if (list17 != null && !list17.isEmpty()) {
                            dVar.F(i21, list17, false);
                        }
                        break;
                    case 35:
                        int i22 = iArr[i3];
                        List list18 = (List) clh1.j(I & 1048575, obj);
                        Class cls18 = i.a;
                        if (list18 != null && !list18.isEmpty()) {
                            dVar.g(i22, list18, true);
                        }
                        break;
                    case 36:
                        int i23 = iArr[i3];
                        List list19 = (List) clh1.j(I & 1048575, obj);
                        Class cls19 = i.a;
                        if (list19 != null && !list19.isEmpty()) {
                            dVar.p(i23, list19, true);
                        }
                        break;
                    case 37:
                        int i24 = iArr[i3];
                        List list20 = (List) clh1.j(I & 1048575, obj);
                        Class cls20 = i.a;
                        if (list20 != null && !list20.isEmpty()) {
                            dVar.v(i24, list20, true);
                        }
                        break;
                    case 38:
                        int i25 = iArr[i3];
                        List list21 = (List) clh1.j(I & 1048575, obj);
                        Class cls21 = i.a;
                        if (list21 != null && !list21.isEmpty()) {
                            dVar.M(i25, list21, true);
                        }
                        break;
                    case 39:
                        int i26 = iArr[i3];
                        List list22 = (List) clh1.j(I & 1048575, obj);
                        Class cls22 = i.a;
                        if (list22 != null && !list22.isEmpty()) {
                            dVar.t(i26, list22, true);
                        }
                        break;
                    case 40:
                        int i27 = iArr[i3];
                        List list23 = (List) clh1.j(I & 1048575, obj);
                        Class cls23 = i.a;
                        if (list23 != null && !list23.isEmpty()) {
                            dVar.n(i27, list23, true);
                        }
                        break;
                    case 41:
                        int i28 = iArr[i3];
                        List list24 = (List) clh1.j(I & 1048575, obj);
                        Class cls24 = i.a;
                        if (list24 != null && !list24.isEmpty()) {
                            dVar.l(i28, list24, true);
                        }
                        break;
                    case 42:
                        int i29 = iArr[i3];
                        List list25 = (List) clh1.j(I & 1048575, obj);
                        Class cls25 = i.a;
                        if (list25 != null && !list25.isEmpty()) {
                            dVar.c(i29, list25, true);
                        }
                        break;
                    case 43:
                        int i30 = iArr[i3];
                        List list26 = (List) clh1.j(I & 1048575, obj);
                        Class cls26 = i.a;
                        if (list26 != null && !list26.isEmpty()) {
                            dVar.K(i30, list26, true);
                        }
                        break;
                    case 44:
                        int i31 = iArr[i3];
                        List list27 = (List) clh1.j(I & 1048575, obj);
                        Class cls27 = i.a;
                        if (list27 != null && !list27.isEmpty()) {
                            dVar.j(i31, list27, true);
                        }
                        break;
                    case 45:
                        int i32 = iArr[i3];
                        List list28 = (List) clh1.j(I & 1048575, obj);
                        Class cls28 = i.a;
                        if (list28 != null && !list28.isEmpty()) {
                            dVar.z(i32, list28, true);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        int i33 = iArr[i3];
                        List list29 = (List) clh1.j(I & 1048575, obj);
                        Class cls29 = i.a;
                        if (list29 != null && !list29.isEmpty()) {
                            dVar.B(i33, list29, true);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        int i34 = iArr[i3];
                        List list30 = (List) clh1.j(I & 1048575, obj);
                        Class cls30 = i.a;
                        if (list30 != null && !list30.isEmpty()) {
                            dVar.D(i34, list30, true);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        int i35 = iArr[i3];
                        List list31 = (List) clh1.j(I & 1048575, obj);
                        Class cls31 = i.a;
                        if (list31 != null && !list31.isEmpty()) {
                            dVar.F(i35, list31, true);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        int i36 = iArr[i3];
                        List list32 = (List) clh1.j(I & 1048575, obj);
                        rm41 rm41VarO2 = o(i3);
                        Class cls32 = i.a;
                        if (list32 != null && !list32.isEmpty()) {
                            dVar.r(i36, list32, rm41VarO2);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        if (clh1.j(I & 1048575, obj) != null) {
                            Object objN = n(i3);
                            vng0Var.getClass();
                            pze0.m(objN);
                            throw null;
                        }
                        break;
                        break;
                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                        if (q(i4, i3, obj)) {
                            dVar.f(((Double) clh1.j(I & 1048575, obj)).doubleValue(), i4);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                        if (q(i4, i3, obj)) {
                            dVar.o(((Float) clh1.j(I & 1048575, obj)).floatValue(), i4);
                        }
                        break;
                    case 53:
                        if (q(i4, i3, obj)) {
                            dVar.u(i4, x(I & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (q(i4, i3, obj)) {
                            dVar.L(i4, x(I & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (q(i4, i3, obj)) {
                            dVar.s(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (q(i4, i3, obj)) {
                            dVar.m(i4, x(I & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (q(i4, i3, obj)) {
                            dVar.k(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (q(i4, i3, obj)) {
                            dVar.b(i4, ((Boolean) clh1.j(I & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (q(i4, i3, obj)) {
                            J(i4, clh1.j(I & 1048575, obj), dVar);
                        }
                        break;
                    case 60:
                        if (q(i4, i3, obj)) {
                            dVar.w(i4, clh1.j(I & 1048575, obj), o(i3));
                        }
                        break;
                    case 61:
                        if (q(i4, i3, obj)) {
                            dVar.d(i4, (ohc) clh1.j(I & 1048575, obj));
                        }
                        break;
                    case 62:
                        if (q(i4, i3, obj)) {
                            dVar.J(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (q(i4, i3, obj)) {
                            dVar.i(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (q(i4, i3, obj)) {
                            dVar.y(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (q(i4, i3, obj)) {
                            dVar.A(i4, x(I & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (q(i4, i3, obj)) {
                            dVar.C(i4, w(I & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (q(i4, i3, obj)) {
                            dVar.E(i4, x(I & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (q(i4, i3, obj)) {
                            dVar.q(i4, clh1.j(I & 1048575, obj), o(i3));
                        }
                        break;
                }
            }
            ((wih1) jVar).getClass();
            ((e) obj).unknownFields.d(dVar);
            return;
        }
        int length2 = iArr.length;
        int i37 = -1;
        int i38 = 0;
        int i39 = 0;
        while (i38 < length2) {
            int I2 = I(i38);
            Throwable th2 = th;
            int i40 = iArr[i38];
            int i41 = i2;
            int iH = H(I2);
            Unsafe unsafe = f2p;
            boolean z6 = z4;
            if (z5 || iH > 17) {
                i = 0;
            } else {
                int i42 = iArr[i38 + 2];
                int i43 = i42 & i41;
                if (i43 != i37) {
                    i39 = unsafe.getInt(obj, i43);
                    i37 = i43;
                }
                i = (z6 ? 1 : 0) << (i42 >>> 20);
            }
            long j = I2 & i41;
            switch (iH) {
                case 0:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.f(clh1.d.e(j, obj), i40);
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 1:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.o(clh1.d.f(j, obj), i40);
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 2:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.u(i40, unsafe.getLong(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 3:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.L(i40, unsafe.getLong(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 4:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.s(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 5:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.m(i40, unsafe.getLong(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 6:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.k(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 7:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.b(i40, clh1.d.b(j, obj));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 8:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        J(i40, unsafe.getObject(obj, j), dVar);
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 9:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.w(i40, unsafe.getObject(obj, j), o(i38));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 10:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.d(i40, (ohc) unsafe.getObject(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 11:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.J(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 12:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.i(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 13:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.y(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 14:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.A(i40, unsafe.getLong(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 15:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.C(i40, unsafe.getInt(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 16:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.E(i40, unsafe.getLong(obj, j));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 17:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    if ((i & i39) != 0) {
                        dVar.q(i40, unsafe.getObject(obj, j), o(i38));
                    }
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 18:
                    z = z6 ? 1 : 0;
                    int i44 = iArr[i38];
                    List list33 = (List) unsafe.getObject(obj, j);
                    Class cls33 = i.a;
                    if (list33 == null || list33.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = false;
                        dVar.g(i44, list33, false);
                    }
                    z2 = z3;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 19:
                    z = z6 ? 1 : 0;
                    int i45 = iArr[i38];
                    List list34 = (List) unsafe.getObject(obj, j);
                    Class cls34 = i.a;
                    if (list34 != null && !list34.isEmpty()) {
                        dVar.p(i45, list34, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 20:
                    z = z6 ? 1 : 0;
                    int i46 = iArr[i38];
                    List list35 = (List) unsafe.getObject(obj, j);
                    Class cls35 = i.a;
                    if (list35 != null && !list35.isEmpty()) {
                        dVar.v(i46, list35, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 21:
                    z = z6 ? 1 : 0;
                    int i47 = iArr[i38];
                    List list36 = (List) unsafe.getObject(obj, j);
                    Class cls36 = i.a;
                    if (list36 != null && !list36.isEmpty()) {
                        dVar.M(i47, list36, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 22:
                    z = z6 ? 1 : 0;
                    int i48 = iArr[i38];
                    List list37 = (List) unsafe.getObject(obj, j);
                    Class cls37 = i.a;
                    if (list37 != null && !list37.isEmpty()) {
                        dVar.t(i48, list37, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 23:
                    z = z6 ? 1 : 0;
                    int i49 = iArr[i38];
                    List list38 = (List) unsafe.getObject(obj, j);
                    Class cls38 = i.a;
                    if (list38 != null && !list38.isEmpty()) {
                        dVar.n(i49, list38, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 24:
                    z = z6 ? 1 : 0;
                    int i50 = iArr[i38];
                    List list39 = (List) unsafe.getObject(obj, j);
                    Class cls39 = i.a;
                    if (list39 != null && !list39.isEmpty()) {
                        dVar.l(i50, list39, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 25:
                    z = z6 ? 1 : 0;
                    int i51 = iArr[i38];
                    List list40 = (List) unsafe.getObject(obj, j);
                    Class cls40 = i.a;
                    if (list40 != null && !list40.isEmpty()) {
                        dVar.c(i51, list40, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 26:
                    z = z6 ? 1 : 0;
                    int i52 = iArr[i38];
                    List list41 = (List) unsafe.getObject(obj, j);
                    Class cls41 = i.a;
                    if (list41 != null && !list41.isEmpty()) {
                        dVar.I(i52, list41);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 27:
                    z = z6 ? 1 : 0;
                    int i53 = iArr[i38];
                    List list42 = (List) unsafe.getObject(obj, j);
                    rm41 rm41VarO3 = o(i38);
                    Class cls42 = i.a;
                    if (list42 != null && !list42.isEmpty()) {
                        dVar.x(i53, list42, rm41VarO3);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 28:
                    z = z6 ? 1 : 0;
                    int i54 = iArr[i38];
                    List list43 = (List) unsafe.getObject(obj, j);
                    Class cls43 = i.a;
                    if (list43 != null && !list43.isEmpty()) {
                        dVar.e(i54, list43);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 29:
                    z = z6 ? 1 : 0;
                    int i55 = iArr[i38];
                    List list44 = (List) unsafe.getObject(obj, j);
                    Class cls44 = i.a;
                    if (list44 != null && !list44.isEmpty()) {
                        dVar.K(i55, list44, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 30:
                    z = z6 ? 1 : 0;
                    int i56 = iArr[i38];
                    List list45 = (List) unsafe.getObject(obj, j);
                    Class cls45 = i.a;
                    if (list45 != null && !list45.isEmpty()) {
                        dVar.j(i56, list45, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 31:
                    z = z6 ? 1 : 0;
                    int i57 = iArr[i38];
                    List list46 = (List) unsafe.getObject(obj, j);
                    Class cls46 = i.a;
                    if (list46 != null && !list46.isEmpty()) {
                        dVar.z(i57, list46, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 32:
                    z = z6 ? 1 : 0;
                    int i58 = iArr[i38];
                    List list47 = (List) unsafe.getObject(obj, j);
                    Class cls47 = i.a;
                    if (list47 != null && !list47.isEmpty()) {
                        dVar.B(i58, list47, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 33:
                    z = z6 ? 1 : 0;
                    int i59 = iArr[i38];
                    List list48 = (List) unsafe.getObject(obj, j);
                    Class cls48 = i.a;
                    if (list48 != null && !list48.isEmpty()) {
                        dVar.D(i59, list48, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 34:
                    z = z6 ? 1 : 0;
                    int i60 = iArr[i38];
                    List list49 = (List) unsafe.getObject(obj, j);
                    Class cls49 = i.a;
                    if (list49 != null && !list49.isEmpty()) {
                        dVar.F(i60, list49, false);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 35:
                    int i61 = iArr[i38];
                    List list50 = (List) unsafe.getObject(obj, j);
                    Class cls50 = i.a;
                    if (list50 == null || list50.isEmpty()) {
                        z = true;
                    } else {
                        z = true;
                        dVar.g(i61, list50, true);
                    }
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 36:
                    int i62 = iArr[i38];
                    List list51 = (List) unsafe.getObject(obj, j);
                    Class cls51 = i.a;
                    if (list51 != null && !list51.isEmpty()) {
                        dVar.p(i62, list51, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 37:
                    int i63 = iArr[i38];
                    List list52 = (List) unsafe.getObject(obj, j);
                    Class cls52 = i.a;
                    if (list52 != null && !list52.isEmpty()) {
                        dVar.v(i63, list52, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 38:
                    int i64 = iArr[i38];
                    List list53 = (List) unsafe.getObject(obj, j);
                    Class cls53 = i.a;
                    if (list53 != null && !list53.isEmpty()) {
                        dVar.M(i64, list53, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 39:
                    int i65 = iArr[i38];
                    List list54 = (List) unsafe.getObject(obj, j);
                    Class cls54 = i.a;
                    if (list54 != null && !list54.isEmpty()) {
                        dVar.t(i65, list54, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 40:
                    int i66 = iArr[i38];
                    List list55 = (List) unsafe.getObject(obj, j);
                    Class cls55 = i.a;
                    if (list55 != null && !list55.isEmpty()) {
                        dVar.n(i66, list55, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 41:
                    int i67 = iArr[i38];
                    List list56 = (List) unsafe.getObject(obj, j);
                    Class cls56 = i.a;
                    if (list56 != null && !list56.isEmpty()) {
                        dVar.l(i67, list56, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 42:
                    int i68 = iArr[i38];
                    List list57 = (List) unsafe.getObject(obj, j);
                    Class cls57 = i.a;
                    if (list57 != null && !list57.isEmpty()) {
                        dVar.c(i68, list57, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 43:
                    int i69 = iArr[i38];
                    List list58 = (List) unsafe.getObject(obj, j);
                    Class cls58 = i.a;
                    if (list58 != null && !list58.isEmpty()) {
                        dVar.K(i69, list58, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 44:
                    int i70 = iArr[i38];
                    List list59 = (List) unsafe.getObject(obj, j);
                    Class cls59 = i.a;
                    if (list59 != null && !list59.isEmpty()) {
                        dVar.j(i70, list59, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 45:
                    int i71 = iArr[i38];
                    List list60 = (List) unsafe.getObject(obj, j);
                    Class cls60 = i.a;
                    if (list60 != null && !list60.isEmpty()) {
                        dVar.z(i71, list60, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    int i72 = iArr[i38];
                    List list61 = (List) unsafe.getObject(obj, j);
                    Class cls61 = i.a;
                    if (list61 != null && !list61.isEmpty()) {
                        dVar.B(i72, list61, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    int i73 = iArr[i38];
                    List list62 = (List) unsafe.getObject(obj, j);
                    Class cls62 = i.a;
                    if (list62 != null && !list62.isEmpty()) {
                        dVar.D(i73, list62, true);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    int i74 = iArr[i38];
                    List list63 = (List) unsafe.getObject(obj, j);
                    Class cls63 = i.a;
                    if (list63 != null && !list63.isEmpty()) {
                        dVar.F(i74, list63, z6);
                    }
                    z = true;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    int i75 = iArr[i38];
                    List list64 = (List) unsafe.getObject(obj, j);
                    rm41 rm41VarO4 = o(i38);
                    Class cls64 = i.a;
                    if (list64 != null && !list64.isEmpty()) {
                        dVar.r(i75, list64, rm41VarO4);
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objN2 = n(i38);
                        vng0Var.getClass();
                        pze0.m(objN2);
                        throw th2;
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (q(i40, i38, obj)) {
                        dVar.f(((Double) clh1.j(j, obj)).doubleValue(), i40);
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (q(i40, i38, obj)) {
                        dVar.o(((Float) clh1.j(j, obj)).floatValue(), i40);
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 53:
                    if (q(i40, i38, obj)) {
                        dVar.u(i40, x(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 54:
                    if (q(i40, i38, obj)) {
                        dVar.L(i40, x(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 55:
                    if (q(i40, i38, obj)) {
                        dVar.s(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 56:
                    if (q(i40, i38, obj)) {
                        dVar.m(i40, x(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 57:
                    if (q(i40, i38, obj)) {
                        dVar.k(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 58:
                    if (q(i40, i38, obj)) {
                        dVar.b(i40, ((Boolean) clh1.j(j, obj)).booleanValue());
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 59:
                    if (q(i40, i38, obj)) {
                        J(i40, unsafe.getObject(obj, j), dVar);
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 60:
                    if (q(i40, i38, obj)) {
                        dVar.w(i40, unsafe.getObject(obj, j), o(i38));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 61:
                    if (q(i40, i38, obj)) {
                        dVar.d(i40, (ohc) unsafe.getObject(obj, j));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 62:
                    if (q(i40, i38, obj)) {
                        dVar.J(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 63:
                    if (q(i40, i38, obj)) {
                        dVar.i(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 64:
                    if (q(i40, i38, obj)) {
                        dVar.y(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 65:
                    if (q(i40, i38, obj)) {
                        dVar.A(i40, x(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 66:
                    if (q(i40, i38, obj)) {
                        dVar.C(i40, w(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 67:
                    if (q(i40, i38, obj)) {
                        dVar.E(i40, x(j, obj));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                case 68:
                    if (q(i40, i38, obj)) {
                        dVar.q(i40, unsafe.getObject(obj, j), o(i38));
                    }
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
                default:
                    z = z6 ? 1 : 0;
                    z2 = false;
                    i38 += 3;
                    z4 = z;
                    th = th2;
                    i2 = i41;
                    jVar = jVar;
                    break;
            }
        }
        ((wih1) jVar).getClass();
        ((e) obj).unknownFields.d(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p.rm41
    public final boolean e(e eVar, e eVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int I = I(i);
                long j = I & 1048575;
                switch (H(I)) {
                    case 0:
                        if (!k(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var = clh1.d;
                            if (Double.doubleToLongBits(alh1Var.e(j, eVar)) != Double.doubleToLongBits(alh1Var.e(j, eVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var2 = clh1.d;
                            if (Float.floatToIntBits(alh1Var2.f(j, eVar)) != Float.floatToIntBits(alh1Var2.f(j, eVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(eVar, eVar2, i) || clh1.i(j, eVar) != clh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 3:
                        if (!k(eVar, eVar2, i) || clh1.i(j, eVar) != clh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 4:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 5:
                        if (!k(eVar, eVar2, i) || clh1.i(j, eVar) != clh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 6:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 7:
                        if (!k(eVar, eVar2, i)) {
                            zX = false;
                        } else {
                            alh1 alh1Var3 = clh1.d;
                            if (alh1Var3.b(j, eVar) != alh1Var3.b(j, eVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(eVar, eVar2, i) || !i.x(clh1.j(j, eVar), clh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 9:
                        if (!k(eVar, eVar2, i) || !i.x(clh1.j(j, eVar), clh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 10:
                        if (!k(eVar, eVar2, i) || !i.x(clh1.j(j, eVar), clh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                    case 11:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 12:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 13:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 14:
                        if (!k(eVar, eVar2, i) || clh1.i(j, eVar) != clh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 15:
                        if (!k(eVar, eVar2, i) || clh1.h(j, eVar) != clh1.h(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 16:
                        if (!k(eVar, eVar2, i) || clh1.i(j, eVar) != clh1.i(j, eVar2)) {
                            zX = false;
                        }
                        break;
                    case 17:
                        if (!k(eVar, eVar2, i) || !i.x(clh1.j(j, eVar), clh1.j(j, eVar2))) {
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
                        zX = i.x(clh1.j(j, eVar), clh1.j(j, eVar2));
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        zX = i.x(clh1.j(j, eVar), clh1.j(j, eVar2));
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
                        if (clh1.h(j2, eVar) != clh1.h(j2, eVar2) || !i.x(clh1.j(j, eVar), clh1.j(j, eVar2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                wih1 wih1Var = (wih1) this.m;
                wih1Var.getClass();
                k kVar = eVar.unknownFields;
                wih1Var.getClass();
                if (kVar.equals(eVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.rm41
    public final int f(e eVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int I = I(i4);
            int i5 = iArr[i4];
            long j = 1048575 & I;
            int i6 = 1237;
            int iHashCode = 37;
            switch (H(I)) {
                case 0:
                    i = i3 * 53;
                    iB = k290.b(Double.doubleToLongBits(clh1.d.e(j, eVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(clh1.d.f(j, eVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = k290.b(clh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = k290.b(clh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = k290.b(clh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zB = clh1.d.b(j, eVar);
                    Charset charset = k290.a;
                    if (zB) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) clh1.j(j, eVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objJ = clh1.j(j, eVar);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = clh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = k290.b(clh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = clh1.h(j, eVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = k290.b(clh1.i(j, eVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = clh1.j(j, eVar);
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
                    iB = clh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    i = i3 * 53;
                    iB = clh1.j(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(Double.doubleToLongBits(((Double) clh1.j(j, eVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) clh1.j(j, eVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(x(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(x(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(x(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, eVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) clh1.j(j, eVar)).booleanValue();
                        Charset charset2 = k290.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = ((String) clh1.j(j, eVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = clh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = clh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(x(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = w(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = k290.b(x(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = clh1.j(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((wih1) this.m).getClass();
        return eVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:164:0x049a A[PHI: r2
      0x049a: PHI (r2v18 sun.misc.Unsafe) = (r2v3 sun.misc.Unsafe), (r2v19 sun.misc.Unsafe) binds: [B:211:0x05d6, B:163:0x0498] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x04aa A[PHI: r2
      0x04aa: PHI (r2v16 sun.misc.Unsafe) = (r2v4 sun.misc.Unsafe), (r2v17 sun.misc.Unsafe) binds: [B:208:0x05cc, B:166:0x04a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x063f A[PHI: r9
      0x063f: PHI (r9v2 int) = 
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v13 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v14 int)
      (r9v1 int)
      (r9v15 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v18 int)
      (r9v1 int)
      (r9v19 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v23 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v24 int)
      (r9v1 int)
     binds: [B:226:0x0626, B:389:0x0a1c, B:386:0x0a0b, B:383:0x09fa, B:380:0x09f5, B:377:0x09f0, B:374:0x09da, B:371:0x09c2, B:368:0x09af, B:359:0x0957, B:344:0x08c6, B:341:0x08b4, B:338:0x08a2, B:335:0x0890, B:332:0x087e, B:329:0x086c, B:326:0x085b, B:323:0x084a, B:320:0x0837, B:317:0x0826, B:314:0x0815, B:311:0x0804, B:308:0x07f3, B:306:0x07e3, B:304:0x07dd, B:302:0x07d0, B:295:0x0798, B:293:0x0794, B:290:0x078c, B:287:0x0778, B:284:0x0764, B:281:0x0750, B:278:0x0744, B:275:0x0738, B:272:0x072a, B:265:0x06fe, B:269:0x0716, B:259:0x06d1, B:263:0x06f4, B:256:0x06bf, B:253:0x06ac, B:250:0x0699, B:247:0x068b, B:245:0x0680, B:244:0x067e, B:240:0x0665, B:236:0x064a, B:231:0x063e, B:229:0x062e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0680  */
    /* JADX WARN: Code duplicated, block: B:248:0x068d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // p.rm41
    public final int g(u8 u8Var) {
        int i;
        char c;
        byte b;
        char c2;
        int iH;
        int iJ;
        int iF;
        int iG;
        int iA;
        int iH2;
        int i2;
        int iH3;
        int iJ2;
        int iG2;
        int iH4;
        int iE;
        int iG3;
        Unsafe unsafe;
        int iH5;
        int iJ3;
        int iD;
        int iG4;
        int iH6;
        int iE2;
        int iH7;
        int iJ4;
        int iH8;
        int iF2;
        int iD2;
        int iG5;
        j jVar = this.m;
        vng0 vng0Var = this.n;
        Unsafe unsafe2 = f2p;
        int i3 = 1;
        boolean z = this.g;
        int[] iArr = this.a;
        if (z) {
            int i4 = 0;
            int iB = 0;
            while (i4 < iArr.length) {
                int I = I(i4);
                int iH9 = H(I);
                int i5 = iArr[i4];
                Unsafe unsafe3 = unsafe2;
                long j = I & 1048575;
                if (iH9 >= y220.b.a && iH9 <= y220.c.a) {
                    int i6 = iArr[i4 + 2];
                }
                switch (iH9) {
                    case 0:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iB = cy30.b(i5, 8, iB);
                        }
                        break;
                    case 1:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iB = cy30.b(i5, 4, iB);
                        }
                        break;
                    case 2:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            long jI = clh1.i(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.j(jI);
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 3:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            long jI2 = clh1.i(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.j(jI2);
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 4:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            int iH10 = clh1.h(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.f(iH10);
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 5:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iD = c.d(i5);
                            iB += iD;
                        }
                        break;
                    case 6:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iD = c.c(i5);
                            iB += iD;
                        }
                        break;
                    case 7:
                        int i7 = i3;
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iB = cy30.b(i5, i7, iB);
                        }
                        break;
                    case 8:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            Object objJ = clh1.j(j, u8Var);
                            if (objJ instanceof ohc) {
                                int iH11 = c.h(i5);
                                int size = ((ohc) objJ).size();
                                iB = cy30.w(size, size, iH11, iB);
                            } else {
                                iB = c.g((String) objJ) + c.h(i5) + iB;
                            }
                        }
                        break;
                    case 9:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            Object objJ2 = clh1.j(j, u8Var);
                            rm41 rm41VarO = o(i4);
                            Class cls = i.a;
                            u8 u8Var2 = (u8) objJ2;
                            int iH12 = c.h(i5);
                            u8Var2.getClass();
                            e eVar = (e) u8Var2;
                            int iG6 = eVar.memoizedSerializedSize;
                            if (iG6 == -1) {
                                iG6 = rm41VarO.g(u8Var2);
                                eVar.memoizedSerializedSize = iG6;
                            }
                            iB = cy30.w(iG6, iG6, iH12, iB);
                        }
                        break;
                    case 10:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iD = c.a(i5, (ohc) clh1.j(j, u8Var));
                            iB += iD;
                        }
                        break;
                    case 11:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            int iH13 = clh1.h(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.i(iH13);
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 12:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            int iH14 = clh1.h(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.f(iH14);
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 13:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iB = cy30.b(i5, 4, iB);
                        }
                        break;
                    case 14:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iB = cy30.b(i5, 8, iB);
                        }
                        break;
                    case 15:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            int iH15 = clh1.h(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.i((iH15 >> 31) ^ (iH15 << 1));
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 16:
                        int i8 = i3;
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            long jI3 = clh1.i(j, u8Var);
                            iH5 = c.h(i5);
                            iJ3 = c.j((jI3 << i8) ^ (jI3 >> 63));
                            iB += iJ3 + iH5;
                        }
                        break;
                    case 17:
                        unsafe = unsafe3;
                        if (p(i4, u8Var)) {
                            iD = c.e(i5, (u8) clh1.j(j, u8Var), o(i4));
                            iB += iD;
                        }
                        break;
                    case 18:
                        unsafe = unsafe3;
                        iD = i.f(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 19:
                        unsafe = unsafe3;
                        iD = i.d(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 20:
                        unsafe = unsafe3;
                        iD = i.j(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 21:
                        unsafe = unsafe3;
                        iD = i.t(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 22:
                        unsafe = unsafe3;
                        iD = i.h(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 23:
                        unsafe = unsafe3;
                        iD = i.f(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 24:
                        unsafe = unsafe3;
                        iD = i.d(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 25:
                        unsafe = unsafe3;
                        List list = (List) clh1.j(j, u8Var);
                        Class cls2 = i.a;
                        int size2 = list.size();
                        iD = size2 == 0 ? 0 : (c.h(i5) + 1) * size2;
                        iB += iD;
                        break;
                    case 26:
                        unsafe = unsafe3;
                        iD = i.q(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 27:
                        unsafe = unsafe3;
                        iD = i.l(i5, (List) clh1.j(j, u8Var), o(i4));
                        iB += iD;
                        break;
                    case 28:
                        unsafe = unsafe3;
                        iD = i.a(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 29:
                        unsafe = unsafe3;
                        iD = i.r(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 30:
                        unsafe = unsafe3;
                        iD = i.b(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 31:
                        unsafe = unsafe3;
                        iD = i.d(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 32:
                        unsafe = unsafe3;
                        iD = i.f(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 33:
                        unsafe = unsafe3;
                        iD = i.m(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 34:
                        unsafe = unsafe3;
                        iD = i.o(i5, (List) clh1.j(j, u8Var));
                        iB += iD;
                        break;
                    case 35:
                        unsafe = unsafe3;
                        iG4 = i.g((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 36:
                        unsafe = unsafe3;
                        iG4 = i.e((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 37:
                        unsafe = unsafe3;
                        iG4 = i.k((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 38:
                        unsafe = unsafe3;
                        iG4 = i.u((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 39:
                        unsafe = unsafe3;
                        iG4 = i.i((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 40:
                        unsafe = unsafe3;
                        iG4 = i.g((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 41:
                        unsafe = unsafe3;
                        iG4 = i.e((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 42:
                        unsafe = unsafe3;
                        List list2 = (List) unsafe.getObject(u8Var, j);
                        Class cls3 = i.a;
                        iG4 = list2.size();
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 43:
                        unsafe = unsafe3;
                        iG4 = i.s((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 44:
                        unsafe = unsafe3;
                        iG4 = i.c((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case 45:
                        unsafe = unsafe3;
                        iG4 = i.e((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        unsafe = unsafe3;
                        iG4 = i.g((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        unsafe = unsafe3;
                        iG4 = i.n((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        unsafe = unsafe3;
                        iG4 = i.p((List) unsafe.getObject(u8Var, j));
                        if (iG4 > 0) {
                            iH6 = c.h(i5);
                            iB = cy30.w(iG4, iH6, iG4, iB);
                        }
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        List list3 = (List) clh1.j(j, u8Var);
                        rm41 rm41VarO2 = o(i4);
                        Class cls4 = i.a;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iE2 = 0;
                        } else {
                            int i9 = 0;
                            iE2 = 0;
                            while (i9 < size3) {
                                iE2 = c.e(i5, (u8) list3.get(i9), rm41VarO2) + iE2;
                                i9++;
                                i3 = i3;
                            }
                        }
                        iB = iE2 + iB;
                        unsafe = unsafe3;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        Object objJ3 = clh1.j(j, u8Var);
                        Object objN = n(i4);
                        vng0Var.getClass();
                        vng0.a(objJ3, objN);
                        unsafe = unsafe3;
                        break;
                    case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                        if (q(i5, i4, u8Var)) {
                            iB = cy30.b(i5, 8, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                        if (q(i5, i4, u8Var)) {
                            iB = cy30.b(i5, 4, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case 53:
                        if (q(i5, i4, u8Var)) {
                            long jX = x(j, u8Var);
                            iH7 = c.h(i5);
                            iJ4 = c.j(jX);
                            iB += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 54:
                        if (q(i5, i4, u8Var)) {
                            long jX2 = x(j, u8Var);
                            iH7 = c.h(i5);
                            iJ4 = c.j(jX2);
                            iB += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 55:
                        if (q(i5, i4, u8Var)) {
                            int iW = w(j, u8Var);
                            iH8 = c.h(i5);
                            iF2 = c.f(iW);
                            iD2 = iF2 + iH8;
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 56:
                        if (q(i5, i4, u8Var)) {
                            iD2 = c.d(i5);
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 57:
                        if (q(i5, i4, u8Var)) {
                            iD2 = c.c(i5);
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 58:
                        if (q(i5, i4, u8Var)) {
                            iB = cy30.b(i5, i3, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case 59:
                        if (q(i5, i4, u8Var)) {
                            Object objJ4 = clh1.j(j, u8Var);
                            if (objJ4 instanceof ohc) {
                                int iH16 = c.h(i5);
                                int size4 = ((ohc) objJ4).size();
                                iG5 = cy30.w(size4, size4, iH16, iB);
                            } else {
                                iG5 = c.g((String) objJ4) + c.h(i5) + iB;
                            }
                            iB = iG5;
                        }
                        unsafe = unsafe3;
                        break;
                    case 60:
                        if (q(i5, i4, u8Var)) {
                            Object objJ5 = clh1.j(j, u8Var);
                            rm41 rm41VarO3 = o(i4);
                            Class cls5 = i.a;
                            u8 u8Var3 = (u8) objJ5;
                            int iH17 = c.h(i5);
                            u8Var3.getClass();
                            e eVar2 = (e) u8Var3;
                            int iG7 = eVar2.memoizedSerializedSize;
                            if (iG7 == -1) {
                                iG7 = rm41VarO3.g(u8Var3);
                                eVar2.memoizedSerializedSize = iG7;
                            }
                            iB = cy30.w(iG7, iG7, iH17, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case 61:
                        if (q(i5, i4, u8Var)) {
                            iD2 = c.a(i5, (ohc) clh1.j(j, u8Var));
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 62:
                        if (q(i5, i4, u8Var)) {
                            int iW2 = w(j, u8Var);
                            iH8 = c.h(i5);
                            iF2 = c.i(iW2);
                            iD2 = iF2 + iH8;
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 63:
                        if (q(i5, i4, u8Var)) {
                            int iW3 = w(j, u8Var);
                            iH8 = c.h(i5);
                            iF2 = c.f(iW3);
                            iD2 = iF2 + iH8;
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 64:
                        if (q(i5, i4, u8Var)) {
                            iB = cy30.b(i5, 4, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case 65:
                        if (q(i5, i4, u8Var)) {
                            iB = cy30.b(i5, 8, iB);
                        }
                        unsafe = unsafe3;
                        break;
                    case 66:
                        if (q(i5, i4, u8Var)) {
                            int iW4 = w(j, u8Var);
                            iH8 = c.h(i5);
                            iF2 = c.i((iW4 >> 31) ^ (iW4 << 1));
                            iD2 = iF2 + iH8;
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 67:
                        if (q(i5, i4, u8Var)) {
                            long jX3 = x(j, u8Var);
                            iH7 = c.h(i5);
                            iJ4 = c.j((jX3 << i3) ^ (jX3 >> 63));
                            iB += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 68:
                        if (q(i5, i4, u8Var)) {
                            iD2 = c.e(i5, (u8) clh1.j(j, u8Var), o(i4));
                            iB += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    default:
                        unsafe = unsafe3;
                        break;
                }
                i4 += 3;
                unsafe2 = unsafe;
                i3 = 1;
            }
            ((wih1) jVar).getClass();
            return ((e) u8Var).unknownFields.a() + iB;
        }
        int i10 = -1;
        int i11 = 0;
        int iB2 = 0;
        int i12 = 0;
        while (i11 < iArr.length) {
            int I2 = I(i11);
            int i13 = iArr[i11];
            int iH18 = H(I2);
            if (iH18 <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    i12 = unsafe2.getInt(u8Var, i15);
                    i10 = i15;
                }
            } else {
                i = 0;
            }
            j jVar2 = jVar;
            long j2 = I2 & 1048575;
            switch (iH18) {
                case 0:
                    c = 4;
                    b = -1;
                    c2 = '\b';
                    if ((i & i12) != 0) {
                        iB2 = cy30.b(i13, 8, iB2);
                    }
                    break;
                case 1:
                    b = -1;
                    if ((i & i12) != 0) {
                        c = 4;
                        iB2 = cy30.b(i13, 4, iB2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 2:
                    b = -1;
                    if ((i & i12) != 0) {
                        long j3 = unsafe2.getLong(u8Var, j2);
                        iH = c.h(i13);
                        iJ = c.j(j3);
                        iB2 += iJ + iH;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 3:
                    b = -1;
                    if ((i & i12) != 0) {
                        long j4 = unsafe2.getLong(u8Var, j2);
                        iH = c.h(i13);
                        iJ = c.j(j4);
                        iB2 += iJ + iH;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 4:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = c.f(unsafe2.getInt(u8Var, j2)) + c.h(i13);
                        iB2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 5:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = c.d(i13);
                        iB2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 6:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = c.c(i13);
                        iB2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 7:
                    b = -1;
                    if ((i & i12) != 0) {
                        iB2 = cy30.b(i13, 1, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 8:
                    b = -1;
                    if ((i & i12) != 0) {
                        Object object = unsafe2.getObject(u8Var, j2);
                        if (object instanceof ohc) {
                            int iH19 = c.h(i13);
                            int size5 = ((ohc) object).size();
                            iG = cy30.w(size5, size5, iH19, iB2);
                        } else {
                            iG = c.g((String) object) + c.h(i13) + iB2;
                        }
                        iB2 = iG;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 9:
                    if ((i & i12) != 0) {
                        Object object2 = unsafe2.getObject(u8Var, j2);
                        rm41 rm41VarO4 = o(i11);
                        Class cls6 = i.a;
                        u8 u8Var4 = (u8) object2;
                        int iH20 = c.h(i13);
                        u8Var4.getClass();
                        e eVar3 = (e) u8Var4;
                        int iG8 = eVar3.memoizedSerializedSize;
                        b = -1;
                        if (iG8 == -1) {
                            iG8 = rm41VarO4.g(u8Var4);
                            eVar3.memoizedSerializedSize = iG8;
                        }
                        iB2 = cy30.w(iG8, iG8, iH20, iB2);
                    } else {
                        b = -1;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 10:
                    if ((i & i12) != 0) {
                        iA = c.a(i13, (ohc) unsafe2.getObject(u8Var, j2));
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 11:
                    if ((i & i12) != 0) {
                        int i16 = unsafe2.getInt(u8Var, j2);
                        iH2 = c.h(i13);
                        i2 = c.i(i16);
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 12:
                    if ((i & i12) != 0) {
                        int i17 = unsafe2.getInt(u8Var, j2);
                        iH2 = c.h(i13);
                        i2 = c.f(i17);
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 13:
                    if ((i & i12) != 0) {
                        iB2 = cy30.b(i13, 4, iB2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 14:
                    if ((i & i12) != 0) {
                        iB2 = cy30.b(i13, 8, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 15:
                    if ((i & i12) != 0) {
                        int i18 = unsafe2.getInt(u8Var, j2);
                        iH2 = c.h(i13);
                        i2 = c.i((i18 >> 31) ^ (i18 << 1));
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 16:
                    if ((i & i12) != 0) {
                        long j5 = unsafe2.getLong(u8Var, j2);
                        iH3 = c.h(i13);
                        iJ2 = c.j((j5 >> 63) ^ (j5 << 1));
                        iA = iJ2 + iH3;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 17:
                    if ((i & i12) != 0) {
                        iA = c.e(i13, (u8) unsafe2.getObject(u8Var, j2), o(i11));
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 18:
                    iA = i.f(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 19:
                    iA = i.d(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 20:
                    iA = i.j(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 21:
                    iA = i.t(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 22:
                    iA = i.h(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 23:
                    iA = i.f(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 24:
                    iA = i.d(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 25:
                    List list4 = (List) unsafe2.getObject(u8Var, j2);
                    Class cls7 = i.a;
                    int size6 = list4.size();
                    iB2 += size6 == 0 ? 0 : (c.h(i13) + 1) * size6;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 26:
                    iA = i.q(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 27:
                    iA = i.l(i13, (List) unsafe2.getObject(u8Var, j2), o(i11));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 28:
                    iA = i.a(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 29:
                    iA = i.r(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 30:
                    iA = i.b(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 31:
                    iA = i.d(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 32:
                    iA = i.f(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 33:
                    iA = i.m(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 34:
                    iA = i.o(i13, (List) unsafe2.getObject(u8Var, j2));
                    iB2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 35:
                    iG2 = i.g((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 36:
                    iG2 = i.e((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 37:
                    iG2 = i.k((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 38:
                    iG2 = i.u((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 39:
                    iG2 = i.i((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 40:
                    iG2 = i.g((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 41:
                    iG2 = i.e((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 42:
                    List list5 = (List) unsafe2.getObject(u8Var, j2);
                    Class cls8 = i.a;
                    iG2 = list5.size();
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 43:
                    iG2 = i.s((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 44:
                    iG2 = i.c((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 45:
                    iG2 = i.e((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    iG2 = i.g((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    iG2 = i.n((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    iG2 = i.p((List) unsafe2.getObject(u8Var, j2));
                    if (iG2 > 0) {
                        iH4 = c.h(i13);
                        iB2 = cy30.w(iG2, iH4, iG2, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    List list6 = (List) unsafe2.getObject(u8Var, j2);
                    rm41 rm41VarO5 = o(i11);
                    Class cls9 = i.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iE = 0;
                    } else {
                        iE = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            iE += c.e(i13, (u8) list6.get(i19), rm41VarO5);
                        }
                    }
                    iB2 += iE;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    Object object3 = unsafe2.getObject(u8Var, j2);
                    Object objN2 = n(i11);
                    vng0Var.getClass();
                    vng0.a(object3, objN2);
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (q(i13, i11, u8Var)) {
                        iB2 = cy30.b(i13, 8, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (q(i13, i11, u8Var)) {
                        iB2 = cy30.b(i13, 4, iB2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 53:
                    if (q(i13, i11, u8Var)) {
                        long jX4 = x(j2, u8Var);
                        iH3 = c.h(i13);
                        iJ2 = c.j(jX4);
                        iA = iJ2 + iH3;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 54:
                    if (q(i13, i11, u8Var)) {
                        long jX5 = x(j2, u8Var);
                        iH3 = c.h(i13);
                        iJ2 = c.j(jX5);
                        iA = iJ2 + iH3;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 55:
                    if (q(i13, i11, u8Var)) {
                        int iW5 = w(j2, u8Var);
                        iH2 = c.h(i13);
                        i2 = c.f(iW5);
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 56:
                    if (q(i13, i11, u8Var)) {
                        iA = c.d(i13);
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 57:
                    if (q(i13, i11, u8Var)) {
                        iA = c.c(i13);
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 58:
                    if (q(i13, i11, u8Var)) {
                        iB2 = cy30.b(i13, 1, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 59:
                    if (q(i13, i11, u8Var)) {
                        Object object4 = unsafe2.getObject(u8Var, j2);
                        if (object4 instanceof ohc) {
                            int iH21 = c.h(i13);
                            int size8 = ((ohc) object4).size();
                            iG3 = cy30.w(size8, size8, iH21, iB2);
                        } else {
                            iG3 = c.g((String) object4) + c.h(i13) + iB2;
                        }
                        iB2 = iG3;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 60:
                    if (q(i13, i11, u8Var)) {
                        Object object5 = unsafe2.getObject(u8Var, j2);
                        rm41 rm41VarO6 = o(i11);
                        Class cls10 = i.a;
                        u8 u8Var5 = (u8) object5;
                        int iH22 = c.h(i13);
                        u8Var5.getClass();
                        e eVar4 = (e) u8Var5;
                        int iG9 = eVar4.memoizedSerializedSize;
                        if (iG9 == -1) {
                            iG9 = rm41VarO6.g(u8Var5);
                            eVar4.memoizedSerializedSize = iG9;
                        }
                        iB2 = cy30.w(iG9, iG9, iH22, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 61:
                    if (q(i13, i11, u8Var)) {
                        iA = c.a(i13, (ohc) unsafe2.getObject(u8Var, j2));
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 62:
                    if (q(i13, i11, u8Var)) {
                        int iW6 = w(j2, u8Var);
                        iH2 = c.h(i13);
                        i2 = c.i(iW6);
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 63:
                    if (q(i13, i11, u8Var)) {
                        int iW7 = w(j2, u8Var);
                        iH2 = c.h(i13);
                        i2 = c.f(iW7);
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 64:
                    if (q(i13, i11, u8Var)) {
                        iB2 = cy30.b(i13, 4, iB2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 65:
                    if (q(i13, i11, u8Var)) {
                        iB2 = cy30.b(i13, 8, iB2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 66:
                    if (q(i13, i11, u8Var)) {
                        int iW8 = w(j2, u8Var);
                        iH2 = c.h(i13);
                        i2 = c.i((iW8 >> 31) ^ (iW8 << 1));
                        iA = i2 + iH2;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 67:
                    if (q(i13, i11, u8Var)) {
                        long jX6 = x(j2, u8Var);
                        iH3 = c.h(i13);
                        iJ2 = c.j((jX6 >> 63) ^ (jX6 << 1));
                        iA = iJ2 + iH3;
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 68:
                    if (q(i13, i11, u8Var)) {
                        iA = c.e(i13, (u8) unsafe2.getObject(u8Var, j2), o(i11));
                        iB2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                default:
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
            }
            i11 += 3;
            jVar = jVar2;
        }
        ((wih1) jVar).getClass();
        return ((e) u8Var).unknownFields.a() + iB2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // p.rm41
    public final void h(e eVar, e eVar2) {
        e eVar3;
        eVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                i.w(this.m, eVar, eVar2);
                return;
            }
            int I = I(i);
            long j = 1048575 & I;
            int i2 = iArr[i];
            switch (H(I)) {
                case 0:
                    if (!p(i, eVar2)) {
                        eVar3 = eVar;
                    } else {
                        alh1 alh1Var = clh1.d;
                        eVar3 = eVar;
                        alh1Var.i(eVar3, j, alh1Var.e(j, eVar2));
                        E(i, eVar3);
                    }
                    break;
                case 1:
                    if (p(i, eVar2)) {
                        alh1 alh1Var2 = clh1.d;
                        alh1Var2.j(eVar, j, alh1Var2.f(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 2:
                    if (p(i, eVar2)) {
                        clh1.o(eVar, j, clh1.i(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 3:
                    if (p(i, eVar2)) {
                        clh1.o(eVar, j, clh1.i(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 4:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 5:
                    if (p(i, eVar2)) {
                        clh1.o(eVar, j, clh1.i(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 6:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 7:
                    if (p(i, eVar2)) {
                        alh1 alh1Var3 = clh1.d;
                        alh1Var3.g(eVar, j, alh1Var3.b(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 8:
                    if (p(i, eVar2)) {
                        clh1.p(eVar, j, clh1.j(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 9:
                    s(eVar, eVar2, i);
                    eVar3 = eVar;
                    break;
                case 10:
                    if (p(i, eVar2)) {
                        clh1.p(eVar, j, clh1.j(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 11:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 12:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 13:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 14:
                    if (p(i, eVar2)) {
                        clh1.o(eVar, j, clh1.i(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 15:
                    if (p(i, eVar2)) {
                        clh1.n(eVar, clh1.h(j, eVar2), j);
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 16:
                    if (p(i, eVar2)) {
                        clh1.o(eVar, j, clh1.i(j, eVar2));
                        E(i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 17:
                    s(eVar, eVar2, i);
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
                    Object objJ = clh1.j(j, eVar);
                    Object objJ2 = clh1.j(j, eVar2);
                    this.n.getClass();
                    clh1.p(eVar, j, vng0.b(objJ, objJ2));
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
                    if (q(i2, i, eVar2)) {
                        clh1.p(eVar, j, clh1.j(j, eVar2));
                        F(i2, i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 60:
                    t(eVar, eVar2, i);
                    eVar3 = eVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, eVar2)) {
                        clh1.p(eVar, j, clh1.j(j, eVar2));
                        F(i2, i, eVar);
                    }
                    eVar3 = eVar;
                    break;
                case 68:
                    t(eVar, eVar2, i);
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

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0063. Please report as an issue. */
    @Override // p.rm41
    public final void i(Object obj, byte[] bArr, int i, int i2, m36 m36Var) throws InvalidProtocolBufferException {
        int iG;
        int i3;
        int i4;
        Object obj2;
        int iV;
        Object obj3;
        int iT;
        int i5;
        int i6;
        g gVar = this;
        byte[] bArr2 = bArr;
        int i7 = i2;
        m36 m36Var2 = m36Var;
        if (!gVar.g) {
            A(obj, bArr, i, i7, 0, m36Var);
            return;
        }
        int i8 = 0;
        int i9 = -1;
        int iR = i;
        int i10 = 0;
        int i11 = -1;
        while (iR < i7) {
            int iS = iR + 1;
            int i12 = bArr2[iR];
            if (i12 < 0) {
                iS = y3o1.S(i12, bArr2, iS, m36Var2);
                i12 = m36Var2.b;
            }
            int i13 = i12;
            int i14 = iS;
            int i15 = (i13 == true ? 1 : 0) >>> 3;
            int i16 = (i13 == true ? 1 : 0) & 7;
            int i17 = gVar.d;
            int i18 = gVar.c;
            if (i15 > i11) {
                int i19 = i10 / 3;
                if (i15 < i18 || i15 > i17) {
                    iG = i9;
                } else {
                    iG = gVar.G(i15, i19);
                }
            } else if (i15 < i18 || i15 > i17) {
                iG = i9;
            } else {
                iG = gVar.G(i15, i8);
            }
            int i20 = iG;
            if (i20 == i9) {
                i3 = i14;
                i4 = i15;
                i20 = i8;
            } else {
                int i21 = gVar.a[i20 + 1];
                int iH = H(i21);
                long j = 1048575 & i21;
                Unsafe unsafe = f2p;
                if (iH <= 17) {
                    switch (iH) {
                        case 0:
                            if (i16 != 1) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                obj2 = obj;
                                clh1.d.i(obj2, j, y3o1.q(bArr2, i14));
                                iT = i14 + 8;
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 1:
                            if (i16 != 5) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                clh1.d.j(obj, j, y3o1.w(bArr2, i14));
                                iT = i14 + 4;
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iV = y3o1.V(bArr2, i14, m36Var2);
                                obj3 = obj;
                                unsafe.putLong(obj3, j, m36Var2.c);
                                iR = iV;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = y3o1.T(bArr2, i14, m36Var2);
                                unsafe.putInt(obj, j, m36Var2.b);
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            if (i16 != 1) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                obj2 = obj;
                                unsafe.putLong(obj2, j, y3o1.u(bArr2, i14));
                                iT = i14 + 8;
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            if (i16 != 5) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                unsafe.putInt(obj, j, y3o1.s(bArr2, i14));
                                iT = i14 + 4;
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 7:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                int iV2 = y3o1.V(bArr2, i14, m36Var2);
                                clh1.d.g(obj, j, m36Var2.c != 0);
                                iR = iV2;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 8:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = (536870912 & i21) == 0 ? y3o1.N(bArr2, i14, m36Var2) : y3o1.Q(bArr2, i14, m36Var2);
                                unsafe.putObject(obj, j, m36Var2.a);
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 9:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = y3o1.A(gVar.o(i20), bArr2, i14, i7, m36Var2);
                                Object object = unsafe.getObject(obj, j);
                                Object obj4 = m36Var2.a;
                                if (object == null) {
                                    unsafe.putObject(obj, j, obj4);
                                } else {
                                    unsafe.putObject(obj, j, k290.c(object, obj4));
                                }
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 10:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = y3o1.o(bArr2, i14, m36Var2);
                                unsafe.putObject(obj, j, m36Var2.a);
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 12:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = y3o1.T(bArr2, i14, m36Var2);
                                unsafe.putInt(obj, j, m36Var2.b);
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 15:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iT = y3o1.T(bArr2, i14, m36Var2);
                                unsafe.putInt(obj, j, ngc.b(m36Var2.b));
                                iR = iT;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 16:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iV = y3o1.V(bArr2, i14, m36Var2);
                                obj3 = obj;
                                unsafe.putLong(obj3, j, ngc.c(m36Var2.c));
                                iR = iV;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        default:
                            i5 = i14;
                            i6 = i15;
                            i3 = i5;
                            i4 = i6;
                            break;
                    }
                } else if (iH != 27) {
                    int i22 = i13 == true ? 1 : 0;
                    if (iH <= 49) {
                        i13 = i22;
                        i6 = i15;
                        int iB = gVar.B(obj, bArr, i14, i2, i13 == true ? 1 : 0, i16, i20, i21, iH, j, m36Var);
                        i20 = i20;
                        if (iB != i14) {
                            bArr2 = bArr;
                            i7 = i2;
                            m36Var2 = m36Var;
                            iR = iB;
                            i10 = i20;
                            i11 = i6;
                            i8 = 0;
                            i9 = -1;
                        } else {
                            i3 = iB;
                            i4 = i6;
                        }
                    } else {
                        i13 = i22;
                        i6 = i15;
                        i5 = i14;
                        if (iH == 50) {
                            if (i16 == 2) {
                                gVar.y(obj, i20, j);
                                throw null;
                            }
                            i3 = i5;
                            i4 = i6;
                        } else {
                            int iZ = gVar.z(obj, bArr, i5, i2, i13 == true ? 1 : 0, i6, i16, i21, iH, j, i20, m36Var);
                            i4 = i6;
                            if (iZ != i5) {
                                gVar = this;
                                i7 = i2;
                                m36Var2 = m36Var;
                                iR = iZ;
                                i11 = i4;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                                bArr2 = bArr;
                            } else {
                                i3 = iZ;
                            }
                        }
                    }
                } else if (i16 == 2) {
                    g290 g290VarH = (g290) unsafe.getObject(obj, j);
                    if (!((h9) g290VarH).a) {
                        int size = g290VarH.size();
                        g290VarH = g290VarH.h(size == 0 ? 10 : size * 2);
                        unsafe.putObject(obj, j, g290VarH);
                    }
                    iR = y3o1.B(gVar.o(i20), i13 == true ? 1 : 0, bArr2, i14, i7, g290VarH, m36Var2);
                    bArr2 = bArr;
                    i7 = i2;
                    m36Var2 = m36Var;
                    i11 = i15;
                    i10 = i20;
                    i8 = 0;
                    i9 = -1;
                } else {
                    i13 = i13 == true ? 1 : 0;
                    i5 = i14;
                    i6 = i15;
                    i3 = i5;
                    i4 = i6;
                }
            }
            e eVar = (e) obj;
            k kVarB = eVar.unknownFields;
            if (kVarB == k.f) {
                kVarB = k.b();
                eVar.unknownFields = kVarB;
            }
            bArr2 = bArr;
            m36Var2 = m36Var;
            iR = y3o1.R(i13 == true ? 1 : 0, bArr, i3, i2, kVarB, m36Var);
            i7 = i2;
            i11 = i4;
            i10 = i20;
            i8 = 0;
            i9 = -1;
            gVar = this;
        }
        if (iR != i7) {
            throw InvalidProtocolBufferException.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x05d6 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:20:0x0047, B:22:0x004c, B:24:0x0053, B:26:0x005a, B:33:0x006e, B:34:0x0072, B:38:0x0080, B:40:0x0091, B:46:0x00ab, B:48:0x00bd, B:49:0x00cf, B:50:0x00e1, B:51:0x00f3, B:52:0x0105, B:53:0x011a, B:54:0x012c, B:56:0x013b, B:58:0x0141, B:60:0x014a, B:64:0x0173, B:143:0x05d1, B:145:0x05d6, B:147:0x05dd, B:149:0x05e4, B:63:0x0160, B:65:0x0178, B:66:0x0182, B:67:0x0197, B:68:0x01ac, B:69:0x01c1, B:70:0x01d6, B:71:0x01eb, B:72:0x0200, B:73:0x0215, B:74:0x022a, B:75:0x0233, B:76:0x0234, B:77:0x0246, B:78:0x0254, B:79:0x0262, B:80:0x0270, B:81:0x027e, B:82:0x0291, B:83:0x029f, B:84:0x02ad, B:85:0x02bb, B:86:0x02c9, B:87:0x02d7, B:88:0x02e5, B:89:0x02f3, B:90:0x0301, B:91:0x030f, B:92:0x031d, B:93:0x032b, B:94:0x0339, B:95:0x0347, B:96:0x035a, B:97:0x0368, B:98:0x0376, B:99:0x0388, B:104:0x0397, B:105:0x03a3, B:106:0x03af, B:107:0x03be, B:108:0x03cd, B:109:0x03dc, B:110:0x03eb, B:111:0x03fa, B:112:0x0409, B:113:0x0418, B:114:0x0427, B:117:0x0430, B:119:0x0450, B:120:0x0465, B:121:0x0478, B:122:0x048b, B:123:0x049e, B:124:0x04b1, B:125:0x04c7, B:126:0x04da, B:127:0x04ed, B:129:0x04f6, B:130:0x0513, B:131:0x0527, B:132:0x0532, B:133:0x0547, B:134:0x055a, B:135:0x056d, B:136:0x0580, B:137:0x0593, B:138:0x05a6, B:139:0x05bb, B:141:0x05c7), top: B:165:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x05dd A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:20:0x0047, B:22:0x004c, B:24:0x0053, B:26:0x005a, B:33:0x006e, B:34:0x0072, B:38:0x0080, B:40:0x0091, B:46:0x00ab, B:48:0x00bd, B:49:0x00cf, B:50:0x00e1, B:51:0x00f3, B:52:0x0105, B:53:0x011a, B:54:0x012c, B:56:0x013b, B:58:0x0141, B:60:0x014a, B:64:0x0173, B:143:0x05d1, B:145:0x05d6, B:147:0x05dd, B:149:0x05e4, B:63:0x0160, B:65:0x0178, B:66:0x0182, B:67:0x0197, B:68:0x01ac, B:69:0x01c1, B:70:0x01d6, B:71:0x01eb, B:72:0x0200, B:73:0x0215, B:74:0x022a, B:75:0x0233, B:76:0x0234, B:77:0x0246, B:78:0x0254, B:79:0x0262, B:80:0x0270, B:81:0x027e, B:82:0x0291, B:83:0x029f, B:84:0x02ad, B:85:0x02bb, B:86:0x02c9, B:87:0x02d7, B:88:0x02e5, B:89:0x02f3, B:90:0x0301, B:91:0x030f, B:92:0x031d, B:93:0x032b, B:94:0x0339, B:95:0x0347, B:96:0x035a, B:97:0x0368, B:98:0x0376, B:99:0x0388, B:104:0x0397, B:105:0x03a3, B:106:0x03af, B:107:0x03be, B:108:0x03cd, B:109:0x03dc, B:110:0x03eb, B:111:0x03fa, B:112:0x0409, B:113:0x0418, B:114:0x0427, B:117:0x0430, B:119:0x0450, B:120:0x0465, B:121:0x0478, B:122:0x048b, B:123:0x049e, B:124:0x04b1, B:125:0x04c7, B:126:0x04da, B:127:0x04ed, B:129:0x04f6, B:130:0x0513, B:131:0x0527, B:132:0x0532, B:133:0x0547, B:134:0x055a, B:135:0x056d, B:136:0x0580, B:137:0x0593, B:138:0x05a6, B:139:0x05bb, B:141:0x05c7), top: B:165:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x05ec A[LOOP:1: B:151:0x05ea->B:152:0x05ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x05ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    @Override // p.rm41
    public final void j(Object obj, yb01 yb01Var, tz00 tz00Var) {
        k kVar;
        e eVar;
        k kVarB;
        tz00Var.getClass();
        j jVar = this.m;
        int[] iArr = this.h;
        int i = this.j;
        int i2 = this.i;
        k kVarB2 = null;
        while (true) {
            try {
                int iZ = yb01Var.z();
                int iG = (iZ < this.c || iZ > this.d) ? -1 : G(iZ, 0);
                k kVar2 = k.f;
                if (iG >= 0) {
                    int I = I(iG);
                    try {
                        int iH = H(I);
                        ntc0 ntc0Var = this.l;
                        switch (iH) {
                            case 0:
                                kVar = kVar2;
                                try {
                                    clh1.d.i(obj, v(I), yb01Var.readDouble());
                                    E(iG, obj);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    jVar.getClass();
                                    if (kVarB2 == null) {
                                        eVar = (e) obj;
                                        kVarB = eVar.unknownFields;
                                        if (kVarB == kVar) {
                                            kVarB = k.b();
                                            eVar.unknownFields = kVarB;
                                        }
                                        kVarB2 = kVarB;
                                    }
                                    if (!jVar.a(kVarB2, yb01Var)) {
                                        while (i2 < i) {
                                            l(iArr[i2], obj, kVarB2);
                                            i2++;
                                        }
                                        if (kVarB2 == null) {
                                            return;
                                        }
                                        ((e) obj).unknownFields = kVarB2;
                                    }
                                }
                                break;
                            case 1:
                                clh1.d.j(obj, v(I), yb01Var.readFloat());
                                E(iG, obj);
                                break;
                            case 2:
                                clh1.o(obj, v(I), yb01Var.F());
                                E(iG, obj);
                                break;
                            case 3:
                                clh1.o(obj, v(I), yb01Var.r());
                                E(iG, obj);
                                break;
                            case 4:
                                clh1.n(obj, yb01Var.o(), v(I));
                                E(iG, obj);
                                break;
                            case 5:
                                clh1.o(obj, v(I), yb01Var.a());
                                E(iG, obj);
                                break;
                            case 6:
                                clh1.n(obj, yb01Var.t(), v(I));
                                E(iG, obj);
                                break;
                            case 7:
                                clh1.d.g(obj, v(I), yb01Var.d());
                                E(iG, obj);
                                break;
                            case 8:
                                C(obj, I, yb01Var);
                                E(iG, obj);
                                break;
                            case 9:
                                if (p(iG, obj)) {
                                    clh1.p(obj, v(I), k290.c(clh1.j(v(I), obj), yb01Var.K(o(iG), tz00Var)));
                                } else {
                                    clh1.p(obj, v(I), yb01Var.K(o(iG), tz00Var));
                                    E(iG, obj);
                                }
                                break;
                            case 10:
                                clh1.p(obj, v(I), yb01Var.n());
                                E(iG, obj);
                                break;
                            case 11:
                                clh1.n(obj, yb01Var.g(), v(I));
                                E(iG, obj);
                                break;
                            case 12:
                                int iJ = yb01Var.j();
                                m(iG);
                                clh1.n(obj, iJ, v(I));
                                E(iG, obj);
                                break;
                            case 13:
                                clh1.n(obj, yb01Var.C(), v(I));
                                E(iG, obj);
                                break;
                            case 14:
                                clh1.o(obj, v(I), yb01Var.e());
                                E(iG, obj);
                                break;
                            case 15:
                                clh1.n(obj, yb01Var.k(), v(I));
                                E(iG, obj);
                                break;
                            case 16:
                                clh1.o(obj, v(I), yb01Var.x());
                                E(iG, obj);
                                break;
                            case 17:
                                if (p(iG, obj)) {
                                    try {
                                        clh1.p(obj, v(I), k290.c(clh1.j(v(I), obj), yb01Var.I(o(iG), tz00Var)));
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        kVar = kVar2;
                                        jVar.getClass();
                                        if (kVarB2 == null) {
                                            eVar = (e) obj;
                                            kVarB = eVar.unknownFields;
                                            if (kVarB == kVar) {
                                                kVarB = k.b();
                                                eVar.unknownFields = kVarB;
                                            }
                                            kVarB2 = kVarB;
                                        }
                                        if (!jVar.a(kVarB2, yb01Var)) {
                                            while (i2 < i) {
                                                l(iArr[i2], obj, kVarB2);
                                                i2++;
                                            }
                                            if (kVarB2 == null) {
                                                return;
                                            }
                                            ((e) obj).unknownFields = kVarB2;
                                        }
                                    }
                                } else {
                                    clh1.p(obj, v(I), yb01Var.I(o(iG), tz00Var));
                                    E(iG, obj);
                                }
                                break;
                            case 18:
                                yb01Var.E(ntc0Var.c(v(I), obj));
                                break;
                            case 19:
                                yb01Var.B(ntc0Var.c(v(I), obj));
                                break;
                            case 20:
                                yb01Var.h(ntc0Var.c(v(I), obj));
                                break;
                            case 21:
                                yb01Var.f(ntc0Var.c(v(I), obj));
                                break;
                            case 22:
                                yb01Var.v(ntc0Var.c(v(I), obj));
                                break;
                            case 23:
                                yb01Var.p(ntc0Var.c(v(I), obj));
                                break;
                            case 24:
                                yb01Var.w(ntc0Var.c(v(I), obj));
                                break;
                            case 25:
                                yb01Var.l(ntc0Var.c(v(I), obj));
                                break;
                            case 26:
                                if ((536870912 & I) != 0) {
                                    yb01Var.m(ntc0Var.c(I & 1048575, obj));
                                } else {
                                    yb01Var.A(ntc0Var.c(I & 1048575, obj));
                                }
                                break;
                            case 27:
                                yb01Var.J(ntc0Var.c(I & 1048575, obj), o(iG), tz00Var);
                                break;
                            case 28:
                                yb01Var.D(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 29:
                                yb01Var.s(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 30:
                                yb01Var.i(ntc0Var.c(I & 1048575, obj));
                                m(iG);
                                Class cls = i.a;
                                break;
                            case 31:
                                yb01Var.b(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 32:
                                yb01Var.u(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 33:
                                yb01Var.q(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 34:
                                yb01Var.c(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 35:
                                yb01Var.E(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 36:
                                yb01Var.B(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 37:
                                yb01Var.h(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 38:
                                yb01Var.f(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 39:
                                yb01Var.v(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 40:
                                yb01Var.p(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 41:
                                yb01Var.w(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 42:
                                yb01Var.l(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 43:
                                yb01Var.s(ntc0Var.c(I & 1048575, obj));
                                break;
                            case 44:
                                yb01Var.i(ntc0Var.c(I & 1048575, obj));
                                m(iG);
                                Class cls2 = i.a;
                                break;
                            case 45:
                                yb01Var.b(ntc0Var.c(I & 1048575, obj));
                                break;
                            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                                yb01Var.u(ntc0Var.c(I & 1048575, obj));
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                                yb01Var.q(ntc0Var.c(I & 1048575, obj));
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                                yb01Var.c(ntc0Var.c(I & 1048575, obj));
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                                yb01Var.H(ntc0Var.c(I & 1048575, obj), o(iG), tz00Var);
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                                r(iG, obj, n(iG));
                                throw null;
                            case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                                clh1.p(obj, I & 1048575, Double.valueOf(yb01Var.readDouble()));
                                F(iZ, iG, obj);
                                break;
                            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                                clh1.p(obj, I & 1048575, Float.valueOf(yb01Var.readFloat()));
                                F(iZ, iG, obj);
                                break;
                            case 53:
                                clh1.p(obj, I & 1048575, Long.valueOf(yb01Var.F()));
                                F(iZ, iG, obj);
                                break;
                            case 54:
                                clh1.p(obj, I & 1048575, Long.valueOf(yb01Var.r()));
                                F(iZ, iG, obj);
                                break;
                            case 55:
                                clh1.p(obj, I & 1048575, Integer.valueOf(yb01Var.o()));
                                F(iZ, iG, obj);
                                break;
                            case 56:
                                clh1.p(obj, I & 1048575, Long.valueOf(yb01Var.a()));
                                F(iZ, iG, obj);
                                break;
                            case 57:
                                clh1.p(obj, I & 1048575, Integer.valueOf(yb01Var.t()));
                                F(iZ, iG, obj);
                                break;
                            case 58:
                                clh1.p(obj, I & 1048575, Boolean.valueOf(yb01Var.d()));
                                F(iZ, iG, obj);
                                break;
                            case 59:
                                C(obj, I, yb01Var);
                                F(iZ, iG, obj);
                                break;
                            case 60:
                                try {
                                    if (q(iZ, iG, obj)) {
                                        long j = I & 1048575;
                                        try {
                                            clh1.p(obj, j, k290.c(clh1.j(j, obj), yb01Var.K(o(iG), tz00Var)));
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            kVar = kVar2;
                                            jVar.getClass();
                                            if (kVarB2 == null) {
                                                eVar = (e) obj;
                                                kVarB = eVar.unknownFields;
                                                if (kVarB == kVar) {
                                                    kVarB = k.b();
                                                    eVar.unknownFields = kVarB;
                                                }
                                                kVarB2 = kVarB;
                                            }
                                            if (!jVar.a(kVarB2, yb01Var)) {
                                                while (i2 < i) {
                                                    l(iArr[i2], obj, kVarB2);
                                                    i2++;
                                                }
                                                if (kVarB2 == null) {
                                                    return;
                                                }
                                                ((e) obj).unknownFields = kVarB2;
                                            }
                                        }
                                    } else {
                                        clh1.p(obj, I & 1048575, yb01Var.K(o(iG), tz00Var));
                                        E(iG, obj);
                                    }
                                    F(iZ, iG, obj);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    kVar = kVar2;
                                    jVar.getClass();
                                    if (kVarB2 == null) {
                                        eVar = (e) obj;
                                        kVarB = eVar.unknownFields;
                                        if (kVarB == kVar) {
                                            kVarB = k.b();
                                            eVar.unknownFields = kVarB;
                                        }
                                        kVarB2 = kVarB;
                                    }
                                    if (!jVar.a(kVarB2, yb01Var)) {
                                        while (i2 < i) {
                                            l(iArr[i2], obj, kVarB2);
                                            i2++;
                                        }
                                        if (kVarB2 == null) {
                                            return;
                                        }
                                        ((e) obj).unknownFields = kVarB2;
                                    }
                                }
                                break;
                            case 61:
                                clh1.p(obj, I & 1048575, yb01Var.n());
                                F(iZ, iG, obj);
                                break;
                            case 62:
                                clh1.p(obj, I & 1048575, Integer.valueOf(yb01Var.g()));
                                F(iZ, iG, obj);
                                break;
                            case 63:
                                int iJ2 = yb01Var.j();
                                m(iG);
                                clh1.p(obj, I & 1048575, Integer.valueOf(iJ2));
                                F(iZ, iG, obj);
                                break;
                            case 64:
                                clh1.p(obj, I & 1048575, Integer.valueOf(yb01Var.C()));
                                F(iZ, iG, obj);
                                break;
                            case 65:
                                clh1.p(obj, I & 1048575, Long.valueOf(yb01Var.e()));
                                F(iZ, iG, obj);
                                break;
                            case 66:
                                clh1.p(obj, I & 1048575, Integer.valueOf(yb01Var.k()));
                                F(iZ, iG, obj);
                                break;
                            case 67:
                                clh1.p(obj, I & 1048575, Long.valueOf(yb01Var.x()));
                                F(iZ, iG, obj);
                                break;
                            case 68:
                                clh1.p(obj, I & 1048575, yb01Var.I(o(iG), tz00Var));
                                F(iZ, iG, obj);
                                break;
                            default:
                                if (kVarB2 == null) {
                                    ((wih1) jVar).getClass();
                                    kVarB2 = k.b();
                                }
                                if (!jVar.a(kVarB2, yb01Var)) {
                                    while (i2 < i) {
                                        l(iArr[i2], obj, kVarB2);
                                        i2++;
                                    }
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        kVar = kVar2;
                    }
                } else if (iZ == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        l(iArr[i2], obj, kVarB2);
                        i2++;
                    }
                    if (kVarB2 == null) {
                        return;
                    } else {
                        ((wih1) jVar).getClass();
                    }
                } else {
                    jVar.getClass();
                    if (kVarB2 == null) {
                        e eVar2 = (e) obj;
                        k kVarB3 = eVar2.unknownFields;
                        if (kVarB3 == kVar2) {
                            kVarB3 = k.b();
                            eVar2.unknownFields = kVarB3;
                        }
                        kVarB2 = kVarB3;
                    }
                    if (!jVar.a(kVarB2, yb01Var)) {
                        while (i2 < i) {
                            l(iArr[i2], obj, kVarB2);
                            i2++;
                        }
                        if (kVarB2 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i2 < i) {
                    l(iArr[i2], obj, kVarB2);
                    i2++;
                }
                if (kVarB2 != null) {
                    ((wih1) jVar).getClass();
                    ((e) obj).unknownFields = kVarB2;
                }
                throw th;
            }
        }
        ((e) obj).unknownFields = kVarB2;
    }

    public final boolean k(e eVar, Object obj, int i) {
        return p(i, eVar) == p(i, obj);
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (clh1.j(I(i) & 1048575, obj) == null) {
            return;
        }
        m(i);
    }

    public final void m(int i) {
        pze0.m(this.b[cy30.x(i, 3, 2, 1)]);
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final rm41 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        rm41 rm41Var = (rm41) objArr[i2];
        if (rm41Var != null) {
            return rm41Var;
        }
        rm41 rm41VarA = miy0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = rm41VarA;
        return rm41VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea A[RETURN] */
    public final boolean p(int i, Object obj) {
        if (!this.g) {
            int i2 = this.a[i + 2];
            if ((clh1.h(i2 & 1048575, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int I = I(i);
        long j = I & 1048575;
        switch (H(I)) {
            case 0:
                if (clh1.d.e(j, obj) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (clh1.d.f(j, obj) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (clh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (clh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (clh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return clh1.d.b(j, obj);
            case 8:
                Object objJ = clh1.j(j, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof ohc) {
                    return !ohc.b.equals(objJ);
                }
                bhn0.q();
                return false;
            case 9:
                if (clh1.j(j, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ohc.b.equals(clh1.j(j, obj));
            case 11:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (clh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (clh1.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (clh1.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (clh1.j(j, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return clh1.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(int i, Object obj, Object obj2) {
        long jI = I(i) & 1048575;
        Object objJ = clh1.j(jI, obj);
        vng0 vng0Var = this.n;
        if (objJ != null) {
            vng0Var.getClass();
            if (!((png0) objJ).e()) {
                png0 png0VarI = png0.b().i();
                vng0.b(png0VarI, objJ);
                clh1.p(obj, jI, png0VarI);
                objJ = png0VarI;
            }
        } else {
            vng0Var.getClass();
            objJ = png0.b().i();
            clh1.p(obj, jI, objJ);
        }
        vng0Var.getClass();
        pze0.m(obj2);
        throw null;
    }

    public final void s(e eVar, Object obj, int i) {
        long jI = I(i) & 1048575;
        if (p(i, obj)) {
            Object objJ = clh1.j(jI, eVar);
            Object objJ2 = clh1.j(jI, obj);
            if (objJ != null && objJ2 != null) {
                clh1.p(eVar, jI, k290.c(objJ, objJ2));
                E(i, eVar);
            } else if (objJ2 != null) {
                clh1.p(eVar, jI, objJ2);
                E(i, eVar);
            }
        }
    }

    public final void t(e eVar, Object obj, int i) {
        int I = I(i);
        int i2 = this.a[i];
        long j = I & 1048575;
        if (q(i2, i, obj)) {
            Object objJ = clh1.j(j, eVar);
            Object objJ2 = clh1.j(j, obj);
            if (objJ != null && objJ2 != null) {
                clh1.p(eVar, j, k290.c(objJ, objJ2));
                F(i2, i, eVar);
            } else if (objJ2 != null) {
                clh1.p(eVar, j, objJ2);
                F(i2, i, eVar);
            }
        }
    }

    public final void y(Object obj, int i, long j) {
        Object objN = n(i);
        Unsafe unsafe = f2p;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((png0) object).e()) {
            png0 png0VarI = png0.b().i();
            vng0.b(png0VarI, object);
            unsafe.putObject(obj, j, png0VarI);
        }
        pze0.m(objN);
        throw null;
    }

    public final int z(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, m36 m36Var) throws InvalidProtocolBufferException {
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = f2p;
        switch (i7) {
            case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(y3o1.q(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(y3o1.w(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iV = y3o1.V(bArr, i, m36Var);
                unsafe.putObject(obj, j, Long.valueOf(m36Var.c));
                unsafe.putInt(obj, j2, i4);
                return iV;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iT = y3o1.T(bArr, i, m36Var);
                unsafe.putObject(obj, j, Integer.valueOf(m36Var.b));
                unsafe.putInt(obj, j2, i4);
                return iT;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(y3o1.u(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(y3o1.s(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iV2 = y3o1.V(bArr, i, m36Var);
                unsafe.putObject(obj, j, Boolean.valueOf(m36Var.c != 0));
                unsafe.putInt(obj, j2, i4);
                return iV2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iT2 = y3o1.T(bArr, i, m36Var);
                int i13 = m36Var.b;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!soi1.a.w(iT2, bArr, iT2 + i13)) {
                            throw InvalidProtocolBufferException.a();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iT2, i13, k290.a));
                    iT2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iT2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iA = y3o1.A(o(i8), bArr, i, i2, m36Var);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = m36Var.a;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, k290.c(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return iA;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iO = y3o1.o(bArr, i, m36Var);
                unsafe.putObject(obj, j, m36Var.a);
                unsafe.putInt(obj, j2, i4);
                return iO;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iT3 = y3o1.T(bArr, i, m36Var);
                int i14 = m36Var.b;
                m(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iT3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iT4 = y3o1.T(bArr, i, m36Var);
                unsafe.putObject(obj, j, Integer.valueOf(ngc.b(m36Var.b)));
                unsafe.putInt(obj, j2, i4);
                return iT4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iV3 = y3o1.V(bArr, i, m36Var);
                unsafe.putObject(obj, j, Long.valueOf(ngc.c(m36Var.c)));
                unsafe.putInt(obj, j2, i4);
                return iV3;
            case 68:
                if (i5 == 3) {
                    int iY = y3o1.y(o(i8), bArr, i, i2, (i3 & (-8)) | 4, m36Var);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = m36Var.a;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, k290.c(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iY;
                }
                break;
        }
        return i;
    }
}
