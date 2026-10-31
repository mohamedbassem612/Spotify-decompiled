package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class up70 {
    public final so20 a;
    public final vp70 b;

    public up70(so20 so20Var, vp70 vp70Var) {
        this.a = so20Var;
        this.b = vp70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up70)) {
            return false;
        }
        up70 up70Var = (up70) obj;
        return this.a.equals(up70Var.a) && this.b == up70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
