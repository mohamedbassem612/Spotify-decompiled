package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aap1 extends rvg {
    public final ipo1 a;
    public final qgn1 b;

    public aap1(ipo1 ipo1Var, qgn1 qgn1Var) {
        this.a = ipo1Var;
        this.b = qgn1Var;
    }

    public final ipo1 b() {
        return this.a;
    }

    public final qgn1 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rvg) {
            rvg rvgVar = (rvg) obj;
            ipo1 ipo1Var = this.a;
            if (ipo1Var != null ? ipo1Var.equals(((aap1) rvgVar).a) : ((aap1) rvgVar).a == null) {
                qgn1 qgn1Var = this.b;
                if (qgn1Var != null ? qgn1Var.equals(((aap1) rvgVar).b) : ((aap1) rvgVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ipo1 ipo1Var = this.a;
        int iHashCode = ipo1Var == null ? 0 : ipo1Var.hashCode();
        qgn1 qgn1Var = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (qgn1Var != null ? qgn1Var.hashCode() : 0);
    }

    public final String toString() {
        return cy30.p("CoWatchingQueue{clientQueue=", String.valueOf(this.a), ", serverQueueParams=", String.valueOf(this.b), "}");
    }
}
