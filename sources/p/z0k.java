package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z0k implements k1k {
    public final String a;
    public final String b;

    public z0k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0k)) {
            return false;
        }
        z0k z0kVar = (z0k) obj;
        return u890.j(this.a, z0kVar.a) && u890.j(this.b, z0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
