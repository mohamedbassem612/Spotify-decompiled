package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uvx {
    public final int a;
    public final pgx b;
    public final int c;
    public final vzq0 d;
    public final vzq0 e;
    public final tvx f;
    public final hw61 g;
    public final int h;
    public final p3v i;

    public uvx(int i, pgx pgxVar, int i2, vzq0 vzq0Var, zzq0 zzq0Var, tvx tvxVar, hw61 hw61Var, int i3, p3v p3vVar, int i4) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? ngx.e : pgxVar, (i4 & 4) != 0 ? 3 : i2, (i4 & 8) != 0 ? null : vzq0Var, (i4 & 16) != 0 ? new zzq0(0.0f, 0.0f, 0.0f, 0.0f) : zzq0Var, (i4 & 32) != 0 ? null : tvxVar, (i4 & 64) != 0 ? null : hw61Var, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : p3vVar);
    }

    public static uvx a(uvx uvxVar, pgx pgxVar, int i, vzq0 vzq0Var, vzq0 vzq0Var2, tvx tvxVar, p3v p3vVar, int i2) {
        int i3 = (i2 & 1) != 0 ? uvxVar.a : 1;
        if ((i2 & 2) != 0) {
            pgxVar = uvxVar.b;
        }
        pgx pgxVar2 = pgxVar;
        if ((i2 & 4) != 0) {
            i = uvxVar.c;
        }
        int i4 = i;
        if ((i2 & 8) != 0) {
            vzq0Var = uvxVar.d;
        }
        vzq0 vzq0Var3 = vzq0Var;
        vzq0 vzq0Var4 = (i2 & 16) != 0 ? uvxVar.e : vzq0Var2;
        tvx tvxVar2 = (i2 & 32) != 0 ? uvxVar.f : tvxVar;
        hw61 hw61Var = uvxVar.g;
        int i5 = uvxVar.h;
        p3v p3vVar2 = (i2 & 256) != 0 ? uvxVar.i : p3vVar;
        uvxVar.getClass();
        return new uvx(i3, pgxVar2, i4, vzq0Var3, vzq0Var4, tvxVar2, hw61Var, i5, p3vVar2);
    }

    public static uvx b(uvx uvxVar, int i, tvx tvxVar, p3v p3vVar, int i2) {
        pgx pgxVar = mgx.e;
        int i3 = (i2 & 1) != 0 ? uvxVar.a : 1;
        if ((i2 & 2) != 0) {
            pgxVar = uvxVar.b;
        }
        pgx pgxVar2 = pgxVar;
        if ((i2 & 4) != 0) {
            i = uvxVar.c;
        }
        int i4 = i;
        if ((i2 & 8) != 0) {
            tvxVar = uvxVar.f;
        }
        tvx tvxVar2 = tvxVar;
        if ((i2 & 16) != 0) {
            p3vVar = uvxVar.i;
        }
        return new uvx(i3, pgxVar2, i4, uvxVar.d, uvxVar.e, tvxVar2, uvxVar.g, uvxVar.h, p3vVar);
    }

    public final pgx c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvx)) {
            return false;
        }
        uvx uvxVar = (uvx) obj;
        return this.a == uvxVar.a && u890.j(this.b, uvxVar.b) && this.c == uvxVar.c && u890.j(this.d, uvxVar.d) && u890.j(this.e, uvxVar.e) && u890.j(this.f, uvxVar.f) && u890.j(this.g, uvxVar.g) && this.h == uvxVar.h && u890.j(this.i, uvxVar.i);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (l1d.C(this.a) * 31)) * 31, 31);
        vzq0 vzq0Var = this.d;
        int iHashCode = (this.e.hashCode() + ((iK + (vzq0Var == null ? 0 : vzq0Var.hashCode())) * 31)) * 31;
        tvx tvxVar = this.f;
        int iHashCode2 = (iHashCode + (tvxVar == null ? 0 : tvxVar.hashCode())) * 31;
        hw61 hw61Var = this.g;
        int iK2 = ab80.k(this.h, (iHashCode2 + (hw61Var == null ? 0 : hw61Var.hashCode())) * 31, 31);
        p3v p3vVar = this.i;
        return iK2 + (p3vVar != null ? Float.hashCode(p3vVar.a) : 0);
    }

    public uvx(int i, pgx pgxVar, int i2, vzq0 vzq0Var, vzq0 vzq0Var2, tvx tvxVar, hw61 hw61Var, int i3, p3v p3vVar) {
        this.a = i;
        this.b = pgxVar;
        this.c = i2;
        this.d = vzq0Var;
        this.e = vzq0Var2;
        this.f = tvxVar;
        this.g = hw61Var;
        this.h = i3;
        this.i = p3vVar;
    }

    public uvx(pgx pgxVar, int i, tvx tvxVar, p3v p3vVar, int i2) {
        this((i2 & 1) != 0 ? 3 : 1, (i2 & 2) != 0 ? ngx.e : pgxVar, (i2 & 4) != 0 ? 3 : i, null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (i2 & 8) != 0 ? null : tvxVar, null, 1, (i2 & 16) != 0 ? null : p3vVar, 64);
    }
}
