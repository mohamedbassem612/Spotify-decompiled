package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uoc implements woc {
    public final nsn a;

    public uoc(nsn nsnVar) {
        this.a = nsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uoc) && this.a.equals(((uoc) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
