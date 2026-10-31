package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sdc1 {
    public final qdc1 a;

    public sdc1(qdc1 qdc1Var) {
        this.a = qdc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdc1) && this.a == ((sdc1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
