package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sjc1 {
    public final int a;
    public final wls0 b;

    public sjc1(int i, wls0 wls0Var) {
        this.a = i;
        this.b = wls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjc1)) {
            return false;
        }
        sjc1 sjc1Var = (sjc1) obj;
        return this.a == sjc1Var.a && this.b == sjc1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
