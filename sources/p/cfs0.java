package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cfs0 {
    public final float a;
    public final float b;

    public cfs0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfs0)) {
            return false;
        }
        cfs0 cfs0Var = (cfs0) obj;
        return p3v.c(this.a, cfs0Var.a) && p3v.c(this.b, cfs0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
