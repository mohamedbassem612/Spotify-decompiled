package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zz6 extends pno1 {
    public final float d;

    public zz6(float f) {
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz6) && Float.compare(this.d, ((zz6) obj).d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }
}
