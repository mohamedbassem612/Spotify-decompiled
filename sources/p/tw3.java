package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tw3 extends rqt0 {
    public final String i;
    public final c2b0 j;
    public final boolean k;

    public tw3(String str, c2b0 c2b0Var, boolean z) {
        this.i = str;
        this.j = c2b0Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw3)) {
            return false;
        }
        tw3 tw3Var = (tw3) obj;
        return u890.j(this.i, tw3Var.i) && this.j == tw3Var.j && this.k == tw3Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + (this.i.hashCode() * 31)) * 31);
    }
}
