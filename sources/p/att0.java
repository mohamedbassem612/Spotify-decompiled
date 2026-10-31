package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class att0 implements ez00 {
    public final boolean a;
    public final r1p1 b;

    public att0(boolean z, r1p1 r1p1Var) {
        this.a = z;
        this.b = r1p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof att0)) {
            return false;
        }
        att0 att0Var = (att0) obj;
        return this.a == att0Var.a && this.b.equals(att0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
