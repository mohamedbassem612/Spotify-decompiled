package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bw21 {
    public final int a;
    public final boolean b;

    public bw21(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw21)) {
            return false;
        }
        bw21 bw21Var = (bw21) obj;
        return this.a == bw21Var.a && this.b == bw21Var.b;
    }

    public final int hashCode() {
        int i = this.a;
        return Boolean.hashCode(this.b) + ((i == 0 ? 0 : l1d.C(i)) * 31);
    }
}
