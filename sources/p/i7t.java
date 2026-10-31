package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i7t {
    public final String a;
    public final int b;
    public final t8t c;

    public i7t(String str, int i, t8t t8tVar) {
        this.a = str;
        this.b = i;
        this.c = t8tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7t)) {
            return false;
        }
        i7t i7tVar = (i7t) obj;
        return u890.j(this.a, i7tVar.a) && this.b == i7tVar.b && u890.j(this.c, i7tVar.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        t8t t8tVar = this.c;
        return iK + (t8tVar == null ? 0 : t8tVar.hashCode());
    }
}
