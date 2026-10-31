package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lec0 {
    public final c9 a;
    public final kec0 b;
    public final gec0 c;

    public lec0(c9 c9Var, kec0 kec0Var, gec0 gec0Var) {
        this.a = c9Var;
        this.b = kec0Var;
        this.c = gec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lec0)) {
            return false;
        }
        lec0 lec0Var = (lec0) obj;
        return u890.j(this.a, lec0Var.a) && this.b.equals(lec0Var.b) && u890.j(this.c, lec0Var.c);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c == null ? 0 : 1889685554);
    }
}
