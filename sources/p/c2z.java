package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c2z {
    public final String a;
    public final String b;
    public final g07 c;

    public c2z(String str, String str2, g07 g07Var) {
        this.a = str;
        this.b = str2;
        this.c = g07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2z)) {
            return false;
        }
        c2z c2zVar = (c2z) obj;
        return this.a.equals(c2zVar.a) && this.b.equals(c2zVar.b) && this.c.equals(c2zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
