package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p7r {
    public final String a;

    public p7r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7r) && u890.j(this.a, ((p7r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
