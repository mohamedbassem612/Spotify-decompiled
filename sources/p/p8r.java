package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p8r implements dbr0 {
    public final String a;

    public p8r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8r) && u890.j(this.a, ((p8r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
