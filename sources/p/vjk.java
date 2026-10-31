package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vjk extends jkk {
    public final vqk a;

    public vjk(vqk vqkVar) {
        this.a = vqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjk) && this.a.equals(((vjk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
