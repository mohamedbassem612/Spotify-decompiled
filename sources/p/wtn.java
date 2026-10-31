package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wtn implements aun {
    public final fun a;

    public wtn(fun funVar) {
        this.a = funVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtn) && this.a.equals(((wtn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
