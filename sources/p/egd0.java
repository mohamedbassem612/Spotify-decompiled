package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class egd0 {
    public final boolean a;
    public final fgd0 b;

    public egd0(boolean z, fgd0 fgd0Var) {
        this.a = z;
        this.b = fgd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egd0)) {
            return false;
        }
        egd0 egd0Var = (egd0) obj;
        return this.a == egd0Var.a && this.b == egd0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
