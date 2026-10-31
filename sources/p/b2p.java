package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b2p implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b2p(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        s3p s3pVar = (s3p) this.c;
        byte b = 4;
        byte b2 = 0;
        byte b3 = 1;
        byte b4 = this.b;
        switch (b4) {
            case 0:
                xrc0 xrc0Var = (xrc0) ((i7c) s3pVar.X0).x.get();
                c8o.l(xrc0Var);
                return xrc0Var;
            case 1:
                gs80 gs80Var = (gs80) ((jly0) s3pVar.a).get();
                int i = t380.c;
                return new rmt(new b291(gs80Var));
            case 2:
                i7c i7cVar = (i7c) s3pVar.X0;
                kly0 kly0Var = i7cVar.H;
                kly0 kly0Var2 = i7cVar.M;
                oj3 oj3Var = (oj3) i7cVar.I.get();
                c8o.l(oj3Var);
                qut0 qut0Var = (qut0) kly0Var.get();
                c8o.l(qut0Var);
                hku0 hku0Var = new hku0((xrc0) ((b2p) s3pVar.a1).get());
                g7h g7hVar = (g7h) i7cVar.L.get();
                c8o.l(g7hVar);
                dp5 dp5Var = new dp5(g7hVar, (byte) 10);
                mwm1 mwm1Var = (mwm1) i7cVar.N.get();
                c8o.l(mwm1Var);
                w4h w4hVar = (w4h) kly0Var2.get();
                c8o.l(w4hVar);
                qpj1 qpj1Var = new qpj1(mwm1Var, w4hVar, (byte) 26);
                w4h w4hVar2 = (w4h) kly0Var2.get();
                c8o.l(w4hVar2);
                il00 il00Var = new il00(w4hVar2, (byte) 25);
                qut0 qut0Var2 = (qut0) kly0Var.get();
                c8o.l(qut0Var2);
                y1t0 y1t0Var = new y1t0(qut0Var2, (byte) 1);
                cig1 cig1Var = (cig1) i7cVar.K.get();
                c8o.l(cig1Var);
                el3 el3Var = (el3) i7cVar.J.get();
                c8o.l(el3Var);
                ffe1 ffe1Var = new ffe1(cig1Var, el3Var, (byte) 13);
                w4h w4hVar3 = (w4h) kly0Var2.get();
                c8o.l(w4hVar3);
                cp70 cp70Var = new cp70(w4hVar3);
                fns fnsVar = igu.a;
                c8o.m(fnsVar);
                qlw qlwVar = new qlw(oj3Var, qut0Var, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, fnsVar);
                String str = ((j7c) s3pVar.Y0).b;
                c8o.m(str);
                return new klo(qlwVar, str);
            case 3:
                b2p b2pVar = (b2p) s3pVar.b1;
                q7r0 q7r0Var = (q7r0) s3pVar.Z0;
                ynb0 ynb0VarA = xqu.a(b2pVar);
                k3p k3pVar = (k3p) ((jly0) s3pVar.c).get();
                i7c i7cVar2 = (i7c) s3pVar.X0;
                luk lukVar = (luk) i7cVar2.m.get();
                c8o.l(lukVar);
                kkt kktVar = new kkt(k3pVar, new mf4(lukVar), b2);
                lzn0 lzn0VarC = i7cVar2.c();
                c8o.l(lzn0VarC);
                jkt jktVar = new jkt(lzn0VarC, (byte) 2);
                b2p b2pVar2 = (b2p) s3pVar.c1;
                xfx xfxVar = (xfx) i7cVar2.j.get();
                c8o.l(xfxVar);
                hjc hjcVar = new hjc(xfxVar.b, (byte) 19);
                zu70 zu70Var = (zu70) ((jly0) s3pVar.d).get();
                lzn0 lzn0VarC2 = i7cVar2.c();
                c8o.l(lzn0VarC2);
                jkt jktVar2 = new jkt(new jc3(b2pVar2, hjcVar, zu70Var, lzn0VarC2), b);
                jkt jktVar3 = new jkt((l3p) ((jly0) s3pVar.e).get(), b3);
                kkt kktVar2 = new kkt(q7r0Var, new n9c((v7l1) ((jly0) s3pVar.h).get(), (b2p) s3pVar.c1, b3), b3);
                jkt jktVar4 = new jkt((p3p) ((jly0) s3pVar.i).get(), (byte) 6);
                jkt jktVar5 = new jkt((q3p) ((jly0) s3pVar.X).get(), b2);
                jkt jktVar6 = new jkt((g3p) ((jly0) s3pVar.Z).get(), (byte) 3);
                jkt jktVar7 = new jkt((jox0) ((jly0) s3pVar.O0).get(), (byte) 5);
                fgi0 fgi0Var = (fgi0) ((jly0) s3pVar.U0).get();
                ojv0 ojv0Var = (ojv0) i7cVar2.b.get();
                c8o.l(ojv0Var);
                Resources resources = (Resources) i7cVar2.C.get();
                c8o.l(resources);
                return new nnt(ynb0VarA, t380.w(kktVar, jktVar, jktVar2, jktVar3, kktVar2, jktVar4, new hmt[]{jktVar5, jktVar6, jktVar7, new bgi0(fgi0Var, ojv0Var, tk00.j(resources, ((Boolean) i7cVar2.B.get()).booleanValue()), q7r0Var, (Function0) ((jly0) s3pVar.V0).get())}), (rmt) ((jly0) s3pVar.b).get());
            case 4:
                return cwl1.C((q7r0) s3pVar.Z0);
            case 5:
                return new k3p(this, b2);
            case 6:
                i7c i7cVar3 = (i7c) s3pVar.X0;
                i7c i7cVar4 = (i7c) s3pVar.X0;
                xfx xfxVar2 = (xfx) i7cVar3.j.get();
                c8o.l(xfxVar2);
                lzn0 lzn0VarC3 = i7cVar4.c();
                c8o.l(lzn0VarC3);
                agc0 agc0Var = (agc0) i7cVar4.i.get();
                c8o.l(agc0Var);
                gw70 gw70VarB = i7cVar4.b();
                c8o.l(gw70VarB);
                return new d460(xfxVar2, gw70VarB, agc0Var, lzn0VarC3, true);
            case 7:
                return new dzo(this, b3);
            case 8:
                return new l3p(this);
            case 9:
                return new m3p(this, b2);
            case 10:
                return new n3p(this, b2);
            case 11:
                i7c i7cVar5 = (i7c) s3pVar.X0;
                i7c i7cVar6 = (i7c) s3pVar.X0;
                woa woaVar = (woa) i7cVar5.R.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) i7cVar6.S.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) i7cVar6.Q.get();
                c8o.l(fpaVar);
                pe peVarH = i7cVar6.h();
                c8o.l(peVarH);
                boolean zBooleanValue = ((Boolean) i7cVar6.O.get()).booleanValue();
                zle1 zle1Var = (zle1) i7cVar6.P.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVarH, zBooleanValue, zle1Var);
            case 12:
                return new o3p(this, b2);
            case 13:
                return new p3p(this);
            case 14:
                return new q3p(this);
            case 15:
                return new r3p(this);
            case 16:
                return new g3p(this);
            case 17:
                return new h3p(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new i3p(this, b2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new j3p(this, b2);
            case 20:
                mr20 mr20Var = (mr20) ((i7c) s3pVar.X0).F.get();
                c8o.l(mr20Var);
                c3s c3sVar = (c3s) ((i7c) s3pVar.X0).G.get();
                c8o.l(c3sVar);
                return new clm(mr20Var, c3sVar);
            case 21:
                b2p b2pVar3 = (b2p) s3pVar.g1;
                j7c j7cVar = (j7c) s3pVar.Y0;
                i7c i7cVar7 = (i7c) s3pVar.X0;
                ynb0 ynb0VarA2 = xqu.a(b2pVar3);
                b2p b2pVar4 = (b2p) s3pVar.h1;
                ynb0 ynb0VarA3 = xqu.a((b2p) s3pVar.i1);
                h5q h5qVar = (h5q) i7cVar7.A.get();
                c8o.l(h5qVar);
                b7r0 b7r0Var = (b7r0) i7cVar7.z.get();
                c8o.l(b7r0Var);
                ynb0 ynb0VarA4 = xqu.a((b2p) s3pVar.a1);
                ynb0 ynb0VarA5 = xqu.a((b2p) s3pVar.j1);
                ov20 ov20Var = (ov20) i7cVar7.t.get();
                c8o.l(ov20Var);
                yqg yqgVar = (yqg) ((b2p) s3pVar.k1).get();
                iac0 iac0Var = ((q7r0) s3pVar.Z0).d.c;
                c8o.m(iac0Var);
                n3d0 n3d0Var = (n3d0) i7cVar7.s.get();
                c8o.l(n3d0Var);
                String str2 = j7cVar.b;
                c8o.m(str2);
                String str3 = j7cVar.a;
                bn70 bn70Var = new bn70(f0o1.m(str3), f0o1.o(str3), (nar0) null);
                g3q0 g3q0Var = (g3q0) i7cVar7.r.get();
                c8o.l(g3q0Var);
                upp0 upp0Var = (upp0) i7cVar7.v.get();
                c8o.l(upp0Var);
                return bhb.o(ynb0VarA2, b2pVar4, ynb0VarA3, h5qVar, b7r0Var, ynb0VarA4, ynb0VarA5, ov20Var, yqgVar, iac0Var, n3d0Var, str2, bn70Var, g3q0Var, upp0Var, Optional.empty(), Optional.empty());
            case 22:
                return ((cyp) ((b2p) s3pVar.f1).get()).d();
            case 23:
                t8u0 t8u0Var = (t8u0) ((i7c) s3pVar.X0).w.get();
                c8o.l(t8u0Var);
                iac0 iac0Var2 = ((q7r0) s3pVar.Z0).d.c;
                c8o.m(iac0Var2);
                return t8u0Var.a(iac0Var2.getLifecycle());
            case 24:
                return new myq0((q7r0) s3pVar.Z0).get().toBuilder().build();
            case 25:
                return ((cyp) ((b2p) s3pVar.f1).get()).a();
            case 26:
                zut0 zut0Var = (zut0) ((i7c) s3pVar.X0).u.get();
                c8o.l(zut0Var);
                return zut0Var.a(new lb3(xqu.a((b2p) s3pVar.f1), (byte) 1), xqu.a((b2p) s3pVar.h1));
            case 27:
                yqg yqgVar2 = (yqg) ((i7c) s3pVar.X0).g.get();
                c8o.l(yqgVar2);
                return yqgVar2;
            case 28:
                return new lyo(this, b3);
            case 29:
                return new myo(this, b3);
            case 30:
                nwt nwtVar = (nwt) ((i7c) s3pVar.X0).l.get();
                c8o.l(nwtVar);
                return nwtVar;
            case 31:
                return new nyo(this, b3);
            case 32:
                ugn0 ugn0Var = (ugn0) ((i7c) s3pVar.X0).o.get();
                c8o.l(ugn0Var);
                return ugn0Var;
            case 33:
                return null;
            case 34:
                return new oyo(this, b3);
            case 35:
                return (ku71) xqu.a((b2p) s3pVar.p1).get();
            case 36:
                dma1 dma1Var = (dma1) ((i7c) s3pVar.X0).f25p.get();
                c8o.l(dma1Var);
                nfa0 nfa0Var = (nfa0) ((i7c) s3pVar.X0).q.get();
                c8o.l(nfa0Var);
                return new ku71(dma1Var, nfa0Var, new du71());
            case 37:
                return new hfw0(u1n0.z((q7r0) s3pVar.Z0));
            case 38:
                return new nfw0(brt.x(), (b2p) s3pVar.k1, (b2p) s3pVar.n1, (b2p) s3pVar.m1, (b2p) s3pVar.e1, (b2p) s3pVar.o1, (b2p) s3pVar.i1, (b2p) s3pVar.q1, (jly0) s3pVar.Q0);
            case 39:
                i7c i7cVar8 = (i7c) s3pVar.X0;
                i7c i7cVar9 = (i7c) s3pVar.X0;
                xfx xfxVar3 = (xfx) i7cVar8.j.get();
                c8o.l(xfxVar3);
                lzn0 lzn0VarC4 = i7cVar9.c();
                c8o.l(lzn0VarC4);
                agc0 agc0Var2 = (agc0) i7cVar9.i.get();
                c8o.l(agc0Var2);
                gw70 gw70VarB2 = i7cVar9.b();
                c8o.l(gw70VarB2);
                return new luj(xfxVar3, gw70VarB2, agc0Var2, lzn0VarC4, true);
            case 40:
                return new pyo(this, b3);
            case 41:
                return new qa2((q7r0) s3pVar.Z0, (byte) 4);
            default:
                jah.e(b4);
                return null;
        }
    }

    private final Object b() {
        d4p d4pVar = (d4p) this.c;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        byte b4 = this.b;
        switch (b4) {
            case 0:
                yqg yqgVar = (yqg) d4pVar.a.v.get();
                c8o.l(yqgVar);
                return yqgVar;
            case 1:
                jly0 jly0Var = d4pVar.e;
                m8c m8cVar = d4pVar.a;
                q7r0 q7r0Var = d4pVar.c;
                n9e n9eVar = new n9e((k3p) jly0Var.get(), b2);
                hnx0 hnx0Var = (hnx0) d4pVar.h.get();
                tiv0 tiv0Var = (tiv0) d4pVar.i.get();
                kly0 kly0Var = m8cVar.h0;
                kly0 kly0Var2 = m8cVar.R;
                kly0 kly0Var3 = m8cVar.f0;
                kly0 kly0Var4 = m8cVar.E;
                kly0 kly0Var5 = m8cVar.i0;
                kly0 kly0Var6 = m8cVar.U;
                ycm ycmVarD = m8cVar.d();
                c8o.l(ycmVarD);
                zkw0 zkw0Var = new zkw0(hnx0Var, tiv0Var, ycmVarD, d4pVar.e());
                lox0 lox0Var = new lox0((jox0) d4pVar.s.get());
                Activity activity = (Activity) kly0Var5.get();
                c8o.l(activity);
                gw70 gw70VarB = m8cVar.b();
                c8o.l(gw70VarB);
                lzn0 lzn0VarI = m8cVar.i();
                c8o.l(lzn0VarI);
                l0x0 l0x0VarH = d4pVar.h();
                myq0 myq0VarE = d4pVar.e();
                ycm ycmVarD2 = m8cVar.d();
                c8o.l(ycmVarD2);
                aru0 aru0VarD = d4pVar.d();
                Flowable flowable = (Flowable) m8cVar.y.get();
                c8o.l(flowable);
                vgm vgmVarE = m8cVar.e();
                c8o.l(vgmVarE);
                qr20 qr20Var = (qr20) kly0Var4.get();
                c8o.l(qr20Var);
                tiv0 tiv0Var2 = (tiv0) d4pVar.i.get();
                iac0 iac0VarC = d4pVar.c();
                xfx xfxVar = (xfx) m8cVar.b.get();
                c8o.l(xfxVar);
                qr20 qr20Var2 = (qr20) kly0Var4.get();
                c8o.l(qr20Var2);
                Activity activity2 = (Activity) kly0Var5.get();
                c8o.l(activity2);
                r961 r961Var = new r961(xfxVar, qr20Var2, activity2, (byte) 15);
                y441 y441Var = new y441();
                hvp0 hvp0VarG = d4pVar.g();
                ggl gglVar = (ggl) d4pVar.t.get();
                luk lukVarC = m8cVar.c();
                c8o.l(lukVarC);
                q15 q15Var = new q15(false, lukVarC);
                uu00 uu00Var = (uu00) m8cVar.g.get();
                c8o.l(uu00Var);
                luk lukVarC2 = m8cVar.c();
                c8o.l(lukVarC2);
                tbw0 tbw0VarM = iwv0.m(new o35(lukVarC2), d4pVar.A, d4pVar.B);
                dnc dncVar = (dnc) d4pVar.q.get();
                cua cuaVar = new cua((byte) 17);
                yqg yqgVar2 = (yqg) d4pVar.d.get();
                t2j0 t2j0Var = (t2j0) kly0Var3.get();
                c8o.l(t2j0Var);
                krh krhVar = (krh) m8cVar.D0.get();
                c8o.l(krhVar);
                qa2 qa2Var = new qa2(q7r0Var, (byte) 5);
                qa2 qa2Var2 = new qa2(q7r0Var, (byte) 6);
                nwt nwtVar = (nwt) d4pVar.v.get();
                ov20 ov20Var = (ov20) m8cVar.E0.get();
                c8o.l(ov20Var);
                ee81 ee81Var = new ee81(activity, gw70VarB, lzn0VarI, l0x0VarH, myq0VarE, ycmVarD2, aru0VarD, flowable, vgmVarE, qr20Var, tiv0Var2, iac0VarC, r961Var, y441Var, hvp0VarG, gglVar, q15Var, uu00Var, tbw0VarM, dncVar, cuaVar, yqgVar2, t2j0Var, krhVar, qa2Var, qa2Var2, nwtVar, ov20Var, d4pVar.b());
                lzn0 lzn0VarI2 = m8cVar.i();
                c8o.l(lzn0VarI2);
                n9e n9eVar2 = new n9e(lzn0VarI2, (byte) 2);
                lox0 lox0Var2 = new lox0(new n9c((v7l1) d4pVar.F.get(), d4pVar.f, (byte) 0), q7r0Var);
                ez01 ez01Var = (ez01) m8cVar.C0.get();
                c8o.l(ez01Var);
                n9e n9eVar3 = new n9e(ez01Var, (byte) 1);
                o290 o290Var = (o290) m8cVar.T.get();
                c8o.l(o290Var);
                jjh1 jjh1Var = (jjh1) kly0Var6.get();
                c8o.l(jjh1Var);
                hs00 hs00Var = (hs00) kly0Var2.get();
                c8o.l(hs00Var);
                yiu yiuVar = new yiu(o290Var, jjh1Var, hs00Var, d4pVar.a());
                q8n q8nVar = (q8n) kly0Var.get();
                c8o.l(q8nVar);
                g01 g01Var = (g01) m8cVar.a0.get();
                c8o.l(g01Var);
                hfq hfqVar = (hfq) m8cVar.b0.get();
                c8o.l(hfqVar);
                w9u0 w9u0Var = (w9u0) d4pVar.n.get();
                li0 li0Var = (li0) m8cVar.W.get();
                c8o.l(li0Var);
                av0 av0Var = (av0) m8cVar.X.get();
                c8o.l(av0Var);
                q8n q8nVar2 = (q8n) kly0Var.get();
                c8o.l(q8nVar2);
                vi11 vi11Var = new vi11(li0Var, av0Var, q8nVar2, (byte) 21);
                hs00 hs00Var2 = (hs00) kly0Var2.get();
                c8o.l(hs00Var2);
                jjh1 jjh1Var2 = (jjh1) kly0Var6.get();
                c8o.l(jjh1Var2);
                t2j0 t2j0Var2 = (t2j0) kly0Var3.get();
                c8o.l(t2j0Var2);
                xn0 xn0Var = (xn0) m8cVar.d0.get();
                c8o.l(xn0Var);
                ao0 ao0Var = (ao0) m8cVar.Y.get();
                c8o.l(ao0Var);
                fta ftaVar = new fta(jjh1Var2, t2j0Var2, xn0Var, ao0Var, (byte) 10);
                pxc pxcVar = (pxc) m8cVar.Z.get();
                c8o.l(pxcVar);
                m4c m4cVar = new m4c((byte) 0, false);
                gdh1 gdh1Var = (gdh1) m8cVar.e0.get();
                c8o.l(gdh1Var);
                j2x j2xVar = (j2x) m8cVar.g0.get();
                c8o.l(j2xVar);
                gcq gcqVar = (gcq) m8cVar.c0.get();
                c8o.l(gcqVar);
                jjh1 jjh1Var3 = (jjh1) kly0Var6.get();
                c8o.l(jjh1Var3);
                aq0 aq0Var = (aq0) m8cVar.y0.get();
                c8o.l(aq0Var);
                return new k6c(t380.w(n9eVar, zkw0Var, lox0Var, ee81Var, n9eVar2, lox0Var2, new x8c[]{n9eVar3, yiuVar, new wcj1(q8nVar, g01Var, hfqVar, w9u0Var, vi11Var, hs00Var2, ftaVar, pxcVar, m4cVar, gdh1Var, j2xVar, gcqVar, jjh1Var3, aq0Var, d4pVar.a()), new rbi0((t3p) d4pVar.H.get(), new qa2(q7r0Var, (byte) 5), new qa2(q7r0Var, (byte) 6), new i9c(), d4pVar.i(), d4pVar.b(), d4pVar.a()), new qvj1((u3p) d4pVar.I.get(), new qa2(q7r0Var, (byte) 5), new qa2(q7r0Var, (byte) 6), new i9c(), d4pVar.i(), d4pVar.b()), new mnt0(new u9c((pmt0) d4pVar.J.get(), (hnt0) d4pVar.K.get(), new i9c(), d4pVar.i(), d4pVar.b()), d4pVar.a()), new zkw0((mii0) d4pVar.L.get(), d4pVar.b(), new qa2(q7r0Var, (byte) 5), new qa2(q7r0Var, (byte) 6))}));
            case 2:
                return new k3p(this, b3);
            case 3:
                return new a4p(this);
            case 4:
                m8c m8cVar2 = d4pVar.a;
                m8c m8cVar3 = d4pVar.a;
                xfx xfxVar2 = (xfx) m8cVar2.b.get();
                c8o.l(xfxVar2);
                lzn0 lzn0VarI3 = m8cVar3.i();
                c8o.l(lzn0VarI3);
                agc0 agc0Var = (agc0) m8cVar3.l0.get();
                c8o.l(agc0Var);
                gw70 gw70VarB2 = m8cVar3.b();
                c8o.l(gw70VarB2);
                return new d460(xfxVar2, gw70VarB2, agc0Var, lzn0VarI3, true);
            case 5:
                return new b4p(this);
            case 6:
                return new c4p(this);
            case 7:
                mr20 mr20Var = (mr20) d4pVar.a.z.get();
                c8o.l(mr20Var);
                c3s c3sVar = (c3s) d4pVar.a.A.get();
                c8o.l(c3sVar);
                return new clm(mr20Var, c3sVar);
            case 8:
                b2p b2pVar = d4pVar.l;
                m8c m8cVar4 = d4pVar.a;
                ynb0 ynb0VarA = xqu.a(b2pVar);
                b2p b2pVar2 = d4pVar.m;
                ynb0 ynb0VarA2 = xqu.a(d4pVar.n);
                h5q h5qVar = (h5q) m8cVar4.F.get();
                c8o.l(h5qVar);
                b7r0 b7r0Var = (b7r0) m8cVar4.G.get();
                c8o.l(b7r0Var);
                ynb0 ynb0VarA3 = xqu.a(d4pVar.o);
                ynb0 ynb0VarA4 = xqu.a(d4pVar.f6p);
                ov20 ov20Var2 = (ov20) m8cVar4.E0.get();
                c8o.l(ov20Var2);
                yqg yqgVar3 = (yqg) d4pVar.d.get();
                iac0 iac0VarC2 = d4pVar.c();
                n3d0 n3d0Var = (n3d0) m8cVar4.Q.get();
                c8o.l(n3d0Var);
                String str = d4pVar.b.b;
                c8o.m(str);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                bn70 bn70Var = new bn70(yon1.G1("BROWSE", "browse", 248, "browse"), nik1.B0, (nar0) null);
                g3q0 g3q0Var = (g3q0) m8cVar4.j0.get();
                c8o.l(g3q0Var);
                upp0 upp0Var = (upp0) m8cVar4.I.get();
                c8o.l(upp0Var);
                Optional optionalEmpty = Optional.empty();
                uvy uvyVar = (uvy) m8cVar4.z0.get();
                c8o.l(uvyVar);
                return bhb.o(ynb0VarA, b2pVar2, ynb0VarA2, h5qVar, b7r0Var, ynb0VarA3, ynb0VarA4, ov20Var2, yqgVar3, iac0VarC2, n3d0Var, str, bn70Var, g3q0Var, upp0Var, optionalEmpty, Optional.of(uvyVar));
            case 9:
                return ((cyp) d4pVar.k.get()).d();
            case 10:
                t8u0 t8u0Var = (t8u0) d4pVar.a.J.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(d4pVar.c().getLifecycle());
            case 11:
                return new myq0(d4pVar.c).get().toBuilder().referrerIdentifier("debug").build();
            case 12:
                return ((cyp) d4pVar.k.get()).a();
            case 13:
                xrc0 xrc0Var = (xrc0) d4pVar.a.r.get();
                c8o.l(xrc0Var);
                return xrc0Var;
            case 14:
                zut0 zut0Var = (zut0) d4pVar.a.H.get();
                c8o.l(zut0Var);
                return zut0Var.a(new lb3(xqu.a(d4pVar.k), (byte) 2), xqu.a(d4pVar.m));
            case 15:
                return new i3p(this, b3);
            case 16:
                return new j3p(this, b3);
            case 17:
                ggl gglVar2 = (ggl) d4pVar.a.S.get();
                c8o.l(gglVar2);
                return gglVar2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new nyo(this, b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ugn0 ugn0Var = (ugn0) d4pVar.a.v0.get();
                c8o.l(ugn0Var);
                return ugn0Var;
            case 20:
                nwt nwtVar2 = (nwt) d4pVar.a.u0.get();
                c8o.l(nwtVar2);
                return nwtVar2;
            case 21:
                return new oyo(this, b);
            case 22:
                return (ku71) xqu.a(d4pVar.w).get();
            case 23:
                dma1 dma1Var = (dma1) d4pVar.a.w0.get();
                c8o.l(dma1Var);
                nfa0 nfa0Var = (nfa0) d4pVar.a.x0.get();
                c8o.l(nfa0Var);
                return new ku71(dma1Var, nfa0Var, new du71());
            case 24:
                return new hfw0(u1n0.z(d4pVar.c));
            case 25:
                q8n q8nVar3 = (q8n) d4pVar.a.h0.get();
                c8o.l(q8nVar3);
                return new nfw0(q8nVar3, d4pVar.d, d4pVar.u, d4pVar.v, d4pVar.j, d4pVar.t, d4pVar.n, d4pVar.z, d4pVar.y);
            case 26:
                return new m3p(this, b3);
            case 27:
                return new n3p(this, b3);
            case 28:
                m8c m8cVar5 = d4pVar.a;
                m8c m8cVar6 = d4pVar.a;
                woa woaVar = (woa) m8cVar5.M.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) m8cVar6.N.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) m8cVar6.O.get();
                c8o.l(fpaVar);
                pe peVarH = m8cVar6.h();
                c8o.l(peVarH);
                boolean zBooleanValue = ((Boolean) m8cVar6.P.get()).booleanValue();
                zle1 zle1Var = (zle1) m8cVar6.L.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVarH, zBooleanValue, zle1Var);
            case 29:
                return new o3p(this, b3);
            case 30:
                return new t3p(this);
            case 31:
                m8c m8cVar7 = d4pVar.a;
                m8c m8cVar8 = d4pVar.a;
                xfx xfxVar3 = (xfx) m8cVar7.b.get();
                c8o.l(xfxVar3);
                lzn0 lzn0VarI4 = m8cVar8.i();
                c8o.l(lzn0VarI4);
                agc0 agc0Var2 = (agc0) m8cVar8.l0.get();
                c8o.l(agc0Var2);
                gw70 gw70VarB3 = m8cVar8.b();
                c8o.l(gw70VarB3);
                return new luj(xfxVar3, gw70VarB3, agc0Var2, lzn0VarI4, true);
            case 32:
                return new u3p(this, (byte) 0);
            case 33:
                return new v3p(this);
            case 34:
                return new w3p(this);
            case 35:
                return new x3p(this);
            case 36:
                m8c m8cVar9 = d4pVar.a;
                kly0 kly0Var7 = m8cVar9.o;
                kly0 kly0Var8 = m8cVar9.f39p;
                oj3 oj3Var = (oj3) m8cVar9.k.get();
                c8o.l(oj3Var);
                qut0 qut0Var = (qut0) kly0Var7.get();
                c8o.l(qut0Var);
                hku0 hku0Var = new hku0((xrc0) d4pVar.o.get());
                g7h g7hVar = (g7h) m8cVar9.q.get();
                c8o.l(g7hVar);
                dp5 dp5Var = new dp5(g7hVar, (byte) 10);
                RxRouter rxRouter = (RxRouter) m8cVar9.s.get();
                c8o.l(rxRouter);
                mwm1 mwm1VarC = npp0.C(rxRouter);
                w4h w4hVar = (w4h) kly0Var8.get();
                c8o.l(w4hVar);
                qpj1 qpj1Var = new qpj1(mwm1VarC, w4hVar, (byte) 26);
                w4h w4hVar2 = (w4h) kly0Var8.get();
                c8o.l(w4hVar2);
                il00 il00Var = new il00(w4hVar2, (byte) 25);
                qut0 qut0Var2 = (qut0) kly0Var7.get();
                c8o.l(qut0Var2);
                y1t0 y1t0Var = new y1t0(qut0Var2, (byte) 1);
                cig1 cig1Var = (cig1) m8cVar9.m.get();
                c8o.l(cig1Var);
                el3 el3Var = (el3) m8cVar9.l.get();
                c8o.l(el3Var);
                ffe1 ffe1Var = new ffe1(cig1Var, el3Var, (byte) 13);
                w4h w4hVar3 = (w4h) kly0Var8.get();
                c8o.l(w4hVar3);
                cp70 cp70Var = new cp70(w4hVar3);
                q8n q8nVarG = m8cVar9.g();
                c8o.l(q8nVarG);
                qlw qlwVar = new qlw(oj3Var, qut0Var, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, q8nVarG);
                String str2 = d4pVar.b.b;
                c8o.m(str2);
                return new olo(qlwVar, str2);
            case 37:
                a731 a731Var = (a731) d4pVar.P.get();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return new b9c(a731Var, new bn70(yon1.G1("BROWSE", "browse", 248, "browse"), nik1.B0, (nar0) null));
            case 38:
                return new y3p(this);
            case 39:
                return new z3p(this);
            default:
                jah.e(b4);
                return null;
        }
    }

    private final Object c() {
        fme fmeVar = (fme) ((wzn) this.c).a;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) fmeVar.c.get());
        }
        if (b != 1) {
            if (b == 2) {
                return new p4p(this, (byte) 0);
            }
            jah.e(b);
            return null;
        }
        six0 six0Var = (six0) fmeVar.e.get();
        c8o.l(six0Var);
        qua0 qua0Var = (q0d0) fmeVar.d.get();
        c8o.l(qua0Var);
        qua0 qua0Var2 = (ztw0) fmeVar.f.get();
        c8o.l(qua0Var2);
        a9q a9qVar = (a9q) fmeVar.g.get();
        c8o.l(a9qVar);
        yko ykoVar = (yko) fmeVar.h.get();
        c8o.l(ykoVar);
        mr20 mr20Var = (mr20) fmeVar.i.get();
        c8o.l(mr20Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new e5b0(30, p7h.M(new qua0[]{six0Var.a(yon1.T(), true, true), qua0Var, qua0Var2, a9qVar.a("chaptersbottomsheet"), ykoVar.a((String) null, new ew6(mr20Var, null, (byte) 2))}), (List) null);
    }

    private final Object d() {
        r4p r4pVar = (r4p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                qyj qyjVar = (qyj) ((ose) r4pVar.b).g.get();
                c8o.l(qyjVar);
                return qyjVar;
            case 1:
                add addVar = (add) ((ose) r4pVar.b).e.get();
                c8o.l(addVar);
                return addVar;
            case 2:
                return yne.d(xqu.a((b2p) r4pVar.e), xqu.a((b2p) r4pVar.v));
            case 3:
                return yne.f((b2p) r4pVar.c);
            case 4:
                return sdl.g((b2p) r4pVar.f, (b2p) r4pVar.g, (b2p) r4pVar.h, (b2p) r4pVar.i, (b2p) r4pVar.j, (b2p) r4pVar.k, (b2p) r4pVar.l, (b2p) r4pVar.m, (b2p) r4pVar.n, (b2p) r4pVar.o, (b2p) r4pVar.f56p, (b2p) r4pVar.q, (b2p) r4pVar.r, (b2p) r4pVar.s, (b2p) r4pVar.t, (b2p) r4pVar.u);
            case 5:
                yqg yqgVarA = ((ose) r4pVar.b).a();
                c8o.l(yqgVarA);
                return yqgVarA;
            case 6:
                nfa0 nfa0VarA0 = ((ose) r4pVar.b).A0();
                c8o.l(nfa0VarA0);
                return nfa0VarA0;
            case 7:
                lzn0 lzn0VarC = ((ose) r4pVar.b).c();
                c8o.l(lzn0VarC);
                return lzn0VarC;
            case 8:
                zle1 zle1VarR0 = ((ose) r4pVar.b).R0();
                c8o.l(zle1VarR0);
                return zle1VarR0;
            case 9:
                xrc0 xrc0VarL = ((ose) r4pVar.b).l();
                c8o.l(xrc0VarL);
                return xrc0VarL;
            case 10:
                iyc0 iyc0VarX = ((ose) r4pVar.b).x();
                c8o.l(iyc0VarX);
                return iyc0VarX;
            case 11:
                RetrofitMaker retrofitMakerN = ((ose) r4pVar.b).n();
                c8o.l(retrofitMakerN);
                return retrofitMakerN;
            case 12:
                ov20 ov20VarQ = ((ose) r4pVar.b).q();
                c8o.l(ov20VarQ);
                return ov20VarQ;
            case 13:
                xvo xvoVar = (xvo) ((ose) r4pVar.b).m.get();
                c8o.l(xvoVar);
                return xvoVar;
            case 14:
                luk lukVarK = ((ose) r4pVar.b).k();
                c8o.l(lukVarK);
                return lukVarK;
            case 15:
                dv00 dv00Var = (dv00) ((ose) r4pVar.b).f49p.get();
                c8o.l(dv00Var);
                return dv00Var;
            case 16:
                q8n q8nVarE = ((ose) r4pVar.b).e();
                c8o.l(q8nVarE);
                return q8nVarE;
            case 17:
                yh2 yh2VarW = ((ose) r4pVar.b).w();
                c8o.l(yh2VarW);
                return yh2VarW;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hc51 hc51VarT0 = ((ose) r4pVar.b).T0();
                c8o.l(hc51VarT0);
                return hc51VarT0;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Single singleP0 = ((ose) r4pVar.b).P0();
                c8o.l(singleP0);
                return singleP0;
            case 20:
                q8n q8nVarG = ((ose) r4pVar.b).g();
                c8o.l(q8nVarG);
                return q8nVarG;
            case 21:
                mtt0 mtt0VarS0 = ((ose) r4pVar.b).S0();
                c8o.l(mtt0VarS0);
                return mtt0VarS0;
            case 22:
                ls00 ls00Var = (ls00) ((ose) r4pVar.b).o.get();
                c8o.l(ls00Var);
                return ls00Var;
            case 23:
                w390 w390VarQ0 = ((ose) r4pVar.b).Q0();
                c8o.l(w390VarQ0);
                return w390VarQ0;
            case 24:
                ynb0 ynb0VarA = xqu.a((b2p) r4pVar.y);
                tdl tdlVar = new tdl((byte) 3);
                tdlVar.b = ynb0VarA;
                return tdlVar;
            case 25:
                b2p b2pVar = (b2p) r4pVar.l;
                b2p b2pVar2 = (b2p) r4pVar.c;
                b2p b2pVar3 = (b2p) r4pVar.x;
                b2p b2pVar4 = (b2p) r4pVar.o;
                b2p b2pVar5 = (b2p) r4pVar.d;
                j1m j1mVar = new j1m();
                j1mVar.a = b2pVar;
                j1mVar.b = b2pVar2;
                j1mVar.c = b2pVar3;
                j1mVar.d = b2pVar4;
                j1mVar.e = b2pVar5;
                return j1mVar;
            case 26:
                q8n q8nVar = (q8n) ((ose) r4pVar.b).B.get();
                c8o.l(q8nVar);
                return q8nVar;
            case 27:
                ynb0 ynb0VarA2 = xqu.a((b2p) r4pVar.B);
                tdl tdlVar2 = new tdl((byte) 4);
                tdlVar2.b = ynb0VarA2;
                return tdlVar2;
            case 28:
                b2p b2pVar6 = (b2p) r4pVar.f;
                b2p b2pVar7 = (b2p) r4pVar.c;
                b2p b2pVar8 = (b2p) r4pVar.A;
                m1m m1mVar = new m1m();
                m1mVar.a = b2pVar6;
                m1mVar.b = b2pVar7;
                m1mVar.c = b2pVar8;
                return m1mVar;
            case 29:
                w6q w6qVar = (w6q) ((ose) r4pVar.b).C.get();
                c8o.l(w6qVar);
                return w6qVar;
            case 30:
                return new q4p(this);
            case 31:
                r2r r2rVar = (r2r) ((ose) r4pVar.b).h.get();
                c8o.l(r2rVar);
                return new n1n0(r2rVar);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        wj3 wj3Var = (wj3) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new s4p(this);
            case 1:
                return cwl1.C((q7r0) wj3Var.c);
            case 2:
                String str = ((wse) wj3Var.b).b;
                c8o.m(str);
                return str;
            case 3:
                return new t4p(this);
            case 4:
                RetrofitMaker retrofitMakerN = ((t1m) wj3Var.d).n();
                c8o.l(retrofitMakerN);
                luk lukVarK = ((t1m) wj3Var.d).k();
                c8o.l(lukVarK);
                return rx31.A(retrofitMakerN, new di4(lukVarK));
            case 5:
                return new t5h1();
            case 6:
                ov20 ov20VarQ = ((t1m) wj3Var.d).q();
                c8o.l(ov20VarQ);
                return new tcy(ov20VarQ);
            case 7:
                return cto1.q(((q7r0) wj3Var.c).d.c);
            case 8:
                return new u4p(this);
            case 9:
                t1m t1mVar = (t1m) wj3Var.d;
                t1m t1mVar2 = (t1m) wj3Var.d;
                yqg yqgVarA = t1mVar.a();
                c8o.l(yqgVarA);
                c9n c9nVar = (c9n) ((jly0) wj3Var.t).get();
                yh2 yh2VarW = t1mVar2.w();
                c8o.l(yh2VarW);
                String str2 = (String) ((jly0) wj3Var.f).get();
                w390 w390VarQ0 = t1mVar2.Q0();
                c8o.l(w390VarQ0);
                return new fmy(yqgVarA, c9nVar, yh2VarW, str2, w390VarQ0, (r1m) ((jly0) wj3Var.Z).get());
            case 10:
                return new r1m((ttm0) ((jly0) wj3Var.Y).get(), (c9n) ((jly0) wj3Var.t).get(), (q7r0) wj3Var.c);
            case 11:
                ttm0 ttm0VarE = cwl1.E((q7r0) wj3Var.c);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        mo9 mo9Var = mo9.O0;
        s24 s24Var = (s24) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return u1n0.z((q7r0) s24Var.c);
            case 1:
                return pzm.h((mos) ((xff) s24Var.b).i.get());
            case 2:
                jly0 jly0Var = (jly0) s24Var.f;
                xff xffVar = (xff) s24Var.b;
                arb1 arb1Var = ((vqb1) jly0Var.get()).b;
                gn10 gn10Var = mno1.F;
                FlowableMap flowableMapF = f2u0.f(s24Var.i0());
                Flowable flowableJ = s24Var.i0().j(mo9Var);
                Flowable flowableJ2 = s24Var.i0().j(mo9.N0);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d(s24Var.i0());
                pe peVarH = xffVar.h();
                c8o.l(peVarH);
                luk lukVar = (luk) xffVar.f.get();
                c8o.l(lukVar);
                return new dfm(arb1Var, gn10Var, flowableMapF, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVar)));
            case 3:
                xff xffVar2 = (xff) s24Var.b;
                xff xffVar3 = (xff) s24Var.b;
                t8u0 t8u0Var = (t8u0) xffVar2.n.get();
                c8o.l(t8u0Var);
                iac0 iac0Var = ((q7r0) s24Var.c).d.c;
                c8o.m(iac0Var);
                Flowable flowable = (Flowable) xffVar3.m.get();
                c8o.l(flowable);
                loc1 loc1Var = (loc1) xffVar3.o.get();
                c8o.l(loc1Var);
                Scheduler scheduler = (Scheduler) xffVar3.f80p.get();
                c8o.l(scheduler);
                yqg yqgVar = (yqg) xffVar3.a.get();
                c8o.l(yqgVar);
                return new vqb1(t8u0Var.a(iac0Var.getLifecycle()), flowable, loc1Var, scheduler, yqgVar);
            case 4:
                return new w691(f2u0.D(s24Var.i0()), (Flowable) ((jly0) s24Var.t).get(), s24Var.i0().j(mo9Var), ((vqb1) ((jly0) s24Var.f).get()).b, voo1.s(s24Var.D()));
            case 5:
                return f2u0.B(f2u0.D(s24Var.i0()), (Flowable) ((jly0) s24Var.h).get(), (Flowable) ((jly0) s24Var.i).get(), s24Var.u());
            case 6:
                FlowableFilter flowableFilterI0 = s24Var.i0();
                xff xffVar4 = (xff) s24Var.b;
                Scheduler scheduler2 = (Scheduler) xffVar4.f80p.get();
                c8o.l(scheduler2);
                yqg yqgVar2 = (yqg) xffVar4.a.get();
                c8o.l(yqgVar2);
                return f2u0.z(flowableFilterI0, scheduler2, yqgVar2, s24Var.u());
            case 7:
                return f2u0.y(s24Var.i0(), s24Var.u());
            case 8:
                return new n691(s24Var.i0(), (Flowable) ((jly0) s24Var.t).get(), ((vqb1) ((jly0) s24Var.f).get()).b, nrq0.a, i691.a, voo1.r(s24Var.D()));
            case 9:
                return new knf();
            case 10:
                return new c9f();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        tnm tnmVar = (tnm) this.c;
        zhf zhfVar = (zhf) tnmVar.b;
        byte b = this.b;
        if (b == 0) {
            bfd bfdVar = (bfd) zhfVar.c.get();
            c8o.l(bfdVar);
            return bfdVar;
        }
        if (b == 1) {
            Context context = (Context) zhfVar.a.a;
            c8o.l(context);
            lzn0 lzn0Var = (lzn0) zhfVar.b.get();
            c8o.l(lzn0Var);
            ynb0 ynb0VarA = xqu.a((b2p) tnmVar.d);
            zuw0 zuw0Var = (zuw0) zhfVar.d.get();
            c8o.l(zuw0Var);
            return new cp51(context, lzn0Var, ynb0VarA, zuw0Var, tnmVar.r(), (h5p) ((jly0) tnmVar.e).get());
        }
        if (b == 2) {
            return new h5p(this, (byte) 0);
        }
        if (b == 3) {
            Context context2 = (Context) zhfVar.a.a;
            c8o.l(context2);
            lzn0 lzn0Var2 = (lzn0) zhfVar.b.get();
            c8o.l(lzn0Var2);
            ynb0 ynb0VarA2 = xqu.a((b2p) tnmVar.d);
            zuw0 zuw0Var2 = (zuw0) zhfVar.d.get();
            c8o.l(zuw0Var2);
            return new wd41(context2, lzn0Var2, ynb0VarA2, zuw0Var2, tnmVar.r(), (h5p) ((jly0) tnmVar.e).get());
        }
        if (b != 4) {
            jah.e(b);
            return null;
        }
        Context context3 = (Context) zhfVar.a.a;
        c8o.l(context3);
        lzn0 lzn0Var3 = (lzn0) zhfVar.b.get();
        c8o.l(lzn0Var3);
        ynb0 ynb0VarA3 = xqu.a((b2p) tnmVar.d);
        zuw0 zuw0Var3 = (zuw0) zhfVar.d.get();
        c8o.l(zuw0Var3);
        return new k8u0(context3, lzn0Var3, ynb0VarA3, zuw0Var3, tnmVar.r(), (h5p) ((jly0) tnmVar.e).get());
    }

    private final Object h() {
        em0 em0Var = (em0) this.c;
        tmf tmfVar = (tmf) em0Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                bfd bfdVar = (bfd) tmfVar.c.get();
                c8o.l(bfdVar);
                return bfdVar;
            case 1:
                Context context = (Context) tmfVar.a.a;
                c8o.l(context);
                lzn0 lzn0Var = (lzn0) tmfVar.b.get();
                c8o.l(lzn0Var);
                ynb0 ynb0VarA = xqu.a((b2p) em0Var.e);
                zuw0 zuw0Var = (zuw0) tmfVar.d.get();
                c8o.l(zuw0Var);
                return new cp51(context, lzn0Var, ynb0VarA, zuw0Var, em0Var.l0(), (h5p) ((jly0) em0Var.f).get());
            case 2:
                return new h5p(this, (byte) 1);
            case 3:
                Context context2 = (Context) tmfVar.a.a;
                c8o.l(context2);
                lzn0 lzn0Var2 = (lzn0) tmfVar.b.get();
                c8o.l(lzn0Var2);
                ynb0 ynb0VarA2 = xqu.a((b2p) em0Var.e);
                zuw0 zuw0Var2 = (zuw0) tmfVar.d.get();
                c8o.l(zuw0Var2);
                return new wd41(context2, lzn0Var2, ynb0VarA2, zuw0Var2, em0Var.l0(), (h5p) ((jly0) em0Var.f).get());
            case 4:
                Context context3 = (Context) tmfVar.a.a;
                c8o.l(context3);
                lzn0 lzn0Var3 = (lzn0) tmfVar.b.get();
                c8o.l(lzn0Var3);
                ynb0 ynb0VarA3 = xqu.a((b2p) em0Var.e);
                zuw0 zuw0Var3 = (zuw0) tmfVar.d.get();
                c8o.l(zuw0Var3);
                return new k8u0(context3, lzn0Var3, ynb0VarA3, zuw0Var3, em0Var.l0(), (h5p) ((jly0) em0Var.f).get());
            case 5:
                Context context4 = (Context) tmfVar.a.a;
                c8o.l(context4);
                lzn0 lzn0Var4 = (lzn0) tmfVar.b.get();
                c8o.l(lzn0Var4);
                u9c0 u9c0VarQ = cto1.q(((q7r0) em0Var.d).d.c);
                jed0 jed0Var = (jed0) tmfVar.h.get();
                c8o.l(jed0Var);
                zwz0 zwz0Var = (zwz0) tmfVar.f.get();
                c8o.l(zwz0Var);
                xok0 xok0VarL0 = em0Var.l0();
                h5p h5pVar = (h5p) ((jly0) em0Var.f).get();
                vcd0 vcd0Var = (vcd0) tmfVar.g.get();
                c8o.l(vcd0Var);
                return new ohd0(context4, lzn0Var4, u9c0VarQ, jed0Var, zwz0Var, xok0VarL0, h5pVar, vcd0Var);
            case 6:
                return new j5p(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object i() {
        k42 k42Var = (k42) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                lzn0 lzn0Var = (lzn0) ((lof) k42Var.a).c.get();
                c8o.l(lzn0Var);
                return lzn0Var;
            case 1:
                return cwl1.I((q7r0) k42Var.b);
            case 2:
                return pzm.h((mos) ((lof) k42Var.a).n.get());
            case 3:
                return new k5p(this);
            case 4:
                return new l5p();
            case 5:
                lof lofVar = (lof) k42Var.a;
                lof lofVar2 = (lof) k42Var.a;
                Observable observable = (Observable) lofVar.v.get();
                c8o.l(observable);
                bfd bfdVar = (bfd) lofVar2.d.get();
                c8o.l(bfdVar);
                pd71 pd71Var = (pd71) ((jly0) k42Var.h).get();
                jjz jjzVar = (jjz) lofVar2.g.get();
                c8o.l(jjzVar);
                return new w3f(observable, bfdVar, pd71Var, jjzVar);
            case 6:
                jd71 jd71Var = (jd71) ((lof) k42Var.a).f.get();
                c8o.l(jd71Var);
                return new pd71(jd71Var.a, jd71Var.b);
            case 7:
                return new m5p(this);
            case 8:
                return new n5p(this);
            case 9:
                h971 h971Var = (h971) ((lof) k42Var.a).b.get();
                c8o.l(h971Var);
                return new lnf(h971Var);
            case 10:
                pof pofVar = (pof) k42Var.c;
                o5p o5pVar = (o5p) ((jly0) k42Var.n).get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str = yon1.C0().a;
                Parcelable.Creator creator = lik1.CREATOR;
                String viewUri = pofVar.getViewUri();
                k42 k42Var2 = (k42) o5pVar.a.c;
                Context context = (Context) ((lof) k42Var2.a).a.get();
                c8o.l(context);
                r35 r35Var = (r35) ((lof) k42Var2.a).e.get();
                c8o.l(r35Var);
                jjz jjzVar2 = (jjz) ((lof) k42Var2.a).g.get();
                c8o.l(jjzVar2);
                return new jwf0(context, str, viewUri, r35Var, (c9n) ((jly0) k42Var2.m).get(), jjzVar2, (pd71) ((jly0) k42Var2.h).get());
            case 11:
                return new o5p(this);
            case 12:
                return cto1.q(((q7r0) k42Var.b).d.c);
            case 13:
                pof pofVar2 = (pof) k42Var.c;
                p5p p5pVar = (p5p) ((jly0) k42Var.p).get();
                c9n c9nVar = (c9n) ((jly0) k42Var.m).get();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                String str2 = yon1.C0().a;
                Parcelable.Creator creator2 = lik1.CREATOR;
                return p5pVar.a(c9nVar, str2, pofVar2.getViewUri());
            case 14:
                return new p5p(this, (byte) 0);
            case 15:
                y6q y6qVar = (y6q) ((lof) k42Var.a).k.get();
                c8o.l(y6qVar);
                return y6qVar.a((pd71) ((jly0) k42Var.h).get());
            case 16:
                return new q5p(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        byte b = this.b;
        if (b == 0) {
            return new c6p(this);
        }
        if (b == 1) {
            return new d6p(this);
        }
        if (b == 2) {
            return new e6p(this);
        }
        if (b == 3) {
            return new f6p(this);
        }
        if (b == 4) {
            return new g6p(this);
        }
        jah.e(b);
        return null;
    }

    private final Object k() {
        h310 h310Var = (h310) ((cp31) this.c).a;
        byte b = this.b;
        if (b == 0) {
            return (bz31) h310Var.f.get();
        }
        if (b == 1) {
            return (emc) h310Var.d.get();
        }
        if (b == 2) {
            return (hmc) h310Var.c.get();
        }
        if (b == 3) {
            return (ric) h310Var.a.get();
        }
        if (b == 4) {
            return (qic) h310Var.b.get();
        }
        jah.e(b);
        return null;
    }

    private final Object l() {
        kp5 kp5Var = (kp5) this.c;
        q7r0 q7r0Var = (q7r0) kp5Var.c;
        k2h k2hVar = (k2h) kp5Var.a;
        byte b = this.b;
        if (b == 0) {
            iac0 iac0Var = q7r0Var.d.c;
            c8o.m(iac0Var);
            t8u0 t8u0Var = (t8u0) k2hVar.k.get();
            c8o.l(t8u0Var);
            ruz ruzVarA = t8u0Var.a(q7r0Var.d.c.getLifecycle()).a();
            b0d0 b0d0Var = (b0d0) k2hVar.G.get();
            c8o.l(b0d0Var);
            myq0 myq0Var = new myq0(q7r0Var);
            String strConcat = "spotify:list:liked-songs-artist:".concat(kp5Var.p().h());
            huz huzVar = new huz((Object) null, (byte) 10);
            huz huzVar2 = new huz(w7x.a, (byte) 10);
            b7x b7xVar = b7x.a;
            return b0d0Var.b(strConcat, huzVar2, iac0Var, ruzVarA, huzVar, tot0.a(myq0Var.get()), new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10));
        }
        if (b == 1) {
            tp91 tp91Var = (tp91) k2hVar.u.get();
            c8o.l(tp91Var);
            return tp91.b(tp91Var);
        }
        if (b == 2) {
            xrc0 xrc0Var = (xrc0) k2hVar.H.get();
            c8o.l(xrc0Var);
            return xrc0Var;
        }
        if (b == 3) {
            return new l6p(this);
        }
        if (b != 4) {
            jah.e(b);
            return null;
        }
        a1r0 a1r0Var = (a1r0) k2hVar.D.get();
        c8o.l(a1r0Var);
        return a1r0Var;
    }

    private final Object m() {
        zwg zwgVar = (zwg) ((wzn) this.c).a;
        byte b = this.b;
        if (b == 0) {
            Context context = (Context) zwgVar.a;
            c8o.l(context);
            iyc0 iyc0Var = (iyc0) zwgVar.d;
            c8o.l(iyc0Var);
            agc0 agc0Var = (agc0) zwgVar.e;
            c8o.l(agc0Var);
            r5h r5hVar = (r5h) zwgVar.b;
            c8o.l(r5hVar);
            fns fnsVar = igu.a;
            return new ccc0(context, iyc0Var, agc0Var, r5hVar, b3s.c, j5.a);
        }
        if (b == 1) {
            i8h1 i8h1Var = (i8h1) zwgVar.c;
            c8o.l(i8h1Var);
            rjo0 r62Var = new r62(i8h1Var);
            c8o.l(i8h1Var);
            return new e4h(p7h.M(new rjo0[]{r62Var, new ics(i8h1Var), new vw10(i8h1Var), new km30(i8h1Var), new s5v0(i8h1Var), new z0y(i8h1Var)}));
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        r5h r5hVar2 = (r5h) zwgVar.b;
        c8o.l(r5hVar2);
        fns fnsVar2 = igu.a;
        return new r5s(new zfr(r5hVar2, b3s.c, (byte) 2));
    }

    private final Object n() {
        bnh bnhVar = (bnh) ((em0) this.c).b;
        byte b = this.b;
        switch (b) {
            case 0:
                return new o6p(this, (byte) 0);
            case 1:
                return new p6p(this);
            case 2:
                return new q6p(this, (byte) 0);
            case 3:
                t8u0 t8u0Var = (t8u0) bnhVar.B.get();
                c8o.l(t8u0Var);
                dg30 dg30Var = (dg30) bnhVar.q.get();
                c8o.l(dg30Var);
                return t8u0Var.a(((f0i) dg30Var).a);
            case 4:
                return new r6p(this, (byte) 0);
            case 5:
                return new s6p(this, (byte) 0);
            case 6:
                return new t6p();
            case 7:
                return new u6p(this);
            case 8:
                return new v6p(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object o() {
        em0 em0Var = (em0) this.c;
        wph wphVar = (wph) em0Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                return pzm.h((mos) wphVar.E.get());
            case 1:
                return new w6p(this);
            case 2:
                return new q6p(this, (byte) 1);
            case 3:
                q7r0 q7r0Var = (q7r0) em0Var.c;
                t8u0 t8u0Var = (t8u0) wphVar.A.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(q7r0Var.d.c.getLifecycle());
            case 4:
                return new r6p(this, (byte) 1);
            case 5:
                return new o6p(this, (byte) 1);
            case 6:
                return new x6p(this);
            case 7:
                return new s6p(this, (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object p() {
        bxd bxdVar = (bxd) ((k9k) this.c).b;
        byte b = this.b;
        if (b == 0) {
            return new z6p(this);
        }
        if (b == 1) {
            Flowable flowableF = bxdVar.f();
            c8o.l(flowableF);
            return new FlowableOnBackpressureLatest(flowableF).j(mo9.Z).x(p9w.P0).J(q9w.P0);
        }
        if (b != 2) {
            if (b == 3) {
                return new a7p(this);
            }
            jah.e(b);
            return null;
        }
        Flowable flowableF2 = bxdVar.f();
        c8o.l(flowableF2);
        Scheduler schedulerO = bxdVar.o();
        c8o.l(schedulerO);
        yqg yqgVarA = bxdVar.a();
        c8o.l(yqgVarA);
        return new FlowableOnBackpressureLatest(flowableF2).j(new xeu0(32L, schedulerO, yqgVarA)).x(uwg.R0).J(m9h.P0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get() {
        p6r0 p6r0VarH5;
        rng1 r801Var;
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.c;
        byte b3 = 2;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                wdm wdmVar = (wdm) obj;
                rc8 rc8Var = (rc8) wdmVar.b;
                switch (b2) {
                    case 0:
                        hto htoVar = (hto) rc8Var.v.get();
                        c8o.l(htoVar);
                        return hto.b(htoVar, uh21.t);
                    case 1:
                        d0r d0rVar = (d0r) ((jly0) wdmVar.e).get();
                        zs11 zs11Var = (zs11) rc8Var.w.get();
                        c8o.l(zs11Var);
                        muz muzVarD = ((cyp) ((jly0) wdmVar.f).get()).d();
                        ruz ruzVarA = ((cyp) ((jly0) wdmVar.f).get()).a();
                        s1p s1pVar = (s1p) ((jly0) wdmVar.g).get();
                        zwp zwpVar = (zwp) rc8Var.u.get();
                        c8o.l(zwpVar);
                        t1p t1pVar = (t1p) ((jly0) wdmVar.h).get();
                        d2q d2qVar = (d2q) rc8Var.t.get();
                        c8o.l(d2qVar);
                        p68 p68Var = new p68(muzVarD, ruzVarA, s1pVar, zwpVar, t1pVar, d2qVar, false);
                        u1p u1pVar = (u1p) ((jly0) wdmVar.i).get();
                        Activity activityC = rc8Var.c();
                        c8o.l(activityC);
                        quc0 quc0Var = (quc0) rc8Var.i.get();
                        c8o.l(quc0Var);
                        bv40 bv40Var = new bv40(new fb8(activityC, quc0Var), (byte) 23);
                        oum oumVar = (oum) rc8Var.k.get();
                        c8o.l(oumVar);
                        return new d861(d0rVar, new ajq0(zs11Var, p68Var, u1pVar, bv40Var, new eb8(oumVar, (v1p) ((jly0) wdmVar.X).get(), (byte) 0)), (lik1) ((jly0) wdmVar.Y).get());
                    case 2:
                        t8u0 t8u0Var = (t8u0) rc8Var.h.get();
                        c8o.l(t8u0Var);
                        return kmq0.x((q7r0) wdmVar.d, t8u0Var);
                    case 3:
                        return new s1p(this, (byte) 1);
                    case 4:
                        return new t1p(this, (byte) 1);
                    case 5:
                        return new u1p(this, (byte) 1);
                    case 6:
                        return new v1p(this, (byte) 1);
                    case 7:
                        lzn0 lzn0Var = (lzn0) rc8Var.c.get();
                        c8o.l(lzn0Var);
                        a1r0 a1r0Var = (a1r0) rc8Var.e.get();
                        c8o.l(a1r0Var);
                        Activity activityC2 = rc8Var.c();
                        c8o.l(activityC2);
                        return new et90(activityC2, lzn0Var, a1r0Var);
                    case 8:
                        sc8 sc8Var = (sc8) wdmVar.c;
                        Parcelable.Creator creator = lik1.CREATOR;
                        return new lik1(sc8Var.a);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                c21 c21Var = (c21) obj;
                q7r0 q7r0Var = (q7r0) c21Var.d;
                to8 to8Var = (to8) c21Var.c;
                qo8 qo8Var = (qo8) c21Var.b;
                if (b2 == 0) {
                    return new kc8();
                }
                if (b2 == 1) {
                    return new f2p(this, (byte) 0);
                }
                if (b2 == 2) {
                    return new s1p(this, b3);
                }
                if (b2 == 3) {
                    return new hoc(false, new goc(2131165289, 2131165289));
                }
                if (b2 != 4) {
                    if (b2 != 5) {
                        jah.e(b2);
                        return null;
                    }
                    qua0 qua0Var = (ztw0) qo8Var.m.get();
                    c8o.l(qua0Var);
                    yko ykoVar = (yko) qo8Var.f.get();
                    c8o.l(ykoVar);
                    a9q a9qVar = (a9q) qo8Var.n.get();
                    c8o.l(a9qVar);
                    return new e5b0(30, p7h.M(new qua0[]{qua0Var, ykoVar.a(to8Var.a, new ro8(to8Var, lnmVar, objArr == true ? 1 : 0)), a9qVar.a("AuthorPage")}), (List) null);
                }
                dnc0 dnc0Var = new dnc0(cwl1.C(q7r0Var), (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
                d0r d0rVarC = cwl1.C(q7r0Var);
                Activity activity = (Activity) qo8Var.a.get();
                c8o.l(activity);
                Context applicationContext = activity.getApplicationContext();
                neq neqVar = (neq) qo8Var.i.get();
                c8o.l(neqVar);
                rmh1 rmh1Var = new rmh1(d0rVarC, to8Var, applicationContext, neqVar);
                d0r d0rVarC2 = cwl1.C(q7r0Var);
                Activity activity2 = (Activity) qo8Var.a.get();
                c8o.l(activity2);
                Context applicationContext2 = activity2.getApplicationContext();
                meq meqVar = (meq) qo8Var.j.get();
                c8o.l(meqVar);
                for (Object obj2 : p7h.M(new hp8[]{rmh1Var, new wc8(d0rVarC2, to8Var, applicationContext2, meqVar, (kc8) ((jly0) c21Var.e).get())})) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    ((hp8) obj2).a(dnc0Var, i);
                    i = i2;
                }
                return dnc0Var.a();
            case 2:
                tnm tnmVar = (tnm) obj;
                if (b2 == 0) {
                    return new h2p(this);
                }
                if (b2 == 1) {
                    return new i2p();
                }
                if (b2 == 2) {
                    return new j2p(this);
                }
                if (b2 != 3) {
                    jah.e(b2);
                    return null;
                }
                t8u0 t8u0Var2 = (t8u0) ((j59) tnmVar.b).s.get();
                c8o.l(t8u0Var2);
                return kmq0.x((q7r0) tnmVar.c, t8u0Var2);
            case 3:
                ml9 ml9Var = (ml9) ((wzn) obj).a;
                if (b2 == 0) {
                    return new w460(false, (kl9) null, (yc11) null, 60);
                }
                if (b2 == 1) {
                    dv00 dv00Var = (dv00) ml9Var.f.get();
                    c8o.l(dv00Var);
                    j3r j3rVar = rzq.y;
                    return l2p1.f(dv00Var);
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                lko lkoVar = (lko) ml9Var.i.get();
                c8o.l(lkoVar);
                mr20 mr20Var = (mr20) ml9Var.h.get();
                c8o.l(mr20Var);
                mko mkoVarB = lkoVar.b((String) null, new huz(w7x.a, (byte) 10), new ew6(mr20Var, null, (byte) 1));
                mkoVarB.start();
                return mkoVarB;
            case 4:
                c21 c21Var2 = (c21) obj;
                jo9 jo9Var = (jo9) c21Var2.c;
                if (b2 == 0) {
                    return new k2p(this);
                }
                if (b2 == 1) {
                    l2r l2rVar = (dv00) jo9Var.d.get();
                    c8o.l(l2rVar);
                    it8 it8VarE = c21Var2.e();
                    q8n q8nVar = (q8n) jo9Var.y.get();
                    c8o.l(q8nVar);
                    l2r l27Var = new l27(it8VarE, q8nVar);
                    j3r j3rVar2 = rzq.y;
                    return l2p1.f(new w1k(new l2r[]{l2rVar, l27Var}));
                }
                if (b2 == 2) {
                    lko lkoVar2 = (lko) jo9Var.u.get();
                    c8o.l(lkoVar2);
                    Flowable flowable = (Flowable) jo9Var.v.get();
                    c8o.l(flowable);
                    rm9 rm9VarA = jo9Var.a();
                    c8o.l(rm9VarA);
                    mko mkoVarB2 = lkoVar2.b((String) null, new m441(new k96(rm9VarA, (lnm) null, (byte) 23)), new ko9(flowable, null, (byte) 0));
                    mkoVarB2.start();
                    return mkoVarB2;
                }
                if (b2 != 3) {
                    if (b2 == 4) {
                        t8u0 t8u0Var3 = (t8u0) jo9Var.l.get();
                        c8o.l(t8u0Var3);
                        return kmq0.x((q7r0) c21Var2.d, t8u0Var3);
                    }
                    if (b2 != 5) {
                        jah.e(b2);
                        return null;
                    }
                    a1r0 a1r0Var2 = (a1r0) jo9Var.p.get();
                    c8o.l(a1r0Var2);
                    return new w460(true, new kl9(a1r0Var2), (yc11) null, 40);
                }
                Flowable flowableB = jo9Var.b();
                c8o.l(flowableB);
                gw70 gw70VarB = ((ryj) c21Var2.b).b();
                c8o.l(gw70VarB);
                ufg1 ufg1Var = (ufg1) jo9Var.o.get();
                c8o.l(ufg1Var);
                Scheduler scheduler = (Scheduler) jo9Var.n.get();
                c8o.l(scheduler);
                Flowable flowableX = flowableB.j(mo9.Y).X(new lo9((Object) new ac10(gw70VarB, ufg1Var, scheduler, (byte) 0), (byte) (objArr2 == true ? 1 : 0)));
                flowableX.getClass();
                return flowableX.t(Functions.a);
            case 5:
                uw0 uw0Var = (uw0) obj;
                switch (b2) {
                    case 0:
                        fmy0 fmy0Var = (fmy0) ((aeb) uw0Var.d).d.get();
                        c8o.l(fmy0Var);
                        return fmy0Var.b();
                    case 1:
                        k1i k1iVarF = uw0Var.f();
                        aeb aebVar = (aeb) uw0Var.d;
                        kg0 kg0Var = (kg0) aebVar.e.get();
                        c8o.l(kg0Var);
                        mwn0 mwn0Var = (mwn0) aebVar.n.get();
                        c8o.l(mwn0Var);
                        ohv0 ohv0Var = (ohv0) aebVar.c.get();
                        c8o.l(ohv0Var);
                        gp41 gp41VarJ = uw0Var.J();
                        i8h1 i8h1Var = (i8h1) aebVar.m.get();
                        c8o.l(i8h1Var);
                        g1f0 g1f0VarA = aebVar.a();
                        c8o.l(g1f0VarA);
                        return new bbb(k1iVarF, kg0Var, mwn0Var, ohv0Var, gp41VarJ, i8h1Var, g1f0VarA, (q5o) ((jly0) uw0Var.g).get());
                    case 2:
                        aeb aebVar2 = (aeb) uw0Var.d;
                        aeb aebVar3 = (aeb) uw0Var.d;
                        Context context = (Context) aebVar2.o.a;
                        c8o.l(context);
                        Activity activity3 = (Activity) aebVar3.h.a;
                        c8o.l(activity3);
                        g1f0 g1f0VarA2 = aebVar3.a();
                        c8o.l(g1f0VarA2);
                        g7h1 g7h1Var = (g7h1) aebVar3.p.get();
                        c8o.l(g7h1Var);
                        w5o w5oVar = new w5o(activity3, g1f0VarA2, g7h1Var);
                        q8n q8nVarX = brt.x();
                        gp41 gp41VarJ2 = uw0Var.J();
                        ohv0 ohv0Var2 = (ohv0) aebVar3.c.get();
                        c8o.l(ohv0Var2);
                        r5o r5oVar = new r5o(gp41VarJ2, ohv0Var2);
                        g1f0 g1f0VarA3 = aebVar3.a();
                        c8o.l(g1f0VarA3);
                        v4s0 v4s0Var = (v4s0) aebVar3.s.get();
                        c8o.l(v4s0Var);
                        jqt jqtVar = (jqt) aebVar3.u.get();
                        c8o.l(jqtVar);
                        nfa0 nfa0Var = (nfa0) aebVar3.w.get();
                        c8o.l(nfa0Var);
                        tzr0 tzr0Var = new tzr0(g1f0VarA3, v4s0Var, jqtVar, new yrg0(nfa0Var, (byte) 5), (byte) 2);
                        g1f0 g1f0VarA4 = aebVar3.a();
                        c8o.l(g1f0VarA4);
                        return new q5o(context, w5oVar, q8nVarX, r5oVar, tzr0Var, g1f0VarA4);
                    case 3:
                        return (qhe0) ((jly0) uw0Var.i).get();
                    case 4:
                        c2r0 c2r0Var = (c2r0) ((aeb) uw0Var.d).i.get();
                        c8o.l(c2r0Var);
                        int i3 = ceb.a[((zdb) uw0Var.e).Z0().ordinal()];
                        if (i3 == -1) {
                            AtomicReferenceArray atomicReferenceArray = p6r0.e;
                            p6r0VarH5 = yon1.H5();
                        } else if (i3 == 1) {
                            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                            p6r0VarH5 = yon1.G1("START_CHOOSESIGNUP", "start/choosesignup", 1980, "start");
                        } else {
                            if (i3 != 2) {
                                eg.o();
                                return null;
                            }
                            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                            p6r0VarH5 = yon1.u5();
                        }
                        return c2r0Var.b(p6r0VarH5, (qir0) null);
                    case 5:
                        return new mir0(((qhe0) ((jly0) uw0Var.i).get()).a());
                    case 6:
                        return (qhe0) ((jly0) uw0Var.i).get();
                    case 7:
                        zdb zdbVar = (zdb) uw0Var.e;
                        a3p a3pVar = (a3p) ((jly0) uw0Var.b).get();
                        hus0 hus0Var = new hus0((b2p) uw0Var.N0, (byte) 0);
                        fjt fjtVarZ0 = zdbVar.Z0();
                        uw0 uw0Var2 = (uw0) a3pVar.a.c;
                        gp41 gp41VarJ3 = uw0Var2.J();
                        aeb aebVar4 = (aeb) uw0Var2.d;
                        ohv0 ohv0Var3 = (ohv0) aebVar4.c.get();
                        c8o.l(ohv0Var3);
                        i8h1 i8h1Var2 = (i8h1) aebVar4.m.get();
                        c8o.l(i8h1Var2);
                        teb tebVar = new teb(gp41VarJ3, ohv0Var3, i8h1Var2);
                        k1i k1iVarF2 = uw0Var2.f();
                        hr81 hr81Var = (hr81) aebVar4.k.get();
                        c8o.l(hr81Var);
                        nfb nfbVar = new nfb((byte) 8, false);
                        t8h1 t8h1Var = (t8h1) ((jly0) uw0Var2.c).get();
                        i8h1 i8h1Var3 = (i8h1) aebVar4.m.get();
                        c8o.l(i8h1Var3);
                        d520 d520Var = new d520(tebVar, k1iVarF2, hr81Var, nfbVar, t8h1Var, i8h1Var3, (vzl0) ((jly0) uw0Var2.Y).get(), (ao) ((jly0) uw0Var2.Z).get());
                        g1f0 g1f0VarA5 = aebVar4.a();
                        c8o.l(g1f0VarA5);
                        fns fnsVar = igu.a;
                        b3s b3sVar = b3s.c;
                        scb scbVar = new scb(d520Var, g1f0VarA5);
                        lde0 lde0Var = (lde0) ((aeb) uw0Var2.d).j.get();
                        c8o.l(lde0Var);
                        g1f0 g1f0VarA6 = ((aeb) uw0Var2.d).a();
                        c8o.l(g1f0VarA6);
                        return sqg0.J(new mmr0[]{new mmr0(MobiusLoopViewModel.class, new feb(fjtVarZ0, scbVar, lde0Var, g1f0VarA6)), new mmr0(gus0.class, hus0Var)});
                    case 8:
                        return new a3p(this);
                    case 9:
                        r6h1 r6h1Var = r6h1.c;
                        return new vzl0();
                    case 10:
                        RetrofitMaker retrofitMaker = (RetrofitMaker) ((aeb) uw0Var.d).t.get();
                        c8o.l(retrofitMaker);
                        return (ao) retrofitMaker.createWebgateService(ao.class, "android-login-loginstart");
                    case 11:
                        aeb aebVar5 = (aeb) uw0Var.d;
                        aeb aebVar6 = (aeb) uw0Var.d;
                        br81 br81Var = (br81) aebVar5.l.get();
                        c8o.l(br81Var);
                        Context context2 = (Context) aebVar6.o.a;
                        c8o.l(context2);
                        Context applicationContext3 = context2.getApplicationContext();
                        Context context3 = (Context) aebVar6.o.a;
                        c8o.l(context3);
                        Context applicationContext4 = context3.getApplicationContext();
                        nfa0 nfa0Var2 = (nfa0) aebVar5.v.get();
                        c8o.l(nfa0Var2);
                        sjq0 sjq0Var = new sjq0(br81Var, new q59(applicationContext3, new nrb1(applicationContext4, nfa0Var2), (byte) 20), (byte) 16);
                        fns fnsVar2 = igu.a;
                        b3s b3sVar2 = b3s.c;
                        return new gus0(sjq0Var);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 6:
                return a();
            case 7:
                return b();
            case 8:
                p2o0 p2o0Var = ((h4p) obj).a;
                if (b2 == 0) {
                    return new g4p(this);
                }
                if (b2 == 1) {
                    return new dfd();
                }
                if (b2 == 2) {
                    return ((ekp) ((kly0) p2o0Var.g).get()).a(new File(((Context) ((kly0) p2o0Var.b).get()).getApplicationContext().getCacheDir(), "campfire-video-download-cache"), 150000000L);
                }
                jah.e(b2);
                return null;
            case 9:
                cp31 cp31Var = (cp31) ((toj0) obj).b;
                if (b2 == 0) {
                    cex0 cex0Var = (cex0) cp31Var.c;
                    c8o.l(cex0Var);
                    return cex0Var;
                }
                if (b2 == 1) {
                    mu2 mu2Var = (mu2) cp31Var.b;
                    c8o.l(mu2Var);
                    return mu2Var;
                }
                if (b2 == 2) {
                    lc71 lc71Var = (lc71) cp31Var.e;
                    c8o.l(lc71Var);
                    return lc71Var;
                }
                if (b2 == 3) {
                    rg31 rg31Var = (rg31) cp31Var.d;
                    c8o.l(rg31Var);
                    return rg31Var;
                }
                if (b2 != 4) {
                    jah.e(b2);
                    return null;
                }
                mtd1 mtd1Var = (mtd1) cp31Var.f;
                c8o.l(mtd1Var);
                return mtd1Var;
            case 10:
                if (b2 == 0) {
                    return new k4p(this, (byte) 0);
                }
                if (b2 == 1) {
                    return new k8e();
                }
                if (b2 == 2) {
                    return u1n0.z((q7r0) ((g1i) obj).c);
                }
                jah.e(b2);
                return null;
            case 11:
                ip31 ip31Var = (ip31) obj;
                y7e y7eVar = (y7e) ip31Var.c;
                z7e z7eVar = (z7e) ip31Var.b;
                if (b2 == 0) {
                    i1n0 i1n0Var = (i1n0) z7eVar.f.get();
                    c8o.l(i1n0Var);
                    k4p k4pVar = (k4p) ((jly0) ip31Var.f).get();
                    ees eesVarA = i1n0Var.a(y7eVar, y7eVar);
                    s28 s28Var = s28.e;
                    a680 a680Var = eesVarA.a;
                    a680Var.a = s28Var;
                    a680Var.b = new u5b(k4pVar, (byte) 1);
                    return eesVarA;
                }
                if (b2 == 1) {
                    return new k4p(this, (byte) 1);
                }
                if (b2 == 2) {
                    return new k8e();
                }
                if (b2 == 3) {
                    i8h1 i8h1Var4 = (i8h1) z7eVar.l.get();
                    c8o.l(i8h1Var4);
                    return i8h1Var4;
                }
                if (b2 != 4) {
                    if (b2 == 5) {
                        return sd30.p(y7eVar);
                    }
                    jah.e(b2);
                    return null;
                }
                Bundle bundle = (Bundle) ((jly0) ip31Var.h).get();
                pnv0 pnv0Var = (pnv0) z7eVar.c.get();
                c8o.l(pnv0Var);
                Scheduler scheduler2 = (Scheduler) z7eVar.g.get();
                c8o.l(scheduler2);
                ekb ekbVar = new ekb((byte) 1);
                oto0 oto0Var = (oto0) z7eVar.h.get();
                c8o.l(oto0Var);
                return new d8e(bundle, pnv0Var, scheduler2, ekbVar, oto0Var);
            case 12:
                xje xjeVar = (xje) ((p2o0) obj).b;
                if (b2 == 0) {
                    return pzm.h((mos) xjeVar.d.get());
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return new n4p(this);
                    }
                    if (b2 == 3) {
                        return new o4p(this);
                    }
                    jah.e(b2);
                    return null;
                }
                q6q q6qVar = (q6q) xjeVar.e.get();
                c8o.l(q6qVar);
                six0 six0Var = (six0) xjeVar.g.get();
                c8o.l(six0Var);
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                return new e5b0(30, p7h.M(new qua0[]{q6qVar.a(yon1.S()), six0Var.a(yon1.S(), true, true)}), (List) null);
            case 13:
                tnm tnmVar2 = (tnm) obj;
                tke tkeVar = (tke) tnmVar2.c;
                if (b2 == 0) {
                    return pzm.h((mos) tkeVar.f.get());
                }
                if (b2 == 1) {
                    lke lkeVar = (lke) tnmVar2.b;
                    ynb0 ynb0VarA = xqu.a((jly0) tnmVar2.f);
                    q8n q8nVar2 = (q8n) tkeVar.b.get();
                    c8o.l(q8nVar2);
                    return new buy(lkeVar.a, new q01(0, ynb0VarA, ynb0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), q8nVar2);
                }
                if (b2 == 2) {
                    return cwl1.C((q7r0) tnmVar2.d);
                }
                if (b2 != 3) {
                    jah.e(b2);
                    return null;
                }
                six0 six0Var2 = (six0) tkeVar.c.get();
                c8o.l(six0Var2);
                qua0 qua0Var2 = (ztw0) tkeVar.d.get();
                c8o.l(qua0Var2);
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                return new e5b0(30, p7h.M(new qua0[]{qua0Var2, six0.b(six0Var2, yon1.v1(), 4)}), (List) null);
            case 14:
                return c();
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return g();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return h();
            case 20:
                return i();
            case 21:
                switch (b2) {
                    case 0:
                        return new r5p();
                    case 1:
                        return new s5p(this);
                    case 2:
                        return new pf61((dma1) ((z5p) obj).a.i.get());
                    case 3:
                        return new t5p();
                    case 4:
                        return new u5p(this);
                    case 5:
                        return new v5p(this);
                    case 6:
                        return new w5p(this);
                    case 7:
                        return new amy0();
                    case 8:
                        return new x5p();
                    case 9:
                        return new y5p(this);
                    case 10:
                        return new vik1();
                    default:
                        jah.e(b2);
                        return null;
                }
            case 22:
                return j();
            case 23:
                return k();
            case 24:
                return l();
            case 25:
                return m();
            case 26:
                return n();
            case 27:
                return o();
            case 28:
                return p();
            default:
                zl5 zl5Var = (zl5) obj;
                switch (b2) {
                    case 0:
                        qua0 qua0Var3 = (t701) ((hwj) zl5Var.c).w.get();
                        c8o.l(qua0Var3);
                        qua0 qua0Var4 = (csy) ((hwj) zl5Var.c).x.get();
                        c8o.l(qua0Var4);
                        return new e5b0(30, p7h.M(new qua0[]{qua0Var3, qua0Var4}), (List) null);
                    case 1:
                        jly0 jly0Var = (jly0) zl5Var.f;
                        q7r0 q7r0Var2 = (q7r0) zl5Var.d;
                        hwj hwjVar = (hwj) zl5Var.c;
                        d0r d0rVar2 = (d0r) jly0Var.get();
                        iac0 iac0VarO = xcz0.o(q7r0Var2);
                        fbg1 fbg1Var = (fbg1) hwjVar.y.get();
                        c8o.l(fbg1Var);
                        myq0 myq0Var = new myq0(q7r0Var2);
                        Scheduler scheduler3 = (Scheduler) ((b2p) zl5Var.g).get();
                        FlowableFilter flowableFilterJ = zl5Var.J();
                        Flowable flowable2 = (Flowable) ((jly0) zl5Var.j).get();
                        kly0 kly0Var = hwjVar.d;
                        kly0 kly0Var2 = hwjVar.j;
                        kly0 kly0Var3 = hwjVar.z;
                        uvy uvyVar = (uvy) hwjVar.r.get();
                        c8o.l(uvyVar);
                        d0r d0rVar3 = (d0r) ((jly0) zl5Var.f).get();
                        q8n q8nVar3 = (q8n) hwjVar.e.get();
                        c8o.l(q8nVar3);
                        luk lukVarC = hwjVar.c();
                        c8o.l(lukVarC);
                        hv4 hv4Var = new hv4(false, false, false, lukVarC);
                        dma1 dma1Var = (dma1) kly0Var3.get();
                        c8o.l(dma1Var);
                        acl aclVar = new acl(flowableFilterJ, flowable2, uvyVar, d0rVar3, q8nVar3, hv4Var, dma1Var);
                        ruz ruzVarB = zl5Var.B();
                        Consumer consumer = (Consumer) ((jly0) zl5Var.l).get();
                        dma1 dma1Var2 = (dma1) kly0Var3.get();
                        c8o.l(dma1Var2);
                        zr51 zr51Var = new zr51(ruzVarB, consumer, dma1Var2);
                        luk lukVarC2 = hwjVar.c();
                        c8o.l(lukVarC2);
                        y441 y441Var = new y441(scheduler3, aclVar, zr51Var, new zu4(false, lukVarC2));
                        ruz ruzVarB2 = zl5Var.B();
                        gn10 gn10Var = mno1.b0;
                        FlowableMap flowableMapF = f2u0.f(zl5Var.J());
                        FlowableFilter flowableFilterJ2 = zl5Var.J();
                        mo9 mo9Var = mo9.O0;
                        Flowable flowableJ = flowableFilterJ2.j(mo9Var);
                        Flowable flowableJ2 = zl5Var.J().j(mo9.N0);
                        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d(zl5Var.J());
                        pe peVarH = hwjVar.h();
                        c8o.l(peVarH);
                        luk lukVarC3 = hwjVar.c();
                        c8o.l(lukVarC3);
                        dfm dfmVar = new dfm(ruzVarB2, gn10Var, flowableMapF, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarC3)));
                        FlowableMap flowableMapD = f2u0.D(zl5Var.J());
                        FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j(zl5Var.J());
                        Flowable flowableJ3 = zl5Var.J().j(mo9Var);
                        Flowable flowable3 = (Flowable) ((jly0) zl5Var.n).get();
                        ruz ruzVarB3 = zl5Var.B();
                        yp91 yp91VarH = zl5Var.H();
                        im51 im51Var = (im51) ((jly0) zl5Var.o).get();
                        luk lukVarC4 = hwjVar.c();
                        c8o.l(lukVarC4);
                        am51 am51Var = new am51(flowableMapD, flowableDistinctUntilChangedJ, flowableJ3, flowable3, ruzVarB3, yp91VarH, im51Var, new kn4(false, lukVarC4));
                        FlowableMap flowableMapD2 = f2u0.D(zl5Var.J());
                        FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j(zl5Var.J());
                        Flowable flowableJ4 = zl5Var.J().j(mo9Var);
                        Flowable flowable4 = (Flowable) ((jly0) zl5Var.n).get();
                        ruz ruzVarB4 = zl5Var.B();
                        yp91 yp91VarH2 = zl5Var.H();
                        im51 im51Var2 = (im51) ((jly0) zl5Var.o).get();
                        luk lukVarC5 = hwjVar.c();
                        c8o.l(lukVarC5);
                        qm51 qm51Var = new qm51(flowableMapD2, flowableDistinctUntilChangedJ2, flowableJ4, flowable4, ruzVarB4, yp91VarH2, im51Var2, new kn4(false, lukVarC5));
                        w701 w701Var = (w701) kly0Var2.get();
                        c8o.l(w701Var);
                        jz51 jz51VarG = zl5Var.G();
                        q8n q8nVar4 = (q8n) kly0Var.get();
                        c8o.l(q8nVar4);
                        wy61 wy61Var = new wy61(w701Var, jz51VarG, q8nVar4, (byte) 0);
                        w701 w701Var2 = (w701) kly0Var2.get();
                        c8o.l(w701Var2);
                        jz51 jz51VarG2 = zl5Var.G();
                        q8n q8nVar5 = (q8n) kly0Var.get();
                        c8o.l(q8nVar5);
                        wy61 wy61Var2 = new wy61(w701Var2, jz51VarG2, q8nVar5, (byte) 1);
                        nm1 nm1VarA = ((c7p) ((jly0) zl5Var.r).get()).a((d0r) ((jly0) zl5Var.f).get());
                        luk lukVarC6 = hwjVar.c();
                        c8o.l(lukVarC6);
                        boolean zA = new j55(lukVarC6).a();
                        luk lukVarC7 = hwjVar.c();
                        c8o.l(lukVarC7);
                        xwt0 xwt0Var = new xwt0(y441Var, dfmVar, am51Var, qm51Var, wy61Var, wy61Var2, nm1VarA, zA, new j55(lukVarC7).c(), zl5Var.s());
                        e7q e7qVar = (e7q) hwjVar.q.get();
                        c8o.l(e7qVar);
                        dg30 dg30Var = (dg30) hwjVar.l.get();
                        c8o.l(dg30Var);
                        lzn0 lzn0Var2 = (lzn0) hwjVar.a.get();
                        c8o.l(lzn0Var2);
                        a1r0 a1r0Var3 = (a1r0) hwjVar.b.get();
                        c8o.l(a1r0Var3);
                        return new owj(d0rVar2, fbg1Var.a(d0rVar2, iac0VarO, myq0Var), xwt0Var, e7qVar, new d4v0(a1r0Var3, dg30Var, lzn0Var2, (byte) 12), new o901((jly0) zl5Var.x, (byte) 0), new fbz0(new uxy0((th30) ((b2p) zl5Var.s).get(), new uww0(xqu.a((b2p) zl5Var.v), (byte) 3), (byte) 5), (byte) 26));
                    case 2:
                        return cwl1.C((q7r0) zl5Var.d);
                    case 3:
                        Scheduler scheduler4 = (Scheduler) ((hwj) zl5Var.c).c.get();
                        c8o.l(scheduler4);
                        return scheduler4;
                    case 4:
                        return f2u0.C(f2u0.D(zl5Var.J()), (Flowable) ((jly0) zl5Var.h).get(), (Flowable) ((jly0) zl5Var.i).get(), zl5Var.a());
                    case 5:
                        FlowableFilter flowableFilterJ3 = zl5Var.J();
                        Scheduler scheduler5 = (Scheduler) ((b2p) zl5Var.g).get();
                        yqg yqgVar = (yqg) ((hwj) zl5Var.c).g.get();
                        c8o.l(yqgVar);
                        return f2u0.A(flowableFilterJ3, scheduler5, yqgVar, zl5Var.a());
                    case 6:
                        return f2u0.y(zl5Var.J(), zl5Var.a());
                    case 7:
                        t8u0 t8u0Var4 = (t8u0) ((hwj) zl5Var.c).m.get();
                        c8o.l(t8u0Var4);
                        return kmq0.x((q7r0) zl5Var.d, t8u0Var4);
                    case 8:
                        return xfs0.g;
                    case 9:
                        return f2u0.B(f2u0.D(zl5Var.J()), (Flowable) ((jly0) zl5Var.m).get(), (Flowable) ((jly0) zl5Var.i).get(), zl5Var.a());
                    case 10:
                        FlowableFilter flowableFilterJ4 = zl5Var.J();
                        Scheduler scheduler6 = (Scheduler) ((b2p) zl5Var.g).get();
                        yqg yqgVar2 = (yqg) ((hwj) zl5Var.c).g.get();
                        c8o.l(yqgVar2);
                        return f2u0.z(flowableFilterJ4, scheduler6, yqgVar2, zl5Var.a());
                    case 11:
                        yqg yqgVar3 = (yqg) ((hwj) zl5Var.c).g.get();
                        c8o.l(yqgVar3);
                        return new im51(yqgVar3);
                    case 12:
                        return new c7p(this, objArr3 == true ? 1 : 0);
                    case 13:
                        uag1 uag1Var = (uag1) ((hwj) zl5Var.c).v.get();
                        c8o.l(uag1Var);
                        return uag1Var.a();
                    case 14:
                        hwj hwjVar2 = (hwj) zl5Var.c;
                        hwj hwjVar3 = (hwj) zl5Var.c;
                        w701 w701Var3 = (w701) hwjVar2.j.get();
                        c8o.l(w701Var3);
                        p901 p901Var = (p901) zl5Var.b;
                        jly0 jly0Var2 = (jly0) zl5Var.p;
                        luk lukVarC8 = hwjVar3.c();
                        c8o.l(lukVarC8);
                        boolean zC = new j55(lukVarC8).c();
                        d0r d0rVar4 = (d0r) ((jly0) zl5Var.f).get();
                        q8n q8nVar6 = (q8n) hwjVar3.d.get();
                        c8o.l(q8nVar6);
                        r801Var = new r801(w701Var3, p901Var, jly0Var2, zC, d0rVar4, q8nVar6);
                        break;
                    case 15:
                        hwj hwjVar4 = (hwj) zl5Var.c;
                        q7r0 q7r0Var3 = (q7r0) zl5Var.d;
                        p901 p901Var2 = (p901) zl5Var.b;
                        hwj hwjVar5 = (hwj) zl5Var.c;
                        i4q i4qVar = (i4q) hwjVar4.i.get();
                        c8o.l(i4qVar);
                        c4n0 c4n0Var = new c4n0(q7r0Var3);
                        String str = p901Var2.a;
                        c8o.m(str);
                        i8h1 i8h1Var5 = (i8h1) hwjVar5.f22p.get();
                        c8o.l(i8h1Var5);
                        v1k v1kVar = new v1k(str, i8h1Var5, zl5Var.s(), (byte) 20);
                        jz51 jz51VarG3 = zl5Var.G();
                        otl0 otl0VarS = zl5Var.s();
                        String str2 = p901Var2.a;
                        c8o.m(str2);
                        y441 y441Var2 = new y441(v1kVar, jz51VarG3, otl0VarS, str2);
                        uxy0 uxy0Var = new uxy0((th30) ((b2p) zl5Var.s).get(), new uww0(xqu.a((b2p) zl5Var.v), (byte) 3), (byte) 5);
                        String str3 = p901Var2.a;
                        c8o.m(str3);
                        m021 m021Var = new m021(uxy0Var, str3, (byte) 4);
                        dg30 dg30Var2 = (dg30) hwjVar5.l.get();
                        c8o.l(dg30Var2);
                        dg30 dg30Var3 = (dg30) hwjVar5.l.get();
                        c8o.l(dg30Var3);
                        String str4 = p901Var2.a;
                        c8o.m(str4);
                        i8h1 i8h1Var6 = (i8h1) hwjVar5.f22p.get();
                        c8o.l(i8h1Var6);
                        v1k v1kVar2 = new v1k(str4, i8h1Var6, zl5Var.s(), (byte) 20);
                        otl0 otl0VarS2 = zl5Var.s();
                        String str5 = p901Var2.a;
                        c8o.m(str5);
                        hce1 hce1Var = new hce1(dg30Var3, v1kVar2, otl0VarS2, str5, (byte) 12);
                        d0r d0rVar5 = (d0r) ((jly0) zl5Var.f).get();
                        String str6 = p901Var2.a;
                        c8o.m(str6);
                        luk lukVarC9 = hwjVar5.c();
                        c8o.l(lukVarC9);
                        boolean zC2 = new j55(lukVarC9).c();
                        zmg1 zmg1Var = (zmg1) hwjVar5.s.get();
                        c8o.l(zmg1Var);
                        rng1 rng1Var = (rng1) ((jly0) zl5Var.w).get();
                        hng1 hng1Var = (hng1) hwjVar5.u.get();
                        c8o.l(hng1Var);
                        return new xhm(i4qVar, c4n0Var, y441Var2, m021Var, dg30Var2, hce1Var, d0rVar5, str6, zC2, zmg1Var, rng1Var, hng1Var, xcz0.o(q7r0Var3));
                    case 16:
                        th30 th30Var = (th30) ((hwj) zl5Var.c).k.get();
                        c8o.l(th30Var);
                        return th30Var;
                    case 17:
                        b2p b2pVar = (b2p) zl5Var.s;
                        b2p b2pVar2 = (b2p) zl5Var.g;
                        b2p b2pVar3 = (b2p) zl5Var.t;
                        b2p b2pVar4 = (b2p) zl5Var.u;
                        z901 z901Var = new z901();
                        z901Var.a = b2pVar;
                        z901Var.b = b2pVar2;
                        z901Var.c = b2pVar3;
                        z901Var.d = b2pVar4;
                        return z901Var;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        t2j0 t2j0Var = (t2j0) ((hwj) zl5Var.c).o.get();
                        c8o.l(t2j0Var);
                        return t2j0Var;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        kt91 kt91Var = (kt91) ((hwj) zl5Var.c).f.get();
                        c8o.l(kt91Var);
                        return kt91Var;
                    case 20:
                        s6q s6qVar = (s6q) ((hwj) zl5Var.c).t.get();
                        c8o.l(s6qVar);
                        iac0 iac0VarO2 = xcz0.o((q7r0) zl5Var.d);
                        String str7 = ((p901) zl5Var.b).a;
                        c8o.m(str7);
                        r801Var = s6qVar.a(iac0VarO2);
                        fn31.T(cto1.q(iac0VarO2), (o8n) null, 0, new b201(r801Var, str7, (lnm) null, (byte) 6), 3);
                        break;
                    default:
                        jah.e(b2);
                        return null;
                }
                return r801Var;
        }
    }
}
