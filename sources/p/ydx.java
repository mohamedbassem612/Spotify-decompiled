package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ydx {
    public final float a;
    public final float b;
    public final float c;
    public final vzq0 d;
    public final xdx e;

    public ydx(float f, float f2, float f3, vzq0 vzq0Var, xdx xdxVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = vzq0Var;
        this.e = xdxVar;
    }

    public static ydx a(ydx ydxVar, float f, float f2, zzq0 zzq0Var, int i) {
        if ((i & 1) != 0) {
            f = ydxVar.a;
        }
        float f3 = f;
        float f4 = (i & 2) != 0 ? ydxVar.b : 0.0f;
        if ((i & 4) != 0) {
            f2 = ydxVar.c;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            zzq0Var = ydxVar.d;
        }
        return new ydx(f3, f4, f5, zzq0Var, (i & 16) != 0 ? ydxVar.e : wdx.a);
    }

    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydx)) {
            return false;
        }
        ydx ydxVar = (ydx) obj;
        return p3v.c(this.a, ydxVar.a) && p3v.c(this.b, ydxVar.b) && p3v.c(this.c, ydxVar.c) && u890.j(this.d, ydxVar.d) && u890.j(this.e, ydxVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public /* synthetic */ ydx(float f, float f2, float f3, vzq0 vzq0Var) {
        this(f, f2, f3, vzq0Var, vdx.a);
    }
}
