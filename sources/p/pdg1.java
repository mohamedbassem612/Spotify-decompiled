package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pdg1 {
    public final int a;
    public final String b;

    public pdg1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdg1)) {
            return false;
        }
        pdg1 pdg1Var = (pdg1) obj;
        return this.a == pdg1Var.a && this.b.equals(pdg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
