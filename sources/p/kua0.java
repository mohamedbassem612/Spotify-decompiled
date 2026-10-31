package p;

import androidx.compose.ui.text.intl.LocaleList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kua0 {
    public static final kua0 g = new kua0(0, null, 0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final LocaleList f;

    public kua0(int i, Boolean bool, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 32) != 0 ? null : Boolean.TRUE, null);
    }

    public static kua0 a(kua0 kua0Var, int i, Boolean bool, int i2) {
        int i3 = (i2 & 1) != 0 ? kua0Var.a : 3;
        Boolean bool2 = kua0Var.b;
        int i4 = (i2 & 4) != 0 ? kua0Var.c : 3;
        if ((i2 & 8) != 0) {
            i = kua0Var.d;
        }
        int i5 = i;
        kua0Var.getClass();
        if ((i2 & 32) != 0) {
            bool = null;
        }
        kua0Var.getClass();
        return new kua0(i3, bool2, i4, i5, bool, null);
    }

    public final kua0 b(kua0 kua0Var) {
        if (kua0Var == null || kua0Var.d() || kua0Var.equals(this)) {
            return this;
        }
        if (d()) {
            return kua0Var;
        }
        int i = this.a;
        cua0 cua0Var = new cua0(i);
        if (i == -1) {
            cua0Var = null;
        }
        int i2 = cua0Var != null ? cua0Var.a : kua0Var.a;
        Boolean bool = this.b;
        if (bool == null) {
            bool = kua0Var.b;
        }
        Boolean bool2 = bool;
        int i3 = this.c;
        oua0 oua0Var = new oua0(i3);
        if (i3 == 0) {
            oua0Var = null;
        }
        int i4 = oua0Var != null ? oua0Var.a : kua0Var.c;
        int i5 = this.d;
        r180 r180Var = i5 != -1 ? new r180(i5) : null;
        int i6 = r180Var != null ? r180Var.a : kua0Var.d;
        Boolean bool3 = this.e;
        if (bool3 == null) {
            bool3 = kua0Var.e;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.f;
        if (localeList == null) {
            localeList = kua0Var.f;
        }
        return new kua0(i2, bool2, i4, i6, bool4, localeList);
    }

    public final int c() {
        int i = this.d;
        r180 r180Var = new r180(i);
        if (i == -1) {
            r180Var = null;
        }
        if (r180Var != null) {
            return r180Var.a;
        }
        return 1;
    }

    public final boolean d() {
        return this.a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null;
    }

    public final x180 e(boolean z) {
        int i = this.a;
        cua0 cua0Var = new cua0(i);
        if (i == -1) {
            cua0Var = null;
        }
        int i2 = cua0Var != null ? cua0Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        oua0 oua0Var = i3 != 0 ? new oua0(i3) : null;
        int i4 = oua0Var != null ? oua0Var.a : 1;
        int iC = c();
        LocaleList localeList = this.f;
        if (localeList == null) {
            localeList = LocaleList.c;
        }
        return new x180(z, i2, zBooleanValue, i4, iC, localeList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kua0)) {
            return false;
        }
        kua0 kua0Var = (kua0) obj;
        return this.a == kua0Var.a && u890.j(this.b, kua0Var.b) && this.c == kua0Var.c && this.d == kua0Var.d && u890.j(this.e, kua0Var.e) && u890.j(this.f, kua0Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iF = kaa0.f(this.d, kaa0.f(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iF + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.f;
        return iHashCode2 + (localeList != null ? localeList.a.hashCode() : 0);
    }

    public final String toString() {
        String strC = cua0.c(this.a);
        String strC2 = oua0.c(this.c);
        String strD = r180.d(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strC);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        bb00.j(sb, strC2, ", imeAction=", strD, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public kua0(int i, Boolean bool, int i2, int i3, Boolean bool2, LocaleList localeList) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
        this.f = localeList;
    }
}
