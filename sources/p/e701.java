package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e701 implements xpw {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ byte a;
    public final boolean b;
    public final ia00 c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public e701(gcj1 gcj1Var, c4q c4qVar, z3q z3qVar, op0 op0Var, a4q a4qVar, av0 av0Var, i44 i44Var, waj1 waj1Var, fv0 fv0Var, gw70 gw70Var, woa woaVar) {
        iaj1 iaj1Var;
        this.a = (byte) 1;
        this.e = op0Var;
        this.f = gw70Var;
        this.g = woaVar;
        this.b = true;
        fv0 fv0Var2 = waj1Var.d;
        this.h = fv0Var2 == null ? fv0Var : fv0Var2;
        czs czsVar = new czs();
        this.i = czsVar;
        t7i1 t7i1Var = new t7i1(gcj1Var, (byte) 1);
        switch (c4qVar.a) {
            case 0:
                thq thqVar = (thq) c4qVar.b;
                daq daqVar = thqVar.b;
                q8n q8nVar = (q8n) daqVar.V2.get();
                v5q v5qVar = (v5q) thqVar.c;
                iaj1Var = new iaj1(waj1Var, czsVar, q8nVar, v5qVar.a(), (pxc) v5qVar.f5.get(), w2x.A(new x6o0((ao0) v5qVar.b.Hk.get(), (byte) 4), new ycc1((lzn0) v5qVar.U0.get(), (xn0) v5qVar.b.jb.get(), (byte) 8), (a1r0) v5qVar.k1.get()), (ao0) daqVar.Hk.get(), new r0s0((Flowable) v5qVar.b.D5.get(), v5qVar.a()), (lr0) daqVar.a.K1.get());
                break;
            default:
                thq thqVar2 = (thq) c4qVar.b;
                daq daqVar2 = thqVar2.b;
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                teq teqVar = thqVar2.c;
                ruz ruzVarB = teqVar.b();
                pxc pxcVar = (pxc) teqVar.t7.get();
                teq teqVar2 = teqVar.b.b;
                daq daqVar3 = teqVar2.d;
                p2t p2tVarA = w2x.A(new x6o0((ao0) daqVar3.Hk.get(), (byte) 4), new ycc1((lzn0) teqVar2.i.get(), (xn0) daqVar3.jb.get(), (byte) 8), (a1r0) teqVar2.V0.get());
                ao0 ao0Var = (ao0) daqVar2.Hk.get();
                yiq yiqVar = teqVar.b;
                iaj1Var = new iaj1(waj1Var, czsVar, q8nVar2, ruzVarB, pxcVar, p2tVarA, ao0Var, new r0s0((Flowable) yiqVar.a.D5.get(), yiqVar.b.b()), (lr0) daqVar2.a.K1.get());
                break;
        }
        this.t = sbl.B(ddj1.a, t7i1Var, iaj1Var, new lda1(2, gcj1Var, gcj1.class, "onProps", "onProps(Lcom/spotify/adsdisplay/element/video/VideoAdElement$Props;Lcom/spotify/adsdisplay/elementimpl/video/mobius/domain/VideoAdState;)Lcom/spotify/mobius/Next;", 0, (byte) 8), new jyi1(a4qVar, this, gcj1Var, (byte) 1));
        h44 h44VarG = i44Var.g();
        this.X = h44VarG;
        xr6 xr6Var = dcj1.a;
        this.c = dcj1.a(paj1.a, h44VarG != h44.b);
        this.Y = new bzs();
        j2i j2iVar = new j2i(1929371823, new pj0(this, z3qVar, av0Var, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (ljm0) this.Y;
            default:
                return (e7m0) this.t;
        }
    }

    public e701(n6r0 n6r0Var, tag1 tag1Var, boolean z, q701 q701Var, wpw wpwVar, s801 s801Var, jz51 jz51Var) {
        this.a = (byte) 0;
        this.e = n6r0Var;
        this.f = tag1Var;
        this.b = z;
        this.g = q701Var;
        this.h = wpwVar;
        this.i = s801Var;
        this.t = jz51Var;
        this.X = w3p1.o(new l4r(pwc0.w, 1, k301.O0, new j4r(k301.Z), k301.P0), k301.N0);
        this.Y = h7w.D(k301.Y, (bs50) null, (iu30) null, new j2i(707147673, new wcy0(this, (byte) 2), true), 6);
        this.c = n3o1.q(this).a(new g001(this, (byte) 1), kxz0.N0);
        j2i j2iVar = new j2i(-1086092367, new zyy0(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
