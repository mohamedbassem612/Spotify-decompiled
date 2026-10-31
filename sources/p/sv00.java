package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sv00 {
    public final boolean a;
    public final int b;

    public sv00(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv00)) {
            return false;
        }
        sv00 sv00Var = (sv00) obj;
        return this.a == sv00Var.a && this.b == sv00Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
