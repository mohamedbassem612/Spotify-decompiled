package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hax0 extends yax0 {
    public final String a;

    public hax0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hax0) && u890.j(this.a, ((hax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
