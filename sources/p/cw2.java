package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cw2 {
    public final xkk1 a;

    public cw2(xkk1 xkk1Var) {
        this.a = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw2) && u890.j(this.a, ((cw2) obj).a);
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        if (xkk1Var == null) {
            return 0;
        }
        return xkk1Var.hashCode();
    }
}
