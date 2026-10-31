package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ma8 implements ez00 {
    public final String a;
    public final wwo1 b;

    public ma8(String str, wwo1 wwo1Var) {
        this.a = str;
        this.b = wwo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma8)) {
            return false;
        }
        ma8 ma8Var = (ma8) obj;
        return this.a.equals(ma8Var.a) && this.b.equals(ma8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
