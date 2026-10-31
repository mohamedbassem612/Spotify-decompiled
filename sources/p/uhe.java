package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uhe {
    public final String a;
    public final long b;
    public final tv80 c;
    public final boolean d;

    public uhe(String str, long j, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = j;
        this.c = tv80Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhe)) {
            return false;
        }
        uhe uheVar = (uhe) obj;
        return u890.j(this.a, uheVar.a) && this.b == uheVar.b && this.c.equals(uheVar.c) && this.d == uheVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31);
    }
}
