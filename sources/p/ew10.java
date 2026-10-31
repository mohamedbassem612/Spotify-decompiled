package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ew10 {
    public final uv10 a;
    public final uv10 b;

    public ew10(uv10 uv10Var, uv10 uv10Var2) {
        this.a = uv10Var;
        this.b = uv10Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew10)) {
            return false;
        }
        ew10 ew10Var = (ew10) obj;
        return this.a.equals(ew10Var.a) && this.b.equals(ew10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
