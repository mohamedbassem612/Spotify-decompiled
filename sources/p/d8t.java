package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d8t {
    public final String a;
    public final int b;
    public final t8t c;
    public final boolean d;

    public d8t(String str, int i, t8t t8tVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = t8tVar;
        this.d = z;
    }

    public static d8t a(d8t d8tVar, boolean z) {
        return new d8t(d8tVar.a, d8tVar.b, d8tVar.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8t)) {
            return false;
        }
        d8t d8tVar = (d8t) obj;
        return u890.j(this.a, d8tVar.a) && this.b == d8tVar.b && u890.j(this.c, d8tVar.c) && this.d == d8tVar.d;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        t8t t8tVar = this.c;
        return Boolean.hashCode(this.d) + ((iK + (t8tVar == null ? 0 : t8tVar.hashCode())) * 31);
    }
}
