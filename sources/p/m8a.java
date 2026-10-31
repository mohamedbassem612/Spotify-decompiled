package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m8a implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final hi31 d;
    public final hi31 e;
    public final hi31 f;
    public final hi31 g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public m8a(String str, String str2, String str3, hi31 hi31Var, hi31 hi31Var2, hi31 hi31Var3, hi31 hi31Var4, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hi31Var;
        this.e = hi31Var2;
        this.f = hi31Var3;
        this.g = hi31Var4;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8a)) {
            return false;
        }
        m8a m8aVar = (m8a) obj;
        return this.a.equals(m8aVar.a) && this.b.equals(m8aVar.b) && this.c.equals(m8aVar.c) && this.d.equals(m8aVar.d) && this.e.equals(m8aVar.e) && u890.j(this.f, m8aVar.f) && u890.j(this.g, m8aVar.g) && this.h.equals(m8aVar.h) && this.i.equals(m8aVar.i) && this.j.equals(m8aVar.j) && this.k.equals(m8aVar.k) && this.l.equals(m8aVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        hi31 hi31Var = this.f;
        int iHashCode2 = (iHashCode + (hi31Var == null ? 0 : hi31Var.hashCode())) * 31;
        hi31 hi31Var2 = this.g;
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((iHashCode2 + (hi31Var2 != null ? hi31Var2.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
