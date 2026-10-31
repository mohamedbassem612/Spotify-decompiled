package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oq3 extends hr3 {
    public final a3t0 a;
    public final boolean b;

    public oq3(a3t0 a3t0Var, boolean z) {
        this.a = a3t0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq3)) {
            return false;
        }
        oq3 oq3Var = (oq3) obj;
        return this.a == oq3Var.a && this.b == oq3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
