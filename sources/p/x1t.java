package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x1t implements xpw {
    public final qvq a;
    public final svq b;
    public final nxm1 c;
    public final tbr0 d;
    public final boolean e;
    public final bpb1 f;
    public final js20 g;
    public final eih1 h;
    public final psw i;

    public x1t(l6s l6sVar, qvq qvqVar, svq svqVar, z0t z0tVar, nxm1 nxm1Var, tbr0 tbr0Var) {
        this.a = qvqVar;
        this.b = svqVar;
        this.c = nxm1Var;
        this.d = tbr0Var;
        this.e = z0tVar.a.g();
        bpb1 bpb1VarB = gio1.b(Boolean.valueOf(nxm1Var.b));
        this.f = bpb1VarB;
        byte b = 26;
        mr20 wefVar = new wef(yoi1.g((Observable) ((idd1) ((iir) l6sVar.a).c).getValue()), (byte) 26);
        if (((z0t) l6sVar.c).a.g()) {
            euz euzVar = (euz) l6sVar.b;
            euzVar.getClass();
            wefVar = new x010(wefVar, new yc2(new m441(new p1r(euzVar, (lnm) null, (byte) 20)), (byte) 7), new k6s(3, null, (byte) 0), (byte) 1);
        }
        this.g = x3p1.m(new x010(wefVar, bpb1VarB, new w1t(3, null, (byte) 0), (byte) 1), d0t.R0, szr.W0, (o8n) null, new vas(this, (byte) 26), 8);
        this.h = new eih1();
        j2i j2iVar = new j2i(1823977271, new i6r(this, b), true);
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
