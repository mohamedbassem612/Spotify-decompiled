package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n5y {
    public final String a;
    public final String b;
    public final c380 c;

    public n5y(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5y)) {
            return false;
        }
        n5y n5yVar = (n5y) obj;
        return this.a.equals(n5yVar.a) && this.b.equals(n5yVar.b) && u890.j(this.c, n5yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
