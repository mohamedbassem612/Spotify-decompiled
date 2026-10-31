package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ir7 extends jr7 {
    public final wkt a;
    public final int b;

    public ir7(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir7)) {
            return false;
        }
        ir7 ir7Var = (ir7) obj;
        return this.a.equals(ir7Var.a) && this.b == ir7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
