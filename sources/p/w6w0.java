package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w6w0 {
    public final v6w0 a;
    public final boolean b;

    public w6w0(v6w0 v6w0Var, boolean z) {
        this.a = v6w0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6w0)) {
            return false;
        }
        w6w0 w6w0Var = (w6w0) obj;
        return this.a.equals(w6w0Var.a) && this.b == w6w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
