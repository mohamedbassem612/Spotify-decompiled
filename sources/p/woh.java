package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class woh implements iph {
    public final lnh a;

    public woh(lnh lnhVar) {
        this.a = lnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof woh) && this.a.equals(((woh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
