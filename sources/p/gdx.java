package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gdx {
    public final vzq0 a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final lee1 f;

    static {
        new yla((byte) 9);
    }

    public gdx(vzq0 vzq0Var, float f, float f2, float f3, float f4, lee1 lee1Var) {
        this.a = vzq0Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = lee1Var;
    }

    public static gdx b(gdx gdxVar, zzq0 zzq0Var, float f, float f2, float f3, int i) {
        vzq0 vzq0Var = zzq0Var;
        if ((i & 1) != 0) {
            vzq0Var = gdxVar.a;
        }
        vzq0 vzq0Var2 = vzq0Var;
        if ((i & 2) != 0) {
            f = gdxVar.b;
        }
        float f4 = f;
        if ((i & 4) != 0) {
            f2 = gdxVar.c;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            f3 = gdxVar.d;
        }
        return new gdx(vzq0Var2, f4, f5, f3, (i & 16) != 0 ? gdxVar.e : 16.0f, gdxVar.f);
    }

    public final gdx a() {
        vzq0 vzq0Var = this.a;
        return b(this, uyn1.i(0.0f, vzq0Var.d(), 0.0f, vzq0Var.a()), 0.0f, 0.0f, 0.0f, 60);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdx)) {
            return false;
        }
        gdx gdxVar = (gdx) obj;
        return this.a.equals(gdxVar.a) && p3v.c(this.b, gdxVar.b) && p3v.c(this.c, gdxVar.c) && p3v.c(this.d, gdxVar.d) && p3v.c(this.e, gdxVar.e) && this.f.equals(gdxVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x0d.f(x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
