package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h2f implements p3f {
    public final String a;
    public final int b;

    public h2f(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2f)) {
            return false;
        }
        h2f h2fVar = (h2f) obj;
        return u890.j(this.a, h2fVar.a) && this.b == h2fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
