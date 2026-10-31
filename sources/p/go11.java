package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class go11 extends nb51 {
    public final nb51 b;
    public final int c;

    public go11(nb51 nb51Var, int i) {
        this.b = nb51Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go11)) {
            return false;
        }
        go11 go11Var = (go11) obj;
        return go11Var.b.equals(this.b) && go11Var.c == this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c * 31);
    }
}
