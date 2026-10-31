package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ofm {
    public final lik1 a;
    public final n6r0 b;
    public final bjm c;
    public final tv80 d;

    public ofm(lik1 lik1Var, n6r0 n6r0Var, bjm bjmVar, tv80 tv80Var) {
        this.a = lik1Var;
        this.b = n6r0Var;
        this.c = bjmVar;
        this.d = tv80Var;
    }

    public final tv80 a() {
        return this.d;
    }

    public final n6r0 b() {
        return this.b;
    }

    public final lik1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofm)) {
            return false;
        }
        ofm ofmVar = (ofm) obj;
        return u890.j(this.a, ofmVar.a) && u890.j(this.b, ofmVar.b) && u890.j(this.c, ofmVar.c) && u890.j(this.d, ofmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        bjm bjmVar = this.c;
        int iHashCode2 = (iHashCode + (bjmVar == null ? 0 : bjmVar.hashCode())) * 31;
        tv80 tv80Var = this.d;
        return Boolean.hashCode(false) + ((iHashCode2 + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
