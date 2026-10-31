package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class it10 implements st10 {
    public final uv10 a;
    public final boolean b;

    public it10(uv10 uv10Var, boolean z) {
        this.a = uv10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it10)) {
            return false;
        }
        it10 it10Var = (it10) obj;
        return this.a.equals(it10Var.a) && this.b == it10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
