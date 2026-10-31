package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class avc1 implements evc1 {
    public final nfu a;

    public avc1(nfu nfuVar) {
        this.a = nfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avc1) && u890.j(this.a, ((avc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
