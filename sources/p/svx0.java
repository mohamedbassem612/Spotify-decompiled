package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class svx0 implements zvx0 {
    public final boolean a;
    public final ktx0 b;

    public svx0(boolean z, ktx0 ktx0Var) {
        this.a = z;
        this.b = ktx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svx0)) {
            return false;
        }
        svx0 svx0Var = (svx0) obj;
        return this.a == svx0Var.a && u890.j(this.b, svx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
