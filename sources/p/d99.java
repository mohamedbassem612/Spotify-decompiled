package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d99 implements xpw {
    public final wpv0 a;
    public final iu30 b;
    public final rey0 c = new rey0(new ub3(this, (byte) 25));
    public final eih1 d = new eih1();
    public final psw e;

    public d99(wpv0 wpv0Var, iu30 iu30Var) {
        this.a = wpv0Var;
        this.b = iu30Var;
        j2i j2iVar = new j2i(1981335216, new i43(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static c10 e(lbt0 lbt0Var, x340 x340Var) {
        String strL = nik1.R1.a;
        String strO0 = cwl1.o0(x340Var, 2131959788);
        String strO1 = cwl1.o0(x340Var, 2131959787);
        if (lbt0Var.i) {
            strL = oon1.l(strL);
        }
        return new c10(strO0, 105, strO1, null, false, strL);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
