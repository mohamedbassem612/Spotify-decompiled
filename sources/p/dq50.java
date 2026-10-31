package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dq50 implements eq50 {
    public final j2i a;

    public dq50(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq50) && this.a == ((dq50) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
