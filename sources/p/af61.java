package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class af61 implements cf61 {
    public final j4e a;

    public af61(j4e j4eVar) {
        this.a = j4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af61) && this.a.equals(((af61) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1155674821;
    }
}
