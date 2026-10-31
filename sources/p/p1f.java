package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p1f implements q3f {
    public final String a;

    public p1f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1f) && u890.j(this.a, ((p1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
