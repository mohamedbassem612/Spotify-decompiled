package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lpn0 extends mpn0 {
    public final String a;

    public lpn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpn0) && u890.j(this.a, ((lpn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
