package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bjb0 implements tyq {
    public final d0r a;
    public final nib0 b;
    public final glk0 c;
    public final ygb0 d;
    public final jd6 e;
    public final o3r f;
    public final km1 g;
    public final js20 h;
    public final eih1 i;
    public final psw t;

    public bjb0(d0r d0rVar, v6q v6qVar, nib0 nib0Var, glk0 glk0Var, ygb0 ygb0Var) {
        this.a = d0rVar;
        this.b = nib0Var;
        this.c = glk0Var;
        this.d = ygb0Var;
        this.e = v6qVar.a(d0rVar, new bz0(3, null, (byte) 16));
        jd11 jd11Var = rc11.a;
        this.f = w3p1.j(new l4r(new xv00(jd11Var.b(jo70.class)), 1, zib0.X, new j4r(rab0.c1), zib0.Y), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, zib0.Z, new j4r(rab0.d1), zib0.N0), new l4r(new xv00(jd11Var.b(pjw0.class)), 2, zib0.e, new j4r(rab0.e1), zib0.f), new l4r(new xv00(jd11Var.b(ro7.class)), 2, zib0.g, new j4r(zib0.b), zib0.h), new l4r(new xv00(jd11Var.b(ro7.class)), 2, zib0.i, new j4r(zib0.c), zib0.t), new l4r(hvm.b, 1, zib0.O0, new j4r(zib0.d), zib0.P0), mcm.h);
        this.g = new km1(this, (byte) 25);
        this.h = x3p1.n(new yib0(this, (byte) 0), rab0.b1, new gs90(this, (byte) 24), (o8n) null, new yib0(this, (byte) 1), 8);
        this.i = new eih1();
        j2i j2iVar = new j2i(1504948967, new pba0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public static zkk0 f(ro7 ro7Var) {
        String str = null;
        Double dValueOf = ro7Var != null ? Double.valueOf(ro7Var.a) : null;
        if (ro7Var != null) {
            String str2 = ro7Var.d.a;
            if (!ihc1.y0(str2)) {
                str = str2;
            }
        }
        return new zkk0(dValueOf, str);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.h;
    }

    public final f4r getData() {
        return this.g;
    }
}
