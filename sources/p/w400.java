package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w400 extends v600 {
    public final wkt a;

    public w400(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w400) && this.a.equals(((w400) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
