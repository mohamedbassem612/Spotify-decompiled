package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z2b0 extends c3b0 {
    public final float a;

    public z2b0(float f) {
        this.a = f;
    }

    @Override // p.c3b0
    public final Object a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2b0) && Float.compare(this.a, ((z2b0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
