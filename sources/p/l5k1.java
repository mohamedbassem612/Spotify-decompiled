package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l5k1 extends m5k1 {
    public final wkt a;

    public l5k1(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5k1) && u890.j(this.a, ((l5k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
