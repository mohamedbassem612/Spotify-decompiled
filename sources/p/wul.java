package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wul implements cwl {
    public final sbo a;

    public wul(sbo sboVar) {
        this.a = sboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wul) && this.a.equals(((wul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
