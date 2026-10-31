package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j1v extends poz0 {
    public final float b;

    public j1v(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1v) && Float.compare(this.b, ((j1v) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }
}
