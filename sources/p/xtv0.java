package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xtv0 implements euv0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final djw0 d;

    public xtv0(String str, String str2, djw0 djw0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = djw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtv0)) {
            return false;
        }
        xtv0 xtv0Var = (xtv0) obj;
        return u890.j(this.a, xtv0Var.a) && u890.j(this.b, xtv0Var.b) && this.c == xtv0Var.c && u890.j(this.d, xtv0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(cy30.d((str == null ? 0 : str.hashCode()) * 31, 961, this.b), 31, this.c);
        djw0 djw0Var = this.d;
        return iG + (djw0Var != null ? djw0Var.hashCode() : 0);
    }
}
