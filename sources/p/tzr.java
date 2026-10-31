package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tzr implements xpw {
    public final acq a;
    public final String b;
    public final evm1 c;
    public final ogr d;
    public final iu30 e;
    public final idd1 f;
    public final js20 g = z0o1.j(new rzr(this, (byte) 0), szr.b, new rzr(this, (byte) 1), 4);
    public final ia00 h = n3o1.q(this).a(zyr.f, new v08(this, (byte) 20));
    public final psw i;

    public tzr(dj81 dj81Var, acq acqVar, String str, evm1 evm1Var, ogr ogrVar, iu30 iu30Var) {
        this.a = acqVar;
        this.b = str;
        this.c = evm1Var;
        this.d = ogrVar;
        this.e = iu30Var;
        this.f = new idd1(new opg(dj81Var, (byte) 6));
        j2i j2iVar = new j2i(805930790, new i6r(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
