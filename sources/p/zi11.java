package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zi11 {
    public final String a;
    public final dj11 b;
    public final fvf1 c;
    public final tig0 d;

    public zi11(String str, dj11 dj11Var, fvf1 fvf1Var, tig0 tig0Var) {
        this.a = str;
        this.b = dj11Var;
        this.c = fvf1Var;
        this.d = tig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi11)) {
            return false;
        }
        zi11 zi11Var = (zi11) obj;
        return this.a.equals(zi11Var.a) && this.b.equals(zi11Var.b) && this.c.equals(zi11Var.c) && this.d.equals(zi11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
