package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m941 extends q941 {
    public final ev a;

    public m941(ev evVar) {
        this.a = evVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m941) && this.a.equals(((m941) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
