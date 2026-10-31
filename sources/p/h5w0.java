package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class h5w0 {
    public static final g5w0 Companion = new g5w0();
    public final String a;
    public final e5w0 b;

    public /* synthetic */ h5w0(int i, String str, e5w0 e5w0Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, f5w0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = e5w0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5w0)) {
            return false;
        }
        h5w0 h5w0Var = (h5w0) obj;
        return u890.j(this.a, h5w0Var.a) && u890.j(this.b, h5w0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e5w0 e5w0Var = this.b;
        return iHashCode + (e5w0Var == null ? 0 : e5w0Var.hashCode());
    }
}
