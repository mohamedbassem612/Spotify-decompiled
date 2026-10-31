package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k5d {
    public final String a;
    public final String b;

    public k5d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5d)) {
            return false;
        }
        k5d k5dVar = (k5d) obj;
        return u890.j(this.a, k5dVar.a) && u890.j(this.b, k5dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
