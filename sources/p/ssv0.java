package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ssv0 {
    public final ktv0 a;
    public final int b;

    public ssv0(ktv0 ktv0Var, int i) {
        this.a = ktv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssv0)) {
            return false;
        }
        ssv0 ssv0Var = (ssv0) obj;
        return this.a.equals(ssv0Var.a) && this.b == ssv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
