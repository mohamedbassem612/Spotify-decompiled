package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bf61 implements cf61 {
    public final j4e a;

    public bf61(j4e j4eVar) {
        this.a = j4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf61) && this.a.equals(((bf61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
