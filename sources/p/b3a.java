package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b3a {
    public final String a;
    public final String b;

    public b3a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3a)) {
            return false;
        }
        b3a b3aVar = (b3a) obj;
        return u890.j(this.a, b3aVar.a) && u890.j(this.b, b3aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
