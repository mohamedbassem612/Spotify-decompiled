package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wc41 implements yc41 {
    public final ytm0 a;

    public wc41(ytm0 ytm0Var) {
        this.a = ytm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc41) && this.a.equals(((wc41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
