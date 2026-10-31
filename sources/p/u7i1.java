package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u7i1 implements xpw {
    public final ic9 a;
    public final c681 b;
    public final w4i1 c;
    public final String d;
    public final xks0 e;
    public final e7m0 f;
    public final eih1 g = new eih1();
    public final psw h;

    public u7i1(ic9 ic9Var, s7i1 s7i1Var, c681 c681Var, w4i1 w4i1Var, String str, xks0 xks0Var) {
        this.a = ic9Var;
        this.b = c681Var;
        this.c = w4i1Var;
        this.d = str;
        this.e = xks0Var;
        this.f = sbl.z(new o7i1(null, null), new t7i1(this, (byte) 0), s7i1Var, lbg1.c1, osh1.W0);
        j2i j2iVar = new j2i(631245953, new l6i1(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
