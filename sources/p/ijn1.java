package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzakh;
import com.google.android.recaptcha.internal.zzalr;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ijn1 implements qjn1 {
    public static final int[] j = new int[0];
    public static final Unsafe k = dkn1.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final nhn1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public ijn1(int[] iArr, Object[] objArr, int i, int i2, nhn1 nhn1Var, int[] iArr2, int i3, int i4, cen1 cen1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = nhn1Var instanceof rin1;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = nhn1Var;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof rin1) {
            return ((rin1) obj).v();
        }
        return true;
    }

    public static void k(Object obj) {
        if (j(obj)) {
            return;
        }
        hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int l(long j2, Object obj) {
        return ((Integer) dkn1.e(j2, obj)).intValue();
    }

    public static long m(long j2, Object obj) {
        return ((Long) dkn1.e(j2, obj)).longValue();
    }

    public static Field v(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            bb00.j(sb, "Field ", str, " for ", name);
            bhn0.o(l1d.n(" not found. Known fields are ", string, sb), e);
            return null;
        }
    }

    public final fnn1 A(int i) {
        int i2 = i / 3;
        return (fnn1) this.b[i2 + i2 + 1];
    }

    public final Object B(int i, Object obj) {
        qjn1 qjn1VarY = y(i);
        int i2 = i(i) & 1048575;
        if (!p(i, obj)) {
            return qjn1VarY.zza();
        }
        Object object = k.getObject(obj, i2);
        if (j(object)) {
            return object;
        }
        rin1 rin1VarZza = qjn1VarY.zza();
        if (object != null) {
            qjn1VarY.a(rin1VarZza, object);
        }
        return rin1VarZza;
    }

    public final void C(int i, Object obj, Object obj2) {
        k.putObject(obj, i(i) & 1048575, obj2);
        q(i, obj);
    }

    public final Object D(int i, int i2, Object obj) {
        qjn1 qjn1VarY = y(i2);
        if (!r(i, i2, obj)) {
            return qjn1VarY.zza();
        }
        Object object = k.getObject(obj, i(i2) & 1048575);
        if (j(object)) {
            return object;
        }
        rin1 rin1VarZza = qjn1VarY.zza();
        if (object != null) {
            qjn1VarY.a(rin1VarZza, object);
        }
        return rin1VarZza;
    }

    public final void E(Object obj, int i, int i2, Object obj2) {
        k.putObject(obj, i(i2) & 1048575, obj2);
        s(i, i2, obj);
    }

    public final void F(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object objE = dkn1.e(i(i) & 1048575, obj);
        if (objE == null || A(i) == null) {
            return;
        }
        z(i).getClass();
        bhn0.d();
    }

    public final void G(int i, Object obj, a9a a9aVar) {
        din1 din1Var = (din1) a9aVar.e;
        long j2 = i & 1048575;
        if ((536870912 & i) != 0) {
            a9aVar.H(2);
            dkn1.f(obj, j2, din1Var.o());
        } else if (!this.f) {
            dkn1.f(obj, j2, a9aVar.O());
        } else {
            a9aVar.H(2);
            dkn1.f(obj, j2, din1Var.n());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p.qjn1
    public final void a(Object obj, Object obj2) {
        Object obj3;
        k(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                aqo1.z(obj, obj2);
                return;
            }
            int i2 = i(i);
            int i3 = iArr[i];
            long j2 = 1048575 & i2;
            switch ((i2 >>> 20) & 255) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (!p(i, obj2)) {
                        obj3 = obj;
                    } else {
                        zkh1 zkh1Var = dkn1.c;
                        obj3 = obj;
                        zkh1Var.y(obj3, j2, zkh1Var.u(j2, obj2));
                        q(i, obj3);
                    }
                    break;
                case 1:
                    if (p(i, obj2)) {
                        zkh1 zkh1Var2 = dkn1.c;
                        zkh1Var2.t(obj, j2, zkh1Var2.p(j2, obj2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i, obj2)) {
                        dkn1.d(obj, j2, dkn1.c(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        dkn1.d(obj, j2, dkn1.c(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        dkn1.d(obj, j2, dkn1.c(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i, obj2)) {
                        zkh1 zkh1Var3 = dkn1.c;
                        zkh1Var3.n(obj, j2, zkh1Var3.l(j2, obj2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        dkn1.f(obj, j2, dkn1.e(j2, obj2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        dkn1.f(obj, j2, dkn1.e(j2, obj2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case grn1.d /* 12 */:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        dkn1.d(obj, j2, dkn1.c(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        dkn1.b(obj, dkn1.a(j2, obj2), j2);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        dkn1.d(obj, j2, dkn1.c(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
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
                case 46:
                case 47:
                case 48:
                case 49:
                    win1 win1VarZzg = (win1) dkn1.e(j2, obj);
                    win1 win1Var = (win1) dkn1.e(j2, obj2);
                    int size = win1VarZzg.size();
                    int size2 = win1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((ohn1) win1VarZzg).a) {
                            win1VarZzg = win1VarZzg.zzg(size2 + size);
                        }
                        win1VarZzg.addAll(win1Var);
                    }
                    if (size > 0) {
                        win1Var = win1VarZzg;
                    }
                    dkn1.f(obj, j2, win1Var);
                    obj3 = obj;
                    break;
                case 50:
                    dkn1.f(obj, j2, b3o1.C(dkn1.e(j2, obj), dkn1.e(j2, obj2)));
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
                    if (r(i3, i, obj2)) {
                        dkn1.f(obj, j2, dkn1.e(j2, obj2));
                        s(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i3, i, obj2)) {
                        dkn1.f(obj, j2, dkn1.e(j2, obj2));
                        s(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    x(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[SYNTHETIC] */
    @Override // p.qjn1
    public final void b(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof rin1) {
            rin1 rin1Var = (rin1) obj;
            rin1Var.j(Integer.MAX_VALUE);
            rin1Var.zzb = 0;
            rin1Var.w();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                bkn1 bkn1Var = ((rin1) obj).zzc;
                if (bkn1Var.e) {
                    bkn1Var.e = false;
                    return;
                }
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int i4 = (i2 >>> 20) & 255;
            long j2 = i3;
            Unsafe unsafe = k;
            if (i4 != 9) {
                if (i4 != 60 && i4 != 68) {
                    switch (i4) {
                        case 17:
                            if (p(i, obj)) {
                                y(i).b(unsafe.getObject(obj, j2));
                            }
                            break;
                        case 18:
                        case 19:
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
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
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ohn1 ohn1Var = (ohn1) ((win1) dkn1.e(j2, obj));
                            if (ohn1Var.a) {
                                ohn1Var.a = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((gjn1) object).a = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (r(iArr[i], i, obj)) {
                    y(i).b(unsafe.getObject(obj, j2));
                }
            } else if (p(i, obj)) {
                y(i).b(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p.qjn1
    public final boolean c(rin1 rin1Var, rin1 rin1Var2) {
        boolean zB0;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = i(i);
                int i3 = (i2 >>> 20) & 255;
                if (i3 <= 50 || i3 >= 69) {
                    long j2 = i2 & 1048575;
                    switch (i3) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            if (n(rin1Var, rin1Var2, i)) {
                                zkh1 zkh1Var = dkn1.c;
                                if (Double.doubleToLongBits(zkh1Var.u(j2, rin1Var)) != Double.doubleToLongBits(zkh1Var.u(j2, rin1Var2))) {
                                }
                            }
                            break;
                        case 1:
                            if (n(rin1Var, rin1Var2, i)) {
                                zkh1 zkh1Var2 = dkn1.c;
                                if (Float.floatToIntBits(zkh1Var2.p(j2, rin1Var)) != Float.floatToIntBits(zkh1Var2.p(j2, rin1Var2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.c(rin1Var, j2) != dkn1.c(rin1Var2, j2)) {
                            }
                            break;
                        case 3:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.c(rin1Var, j2) != dkn1.c(rin1Var2, j2)) {
                            }
                            break;
                        case 4:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case 5:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.c(rin1Var, j2) != dkn1.c(rin1Var2, j2)) {
                            }
                            break;
                        case 6:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case 7:
                            if (n(rin1Var, rin1Var2, i)) {
                                zkh1 zkh1Var3 = dkn1.c;
                                if (zkh1Var3.l(j2, rin1Var) != zkh1Var3.l(j2, rin1Var2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!n(rin1Var, rin1Var2, i) || !aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2))) {
                            }
                            break;
                        case 9:
                            if (!n(rin1Var, rin1Var2, i) || !aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2))) {
                            }
                            break;
                        case 10:
                            if (!n(rin1Var, rin1Var2, i) || !aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2))) {
                            }
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case grn1.d /* 12 */:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case 13:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case 14:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.c(rin1Var, j2) != dkn1.c(rin1Var2, j2)) {
                            }
                            break;
                        case 15:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.a(j2, rin1Var) != dkn1.a(j2, rin1Var2)) {
                            }
                            break;
                        case 16:
                            if (!n(rin1Var, rin1Var2, i) || dkn1.c(rin1Var, j2) != dkn1.c(rin1Var2, j2)) {
                            }
                            break;
                        case 17:
                            if (!n(rin1Var, rin1Var2, i) || !aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
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
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zB0 = aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2));
                            if (zB0) {
                            }
                            break;
                        case 50:
                            zB0 = aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2));
                            if (zB0) {
                            }
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
                            long j3 = iArr[i + 2] & 1048575;
                            if (dkn1.a(j3, rin1Var) == dkn1.a(j3, rin1Var2) && aqo1.b0(dkn1.e(j2, rin1Var), dkn1.e(j2, rin1Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i4 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i4 < iArr2.length) {
                        int i5 = iArr2[i4];
                        long j4 = iArr[i5 + 2] & 1048575;
                        if (dkn1.a(j4, rin1Var) != dkn1.a(j4, rin1Var2)) {
                            return false;
                        }
                        if (!r(0, i5, rin1Var)) {
                            long jI = i(i5) & 1048575;
                            if (!aqo1.b0(dkn1.e(jI, rin1Var), dkn1.e(jI, rin1Var2))) {
                            }
                        }
                        i4++;
                    } else if (rin1Var.zzc.equals(rin1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0458  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0696, code lost:
    
        if (o(r1, r2, r3, r4, r5) != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0698, code lost:
    
        r0 = (p.gvg.b(r11 << 3, 9, 352) >>> 6) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06ab, code lost:
    
        if (o(r1, r2, r3, r4, r5) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06ad, code lost:
    
        r0 = (p.gvg.b(r11 << 3, 9, 352) >>> 6) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0763, code lost:
    
        if (o(r1, r2, r3, r4, r5) != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x076b, code lost:
    
        if (o(r1, r2, r3, r4, r5) != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x07b9, code lost:
    
        if (o(r1, r2, r3, r4, r5) != false) goto L239;
     */
    @Override // p.qjn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(p.rin1 r18) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ijn1.d(p.rin1):int");
    }

    @Override // p.qjn1
    public final void e(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        u(obj, bArr, i, i2, 0, qhn1Var);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0678 A[LOOP:2: B:137:0x0676->B:138:0x0678, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0682  */
    /* JADX WARN: Code duplicated, block: B:150:0x066b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    @Override // p.qjn1
    public final void f(Object obj, a9a a9aVar, hin1 hin1Var) throws Throwable {
        int[] iArr;
        din1 din1Var;
        din1 din1Var2 = (din1) a9aVar.e;
        int[] iArr2 = this.g;
        int i = this.i;
        int i2 = this.h;
        hin1Var.getClass();
        k(obj);
        Object objE = null;
        while (true) {
            try {
                int iN = a9aVar.N();
                int iT = (iN < this.c || iN > this.d) ? -1 : t(iN, 0);
                if (iT >= 0) {
                    int i3 = i(iT);
                    switch ((i3 >>> 20) & 255) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.c.y(obj, i3 & 1048575, din1Var.f());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 1:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.c.t(obj, i3 & 1048575, din1Var.g());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 2:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.d(obj, i3 & 1048575, din1Var.i());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 3:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.d(obj, i3 & 1048575, din1Var.h());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 4:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.b(obj, din1Var.j(), i3 & 1048575);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 5:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.d(obj, i3 & 1048575, din1Var.k());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 6:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.b(obj, din1Var.l(), i3 & 1048575);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 7:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.c.n(obj, i3 & 1048575, din1Var.m());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 8:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            G(i3, obj, a9aVar);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 9:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            nhn1 nhn1Var = (nhn1) B(iT, obj);
                            qjn1 qjn1VarY = y(iT);
                            a9aVar.H(2);
                            a9aVar.I(nhn1Var, qjn1VarY, hin1Var);
                            C(iT, obj, nhn1Var);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 10:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            dkn1.f(obj, i3 & 1048575, a9aVar.O());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.b(obj, din1Var.q(), i3 & 1048575);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case grn1.d /* 12 */:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            int iR = din1Var.r();
                            if (A(iT) == null || fnn1.a(iR)) {
                                dkn1.b(obj, iR, i3 & 1048575);
                                q(iT, obj);
                            } else {
                                objE = aqo1.B(obj, iN, iR, objE);
                            }
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 13:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.b(obj, din1Var.s(), i3 & 1048575);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 14:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.d(obj, i3 & 1048575, din1Var.t());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 15:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.b(obj, din1Var.u(), i3 & 1048575);
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 16:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.d(obj, i3 & 1048575, din1Var.v());
                            q(iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 17:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            nhn1 nhn1Var2 = (nhn1) B(iT, obj);
                            qjn1 qjn1VarY2 = y(iT);
                            a9aVar.H(3);
                            a9aVar.J(nhn1Var2, qjn1VarY2, hin1Var);
                            C(iT, obj, nhn1Var2);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 18:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.P(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 19:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.Q(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.S(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 21:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.R(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 22:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.t(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 23:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.u(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 24:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.v(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 25:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.w(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 26:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            if ((536870912 & i3) != 0) {
                                a9aVar.x(y2o1.P(i3 & 1048575, obj), true);
                            } else {
                                a9aVar.x(y2o1.P(i3 & 1048575, obj), false);
                            }
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 27:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.y(y2o1.P(i3 & 1048575, obj), y(iT), hin1Var);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 28:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.A(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 29:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.B(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 30:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            win1 win1VarP = y2o1.P(i3 & 1048575, obj);
                            a9aVar.C(win1VarP);
                            objE = aqo1.A(obj, iN, win1VarP, A(iT), objE);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 31:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.D(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 32:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.E(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 33:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.F(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 34:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.G(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 35:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.P(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 36:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.Q(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 37:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.S(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 38:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.R(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 39:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.t(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 40:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.u(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 41:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.v(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 42:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.w(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 43:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.B(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 44:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            win1 win1VarP2 = y2o1.P(i3 & 1048575, obj);
                            a9aVar.C(win1VarP2);
                            objE = aqo1.A(obj, iN, win1VarP2, A(iT), objE);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 45:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.D(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 46:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.E(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 47:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.F(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 48:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.G(y2o1.P(i3 & 1048575, obj));
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 49:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.z(y2o1.P(i3 & 1048575, obj), y(iT), hin1Var);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 50:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            Object objZ = z(iT);
                            long jI = i(iT) & 1048575;
                            Object objE2 = dkn1.e(jI, obj);
                            if (objE2 == null) {
                                objE2 = gjn1.b.a();
                                dkn1.f(obj, jI, objE2);
                            } else if (!((gjn1) objE2).a) {
                                Object objA = gjn1.b.a();
                                b3o1.C(objA, objE2);
                                dkn1.f(obj, jI, objA);
                                objE2 = objA;
                            }
                            pze0.m(objZ);
                            throw null;
                        case 51:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.f(obj, i3 & 1048575, Double.valueOf(din1Var.f()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 52:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.f(obj, i3 & 1048575, Float.valueOf(din1Var.g()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 53:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Long.valueOf(din1Var.i()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 54:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Long.valueOf(din1Var.h()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 55:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Integer.valueOf(din1Var.j()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 56:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.f(obj, i3 & 1048575, Long.valueOf(din1Var.k()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 57:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.f(obj, i3 & 1048575, Integer.valueOf(din1Var.l()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 58:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Boolean.valueOf(din1Var.m()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 59:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            G(i3, obj, a9aVar);
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 60:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            nhn1 nhn1Var3 = (nhn1) D(iN, iT, obj);
                            qjn1 qjn1VarY3 = y(iT);
                            a9aVar.H(2);
                            a9aVar.I(nhn1Var3, qjn1VarY3, hin1Var);
                            E(obj, iN, iT, nhn1Var3);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 61:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            dkn1.f(obj, i3 & 1048575, a9aVar.O());
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 62:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Integer.valueOf(din1Var.q()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 63:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            int iR2 = din1Var.r();
                            if (A(iT) == null || fnn1.a(iR2)) {
                                dkn1.f(obj, i3 & 1048575, Integer.valueOf(iR2));
                                s(iN, iT, obj);
                            } else {
                                objE = aqo1.B(obj, iN, iR2, objE);
                            }
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 64:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(5);
                            dkn1.f(obj, i3 & 1048575, Integer.valueOf(din1Var.s()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 65:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(1);
                            dkn1.f(obj, i3 & 1048575, Long.valueOf(din1Var.t()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 66:
                            din1Var = din1Var2;
                            iArr = iArr2;
                            a9aVar.H(0);
                            dkn1.f(obj, i3 & 1048575, Integer.valueOf(din1Var.u()));
                            s(iN, iT, obj);
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 67:
                            int i4 = i3 & 1048575;
                            a9aVar.H(0);
                            din1Var = din1Var2;
                            iArr = iArr2;
                            try {
                                dkn1.f(obj, i4, Long.valueOf(din1Var2.v()));
                                s(iN, iT, obj);
                            } catch (zzalr unused) {
                                if (objE == null) {
                                    try {
                                        objE = njx0.e(obj);
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i2 < i) {
                                            F(iArr[i2], obj, objE);
                                            i2++;
                                        }
                                        if (objE != null) {
                                            ((rin1) obj).zzc = (bkn1) objE;
                                        }
                                        throw th;
                                    }
                                }
                                if (!njx0.c(0, objE, a9aVar)) {
                                    while (i2 < i) {
                                        F(iArr[i2], obj, objE);
                                        i2++;
                                    }
                                    if (objE != null) {
                                        ((rin1) obj).zzc = (bkn1) objE;
                                    }
                                }
                            }
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        case 68:
                            nhn1 nhn1Var4 = (nhn1) D(iN, iT, obj);
                            qjn1 qjn1VarY4 = y(iT);
                            a9aVar.H(3);
                            a9aVar.J(nhn1Var4, qjn1VarY4, hin1Var);
                            E(obj, iN, iT, nhn1Var4);
                            din1Var = din1Var2;
                            iArr = iArr2;
                            iArr2 = iArr;
                            din1Var2 = din1Var;
                            break;
                        default:
                            if (objE == null) {
                                try {
                                    objE = njx0.e(obj);
                                } catch (zzalr unused2) {
                                    din1Var = din1Var2;
                                    iArr = iArr2;
                                    if (objE == null) {
                                        objE = njx0.e(obj);
                                    }
                                    if (!njx0.c(0, objE, a9aVar)) {
                                        while (i2 < i) {
                                            F(iArr[i2], obj, objE);
                                            i2++;
                                        }
                                    }
                                    iArr2 = iArr;
                                    din1Var2 = din1Var;
                                }
                                break;
                            }
                            if (!njx0.c(0, objE, a9aVar)) {
                                while (i2 < i) {
                                    F(iArr2[i2], obj, objE);
                                    i2++;
                                }
                            }
                            break;
                    }
                } else if (iN == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        F(iArr2[i2], obj, objE);
                        i2++;
                    }
                } else {
                    if (objE == null) {
                        objE = njx0.e(obj);
                    }
                    if (!njx0.c(0, objE, a9aVar)) {
                        while (i2 < i) {
                            F(iArr2[i2], obj, objE);
                            i2++;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                iArr = iArr2;
            }
        }
        if (objE != null) {
            ((rin1) obj).zzc = (bkn1) objE;
        }
    }

    @Override // p.qjn1
    public final int g(rin1 rin1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int i6 = i(i5);
            int i7 = (i6 >>> 20) & 255;
            if (i7 <= 50 || i7 >= 69) {
                long j2 = i6 & 1048575;
                int iHashCode2 = 37;
                switch (i7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(dkn1.c.u(j2, rin1Var));
                        byte[] bArr = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(dkn1.c.p(j2, rin1Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = dkn1.c(rin1Var, j2);
                        byte[] bArr2 = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = dkn1.c(rin1Var, j2);
                        byte[] bArr3 = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = dkn1.c(rin1Var, j2);
                        byte[] bArr4 = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zL = dkn1.c.l(j2, rin1Var);
                        byte[] bArr5 = xin1.a;
                        i3 = zL ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) dkn1.e(j2, rin1Var)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objE = dkn1.e(j2, rin1Var);
                        if (objE != null) {
                            iHashCode2 = objE.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.e(j2, rin1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case grn1.d /* 12 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = dkn1.c(rin1Var, j2);
                        byte[] bArr6 = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.a(j2, rin1Var);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = dkn1.c(rin1Var, j2);
                        byte[] bArr7 = xin1.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objE2 = dkn1.e(j2, rin1Var);
                        if (objE2 != null) {
                            iHashCode2 = objE2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
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
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.e(j2, rin1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = dkn1.e(j2, rin1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i8 >= iArr.length) {
                return rin1Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i9 = iArr[i8];
            if (!r(0, i9, rin1Var)) {
                iHashCode = dkn1.e(i(i9) & 1048575, rin1Var).hashCode() + (iHashCode * 53);
            }
            i8++;
        }
    }

    @Override // p.qjn1
    public final void h(Object obj, ltf1 ltf1Var) throws zzakh {
        int i;
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((rin1) obj).zzc.b(ltf1Var);
                return;
            }
            int i6 = i(i4);
            int i7 = iArr[i4];
            int i8 = (i6 >>> 20) & 255;
            Unsafe unsafe = k;
            if (i8 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i2;
                if (i10 != i3) {
                    i5 = i10 == i2 ? 0 : unsafe.getInt(obj, i10);
                    i3 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j2 = i6 & i2;
            switch (i8) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.g0(i7, Double.doubleToRawLongBits(dkn1.c.u(j2, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.e0(i7, Float.floatToRawIntBits(dkn1.c.p(j2, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.f0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.f0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.c0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.g0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.e0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (o(obj, i4, i3, i5, i)) {
                        byte bL = dkn1.c.l(j2, obj);
                        w4c0Var.k0(i7 << 3);
                        int i11 = w4c0Var.c;
                        try {
                            int i12 = i11 + 1;
                            try {
                                ((byte[]) w4c0Var.e)[i11] = bL;
                                w4c0Var.c = i12;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i11 = i12;
                                throw new zzakh(i11, w4c0Var.b, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (o(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            w4c0Var.h0(i7, (String) object);
                        } else {
                            w4c0Var.i0(i7, (ain1) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (o(obj, i4, i3, i5, i)) {
                        ltf1Var.n(i7, unsafe.getObject(obj, j2), y(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.i0(i7, (ain1) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.d0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case grn1.d /* 12 */:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.c0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.e0(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (o(obj, i4, i3, i5, i)) {
                        w4c0Var.g0(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (o(obj, i4, i3, i5, i)) {
                        int i13 = unsafe.getInt(obj, j2);
                        w4c0Var.d0(i7, (i13 >> 31) ^ (i13 + i13));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (o(obj, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        w4c0Var.f0(i7, (j3 >> 63) ^ (j3 + j3));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (o(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        w4c0Var.b0(i7, 3);
                        y(i4).h((nhn1) object2, ltf1Var);
                        w4c0Var.b0(i7, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    aqo1.D(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    aqo1.E(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    aqo1.F(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    aqo1.G(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    aqo1.K(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    aqo1.I(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    aqo1.N(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    aqo1.Q(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i14 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof ajn1) {
                            ajn1 ajn1Var = (ajn1) list;
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                Object objZzc = ajn1Var.zzc();
                                if (objZzc instanceof String) {
                                    w4c0Var.h0(i14, (String) objZzc);
                                } else {
                                    w4c0Var.i0(i14, (ain1) objZzc);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                w4c0Var.h0(i14, (String) list.get(i16));
                            }
                        }
                    }
                    break;
                case 27:
                    int i17 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    qjn1 qjn1VarY = y(i4);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            ltf1Var.n(i17, list2.get(i18), qjn1VarY);
                        }
                    }
                    break;
                case 28:
                    int i19 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            w4c0Var.i0(i19, (ain1) list3.get(i20));
                        }
                    }
                    break;
                case 29:
                    aqo1.L(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    aqo1.P(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    aqo1.O(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    aqo1.J(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    aqo1.M(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    aqo1.H(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    aqo1.D(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 36:
                    aqo1.E(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 37:
                    aqo1.F(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 38:
                    aqo1.G(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 39:
                    aqo1.K(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 40:
                    aqo1.I(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 41:
                    aqo1.N(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 42:
                    aqo1.Q(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 43:
                    aqo1.L(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 44:
                    aqo1.P(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 45:
                    aqo1.O(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 46:
                    aqo1.J(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 47:
                    aqo1.M(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 48:
                    aqo1.H(iArr[i4], (List) unsafe.getObject(obj, j2), ltf1Var, true);
                    break;
                case 49:
                    int i21 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    qjn1 qjn1VarY2 = y(i4);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            nhn1 nhn1Var = (nhn1) list4.get(i22);
                            w4c0Var.b0(i21, 3);
                            qjn1VarY2.h(nhn1Var, ltf1Var);
                            w4c0Var.b0(i21, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        z(i4).getClass();
                        bhn0.d();
                        return;
                    }
                    break;
                case 51:
                    if (r(i7, i4, obj)) {
                        w4c0Var.g0(i7, Double.doubleToRawLongBits(((Double) dkn1.e(j2, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (r(i7, i4, obj)) {
                        w4c0Var.e0(i7, Float.floatToRawIntBits(((Float) dkn1.e(j2, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (r(i7, i4, obj)) {
                        w4c0Var.f0(i7, m(j2, obj));
                    }
                    break;
                case 54:
                    if (r(i7, i4, obj)) {
                        w4c0Var.f0(i7, m(j2, obj));
                    }
                    break;
                case 55:
                    if (r(i7, i4, obj)) {
                        w4c0Var.c0(i7, l(j2, obj));
                    }
                    break;
                case 56:
                    if (r(i7, i4, obj)) {
                        w4c0Var.g0(i7, m(j2, obj));
                    }
                    break;
                case 57:
                    if (r(i7, i4, obj)) {
                        w4c0Var.e0(i7, l(j2, obj));
                    }
                    break;
                case 58:
                    if (r(i7, i4, obj)) {
                        byte bBooleanValue = ((Boolean) dkn1.e(j2, obj)).booleanValue();
                        w4c0Var.k0(i7 << 3);
                        int i23 = w4c0Var.c;
                        try {
                            int i24 = i23 + 1;
                            try {
                                ((byte[]) w4c0Var.e)[i23] = bBooleanValue;
                                w4c0Var.c = i24;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                                i23 = i24;
                                throw new zzakh(i23, w4c0Var.b, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                    }
                    break;
                case 59:
                    if (r(i7, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            w4c0Var.h0(i7, (String) object3);
                        } else {
                            w4c0Var.i0(i7, (ain1) object3);
                        }
                    }
                    break;
                case 60:
                    if (r(i7, i4, obj)) {
                        ltf1Var.n(i7, unsafe.getObject(obj, j2), y(i4));
                    }
                    break;
                case 61:
                    if (r(i7, i4, obj)) {
                        w4c0Var.i0(i7, (ain1) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (r(i7, i4, obj)) {
                        w4c0Var.d0(i7, l(j2, obj));
                    }
                    break;
                case 63:
                    if (r(i7, i4, obj)) {
                        w4c0Var.c0(i7, l(j2, obj));
                    }
                    break;
                case 64:
                    if (r(i7, i4, obj)) {
                        w4c0Var.e0(i7, l(j2, obj));
                    }
                    break;
                case 65:
                    if (r(i7, i4, obj)) {
                        w4c0Var.g0(i7, m(j2, obj));
                    }
                    break;
                case 66:
                    if (r(i7, i4, obj)) {
                        int iL = l(j2, obj);
                        w4c0Var.d0(i7, (iL >> 31) ^ (iL + iL));
                    }
                    break;
                case 67:
                    if (r(i7, i4, obj)) {
                        long jM = m(j2, obj);
                        w4c0Var.f0(i7, (jM >> 63) ^ (jM + jM));
                    }
                    break;
                case 68:
                    if (r(i7, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        w4c0Var.b0(i7, 3);
                        y(i4).h((nhn1) object4, ltf1Var);
                        w4c0Var.b0(i7, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final int i(int i) {
        return this.a[i + 1];
    }

    public final boolean n(rin1 rin1Var, rin1 rin1Var2, int i) {
        return p(i, rin1Var) == p(i, rin1Var2);
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return p(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & dkn1.a(j2, obj)) != 0) {
                return true;
            }
            return false;
        }
        int i3 = i(i);
        long j3 = i3 & 1048575;
        switch ((i3 >>> 20) & 255) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (Double.doubleToRawLongBits(dkn1.c.u(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(dkn1.c.p(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (dkn1.c(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (dkn1.c(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (dkn1.c(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return dkn1.c.l(j3, obj);
            case 8:
                Object objE = dkn1.e(j3, obj);
                if (objE instanceof String) {
                    if (((String) objE).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objE instanceof ain1)) {
                    bhn0.q();
                    return false;
                }
                if (ain1.b.equals(objE)) {
                    return false;
                }
                return true;
            case 9:
                if (dkn1.e(j3, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (ain1.b.equals(dkn1.e(j3, obj))) {
                    return false;
                }
                return true;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case grn1.d /* 12 */:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (dkn1.c(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (dkn1.a(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (dkn1.c(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (dkn1.e(j3, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final void q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        dkn1.b(obj, (1 << (i2 >>> 20)) | dkn1.a(j2, obj), j2);
    }

    public final boolean r(int i, int i2, Object obj) {
        return dkn1.a((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void s(int i, int i2, Object obj) {
        dkn1.b(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int t(int i, int i2) {
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 33281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int u(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p.qhn1 r41) {
        /*
            Method dump skipped, instruction units count: 3328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ijn1.u(java.lang.Object, byte[], int, int, int, p.qhn1):int");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            long jI = i(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i2).length() + 38 + string.length(), i2, string);
                return;
            }
            qjn1 qjn1VarY = y(i);
            if (!p(i, obj)) {
                if (j(object)) {
                    rin1 rin1VarZza = qjn1VarY.zza();
                    qjn1VarY.a(rin1VarZza, object);
                    unsafe.putObject(obj, jI, rin1VarZza);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                q(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!j(object2)) {
                rin1 rin1VarZza2 = qjn1VarY.zza();
                qjn1VarY.a(rin1VarZza2, object2);
                unsafe.putObject(obj, jI, rin1VarZza2);
                object2 = rin1VarZza2;
            }
            qjn1VarY.a(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long jI = i(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jI);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i3).length() + 38 + string.length(), i3, string);
                return;
            }
            qjn1 qjn1VarY = y(i);
            if (!r(i2, i, obj)) {
                if (j(object)) {
                    rin1 rin1VarZza = qjn1VarY.zza();
                    qjn1VarY.a(rin1VarZza, object);
                    unsafe.putObject(obj, jI, rin1VarZza);
                } else {
                    unsafe.putObject(obj, jI, object);
                }
                s(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jI);
            if (!j(object2)) {
                rin1 rin1VarZza2 = qjn1VarY.zza();
                qjn1VarY.a(rin1VarZza2, object2);
                unsafe.putObject(obj, jI, rin1VarZza2);
                object2 = rin1VarZza2;
            }
            qjn1VarY.a(object2, object);
        }
    }

    public final qjn1 y(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        qjn1 qjn1Var = (qjn1) objArr[i3];
        if (qjn1Var != null) {
            return qjn1Var;
        }
        qjn1 qjn1VarA = ljn1.b.a((Class) objArr[i3 + 1]);
        objArr[i3] = qjn1VarA;
        return qjn1VarA;
    }

    public final Object z(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    @Override // p.qjn1
    public final rin1 zza() {
        return ((rin1) this.e).g();
    }

    @Override // p.qjn1
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int i7 = this.i(i6);
            int[] iArr = this.a;
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = k.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            ijn1 ijn1Var = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || ijn1Var.o(obj2, i6, i, i2, i10)) {
                int i11 = (i7 >>> 20) & 255;
                if (i11 != 9 && i11 != 17) {
                    if (i11 != 27) {
                        if (i11 == 60 || i11 == 68) {
                            if (!ijn1Var.r(iArr[i6], i6, obj2) || ijn1Var.y(i6).zzl(dkn1.e(i7 & 1048575, obj2))) {
                            }
                        } else if (i11 != 49) {
                            if (i11 == 50 && !((gjn1) dkn1.e(i7 & 1048575, obj2)).isEmpty()) {
                                ijn1Var.z(i6).getClass();
                                bhn0.d();
                                return false;
                            }
                        }
                        i3++;
                        this = ijn1Var;
                        obj = obj2;
                        i5 = i;
                        i4 = i2;
                    }
                    List list = (List) dkn1.e(i7 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qjn1 qjn1VarY = ijn1Var.y(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (qjn1VarY.zzl(list.get(i12))) {
                            }
                        }
                    }
                    i3++;
                    this = ijn1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!ijn1Var.o(obj2, i6, i, i2, i10) || ijn1Var.y(i6).zzl(dkn1.e(i7 & 1048575, obj2))) {
                    i3++;
                    this = ijn1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }
}
