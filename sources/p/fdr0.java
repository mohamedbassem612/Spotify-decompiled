package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fdr0 implements gdr0 {
    public final float a;

    public fdr0(float f) {
        this.a = f;
    }

    @Override // p.gdr0
    public final int a(wat watVar, int i) {
        return watVar.i0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdr0)) {
            return false;
        }
        return p3v.c(this.a, ((fdr0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
