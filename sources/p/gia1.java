package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gia1 {
    public final boolean a;
    public final zha1 b;

    public gia1(boolean z, zha1 zha1Var) {
        this.a = z;
        this.b = zha1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gia1)) {
            return false;
        }
        gia1 gia1Var = (gia1) obj;
        return this.a == gia1Var.a && this.b == gia1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
