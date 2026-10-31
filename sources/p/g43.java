package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g43 {
    public final vxx0 a;
    public final String b;
    public final boolean c;

    public g43(vxx0 vxx0Var, String str, boolean z) {
        this.a = vxx0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g43)) {
            return false;
        }
        g43 g43Var = (g43) obj;
        return u890.j(this.a, g43Var.a) && u890.j(this.b, g43Var.b) && this.c == g43Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
