package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zdz0 {
    public final fwi0 a;
    public final iu30 b;

    public zdz0(fwi0 fwi0Var, iu30 iu30Var) {
        this.a = fwi0Var;
        this.b = iu30Var;
    }

    public final fwi0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdz0)) {
            return false;
        }
        zdz0 zdz0Var = (zdz0) obj;
        return this.a.equals(zdz0Var.a) && this.b.equals(zdz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
