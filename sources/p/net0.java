package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class net0 implements pet0 {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public net0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // p.pet0
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof net0)) {
            return false;
        }
        net0 net0Var = (net0) obj;
        return this.a == net0Var.a && this.b == net0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + xcg1.g(Boolean.hashCode(false) * 31, 31, this.a);
    }
}
