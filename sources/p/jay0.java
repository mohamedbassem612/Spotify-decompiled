package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jay0 extends kay0 {
    public final wkt a;
    public final int b;

    public jay0(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jay0)) {
            return false;
        }
        jay0 jay0Var = (jay0) obj;
        return this.a.equals(jay0Var.a) && this.b == jay0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
