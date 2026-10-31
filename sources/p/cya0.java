package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cya0 {
    public final yig1 a;
    public final yxa0 b;
    public final tv80 c;

    public cya0(yig1 yig1Var, yxa0 yxa0Var, tv80 tv80Var) {
        this.a = yig1Var;
        this.b = yxa0Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cya0)) {
            return false;
        }
        cya0 cya0Var = (cya0) obj;
        return u890.j(this.a, cya0Var.a) && u890.j(this.b, cya0Var.b) && u890.j(this.c, cya0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
