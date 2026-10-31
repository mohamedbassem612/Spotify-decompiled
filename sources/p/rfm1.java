package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfm1 {
    public final ufm1 a;
    public final wkt b;

    public rfm1(ufm1 ufm1Var, wkt wktVar) {
        this.a = ufm1Var;
        this.b = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfm1)) {
            return false;
        }
        rfm1 rfm1Var = (rfm1) obj;
        return this.a.equals(rfm1Var.a) && this.b.equals(rfm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
