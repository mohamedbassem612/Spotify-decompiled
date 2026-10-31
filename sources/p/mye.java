package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mye implements nye {
    public final bif a;

    public mye(bif bifVar) {
        this.a = bifVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mye) && this.a.equals(((mye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
