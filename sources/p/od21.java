package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class od21 implements pd21 {
    public final l7y a;

    public od21(l7y l7yVar) {
        this.a = l7yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od21) && this.a.equals(((od21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
