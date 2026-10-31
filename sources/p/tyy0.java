package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tyy0 implements k8n {
    public final float a;

    public tyy0(float f) {
        this.a = f;
    }

    public final float a(long j, wat watVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyy0) && Float.compare(this.a, ((tyy0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("CornerSize(size = ", this.a, ".px)");
    }
}
