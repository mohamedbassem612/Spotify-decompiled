package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class em41 extends o60 {
    public final xk41 d;

    public em41(xk41 xk41Var) {
        super(xk41Var, true, (byte) 1);
        this.d = xk41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em41) && this.d.equals(((em41) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
