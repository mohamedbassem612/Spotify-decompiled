package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ye61 implements cf61 {
    public final j4e a;

    public ye61(j4e j4eVar) {
        this.a = j4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye61) && this.a.equals(((ye61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
