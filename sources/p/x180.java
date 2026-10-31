package p;

import androidx.compose.ui.text.intl.LocaleList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x180 {
    public static final x180 g;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final LocaleList f;

    static {
        LocaleList localeList = LocaleList.c;
        g = new x180(false, 0, true, 1, 1, k8p1.i());
    }

    public x180(boolean z, int i, boolean z2, int i2, int i3, LocaleList localeList) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = localeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x180)) {
            return false;
        }
        x180 x180Var = (x180) obj;
        return this.a == x180Var.a && cua0.a(this.b, x180Var.b) && this.c == x180Var.c && oua0.a(this.d, x180Var.d) && r180.b(this.e, x180Var.e) && u890.j(this.f, x180Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((r180.c(this.e) + ((oua0.b(this.d) + xcg1.g((cua0.b(this.b) + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31)) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + cua0.c(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + oua0.c(this.d) + ", imeAction=" + r180.d(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
