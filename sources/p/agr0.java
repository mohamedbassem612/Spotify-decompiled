package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class agr0 extends nyn1 {
    public final int c;
    public final int d;

    public agr0(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agr0)) {
            return false;
        }
        agr0 agr0Var = (agr0) obj;
        return this.c == agr0Var.c && this.d == agr0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }
}
