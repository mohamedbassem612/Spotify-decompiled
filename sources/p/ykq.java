package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ykq implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ykq(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        z9p z9pVar = (z9p) this.c;
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                qua0 qua0Var = (t701) ((v801) z9pVar.k).B.get();
                c8o.l(qua0Var);
                qua0 qua0Var2 = (csy) ((v801) z9pVar.k).C.get();
                c8o.l(qua0Var2);
                return new e5b0(30, p7h.M(new qua0[]{qua0Var, qua0Var2}), (List) null);
            case 1:
                v801 v801Var = (v801) z9pVar.k;
                v801 v801Var2 = (v801) z9pVar.k;
                w701 w701Var = (w701) v801Var.l.get();
                c8o.l(w701Var);
                p901 p901Var = (p901) z9pVar.j;
                jly0 jly0Var = (jly0) z9pVar.c;
                luk lukVarA = v801Var2.a();
                c8o.l(lukVarA);
                boolean zC = new j55(lukVarA).c();
                d0r d0rVar = (d0r) ((jly0) z9pVar.d).get();
                q8n q8nVar = (q8n) v801Var2.e.get();
                c8o.l(q8nVar);
                return new r801(w701Var, p901Var, jly0Var, zC, d0rVar, q8nVar);
            case 2:
                uag1 uag1Var = (uag1) ((v801) z9pVar.k).A.get();
                c8o.l(uag1Var);
                return uag1Var.a();
            case 3:
                return cwl1.C((q7r0) z9pVar.a);
            case 4:
                Scheduler scheduler = (Scheduler) ((v801) z9pVar.k).d.get();
                c8o.l(scheduler);
                return scheduler;
            case 5:
                v801 v801Var3 = (v801) z9pVar.k;
                q7r0 q7r0Var = (q7r0) z9pVar.a;
                p901 p901Var2 = (p901) z9pVar.j;
                v801 v801Var4 = (v801) z9pVar.k;
                i4q i4qVar = (i4q) v801Var3.j.get();
                c8o.l(i4qVar);
                c4n0 c4n0Var = new c4n0(q7r0Var);
                v1k v1kVarB = z9pVar.b();
                jz51 jz51VarF = z9pVar.f();
                otl0 otl0Var = (otl0) ((ykq) z9pVar.m).get();
                String str = p901Var2.a;
                c8o.m(str);
                y441 y441Var = new y441(v1kVarB, jz51VarF, otl0Var, str);
                uxy0 uxy0Var = new uxy0((th30) ((ykq) z9pVar.n).get(), new uww0(xqu.a((ykq) z9pVar.q), (byte) 3), (byte) 5);
                String str2 = p901Var2.a;
                c8o.m(str2);
                m021 m021Var = new m021(uxy0Var, str2, (byte) 4);
                dg30 dg30Var = (dg30) v801Var4.q.get();
                c8o.l(dg30Var);
                dg30 dg30Var2 = (dg30) v801Var4.q.get();
                c8o.l(dg30Var2);
                v1k v1kVarB2 = z9pVar.b();
                otl0 otl0Var2 = (otl0) ((ykq) z9pVar.m).get();
                String str3 = p901Var2.a;
                c8o.m(str3);
                hce1 hce1Var = new hce1(dg30Var2, v1kVarB2, otl0Var2, str3, (byte) 12);
                d0r d0rVar2 = (d0r) ((jly0) z9pVar.d).get();
                String str4 = p901Var2.a;
                c8o.m(str4);
                luk lukVarA2 = v801Var4.a();
                c8o.l(lukVarA2);
                boolean zC2 = new j55(lukVarA2).c();
                zmg1 zmg1Var = (zmg1) v801Var4.x.get();
                c8o.l(zmg1Var);
                rng1 rng1Var = (rng1) ((jly0) z9pVar.f).get();
                hng1 hng1Var = (hng1) v801Var4.z.get();
                c8o.l(hng1Var);
                return new xhm(i4qVar, c4n0Var, y441Var, m021Var, dg30Var, hce1Var, d0rVar2, str4, zC2, zmg1Var, rng1Var, hng1Var, xcz0.o(q7r0Var));
            case 6:
                return n901.a[((r801) ((jly0) z9pVar.e).get()).X.X.ordinal()] == 1 ? otl0.c : otl0.d;
            case 7:
                th30 th30Var = (th30) ((v801) z9pVar.k).f70p.get();
                c8o.l(th30Var);
                return th30Var;
            case 8:
                ykq ykqVar = (ykq) z9pVar.n;
                ykq ykqVar2 = (ykq) z9pVar.l;
                ykq ykqVar3 = (ykq) z9pVar.o;
                ykq ykqVar4 = (ykq) z9pVar.f87p;
                z901 z901Var = new z901();
                z901Var.a = ykqVar;
                z901Var.b = ykqVar2;
                z901Var.c = ykqVar3;
                z901Var.d = ykqVar4;
                return z901Var;
            case 9:
                t2j0 t2j0Var = (t2j0) ((v801) z9pVar.k).t.get();
                c8o.l(t2j0Var);
                return t2j0Var;
            case 10:
                kt91 kt91Var = (kt91) ((v801) z9pVar.k).g.get();
                c8o.l(kt91Var);
                return kt91Var;
            case 11:
                s6q s6qVar = (s6q) ((v801) z9pVar.k).y.get();
                c8o.l(s6qVar);
                iac0 iac0VarO = xcz0.o((q7r0) z9pVar.a);
                String str5 = ((p901) z9pVar.j).a;
                c8o.m(str5);
                rng1 rng1VarA = s6qVar.a(iac0VarO);
                fn31.T(cto1.q(iac0VarO), (o8n) null, 0, new b201(rng1VarA, str5, (lnm) null, (byte) 6), 3);
                return rng1VarA;
            case 12:
                return new enq(this);
            case 13:
                return new fnq(this);
            case 14:
                return new gnq(this);
            case 15:
                return f2u0.C(f2u0.D(z9pVar.h()), (Flowable) ((jly0) z9pVar.r).get(), (Flowable) ((jly0) z9pVar.s).get(), z9pVar.a());
            case 16:
                FlowableFilter flowableFilterH = z9pVar.h();
                Scheduler scheduler2 = (Scheduler) ((ykq) z9pVar.l).get();
                yqg yqgVar = (yqg) ((v801) z9pVar.k).h.get();
                c8o.l(yqgVar);
                return f2u0.A(flowableFilterH, scheduler2, yqgVar, z9pVar.a());
            case 17:
                return f2u0.y(z9pVar.h(), z9pVar.a());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                t8u0 t8u0Var = (t8u0) ((v801) z9pVar.k).r.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) z9pVar.a, t8u0Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return xfs0.g;
            case 20:
                return f2u0.B(f2u0.D(z9pVar.h()), (Flowable) ((jly0) z9pVar.w).get(), (Flowable) ((jly0) z9pVar.s).get(), z9pVar.a());
            case 21:
                FlowableFilter flowableFilterH2 = z9pVar.h();
                Scheduler scheduler3 = (Scheduler) ((ykq) z9pVar.l).get();
                yqg yqgVar2 = (yqg) ((v801) z9pVar.k).h.get();
                c8o.l(yqgVar2);
                return f2u0.z(flowableFilterH2, scheduler3, yqgVar2, z9pVar.a());
            case 22:
                yqg yqgVar3 = (yqg) ((v801) z9pVar.k).h.get();
                c8o.l(yqgVar3);
                return new im51(yqgVar3);
            case 23:
                return new c7p(this, b);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object b() {
        wj3 wj3Var = (wj3) this.c;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                jly0 jly0Var = (jly0) wj3Var.d;
                d111 d111Var = (d111) wj3Var.c;
                iac0 iac0Var = (iac0) jly0Var.get();
                ruz ruzVarA = ((cyp) ((jly0) wj3Var.e).get()).a();
                jp00 jp00Var = (jp00) d111Var.o.get();
                c8o.l(jp00Var);
                Context context = (Context) d111Var.b.get();
                c8o.l(context);
                ww81 ww81VarA = tjw0.a(jp00Var, context);
                Context context2 = (Context) d111Var.b.get();
                c8o.l(context2);
                iir iirVar = new iir(context2);
                Flowable flowable = (Flowable) d111Var.s.get();
                c8o.l(flowable);
                o241 o241Var = (o241) d111Var.m.get();
                c8o.l(o241Var);
                Scheduler scheduler = (Scheduler) d111Var.i.get();
                c8o.l(scheduler);
                mw7 mw7Var = (mw7) d111Var.p.get();
                c8o.l(mw7Var);
                yqg yqgVar = (yqg) d111Var.a.get();
                c8o.l(yqgVar);
                t2j0 t2j0Var = (t2j0) d111Var.H.get();
                c8o.l(t2j0Var);
                return new lkw0(iac0Var, ruzVarA, ww81VarA, iirVar, flowable, o241Var, scheduler, mw7Var, yqgVar, new hlr(t2j0Var));
            case 1:
                iac0 iac0Var2 = ((q7r0) wj3Var.b).d.c;
                c8o.m(iac0Var2);
                return iac0Var2;
            case 2:
                t8u0 t8u0Var = (t8u0) ((d111) wj3Var.c).F.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) wj3Var.b, t8u0Var);
            case 3:
                return new onq(this);
            case 4:
                return new pnq(this, b);
            case 5:
                return new qnq((byte) 0);
            case 6:
                return new rnq(this);
            case 7:
                d111 d111Var2 = (d111) wj3Var.c;
                d111 d111Var3 = (d111) wj3Var.c;
                yqg yqgVar2 = (yqg) d111Var2.a.get();
                c8o.l(yqgVar2);
                lik1 lik1Var = nik1.J4;
                c8o.m(lik1Var);
                ccc0 ccc0Var = (ccc0) d111Var3.j.get();
                c8o.l(ccc0Var);
                xrc0 xrc0Var = (xrc0) d111Var3.k.get();
                c8o.l(xrc0Var);
                iyc0 iyc0Var = (iyc0) d111Var3.l.get();
                c8o.l(iyc0Var);
                Scheduler scheduler2 = (Scheduler) d111Var3.h.get();
                c8o.l(scheduler2);
                ip91 ip91Var = (ip91) d111Var3.r.get();
                c8o.l(ip91Var);
                agc0 agc0Var = (agc0) d111Var3.w.get();
                c8o.l(agc0Var);
                q7j0 q7j0Var = new q7j0(agc0Var);
                g7h g7hVar = (g7h) d111Var3.B.get();
                c8o.l(g7hVar);
                q8n q8nVar = (q8n) d111Var3.D.get();
                c8o.l(q8nVar);
                q8n q8nVar2 = (q8n) d111Var3.G.get();
                c8o.l(q8nVar2);
                return new gx01(yqgVar2, lik1Var, ccc0Var, xrc0Var, iyc0Var, scheduler2, ip91Var, q7j0Var, g7hVar, q8nVar, q8nVar2);
            case 8:
                return new snq((byte) 0);
            case 9:
                return new tnq((byte) 0);
            case 10:
                return new unq(this, b);
            case 11:
                return new vnq(this, b);
            case 12:
                d111 d111Var4 = (d111) wj3Var.c;
                d111 d111Var5 = (d111) wj3Var.c;
                Flowable flowable2 = (Flowable) d111Var4.s.get();
                c8o.l(flowable2);
                hn91 hn91Var = (hn91) d111Var5.q.get();
                c8o.l(hn91Var);
                Scheduler scheduler3 = (Scheduler) d111Var5.h.get();
                c8o.l(scheduler3);
                xrc0 xrc0Var2 = (xrc0) d111Var5.k.get();
                c8o.l(xrc0Var2);
                return new bru0(flowable2, hn91Var, scheduler3, xrc0Var2);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object c() {
        ynq ynqVar = (ynq) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                uh11 uh11Var = ynqVar.a;
                uh11 uh11Var2 = ynqVar.a;
                xfx xfxVarA0 = uh11Var.a0();
                c8o.l(xfxVarA0);
                sap sapVar = (sap) ynqVar.O.get();
                Flowable flowable = (Flowable) ynqVar.c.get();
                fl3 fl3VarK = uh11Var2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable, fl3VarK, (lik1) ynqVar.q.get());
                Flowable flowable2 = (Flowable) ynqVar.c.get();
                w9u0 w9u0Var = (w9u0) ynqVar.d.get();
                ip91 ip91Var = uh11Var2.y().a;
                c8o.m(ip91Var);
                jp91 jp91Var = uh11Var2.y().d;
                c8o.m(jp91Var);
                mzr0 mzr0VarA = jp91Var.a((iac0) ynqVar.P.get(), (lik1) ynqVar.q.get(), (n6r0) ynqVar.z.get());
                jo91 jo91Var = uh11Var2.y().b;
                c8o.m(jo91Var);
                ln91 ln91VarI1 = uh11Var2.i1();
                c8o.l(ln91VarI1);
                ijr ijrVarJ0 = uh11Var2.j0();
                c8o.l(ijrVarJ0);
                Scheduler schedulerG = uh11Var2.G();
                c8o.l(schedulerG);
                e5l0 e5l0Var = new e5l0(new s880(flowable2, w9u0Var, ip91Var, mzr0VarA, jo91Var, ln91VarI1, ijrVarJ0, schedulerG, ynqVar.g(), ynqVar.g()), (byte) 6);
                wnq wnqVar = (wnq) ynqVar.S.get();
                mo51 mo51VarI = ynqVar.i();
                Flowable flowable3 = (Flowable) ynqVar.c.get();
                Flowable flowable4 = (Flowable) ynqVar.U.get();
                w9u0 w9u0Var2 = (w9u0) ynqVar.d.get();
                Consumer consumer = (Consumer) ynqVar.V.get();
                kvs0 kvs0VarD1 = uh11Var2.d1();
                c8o.l(kvs0VarD1);
                luk lukVarW = uh11Var2.w();
                c8o.l(lukVarW);
                jn4 jn4Var = new jn4(lukVarW);
                u4q0 u4q0VarS0 = uh11Var2.s0();
                c8o.l(u4q0VarS0);
                a1r0 a1r0Var = (a1r0) ynqVar.G.get();
                rh11 rh11VarD0 = uh11Var2.d0();
                c8o.l(rh11VarD0);
                dma1 dma1VarM0 = uh11Var2.m0();
                c8o.l(dma1VarM0);
                pbq pbqVar = new pbq(flowable3, flowable4, w9u0Var2, consumer, kvs0VarD1, jn4Var, u4q0VarS0, a1r0Var, rh11VarD0, dma1VarM0, (byte) 25);
                ynb0 ynb0VarA = xqu.a(ynqVar.W);
                FlowableMap flowableMapB = ynqVar.b();
                uu00 uu00VarA = uh11Var2.A();
                c8o.l(uu00VarA);
                d0r d0rVar = (d0r) ynqVar.o.get();
                vbs vbsVarN = uh11Var2.n();
                c8o.l(vbsVarN);
                q8n q8nVarG = uh11Var2.g();
                c8o.l(q8nVarG);
                luk lukVarW2 = uh11Var2.w();
                c8o.l(lukVarW2);
                dxy dxyVar = new dxy(flowableMapB, uu00VarA, d0rVar, vbsVarN, q8nVarG, new gn4(false, lukVarW2), (byte) 17);
                s691 s691Var = new s691(ynqVar.f(), (Flowable) ynqVar.h.get(), ynqVar.d(), (w9u0) ynqVar.d.get());
                Flowable flowable5 = (Flowable) ynqVar.c.get();
                Flowable flowable6 = (Flowable) ynqVar.h.get();
                w9u0 w9u0Var3 = (w9u0) ynqVar.d.get();
                yqg yqgVarA = uh11Var2.a();
                c8o.l(yqgVarA);
                kvs0 kvs0VarD2 = uh11Var2.d1();
                c8o.l(kvs0VarD2);
                rh11 rh11VarD1 = uh11Var2.d0();
                c8o.l(rh11VarD1);
                u4q0 u4q0VarS1 = uh11Var2.s0();
                c8o.l(u4q0VarS1);
                s880 s880Var = new s880(flowable5, flowable6, w9u0Var3, yqgVarA, kvs0VarD2, rh11VarD1, u4q0VarS1, (a1r0) ynqVar.G.get());
                k691 k691Var = new k691((Flowable) ynqVar.c.get(), (Flowable) ynqVar.h.get(), (w9u0) ynqVar.d.get(), (mrq0) ynqVar.Z.get(), (h691) ynqVar.w.get());
                vi11 vi11Var = new vi11((Flowable) ynqVar.c.get(), (Flowable) ynqVar.h.get(), (w9u0) ynqVar.d.get(), (mrq0) ynqVar.Z.get(), (h691) ynqVar.w.get(), (byte) 0);
                Flowable flowable7 = (Flowable) ynqVar.c.get();
                dg30 dg30VarZ = uh11Var2.Z();
                c8o.l(dg30VarZ);
                p3q p3qVarG1 = uh11Var2.g1();
                c8o.l(p3qVarG1);
                ywv0 ywv0VarA = p3qVarG1.a(dg30VarZ.e0());
                pqs pqsVarT0 = uh11Var2.T0();
                c8o.l(pqsVarT0);
                ynb0 ynb0VarA2 = xqu.a(ynqVar.a0);
                xbu0 xbu0Var = (xbu0) ynqVar.b0.get();
                sas sasVarG = ynqVar.g();
                kvs0 kvs0VarD3 = uh11Var2.d1();
                c8o.l(kvs0VarD3);
                t8r0 t8r0VarH = ynqVar.h();
                u4q0 u4q0VarS2 = uh11Var2.s0();
                c8o.l(u4q0VarS2);
                pbq pbqVar2 = new pbq(flowable7, ywv0VarA, pqsVarT0, ynb0VarA2, xbu0Var, sasVarG, kvs0VarD3, t8r0VarH, u4q0VarS2, (a1r0) ynqVar.G.get(), (byte) 26);
                Flowable flowable8 = (Flowable) ynqVar.c.get();
                xbu0 xbu0Var2 = (xbu0) ynqVar.b0.get();
                kvs0 kvs0VarD4 = uh11Var2.d1();
                c8o.l(kvs0VarD4);
                mi11 mi11Var = new mi11(flowable8, xbu0Var2, kvs0VarD4, ynqVar.h());
                ynb0 ynb0VarA3 = xqu.a(ynqVar.e0);
                ynb0 ynb0VarA4 = xqu.a(ynqVar.f0);
                ynb0 ynb0VarA5 = xqu.a(ynqVar.h0);
                ynb0 ynb0VarA6 = xqu.a(ynqVar.j0);
                Flowable flowable9 = (Flowable) ynqVar.c.get();
                a1r0 a1r0Var2 = (a1r0) ynqVar.G.get();
                uvy uvyVarQ0 = uh11Var2.q0();
                c8o.l(uvyVarQ0);
                q8n q8nVarE = uh11Var2.e();
                c8o.l(q8nVarE);
                luk lukVarW3 = uh11Var2.w();
                c8o.l(lukVarW3);
                duy duyVar = new duy(flowable9, a1r0Var2, uvyVarQ0, q8nVarE, new wu4(false, lukVarW3));
                vsy vsyVar = new vsy((Flowable) ynqVar.c.get(), (w9u0) ynqVar.d.get(), (d0r) ynqVar.o.get(), uh11Var2.v0());
                Flowable flowable10 = (Flowable) ynqVar.c.get();
                xh71 xh71VarZ = uh11Var2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = uh11Var2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = uh11Var2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = uh11Var2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = uh11Var2.k();
                c8o.l(me30VarK);
                Flowable flowableF = uh11Var2.f();
                c8o.l(flowableF);
                f771 f771VarO = uh11Var2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0((Object) hq41VarD, (Object) me30VarK, (Object) flowableF, (Object) f771VarO, (byte) 15);
                f771 f771VarO2 = uh11Var2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = uh11Var2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) ynqVar.P.get();
                luk lukVarW4 = uh11Var2.w();
                c8o.l(lukVarW4);
                o671 o671Var = new o671(flowable10, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW4);
                c9c0 c9c0Var = (c9c0) ynqVar.R.get();
                g5p0 g5p0VarW0 = uh11Var2.w0();
                c8o.l(g5p0VarW0);
                waz0 waz0VarY = uh11Var2.Y();
                c8o.l(waz0VarY);
                v6z0 v6z0Var = new v6z0(c9c0Var, g5p0VarW0, waz0VarY);
                Flowable flowable11 = (Flowable) ynqVar.c.get();
                d0r d0rVar2 = (d0r) ynqVar.o.get();
                boolean zBooleanValue = ((Boolean) ynqVar.k0.get()).booleanValue();
                w9u0 w9u0Var4 = (w9u0) ynqVar.d.get();
                u961 u961VarK0 = uh11Var2.k0();
                ajq0 ajq0VarT0 = uh11Var2.t0();
                c3s c3sVarB = uh11Var2.B();
                c8o.l(c3sVarB);
                dma1 dma1VarP0 = uh11Var2.P0();
                c8o.l(dma1VarP0);
                e68 e68Var = new e68(flowable11, d0rVar2, zBooleanValue, w9u0Var4, u961VarK0, ajq0VarT0, c3sVarB, new in01(dma1VarP0));
                FlowableMap flowableMapB2 = ynqVar.b();
                lid lidVarL0 = uh11Var2.L0();
                c8o.l(lidVarL0);
                lkd lkdVarV = mid.v(lidVarL0);
                waz0 waz0VarY2 = uh11Var2.Y();
                c8o.l(waz0VarY2);
                Flowable flowableG = Flowable.g(flowableMapB2.X(new t0y(lkdVarV, (byte) 1)), flowableMapB2.J(m9x0.f), flowableMapB2.J(n9x0.f), waz0VarY2.d(), new mhc((byte) 22));
                FlowableJust flowableJustY = k9o0.y((hnl) ynqVar.k.get());
                Flowable flowable12 = (Flowable) ynqVar.c.get();
                o241 o241VarI = uh11Var2.i();
                c8o.l(o241VarI);
                uwh uwhVarJ = uh11Var2.J();
                c8o.l(uwhVarJ);
                lid lidVarL1 = uh11Var2.L0();
                c8o.l(lidVarL1);
                lkd lkdVarV2 = mid.v(lidVarL1);
                gmt gmtVarO0 = uh11Var2.o0();
                pqq0 pqq0Var = (pqq0) ynqVar.l0.get();
                yqg yqgVarA2 = uh11Var2.a();
                c8o.l(yqgVarA2);
                Scheduler schedulerO = uh11Var2.o();
                c8o.l(schedulerO);
                Flowable flowableH = Flowable.h(ioo1.K(flowable12, o241VarI, uwhVarJ, lkdVarV2, pqq0Var, yqgVarA2, schedulerO), Flowable.h(flowable12.j(mo9.Y).J(o9x0.f), yoi1.h((x3s) gmtVarO0.c, o6x.a).U(rih1.a), s9x0.f).J(new n0v0(gmtVarO0, (byte) 22)), u9x0.f);
                rh11 rh11VarD2 = uh11Var2.d0();
                c8o.l(rh11VarD2);
                u4q0 u4q0VarS3 = uh11Var2.s0();
                c8o.l(u4q0VarS3);
                ynb0 ynb0VarA7 = xqu.a(ynqVar.m0);
                ynb0 ynb0VarA8 = xqu.a(ynqVar.n0);
                n6r0 n6r0Var = (n6r0) ynqVar.z.get();
                lik1 lik1Var = (lik1) ynqVar.q.get();
                luk lukVarW5 = uh11Var2.w();
                c8o.l(lukVarW5);
                return new yh11(xfxVarA0, sapVar, yl1Var, e5l0Var, wnqVar, mo51VarI, pbqVar, ynb0VarA, dxyVar, s691Var, s880Var, k691Var, vi11Var, pbqVar2, mi11Var, ynb0VarA3, ynb0VarA4, ynb0VarA5, ynb0VarA6, duyVar, vsyVar, o671Var, v6z0Var, e68Var, flowableG, flowableJustY, flowableH, rh11VarD2, u4q0VarS3, ynb0VarA7, ynb0VarA8, n6r0Var, lik1Var, new qn4(false, false, lukVarW5), w3p0.g((jnk0) ynqVar.s.get()));
            case 1:
                return new sap(this, (byte) 4);
            case 2:
                return k9o0.B(ynqVar.b);
            case 3:
                return k9o0.z(ynqVar.b);
            case 4:
                return ynqVar.b.f();
            case 5:
                return f2u0.B(ynqVar.f(), (Flowable) ynqVar.f.get(), (Flowable) ynqVar.g.get(), ynqVar.a());
            case 6:
                jly0 jly0Var = ynqVar.c;
                uh11 uh11Var3 = ynqVar.a;
                Flowable flowable13 = (Flowable) jly0Var.get();
                Scheduler schedulerO2 = uh11Var3.o();
                c8o.l(schedulerO2);
                yqg yqgVarA3 = uh11Var3.a();
                c8o.l(yqgVarA3);
                return f2u0.z(flowable13, schedulerO2, yqgVarA3, ynqVar.a());
            case 7:
                return f2u0.y((Flowable) ynqVar.c.get(), ynqVar.a());
            case 8:
                return new a62((p2p0) ynqVar.i.get(), (byte) 3);
            case 9:
                return ynqVar.b.j();
            case 10:
                return k9o0.r(ynqVar.b);
            case 11:
                return new l0y((p2p0) ynqVar.i.get(), (byte) 2);
            case 12:
                return new k0y((p2p0) ynqVar.i.get(), (byte) 2);
            case 13:
                return ynqVar.b.g();
            case 14:
                return k9o0.t(ynqVar.b);
            case 15:
                lzn0 lzn0VarC = ynqVar.a.c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 16:
                jly0 jly0Var2 = ynqVar.q;
                uh11 uh11Var4 = ynqVar.a;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = uh11Var4.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = uh11Var4.B();
                c8o.l(c3sVarB2);
                luk lukVarW6 = uh11Var4.w();
                c8o.l(lukVarW6);
                an4 an4Var = new an4(false, lukVarW6);
                luk lukVarW7 = uh11Var4.w();
                c8o.l(lukVarW7);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB2, an4Var, new uu4(false, lukVarW7), uh11Var4.q());
            case 17:
                return ynqVar.b.e();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                jly0 jly0Var3 = ynqVar.s;
                uh11 uh11Var5 = ynqVar.a;
                jnk0 jnk0Var = (jnk0) jly0Var3.get();
                gw70 gw70VarB = uh11Var5.b();
                c8o.l(gw70VarB);
                d0r d0rVar3 = (d0r) ynqVar.o.get();
                luk lukVarW8 = uh11Var5.w();
                c8o.l(lukVarW8);
                return new yxb0(jnk0Var, gw70VarB, d0rVar3, new fn4(false, lukVarW8));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Flowable flowable14 = (Flowable) ynqVar.c.get();
                Flowable flowable15 = (Flowable) ynqVar.f.get();
                c3s c3sVarB3 = ynqVar.a.B();
                c8o.l(c3sVarB3);
                return new jnk0(flowable14, flowable15, c3sVarB3);
            case 20:
                Flowable flowable16 = (Flowable) ynqVar.c.get();
                Flowable flowable17 = (Flowable) ynqVar.h.get();
                w9u0 w9u0Var5 = (w9u0) ynqVar.d.get();
                h691 h691Var = (h691) ynqVar.w.get();
                o241 o241VarI2 = ynqVar.a.i();
                c8o.l(o241VarI2);
                return new ktf1(flowable16, flowable17, w9u0Var5, h691Var, o241VarI2, ynqVar.x, ynqVar.g());
            case 21:
                uh11 uh11Var6 = ynqVar.a;
                kt91 kt91VarJ = uh11Var6.j();
                c8o.l(kt91VarJ);
                ykq ykqVar = ynqVar.u;
                ykq ykqVar2 = ynqVar.v;
                rh11 rh11VarD3 = uh11Var6.d0();
                c8o.l(rh11VarD3);
                return new nm30(new kp00(kt91VarJ, sd30.D(ykqVar, ykqVar2, rh11VarD3), (byte) 21), (byte) 1);
            case 22:
                ynqVar.getClass();
                uh11 uh11Var7 = ynqVar.a;
                dma1 dma1VarP1 = uh11Var7.P0();
                c8o.l(dma1VarP1);
                cm30 cm30Var = new cm30(dma1VarP1);
                yqg yqgVarA4 = uh11Var7.a();
                c8o.l(yqgVarA4);
                return new gqs(cm30Var, yqgVarA4);
            case 23:
                return new ui11();
            case 24:
                s4p0 s4p0VarR = ynqVar.a.R();
                c8o.l(s4p0VarR);
                return w3p0.B(s4p0VarR);
            case 25:
                return ynqVar.b.h();
            case 26:
                return ynqVar.b.i();
            case 27:
                Flowable flowable18 = (Flowable) ynqVar.c.get();
                Flowable flowable19 = (Flowable) ynqVar.h.get();
                w9u0 w9u0Var6 = (w9u0) ynqVar.d.get();
                h691 h691Var2 = (h691) ynqVar.w.get();
                o241 o241VarI3 = ynqVar.a.i();
                c8o.l(o241VarI3);
                return new ekf1(flowable18, flowable19, w9u0Var6, h691Var2, o241VarI3, ynqVar.x, ynqVar.g());
            case 28:
                return new FlowableOnBackpressureLatest((PublishProcessor) ynqVar.C.get());
            case 29:
                return new PublishProcessor();
            case 30:
                return new tap(this, (byte) 6);
            case 31:
                return ynqVar.a.b0();
            case 32:
                a1r0 a1r0VarC = ynqVar.a.C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 33:
                return w3p0.w(ynqVar.a.H(), ynqVar.b, (o2p0) ynqVar.y.get());
            case 34:
                return new a4f0((Flowable) ynqVar.c.get(), (Flowable) ynqVar.h.get(), (w9u0) ynqVar.d.get());
            case 35:
                return new ww9(ynqVar.c());
            case 36:
                a1g1 a1g1Var = new a1g1(ynqVar.a.F(), (byte) 11);
                Scheduler schedulerO3 = ynqVar.a.o();
                c8o.l(schedulerO3);
                return new h280(a1g1Var, schedulerO3);
            case 37:
                s4p0 s4p0VarR2 = ynqVar.a.R();
                c8o.l(s4p0VarR2);
                return w3p0.z(s4p0VarR2);
            case 38:
                s4p0 s4p0VarR3 = ynqVar.a.R();
                c8o.l(s4p0VarR3);
                return w3p0.A(s4p0VarR3);
            case 39:
                jly0 jly0Var4 = ynqVar.c;
                uh11 uh11Var8 = ynqVar.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var4.get());
                z6k0 z6k0VarM0 = uh11Var8.M0();
                c8o.l(z6k0VarM0);
                mnk0 mnk0VarM = uh11Var8.m();
                c8o.l(mnk0VarM);
                rxj0 rxj0VarG0 = uh11Var8.G0();
                c8o.l(rxj0VarG0);
                return new k6k0(flowableDistinctUntilChangedD, z6k0VarM0, mnk0VarM, rxj0VarG0);
            case 40:
                return k9o0.v(ynqVar.b);
            case 41:
                return new wnq(this);
            case 42:
                wm70 wm70VarL1 = ynqVar.a.l1();
                c8o.l(wm70VarL1);
                return wm70VarL1;
            case 43:
                c9c0 c9c0VarL = ynqVar.a.l();
                c8o.l(c9c0VarL);
                return c9c0VarL;
            case 44:
                return f2u0.C(ynqVar.f(), (Flowable) ynqVar.T.get(), (Flowable) ynqVar.g.get(), ynqVar.a());
            case 45:
                jly0 jly0Var5 = ynqVar.c;
                uh11 uh11Var9 = ynqVar.a;
                Flowable flowable20 = (Flowable) jly0Var5.get();
                Scheduler schedulerO4 = uh11Var9.o();
                c8o.l(schedulerO4);
                yqg yqgVarA5 = uh11Var9.a();
                c8o.l(yqgVarA5);
                return f2u0.A(flowable20, schedulerO4, yqgVarA5, ynqVar.a());
            case 46:
                return new lrj0(ynqVar.b, (byte) 21);
            case 47:
                FlowableMap flowableMapB3 = ynqVar.b();
                uh11 uh11Var10 = ynqVar.a;
                mo51 mo51VarI2 = ynqVar.i();
                Scheduler schedulerO5 = uh11Var10.o();
                c8o.l(schedulerO5);
                Flowable flowable21 = (Flowable) ynqVar.c.get();
                Flowable flowable22 = (Flowable) ynqVar.U.get();
                uvy uvyVarQ1 = uh11Var10.q0();
                c8o.l(uvyVarQ1);
                d0r d0rVar4 = (d0r) ynqVar.o.get();
                q8n q8nVarG2 = uh11Var10.g();
                c8o.l(q8nVarG2);
                luk lukVarW9 = uh11Var10.w();
                c8o.l(lukVarW9);
                hv4 hv4Var = new hv4(false, false, false, lukVarW9);
                dma1 dma1VarM1 = uh11Var10.m0();
                c8o.l(dma1VarM1);
                acl aclVar = new acl(flowable21, flowable22, uvyVarQ1, d0rVar4, q8nVarG2, hv4Var, dma1VarM1);
                w9u0 w9u0Var7 = (w9u0) ynqVar.d.get();
                Consumer consumer2 = (Consumer) ynqVar.V.get();
                dma1 dma1VarM2 = uh11Var10.m0();
                c8o.l(dma1VarM2);
                zr51 zr51Var = new zr51(w9u0Var7, consumer2, dma1VarM2);
                luk lukVarW10 = uh11Var10.w();
                c8o.l(lukVarW10);
                y441 y441Var = new y441(schedulerO5, aclVar, zr51Var, new zu4(false, lukVarW10));
                xfx xfxVarA1 = uh11Var10.a0();
                c8o.l(xfxVarA1);
                return new rt01(flowableMapB3, mo51VarI2, y441Var, xfxVarA1);
            case 48:
                uh11 uh11Var11 = ynqVar.a;
                u4q0 u4q0VarS4 = uh11Var11.s0();
                c8o.l(u4q0VarS4);
                a1r0 a1r0Var3 = (a1r0) ynqVar.G.get();
                am30 am30VarF0 = uh11Var11.F0();
                c8o.l(am30VarF0);
                ynb0 ynb0VarA9 = xqu.a(ynqVar.X);
                ykq ykqVar3 = ynqVar.Y;
                q8n q8nVarV0 = uh11Var11.V0();
                c8o.l(q8nVarV0);
                p2o0 p2o0Var = new p2o0(u4q0VarS4, a1r0Var3, am30VarF0, ynb0VarA9, ykqVar3, q8nVarV0, (byte) 1);
                Flowable flowableF2 = ynqVar.a.f();
                c8o.l(flowableF2);
                return new zh11(p2o0Var, flowableF2);
            case 49:
                a1i1 a1i1VarG0 = ynqVar.a.g0();
                c8o.l(a1i1VarG0);
                return a1i1VarG0;
            case 50:
                luk lukVarW11 = ynqVar.a.w();
                c8o.l(lukVarW11);
                return new h05(false, lukVarW11);
            case 51:
                Flowable flowable23 = (Flowable) ynqVar.c.get();
                uh11 uh11Var12 = ynqVar.a;
                tp91 tp91Var = uh11Var12.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = uh11Var12.y().f;
                c8o.m(u3qVar);
                return new dax(flowable23, j991.A(tp91Var, u3qVar.a(), new bb01((p2p0) ynqVar.i.get(), (byte) 6)));
            case 52:
                return k9o0.A(ynqVar.b);
            case 53:
                return new xnq(this);
            case 54:
                FlowableMap flowableMapF = ynqVar.f();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j((Flowable) ynqVar.c.get());
                Flowable flowableD = ynqVar.d();
                Flowable flowable24 = (Flowable) ynqVar.h.get();
                w9u0 w9u0Var8 = (w9u0) ynqVar.d.get();
                yp91 yp91VarJ = ynqVar.j();
                im51 im51Var = (im51) ynqVar.d0.get();
                luk lukVarW12 = ynqVar.a.w();
                c8o.l(lukVarW12);
                return new am51(flowableMapF, flowableDistinctUntilChangedJ, flowableD, flowable24, w9u0Var8, yp91VarJ, im51Var, new kn4(false, lukVarW12));
            case 55:
                yqg yqgVarA6 = ynqVar.a.a();
                c8o.l(yqgVarA6);
                return new im51(yqgVarA6);
            case 56:
                FlowableMap flowableMapF2 = ynqVar.f();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j((Flowable) ynqVar.c.get());
                Flowable flowableD2 = ynqVar.d();
                Flowable flowable25 = (Flowable) ynqVar.h.get();
                w9u0 w9u0Var9 = (w9u0) ynqVar.d.get();
                yp91 yp91VarJ2 = ynqVar.j();
                im51 im51Var2 = (im51) ynqVar.d0.get();
                luk lukVarW13 = ynqVar.a.w();
                c8o.l(lukVarW13);
                return new qm51(flowableMapF2, flowableDistinctUntilChangedJ2, flowableD2, flowable25, w9u0Var9, yp91VarJ2, im51Var2, new kn4(false, lukVarW13));
            case 57:
                uh11 uh11Var13 = ynqVar.a;
                uh11 uh11Var14 = ynqVar.a;
                pta1 pta1VarI = uh11Var13.I();
                c8o.l(pta1VarI);
                Observable map = pta1VarI.a().map(u9x0.P0);
                FlowableMap flowableMapB4 = ynqVar.b();
                pta1 pta1VarI2 = uh11Var14.I();
                c8o.l(pta1VarI2);
                ynb0 ynb0VarA10 = xqu.a(ynqVar.g0);
                luk lukVarW14 = uh11Var14.w();
                c8o.l(lukVarW14);
                return new bs0(map, flowableMapB4, pta1VarI2, ynb0VarA10, lukVarW14);
            case 58:
                dg30 dg30VarZ2 = ynqVar.a.Z();
                c8o.l(dg30VarZ2);
                lik1 lik1Var3 = (lik1) ynqVar.q.get();
                lua1 lua1VarQ = ynqVar.a.Q();
                c8o.l(lua1VarQ);
                return lua1VarQ.a(dg30VarZ2, lik1Var3);
            case 59:
                Flowable flowable26 = (Flowable) ynqVar.c.get();
                FlowableMap flowableMapF3 = ynqVar.f();
                h991 h991VarP = ynqVar.a.P();
                c8o.l(h991VarP);
                return new bs0(flowable26, flowableMapF3, h991VarP, xqu.a(ynqVar.i0));
            case 60:
                y991 y991VarT = ynqVar.a.T();
                c8o.l(y991VarT);
                return y991VarT;
            case 61:
                return Boolean.valueOf(ynqVar.b.a());
            case 62:
                return k9o0.x(ynqVar.b);
            case 63:
                return ynqVar.a.i0();
            case 64:
                return new mtf((PublishProcessor) ynqVar.C.get(), (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object d() {
        h72 h72Var = (h72) this.c;
        kx11 kx11Var = (kx11) h72Var.b;
        q7r0 q7r0Var = (q7r0) h72Var.d;
        dx11 dx11Var = (dx11) h72Var.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new znq(this);
            case 1:
                RetrofitMaker retrofitMaker = (RetrofitMaker) dx11Var.e.get();
                c8o.l(retrofitMaker);
                em3 em3Var = new em3((ev6) retrofitMaker.createWebgateService(ev6.class, "android-creator-releases-page"));
                uu00 uu00Var = (uu00) dx11Var.g.get();
                c8o.l(uu00Var);
                zo8 zo8Var = new zo8(uu00Var);
                xrc0 xrc0Var = (xrc0) dx11Var.f.get();
                c8o.l(xrc0Var);
                xw11 xw11Var = new xw11(new o3e0(em3Var, zo8Var, new zzx(xrc0Var), (byte) 1));
                kly0 kly0Var = dx11Var.v;
                kly0 kly0Var2 = dx11Var.x;
                kly0 kly0Var3 = dx11Var.s;
                kly0 kly0Var4 = dx11Var.r;
                xfx xfxVar = (xfx) dx11Var.h.get();
                c8o.l(xfxVar);
                fx6 fx6Var = new fx6(xfxVar);
                aoq aoqVar = (aoq) ((jly0) h72Var.f).get();
                yqg yqgVar = (yqg) kly0Var4.get();
                c8o.l(yqgVar);
                gw70 gw70Var = (gw70) kly0Var3.get();
                c8o.l(gw70Var);
                ggv ggvVar = (ggv) dx11Var.t.get();
                c8o.l(ggvVar);
                f6g1 f6g1Var = (f6g1) kly0Var2.get();
                c8o.l(f6g1Var);
                zsc zscVar = new zsc(yqgVar, gw70Var, ggvVar, f6g1Var, (byte) 19);
                lzn0 lzn0Var = (lzn0) dx11Var.i.get();
                c8o.l(lzn0Var);
                yqg yqgVar2 = (yqg) kly0Var4.get();
                c8o.l(yqgVar2);
                opv0 opv0Var = (opv0) dx11Var.u.get();
                c8o.l(opv0Var);
                ycc1 ycc1Var = new ycc1(yqgVar2, opv0Var, (byte) 27);
                ue3 ue3Var = new ue3();
                abm abmVar = (abm) kly0Var.get();
                c8o.l(abmVar);
                ajq0 ajq0Var = new ajq0(zscVar, lzn0Var, ycc1Var, ue3Var, abmVar);
                f54 f54VarM = h72Var.m();
                abm abmVar2 = (abm) kly0Var.get();
                c8o.l(abmVar2);
                kdy0 kdy0Var = new kdy0(aoqVar, ajq0Var, f54VarM, abmVar2, (byte) 19);
                bb8 bb8Var = (bb8) dx11Var.q.get();
                c8o.l(bb8Var);
                zet0 zet0Var = (zet0) dx11Var.E.get();
                c8o.l(zet0Var);
                vyo vyoVar = (vyo) ((jly0) h72Var.i).get();
                lik1 lik1VarU = h72Var.U();
                ynb0 ynb0VarA = xqu.a((ykq) h72Var.t);
                a680 a680Var = new a680();
                a680Var.a = bb8Var;
                a680Var.b = zet0Var;
                a680Var.c = vyoVar;
                a680Var.d = lik1VarU;
                a680Var.e = ynb0VarA;
                a680Var.f = ta8.a;
                dgb dgbVar = new dgb((byte) 8);
                f54 f54VarM2 = h72Var.m();
                d0r d0rVarC = cwl1.C(q7r0Var);
                yqg yqgVar3 = (yqg) kly0Var4.get();
                c8o.l(yqgVar3);
                gw70 gw70Var2 = (gw70) kly0Var3.get();
                c8o.l(gw70Var2);
                f6g1 f6g1Var2 = (f6g1) kly0Var2.get();
                c8o.l(f6g1Var2);
                zs11 zs11Var = new zs11(yqgVar3, gw70Var2, f6g1Var2);
                uic uicVar = new uic((byte) 29);
                vhc vhcVar = new vhc((byte) 29);
                f1n0 f1n0Var = (f1n0) dx11Var.j.get();
                c8o.l(f1n0Var);
                z311 z311Var = new z311(f1n0Var, (byte) 1);
                d2q d2qVar = (d2q) dx11Var.w.get();
                c8o.l(d2qVar);
                s880 s880Var = new s880(fx6Var, kdy0Var, a680Var, dgbVar, f54VarM2, kx11Var, d0rVarC, new e821(zs11Var, uicVar, vhcVar, z311Var, d2qVar, h72Var.U()));
                uu00 uu00Var2 = (uu00) dx11Var.g.get();
                c8o.l(uu00Var2);
                w6e0 w6e0Var = new w6e0(new lim0("releases", uu00Var2));
                boq boqVar = (boq) ((jly0) h72Var.X).get();
                q8n q8nVar = (q8n) dx11Var.c.get();
                c8o.l(q8nVar);
                return new vw11(xw11Var, kx11Var, q7r0Var, s880Var, w6e0Var, boqVar, q8nVar);
            case 2:
                return new aoq(this);
            case 3:
                return new vyo(this, (byte) 5);
            case 4:
                h9n0 h9n0Var = (h9n0) dx11Var.a.get();
                c8o.l(h9n0Var);
                return h9n0Var;
            case 5:
                xzj1 xzj1Var = (xzj1) dx11Var.b.get();
                c8o.l(xzj1Var);
                return xzj1Var;
            case 6:
                return new myq0(q7r0Var).get();
            case 7:
                return new boq(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        kp5 kp5Var = (kp5) this.c;
        q7r0 q7r0Var = (q7r0) kp5Var.c;
        r221 r221Var = (r221) kp5Var.a;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) r221Var.n.get());
        }
        if (b == 1) {
            String str = ((t221) kp5Var.b).a;
            c8o.m(str);
            byp0 byp0Var = (byp0) r221Var.d.get();
            c8o.l(byp0Var);
            return new p021(str, byp0Var);
        }
        if (b != 2) {
            if (b == 3) {
                return new s221(u1n0.z(q7r0Var));
            }
            if (b == 4) {
                return new hoq(this);
            }
            jah.e(b);
            return null;
        }
        Activity activity = (Activity) r221Var.b.get();
        c8o.l(activity);
        kt91 kt91Var = (kt91) r221Var.i.get();
        c8o.l(kt91Var);
        q8n q8nVar = (q8n) r221Var.o.get();
        c8o.l(q8nVar);
        return new qr91(activity, kt91Var, q7r0Var, q8nVar);
    }

    private final Object f() {
        wj3 wj3Var = (wj3) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                tz7 tz7Var = (tz7) ((pa31) wj3Var.b).j.get();
                c8o.l(tz7Var);
                x8c0 lifecycle = ((q7r0) wj3Var.c).d.c.getLifecycle();
                c8o.m(lifecycle);
                return tz7Var.a(lifecycle);
            case 1:
                return u1n0.z((q7r0) wj3Var.c);
            case 2:
                r6h1 r6h1Var = r6h1.c;
                return new j4m0();
            case 3:
                return new noq(this);
            case 4:
                return new ooq(this);
            case 5:
                return new poq();
            case 6:
                return new qoq(this);
            case 7:
                yi31 yi31Var = (yi31) ((pa31) wj3Var.b).k.get();
                c8o.l(yi31Var);
                cxc cxcVar = (cxc) ((pa31) wj3Var.b).e.get();
                c8o.l(cxcVar);
                return new va31(yi31Var, cxcVar);
            case 8:
                return new zhq0((lks0) ((jly0) wj3Var.i).get(), new j650(new b2k(new f32((byte) 0, false), new f32((byte) 2, false), new hhv0(), new f32((byte) 1, false))), (byte) 16).j();
            case 9:
                Context context = (Context) ((pa31) wj3Var.b).m.get();
                c8o.l(context);
                return new lks0(context, new bow());
            case 10:
                return new roq();
            case 11:
                return new soq(this);
            case 12:
                return new toq();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        ip31 ip31Var = (ip31) this.c;
        lh31 lh31Var = (lh31) ip31Var.b;
        byte b = this.b;
        if (b == 0) {
            t8u0 t8u0Var = (t8u0) lh31Var.j.get();
            c8o.l(t8u0Var);
            return kmq0.x((q7r0) ip31Var.c, t8u0Var);
        }
        if (b == 1) {
            return new s1p(this, (byte) 6);
        }
        byte b2 = 5;
        if (b == 2) {
            return new t1p(this, b2);
        }
        if (b == 3) {
            return new u1p(this, (byte) 2);
        }
        if (b == 4) {
            return new v1p(this, b2);
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        lzn0 lzn0Var = (lzn0) lh31Var.e.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) lh31Var.g.get();
        c8o.l(a1r0Var);
        Activity activityA = lh31Var.a();
        c8o.l(activityA);
        return new et90(activityA, lzn0Var, a1r0Var);
    }

    private final Object h() {
        byte b = this.b;
        if (b == 0) {
            return new voq(this);
        }
        if (b == 1) {
            return new woq(this, (byte) 0);
        }
        if (b == 2) {
            return new jyo((byte) 3);
        }
        if (b == 3) {
            return new xoq(this);
        }
        if (b == 4) {
            return new uic((byte) 5);
        }
        jah.e(b);
        return null;
    }

    private final Object i() {
        yoq yoqVar = (yoq) this.c;
        byte b = this.b;
        if (b == 0) {
            gp80 gp80Var = (gp80) yoqVar.b.get();
            xju xjuVar = xju.a;
            return new dn41(gp80Var, 2);
        }
        if (b == 1) {
            Random random = (Random) yoqVar.a.a.get();
            zle1 zle1Var = (zle1) cme1.a.getValue();
            lxg lxgVarA = nxg.a();
            return random.nextFloat() <= 0.1f ? new bqe1(zle1Var, lxgVarA) : new jlb1(zle1Var, lxgVarA);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        yue0 yue0Var = yue0.c;
        if (yue0Var != null) {
            return yue0Var;
        }
        yue0 yue0Var2 = new yue0();
        yue0.c = yue0Var2;
        return yue0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0484  */
    private final Object j() {
        apq apqVar = (apq) this.c;
        byte b = this.b;
        int i = b / 100;
        byte b2 = 3;
        int i2 = 1;
        char c = 1;
        char c2 = 1;
        if (i != 0) {
            if (i != 1) {
                jah.e(b);
                return null;
            }
            switch (b) {
                case 100:
                    return new unp(this, (byte) 1);
                case 101:
                    return (e8r0) apqVar.n.get();
                case 102:
                    y651 y651Var = apqVar.b;
                    cbr0 cbr0Var = (cbr0) apqVar.a1.get();
                    mwn0 mwn0VarX = apqVar.a.x();
                    c8o.l(mwn0VarX);
                    return new w651(new y441(y651Var, cbr0Var, new up41(mwn0VarX, (byte) 3), cwl1.I(apqVar.c)));
                case 103:
                    return rx31.r(apqVar.b, new q1r0(true), new pu00(true));
                case 104:
                    return new cop(this, (byte) 1);
                default:
                    jah.e(b);
                    return null;
            }
        }
        byte b3 = 8;
        byte b4 = 7;
        switch (b) {
            case 0:
                di4 di4VarD = apqVar.d();
                v651 v651Var = apqVar.a;
                p551 p551Var = new p551(new jqd0(di4VarD.a(), apqVar.h(), apqVar.d(), (byte) 17), new m39(new ulc((byte) 23), new pob((byte) 9, false), apqVar.d()), new ij01(apqVar.d(), (byte) 17), new xaz0(apqVar.d(), new ejb((byte) 24)), new o551(apqVar.d(), new ejb((byte) 24)), new xgc(new ejb((byte) 24), (byte) 23), new ks21(new ejb((byte) 24), apqVar.d(), (byte) 8), new mhc(new ejb((byte) 24), (byte) 23), new rpv0(apqVar.d(), new ejb((byte) 24)), new khc(new ejb((byte) 24), (byte) 23), new ubc((byte) 23), new nhc((byte) 23), new lhc((byte) 23), new nbc((byte) 23), new vhc((byte) 23));
                ov41 ov41Var = new ov41(apqVar.d(), new ejb((byte) 24));
                yon yonVar = new yon((Object) apqVar.a(), (Object) new hce1(apqVar.r(), new g2z((String) apqVar.g.get(), (yqg) apqVar.d.get(), apqVar.d(), new pob((byte) 2, false), new o551(apqVar.d()), apqVar.k(), (psc) apqVar.h.get(), apqVar.s()), new vnd1((yqg) apqVar.d.get(), apqVar.d(), (byte) 6), new n0v0((byte) 28), apqVar.s()), apqVar.i.get(), (Object) apqVar.t(), (byte) 6);
                yon yonVar2 = new yon((Object) apqVar.a(), (Object) new ur00(apqVar.r(), new uu0((String) apqVar.g.get(), (yqg) apqVar.d.get(), apqVar.d(), apqVar.d().u(), new lmw(apqVar.d(), (byte) 15), new o551(apqVar.d()), new pob((byte) 2, false), apqVar.k(), (psc) apqVar.h.get()), new w2z((yqg) apqVar.d.get(), apqVar.d(), (byte) 21), new kp00(apqVar.d(), new o551(apqVar.d()), (byte) 14), new n0v0((byte) 28), (byte) 2), apqVar.i.get(), (Object) apqVar.t(), (byte) 5);
                on01 on01VarN0 = v651Var.N0();
                c8o.l(on01VarN0);
                z211 z211VarP = v651Var.P();
                c8o.l(z211VarP);
                k4e0 k4e0Var = new k4e0(on01VarN0, z211VarP, apqVar.d(), apqVar.t(), (byte) 0);
                RxRouter rxRouterP = v651Var.p();
                c8o.l(rxRouterP);
                fwp0 fwp0VarZ = rx31.z(rxRouterP);
                hfb hfbVar = new hfb((byte) 18, false);
                t2b t2bVar = new t2b((byte) 18, false);
                f8b f8bVarE0 = v651Var.E0();
                c8o.l(f8bVarE0);
                uu00 uu00VarA = v651Var.A();
                c8o.l(uu00VarA);
                o4e0 o4e0Var = new o4e0(new rzo0(fwp0VarZ, hfbVar, t2bVar, f8bVarE0, new nw41(uu00VarA)), (byte) 13);
                on01 on01VarN1 = v651Var.N0();
                c8o.l(on01VarN1);
                cz1 cz1Var = new cz1(on01VarN1, (byte) 0);
                o751 o751VarU = apqVar.u();
                q8n q8nVarL0 = v651Var.l0();
                c8o.l(q8nVarL0);
                phi0 phi0Var = new phi0(o751VarU, q8nVarL0);
                on01 on01VarN2 = v651Var.N0();
                c8o.l(on01VarN2);
                cz1 cz1Var2 = new cz1(on01VarN2, (byte) 2);
                on01 on01VarN3 = v651Var.N0();
                c8o.l(on01VarN3);
                cz1 cz1Var3 = new cz1(on01VarN3, (byte) 4);
                on01 on01VarN4 = v651Var.N0();
                c8o.l(on01VarN4);
                cz1 cz1Var4 = new cz1(on01VarN4, (byte) 3);
                o4e0 o4e0Var2 = new o4e0(apqVar.h(), (byte) 12);
                ew41 ew41VarO0 = v651Var.O0();
                c8o.l(ew41VarO0);
                bk1 bk1Var = new bk1(ew41VarO0, (byte) 7);
                aas aasVarU0 = v651Var.U0();
                c8o.l(aasVarU0);
                b7r0 b7r0VarQ0 = v651Var.Q0();
                c8o.l(b7r0VarQ0);
                qn1 qn1Var = new qn1(aasVarU0, b7r0VarQ0, (byte) 0);
                oj3 oj3VarM = v651Var.M();
                c8o.l(oj3VarM);
                bk1 bk1Var2 = new bk1(oj3VarM, (byte) 1);
                yon yonVar3 = new yon((Object) apqVar.a(), (Object) apqVar.f(), apqVar.i.get(), (Object) apqVar.t(), (byte) 4);
                so soVar = new so(apqVar.f(), (t5h1) apqVar.i.get(), (byte) 11);
                yon yonVar4 = new yon((Object) apqVar.a(), (Object) new ix7(apqVar.r(), new p39((String) apqVar.g.get(), apqVar.d(), apqVar.d().u(), new m39(apqVar.d()), apqVar.k(), (psc) apqVar.h.get(), apqVar.s()), new mre0((yqg) apqVar.d.get(), (byte) 15), (byte) 16), apqVar.i.get(), (Object) apqVar.t(), (byte) 3);
                z211 z211VarP2 = v651Var.P();
                c8o.l(z211VarP2);
                ly41 ly41Var = new ly41(yonVar, yonVar2, k4e0Var, o4e0Var, cz1Var, phi0Var, cz1Var2, cz1Var3, cz1Var4, o4e0Var2, bk1Var, qn1Var, bk1Var2, yonVar3, soVar, yonVar4, new g2x0(z211VarP2, apqVar.t(), (byte) 4), new od30((psc) apqVar.h.get(), (byte) 21));
                z141 z141VarC = v651Var.C();
                c8o.l(z141VarC);
                Observable observable = (Observable) apqVar.q.get();
                Flowable flowableF = v651Var.f();
                c8o.l(flowableF);
                zr00 zr00VarL = v651Var.L();
                c8o.l(zr00VarL);
                yh2 yh2VarW = v651Var.w();
                c8o.l(yh2VarW);
                o241 o241VarI = v651Var.i();
                c8o.l(o241VarI);
                y441 y441Var = new y441(z141VarC, observable, flowableF, new g931(zr00VarL, yh2VarW, o241VarI, (byte) 7));
                Resources resourcesR = v651Var.r();
                c8o.l(resourcesR);
                up41 up41Var = new up41(new l1e(resourcesR), (byte) 2);
                c351 c351Var = new c351(apqVar.w(), apqVar.i(), new n0v0((tb51) apqVar.r.get(), (byte) 5), new bm00((tb51) apqVar.r.get(), (byte) 9), new gl6((tb51) apqVar.r.get()), apqVar.c(), apqVar.n(), apqVar.e(), new ln8((tb51) apqVar.r.get()), new scx0((tb51) apqVar.r.get()), apqVar.g(), new ltf1((tb51) apqVar.r.get(), (byte) 10), new v6a0((tb51) apqVar.r.get(), apqVar.d(), (byte) 2), apqVar.o(), apqVar.d());
                m39 m39Var = new m39(apqVar.d());
                c681 c681Var = new c681((tb51) apqVar.r.get(), (byte) 23);
                x6o0 x6o0Var = new x6o0((tb51) apqVar.r.get(), (byte) 25);
                scx0 scx0Var = new scx0((tb51) apqVar.r.get());
                gl6 gl6Var = new gl6((tb51) apqVar.r.get());
                tb51 tb51Var = (tb51) apqVar.r.get();
                fza1 fza1VarJ = v651Var.J();
                c8o.l(fza1VarJ);
                sjq0 sjq0Var = new sjq0(tb51Var, fza1VarJ, (byte) 29);
                n63 n63Var = new n63((tb51) apqVar.r.get(), (o5r) apqVar.t.get());
                ggv ggvVarF0 = v651Var.F0();
                c8o.l(ggvVarF0);
                o5r o5rVar = (o5r) apqVar.t.get();
                Resources resourcesR2 = v651Var.r();
                c8o.l(resourcesR2);
                w29 w29Var = new w29(c681Var, x6o0Var, scx0Var, gl6Var, sjq0Var, n63Var, new uny(ggvVarF0, o5rVar, resourcesR2, (byte) 8), new cp5((tb51) apqVar.r.get(), (byte) 25), new bb01((tb51) apqVar.r.get(), (byte) 26), new gl6((tb51) apqVar.r.get()), new dgb((byte) 27), apqVar.d(), new twa(), new ye90((tb51) apqVar.r.get(), apqVar.d(), (byte) 7), apqVar.o(), apqVar.g(), (byte) 1);
                ov41 ov41Var2 = new ov41(apqVar.d());
                n63 n63VarC = apqVar.c();
                gl6 gl6Var2 = new gl6((tb51) apqVar.r.get());
                zwg zwgVarE = apqVar.e();
                scx0 scx0Var2 = new scx0((tb51) apqVar.r.get());
                yzu yzuVarI = apqVar.i();
                bm00 bm00Var = new bm00((tb51) apqVar.r.get(), (byte) 9);
                yeu0 yeu0VarN = apqVar.n();
                n0v0 n0v0Var = new n0v0((tb51) apqVar.r.get(), (byte) 5);
                ezb1 ezb1VarW = apqVar.w();
                zgz0 zgz0Var = new zgz0((tb51) apqVar.r.get(), (byte) 3);
                g931 g931VarV = apqVar.v();
                ln8 ln8Var = new ln8((tb51) apqVar.r.get());
                Resources resourcesR3 = v651Var.r();
                c8o.l(resourcesR3);
                sd51 sd51Var = new sd51(n63VarC, gl6Var2, zwgVarE, scx0Var2, yzuVarI, bm00Var, yeu0VarN, n0v0Var, ezb1VarW, zgz0Var, g931VarV, ln8Var, new vx40(resourcesR3, (tb51) apqVar.r.get(), (byte) 9), apqVar.g(), new ltf1((tb51) apqVar.r.get(), (byte) 10), new v6a0((tb51) apqVar.r.get(), apqVar.d(), (byte) 2), apqVar.o(), apqVar.d());
                Resources resourcesR4 = v651Var.r();
                c8o.l(resourcesR4);
                xaz0 xaz0Var = new xaz0(resourcesR4, (byte) 20);
                Resources resourcesR5 = v651Var.r();
                c8o.l(resourcesR5);
                yrg0 yrg0Var = new yrg0(new s880(up41Var, c351Var, m39Var, w29Var, ov41Var2, sd51Var, xaz0Var, new cqp0(resourcesR5, apqVar.d())), new sjb((byte) 18), new pob((byte) 2, false));
                jb51 jb51VarS0 = v651Var.s0();
                c8o.l(jb51VarS0);
                y651 y651Var2 = apqVar.b;
                y451 y451Var = new y451(xqu.a(apqVar.u));
                hc51 hc51VarA0 = v651Var.a0();
                c8o.l(hc51VarA0);
                y751 y751Var = (y751) apqVar.v.get();
                sco0 sco0VarI = v651Var.I();
                c8o.l(sco0VarI);
                iac0 iac0VarM = rx31.m(apqVar.c);
                Scheduler schedulerP0 = v651Var.p0();
                c8o.l(schedulerP0);
                return new c751(p551Var, ov41Var, ly41Var, y441Var, yrg0Var, jb51VarS0, y651Var2, y451Var, hc51VarA0, y751Var, sco0VarI, iac0VarM, schedulerP0);
            case 1:
                yqg yqgVarA = apqVar.a.a();
                c8o.l(yqgVarA);
                return yqgVarA;
            case 2:
                iac0 iac0VarM2 = rx31.m(apqVar.c);
                vku vkuVar = new vku();
                iac0VarM2.getLifecycle().a(new wku(vkuVar));
                return vkuVar;
            case 3:
                RetrofitMaker retrofitMakerN = apqVar.a.n();
                c8o.l(retrofitMakerN);
                return rx31.A(retrofitMakerN, apqVar.d());
            case 4:
                return upn1.m();
            case 5:
                xvo xvoVarS0 = apqVar.a.S0();
                c8o.l(xvoVarS0);
                qsc qscVarH = apqVar.a.H();
                c8o.l(qscVarH);
                return new psc(xvoVarS0, qscVarH);
            case 6:
                return new t5h1();
            case 7:
                return ((cyp) apqVar.j.get()).d();
            case 8:
                t8u0 t8u0VarB1 = apqVar.a.b1();
                c8o.l(t8u0VarB1);
                return t8u0VarB1.a(apqVar.c.d.c.getLifecycle());
            case 9:
                return ((cyp) apqVar.j.get()).a();
            case 10:
                gn10 gn10Var = mno1.e0;
                v651 v651Var2 = apqVar.a;
                q7r0 q7r0Var = apqVar.c;
                String strJ0 = v651Var2.j0();
                c8o.l(strJ0);
                return d8.b(gn10Var, strJ0, d8.c(new c4n0(q7r0Var)), u1n0.l(q7r0Var));
            case 11:
                return (e8r0) apqVar.n.get();
            case 12:
                return new e8r0();
            case 13:
                xrc0 xrc0VarL = apqVar.a.l();
                c8o.l(xrc0VarL);
                return xrc0VarL;
            case 14:
                v651 v651Var3 = apqVar.a;
                Activity activityS = v651Var3.s();
                c8o.l(activityS);
                float f = activityS.getResources().getDisplayMetrics().density;
                if (f <= 0.0f) {
                    i2 = 20;
                } else {
                    btl1.a.getClass();
                    float fHeight = gtv0.h().a(activityS).a().height() / f;
                    if (Math.abs(fHeight) > Float.MAX_VALUE || fHeight <= 0.0f) {
                        i2 = 20;
                    } else {
                        int iCeil = (int) Math.ceil(fHeight / 54.0f);
                        if (iCeil >= 1) {
                            i2 = iCeil;
                        }
                    }
                }
                o241 o241VarI2 = v651Var3.i();
                c8o.l(o241VarI2);
                rh11 rh11VarD0 = v651Var3.d0();
                c8o.l(rh11VarD0);
                return rx31.y(i2, o241VarI2, rh11VarD0);
            case 15:
                Activity activityS2 = apqVar.a.s();
                c8o.l(activityS2);
                di4 di4VarD2 = apqVar.d();
                rxj0 rxj0VarF = apqVar.a.F();
                c8o.l(rxj0VarF);
                return new tb51(activityS2, di4VarD2, rxj0VarF);
            case 16:
                return new o5r((Locale) apqVar.s.get());
            case 17:
                return Locale.getDefault();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                g651 g651VarQ0 = apqVar.a.q0();
                c8o.l(g651VarQ0);
                return g651VarQ0;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new y751();
            case 20:
                return new zoq(this);
            case 21:
                return new bop(this, (byte) 1);
            case 22:
                return new dop(this, (byte) 1);
            case 23:
                return new eop(this, (byte) 1);
            case 24:
                return new gop((byte) 1);
            case 25:
                return new znp(this, (byte) 1);
            case 26:
                return new iop(this, (byte) 1);
            case 27:
                xfx xfxVarC0 = apqVar.a.c0();
                c8o.l(xfxVarC0);
                return new j6x(new pfx(xfxVarC0.d, (byte) 2), new urk0((byte) 4));
            case 28:
                return new jop(this, (byte) 1);
            case 29:
                return new qlp(this, (byte) 1);
            case 30:
                return new rlp(this, c == true ? 1 : 0);
            case 31:
                return new slp(this, (byte) 1);
            case 32:
                return new tlp(this, (byte) 1);
            case 33:
                return new ulp(this, (byte) 1);
            case 34:
                return new vlp(this, (byte) 1);
            case 35:
                return new wlp(this, (byte) 1);
            case 36:
                return new xlp(this, (byte) 1);
            case 37:
                return new ylp(this, (byte) 1);
            case 38:
                return new zlp(this, (byte) 1);
            case 39:
                return new bmp(this, (byte) 1);
            case 40:
                return new cmp(this, (byte) 1);
            case 41:
                return new dmp(this, (byte) 1);
            case 42:
                return new emp(this, (byte) 1);
            case 43:
                return new fmp(this, (byte) 1);
            case 44:
                return new gmp(this, (byte) 1);
            case 45:
                return new hmp(this, (byte) 1);
            case 46:
                return new imp(this, (byte) 1);
            case 47:
                return new jmp(this, (byte) 1);
            case 48:
                return new kmp(this, (byte) 1);
            case 49:
                return new mmp(this, (byte) 1);
            case 50:
                return new nmp(this, (byte) 1);
            case 51:
                return new omp(this, (byte) 1);
            case 52:
                return new pmp(this, (byte) 1);
            case 53:
                return new qmp(this, (byte) 1);
            case 54:
                return new rmp(this, (byte) 1);
            case 55:
                return new smp(this, (byte) 1);
            case 56:
                return new tmp(this, (byte) 1);
            case 57:
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                yfx yfxVar = new yfx(xfxVarC1.e, (byte) 1);
                Resources resourcesR6 = apqVar.a.r();
                c8o.l(resourcesR6);
                return new z331(yfxVar, resourcesR6);
            case 58:
                return new ump(this, (byte) 1);
            case 59:
                return new vmp(this, (byte) 1);
            case 60:
                return new xmp(this, (byte) 2);
            case 61:
                return new e9p(this, b2);
            case 62:
                nwt nwtVarX = apqVar.a.X();
                c8o.l(nwtVarX);
                return nwtVarX;
            case 63:
                mr20 mr20VarU = apqVar.a.u();
                c8o.l(mr20VarU);
                c3s c3sVarB = apqVar.a.B();
                c8o.l(c3sVarB);
                return new clm(mr20VarU, c3sVarB);
            case 64:
                ykq ykqVar = apqVar.k;
                q7r0 q7r0Var2 = apqVar.c;
                v651 v651Var4 = apqVar.a;
                ynb0 ynb0VarA = xqu.a(ykqVar);
                ykq ykqVar2 = apqVar.m;
                ynb0 ynb0VarA2 = xqu.a(apqVar.l);
                h5q h5qVarX0 = v651Var4.X0();
                c8o.l(h5qVarX0);
                b7r0 b7r0VarQ1 = v651Var4.Q0();
                c8o.l(b7r0VarQ1);
                ynb0 ynb0VarA3 = xqu.a(apqVar.p);
                ynb0 ynb0VarA4 = xqu.a(apqVar.l0);
                ov20 ov20VarQ = v651Var4.q();
                c8o.l(ov20VarQ);
                yqg yqgVar = (yqg) apqVar.d.get();
                iac0 iac0VarM3 = rx31.m(q7r0Var2);
                n3d0 n3d0VarC0 = v651Var4.C0();
                c8o.l(n3d0VarC0);
                String strM = apqVar.m();
                lik1 lik1VarC = d8.c(new c4n0(q7r0Var2));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                bn70 bn70Var = new bn70(yon1.U4(), lik1VarC, (nar0) null);
                g3q0 g3q0VarV0 = v651Var4.V0();
                c8o.l(g3q0VarV0);
                upp0 upp0VarT = v651Var4.t();
                c8o.l(upp0VarT);
                return bhb.o(ynb0VarA, ykqVar2, ynb0VarA2, h5qVarX0, b7r0VarQ1, ynb0VarA3, ynb0VarA4, ov20VarQ, yqgVar, iac0VarM3, n3d0VarC0, strM, bn70Var, g3q0VarV0, upp0VarT, Optional.empty(), Optional.empty());
            case 65:
                zut0 zut0VarW0 = apqVar.a.W0();
                c8o.l(zut0VarW0);
                return zut0VarW0.a(new lb3(xqu.a(apqVar.j), (byte) 7), xqu.a(apqVar.m));
            case 66:
                return new nyo(this, b4);
            case 67:
                ugn0 ugn0VarR0 = apqVar.a.r0();
                c8o.l(ugn0VarR0);
                return ugn0VarR0;
            case 68:
                return null;
            case 69:
                return new oyo(this, b3);
            case 70:
                return (ku71) xqu.a(apqVar.p0).get();
            case 71:
                dma1 dma1VarO = apqVar.a.O();
                c8o.l(dma1VarO);
                nfa0 nfa0VarY0 = apqVar.a.Y0();
                c8o.l(nfa0VarY0);
                return new ku71(dma1VarO, nfa0VarY0, new du71());
            case 72:
                return new hfw0(u1n0.z(apqVar.c));
            case 73:
                q8n q8nVarE = apqVar.a.e();
                c8o.l(q8nVarE);
                return new nfw0(q8nVarE, apqVar.d, apqVar.n0, apqVar.j0, apqVar.k0, apqVar.o0, apqVar.l, apqVar.s0, apqVar.r0);
            case 74:
                v651 v651Var5 = apqVar.a;
                return new luj(v651Var5.c0(), v651Var5.b(), v651Var5.m(), v651Var5.c(), false);
            case 75:
                return new ymp(this, (byte) 2);
            case 76:
                osm0 osm0Var = (osm0) apqVar.z0.get();
                iac0 iac0VarM4 = rx31.m(apqVar.c);
                b7r0 b7r0VarQ2 = apqVar.a.Q0();
                c8o.l(b7r0VarQ2);
                esm0 esm0Var = new esm0("search", new l451(b7r0VarQ2, (byte) 2));
                p811 p811Var = new p811();
                iac0VarM4.getLifecycle().a(new kwf(p811Var, osm0Var, esm0Var, (byte) 2));
                return new v1r0(new mn41(osm0Var, (byte) 8), new ldz0(osm0Var, (byte) 21), new l5v0(p811Var, (byte) 12));
            case 77:
                msm0 msm0VarV = apqVar.a.v();
                c8o.l(msm0VarV);
                return msm0VarV.a(new fz3((byte) 3));
            case 78:
                lko lkoVarG = apqVar.a.G();
                c8o.l(lkoVarG);
                return new sw41(lkoVarG, apqVar.m(), rx31.m(apqVar.c));
            case 79:
                return new l9e0();
            case 80:
                return new zmp(this, (byte) 1);
            case 81:
                return new anp(this, (byte) 1);
            case 82:
                return new bnp(this, (byte) 1);
            case 83:
                return new cnp(this, (byte) 1);
            case 84:
                return new dnp(this, (byte) 1);
            case 85:
                return new fnp(c2 == true ? 1 : 0);
            case 86:
                return new gnp(this, (byte) 1);
            case 87:
                return new hnp(this, (byte) 1);
            case 88:
                return new inp(this, (byte) 1);
            case 89:
                return new jnp((byte) 1);
            case 90:
                return new knp(this, (byte) 1);
            case 91:
                q8n q8nVarS = apqVar.a.S();
                c8o.l(q8nVarS);
                sd41 sd41VarO0 = apqVar.a.o0();
                c8o.l(sd41VarO0);
                return new aod0(q8nVarS, sd41VarO0);
            case 92:
                return new lnp(this, (byte) 1);
            case 93:
                return new mnp((byte) 1);
            case 94:
                return new nnp((byte) 1);
            case 95:
                return new onp((byte) 1);
            case 96:
                return new qnp(this, (byte) 1);
            case 97:
                return new rnp((byte) 1);
            case 98:
                return new snp((byte) 1);
            case 99:
                return new tnp(this, (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object k() {
        byp bypVar = (byp) this.c;
        qop qopVar = (qop) bypVar.d;
        jbt jbtVar = (jbt) bypVar.b;
        k3q k3qVar = (k3q) bypVar.c;
        byte b = this.b;
        if (b == 0) {
            return new ngs0(jbtVar.b);
        }
        if (b == 1) {
            return qopVar.f();
        }
        if (b == 2) {
            d0r d0rVar = jbtVar.b;
            u9c0 u9c0VarL = bypVar.l();
            g931 g931VarD = bypVar.D();
            String strD = qopVar.d();
            iyc0 iyc0Var = (iyc0) k3qVar.b.g1.get();
            c8o.l(iyc0Var);
            return new z521(d0rVar, u9c0VarL, g931VarD, strD, iyc0Var, jbtVar.d, (ykq) bypVar.g);
        }
        if (b == 3) {
            ymu0 ymu0Var = (ymu0) k3qVar.b.h8.get();
            c8o.l(ymu0Var);
            return ymu0Var;
        }
        if (b != 4) {
            if (b == 5) {
                return new cpq(this);
            }
            jah.e(b);
            return null;
        }
        d0r d0rVar2 = jbtVar.b;
        u9c0 u9c0VarL2 = bypVar.l();
        g931 g931VarD2 = bypVar.D();
        aas aasVar = (aas) k3qVar.b.z4.get();
        c8o.l(aasVar);
        waz0 waz0Var = (waz0) k3qVar.a.Kc.get();
        c8o.l(waz0Var);
        b7r0 b7r0Var = (b7r0) k3qVar.a.p7.get();
        c8o.l(b7r0Var);
        return new un1(d0rVar2, u9c0VarL2, g931VarD2, aasVar, waz0Var, b7r0Var);
    }

    private final Object l() {
        byte b = this.b;
        switch (b) {
            case 0:
                return new dpq(this, (byte) 0);
            case 1:
                j7h1 j7h1Var = new j7h1();
                j7h1Var.a = otl0.d;
                return j7h1Var;
            case 2:
                return new epq(this, (byte) 0);
            case 3:
                return new wx70();
            case 4:
                return new zde1();
            case 5:
                return new fpq((byte) 0);
            case 6:
                return new wce1();
            case 7:
                return new ede1();
            case 8:
                return new gpq(this, (byte) 0);
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        j23 rvx0Var;
        agu0 lkw0Var;
        byte b = this.a;
        Object obj = this.c;
        byte b2 = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                ezo ezoVar = (ezo) obj;
                switch (b2) {
                    case 0:
                        return new pkq(this);
                    case 1:
                        return new qkq(this);
                    case 2:
                        return new rkq();
                    case 3:
                        return new skq(this);
                    case 4:
                        q7r0 q7r0Var = ezoVar.a;
                        q7r0 q7r0Var2 = ezoVar.a;
                        lik1 lik1Var = cwl1.D(q7r0Var.d.b()).b;
                        c8o.m(lik1Var);
                        n6r0 n6r0Var = cwl1.D(q7r0Var2.d.b()).a;
                        c8o.m(n6r0Var);
                        return new mtx0(lik1Var, n6r0Var, u1n0.z(q7r0Var2));
                    case 5:
                        return new tkq();
                    case 6:
                        return new ukq(this);
                    case 7:
                        return new vkq(this);
                    case 8:
                        return new wkq(this);
                    case 9:
                        return new PublishSubject();
                    case 10:
                        qfl1 qfl1VarI = ezoVar.i();
                        Activity activity = (Activity) ((gux0) ezoVar.v).c.a;
                        c8o.l(activity);
                        return new q6u(qfl1VarI, new nw40(activity), (mtx0) ezoVar.c.get());
                    case 11:
                        q7r0 q7r0Var3 = ezoVar.a;
                        gux0 gux0Var = (gux0) ezoVar.v;
                        lik1 lik1Var2 = cwl1.D(q7r0Var3.d.b()).b;
                        c8o.m(lik1Var2);
                        lzn0 lzn0Var = (lzn0) gux0Var.d.get();
                        c8o.l(lzn0Var);
                        sjw0 sjw0Var = (sjw0) ezoVar.l.get();
                        n6r0 n6r0Var2 = cwl1.D(ezoVar.a.d.b()).a;
                        c8o.m(n6r0Var2);
                        mka mkaVar = new mka((byte) 20);
                        lzn0 lzn0Var2 = (lzn0) gux0Var.d.get();
                        c8o.l(lzn0Var2);
                        i6c i6cVar = new i6c(lzn0Var2, new jma((byte) 23));
                        ppv ppvVar = (ppv) gux0Var.y.get();
                        c8o.l(ppvVar);
                        qlm0 qlm0Var = (qlm0) gux0Var.x.get();
                        c8o.l(qlm0Var);
                        q6u q6uVar = (q6u) ezoVar.j.get();
                        mtx0 mtx0Var = (mtx0) ezoVar.c.get();
                        th30 th30Var = (th30) gux0Var.m.get();
                        c8o.l(th30Var);
                        rvx0Var = new rvx0(lik1Var2, lzn0Var, sjw0Var, n6r0Var2, mkaVar, i6cVar, ppvVar, qlm0Var, q6uVar, new ham(mtx0Var, th30Var, (byte) 11));
                        return rvx0Var;
                    case 12:
                        q7r0 q7r0Var4 = ezoVar.a;
                        gux0 gux0Var2 = (gux0) ezoVar.v;
                        iac0 iac0Var = q7r0Var4.d.c;
                        c8o.m(iac0Var);
                        t8u0 t8u0Var = (t8u0) gux0Var2.z.get();
                        c8o.l(t8u0Var);
                        dg30 dg30Var = (dg30) gux0Var2.o.a;
                        c8o.l(dg30Var);
                        tac0 tac0Var = ((f0i) dg30Var).a;
                        c8o.m(tac0Var);
                        ruz ruzVarA = t8u0Var.a(tac0Var).a();
                        jp00 jp00Var = (jp00) gux0Var2.p.get();
                        c8o.l(jp00Var);
                        Context context = (Context) gux0Var2.b.a;
                        c8o.l(context);
                        ww81 ww81VarA = tjw0.a(jp00Var, context);
                        Context context2 = (Context) gux0Var2.b.a;
                        c8o.l(context2);
                        iir iirVar = new iir(context2);
                        Flowable flowable = (Flowable) gux0Var2.n.get();
                        c8o.l(flowable);
                        o241 o241Var = (o241) gux0Var2.k.get();
                        c8o.l(o241Var);
                        Scheduler scheduler = (Scheduler) gux0Var2.u.get();
                        c8o.l(scheduler);
                        mw7 mw7Var = (mw7) gux0Var2.r.get();
                        c8o.l(mw7Var);
                        yqg yqgVar = (yqg) gux0Var2.a.get();
                        c8o.l(yqgVar);
                        t2j0 t2j0Var = (t2j0) gux0Var2.B.get();
                        c8o.l(t2j0Var);
                        lkw0Var = new lkw0(iac0Var, ruzVarA, ww81VarA, iirVar, flowable, o241Var, scheduler, mw7Var, yqgVar, new hlr(t2j0Var));
                        return lkw0Var;
                    case 13:
                        return new xkq(this);
                    case 14:
                        return new kkq(this);
                    case 15:
                        return new lkq(this);
                    case 16:
                        return new mkq(this);
                    case 17:
                        gux0 gux0Var3 = (gux0) ezoVar.v;
                        gux0 gux0Var4 = (gux0) ezoVar.v;
                        RetrofitMaker retrofitMakerA = gux0Var3.a();
                        c8o.l(retrofitMakerA);
                        r23 r23VarE = q03.e(retrofitMakerA);
                        RetrofitMaker retrofitMakerA2 = gux0Var4.a();
                        c8o.l(retrofitMakerA2);
                        x13 x13VarD = q03.d(retrofitMakerA2);
                        ueg uegVar = (ueg) gux0Var4.D.get();
                        c8o.l(uegVar);
                        sjb sjbVar = new sjb((byte) 16);
                        ejb ejbVar = new ejb((byte) 16);
                        lmy0 lmy0Var = (lmy0) gux0Var4.f.get();
                        c8o.l(lmy0Var);
                        Scheduler scheduler2 = (Scheduler) gux0Var4.A.get();
                        c8o.l(scheduler2);
                        rvx0Var = new j23(r23VarE, x13VarD, uegVar, sjbVar, ejbVar, lmy0Var, scheduler2);
                        return rvx0Var;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        gux0 gux0Var5 = (gux0) ezoVar.v;
                        gux0 gux0Var6 = (gux0) ezoVar.v;
                        RetrofitMaker retrofitMakerA3 = gux0Var5.a();
                        c8o.l(retrofitMakerA3);
                        hrh1 hrh1VarC = x5h1.C(retrofitMakerA3);
                        RetrofitMaker retrofitMakerA4 = gux0Var6.a();
                        c8o.l(retrofitMakerA4);
                        efe efeVarX = mid.x(retrofitMakerA4);
                        RetrofitMaker retrofitMakerA5 = gux0Var6.a();
                        c8o.l(retrofitMakerA5);
                        mev mevVar = new mev(retrofitMakerA5, (byte) 25);
                        kiu0 kiu0Var = (kiu0) gux0Var6.t.get();
                        c8o.l(kiu0Var);
                        RetrofitMaker retrofitMakerA6 = gux0Var6.a();
                        c8o.l(retrofitMakerA6);
                        lkw0Var = new agu0(hrh1VarC, efeVarX, mevVar, kiu0Var, new vgq0(s2.e(retrofitMakerA6), (byte) 11));
                        return lkw0Var;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return new PublishSubject();
                    case 20:
                        return new PublishSubject();
                    case 21:
                        return new PublishSubject();
                    case 22:
                        return new nkq(this);
                    case 23:
                        return new nf61((PublishSubject) ezoVar.h.get());
                    case 24:
                        luk lukVar = (luk) ((gux0) ezoVar.v).s.get();
                        c8o.l(lukVar);
                        return new jh4(lukVar);
                    case 25:
                        return new PublishSubject();
                    case 26:
                        return new PublishSubject();
                    case 27:
                        return new PublishSubject();
                    case 28:
                        return new okq(this);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                uy2 uy2Var = ((dlq) obj).a;
                if (b2 == 0) {
                    Context context3 = (Context) uy2Var.a.get();
                    xa20 xa20Var = new xa20((nfa0) uy2Var.b.get());
                    bn31 bn31VarT = u890.t(context3, FilterMetadataDatabase.class, "puffin_filter_metadata_database");
                    bn31VarT.b(xa20Var);
                    bn31VarT.d();
                    return bn31VarT.c();
                }
                if (b2 == 1) {
                    bn31 bn31VarT2 = u890.t((Context) uy2Var.a.get(), HeadphoneFilterStateDatabase.class, "puffin_headphone_filter_state_database");
                    bn31VarT2.d();
                    return bn31VarT2.c();
                }
                if (b2 == 2) {
                    return new nfb0();
                }
                if (b2 == 3) {
                    return new mfb0();
                }
                if (b2 == 4) {
                    return new eqy0((dma1) uy2Var.c.get());
                }
                jah.e(b2);
                return null;
            case 2:
                pbq pbqVar = (pbq) obj;
                dlq dlqVar = (dlq) pbqVar.b;
                i7d i7dVar = (i7d) pbqVar.f;
                switch (b2) {
                    case 0:
                        d6u d6uVar = (d6u) ((ykq) pbqVar.g).get();
                        gfr gfrVarX = pbqVar.X();
                        g0l g0lVar = (g0l) i7dVar.e;
                        c8o.l(g0lVar);
                        eqy0 eqy0Var = (eqy0) dlqVar.f.get();
                        c8o.l(eqy0Var);
                        na naVar = new na(g0lVar, eqy0Var, (byte) 14);
                        dma1 dma1Var = (dma1) i7dVar.g;
                        c8o.l(dma1Var);
                        gfr gfrVar = new gfr(gfrVarX, naVar, new iov0(dma1Var), (byte) 9);
                        hce1 hce1VarA0 = pbqVar.A0();
                        Flowable flowable2 = (Flowable) i7dVar.O0;
                        c8o.l(flowable2);
                        eip0 eip0Var = new eip0(flowable2, (byte) 0);
                        mfb0 mfb0Var = (mfb0) dlqVar.e.get();
                        c8o.l(mfb0Var);
                        dma1 dma1Var2 = (dma1) i7dVar.g;
                        c8o.l(dma1Var2);
                        vip0 vip0Var = new vip0(hce1VarA0, eip0Var, mfb0Var, new gqb0(new o2b1(dma1Var2, (byte) 18), (byte) 7));
                        p5 p5Var = new p5(new vgq0((g420) dlqVar.a.d.get(), (byte) 25));
                        jkp0 jkp0VarE0 = pbqVar.e0();
                        nfb0 nfb0Var = (nfb0) dlqVar.d.get();
                        c8o.l(nfb0Var);
                        p5 p5Var2 = new p5(pbqVar.e0(), (byte) 22);
                        e6u e6uVar = new e6u(pbqVar.e0(), (byte) 2);
                        dma1 dma1Var3 = (dma1) i7dVar.g;
                        c8o.l(dma1Var3);
                        ffr ffrVar = new ffr(p5Var, new gk61(jkp0VarE0, nfb0Var, p5Var2, e6uVar, new p8o(dma1Var3)), new iwu(pbqVar.G(), (byte) 1), new b69((byte) 13));
                        t2j0 t2j0Var2 = (t2j0) i7dVar.P0;
                        c8o.l(t2j0Var2);
                        Flowable flowable3 = (Flowable) i7dVar.O0;
                        c8o.l(flowable3);
                        return new fk61(d6uVar, gfrVar, vip0Var, ffrVar, new g7t(t2j0Var2, flowable3, pbqVar.G()));
                    case 1:
                        return new d6u(pbqVar.e0());
                    case 2:
                        return new rr50(new e6u(pbqVar.e0(), (byte) 3), new e6u(pbqVar.e0(), (byte) 0));
                    case 3:
                        luk lukVar2 = (luk) i7dVar.a;
                        c8o.l(lukVar2);
                        hz4 hz4Var = new hz4(0, lukVar2);
                        dma1 dma1Var4 = (dma1) i7dVar.h;
                        c8o.l(dma1Var4);
                        xfb0 xfb0Var = new xfb0(dma1Var4);
                        Context context4 = (Context) i7dVar.c;
                        c8o.l(context4);
                        return new cm41(hz4Var, xfb0Var, new uf0(context4.getApplicationContext()));
                    case 4:
                        gfr gfrVarX2 = pbqVar.X();
                        hce1 hce1VarA1 = pbqVar.A0();
                        hce1 hce1VarA2 = pbqVar.A0();
                        gfr gfrVarX3 = pbqVar.X();
                        g0l g0lVar2 = (g0l) i7dVar.e;
                        c8o.l(g0lVar2);
                        eqy0 eqy0Var2 = (eqy0) dlqVar.f.get();
                        c8o.l(eqy0Var2);
                        na naVar2 = new na(g0lVar2, eqy0Var2, (byte) 14);
                        dma1 dma1Var5 = (dma1) i7dVar.g;
                        c8o.l(dma1Var5);
                        ffr ffrVar2 = new ffr(hce1VarA2, new x5u(new gfr(gfrVarX3, naVar2, new iov0(dma1Var5), (byte) 9), (byte) 6), new q5((byte) 21), (byte) 4);
                        dma1 dma1Var6 = (dma1) i7dVar.g;
                        c8o.l(dma1Var6);
                        return new g6u(gfrVarX2, hce1VarA1, ffrVar2, new iov0(dma1Var6));
                    case 5:
                        e6u e6uVar2 = new e6u(pbqVar.e0(), (byte) 3);
                        nfb0 nfb0Var2 = (nfb0) dlqVar.d.get();
                        c8o.l(nfb0Var2);
                        return new zmc1(e6uVar2, nfb0Var2);
                    case 6:
                        jkp0 jkp0VarE1 = pbqVar.e0();
                        mfb0 mfb0Var2 = (mfb0) dlqVar.e.get();
                        c8o.l(mfb0Var2);
                        return new anc1(jkp0VarE1, mfb0Var2);
                    case 7:
                        RetrofitMaker retrofitMaker = (RetrofitMaker) i7dVar.d;
                        c8o.l(retrofitMaker);
                        ssy0 ssy0Var = (ssy0) retrofitMaker.createWebgateService(ssy0.class, "android-headphone-enhancements-cross-device-syncing");
                        luk lukVar3 = (luk) i7dVar.a;
                        c8o.l(lukVar3);
                        qpy0 qpy0Var = new qpy0(false, lukVar3);
                        o241 o241Var2 = (o241) i7dVar.Z;
                        c8o.l(o241Var2);
                        ofd ofdVar = new ofd(o241Var2, (byte) 3);
                        jkp0 jkp0VarE2 = pbqVar.e0();
                        ek1 ek1Var = new ek1(new iwu(pbqVar.G(), (byte) 0), pbqVar.A0(), (byte) 13);
                        dma1 dma1Var7 = (dma1) i7dVar.h;
                        c8o.l(dma1Var7);
                        p8o p8oVar = new p8o(dma1Var7);
                        t2j0 t2j0Var3 = (t2j0) i7dVar.P0;
                        c8o.l(t2j0Var3);
                        return new icd1(ssy0Var, qpy0Var, ofdVar, jkp0VarE2, ek1Var, p8oVar, new jqb0(t2j0Var3, (byte) 23));
                    default:
                        jah.e(b2);
                        return null;
                }
            case 3:
                tnm tnmVar = (tnm) obj;
                q7r0 q7r0Var5 = (q7r0) tnmVar.e;
                if (b2 == 0) {
                    return new i4z0((m4z0) tnmVar.b, (tso) tnmVar.c, (eg40) ((lct) tnmVar.d).a.get(), new hyy0((ykq) tnmVar.f), (c9n) ((jly0) tnmVar.g).get());
                }
                if (b2 == 1) {
                    return u1n0.z(q7r0Var5);
                }
                if (b2 == 2) {
                    return cto1.q(q7r0Var5.d.c);
                }
                jah.e(b2);
                return null;
            case 4:
                uw0 uw0Var = (uw0) obj;
                switch (b2) {
                    case 0:
                        return pzm.h((mos) ((tbz0) uw0Var.d).n.get());
                    case 1:
                        return new flq(this);
                    case 2:
                        c8o.l((v9q) ((tbz0) uw0Var.d).I.get());
                        return new bdz0(new n0v0(cwl1.C((q7r0) uw0Var.e)));
                    case 3:
                        return ((vqb1) ((jly0) uw0Var.i).get()).a().x(n9x0.d);
                    case 4:
                        tbz0 tbz0Var = (tbz0) uw0Var.d;
                        tbz0 tbz0Var2 = (tbz0) uw0Var.d;
                        Flowable flowable4 = (Flowable) tbz0Var.q.get();
                        c8o.l(flowable4);
                        loc1 loc1Var = new loc1();
                        Scheduler scheduler3 = (Scheduler) tbz0Var2.r.get();
                        c8o.l(scheduler3);
                        cyp cypVar = (cyp) ((jly0) uw0Var.h).get();
                        yqg yqgVar2 = (yqg) tbz0Var2.t.get();
                        c8o.l(yqgVar2);
                        return new vqb1(cypVar, flowable4, loc1Var, scheduler3, yqgVar2);
                    case 5:
                        t8u0 t8u0Var2 = (t8u0) ((tbz0) uw0Var.d).s.get();
                        c8o.l(t8u0Var2);
                        iac0 iac0Var2 = ((q7r0) uw0Var.e).d.c;
                        c8o.m(iac0Var2);
                        return t8u0Var2.a(iac0Var2.getLifecycle());
                    case 6:
                        y991 y991Var = (y991) ((tbz0) uw0Var.d).x.get();
                        c8o.l(y991Var);
                        return y991Var;
                    case 7:
                        return new xrl0();
                    case 8:
                        dg30 dg30Var2 = (dg30) ((tbz0) uw0Var.d).b.get();
                        c8o.l(dg30Var2);
                        lik1 lik1Var3 = nik1.w1;
                        c8o.m(lik1Var3);
                        lua1 lua1Var = (lua1) ((tbz0) uw0Var.d).B.get();
                        c8o.l(lua1Var);
                        return lua1Var.a(dg30Var2, lik1Var3);
                    case 9:
                        lzn0 lzn0Var3 = (lzn0) ((tbz0) uw0Var.d).e.get();
                        c8o.l(lzn0Var3);
                        a4q0 a4q0Var = (a4q0) ((tbz0) uw0Var.d).j.get();
                        c8o.l(a4q0Var);
                        return new oqg1(lzn0Var3, a4q0Var);
                    case 10:
                        i8h1 i8h1Var = (i8h1) ((tbz0) uw0Var.d).k.get();
                        c8o.l(i8h1Var);
                        return i8h1Var;
                    case 11:
                        return cwl1.I((q7r0) uw0Var.e);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 5:
                ojq ojqVar = (ojq) obj;
                switch (b2) {
                    case 0:
                        return new rlq(this);
                    case 1:
                        return new zlq(this);
                    case 2:
                        return new amq(this);
                    case 3:
                        rgn0 rgn0Var = (rgn0) ojqVar.d.get();
                        jly0 jly0Var = ojqVar.e;
                        jiz0 jiz0Var = (jiz0) ojqVar.b;
                        luc lucVar = (luc) jiz0Var.n.get();
                        c8o.l(lucVar);
                        q8n q8nVar = (q8n) jiz0Var.b.get();
                        c8o.l(q8nVar);
                        zja1 zja1Var = new zja1(rgn0Var, jly0Var, lucVar, q8nVar);
                        ((q7r0) ojqVar.j1).d.c.getLifecycle().a(new i83(zja1Var, (byte) 22));
                        return zja1Var;
                    case 4:
                        return new rgn0();
                    case 5:
                        return new SoundPool.Builder().setMaxStreams(10).build();
                    case 6:
                        return new sip(this, (byte) 1);
                    case 7:
                        pe peVarH = ((ivj) ojqVar.i1).h();
                        c8o.l(peVarH);
                        return Boolean.valueOf(peVarH.b(7));
                    case 8:
                        ttm0 ttm0Var = (ttm0) ojqVar.i.get();
                        rgn0 rgn0Var2 = (rgn0) ojqVar.d.get();
                        u9c0 u9c0VarQ = cto1.q(((q7r0) ojqVar.j1).d.c);
                        return new sfn0(new p410(ttm0Var, u9c0VarQ, xjy0.a), rgn0Var2, u9c0VarQ);
                    case 9:
                        ttm0 ttm0VarE = cwl1.E((q7r0) ojqVar.j1);
                        c8o.m(ttm0VarE);
                        return ttm0VarE;
                    case 10:
                        return new bmq(this);
                    case 11:
                        return new cmq(this);
                    case 12:
                        return new dmq(this);
                    case 13:
                        return new emq(this);
                    case 14:
                        return new fmq(this);
                    case 15:
                        return new hlq(this);
                    case 16:
                        return new ilq(this);
                    case 17:
                        return new jlq();
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        return new klq(this);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return new llq(this);
                    case 20:
                        return new mlq(this);
                    case 21:
                        return new nlq();
                    case 22:
                        return new olq(this);
                    case 23:
                        return new plq(this);
                    case 24:
                        return new qlq(this);
                    case 25:
                        return new slq(this);
                    case 26:
                        return new tlq(this);
                    case 27:
                        return new ulq(this);
                    case 28:
                        return cwl1.C((q7r0) ojqVar.j1);
                    case 29:
                        return new vlq(this);
                    case 30:
                        return new wlq(this);
                    case 31:
                        lik1 lik1Var4 = cwl1.D(((q7r0) ojqVar.j1).d.b()).b;
                        c8o.m(lik1Var4);
                        return lik1Var4;
                    case 32:
                        return new xlq(this);
                    case 33:
                        luk lukVar4 = (luk) ((jiz0) ojqVar.b).p.get();
                        c8o.l(lukVar4);
                        return Boolean.valueOf(new jl4(true, lukVar4).a());
                    case 34:
                        return new xip(this, (byte) 1);
                    case 35:
                        return new yip((byte) 1);
                    case 36:
                        return new ylq(this);
                    case 37:
                        yko ykoVar = (yko) ((jiz0) ojqVar.b).m.get();
                        c8o.l(ykoVar);
                        return new e5b0(30, Collections.singletonList(ykoVar.a((String) null, new ro8((niz0) ojqVar.k1, null, (byte) 19))), (List) null);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 6:
                tnm tnmVar2 = (tnm) obj;
                if (b2 == 0) {
                    return new gmq(this);
                }
                if (b2 == 1) {
                    return pzm.h((mos) ((rjz0) tnmVar2.b).b.get());
                }
                if (b2 == 2) {
                    return new hmq(this);
                }
                if (b2 == 3) {
                    return cwl1.C((q7r0) tnmVar2.c);
                }
                if (b2 == 4) {
                    r6h1 r6h1Var = r6h1.c;
                    return new wsl0();
                }
                jah.e(b2);
                return null;
            case 7:
                tnm tnmVar3 = (tnm) obj;
                kpz0 kpz0Var = (kpz0) tnmVar3.b;
                if (b2 == 0) {
                    return new spz0((w470) ((jly0) tnmVar3.f).get(), (ie70) ((jly0) tnmVar3.g).get());
                }
                if (b2 == 1) {
                    return new ie70((l670) ((jly0) tnmVar3.e).get(), (w470) ((jly0) tnmVar3.f).get());
                }
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 == 4) {
                            return new vuf0(nik1.y0);
                        }
                        if (b2 == 5) {
                            return new ycc1(new sw9(1, (zf30) null), new sw9(tnmVar3.e(), mw60.w(tnmVar3.e(), (l670) ((jly0) tnmVar3.e).get(), tnmVar3.m()), td70.a(tnmVar3.e().getResources(), tnmVar3.m())), (byte) 1).d(tnmVar3.e(), (l670) ((jly0) tnmVar3.e).get());
                        }
                        jah.e(b2);
                        return null;
                    }
                    gj5 gj5VarE = tnmVar3.e();
                    gw70 gw70Var = (gw70) kpz0Var.n.get();
                    c8o.l(gw70Var);
                    hl00 hl00Var = new hl00(gw70Var, (byte) 14);
                    j3a j3aVar = (j3a) kpz0Var.i.get();
                    c8o.l(j3aVar);
                    return new fe70(gj5VarE, hl00Var, j3aVar);
                }
                kly0 kly0Var = kpz0Var.m;
                kly0 kly0Var2 = kpz0Var.i;
                kly0 kly0Var3 = kpz0Var.l;
                kly0 kly0Var4 = kpz0Var.h;
                i8h1 i8h1Var2 = (i8h1) kly0Var.get();
                c8o.l(i8h1Var2);
                lzn0 lzn0Var4 = (lzn0) kpz0Var.j.get();
                c8o.l(lzn0Var4);
                in8 in8Var = new in8(lzn0Var4);
                r630 r630Var = (r630) kly0Var4.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var4.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) tnmVar3.c).get();
                gw70 gw70Var2 = (gw70) kpz0Var.n.get();
                c8o.l(gw70Var2);
                q770 q770Var = new q770(new mc70(gw70Var2, new kcg(new pob((byte) 6, false)), tnmVar3.m()), new e570((byte) 0, tnmVar3.m()), new z970((fe70) ((jly0) tnmVar3.c).get()), new ea70((fe70) ((jly0) tnmVar3.c).get(), (byte) 0), new ea70((fe70) ((jly0) tnmVar3.c).get(), (byte) 2), new ea70((fe70) ((jly0) tnmVar3.c).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar3 = (yqg) kly0Var3.get();
                c8o.l(yqgVar3);
                p670 p670Var = new p670(yqgVar3, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) tnmVar3.c).get();
                j3a j3aVar2 = (j3a) kly0Var2.get();
                c8o.l(j3aVar2);
                l770 l770Var = new l770(fe70Var2, j3aVar2, (byte) 0);
                yqg yqgVar4 = (yqg) kly0Var3.get();
                c8o.l(yqgVar4);
                p670 p670Var2 = new p670(yqgVar4, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) tnmVar3.c).get();
                j3a j3aVar3 = (j3a) kly0Var2.get();
                c8o.l(j3aVar3);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar3, (byte) 1), new w870((fe70) ((jly0) tnmVar3.c).get())), new q770(new e570((byte) 1, tnmVar3.m()), new h770((byte) 0), new h770((byte) 1), new k770(tnmVar3.m()), new i870((fe70) ((jly0) tnmVar3.c).get())));
                c8o.l((u3f1) kpz0Var.g.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str = (String) kpz0Var.o.get();
                c8o.l(str);
                mxa1 mxa1Var = new mxa1(i8h1Var2, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
                gj5 gj5VarE2 = tnmVar3.e();
                jik1 jik1Var = (jik1) ((jly0) tnmVar3.d).get();
                vgm vgmVar = (vgm) kpz0Var.d.get();
                c8o.l(vgmVar);
                return ((k670) mxa1Var.b(gj5VarE2, jik1Var).s(vgmVar).b).a();
            case 8:
                p2o0 p2o0Var = (p2o0) obj;
                if (b2 == 0) {
                    return new nmq(this);
                }
                if (b2 == 1) {
                    luk lukVar5 = (luk) ((ntz0) p2o0Var.b).o.get();
                    c8o.l(lukVar5);
                    return new oz4(false, lukVar5);
                }
                if (b2 == 2) {
                    return u1n0.z((q7r0) p2o0Var.d);
                }
                jah.e(b2);
                return null;
            case 9:
                if (b2 == 0) {
                    return cwl1.C(((w8p) obj).a);
                }
                if (b2 == 1) {
                    return new omq();
                }
                if (b2 == 2) {
                    return new vhc((byte) 5);
                }
                jah.e(b2);
                return null;
            case 10:
                switch (b2) {
                    case 0:
                        return new umq(this, (byte) 0);
                    case 1:
                        return new vmq((byte) 0);
                    case 2:
                        return new wmq((byte) 0);
                    case 3:
                        return new xmq((byte) 0);
                    case 4:
                        return new ymq(this, (byte) 0);
                    case 5:
                        return new zmq(this);
                    case 6:
                        return new anq(this);
                    case 7:
                        return new bnq(this, (byte) 0);
                    case 8:
                        return new cnq(this, (byte) 0);
                    case 9:
                        return new pmq(this, (byte) 0);
                    case 10:
                        return new qmq(this, (byte) 0);
                    case 11:
                        return new rmq(this, (byte) 0);
                    case 12:
                        return new smq((byte) 0);
                    case 13:
                        return new tmq((byte) 0);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 11:
                switch (b2) {
                    case 0:
                        return new dnq(this);
                    case 1:
                        return new umq(this, (byte) 1);
                    case 2:
                        return new vmq((byte) 1);
                    case 3:
                        return new wmq((byte) 1);
                    case 4:
                        return new xmq((byte) 1);
                    case 5:
                        return new ymq(this, (byte) 1);
                    case 6:
                        return new bnq(this, (byte) 1);
                    case 7:
                        return new cnq(this, (byte) 1);
                    case 8:
                        return new pmq(this, (byte) 1);
                    case 9:
                        return new qmq(this, (byte) 1);
                    case 10:
                        return new rmq(this, (byte) 1);
                    case 11:
                        return new smq((byte) 1);
                    case 12:
                        return new tmq((byte) 1);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 12:
                return a();
            case 13:
                if (b2 == 0) {
                    return new hnq(this);
                }
                if (b2 == 1) {
                    Scheduler scheduler4 = (Scheduler) ((z901) ((jnq) obj).c).b.get();
                    c8o.l(scheduler4);
                    return new tk21(scheduler4);
                }
                if (b2 == 2) {
                    return new inq(this);
                }
                jah.e(b2);
                return null;
            case 14:
                uw0 uw0Var2 = (uw0) obj;
                switch (b2) {
                    case 0:
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return new cbr0(new dbr0[]{new bn70(yon1.G1("AUDIOBOOK_HYDE", "audiobook/hyde", 202, "audiobook"), nik1.K1, (nar0) null), new pu00(true)}, false);
                    case 1:
                        dma1 dma1Var8 = (dma1) ((wd01) uw0Var2.d).d.get();
                        c8o.l(dma1Var8);
                        return new qe01(dma1Var8);
                    case 2:
                        return new gc01();
                    case 3:
                        return new td01();
                    case 4:
                        return new knq(this);
                    case 5:
                        return new zgt0((cyp) ((jly0) uw0Var2.X).get());
                    case 6:
                        t8u0 t8u0Var3 = (t8u0) ((wd01) uw0Var2.d).i.get();
                        c8o.l(t8u0Var3);
                        return t8u0Var3.a(((q7r0) uw0Var2.f).d.c.getLifecycle());
                    case 7:
                        return new lnq();
                    case 8:
                        return cwl1.C((q7r0) uw0Var2.f);
                    case 9:
                        vwm1 vwm1Var = (vwm1) ((wd01) uw0Var2.d).j.get();
                        c8o.l(vwm1Var);
                        return new mz10(vwm1Var);
                    case 10:
                        return new mnq();
                    default:
                        jah.e(b2);
                        return null;
                }
            case 15:
                return b();
            case 16:
                return c();
            case 17:
                return d();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                n221 n221Var = (n221) ((goq) obj).g;
                if (b2 == 0) {
                    return pzm.h((mos) n221Var.b.get());
                }
                if (b2 == 1) {
                    vwm1 vwm1Var2 = (vwm1) n221Var.c.get();
                    c8o.l(vwm1Var2);
                    xrc0 xrc0Var = (xrc0) n221Var.d.get();
                    c8o.l(xrc0Var);
                    npm1 npm1Var = (npm1) n221Var.i.get();
                    c8o.l(npm1Var);
                    q8n q8nVar2 = (q8n) n221Var.m.get();
                    c8o.l(q8nVar2);
                    return new mbq0(vwm1Var2, xrc0Var, npm1Var, q8nVar2);
                }
                if (b2 == 2) {
                    return new coq();
                }
                if (b2 == 3) {
                    return new doq();
                }
                if (b2 == 4) {
                    return new eoq();
                }
                if (b2 == 5) {
                    return new foq();
                }
                jah.e(b2);
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return e();
            case 20:
                if (b2 == 0) {
                    return new joq(this);
                }
                if (b2 == 1) {
                    return new loq(this);
                }
                if (b2 == 2) {
                    return new moq(this);
                }
                jah.e(b2);
                return null;
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case 25:
                if (b2 == 0) {
                    return new n8p(this, b3);
                }
                if (b2 == 1) {
                    return new o8p((byte) 1);
                }
                if (b2 == 2) {
                    return new p8p((byte) 1);
                }
                jah.e(b2);
                return null;
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                yjq yjqVar = (yjq) obj;
                nz51 nz51Var = (nz51) yjqVar.c;
                if (b2 == 0) {
                    t701 t701VarL = nz51Var.l();
                    c8o.l(t701VarL);
                    return new e5b0(30, Collections.singletonList(t701VarL), (List) null);
                }
                if (b2 == 1) {
                    return cwl1.C((q7r0) yjqVar.d);
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                uag1 uag1VarI = nz51Var.i();
                c8o.l(uag1VarI);
                return uag1VarI.a();
        }
    }
}
