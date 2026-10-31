package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import app.p000rive.semantics.SemanticState;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.bhn0;
import p.blh1;
import p.cy30;
import p.czh0;
import p.f290;
import p.fhc;
import p.fp8;
import p.g9;
import p.gvg;
import p.hhg1;
import p.j290;
import p.l1d;
import p.liy0;
import p.lvb0;
import p.ngc;
import p.ong0;
import p.os00;
import p.owg;
import p.pkh1;
import p.pze0;
import p.qiy0;
import p.qm41;
import p.r9o0;
import p.stc0;
import p.sz00;
import p.ung0;
import p.vvz0;
import p.x220;
import p.zkh1;
import p.zz00;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g implements qm41 {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final r9o0 j;
    public final stc0 k;
    public final j l;
    public final ung0 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new pkh1((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public g(int[] iArr, Object[] objArr, int i, int i2, a aVar, int[] iArr2, int i3, int i4, r9o0 r9o0Var, stc0 stc0Var, j jVar, zz00 zz00Var, ung0 ung0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof e;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = r9o0Var;
        this.k = stc0Var;
        this.l = jVar;
        this.e = aVar;
        this.m = ung0Var;
    }

    public static Field F(Class cls, String str) {
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

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof e) {
            return ((e) obj).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x035c  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:188:0x03bb  */
    public static g w(vvz0 vvz0Var, r9o0 r9o0Var, stc0 stc0Var, j jVar, zz00 zz00Var, ung0 ung0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
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
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldF;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        Field fieldF2;
        Field fieldF3;
        int i25;
        char cCharAt10;
        int i26;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        if (!(vvz0Var instanceof vvz0)) {
            bhn0.d();
            return null;
        }
        String str = vvz0Var.b;
        int length = str.length();
        int i30 = 55296;
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
                i29 = i32 + 1;
                cCharAt13 = str.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i29;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i29;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
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
            i4 = iCharAt3;
            i32 = i56;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i59;
            i7 = iCharAt9;
        }
        Object[] objArr = vvz0Var.c;
        Class<?> cls = vvz0Var.a.getClass();
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
            if (iCharAt10 >= i30) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i28 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i28;
                    length = i16;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i17 = i28;
            } else {
                i16 = length;
                i17 = i66;
            }
            int i70 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            int i71 = iCharAt10;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i70 = i27;
                    c = 55296;
                }
                iCharAt11 = i72 | (cCharAt11 << i73);
                i70 = i27;
            }
            int i74 = iCharAt11 & 255;
            int i75 = i4;
            if ((iCharAt11 & SemanticState.ReadOnly) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            Unsafe unsafe = o;
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i70 + 1;
                int iCharAt12 = str.charAt(i70);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i25 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i26 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i26 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i25;
                    }
                    iCharAt12 = i26 | (cCharAt10 << i79);
                    i24 = i25;
                } else {
                    i24 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i74 - 51;
                int i82 = i24;
                if (i81 == 9 || i81 == 17) {
                    objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i81 == 12 && (l1d.d(vvz0Var.a(), 1) || (iCharAt11 & SemanticState.Modal) != 0)) {
                    objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i83 = i80 * 2;
                Object obj = objArr[i83];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i83] = fieldF2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                int i84 = i83 + 1;
                Object obj2 = objArr[i84];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i84] = fieldF3;
                }
                str = str;
                i64 = i64;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF3);
                i21 = i6;
                objArr2 = objArr2;
                i19 = i82;
                i20 = 0;
            } else {
                i61 = i61;
                int i85 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr[i6]);
                if (i74 == 9 || i74 == 17) {
                    objArr2 = objArr2;
                    objArr2[cy30.x(i64, 3, 2, 1)] = fieldF4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        objArr2 = objArr2;
                        i23 = i6 + 2;
                        objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i85];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        int i86 = i6;
                        if (vvz0Var.a() == 1 || (iCharAt11 & SemanticState.Modal) != 0) {
                            objArr2 = objArr2;
                            i23 = i86 + 2;
                            objArr2[cy30.x(i64, 3, 2, 1)] = objArr[i85];
                        } else {
                            objArr2 = objArr2;
                        }
                    } else {
                        if (i74 == 50) {
                            int i87 = i63 + 1;
                            iArr[i63] = i64;
                            int i88 = (i64 / 3) * 2;
                            int i89 = i6 + 2;
                            objArr2[i88] = objArr[i85];
                            if ((iCharAt11 & SemanticState.Modal) != 0) {
                                i18 = i6 + 3;
                                objArr2[i88 + 1] = objArr[i89];
                            } else {
                                i18 = i89;
                            }
                            i63 = i87;
                        } else {
                            objArr2 = objArr2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & SemanticState.Obscured) != 0 || i74 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i70;
                            i20 = 0;
                        } else {
                            i19 = i70 + 1;
                            int iCharAt13 = str.charAt(i70);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i22 = i19 + 1;
                                    cCharAt9 = str.charAt(i19);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i19 = i22;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                                i19 = i22;
                            }
                            int i92 = (iCharAt13 / 32) + (i75 * 2);
                            Object obj3 = objArr[i92];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr[i92] = fieldF;
                            }
                            int i93 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i20 = i93 % 32;
                        }
                        if (i74 >= 18 && i74 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                        i21 = i18;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                    }
                    i18 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & SemanticState.Obscured) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    }
                    if (i74 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                    i21 = i18;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                i18 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & SemanticState.Obscured) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                }
                if (i74 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
                i21 = i18;
                iObjectFieldOffset3 = iObjectFieldOffset;
            }
            int i94 = i64 + 1;
            iArr4[i64] = i71;
            int i95 = i64 + 2;
            int i96 = i64;
            iArr4[i94] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & SemanticState.Hidden) != 0 ? 268435456 : 0) | ((iCharAt11 & SemanticState.Modal) != 0 ? os00.INVALID_ID : 0) | (i74 << 20) | iObjectFieldOffset3;
            iArr4[i95] = (i20 << 20) | iObjectFieldOffset2;
            i64 = i96 + 3;
            i32 = i19;
            objArr2 = objArr2;
            length = i16;
            str = str;
            iArr3 = iArr4;
            i61 = i61;
            i30 = 55296;
            i6 = i21;
            i4 = i75;
        }
        return new g(iArr3, objArr2, i2, i5, vvz0Var.a, iArr, i7, i61, r9o0Var, stc0Var, jVar, zz00Var, ung0Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) blh1.i(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) blh1.i(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void B(Object obj, long j, d dVar, qm41 qm41Var, sz00 sz00Var) throws InvalidProtocolBufferException {
        int iW;
        this.k.getClass();
        f290 f290VarA = stc0.a(j, obj);
        ngc ngcVar = dVar.a;
        int i = dVar.b;
        if ((i & 7) != 3) {
            czh0.d();
            return;
        }
        do {
            e eVarC = qm41Var.c();
            dVar.c(eVarC, qm41Var, sz00Var);
            qm41Var.a(eVarC);
            f290VarA.add(eVarC);
            if (ngcVar.e() || dVar.d != 0) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == i);
        dVar.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void C(Object obj, int i, d dVar, qm41 qm41Var, sz00 sz00Var) throws InvalidProtocolBufferException {
        int iW;
        this.k.getClass();
        f290 f290VarA = stc0.a(i & 1048575, obj);
        ngc ngcVar = dVar.a;
        int i2 = dVar.b;
        if ((i2 & 7) != 2) {
            czh0.d();
            return;
        }
        do {
            e eVarC = qm41Var.c();
            dVar.d(eVarC, qm41Var, sz00Var);
            qm41Var.a(eVarC);
            f290VarA.add(eVarC);
            if (ngcVar.e() || dVar.d != 0) {
                return;
            } else {
                iW = ngcVar.w();
            }
        } while (iW == i2);
        dVar.d = iW;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void D(int i, d dVar, Object obj) throws InvalidProtocolBufferException {
        ngc ngcVar = dVar.a;
        if ((536870912 & i) != 0) {
            dVar.w(2);
            blh1.p(obj, i & 1048575, ngcVar.v());
        } else if (!this.f) {
            blh1.p(obj, i & 1048575, dVar.f());
        } else {
            dVar.w(2);
            blh1.p(obj, i & 1048575, ngcVar.u());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public final void E(int i, d dVar, Object obj) throws InvalidProtocolBufferException {
        boolean z = (536870912 & i) != 0;
        stc0 stc0Var = this.k;
        if (z) {
            stc0Var.getClass();
            dVar.s(stc0.a(i & 1048575, obj), true);
        } else {
            stc0Var.getClass();
            dVar.s(stc0.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        blh1.n(obj, (1 << (i2 >>> 20)) | blh1.g(j, obj), j);
    }

    public final void H(int i, int i2, Object obj) {
        blh1.n(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // p.qm41
    public final void a(Object obj) {
        if (p(obj)) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                eVar.j(Alert.DURATION_SHOW_INDEFINITELY);
                ((a) eVar).memoizedHashCode = 0;
                eVar.g();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iJ = J(i);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).a(unsafe.getObject(obj, j));
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
                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            case RendererMetrics.SAMPLES /* 30 */:
                            case 31:
                            case 32:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                            case 48:
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                this.k.getClass();
                                g9 g9Var = (f290) blh1.i(j, obj);
                                if (g9Var.a) {
                                    g9Var.a = false;
                                }
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((ong0) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).a(unsafe.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).a(unsafe.getObject(obj, j));
                }
            }
            ((l) this.l).getClass();
            k kVar = ((e) obj).unknownFields;
            if (kVar.e) {
                kVar.e = false;
            }
        }
    }

    @Override // p.qm41
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iJ = J(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iJ) == 0 || o(obj, i6, i, i2, i10)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i7, i6, obj) || m(i6).b(blh1.i(iJ & 1048575, obj))) {
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objI = blh1.i(iJ & 1048575, obj);
                                this.m.getClass();
                                if (!((ong0) objI).isEmpty()) {
                                    pze0.m(this.b[(i6 / 3) * 2]);
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) blh1.i(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qm41 qm41VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (qm41VarM.b(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!o(obj, i6, i, i2, i10) || m(i6).b(blh1.i(iJ & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p.qm41
    public final e c() {
        this.j.getClass();
        return this.e.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // p.qm41
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            hhg1.n(gvg.g(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                i.k(this.l, obj, obj2);
                return;
            }
            int iJ = J(i);
            long j = 1048575 & iJ;
            int i2 = iArr[i];
            switch (I(iJ)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        zkh1 zkh1Var = blh1.c;
                        obj3 = obj;
                        zkh1Var.f(obj3, j, zkh1Var.b(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        zkh1 zkh1Var2 = blh1.c;
                        zkh1Var2.g(obj, j, zkh1Var2.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        blh1.o(obj, j, blh1.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        blh1.o(obj, j, blh1.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        blh1.o(obj, j, blh1.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        zkh1 zkh1Var3 = blh1.c;
                        zkh1Var3.d(obj, j, zkh1Var3.a(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        blh1.p(obj, j, blh1.i(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        blh1.p(obj, j, blh1.i(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        blh1.o(obj, j, blh1.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        blh1.n(obj, blh1.g(j, obj2), j);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        blh1.o(obj, j, blh1.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    this.k.getClass();
                    qiy0 qiy0VarD = (f290) blh1.i(j, obj);
                    qiy0 qiy0Var = (f290) blh1.i(j, obj2);
                    int size = qiy0VarD.size();
                    int size2 = qiy0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((g9) qiy0VarD).a) {
                            qiy0VarD = qiy0VarD.d(size2 + size);
                        }
                        qiy0VarD.addAll(qiy0Var);
                    }
                    if (size > 0) {
                        qiy0Var = qiy0VarD;
                    }
                    blh1.p(obj, j, qiy0Var);
                    obj3 = obj;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = i.a;
                    Object objI = blh1.i(j, obj);
                    Object objI2 = blh1.i(j, obj2);
                    this.m.getClass();
                    blh1.p(obj, j, ung0.a(objI, objI2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i2, i, obj2)) {
                        blh1.p(obj, j, blh1.i(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        blh1.p(obj, j, blh1.i(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
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
    @Override // p.qm41
    public final int e(e eVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iJ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i = i3 * 53;
                    iB = j290.b(Double.doubleToLongBits(blh1.c.b(j, eVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(blh1.c.c(j, eVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = j290.b(blh1.h(j, eVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = j290.b(blh1.h(j, eVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = j290.b(blh1.h(j, eVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = blh1.c.a(j, eVar);
                    Charset charset = j290.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) blh1.i(j, eVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objI = blh1.i(j, eVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = blh1.i(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = j290.b(blh1.h(j, eVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = blh1.g(j, eVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = j290.b(blh1.h(j, eVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objI2 = blh1.i(j, eVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case RendererMetrics.SAMPLES /* 30 */:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = i3 * 53;
                    iB = blh1.i(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i = i3 * 53;
                    iB = blh1.i(j, eVar).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(Double.doubleToLongBits(((Double) blh1.i(j, eVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) blh1.i(j, eVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(z(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(z(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(z(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, eVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) blh1.i(j, eVar)).booleanValue();
                        Charset charset2 = j290.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = ((String) blh1.i(j, eVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = blh1.i(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = blh1.i(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(z(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = y(j, eVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = j290.b(z(j, eVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, eVar)) {
                        i = i3 * 53;
                        iB = blh1.i(j, eVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((l) this.l).getClass();
        return eVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.qm41
    public final void f(Object obj, fp8 fp8Var) throws CodedOutputStream$OutOfSpaceException {
        char c;
        int i;
        boolean z;
        g gVar = this;
        fp8Var.getClass();
        owg owgVar = (owg) fp8Var.b;
        int[] iArr = gVar.a;
        int length = iArr.length;
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = gVar.J(i4);
            int i5 = iArr[i4];
            int I = I(iJ);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i6 = iArr[i4 + 2];
                c = 1;
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    i3 = i7 == 1048575 ? 0 : unsafe.getInt(obj, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            long j = iJ & 1048575;
            switch (I) {
                case 0:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.u0(i5, Double.doubleToRawLongBits(blh1.c.b(j, obj)));
                    }
                    break;
                case 1:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.s0(i5, Float.floatToRawIntBits(blh1.c.c(j, obj)));
                    }
                    gVar = this;
                    break;
                case 2:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.D0(i5, unsafe.getLong(obj, j));
                    }
                    gVar = this;
                    break;
                case 3:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.D0(i5, unsafe.getLong(obj, j));
                    }
                    gVar = this;
                    break;
                case 4:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.w0(i5, unsafe.getInt(obj, j));
                    }
                    gVar = this;
                    break;
                case 5:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.u0(i5, unsafe.getLong(obj, j));
                    }
                    gVar = this;
                    break;
                case 6:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.s0(i5, unsafe.getInt(obj, j));
                    }
                    gVar = this;
                    break;
                case 7:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.q0(i5, blh1.c.a(j, obj));
                    }
                    gVar = this;
                    break;
                case 8:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            owgVar.z0(i5, (String) object);
                        } else {
                            owgVar.r0(i5, (fhc) object);
                        }
                    }
                    gVar = this;
                    break;
                case 9:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.y0(i5, (a) unsafe.getObject(obj, j), gVar.m(i4));
                    }
                    break;
                case 10:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.r0(i5, (fhc) unsafe.getObject(obj, j));
                    }
                    gVar = this;
                    break;
                case 11:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.B0(i5, unsafe.getInt(obj, j));
                    }
                    gVar = this;
                    break;
                case 12:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.w0(i5, unsafe.getInt(obj, j));
                    }
                    gVar = this;
                    break;
                case 13:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.s0(i5, unsafe.getInt(obj, j));
                    }
                    gVar = this;
                    break;
                case 14:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        owgVar.u0(i5, unsafe.getLong(obj, j));
                    }
                    gVar = this;
                    break;
                case 15:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        int i8 = unsafe.getInt(obj, j);
                        owgVar.B0(i5, (i8 >> 31) ^ (i8 << 1));
                    }
                    gVar = this;
                    break;
                case 16:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        owgVar.D0(i5, (j2 << 1) ^ (j2 >> 63));
                    }
                    gVar = this;
                    break;
                case 17:
                    if (gVar.o(obj, i4, i2, i3, i)) {
                        fp8Var.o(i5, unsafe.getObject(obj, j), gVar.m(i4));
                    }
                    break;
                case 18:
                    i.n(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 19:
                    i.r(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 20:
                    i.t(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 21:
                    i.z(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 22:
                    i.s(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 23:
                    i.q(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 24:
                    i.p(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 25:
                    i.m(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 26:
                    int i9 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = i.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof lvb0) {
                            lvb0 lvb0Var = (lvb0) list;
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                Object objU0 = lvb0Var.u0();
                                if (objU0 instanceof String) {
                                    owgVar.z0(i9, (String) objU0);
                                } else {
                                    owgVar.r0(i9, (fhc) objU0);
                                }
                            }
                        } else {
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                owgVar.z0(i9, (String) list.get(i11));
                            }
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    qm41 qm41VarM = gVar.m(i4);
                    Class cls2 = i.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            owgVar.y0(i12, (a) list2.get(i13), qm41VarM);
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = i.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            owgVar.r0(i14, (fhc) list3.get(i15));
                        }
                    }
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    z = false;
                    i.y(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    z = false;
                    i.o(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 31:
                    z = false;
                    i.u(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case 32:
                    z = false;
                    i.v(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    z = false;
                    i.w(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    z = false;
                    i.x(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, false);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    i.n(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    i.r(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    i.t(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    i.z(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i.s(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i.q(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i.p(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i.m(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i.y(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i.o(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i.u(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i.v(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i.w(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case 48:
                    i.x(iArr[i4], (List) unsafe.getObject(obj, j), fp8Var, c);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    qm41 qm41VarM2 = gVar.m(i4);
                    Class cls4 = i.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            fp8Var.o(i16, list4.get(i17), qm41VarM2);
                        }
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        Object obj2 = gVar.b[(i4 / 3) * 2];
                        gVar.m.getClass();
                        pze0.m(obj2);
                        throw null;
                    }
                    break;
                case 51:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.u0(i5, Double.doubleToRawLongBits(((Double) blh1.i(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.s0(i5, Float.floatToRawIntBits(((Float) blh1.i(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.D0(i5, z(j, obj));
                    }
                    break;
                case 54:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.D0(i5, z(j, obj));
                    }
                    break;
                case 55:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.w0(i5, y(j, obj));
                    }
                    break;
                case 56:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.u0(i5, z(j, obj));
                    }
                    break;
                case 57:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.s0(i5, y(j, obj));
                    }
                    break;
                case 58:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.q0(i5, ((Boolean) blh1.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (gVar.q(i5, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            owgVar.z0(i5, (String) object2);
                        } else {
                            owgVar.r0(i5, (fhc) object2);
                        }
                    }
                    break;
                case 60:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.y0(i5, (a) unsafe.getObject(obj, j), gVar.m(i4));
                    }
                    break;
                case 61:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.r0(i5, (fhc) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.B0(i5, y(j, obj));
                    }
                    break;
                case 63:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.w0(i5, y(j, obj));
                    }
                    break;
                case 64:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.s0(i5, y(j, obj));
                    }
                    break;
                case 65:
                    if (gVar.q(i5, i4, obj)) {
                        owgVar.u0(i5, z(j, obj));
                    }
                    break;
                case 66:
                    if (gVar.q(i5, i4, obj)) {
                        int iY = y(j, obj);
                        owgVar.B0(i5, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (gVar.q(i5, i4, obj)) {
                        long jZ = z(j, obj);
                        owgVar.D0(i5, (jZ << c) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (gVar.q(i5, i4, obj)) {
                        fp8Var.o(i5, unsafe.getObject(obj, j), gVar.m(i4));
                    }
                    break;
                default:
                    break;
            }
        }
        ((l) gVar.l).getClass();
        ((e) obj).unknownFields.d(fp8Var);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x037c  */
    @Override // p.qm41
    public final int g(e eVar) {
        int i;
        int iK0;
        int iK1;
        int iK2;
        int iM0;
        int iK3;
        int iM1;
        int iK4;
        int iK5;
        int iK6;
        int iA;
        int iL0;
        int iI0;
        int iK7;
        int iA2;
        int iC;
        int iK8;
        int size;
        int i2;
        int iK9;
        int iK10;
        int size2;
        int iK11;
        int iL1;
        int iA3;
        int iK12;
        int iK13;
        int iM2;
        int iK14;
        int iM3;
        int i3;
        g gVar = this;
        e eVar2 = eVar;
        int i4 = 0;
        int i5 = 0;
        int iI1 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = gVar.a;
            if (i4 >= iArr.length) {
                ((l) gVar.l).getClass();
                return eVar2.unknownFields.b() + iI1;
            }
            int iJ = gVar.J(i4);
            int I = I(iJ);
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i9 != i6) {
                    i5 = i9 == 1048575 ? 0 : unsafe.getInt(eVar2, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ & 1048575;
            if (I >= x220.b.a) {
                byte b = x220.c.a;
            }
            switch (I) {
                case 0:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK0 = owg.k0(i7);
                        iC = iK0 + 8;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 1:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK1 = owg.k0(i7);
                        iK5 = iK1 + 4;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 2:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        long j2 = unsafe.getLong(eVar2, j);
                        iK2 = owg.k0(i7);
                        iM0 = owg.m0(j2);
                        iI1 += iM0 + iK2;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 3:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(eVar2, j);
                        iK2 = owg.k0(i7);
                        iM0 = owg.m0(j3);
                        iI1 += iM0 + iK2;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 4:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        int i10 = unsafe.getInt(eVar2, j);
                        iK3 = owg.k0(i7);
                        iM1 = owg.m0(i10);
                        iI0 = iM1 + iK3;
                        iI1 += iI0;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 5:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK4 = owg.k0(i7);
                        iK5 = iK4 + 8;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 6:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK1 = owg.k0(i7);
                        iK5 = iK1 + 4;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 7:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK5 = owg.k0(i7) + 1;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 8:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(eVar2, j);
                        iI1 = (object instanceof fhc ? owg.i0(i7, (fhc) object) : owg.j0((String) object) + owg.k0(i7)) + iI1;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 9:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        Object object2 = unsafe.getObject(eVar2, j);
                        qm41 qm41VarM = gVar.m(i4);
                        Class cls = i.a;
                        iK6 = owg.k0(i7);
                        iA = ((a) object2).a(qm41VarM);
                        iL0 = owg.l0(iA);
                        i3 = iL0 + iA + iK6;
                        iI1 += i3;
                    }
                    i4 += 3;
                    break;
                case 10:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iI0 = owg.i0(i7, (fhc) unsafe.getObject(eVar2, j));
                        iI1 += iI0;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 11:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        int i11 = unsafe.getInt(eVar2, j);
                        iK3 = owg.k0(i7);
                        iM1 = owg.l0(i11);
                        iI0 = iM1 + iK3;
                        iI1 += iI0;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 12:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(eVar2, j);
                        iK3 = owg.k0(i7);
                        iM1 = owg.m0(i12);
                        iI0 = iM1 + iK3;
                        iI1 += iI0;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 13:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK1 = owg.k0(i7);
                        iK5 = iK1 + 4;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 14:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        iK4 = owg.k0(i7);
                        iK5 = iK4 + 8;
                        iI1 += iK5;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    i4 += 3;
                    break;
                case 15:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        int i13 = unsafe.getInt(eVar2, j);
                        iK3 = owg.k0(i7);
                        iM1 = owg.l0((i13 >> 31) ^ (i13 << 1));
                        iI0 = iM1 + iK3;
                        iI1 += iI0;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 16:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        long j4 = unsafe.getLong(eVar2, j);
                        iK2 = owg.k0(i7);
                        iM0 = owg.m0((j4 << 1) ^ (j4 >> 63));
                        iI1 += iM0 + iK2;
                    }
                    gVar = this;
                    i4 += 3;
                    break;
                case 17:
                    if (gVar.o(eVar2, i4, i6, i5, i)) {
                        a aVar = (a) unsafe.getObject(eVar2, j);
                        qm41 qm41VarM2 = gVar.m(i4);
                        iK7 = owg.k0(i7) * 2;
                        iA2 = aVar.a(qm41VarM2);
                        iC = iA2 + iK7;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 18:
                    iC = i.c(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case 19:
                    iC = i.b(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(eVar2, j);
                    Class cls2 = i.a;
                    if (list.size() == 0) {
                        iK8 = 0;
                    } else {
                        iK8 = (owg.k0(i7) * list.size()) + i.e(list);
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(eVar2, j);
                    Class cls3 = i.a;
                    size = list2.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.i(list2);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(eVar2, j);
                    Class cls4 = i.a;
                    size = list3.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.d(list3);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case 23:
                    iC = i.c(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case 24:
                    iC = i.b(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(eVar2, j);
                    Class cls5 = i.a;
                    int size3 = list4.size();
                    iI1 += size3 == 0 ? 0 : (owg.k0(i7) + 1) * size3;
                    i4 += 3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(eVar2, j);
                    Class cls6 = i.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iK8 = 0;
                    } else {
                        iK8 = owg.k0(i7) * size4;
                        if (list5 instanceof lvb0) {
                            lvb0 lvb0Var = (lvb0) list5;
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object objU0 = lvb0Var.u0();
                                if (objU0 instanceof fhc) {
                                    int size5 = ((fhc) objU0).size();
                                    iK8 = owg.l0(size5) + size5 + iK8;
                                } else {
                                    iK8 = owg.j0((String) objU0) + iK8;
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object obj = list5.get(i15);
                                if (obj instanceof fhc) {
                                    int size6 = ((fhc) obj).size();
                                    iK8 = owg.l0(size6) + size6 + iK8;
                                } else {
                                    iK8 = owg.j0((String) obj) + iK8;
                                }
                            }
                        }
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    List list6 = (List) unsafe.getObject(eVar2, j);
                    qm41 qm41VarM3 = gVar.m(i4);
                    Class cls7 = i.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iK10 = 0;
                    } else {
                        iK10 = owg.k0(i7) * size7;
                        for (int i16 = 0; i16 < size7; i16++) {
                            int iA4 = ((a) list6.get(i16)).a(qm41VarM3);
                            iK10 += owg.l0(iA4) + iA4;
                        }
                    }
                    iI1 += iK10;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    List list7 = (List) unsafe.getObject(eVar2, j);
                    Class cls8 = i.a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iK8 = 0;
                    } else {
                        iK8 = owg.k0(i7) * size8;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int size9 = ((fhc) list7.get(i17)).size();
                            iK8 += owg.l0(size9) + size9;
                        }
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    List list8 = (List) unsafe.getObject(eVar2, j);
                    Class cls9 = i.a;
                    size = list8.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.h(list8);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    List list9 = (List) unsafe.getObject(eVar2, j);
                    Class cls10 = i.a;
                    size = list9.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.a(list9);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case 31:
                    iC = i.b(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case 32:
                    iC = i.c(i7, (List) unsafe.getObject(eVar2, j));
                    iI1 += iC;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    List list10 = (List) unsafe.getObject(eVar2, j);
                    Class cls11 = i.a;
                    size = list10.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.f(list10);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    List list11 = (List) unsafe.getObject(eVar2, j);
                    Class cls12 = i.a;
                    size = list11.size();
                    if (size == 0) {
                        iK8 = 0;
                    } else {
                        i2 = i.g(list11);
                        iK9 = owg.k0(i7);
                        iK8 = (iK9 * size) + i2;
                    }
                    iI1 += iK8;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    List list12 = (List) unsafe.getObject(eVar2, j);
                    Class cls13 = i.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    List list13 = (List) unsafe.getObject(eVar2, j);
                    Class cls14 = i.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    size2 = i.e((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    size2 = i.i((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size2 = i.d((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    List list14 = (List) unsafe.getObject(eVar2, j);
                    Class cls15 = i.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    List list15 = (List) unsafe.getObject(eVar2, j);
                    Class cls16 = i.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    List list16 = (List) unsafe.getObject(eVar2, j);
                    Class cls17 = i.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    size2 = i.h((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    size2 = i.a((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    List list17 = (List) unsafe.getObject(eVar2, j);
                    Class cls18 = i.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    List list18 = (List) unsafe.getObject(eVar2, j);
                    Class cls19 = i.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    size2 = i.f((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case 48:
                    size2 = i.g((List) unsafe.getObject(eVar2, j));
                    if (size2 > 0) {
                        iK11 = owg.k0(i7);
                        iL1 = owg.l0(size2);
                        iI1 += iL1 + iK11 + size2;
                    }
                    i4 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list19 = (List) unsafe.getObject(eVar2, j);
                    qm41 qm41VarM4 = gVar.m(i4);
                    Class cls20 = i.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i18 = 0; i18 < size10; i18++) {
                            iA3 += ((a) list19.get(i18)).a(qm41VarM4) + (owg.k0(i7) * 2);
                        }
                    }
                    iI1 += iA3;
                    i4 += 3;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object object3 = unsafe.getObject(eVar2, j);
                    Object obj2 = gVar.b[(i4 / 3) * 2];
                    gVar.m.getClass();
                    ong0 ong0Var = (ong0) object3;
                    if (obj2 != null) {
                        bhn0.d();
                        return 0;
                    }
                    if (ong0Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = ong0Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    break;
                case 51:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK0 = owg.k0(i7);
                        iC = iK0 + 8;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 52:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK12 = owg.k0(i7);
                        iC = iK12 + 4;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 53:
                    if (gVar.q(i7, i4, eVar2)) {
                        long jZ = z(j, eVar2);
                        iK13 = owg.k0(i7);
                        iM2 = owg.m0(jZ);
                        i3 = iM2 + iK13;
                        iI1 += i3;
                    }
                    i4 += 3;
                    break;
                case 54:
                    if (gVar.q(i7, i4, eVar2)) {
                        long jZ2 = z(j, eVar2);
                        iK13 = owg.k0(i7);
                        iM2 = owg.m0(jZ2);
                        i3 = iM2 + iK13;
                        iI1 += i3;
                    }
                    i4 += 3;
                    break;
                case 55:
                    if (gVar.q(i7, i4, eVar2)) {
                        int iY = y(j, eVar2);
                        iK14 = owg.k0(i7);
                        iM3 = owg.m0(iY);
                        iC = iM3 + iK14;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 56:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK0 = owg.k0(i7);
                        iC = iK0 + 8;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 57:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK12 = owg.k0(i7);
                        iC = iK12 + 4;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 58:
                    if (gVar.q(i7, i4, eVar2)) {
                        iC = owg.k0(i7) + 1;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 59:
                    if (gVar.q(i7, i4, eVar2)) {
                        Object object4 = unsafe.getObject(eVar2, j);
                        iI1 = (object4 instanceof fhc ? owg.i0(i7, (fhc) object4) : owg.j0((String) object4) + owg.k0(i7)) + iI1;
                    }
                    i4 += 3;
                    break;
                case 60:
                    if (gVar.q(i7, i4, eVar2)) {
                        Object object5 = unsafe.getObject(eVar2, j);
                        qm41 qm41VarM5 = gVar.m(i4);
                        Class cls21 = i.a;
                        iK6 = owg.k0(i7);
                        iA = ((a) object5).a(qm41VarM5);
                        iL0 = owg.l0(iA);
                        i3 = iL0 + iA + iK6;
                        iI1 += i3;
                    }
                    i4 += 3;
                    break;
                case 61:
                    if (gVar.q(i7, i4, eVar2)) {
                        iC = owg.i0(i7, (fhc) unsafe.getObject(eVar2, j));
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 62:
                    if (gVar.q(i7, i4, eVar2)) {
                        int iY2 = y(j, eVar2);
                        iK14 = owg.k0(i7);
                        iM3 = owg.l0(iY2);
                        iC = iM3 + iK14;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 63:
                    if (gVar.q(i7, i4, eVar2)) {
                        int iY3 = y(j, eVar2);
                        iK14 = owg.k0(i7);
                        iM3 = owg.m0(iY3);
                        iC = iM3 + iK14;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 64:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK12 = owg.k0(i7);
                        iC = iK12 + 4;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 65:
                    if (gVar.q(i7, i4, eVar2)) {
                        iK0 = owg.k0(i7);
                        iC = iK0 + 8;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 66:
                    if (gVar.q(i7, i4, eVar2)) {
                        int iY4 = y(j, eVar2);
                        iK14 = owg.k0(i7);
                        iM3 = owg.l0((iY4 >> 31) ^ (iY4 << 1));
                        iC = iM3 + iK14;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                case 67:
                    if (gVar.q(i7, i4, eVar2)) {
                        long jZ3 = z(j, eVar2);
                        iK13 = owg.k0(i7);
                        iM2 = owg.m0((jZ3 << 1) ^ (jZ3 >> 63));
                        i3 = iM2 + iK13;
                        iI1 += i3;
                    }
                    i4 += 3;
                    break;
                case 68:
                    if (gVar.q(i7, i4, eVar2)) {
                        a aVar2 = (a) unsafe.getObject(eVar2, j);
                        qm41 qm41VarM6 = gVar.m(i4);
                        iK7 = owg.k0(i7) * 2;
                        iA2 = aVar2.a(qm41VarM6);
                        iC = iA2 + iK7;
                        iI1 += iC;
                    }
                    i4 += 3;
                    break;
                default:
                    i4 += 3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0710 A[Catch: all -> 0x0464, TryCatch #2 {all -> 0x0464, blocks: (B:150:0x070b, B:152:0x0710, B:153:0x0715, B:112:0x045f, B:115:0x0467, B:116:0x047c, B:117:0x0491, B:118:0x04a6, B:119:0x04bb, B:120:0x04d0, B:121:0x04e5, B:122:0x04fa, B:123:0x050f, B:124:0x0534, B:125:0x054e, B:126:0x0569, B:127:0x0584, B:128:0x059f, B:129:0x05bd, B:130:0x05d8, B:131:0x05ed, B:132:0x0612, B:133:0x061f, B:134:0x063c, B:135:0x0657, B:136:0x0672, B:137:0x068d, B:138:0x06a8, B:139:0x06c3, B:140:0x06df, B:144:0x06fb), top: B:176:0x070b }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0720 A[LOOP:2: B:156:0x071e->B:157:0x0720, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0739 A[LOOP:3: B:163:0x0737->B:164:0x0739, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0743  */
    /* JADX WARN: Code duplicated, block: B:202:0x071c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    @Override // p.qm41
    public final void h(Object obj, d dVar, sz00 sz00Var) throws Throwable {
        int i;
        int i2;
        d dVar2;
        int i3;
        g gVar = this;
        Object obj2 = obj;
        d dVar3 = dVar;
        sz00 sz00Var2 = sz00Var;
        sz00Var2.getClass();
        if (!p(obj2)) {
            hhg1.n(gvg.g(obj2, "Mutating immutable message: "));
            return;
        }
        j jVar = gVar.l;
        int[] iArr = gVar.g;
        int i4 = gVar.i;
        int i5 = gVar.h;
        k kVarA = null;
        while (true) {
            try {
                int iB = dVar3.b();
                int iA = gVar.A(iB);
                if (iA >= 0) {
                    int iJ = gVar.J(iA);
                    try {
                        int I = I(iJ);
                        Unsafe unsafe = o;
                        stc0 stc0Var = gVar.k;
                        switch (I) {
                            case 0:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX = x(iJ);
                                dVar2.w(1);
                                Object obj3 = obj2;
                                try {
                                    blh1.c.f(obj3, jX, dVar2.a.j());
                                    obj2 = obj3;
                                    gVar.G(iA, obj2);
                                } catch (InvalidProtocolBufferException$InvalidWireTypeException unused) {
                                    obj2 = obj3;
                                    try {
                                        jVar.getClass();
                                        if (kVarA == null) {
                                            kVarA = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVarA)) {
                                            for (i3 = i; i3 < i4; i3++) {
                                                gVar.k(iArr[i3], obj2, kVarA);
                                            }
                                            if (kVarA == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        for (i2 = i; i2 < i4; i2++) {
                                            gVar.k(iArr[i2], obj2, kVarA);
                                        }
                                        if (kVarA != null) {
                                            ((l) jVar).getClass();
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj3;
                                    while (i2 < i4) {
                                        gVar.k(iArr[i2], obj2, kVarA);
                                    }
                                    if (kVarA != null) {
                                        ((l) jVar).getClass();
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                    throw th;
                                }
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 1:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX2 = x(iJ);
                                dVar2.w(5);
                                blh1.c.g(obj2, jX2, dVar2.a.n());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 2:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX3 = x(iJ);
                                dVar2.w(0);
                                blh1.o(obj2, jX3, dVar2.a.p());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 3:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX4 = x(iJ);
                                dVar2.w(0);
                                blh1.o(obj2, jX4, dVar2.a.y());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 4:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX5 = x(iJ);
                                dVar2.w(0);
                                blh1.n(obj2, dVar2.a.o(), jX5);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 5:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX6 = x(iJ);
                                dVar2.w(1);
                                blh1.o(obj2, jX6, dVar2.a.m());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 6:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX7 = x(iJ);
                                dVar2.w(5);
                                blh1.n(obj2, dVar2.a.l(), jX7);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 7:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX8 = x(iJ);
                                dVar2.w(0);
                                blh1.c.d(obj2, jX8, dVar2.a.h());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 8:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                gVar.D(iJ, dVar2, obj2);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 9:
                                sz00 sz00Var3 = sz00Var2;
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                a aVar = (a) gVar.u(iA, obj2);
                                qm41 qm41VarM = gVar.m(iA);
                                dVar2.w(2);
                                dVar2.d(aVar, qm41VarM, sz00Var3);
                                unsafe.putObject(obj2, gVar.J(iA) & 1048575, aVar);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 10:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                blh1.p(obj2, x(iJ), dVar2.f());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 11:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX9 = x(iJ);
                                dVar2.w(0);
                                blh1.n(obj2, dVar2.a.x(), jX9);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 12:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                dVar2.w(0);
                                int iK = dVar2.a.k();
                                gVar.l(iA);
                                blh1.n(obj2, iK, x(iJ));
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 13:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX10 = x(iJ);
                                dVar2.w(5);
                                blh1.n(obj2, dVar2.a.q(), jX10);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 14:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX11 = x(iJ);
                                dVar2.w(1);
                                blh1.o(obj2, jX11, dVar2.a.r());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 15:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX12 = x(iJ);
                                dVar2.w(0);
                                blh1.n(obj2, dVar2.a.s(), jX12);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 16:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX13 = x(iJ);
                                dVar2.w(0);
                                blh1.o(obj2, jX13, dVar2.a.t());
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 17:
                                sz00 sz00Var4 = sz00Var2;
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                a aVar2 = (a) gVar.u(iA, obj2);
                                qm41 qm41VarM2 = gVar.m(iA);
                                dVar2.w(3);
                                dVar2.c(aVar2, qm41VarM2, sz00Var4);
                                unsafe.putObject(obj2, gVar.J(iA) & 1048575, aVar2);
                                gVar.G(iA, obj2);
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 18:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX14 = x(iJ);
                                stc0Var.getClass();
                                dVar2.h(stc0.a(jX14, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 19:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX15 = x(iJ);
                                stc0Var.getClass();
                                dVar2.l(stc0.a(jX15, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 20:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX16 = x(iJ);
                                stc0Var.getClass();
                                dVar2.n(stc0.a(jX16, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 21:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX17 = x(iJ);
                                stc0Var.getClass();
                                dVar2.u(stc0.a(jX17, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 22:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX18 = x(iJ);
                                stc0Var.getClass();
                                dVar2.m(stc0.a(jX18, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 23:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX19 = x(iJ);
                                stc0Var.getClass();
                                dVar2.k(stc0.a(jX19, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 24:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX20 = x(iJ);
                                stc0Var.getClass();
                                dVar2.j(stc0.a(jX20, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 25:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                long jX21 = x(iJ);
                                stc0Var.getClass();
                                dVar2.e(stc0.a(jX21, obj2));
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 26:
                                i = i5;
                                gVar = gVar;
                                dVar2 = dVar3;
                                try {
                                    gVar.E(iJ, dVar2, obj2);
                                } catch (InvalidProtocolBufferException$InvalidWireTypeException unused2) {
                                    jVar.getClass();
                                    if (kVarA == null) {
                                        kVarA = jVar.a(obj2);
                                    }
                                    if (!jVar.b(0, dVar2, kVarA)) {
                                        while (i3 < i4) {
                                            gVar.k(iArr[i3], obj2, kVarA);
                                        }
                                        if (kVarA == null) {
                                            return;
                                        }
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                }
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                i = i5;
                                try {
                                    try {
                                        gVar.C(obj2, iJ, dVar3, gVar.m(iA), sz00Var);
                                        dVar2 = dVar3;
                                        gVar = gVar;
                                    } catch (InvalidProtocolBufferException$InvalidWireTypeException unused3) {
                                        dVar2 = dVar3;
                                        gVar = gVar;
                                        jVar.getClass();
                                        if (kVarA == null) {
                                            kVarA = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVarA)) {
                                            while (i3 < i4) {
                                                gVar.k(iArr[i3], obj2, kVarA);
                                            }
                                            if (kVarA == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException$InvalidWireTypeException unused4) {
                                    dVar2 = dVar3;
                                    jVar.getClass();
                                    if (kVarA == null) {
                                        kVarA = jVar.a(obj2);
                                    }
                                    if (!jVar.b(0, dVar2, kVarA)) {
                                        while (i3 < i4) {
                                            gVar.k(iArr[i3], obj2, kVarA);
                                        }
                                        if (kVarA == null) {
                                            return;
                                        }
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                }
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                i = i5;
                                long jX22 = x(iJ);
                                stc0Var.getClass();
                                dVar3.g(stc0.a(jX22, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                i = i5;
                                long jX23 = x(iJ);
                                stc0Var.getClass();
                                dVar3.t(stc0.a(jX23, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case RendererMetrics.SAMPLES /* 30 */:
                                i = i5;
                                long jX24 = x(iJ);
                                stc0Var.getClass();
                                f290 f290VarA = stc0.a(jX24, obj2);
                                dVar3.i(f290VarA);
                                gVar.l(iA);
                                i.j(obj2, iB, f290VarA, kVarA, jVar);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 31:
                                i = i5;
                                long jX25 = x(iJ);
                                stc0Var.getClass();
                                dVar3.o(stc0.a(jX25, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 32:
                                i = i5;
                                long jX26 = x(iJ);
                                stc0Var.getClass();
                                dVar3.p(stc0.a(jX26, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                i = i5;
                                long jX27 = x(iJ);
                                stc0Var.getClass();
                                dVar3.q(stc0.a(jX27, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                i = i5;
                                long jX28 = x(iJ);
                                stc0Var.getClass();
                                dVar3.r(stc0.a(jX28, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                i = i5;
                                long jX29 = x(iJ);
                                stc0Var.getClass();
                                dVar3.h(stc0.a(jX29, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                                i = i5;
                                long jX30 = x(iJ);
                                stc0Var.getClass();
                                dVar3.l(stc0.a(jX30, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                i = i5;
                                long jX31 = x(iJ);
                                stc0Var.getClass();
                                dVar3.n(stc0.a(jX31, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                i = i5;
                                long jX32 = x(iJ);
                                stc0Var.getClass();
                                dVar3.u(stc0.a(jX32, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                i = i5;
                                long jX33 = x(iJ);
                                stc0Var.getClass();
                                dVar3.m(stc0.a(jX33, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                i = i5;
                                long jX34 = x(iJ);
                                stc0Var.getClass();
                                dVar3.k(stc0.a(jX34, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                i = i5;
                                long jX35 = x(iJ);
                                stc0Var.getClass();
                                dVar3.j(stc0.a(jX35, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                i = i5;
                                long jX36 = x(iJ);
                                stc0Var.getClass();
                                dVar3.e(stc0.a(jX36, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                i = i5;
                                long jX37 = x(iJ);
                                stc0Var.getClass();
                                dVar3.t(stc0.a(jX37, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                i = i5;
                                long jX38 = x(iJ);
                                stc0Var.getClass();
                                f290 f290VarA2 = stc0.a(jX38, obj2);
                                dVar3.i(f290VarA2);
                                gVar.l(iA);
                                i.j(obj2, iB, f290VarA2, kVarA, jVar);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                i = i5;
                                long jX39 = x(iJ);
                                stc0Var.getClass();
                                dVar3.o(stc0.a(jX39, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                i = i5;
                                long jX40 = x(iJ);
                                stc0Var.getClass();
                                dVar3.p(stc0.a(jX40, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                i = i5;
                                long jX41 = x(iJ);
                                stc0Var.getClass();
                                dVar3.q(stc0.a(jX41, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 48:
                                i = i5;
                                long jX42 = x(iJ);
                                stc0Var.getClass();
                                dVar3.r(stc0.a(jX42, obj2));
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                i = i5;
                                try {
                                    try {
                                        gVar.B(obj2, x(iJ), dVar, gVar.m(iA), sz00Var);
                                        dVar3 = dVar;
                                        dVar2 = dVar3;
                                    } catch (InvalidProtocolBufferException$InvalidWireTypeException unused5) {
                                        gVar = gVar;
                                        dVar2 = dVar;
                                        jVar.getClass();
                                        if (kVarA == null) {
                                            kVarA = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVarA)) {
                                            while (i3 < i4) {
                                                gVar.k(iArr[i3], obj2, kVarA);
                                            }
                                            if (kVarA == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException$InvalidWireTypeException unused6) {
                                    dVar2 = dVar;
                                    gVar = gVar;
                                    jVar.getClass();
                                    if (kVarA == null) {
                                        kVarA = jVar.a(obj2);
                                    }
                                    if (!jVar.b(0, dVar2, kVarA)) {
                                        while (i3 < i4) {
                                            gVar.k(iArr[i3], obj2, kVarA);
                                        }
                                        if (kVarA == null) {
                                            return;
                                        }
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                    gVar = gVar;
                                    dVar3 = dVar2;
                                    i5 = i;
                                    sz00Var2 = sz00Var;
                                    break;
                                }
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                i = i5;
                                gVar.r(iA, obj2, gVar.b[(iA / 3) * 2]);
                                throw null;
                            case 51:
                                i = i5;
                                long jX43 = x(iJ);
                                dVar3.w(1);
                                blh1.p(obj2, jX43, Double.valueOf(dVar3.a.j()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 52:
                                i = i5;
                                long jX44 = x(iJ);
                                dVar3.w(5);
                                blh1.p(obj2, jX44, Float.valueOf(dVar3.a.n()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 53:
                                i = i5;
                                long jX45 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX45, Long.valueOf(dVar3.a.p()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 54:
                                i = i5;
                                long jX46 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX46, Long.valueOf(dVar3.a.y()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 55:
                                i = i5;
                                long jX47 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX47, Integer.valueOf(dVar3.a.o()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 56:
                                i = i5;
                                long jX48 = x(iJ);
                                dVar3.w(1);
                                blh1.p(obj2, jX48, Long.valueOf(dVar3.a.m()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 57:
                                i = i5;
                                long jX49 = x(iJ);
                                dVar3.w(5);
                                blh1.p(obj2, jX49, Integer.valueOf(dVar3.a.l()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 58:
                                i = i5;
                                long jX50 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX50, Boolean.valueOf(dVar3.a.h()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 59:
                                i = i5;
                                gVar.D(iJ, dVar3, obj2);
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 60:
                                i = i5;
                                a aVar3 = (a) gVar.v(iB, iA, obj2);
                                qm41 qm41VarM3 = gVar.m(iA);
                                dVar3.w(2);
                                dVar3.d(aVar3, qm41VarM3, sz00Var2);
                                unsafe.putObject(obj2, gVar.J(iA) & 1048575, aVar3);
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 61:
                                i = i5;
                                blh1.p(obj2, x(iJ), dVar3.f());
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 62:
                                i = i5;
                                long jX51 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX51, Integer.valueOf(dVar3.a.x()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 63:
                                i = i5;
                                dVar3.w(0);
                                int iK2 = dVar3.a.k();
                                gVar.l(iA);
                                blh1.p(obj2, x(iJ), Integer.valueOf(iK2));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 64:
                                i = i5;
                                long jX52 = x(iJ);
                                dVar3.w(5);
                                blh1.p(obj2, jX52, Integer.valueOf(dVar3.a.q()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 65:
                                i = i5;
                                long jX53 = x(iJ);
                                dVar3.w(1);
                                blh1.p(obj2, jX53, Long.valueOf(dVar3.a.r()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 66:
                                i = i5;
                                long jX54 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX54, Integer.valueOf(dVar3.a.s()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 67:
                                i = i5;
                                long jX55 = x(iJ);
                                dVar3.w(0);
                                blh1.p(obj2, jX55, Long.valueOf(dVar3.a.t()));
                                gVar.H(iB, iA, obj2);
                                dVar2 = dVar3;
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            case 68:
                                try {
                                    a aVar4 = (a) gVar.v(iB, iA, obj2);
                                    qm41 qm41VarM4 = gVar.m(iA);
                                    dVar3.w(3);
                                    dVar3.c(aVar4, qm41VarM4, sz00Var2);
                                    i = i5;
                                    try {
                                        try {
                                            unsafe.putObject(obj2, gVar.J(iA) & 1048575, aVar4);
                                            gVar.H(iB, iA, obj2);
                                            dVar2 = dVar3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            gVar = gVar;
                                            while (i2 < i4) {
                                                gVar.k(iArr[i2], obj2, kVarA);
                                            }
                                            if (kVarA != null) {
                                                ((l) jVar).getClass();
                                                ((e) obj2).unknownFields = kVarA;
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException$InvalidWireTypeException unused7) {
                                        dVar2 = dVar3;
                                        jVar.getClass();
                                        if (kVarA == null) {
                                            kVarA = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVarA)) {
                                            while (i3 < i4) {
                                                gVar.k(iArr[i3], obj2, kVarA);
                                            }
                                            if (kVarA == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                    }
                                } catch (InvalidProtocolBufferException$InvalidWireTypeException unused8) {
                                    i = i5;
                                    dVar2 = dVar3;
                                    jVar.getClass();
                                    if (kVarA == null) {
                                        kVarA = jVar.a(obj2);
                                    }
                                    if (!jVar.b(0, dVar2, kVarA)) {
                                        while (i3 < i4) {
                                            gVar.k(iArr[i3], obj2, kVarA);
                                        }
                                        if (kVarA == null) {
                                            return;
                                        }
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = i5;
                                    gVar = gVar;
                                    while (i2 < i4) {
                                        gVar.k(iArr[i2], obj2, kVarA);
                                    }
                                    if (kVarA != null) {
                                        ((l) jVar).getClass();
                                        ((e) obj2).unknownFields = kVarA;
                                    }
                                    throw th;
                                }
                                gVar = gVar;
                                dVar3 = dVar2;
                                i5 = i;
                                sz00Var2 = sz00Var;
                                break;
                            default:
                                if (kVarA == null) {
                                    try {
                                        kVarA = jVar.a(obj2);
                                    } catch (InvalidProtocolBufferException$InvalidWireTypeException unused9) {
                                        i = i5;
                                        dVar2 = dVar3;
                                        jVar.getClass();
                                        if (kVarA == null) {
                                            kVarA = jVar.a(obj2);
                                        }
                                        if (!jVar.b(0, dVar2, kVarA)) {
                                            while (i3 < i4) {
                                                gVar.k(iArr[i3], obj2, kVarA);
                                            }
                                            if (kVarA == null) {
                                                return;
                                            }
                                            ((e) obj2).unknownFields = kVarA;
                                        }
                                    }
                                }
                                if (jVar.b(0, dVar3, kVarA)) {
                                    i = i5;
                                    dVar2 = dVar3;
                                    gVar = gVar;
                                    dVar3 = dVar2;
                                    i5 = i;
                                    sz00Var2 = sz00Var;
                                } else {
                                    while (i5 < i4) {
                                        gVar.k(iArr[i5], obj2, kVarA);
                                        i5++;
                                    }
                                    if (kVarA == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException$InvalidWireTypeException unused10) {
                        i = i5;
                    }
                } else if (iB == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        gVar.k(iArr[i5], obj2, kVarA);
                        i5++;
                    }
                    if (kVarA == null) {
                        return;
                    } else {
                        ((l) jVar).getClass();
                    }
                } else {
                    jVar.getClass();
                    if (kVarA == null) {
                        kVarA = jVar.a(obj2);
                    }
                    if (!jVar.b(0, dVar3, kVarA)) {
                        while (i5 < i4) {
                            gVar.k(iArr[i5], obj2, kVarA);
                            i5++;
                        }
                        if (kVarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                gVar = gVar;
                i = i5;
            }
        }
        ((e) obj2).unknownFields = kVarA;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // p.qm41
    public final boolean i(e eVar, e eVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iJ = J(i);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!j(eVar, eVar2, i)) {
                            zL = false;
                        } else {
                            zkh1 zkh1Var = blh1.c;
                            if (Double.doubleToLongBits(zkh1Var.b(j, eVar)) != Double.doubleToLongBits(zkh1Var.b(j, eVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(eVar, eVar2, i)) {
                            zL = false;
                        } else {
                            zkh1 zkh1Var2 = blh1.c;
                            if (Float.floatToIntBits(zkh1Var2.c(j, eVar)) != Float.floatToIntBits(zkh1Var2.c(j, eVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(eVar, eVar2, i) || blh1.h(j, eVar) != blh1.h(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 3:
                        if (!j(eVar, eVar2, i) || blh1.h(j, eVar) != blh1.h(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 4:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 5:
                        if (!j(eVar, eVar2, i) || blh1.h(j, eVar) != blh1.h(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 6:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 7:
                        if (!j(eVar, eVar2, i)) {
                            zL = false;
                        } else {
                            zkh1 zkh1Var3 = blh1.c;
                            if (zkh1Var3.a(j, eVar) != zkh1Var3.a(j, eVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(eVar, eVar2, i) || !i.l(blh1.i(j, eVar), blh1.i(j, eVar2))) {
                            zL = false;
                        }
                        break;
                    case 9:
                        if (!j(eVar, eVar2, i) || !i.l(blh1.i(j, eVar), blh1.i(j, eVar2))) {
                            zL = false;
                        }
                        break;
                    case 10:
                        if (!j(eVar, eVar2, i) || !i.l(blh1.i(j, eVar), blh1.i(j, eVar2))) {
                            zL = false;
                        }
                        break;
                    case 11:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 12:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 13:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 14:
                        if (!j(eVar, eVar2, i) || blh1.h(j, eVar) != blh1.h(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 15:
                        if (!j(eVar, eVar2, i) || blh1.g(j, eVar) != blh1.g(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 16:
                        if (!j(eVar, eVar2, i) || blh1.h(j, eVar) != blh1.h(j, eVar2)) {
                            zL = false;
                        }
                        break;
                    case 17:
                        if (!j(eVar, eVar2, i) || !i.l(blh1.i(j, eVar), blh1.i(j, eVar2))) {
                            zL = false;
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
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case RendererMetrics.SAMPLES /* 30 */:
                    case 31:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        zL = i.l(blh1.i(j, eVar), blh1.i(j, eVar2));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        zL = i.l(blh1.i(j, eVar), blh1.i(j, eVar2));
                        break;
                    case 51:
                    case 52:
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
                        if (blh1.g(j2, eVar) != blh1.g(j2, eVar2) || !i.l(blh1.i(j, eVar), blh1.i(j, eVar2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                l lVar = (l) this.l;
                lVar.getClass();
                k kVar = eVar.unknownFields;
                lVar.getClass();
                if (kVar.equals(eVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(e eVar, e eVar2, int i) {
        return n(i, eVar) == n(i, eVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (blh1.i(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[cy30.x(i, 3, 2, 1)] == null) {
            return;
        }
        bhn0.d();
    }

    public final qm41 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        qm41 qm41Var = (qm41) objArr[i2];
        if (qm41Var != null) {
            return qm41Var;
        }
        qm41 qm41VarB = liy0.c.b((Class) objArr[i2 + 1]);
        objArr[i2] = qm41VarB;
        return qm41VarB;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & blh1.g(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(blh1.c.b(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(blh1.c.c(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (blh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (blh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (blh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return blh1.c.a(j2, obj);
            case 8:
                Object objI = blh1.i(j2, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof fhc) {
                    return !fhc.c.equals(objI);
                }
                bhn0.q();
                return false;
            case 9:
                if (blh1.i(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !fhc.c.equals(blh1.i(j2, obj));
            case 11:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (blh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (blh1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (blh1.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (blh1.i(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return blh1.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(int i, Object obj, Object obj2) {
        long J = J(i) & 1048575;
        Object objI = blh1.i(J, obj);
        ung0 ung0Var = this.m;
        if (objI != null) {
            ung0Var.getClass();
            if (!((ong0) objI).a) {
                Object objD = ong0.b.d();
                ung0.a(objD, objI);
                blh1.p(obj, J, objD);
                objI = objD;
            }
        } else {
            ung0Var.getClass();
            objI = ong0.b.d();
            blh1.p(obj, J, objI);
        }
        ung0Var.getClass();
        pze0.m(obj2);
        throw null;
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            qm41 qm41VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    e eVarC = qm41VarM.c();
                    qm41VarM.d(eVarC, object);
                    unsafe.putObject(obj, J, eVarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                e eVarC2 = qm41VarM.c();
                qm41VarM.d(eVarC2, object2);
                unsafe.putObject(obj, J, eVarC2);
                object2 = eVarC2;
            }
            qm41VarM.d(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            qm41 qm41VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    e eVarC = qm41VarM.c();
                    qm41VarM.d(eVarC, object);
                    unsafe.putObject(obj, J, eVarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                e eVarC2 = qm41VarM.c();
                qm41VarM.d(eVarC2, object2);
                unsafe.putObject(obj, J, eVarC2);
                object2 = eVarC2;
            }
            qm41VarM.d(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        qm41 qm41VarM = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return qm41VarM.c();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        e eVarC = qm41VarM.c();
        if (object != null) {
            qm41VarM.d(eVarC, object);
        }
        return eVarC;
    }

    public final Object v(int i, int i2, Object obj) {
        qm41 qm41VarM = m(i2);
        if (!q(i, i2, obj)) {
            return qm41VarM.c();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        e eVarC = qm41VarM.c();
        if (object != null) {
            qm41VarM.d(eVarC, object);
        }
        return eVarC;
    }
}
