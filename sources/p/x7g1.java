package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x7g1 {
    public final String a;
    public final n5f0 b;
    public final Locale c;

    public x7g1(String str, n5f0 n5f0Var, Locale locale) {
        this.a = str;
        this.b = n5f0Var;
        this.c = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7g1)) {
            return false;
        }
        x7g1 x7g1Var = (x7g1) obj;
        return u890.j(this.a, x7g1Var.a) && u890.j(this.b, x7g1Var.b) && u890.j(this.c, x7g1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961);
    }

    public x7g1(String str, n5f0 n5f0Var, Locale locale, int i) {
        this(str, n5f0Var, (i & 8) != 0 ? Locale.ROOT : locale);
    }
}
