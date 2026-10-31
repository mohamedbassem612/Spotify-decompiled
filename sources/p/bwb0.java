package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bwb0 {
    public final int a;
    public final String b;

    public bwb0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwb0)) {
            return false;
        }
        bwb0 bwb0Var = (bwb0) obj;
        return this.a == bwb0Var.a && this.b.equals(bwb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
