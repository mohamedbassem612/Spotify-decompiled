package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nvu0 extends g6p1 {
    public final hvu0 c;

    public nvu0(hvu0 hvu0Var) {
        this.c = hvu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvu0) && u890.j(this.c, ((nvu0) obj).c);
    }

    public final hvu0 h() {
        return this.c;
    }

    public final int hashCode() {
        hvu0 hvu0Var = this.c;
        if (hvu0Var == null) {
            return 0;
        }
        return hvu0Var.hashCode();
    }
}
