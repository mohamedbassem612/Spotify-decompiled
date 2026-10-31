package p;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class udh {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f150p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final pa61 a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final u280 h;
    public final boolean i;
    public final Object j;

    static {
        String str = zoi1.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        f150p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public udh(pa61 pa61Var, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, u280 u280Var, Object obj) {
        this.a = pa61Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = u280Var;
        this.j = obj;
    }

    public static boolean b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((udh) list.get(i2)).h.b(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static udh c(pa61 pa61Var) {
        String str = pa61Var.b;
        Bundle bundle = pa61Var.c;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(40));
            Object objJ = j(i == 40010 ? 5 : 0, 10, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
            tdh tdhVar = new tdh(0);
            tdhVar.c(new pa61(i), objJ);
            return tdhVar.a();
        }
        int i2 = Integer.parseInt(str.substring(39));
        Object objJ2 = j(k(i2), 10, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        tdh tdhVar2 = new tdh(0);
        dm5.n(tdhVar2.b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        tdhVar2.c = i2;
        tdhVar2.j = n(k(i2), objJ2);
        return tdhVar2.a();
    }

    public static bg11 f(List list, qa61 qa61Var, m8u0 m8u0Var) {
        int i;
        v280 v280Var = new v280(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            udh udhVar = (udh) list.get(i2);
            pa61 pa61Var = udhVar.a;
            if ((pa61Var == null || !qa61Var.a.contains(pa61Var)) && ((i = udhVar.b) == -1 || !m8u0Var.a(i))) {
                if (udhVar.i) {
                    udhVar = new udh(udhVar.a, udhVar.b, udhVar.c, udhVar.d, udhVar.e, udhVar.f, new Bundle(udhVar.g), false, udhVar.h, udhVar.j);
                }
                v280Var.c(udhVar);
            } else {
                v280Var.c(udhVar);
            }
        }
        return v280Var.g();
    }

    public static udh h(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(k);
        pa61 pa61VarA = bundle2 == null ? null : pa61.a(bundle2);
        int i2 = bundle.getInt(l, -1);
        int i3 = bundle.getInt(m, 0);
        CharSequence charSequence = bundle.getCharSequence(n, "");
        Bundle bundleP = zoi1.p(bundle.getBundle(o));
        boolean z = i < 3 || bundle.getBoolean(f150p, true);
        Uri uri = (Uri) bundle.getParcelable(q);
        int i4 = bundle.getInt(r, 0);
        int[] intArray = bundle.getIntArray(s);
        tdh tdhVar = new tdh(i4, i3);
        String str = t;
        if (pa61VarA != null) {
            tdhVar.c(pa61VarA, j(pa61VarA.a == 40010 ? 5 : 0, i, bundle, str));
        }
        if (i2 != -1) {
            Object objJ = j(k(i2), i, bundle, str);
            dm5.n(tdhVar.b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            tdhVar.c = i2;
            tdhVar.j = n(k(i2), objJ);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            dm5.n(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            tdhVar.e = uri;
        }
        tdhVar.f = charSequence;
        if (bundleP == null) {
            bundleP = Bundle.EMPTY;
        }
        tdhVar.g = new Bundle(bundleP);
        tdhVar.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        tdhVar.d(intArray);
        return tdhVar.a();
    }

    public static bg11 i(int i, List list, boolean z, boolean z2) {
        int iB;
        if (list.isEmpty()) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            udh udhVar = (udh) list.get(i4);
            boolean z3 = udhVar.i;
            u280 u280Var = udhVar.h;
            if (z3 && udhVar.a()) {
                for (int i5 = 0; i5 < u280Var.b && (iB = u280Var.b(i5)) != 6; i5++) {
                    if (z && i2 == -1 && iB == 2) {
                        i2 = i4;
                        break;
                    }
                    if (z2 && i3 == -1 && iB == 3) {
                        i3 = i4;
                        break;
                    }
                }
            }
        }
        v280 v280VarM = b380.m();
        if (i2 != -1) {
            v280VarM.c(((udh) list.get(i2)).d(2, i));
        }
        if (i3 != -1) {
            v280VarM.c(((udh) list.get(i3)).d(3, i));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            udh udhVar2 = (udh) list.get(i6);
            if (udhVar2.i && udhVar2.a() && i6 != i2 && i6 != i3 && udhVar2.h.a(6)) {
                v280VarM.c(udhVar2.d(6, i));
            }
        }
        return v280VarM.g();
    }

    public static Object j(int i, int i2, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return esz0.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return yoh0.b(i2, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return tqh0.b(i2, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return k0g1.b(bundle5);
            default:
                return null;
        }
    }

    public static int k(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean l(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public static Object n(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                dm5.n(obj instanceof Long, "Parameter has incorrect type.");
                return obj;
            case 2:
                dm5.n(obj instanceof Integer, "Parameter has incorrect type.");
                return obj;
            case 3:
                dm5.n(obj instanceof Boolean, "Parameter has incorrect type.");
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                dm5.n(obj instanceof Float, "Parameter has incorrect type.");
                return obj;
            case 5:
                dm5.n(obj instanceof esz0, "Parameter has incorrect type.");
                return obj;
            case 6:
                dm5.n(obj instanceof yoh0, "Parameter has incorrect type.");
                return obj;
            case 7:
                dm5.n(obj instanceof tqh0, "Parameter has incorrect type.");
                return obj;
            case 8:
                dm5.n(obj instanceof k0g1, "Parameter has incorrect type.");
                return obj;
            default:
                return null;
        }
    }

    public final boolean a() {
        Object obj = this.j;
        pa61 pa61Var = this.a;
        if (pa61Var != null) {
            int i = pa61Var.a;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.b;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final udh d(int i, int i2) {
        String str;
        pa61 pa61Var = this.a;
        if (pa61Var != null && pa61Var.a == 0) {
            return e(new u280(1, new int[]{i}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.j != null) {
            bundle = new Bundle();
            o("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i2, bundle);
        }
        if (pa61Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + pa61Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new udh(new pa61(str, bundle), -1, this.c, this.d, this.e, this.f, this.g, this.i, new u280(1, new int[]{i}), null);
    }

    public final udh e(u280 u280Var) {
        if (this.h.equals(u280Var)) {
            return this;
        }
        return new udh(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, u280Var, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udh)) {
            return false;
        }
        udh udhVar = (udh) obj;
        return Objects.equals(this.a, udhVar.a) && this.b == udhVar.b && this.c == udhVar.c && this.d == udhVar.d && Objects.equals(this.e, udhVar.e) && TextUtils.equals(this.f, udhVar.f) && this.i == udhVar.i && this.h.equals(udhVar.h) && Objects.equals(this.j, udhVar.j);
    }

    public final void g(r8u0 r8u0Var) {
        if (this.i) {
            Object obj = this.j;
            int i = this.b;
            if (i == 19) {
                if (obj != null) {
                    r8u0Var.i0((tqh0) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    r8u0Var.g(((Float) obj).floatValue());
                    return;
                } else if (r8u0Var.c() == 0.0f) {
                    r8u0Var.O();
                    return;
                } else {
                    r8u0Var.d();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    r8u0Var.E0((k0g1) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    r8u0Var.Q((yoh0) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        r8u0Var.M(!r8u0Var.q());
                    } else {
                        r8u0Var.M(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    r8u0Var.e();
                    break;
                case 3:
                    r8u0Var.stop();
                    break;
                case 4:
                    r8u0Var.y();
                    break;
                case 5:
                    if (obj != null) {
                        r8u0Var.f(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    r8u0Var.x();
                    break;
                case 7:
                    r8u0Var.K();
                    break;
                case 8:
                    r8u0Var.R();
                    break;
                case 9:
                    r8u0Var.h0();
                    break;
                case 10:
                    if (obj != null) {
                        r8u0Var.H0(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    r8u0Var.a1();
                    break;
                case 12:
                    r8u0Var.Z0();
                    break;
                case 13:
                    if (obj != null) {
                        r8u0Var.h(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        r8u0Var.o0(!r8u0Var.V0());
                    } else {
                        r8u0Var.o0(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        r8u0Var.setRepeatMode(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h, this.j);
    }

    public final Bundle m(int i) {
        Bundle bundle = new Bundle();
        pa61 pa61Var = this.a;
        if (pa61Var != null) {
            bundle.putBundle(k, pa61Var.b());
        }
        int i2 = this.b;
        if (i2 != -1) {
            bundle.putInt(l, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            bundle.putInt(r, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            bundle.putInt(m, i4);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(n, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(o, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(q, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(f150p, z);
        }
        u280 u280Var = this.h;
        if (u280Var.b != 1 || u280Var.b(0) != 6) {
            bundle.putIntArray(s, Arrays.copyOfRange(u280Var.a, 0, u280Var.b));
        }
        if (this.j != null) {
            o(t, i, bundle);
        }
        return bundle;
    }

    public final void o(String str, int i, Bundle bundle) {
        int iK;
        pa61 pa61Var = this.a;
        if (pa61Var != null) {
            iK = pa61Var.a == 40010 ? 5 : 0;
        } else {
            iK = k(this.b);
        }
        Object obj = this.j;
        switch (iK) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((esz0) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((yoh0) obj).e(i, false));
                break;
            case 7:
                bundle.putBundle(str, ((tqh0) obj).c(i));
                break;
            case 8:
                bundle.putBundle(str, ((k0g1) obj).c());
                break;
        }
    }
}
