package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4f implements u4f {
    public final String a;
    public final String b;
    public final String c;
    public final r4f d;
    public final jwm e;

    public s4f(String str, String str2, String str3, r4f r4fVar, jwm jwmVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r4fVar;
        this.e = jwmVar;
    }

    @Override // p.u4f
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4f)) {
            return false;
        }
        s4f s4fVar = (s4f) obj;
        return u890.j(this.a, s4fVar.a) && u890.j(this.b, s4fVar.b) && u890.j(this.c, s4fVar.c) && u890.j(this.d, s4fVar.d) && this.e.equals(s4fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
