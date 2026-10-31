package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aj90 {
    public final int a;
    public final int b;

    public aj90(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj90)) {
            return false;
        }
        aj90 aj90Var = (aj90) obj;
        return this.a == aj90Var.a && this.b == aj90Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
