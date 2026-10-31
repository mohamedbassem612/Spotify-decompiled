package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q3v implements k8n {
    public final float a;

    public q3v(float f) {
        this.a = f;
    }

    @Override // p.k8n
    public final float a(long j, wat watVar) {
        return watVar.X0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3v) && p3v.c(this.a, ((q3v) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("CornerSize(size = ", this.a, ".dp)");
    }
}
