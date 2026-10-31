package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b9x implements yue1 {
    public final String a;
    public final String b;
    public final d761 c;
    public final int d;
    public final String e;

    public b9x(String str, String str2, d761 d761Var, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = d761Var;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9x)) {
            return false;
        }
        b9x b9xVar = (b9x) obj;
        return this.a.equals(b9xVar.a) && this.b.equals(b9xVar.b) && this.c.equals(b9xVar.c) && this.d == b9xVar.d && this.e.equals(b9xVar.e);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, ktd.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c.a, 31), 31);
    }
}
