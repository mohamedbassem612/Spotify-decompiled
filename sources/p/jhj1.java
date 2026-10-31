package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jhj1 extends khj1 {
    public final wkt a;
    public final int b;

    public jhj1(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhj1)) {
            return false;
        }
        jhj1 jhj1Var = (jhj1) obj;
        return this.a.equals(jhj1Var.a) && this.b == jhj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
