package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ue81 {
    public final s7n0 a;
    public final boolean b;
    public final boolean c;

    public ue81(s7n0 s7n0Var, boolean z, boolean z2) {
        this.a = s7n0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue81)) {
            return false;
        }
        ue81 ue81Var = (ue81) obj;
        return this.a == ue81Var.a && this.b == ue81Var.b && this.c == ue81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
