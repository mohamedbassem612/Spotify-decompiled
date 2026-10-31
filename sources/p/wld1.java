package p;

import android.view.ViewGroup;
import com.spotify.creativework.v1.Release;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wld1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nmd1 b;
    public final /* synthetic */ n3z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wld1(n3z n3zVar, nmd1 nmd1Var) {
        super(2);
        this.a = (byte) 2;
        this.c = n3zVar;
        this.b = nmd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kty ktyVar;
        byte b = this.a;
        n3z n3zVar = this.c;
        nmd1 nmd1Var = this.b;
        switch (b) {
            case 0:
                iac0 iac0Var = (iac0) obj2;
                lwh lwhVar = nmd1Var.j;
                epb1 epb1Var = new epb1((zob1) obj);
                pwh pwhVar = nmd1Var.k;
                k9k k9kVar = (k9k) lwhVar.f.a.c;
                xrc0 xrc0VarL = ((bxd) k9kVar.b).l();
                c8o.l(xrc0VarL);
                p2o0 p2o0Var = new p2o0(iac0Var, xrc0VarL, (b2p) k9kVar.c, (b2p) k9kVar.d);
                epb1Var.f(iac0Var, new z11(p2o0Var, (byte) 7));
                return new jpg0(f6o1.A(new owh(lwhVar.a, p2o0Var, lwhVar.d.a(pwhVar.b()), lwhVar.b, lwhVar.c, lwhVar.e, pwhVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new uld1(n3zVar, (byte) 1));
            case 1:
                lvc1 lvc1Var = nmd1Var.i;
                return new jpg0(f6o1.A(new yag1((zob1) obj, (iac0) obj2, (lep) lvc1Var.c, (s801) lvc1Var.b, (lik1) lvc1Var.d), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new uld1(n3zVar, (byte) 3));
            case 2:
                iac0 iac0Var2 = (iac0) obj2;
                lo11 lo11VarO = Release.o();
                String str = n3zVar.a;
                lo11VarO.q(str);
                Release releaseBuild = lo11VarO.build();
                return nmd1Var.o.i() ? new jpg0(f6o1.A(a1x.a(nmd1Var.n, 2, iac0Var2, str), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new vld1(releaseBuild, (byte) 1)) : new jpg0(f6o1.A(nmd1Var.l.a(new lt20(yoi1.g(nmd1Var.m.b(new k72(str, d3d1.b, 5))), new q8t0(3, null, (byte) 16), (byte) 0), str), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new vld1(releaseBuild, (byte) 2));
            case 3:
                xty xtyVar = nmd1Var.d;
                lik1 lik1Var = nmd1Var.c.b;
                lzn0 lzn0Var = nmd1Var.b;
                d0r d0rVar = nmd1Var.a;
                k1q k1qVar = xtyVar.a;
                switch (k1qVar.a) {
                    case 0:
                        i2q i2qVar = k1qVar.b;
                        daq daqVar = i2qVar.a;
                        t8u0 t8u0Var = (t8u0) daqVar.d9.get();
                        Flowable flowable = (Flowable) daqVar.D5.get();
                        uu00 uu00Var = (uu00) daqVar.a5.get();
                        vbs vbsVar = (vbs) daqVar.wf.get();
                        teq teqVar = i2qVar.b;
                        ktyVar = new kty(lik1Var, lzn0Var, d0rVar, t8u0Var, flowable, uu00Var, vbsVar, (e7p0) teqVar.W4.get(), (b7r0) daqVar.p7.get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), (zs11) teqVar.J8.get(), (zwp) teqVar.qf.get(), (ycm) i2qVar.c.Z0.get(), (xh71) teqVar.N3.get(), (y5v0) teqVar.T4.get(), (w390) teqVar.nf.get(), (yh2) teqVar.f3.get(), (vb2) teqVar.n3.get(), (k9q) daqVar.yr.get(), (xd0) daqVar.Tp.get(), ((Boolean) daqVar.So.get()).booleanValue(), ((Boolean) daqVar.zr.get()).booleanValue(), (uvy) teqVar.a.o5.get(), (xrc0) teqVar.e1.get());
                        break;
                    default:
                        thq thqVar = k1qVar.b;
                        daq daqVar2 = thqVar.b;
                        t8u0 t8u0Var2 = (t8u0) daqVar2.d9.get();
                        Flowable flowable2 = (Flowable) daqVar2.D5.get();
                        uu00 uu00Var2 = (uu00) daqVar2.a5.get();
                        vbs vbsVar2 = (vbs) daqVar2.wf.get();
                        teq teqVar2 = thqVar.c;
                        ktyVar = new kty(lik1Var, lzn0Var, d0rVar, t8u0Var2, flowable2, uu00Var2, vbsVar2, (e7p0) teqVar2.W4.get(), (b7r0) daqVar2.p7.get(), (Scheduler) daqVar2.z1.get(), (yqg) daqVar2.J1.get(), (zs11) teqVar2.J8.get(), (zwp) teqVar2.qf.get(), (ycm) teqVar2.b.P.get(), (xh71) teqVar2.N3.get(), (y5v0) teqVar2.T4.get(), (w390) teqVar2.nf.get(), (yh2) teqVar2.f3.get(), (vb2) teqVar2.n3.get(), (k9q) daqVar2.yr.get(), (xd0) daqVar2.Tp.get(), ((Boolean) daqVar2.So.get()).booleanValue(), ((Boolean) daqVar2.zr.get()).booleanValue(), (uvy) teqVar2.a.o5.get(), (xrc0) teqVar2.e1.get());
                        break;
                }
                x2p x2pVar = new x2p(ktyVar);
                lik1 lik1Var2 = ktyVar.a;
                c8o.l(lik1Var2);
                xd0 xd0Var = ktyVar.t;
                c8o.l(xd0Var);
                Flowable flowable3 = ktyVar.e;
                c8o.l(flowable3);
                Scheduler scheduler = ktyVar.y;
                c8o.l(scheduler);
                yqg yqgVar = ktyVar.j;
                c8o.l(yqgVar);
                kl1 kl1Var = new kl1(xd0Var, flowable3, scheduler, yqgVar, ktyVar.u);
                k9q k9qVar = ktyVar.s;
                c8o.l(k9qVar);
                rmr rmrVar = new rmr((sdp) x2pVar.b.get(), (byte) 25);
                rdp rdpVar = (rdp) ((jly0) x2pVar.d).get();
                d0r d0rVar2 = ktyVar.c;
                return new jpg0(f6o1.A(new res(lik1Var2, d0rVar2, ktyVar.b, new wty(d0rVar2, kl1Var, k9qVar, rmrVar, rdpVar)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new uld1(n3zVar, (byte) 6));
            case 4:
                return new jpg0(nmd1Var.f.a(true, nmd1Var.h, nmd1Var.g), new uld1(n3zVar, (byte) 7));
            default:
                aru0 aru0Var = nmd1Var.e;
                bn70 bn70Var = nmd1Var.c;
                n6r0 n6r0Var = bn70Var.a;
                lik1 lik1Var3 = bn70Var.b;
                return new jpg0(new dx0(((jep) aru0Var.b).a(true), ((ubv0) aru0Var.c).a((yeu0) aru0Var.d, lik1Var3), n6r0Var, lik1Var3), new uld1(n3zVar, (byte) 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wld1(nmd1 nmd1Var, n3z n3zVar, byte b) {
        super(2);
        this.a = b;
        this.b = nmd1Var;
        this.c = n3zVar;
    }
}
