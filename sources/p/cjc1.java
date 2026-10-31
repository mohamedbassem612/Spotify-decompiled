package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cjc1 {
    public final j2i a;

    public cjc1(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjc1) && this.a == ((cjc1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
