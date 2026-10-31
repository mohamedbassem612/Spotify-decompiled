package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x040 implements z040 {
    public final ice a;

    public x040(ice iceVar) {
        this.a = iceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x040) && this.a.equals(((x040) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
