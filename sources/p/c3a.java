package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c3a {
    public final String a;
    public final String b;
    public final nji0 c;

    public c3a(String str, String str2, nji0 nji0Var) {
        this.a = str;
        this.b = str2;
        this.c = nji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3a)) {
            return false;
        }
        c3a c3aVar = (c3a) obj;
        return u890.j(this.a, c3aVar.a) && u890.j(this.b, c3aVar.b) && this.c.equals(c3aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
