package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class beb1 {
    public final aeb1 a;
    public final boolean b;

    public beb1(aeb1 aeb1Var, boolean z) {
        this.a = aeb1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beb1)) {
            return false;
        }
        beb1 beb1Var = (beb1) obj;
        return this.a.equals(beb1Var.a) && this.b == beb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
