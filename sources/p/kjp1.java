package p;

import com.google.android.gms.internal.cast.zzxo;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjp1 implements ujp1 {
    public static final int[] g = new int[0];
    public static final Unsafe h;
    public final int[] a;
    public final Object[] b;
    public final qgp1 c;
    public final int[] d;
    public final int e;
    public final wbn1 f;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pkh1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        h = unsafe;
    }

    public kjp1(int[] iArr, Object[] objArr, qgp1 qgp1Var, int[] iArr2, int i, wbn1 wbn1Var, p9n1 p9n1Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = wbn1Var;
        this.c = qgp1Var;
    }

    public static Field k(Class cls, String str) {
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

    public static int p(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof cip1) {
            return ((cip1) obj).k();
        }
        return true;
    }

    public static int r(long j, Object obj) {
        return ((Integer) dcn1.h(j, obj)).intValue();
    }

    public static long s(long j, Object obj) {
        return ((Long) dcn1.h(j, obj)).longValue();
    }

    @Override // p.ujp1
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!q(obj)) {
            hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                wjp1.b(obj, obj2);
                return;
            }
            int iO = o(i);
            int i2 = iO & 1048575;
            int iP = p(iO);
            int i3 = iArr[i];
            long j = i2;
            switch (iP) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        zkh1 zkh1Var = dcn1.c;
                        zkh1Var.A(obj3, j, zkh1Var.x(j, obj2));
                        i(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        zkh1 zkh1Var2 = dcn1.c;
                        zkh1Var2.w(obj3, j, zkh1Var2.r(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putLong(obj3, j, dcn1.g(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putLong(obj3, j, dcn1.g(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putLong(obj3, j, dcn1.g(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        zkh1 zkh1Var3 = dcn1.c;
                        zkh1Var3.q(obj3, j, zkh1Var3.o(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putObject(obj3, j, dcn1.h(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    l(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putObject(obj3, j, dcn1.h(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case grn1.d /* 12 */:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.c.a.putLong(obj3, j, dcn1.g(j, obj2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (h(i, obj2)) {
                        dcn1.f(obj3, dcn1.e(j, obj2), j);
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (h(i, obj2)) {
                        obj3 = obj;
                        dcn1.c.a.putLong(obj3, j, dcn1.g(j, obj2));
                        i(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    l(i, obj, obj2);
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
                    lip1 lip1VarZzf = (lip1) dcn1.h(j, obj);
                    lip1 lip1Var = (lip1) dcn1.h(j, obj2);
                    int size = lip1VarZzf.size();
                    int size2 = lip1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((ugp1) lip1VarZzf).a) {
                            lip1VarZzf = lip1VarZzf.zzf(size2 + size);
                        }
                        lip1VarZzf.addAll(lip1Var);
                    }
                    if (size > 0) {
                        lip1Var = lip1VarZzf;
                    }
                    dcn1.c.a.putObject(obj, j, lip1Var);
                    break;
                case 50:
                    wbn1 wbn1Var = wjp1.a;
                    Object objH = dcn1.h(j, obj);
                    Object objH2 = dcn1.h(j, obj2);
                    if (objH == null) {
                        throw td6.k(objH2);
                    }
                    bhn0.d();
                    return;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (j(i3, i, obj2)) {
                        dcn1.c.a.putObject(obj, j, dcn1.h(j, obj2));
                        dcn1.f(obj, i3, iArr[i + 2] & 1048575);
                    }
                    break;
                case 60:
                    m(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(i3, i, obj2)) {
                        dcn1.c.a.putObject(obj, j, dcn1.h(j, obj2));
                        dcn1.f(obj, i3, iArr[i + 2] & 1048575);
                    }
                    break;
                case 68:
                    m(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // p.ujp1
    public final boolean b(cip1 cip1Var, cip1 cip1Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iO = o(i);
                long j = iO & 1048575;
                switch (p(iO)) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        if (t(cip1Var, cip1Var2, i)) {
                            zkh1 zkh1Var = dcn1.c;
                            if (Double.doubleToLongBits(zkh1Var.x(j, cip1Var)) == Double.doubleToLongBits(zkh1Var.x(j, cip1Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (t(cip1Var, cip1Var2, i)) {
                            zkh1 zkh1Var2 = dcn1.c;
                            if (Float.floatToIntBits(zkh1Var2.r(j, cip1Var)) == Float.floatToIntBits(zkh1Var2.r(j, cip1Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (t(cip1Var, cip1Var2, i) && dcn1.g(j, cip1Var) == dcn1.g(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (t(cip1Var, cip1Var2, i) && dcn1.g(j, cip1Var) == dcn1.g(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (t(cip1Var, cip1Var2, i) && dcn1.g(j, cip1Var) == dcn1.g(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (t(cip1Var, cip1Var2, i)) {
                            zkh1 zkh1Var3 = dcn1.c;
                            if (zkh1Var3.o(j, cip1Var) == zkh1Var3.o(j, cip1Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (t(cip1Var, cip1Var2, i) && wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (t(cip1Var, cip1Var2, i) && wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (t(cip1Var, cip1Var2, i) && wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case grn1.d /* 12 */:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (t(cip1Var, cip1Var2, i) && dcn1.g(j, cip1Var) == dcn1.g(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (t(cip1Var, cip1Var2, i) && dcn1.e(j, cip1Var) == dcn1.e(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (t(cip1Var, cip1Var2, i) && dcn1.g(j, cip1Var) == dcn1.g(j, cip1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (t(cip1Var, cip1Var2, i) && wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2))) {
                            continue;
                            i += 3;
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
                        zA = wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2));
                        break;
                    case 50:
                        zA = wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2));
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
                        if (dcn1.e(j2, cip1Var) == dcn1.e(j2, cip1Var2) && wjp1.a(dcn1.h(j, cip1Var), dcn1.h(j, cip1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zA) {
                    i += 3;
                }
            } else if (cip1Var.zzc.equals(cip1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.ujp1
    public final void c(Object obj, i2i1 i2i1Var) throws zzxo {
        int i;
        fhp1 fhp1Var = (fhp1) i2i1Var.b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ubn1 ubn1Var = ((cip1) obj).zzc;
                return;
            }
            int iO = o(i4);
            int iP = p(iO);
            int i6 = iArr[i4];
            Unsafe unsafe = h;
            if (iP <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iO & i2;
            switch (iP) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.C(i6, Double.doubleToRawLongBits(dcn1.c.x(j, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.A(i6, Float.floatToRawIntBits(dcn1.c.r(j, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.B(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.B(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.y(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.C(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.A(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (u(obj, i4, i3, i5, i)) {
                        byte bO = dcn1.c.o(j, obj);
                        fhp1Var.G(i6 << 3);
                        int i9 = fhp1Var.h;
                        try {
                            int i10 = i9 + 1;
                            try {
                                fhp1Var.f[i9] = bO;
                                fhp1Var.h = i10;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i9 = i10;
                                throw new zzxo(i9, fhp1Var.g, 1, e);
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
                    if (u(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            fhp1Var.D(i6, (String) object);
                        } else {
                            fhp1Var.E(i6, (ahp1) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (u(obj, i4, i3, i5, i)) {
                        i2i1Var.i(i6, unsafe.getObject(obj, j), n(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.E(i6, (ahp1) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.z(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case grn1.d /* 12 */:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.y(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.A(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (u(obj, i4, i3, i5, i)) {
                        fhp1Var.C(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (u(obj, i4, i3, i5, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        fhp1Var.z(i6, (i11 >> 31) ^ (i11 + i11));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (u(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        fhp1Var.B(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (u(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        fhp1Var.x(i6, 3);
                        n(i4).c((qgp1) object2, i2i1Var);
                        fhp1Var.x(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    wjp1.c(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    wjp1.d(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    wjp1.e(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    wjp1.f(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    wjp1.j(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    wjp1.h(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    wjp1.m(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    wjp1.p(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i12 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    wbn1 wbn1Var = wjp1.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof tip1) {
                            tip1 tip1Var = (tip1) list;
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                Object objZza = tip1Var.zza();
                                if (objZza instanceof String) {
                                    fhp1Var.D(i12, (String) objZza);
                                } else {
                                    fhp1Var.E(i12, (ahp1) objZza);
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                fhp1Var.D(i12, (String) list.get(i14));
                            }
                        }
                    }
                    break;
                case 27:
                    int i15 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    ujp1 ujp1VarN = n(i4);
                    wbn1 wbn1Var2 = wjp1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            i2i1Var.i(i15, list2.get(i16), ujp1VarN);
                        }
                    }
                    break;
                case 28:
                    int i17 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    wbn1 wbn1Var3 = wjp1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            fhp1Var.E(i17, (ahp1) list3.get(i18));
                        }
                    }
                    break;
                case 29:
                    wjp1.k(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    wjp1.o(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    wjp1.n(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    wjp1.i(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    wjp1.l(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    wjp1.g(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    wjp1.c(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 36:
                    wjp1.d(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 37:
                    wjp1.e(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 38:
                    wjp1.f(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 39:
                    wjp1.j(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 40:
                    wjp1.h(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 41:
                    wjp1.m(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 42:
                    wjp1.p(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 43:
                    wjp1.k(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 44:
                    wjp1.o(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 45:
                    wjp1.n(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 46:
                    wjp1.i(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 47:
                    wjp1.l(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 48:
                    wjp1.g(iArr[i4], (List) unsafe.getObject(obj, j), i2i1Var, true);
                    break;
                case 49:
                    int i19 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    ujp1 ujp1VarN2 = n(i4);
                    wbn1 wbn1Var4 = wjp1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            qgp1 qgp1Var = (qgp1) list4.get(i20);
                            fhp1Var.x(i19, 3);
                            ujp1VarN2.c(qgp1Var, i2i1Var);
                            fhp1Var.x(i19, 4);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i21 = i4 / 3;
                        throw td6.k(this.b[i21 + i21]);
                    }
                    break;
                case 51:
                    if (j(i6, i4, obj)) {
                        fhp1Var.C(i6, Double.doubleToRawLongBits(((Double) dcn1.h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (j(i6, i4, obj)) {
                        fhp1Var.A(i6, Float.floatToRawIntBits(((Float) dcn1.h(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (j(i6, i4, obj)) {
                        fhp1Var.B(i6, s(j, obj));
                    }
                    break;
                case 54:
                    if (j(i6, i4, obj)) {
                        fhp1Var.B(i6, s(j, obj));
                    }
                    break;
                case 55:
                    if (j(i6, i4, obj)) {
                        fhp1Var.y(i6, r(j, obj));
                    }
                    break;
                case 56:
                    if (j(i6, i4, obj)) {
                        fhp1Var.C(i6, s(j, obj));
                    }
                    break;
                case 57:
                    if (j(i6, i4, obj)) {
                        fhp1Var.A(i6, r(j, obj));
                    }
                    break;
                case 58:
                    if (j(i6, i4, obj)) {
                        byte bBooleanValue = ((Boolean) dcn1.h(j, obj)).booleanValue();
                        fhp1Var.G(i6 << 3);
                        int i22 = fhp1Var.h;
                        try {
                            int i23 = i22 + 1;
                            try {
                                fhp1Var.f[i22] = bBooleanValue;
                                fhp1Var.h = i23;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                                i22 = i23;
                                throw new zzxo(i22, fhp1Var.g, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                    }
                    break;
                case 59:
                    if (j(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            fhp1Var.D(i6, (String) object3);
                        } else {
                            fhp1Var.E(i6, (ahp1) object3);
                        }
                    }
                    break;
                case 60:
                    if (j(i6, i4, obj)) {
                        i2i1Var.i(i6, unsafe.getObject(obj, j), n(i4));
                    }
                    break;
                case 61:
                    if (j(i6, i4, obj)) {
                        fhp1Var.E(i6, (ahp1) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (j(i6, i4, obj)) {
                        fhp1Var.z(i6, r(j, obj));
                    }
                    break;
                case 63:
                    if (j(i6, i4, obj)) {
                        fhp1Var.y(i6, r(j, obj));
                    }
                    break;
                case 64:
                    if (j(i6, i4, obj)) {
                        fhp1Var.A(i6, r(j, obj));
                    }
                    break;
                case 65:
                    if (j(i6, i4, obj)) {
                        fhp1Var.C(i6, s(j, obj));
                    }
                    break;
                case 66:
                    if (j(i6, i4, obj)) {
                        int iR = r(j, obj);
                        fhp1Var.z(i6, (iR >> 31) ^ (iR + iR));
                    }
                    break;
                case 67:
                    if (j(i6, i4, obj)) {
                        long jS = s(j, obj);
                        fhp1Var.B(i6, (jS >> 63) ^ (jS + jS));
                    }
                    break;
                case 68:
                    if (j(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        fhp1Var.x(i6, 3);
                        n(i4).c((qgp1) object4, i2i1Var);
                        fhp1Var.x(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.ujp1
    public final int d(cip1 cip1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                cip1Var.zzc.getClass();
                return (i6 * 53) + 506991;
            }
            int iO = o(i5);
            int i7 = 1048575 & iO;
            int iP = p(iO);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iP) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(dcn1.c.x(j, cip1Var));
                    Charset charset = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(dcn1.c.r(j, cip1Var));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = dcn1.g(j, cip1Var);
                    Charset charset2 = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = dcn1.g(j, cip1Var);
                    Charset charset3 = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = dcn1.g(j, cip1Var);
                    Charset charset4 = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zO = dcn1.c.o(j, cip1Var);
                    Charset charset5 = mip1.a;
                    if (zO) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) dcn1.h(j, cip1Var)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objH = dcn1.h(j, cip1Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case grn1.d /* 12 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = dcn1.g(j, cip1Var);
                    Charset charset6 = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.e(j, cip1Var);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = dcn1.g(j, cip1Var);
                    Charset charset7 = mip1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objH2 = dcn1.h(j, cip1Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i6 = i4 + iHashCode;
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
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) dcn1.h(j, cip1Var)).doubleValue());
                        Charset charset8 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) dcn1.h(j, cip1Var)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = s(j, cip1Var);
                        Charset charset9 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = s(j, cip1Var);
                        Charset charset10 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = s(j, cip1Var);
                        Charset charset11 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (j(i8, i5, cip1Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) dcn1.h(j, cip1Var)).booleanValue();
                        Charset charset12 = mip1.a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) dcn1.h(j, cip1Var)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = s(j, cip1Var);
                        Charset charset13 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = r(j, cip1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (j(i8, i5, cip1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = s(j, cip1Var);
                        Charset charset14 = mip1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (j(i8, i5, cip1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = dcn1.h(j, cip1Var).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // p.ujp1
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.e) {
            int i6 = this.d[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iO = o(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = h.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iO) == 0 || u(obj, i6, i, i2, i10)) {
                int iP = p(iO);
                if (iP != 9 && iP != 17) {
                    if (iP != 27) {
                        if (iP == 60 || iP == 68) {
                            if (!j(i7, i6, obj) || n(i6).e(dcn1.h(iO & 1048575, obj))) {
                            }
                        } else if (iP != 49) {
                            if (iP == 50) {
                                dcn1.h(iO & 1048575, obj).getClass();
                                bhn0.d();
                                return false;
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) dcn1.h(iO & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ujp1 ujp1VarN = n(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (ujp1VarN.e(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!u(obj, i6, i, i2, i10) || n(i6).e(dcn1.h(iO & 1048575, obj))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[SYNTHETIC] */
    @Override // p.ujp1
    public final void f(Object obj) {
        if (!q(obj)) {
            return;
        }
        if (obj instanceof cip1) {
            cip1 cip1Var = (cip1) obj;
            cip1Var.f();
            cip1Var.zza = 0;
            cip1Var.l();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.f.getClass();
                ubn1 ubn1Var = ((cip1) obj).zzc;
                if (ubn1Var.d) {
                    ubn1Var.d = false;
                    return;
                }
                return;
            }
            int iO = o(i);
            int i2 = 1048575 & iO;
            int iP = p(iO);
            long j = i2;
            Unsafe unsafe = h;
            if (iP != 9) {
                if (iP != 60 && iP != 68) {
                    switch (iP) {
                        case 17:
                            if (h(i, obj)) {
                                n(i).f(unsafe.getObject(obj, j));
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
                            ugp1 ugp1Var = (ugp1) ((lip1) dcn1.h(j, obj));
                            if (ugp1Var.a) {
                                ugp1Var.a = false;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                bhn0.d();
                                return;
                            }
                            break;
                            break;
                    }
                } else if (j(iArr[i], i, obj)) {
                    n(i).f(unsafe.getObject(obj, j));
                }
            } else if (h(i, obj)) {
                n(i).f(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0342  */
    /* JADX WARN: Code duplicated, block: B:194:0x0487  */
    /* JADX WARN: Code duplicated, block: B:226:0x0578  */
    /* JADX WARN: Code duplicated, block: B:229:0x0586  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // p.ujp1
    public final int g(qgp1 qgp1Var) {
        int i;
        int iL;
        int iM;
        int iL2;
        int iD;
        int iL3;
        int iC;
        int i2;
        int iL4;
        int iY;
        int i3;
        int iC2;
        int iL5;
        int size;
        int iR;
        int iL6;
        int iL7;
        int iL8;
        int size2;
        int iL9;
        int iC3;
        int iL10;
        int iM2;
        int iL11;
        int iD2;
        int iR2;
        int iL12;
        int i4 = 0;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iR3 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                ubn1 ubn1Var = ((cip1) qgp1Var).zzc;
                int i9 = ubn1Var.c;
                if (i9 == -1) {
                    ubn1Var.c = 0;
                } else {
                    i4 = i9;
                }
                return i4 + iR3;
            }
            int iO = o(i6);
            int iP = p(iO);
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i5;
            Unsafe unsafe = h;
            if (iP <= 17) {
                if (i12 != i8) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(qgp1Var, i12);
                    i8 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = iO & i5;
            if (iP >= rhp1.b.a) {
                byte b = rhp1.c.a;
            }
            long j = i13;
            switch (iP) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        long j2 = unsafe.getLong(qgp1Var, j);
                        iL = fhp1.L(i10 << 3);
                        iM = fhp1.M(j2);
                        iY = iM + iL;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        long j3 = unsafe.getLong(qgp1Var, j);
                        iL = fhp1.L(i10 << 3);
                        iM = fhp1.M(j3);
                        iY = iM + iL;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        long j4 = unsafe.getInt(qgp1Var, j);
                        iL = fhp1.L(i10 << 3);
                        iM = fhp1.M(j4);
                        iY = iM + iL;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 1, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(qgp1Var, j);
                        if (object instanceof ahp1) {
                            iL2 = fhp1.L(i14);
                            iD = ((ahp1) object).d();
                            iR3 = lqn1.q(iD, iD, iL2, iR3);
                        } else {
                            iL = fhp1.L(i14);
                            iM = fhp1.N((String) object);
                            iY = iM + iL;
                            iR3 += iY;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        Object object2 = unsafe.getObject(qgp1Var, j);
                        ujp1 ujp1VarN = n(i6);
                        wbn1 wbn1Var = wjp1.a;
                        iL3 = fhp1.L(i10 << 3);
                        iC = ((qgp1) object2).c(ujp1VarN);
                        iR3 = lqn1.q(iC, iC, iL3, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        ahp1 ahp1Var = (ahp1) unsafe.getObject(qgp1Var, j);
                        iL2 = fhp1.L(i10 << 3);
                        iD = ahp1Var.d();
                        iR3 = lqn1.q(iD, iD, iL2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        i2 = unsafe.getInt(qgp1Var, j);
                        iL4 = fhp1.L(i10 << 3);
                        iR3 = lqn1.r(i2, iL4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case grn1.d /* 12 */:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        long j5 = unsafe.getInt(qgp1Var, j);
                        iL = fhp1.L(i10 << 3);
                        iM = fhp1.M(j5);
                        iY = iM + iL;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        int i15 = unsafe.getInt(qgp1Var, j);
                        iL4 = fhp1.L(i10 << 3);
                        i2 = (i15 >> 31) ^ (i15 + i15);
                        iR3 = lqn1.r(i2, iL4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        long j6 = unsafe.getLong(qgp1Var, j);
                        iL = fhp1.L(i10 << 3);
                        iM = fhp1.M((j6 >> 63) ^ (j6 + j6));
                        iY = iM + iL;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (u(qgp1Var, i6, i8, i7, i)) {
                        qgp1 qgp1Var2 = (qgp1) unsafe.getObject(qgp1Var, j);
                        ujp1 ujp1VarN2 = n(i6);
                        wbn1 wbn1Var2 = wjp1.a;
                        int iL13 = fhp1.L(i10 << 3);
                        i3 = iL13 + iL13;
                        iC2 = qgp1Var2.c(ujp1VarN2);
                        iY = iC2 + i3;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iY = wjp1.y(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    iY = wjp1.x(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    List list = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var3 = wjp1.a;
                    if (list.size() == 0) {
                        iL5 = 0;
                    } else {
                        iL5 = (fhp1.L(i10 << 3) * list.size()) + wjp1.q(list);
                    }
                    iR3 += iL5;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var4 = wjp1.a;
                    size = list2.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.r(list2);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var5 = wjp1.a;
                    size = list3.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.u(list3);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iY = wjp1.y(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iY = wjp1.x(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var6 = wjp1.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iL5 = 0;
                    } else {
                        iL5 = (fhp1.L(i10 << 3) + 1) * size3;
                    }
                    iR3 += iL5;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var7 = wjp1.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iL7 = 0;
                    } else {
                        iL7 = fhp1.L(i10 << 3) * size4;
                        if (list5 instanceof tip1) {
                            tip1 tip1Var = (tip1) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object objZza = tip1Var.zza();
                                if (objZza instanceof ahp1) {
                                    int iD3 = ((ahp1) objZza).d();
                                    iL7 = lqn1.r(iD3, iD3, iL7);
                                } else {
                                    iL7 = fhp1.N((String) objZza) + iL7;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof ahp1) {
                                    int iD4 = ((ahp1) obj).d();
                                    iL7 = lqn1.r(iD4, iD4, iL7);
                                } else {
                                    iL7 = fhp1.N((String) obj) + iL7;
                                }
                            }
                        }
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(qgp1Var, j);
                    ujp1 ujp1VarN3 = n(i6);
                    wbn1 wbn1Var8 = wjp1.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iL8 = 0;
                    } else {
                        iL8 = fhp1.L(i10 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int iC4 = ((qgp1) list6.get(i18)).c(ujp1VarN3);
                            iL8 = lqn1.r(iC4, iC4, iL8);
                        }
                    }
                    iR3 += iL8;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var9 = wjp1.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iL7 = 0;
                    } else {
                        iL7 = fhp1.L(i10 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iD5 = ((ahp1) list7.get(i19)).d();
                            iL7 = lqn1.r(iD5, iD5, iL7);
                        }
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var10 = wjp1.a;
                    size = list8.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.v(list8);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var11 = wjp1.a;
                    size = list9.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.t(list9);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iY = wjp1.x(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    iY = wjp1.y(i10, (List) unsafe.getObject(qgp1Var, j));
                    iR3 += iY;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var12 = wjp1.a;
                    size = list10.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.w(list10);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var13 = wjp1.a;
                    size = list11.size();
                    if (size == 0) {
                        iL7 = 0;
                    } else {
                        iR = wjp1.s(list11);
                        iL6 = fhp1.L(i10 << 3);
                        iL7 = (iL6 * size) + iR;
                    }
                    iR3 += iL7;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var14 = wjp1.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var15 = wjp1.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    size2 = wjp1.q((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    size2 = wjp1.r((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    size2 = wjp1.u((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var16 = wjp1.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var17 = wjp1.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var18 = wjp1.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    size2 = wjp1.v((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    size2 = wjp1.t((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var19 = wjp1.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(qgp1Var, j);
                    wbn1 wbn1Var20 = wjp1.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    size2 = wjp1.w((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    size2 = wjp1.s((List) unsafe.getObject(qgp1Var, j));
                    if (size2 > 0) {
                        iL9 = fhp1.L(i10 << 3);
                        iR3 = lqn1.q(size2, iL9, size2, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(qgp1Var, j);
                    ujp1 ujp1VarN4 = n(i6);
                    wbn1 wbn1Var21 = wjp1.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC3 = 0;
                    } else {
                        iC3 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            qgp1 qgp1Var3 = (qgp1) list19.get(i20);
                            int iL14 = fhp1.L(i10 << 3);
                            iC3 += qgp1Var3.c(ujp1VarN4) + iL14 + iL14;
                        }
                    }
                    iR3 += iC3;
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(qgp1Var, j);
                    int i21 = i6 / 3;
                    Object obj2 = this.b[i21 + i21];
                    if (object3 == null) {
                        throw td6.k(obj2);
                    }
                    bhn0.d();
                    return 0;
                case 51:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (j(i10, i6, qgp1Var)) {
                        long jS = s(j, qgp1Var);
                        iL10 = fhp1.L(i10 << 3);
                        iM2 = fhp1.M(jS);
                        iR3 += iM2 + iL10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (j(i10, i6, qgp1Var)) {
                        long jS2 = s(j, qgp1Var);
                        iL10 = fhp1.L(i10 << 3);
                        iM2 = fhp1.M(jS2);
                        iR3 += iM2 + iL10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (j(i10, i6, qgp1Var)) {
                        long jR = r(j, qgp1Var);
                        iL10 = fhp1.L(i10 << 3);
                        iM2 = fhp1.M(jR);
                        iR3 += iM2 + iL10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 1, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (j(i10, i6, qgp1Var)) {
                        int i22 = i10 << 3;
                        Object object4 = unsafe.getObject(qgp1Var, j);
                        if (object4 instanceof ahp1) {
                            iL11 = fhp1.L(i22);
                            iD2 = ((ahp1) object4).d();
                            iR3 = lqn1.q(iD2, iD2, iL11, iR3);
                        } else {
                            iL10 = fhp1.L(i22);
                            iM2 = fhp1.N((String) object4);
                            iR3 += iM2 + iL10;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (j(i10, i6, qgp1Var)) {
                        Object object5 = unsafe.getObject(qgp1Var, j);
                        ujp1 ujp1VarN5 = n(i6);
                        wbn1 wbn1Var22 = wjp1.a;
                        iL3 = fhp1.L(i10 << 3);
                        iC = ((qgp1) object5).c(ujp1VarN5);
                        iR3 = lqn1.q(iC, iC, iL3, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (j(i10, i6, qgp1Var)) {
                        ahp1 ahp1Var2 = (ahp1) unsafe.getObject(qgp1Var, j);
                        iL11 = fhp1.L(i10 << 3);
                        iD2 = ahp1Var2.d();
                        iR3 = lqn1.q(iD2, iD2, iL11, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (j(i10, i6, qgp1Var)) {
                        iR2 = r(j, qgp1Var);
                        iL12 = fhp1.L(i10 << 3);
                        iR3 = lqn1.r(iR2, iL12, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (j(i10, i6, qgp1Var)) {
                        long jR2 = r(j, qgp1Var);
                        iL10 = fhp1.L(i10 << 3);
                        iM2 = fhp1.M(jR2);
                        iR3 += iM2 + iL10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 4, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (j(i10, i6, qgp1Var)) {
                        iR3 = lqn1.r(i10 << 3, 8, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (j(i10, i6, qgp1Var)) {
                        int iR4 = r(j, qgp1Var);
                        iL12 = fhp1.L(i10 << 3);
                        iR2 = (iR4 >> 31) ^ (iR4 + iR4);
                        iR3 = lqn1.r(iR2, iL12, iR3);
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (j(i10, i6, qgp1Var)) {
                        long jS3 = s(j, qgp1Var);
                        iL10 = fhp1.L(i10 << 3);
                        iM2 = fhp1.M((jS3 >> 63) ^ (jS3 + jS3));
                        iR3 += iM2 + iL10;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (j(i10, i6, qgp1Var)) {
                        qgp1 qgp1Var4 = (qgp1) unsafe.getObject(qgp1Var, j);
                        ujp1 ujp1VarN6 = n(i6);
                        wbn1 wbn1Var23 = wjp1.a;
                        int iL15 = fhp1.L(i10 << 3);
                        i3 = iL15 + iL15;
                        iC2 = qgp1Var4.c(ujp1VarN6);
                        iY = iC2 + i3;
                        iR3 += iY;
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i6 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean h(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & dcn1.e(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iO = o(i);
        long j2 = iO & 1048575;
        switch (p(iO)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (Double.doubleToRawLongBits(dcn1.c.x(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(dcn1.c.r(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (dcn1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (dcn1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (dcn1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return dcn1.c.o(j2, obj);
            case 8:
                Object objH = dcn1.h(j2, obj);
                if (objH instanceof String) {
                    if (((String) objH).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objH instanceof ahp1)) {
                    bhn0.q();
                    return false;
                }
                if (ahp1.c.equals(objH)) {
                    return false;
                }
                return true;
            case 9:
                if (dcn1.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (ahp1.c.equals(dcn1.h(j2, obj))) {
                    return false;
                }
                return true;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case grn1.d /* 12 */:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (dcn1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (dcn1.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (dcn1.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (dcn1.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final void i(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        dcn1.f(obj, (1 << (i2 >>> 20)) | dcn1.e(j, obj), j);
    }

    public final boolean j(int i, int i2, Object obj) {
        return dcn1.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void l(int i, Object obj, Object obj2) {
        if (h(i, obj2)) {
            long jO = o(i) & 1048575;
            Unsafe unsafe = h;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i2).length() + 38 + string.length(), i2, string);
                return;
            }
            ujp1 ujp1VarN = n(i);
            if (!h(i, obj)) {
                if (q(object)) {
                    cip1 cip1VarZza = ujp1VarN.zza();
                    ujp1VarN.a(cip1VarZza, object);
                    unsafe.putObject(obj, jO, cip1VarZza);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                i(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!q(object2)) {
                cip1 cip1VarZza2 = ujp1VarN.zza();
                ujp1VarN.a(cip1VarZza2, object2);
                unsafe.putObject(obj, jO, cip1VarZza2);
                object2 = cip1VarZza2;
            }
            ujp1VarN.a(object2, object);
        }
    }

    public final void m(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (j(i2, i, obj2)) {
            long jO = o(i) & 1048575;
            Unsafe unsafe = h;
            Object object = unsafe.getObject(obj2, jO);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i3).length() + 38 + string.length(), i3, string);
                return;
            }
            ujp1 ujp1VarN = n(i);
            if (!j(i2, i, obj)) {
                if (q(object)) {
                    cip1 cip1VarZza = ujp1VarN.zza();
                    ujp1VarN.a(cip1VarZza, object);
                    unsafe.putObject(obj, jO, cip1VarZza);
                } else {
                    unsafe.putObject(obj, jO, object);
                }
                dcn1.f(obj, i2, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, jO);
            if (!q(object2)) {
                cip1 cip1VarZza2 = ujp1VarN.zza();
                ujp1VarN.a(cip1VarZza2, object2);
                unsafe.putObject(obj, jO, cip1VarZza2);
                object2 = cip1VarZza2;
            }
            ujp1VarN.a(object2, object);
        }
    }

    public final ujp1 n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        ujp1 ujp1Var = (ujp1) objArr[i3];
        if (ujp1Var != null) {
            return ujp1Var;
        }
        ujp1 ujp1VarA = qjp1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = ujp1VarA;
        return ujp1VarA;
    }

    public final int o(int i) {
        return this.a[i + 1];
    }

    public final boolean t(cip1 cip1Var, cip1 cip1Var2, int i) {
        return h(i, cip1Var) == h(i, cip1Var2);
    }

    public final boolean u(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return h(i, obj);
        }
        return (i3 & i4) != 0;
    }

    @Override // p.ujp1
    public final cip1 zza() {
        return (cip1) ((cip1) this.c).j(4, null);
    }
}
