package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyp implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ uyp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 4;
        Object obj = this.b;
        switch (b) {
            case 0:
                wmy wmyVar = ((vyp) obj).a;
                hyl0 hyl0Var = (hyl0) wmyVar.a;
                c8o.l(hyl0Var);
                flw0 flw0Var = (flw0) wmyVar.c;
                c8o.l(flw0Var);
                wh71 wh71Var = (wh71) wmyVar.d;
                c8o.l(wh71Var);
                smp0 smp0Var = new smp0(hyl0Var, new cfd(flw0Var, wh71Var, (byte) 4));
                q7r0 q7r0Var = (q7r0) wmyVar.f;
                hvp0 hvp0Var = new hvp0(q7r0Var, b3);
                cwl1.C(q7r0Var);
                return new cl71(smp0Var, hvp0Var);
            case 1:
                return new s241(xcz0.n((RetrofitMaker) ((daq) ((b6p) obj).b).Y3.get()));
            case 2:
                return new dcq(this, b2);
            case 3:
                return new jkq(this);
            case 4:
                wtp wtpVar = (wtp) obj;
                String strD = ((qop) wtpVar.d).d();
                a1r0 a1r0Var = (a1r0) ((b0q) wtpVar.b).a.V0.get();
                c8o.l(a1r0Var);
                return new kls0(strD, new f2g1(a1r0Var, (byte) 1));
            case 5:
                wtp wtpVar2 = (wtp) obj;
                String strD2 = ((qop) wtpVar2.d).d();
                a1r0 a1r0Var2 = (a1r0) ((ibq) wtpVar2.b).a.V0.get();
                c8o.l(a1r0Var2);
                return new kls0(strD2, new f2g1(a1r0Var2, (byte) 1));
            case 6:
                qqp qqpVar = (qqp) obj;
                qop qopVar = (qop) qqpVar.e;
                String strD3 = qopVar.d();
                koc0 koc0Var = ((jbt) qqpVar.d).d;
                l3q l3qVar = (l3q) qqpVar.b;
                q8n q8nVar = (q8n) l3qVar.a.r2.get();
                c8o.l(q8nVar);
                f2y0 f2y0Var = new f2y0(q8nVar, koc0Var);
                String strD4 = qopVar.d();
                sb7 sb7Var = (sb7) l3qVar.b.V5.get();
                c8o.l(sb7Var);
                q8n q8nVar2 = (q8n) l3qVar.a.V2.get();
                c8o.l(q8nVar2);
                return new et90(strD3, f2y0Var, new u1y0(strD4, sb7Var, q8nVar2), l3qVar.b.w0());
            case 7:
                return cwl1.C(((cjp) obj).a);
            case 8:
                return new zkq(this);
            case 9:
                qqp qqpVar2 = (qqp) obj;
                qop qopVar2 = (qop) qqpVar2.e;
                String strD5 = qopVar2.d();
                jbt jbtVar = (jbt) qqpVar2.d;
                d0r d0rVar = jbtVar.b;
                String strD6 = qopVar2.d();
                koc0 koc0Var2 = jbtVar.d;
                k3q k3qVar = (k3q) qqpVar2.b;
                q8n q8nVar3 = (q8n) k3qVar.a.r2.get();
                c8o.l(q8nVar3);
                c4y0 c4y0Var = new c4y0(d0rVar, strD6, koc0Var2, q8nVar3);
                String strD7 = qopVar2.d();
                q8n q8nVar4 = (q8n) k3qVar.a.V2.get();
                c8o.l(q8nVar4);
                ktv ktvVar = (ktv) k3qVar.b.n6.get();
                c8o.l(ktvVar);
                r3y0 r3y0Var = new r3y0(strD7, q8nVar4, ktvVar);
                asn asnVarW0 = k3qVar.b.w0();
                ktv ktvVar2 = (ktv) k3qVar.b.n6.get();
                c8o.l(ktvVar2);
                luk lukVar = (luk) k3qVar.a.L1.get();
                c8o.l(lukVar);
                return new rwj(strD5, c4y0Var, r3y0Var, asnVarW0, ktvVar2, new m980(new yx4(false, lukVar)));
            case 10:
                wtp wtpVar3 = (wtp) obj;
                String strD8 = ((qop) wtpVar3.d).d();
                lwp lwpVar = (lwp) ((lzp) wtpVar3.b).a.lg.get();
                c8o.l(lwpVar);
                return new ngs0(strD8, lwpVar);
            case 11:
                jbq jbqVar = (jbq) ((k2q) obj).b;
                teq teqVar = jbqVar.b;
                h3y0 h3y0Var = (h3y0) teqVar.k8.get();
                c8o.l(h3y0Var);
                a1r0 a1r0Var3 = (a1r0) teqVar.V0.get();
                c8o.l(a1r0Var3);
                daq daqVar = jbqVar.a;
                q8n q8nVar5 = (q8n) daqVar.w1.get();
                c8o.l(q8nVar5);
                e7y0 e7y0Var = (e7y0) daqVar.a.C4.get();
                c8o.l(e7y0Var);
                mie0 mie0VarZ0 = teqVar.a.Z0();
                x1i1 x1i1Var = (x1i1) teqVar.F6.get();
                c8o.l(x1i1Var);
                ced0 ced0Var = new ced0((byte) 4);
                luk lukVar2 = (luk) daqVar.L1.get();
                c8o.l(lukVar2);
                rg4 rg4Var = new rg4(lukVar2);
                u6y0 u6y0Var = (u6y0) teqVar.l8.get();
                c8o.l(u6y0Var);
                n5y0 n5y0Var = new n5y0(h3y0Var, a1r0Var3, q8nVar5, e7y0Var, mie0VarZ0, x1i1Var, ced0Var, rg4Var, u6y0Var);
                i5y0 i5y0Var = (i5y0) jbqVar.b.pb.get();
                c8o.l(i5y0Var);
                return new de40(n5y0Var, i5y0Var);
            case 12:
                wtp wtpVar4 = (wtp) obj;
                return new yg01(((qop) wtpVar4.d).d(), ((l0q) wtpVar4.b).a.i3(), (byte) 0);
            case 13:
                wtp wtpVar5 = (wtp) obj;
                jbq jbqVar2 = (jbq) wtpVar5.b;
                lzn0 lzn0Var = (lzn0) jbqVar2.b.i.get();
                c8o.l(lzn0Var);
                String strD9 = ((qop) wtpVar5.d).d();
                kt91 kt91Var = (kt91) jbqVar2.a.f8.get();
                c8o.l(kt91Var);
                xvo xvoVar = (xvo) jbqVar2.a.H8.get();
                c8o.l(xvoVar);
                zwz0 zwz0Var = (zwz0) jbqVar2.a.U1.get();
                c8o.l(zwz0Var);
                asn asnVarW1 = jbqVar2.b.w0();
                i5y0 i5y0Var2 = (i5y0) jbqVar2.b.pb.get();
                c8o.l(i5y0Var2);
                iz31 iz31Var = (iz31) jbqVar2.b.zg.get();
                c8o.l(iz31Var);
                x1i1 x1i1Var2 = (x1i1) jbqVar2.b.F6.get();
                c8o.l(x1i1Var2);
                return new z72(lzn0Var, strD9, kt91Var, xvoVar, zwz0Var, asnVarW1, i5y0Var2, iz31Var, x1i1Var2);
            case 14:
                return ((wzp) ((lbq) obj).b).a.h3();
            case 15:
                wtp wtpVar6 = (wtp) obj;
                String strD10 = ((qop) wtpVar6.d).d();
                k3q k3qVar2 = (k3q) wtpVar6.b;
                i5y0 i5y0Var3 = (i5y0) k3qVar2.b.pb.get();
                c8o.l(i5y0Var3);
                xq81 xq81Var = new xq81((i8h1) k3qVar2.b.d.A5.get(), (byte) 25);
                nfa0 nfa0Var = (nfa0) k3qVar2.a.b2.get();
                c8o.l(nfa0Var);
                t2 t2Var = new t2((lzn0) k3qVar2.b.i.get());
                x1i1 x1i1Var3 = (x1i1) k3qVar2.b.F6.get();
                c8o.l(x1i1Var3);
                return new pt(strD10, i5y0Var3, xq81Var, nfa0Var, t2Var, x1i1Var3);
            case 16:
                return new lmy0(new h2y0(((clq) obj).a, (byte) 16));
            case 17:
                wtp wtpVar7 = (wtp) obj;
                t8u0 t8u0Var = (t8u0) ((dry0) wtpVar7.d).d.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) wtpVar7.c, t8u0Var);
            case 18:
                wtp wtpVar8 = (wtp) obj;
                t8u0 t8u0Var2 = (t8u0) ((asy0) wtpVar8.d).d.get();
                c8o.l(t8u0Var2);
                return kmq0.x((q7r0) wtpVar8.c, t8u0Var2);
            case 19:
                wtp wtpVar9 = (wtp) obj;
                t8u0 t8u0Var3 = (t8u0) ((jty0) wtpVar9.d).b.get();
                c8o.l(t8u0Var3);
                return kmq0.x((q7r0) wtpVar9.c, t8u0Var3);
            case 20:
                tbl tblVar = ((elq) obj).a;
                return new ttz(new jn7(new CosmosCoroutineTransport(new r8c((CallbackRouter) tblVar.a.get(), (byte) 8))), (q8n) tblVar.b.get());
            case 21:
                return pzm.h((mos) ((r501) ((a1q) obj).b).a.get());
            case 22:
                jmq jmqVar = (jmq) obj;
                jbq jbqVar3 = (jbq) jmqVar.b;
                lzn0 lzn0Var2 = (lzn0) jbqVar3.b.i.get();
                c8o.l(lzn0Var2);
                String strD11 = ((qop) jmqVar.a).d();
                kt91 kt91Var2 = (kt91) jbqVar3.a.f8.get();
                c8o.l(kt91Var2);
                xvo xvoVar2 = (xvo) jbqVar3.a.H8.get();
                c8o.l(xvoVar2);
                zwz0 zwz0Var2 = (zwz0) jbqVar3.a.U1.get();
                c8o.l(zwz0Var2);
                luk lukVar3 = (luk) jbqVar3.a.L1.get();
                c8o.l(lukVar3);
                return new pt(lzn0Var2, strD11, kt91Var2, xvoVar2, zwz0Var2, new bf4(lukVar3));
            case 23:
                return pzm.h((mos) ((qd11) ((k2q) obj).b).a.get());
            case 24:
                return u1n0.z((q7r0) ((lbq) obj).b);
            case 25:
                return u1n0.z((q7r0) ((a1q) obj).b);
            case 26:
                return pzm.h((mos) ((ok21) ((k2q) obj).b).c.get());
            case 27:
                return pzm.h((mos) ((xl21) ((lbq) obj).b).a.get());
            case 28:
                i8h1 i8h1Var = (i8h1) ((wwk1) ((a1q) obj).b).d.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            default:
                ll3 ll3Var = ((uoq) obj).a;
                return new ij31(ll3Var.a(), (q8n) ll3Var.b.get(), new k6b1(ll3Var.a()));
        }
    }
}
