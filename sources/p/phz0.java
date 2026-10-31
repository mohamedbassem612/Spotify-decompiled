package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class phz0 {
    public final String a;
    public final yj41 b;
    public final pkz0 c;
    public final qkz0 d;
    public final rkz0 e;
    public final skz0 f;
    public final boolean g;
    public final ohz0 h;
    public final ohz0 i;
    public final long j;
    public final gqb k;
    public final String l;
    public final String m;

    public phz0(String str, yj41 yj41Var, pkz0 pkz0Var, qkz0 qkz0Var, rkz0 rkz0Var, skz0 skz0Var, boolean z, ohz0 ohz0Var, ohz0 ohz0Var2, long j, gqb gqbVar, String str2, String str3) {
        this.a = str;
        this.b = yj41Var;
        this.c = pkz0Var;
        this.d = qkz0Var;
        this.e = rkz0Var;
        this.f = skz0Var;
        this.g = z;
        this.h = ohz0Var;
        this.i = ohz0Var2;
        this.j = j;
        this.k = gqbVar;
        this.l = str2;
        this.m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phz0) {
            phz0 phz0Var = (phz0) obj;
            if (this.a.equals(phz0Var.a) && this.b.equals(phz0Var.b) && this.c == phz0Var.c && this.d == phz0Var.d && this.e == phz0Var.e && this.f == phz0Var.f && this.g == phz0Var.g && u890.j(this.h, phz0Var.h) && u890.j(this.i, phz0Var.i)) {
                long j = phz0Var.j;
                int i = u7h.l;
                if (z4h1.b(this.j, j) && u890.j(this.k, phz0Var.k) && this.l.equals(phz0Var.l) && this.m.equals(phz0Var.m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + xcg1.g((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g)) * 31)) * 31;
        int i = u7h.l;
        int iF = cy30.f(iHashCode, this.j, 31);
        gqb gqbVar = this.k;
        return this.m.hashCode() + cy30.d((iF + (gqbVar == null ? 0 : gqbVar.hashCode())) * 31, 31, this.l);
    }
}
