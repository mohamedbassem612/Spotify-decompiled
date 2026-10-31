package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i1k implements k1k {
    public final String a;

    public i1k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1k) && u890.j(this.a, ((i1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
