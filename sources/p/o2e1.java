package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o2e1 extends u2e1 {
    public final wkt a;

    public o2e1(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2e1) && this.a.equals(((o2e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
