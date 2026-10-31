package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xv31 extends hr80 {
    public final kjf1 e;

    public xv31(kjf1 kjf1Var) {
        this.e = kjf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv31) && u890.j(this.e, ((xv31) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
