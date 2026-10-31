package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kf00 extends o4o1 {
    public final jj40 e;

    public kf00(jj40 jj40Var) {
        this.e = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf00) && u890.j(this.e, ((kf00) obj).e);
    }

    public final int hashCode() {
        jj40 jj40Var = this.e;
        if (jj40Var == null) {
            return 0;
        }
        return jj40Var.hashCode();
    }
}
