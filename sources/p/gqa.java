package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gqa extends iqa {
    public final wkt a;

    public gqa(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqa) && this.a.equals(((gqa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
