package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hgw implements pgw {
    public final String a;

    public hgw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgw) && u890.j(this.a, ((hgw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
