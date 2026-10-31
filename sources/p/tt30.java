package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tt30 extends ut30 {
    public final wkt a;

    public tt30(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt30) && this.a.equals(((tt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
