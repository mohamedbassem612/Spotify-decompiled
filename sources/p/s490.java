package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s490 extends vbe {
    public final Throwable e;
    public final g7o0 f;

    public s490(Throwable th, g7o0 g7o0Var) {
        super((byte) 9);
        this.e = th;
        this.f = g7o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s490)) {
            return false;
        }
        s490 s490Var = (s490) obj;
        return u890.j(this.e, s490Var.e) && this.f == s490Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }

    public final String toString() {
        return super.toString();
    }
}
