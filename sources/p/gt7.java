package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gt7 extends jt7 {
    public final wkt a;

    public gt7(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt7) && this.a.equals(((gt7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
