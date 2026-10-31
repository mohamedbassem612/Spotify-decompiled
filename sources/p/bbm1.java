package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bbm1 {
    public final nzn a;

    public bbm1(nzn nznVar) {
        this.a = nznVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbm1) && u890.j(this.a, ((bbm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
