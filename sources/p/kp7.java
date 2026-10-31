package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kp7 implements tyq {
    public final psw N0;
    public final ia00 O0;
    public final ymm0 X;
    public final ip7 Y;
    public final js20 Z = x3p1.n(new hp7(this, (byte) 0), ge7.S0, c37.Y, (o8n) null, new hp7(this, (byte) 1), 8);
    public final rit0 a;
    public final String b;
    public final nm1 c;
    public final nm1 d;
    public final xvu e;
    public final fp7 f;
    public final qlb g;
    public final ngs0 h;
    public final fdc i;
    public final u7p0 t;

    public kp7(yk90 yk90Var, rit0 rit0Var, String str, nm1 nm1Var, q1p q1pVar, nm1 nm1Var2, xvu xvuVar, fp7 fp7Var, qlb qlbVar, ngs0 ngs0Var, fdc fdcVar, x6o0 x6o0Var) {
        this.a = rit0Var;
        this.b = str;
        this.c = nm1Var;
        this.d = nm1Var2;
        this.e = xvuVar;
        this.f = fp7Var;
        this.g = qlbVar;
        this.h = ngs0Var;
        this.i = fdcVar;
        this.t = q1pVar.a();
        this.X = new ymm0(x6o0Var, (byte) 24);
        this.Y = new ip7(this, yk90Var, (byte) 0);
        j2i j2iVar = new j2i(1956591354, new pj0(this, yk90Var, x6o0Var, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
        this.O0 = n3o1.q(this).a(d27.N0, d27.O0);
    }

    public static f1r f(xk90 xk90Var, hwq hwqVar) {
        wk90 wk90VarC;
        if (xk90Var == null || (wk90VarC = xk90Var.c(hwqVar, false)) == null) {
            return null;
        }
        return wk90VarC.a.a(hwqVar);
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.N0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.Y;
    }
}
