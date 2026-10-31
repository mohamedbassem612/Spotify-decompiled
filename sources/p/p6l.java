package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6l implements r6l {
    public final j2i a;

    public p6l(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6l) && this.a == ((p6l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
