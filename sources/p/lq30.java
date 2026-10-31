package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lq30 extends mq30 {
    public final wkt a;

    public lq30(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq30) && this.a.equals(((lq30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
