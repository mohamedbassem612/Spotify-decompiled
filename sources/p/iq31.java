package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iq31 implements xpw {
    public final gq31 a;
    public final yqg b;
    public final e7m0 c;
    public final eih1 d;
    public final psw e;

    public iq31(gq31 gq31Var, fmq fmqVar, hlq hlqVar, ilq ilqVar, slq slqVar, yqg yqgVar) {
        this.a = gq31Var;
        this.b = yqgVar;
        vp31 vp31Var = gq31Var.c;
        boolean z = gq31Var.d;
        rq31 rq31Var = new rq31(vp31Var, z6x.a, new sq31((k1z0) o7h.q0(vp31Var.g), (Long) null, (Long) null, false), z, false, false);
        wam0 wam0Var = new wam0((byte) 12);
        iu30 iu30Var = gq31Var.g;
        iu30 iu30Var2 = gq31Var.h;
        ojq ojqVar = (ojq) fmqVar.a.c;
        q8n q8nVarA = ((jiz0) ojqVar.b).a();
        c8o.l(q8nVarA);
        yqg yqgVar2 = (yqg) ((jiz0) ojqVar.b).k.get();
        c8o.l(yqgVar2);
        fq31 fq31Var = new fq31(q8nVarA, yqgVar2, iu30Var, iu30Var2);
        this.c = sbl.z(rq31Var, wam0Var, fq31Var.d, jh31.e, new hq31(this, (byte) 1));
        this.d = new eih1();
        j2i j2iVar = new j2i(-1837388472, new sgi0(this, hlqVar, ilqVar, slqVar), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
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
