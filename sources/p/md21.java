package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class md21 implements pd21 {
    public final nfu a;

    public /* synthetic */ md21() {
        this(jfu.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md21) && u890.j(this.a, ((md21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public md21(nfu nfuVar) {
        this.a = nfuVar;
    }
}
