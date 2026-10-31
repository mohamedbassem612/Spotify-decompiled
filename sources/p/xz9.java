package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xz9 extends zz9 {
    public final wkt a;

    public xz9(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz9) && this.a.equals(((xz9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
