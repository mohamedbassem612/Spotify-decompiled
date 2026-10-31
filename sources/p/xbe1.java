package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xbe1 {
    public final wbe1 a;
    public final float b;

    public xbe1(wbe1 wbe1Var, float f) {
        this.a = wbe1Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbe1)) {
            return false;
        }
        xbe1 xbe1Var = (xbe1) obj;
        return this.a == xbe1Var.a && Float.compare(this.b, xbe1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
