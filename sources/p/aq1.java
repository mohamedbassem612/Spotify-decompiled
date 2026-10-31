package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aq1 implements cq1 {
    public final pia1 a;

    public aq1(pia1 pia1Var) {
        this.a = pia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq1) && this.a == ((aq1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
