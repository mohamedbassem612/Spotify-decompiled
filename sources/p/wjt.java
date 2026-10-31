package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wjt implements dkt {
    public final vjt a;

    public wjt(vjt vjtVar) {
        this.a = vjtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjt) && this.a == ((wjt) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
