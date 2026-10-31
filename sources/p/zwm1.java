package p;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zwm1 {
    public final dlg1 a;
    public final Resources b;

    public zwm1(Context context, dlg1 dlg1Var) {
        this.a = dlg1Var;
        this.b = context.getResources();
    }

    public final String a(String str, boolean z) {
        if (!z) {
            return str;
        }
        Resources resources = this.b;
        return str == null ? resources.getString(2131956828) : resources.getString(2131956825, str);
    }

    public final String b(int i, int i2) {
        Resources resources = this.b;
        if (i == 0 && i2 == 0) {
            return resources.getString(2131956856);
        }
        if (i2 == 0) {
            return resources.getQuantityString(2131820707, i, Integer.valueOf(i));
        }
        return i == 0 ? resources.getQuantityString(2131820706, i2, Integer.valueOf(i2)) : resources.getString(2131956855, resources.getQuantityString(2131820707, i, Integer.valueOf(i)), resources.getQuantityString(2131820706, i2, Integer.valueOf(i2)));
    }

    public final String c() {
        return this.b.getString(2131956878);
    }

    public final String d() {
        return this.b.getString(2131956880);
    }

    public final String e(String str, boolean z, String str2, boolean z2) {
        Resources resources = this.b;
        if (z && str2.length() == 0 && (str == null || str.length() == 0)) {
            return resources.getString(2131956861);
        }
        if (z && str2.length() == 0 && str != null) {
            return resources.getString(z2 ? 2131956859 : 2131956860, str);
        }
        if (z && str2.length() > 0) {
            return resources.getString(2131956862, str2);
        }
        if (z || str2.length() <= 0) {
            return z2 ? resources.getString(2131956864, str) : str;
        }
        return resources.getString(2131956863, str2);
    }

    public final String f(int i, String str) {
        int iC = l1d.C(i);
        Resources resources = this.b;
        if (iC == 0) {
            if (str == null || str.length() == 0) {
                String string = resources.getString(2131956832);
                string.getClass();
                return string;
            }
            String string2 = resources.getString(2131956831, str);
            string2.getClass();
            return string2;
        }
        if (iC != 1) {
            if (iC == 2) {
                return "";
            }
            eg.o();
            return null;
        }
        if (str == null || str.length() == 0) {
            String string3 = resources.getString(2131956837);
            string3.getClass();
            return string3;
        }
        String string4 = resources.getString(2131956836, str);
        string4.getClass();
        return string4;
    }

    public final String g(String str, Long l, boolean z) {
        boolean z2 = str != null;
        Resources resources = this.b;
        if (z) {
            return z2 ? resources.getString(2131956869, str) : resources.getString(2131956871);
        }
        boolean z3 = l != null;
        dlg1 dlg1Var = this.a;
        if (z2 && z3) {
            return resources.getString(2131956870, dlg1Var.j(l.longValue()), str);
        }
        if (z3) {
            return dlg1Var.j(l.longValue());
        }
        if (z2) {
            return str;
        }
        return null;
    }

    public final String h() {
        return this.b.getString(2131956881);
    }

    public final String i() {
        return this.b.getString(2131956882);
    }
}
