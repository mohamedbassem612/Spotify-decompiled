package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s2e implements w2e {
    public final j4e a;

    public s2e(j4e j4eVar) {
        this.a = j4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2e) && this.a.equals(((s2e) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1155674821;
    }
}
