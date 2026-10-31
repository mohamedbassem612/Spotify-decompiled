package p;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sxo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ sxo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final tr60 a(ViewGroup viewGroup, rr60 rr60Var, qr60 qr60Var, iu30 iu30Var) {
        byte b = this.a;
        p2p p2pVar = this.b;
        switch (b) {
            case 0:
                wxo wxoVar = (wxo) ((fwo) p2pVar).c;
                w2k1 w2k1VarO0 = ((f62) wxoVar.b).O0();
                c8o.l(w2k1VarO0);
                FlowableMap flowableMapB = wxoVar.b();
                Flowable flowable = (Flowable) wxoVar.G.get();
                yjj1 yjj1VarB0 = ((f62) wxoVar.b).B0();
                c8o.l(yjj1VarB0);
                c3s c3sVarB = ((f62) wxoVar.b).B();
                c8o.l(c3sVarB);
                Flowable flowable2 = (Flowable) wxoVar.H.get();
                wxoVar.getClass();
                Context context = (Context) wxoVar.i.get();
                f62 f62Var = (f62) wxoVar.b;
                kt91 kt91VarJ = f62Var.j();
                c8o.l(kt91VarJ);
                Flowable flowableF = f62Var.f();
                c8o.l(flowableF);
                pqc1 pqc1VarF1 = f62Var.f1();
                c8o.l(pqc1VarF1);
                a7z a7zVarJ0 = f62Var.J0();
                c8o.l(a7zVarJ0);
                nqc1 nqc1VarI0 = f62Var.I0();
                c8o.l(nqc1VarI0);
                yjj1 yjj1VarB1 = f62Var.B0();
                c8o.l(yjj1VarB1);
                c3s c3sVarB2 = f62Var.B();
                c8o.l(c3sVarB2);
                pnd pndVar = new pnd(context, kt91VarJ, flowableF, pqc1VarF1, a7zVarJ0, nqc1VarI0, new yge0(yjj1VarB1, c3sVarB2, (byte) 0));
                a1r0 a1r0VarC = ((f62) wxoVar.b).C();
                c8o.l(a1r0VarC);
                uk51 uk51Var = new uk51(a1r0VarC, (byte) 1);
                FlowableMap flowableMapB2 = wxoVar.b();
                yjj1 yjj1VarB2 = ((f62) wxoVar.b).B0();
                c8o.l(yjj1VarB2);
                suh1 suh1Var = new suh1(flowableMapB2, yjj1VarB2, (gw70) wxoVar.h.get());
                f62 f62Var2 = (f62) wxoVar.b;
                luk lukVarW = f62Var2.w();
                c8o.l(lukVarW);
                xu4 xu4Var = new xu4(false, lukVarW);
                FlowableMap flowableMapB3 = wxoVar.b();
                cbv cbvVarN0 = f62Var2.N0();
                c8o.l(cbvVarN0);
                et90 et90Var = new et90(xu4Var, flowableMapB3, cbvVarN0);
                uym0 uym0Var = new uym0(f2u0.j((Flowable) wxoVar.D.get()), (Flowable) wxoVar.G.get(), wxoVar.c(), (w9u0) wxoVar.I.get(), (d0r) wxoVar.J.get());
                qlb qlbVar = new qlb((gw70) wxoVar.h.get(), (d0r) wxoVar.J.get());
                xfx xfxVarC0 = ((f62) wxoVar.b).c0();
                c8o.l(xfxVarC0);
                ewx ewxVar = new ewx(new ogr(xfxVarC0));
                iac0 iac0Var = (iac0) wxoVar.A.get();
                luk lukVarW2 = ((f62) wxoVar.b).w();
                c8o.l(lukVarW2);
                return new tr60(w2k1VarO0, flowableMapB, flowable, yjj1VarB0, c3sVarB, flowable2, pndVar, uk51Var, suh1Var, et90Var, uym0Var, qlbVar, ewxVar, iac0Var, new sn4(lukVarW2), (Scheduler) wxoVar.d.get(), (Scheduler) wxoVar.f.get(), viewGroup, rr60Var, qr60Var, iu30Var, new jjv0((Flowable) wxoVar.H.get(), wxoVar.d()), new g2t0((i8h1) wxoVar.j.get()));
            case 1:
                p2p p2pVar2 = p2pVar;
                nwp nwpVar = (nwp) p2pVar2.c;
                w2k1 w2k1Var = (w2k1) ((daq) nwpVar.a.b).L8.get();
                c8o.l(w2k1Var);
                wdm wdmVar = (wdm) p2pVar2.d;
                FlowableMap flowableMapF = f2u0.f((Flowable) ((jly0) wdmVar.d).get());
                Flowable flowable3 = (Flowable) ((jly0) wdmVar.g).get();
                yjj1 yjj1VarL1 = nwpVar.a.l1();
                c8o.l(yjj1VarL1);
                c3s c3sVarC0 = nwpVar.a.c0();
                c8o.l(c3sVarC0);
                Flowable flowable4 = (Flowable) ((jly0) wdmVar.h).get();
                wdmVar.getClass();
                nwp nwpVar2 = (nwp) wdmVar.c;
                Context context2 = (Context) nwpVar2.b.d;
                c8o.l(context2);
                em0 em0Var = nwpVar2.a;
                kt91 kt91VarD1 = em0Var.d1();
                c8o.l(kt91VarD1);
                Flowable flowable5 = (Flowable) nwpVar2.l.get();
                pqc1 pqc1Var = (pqc1) nwpVar2.Q.get();
                daq daqVar = (daq) em0Var.b;
                a7z a7zVar = (a7z) daqVar.Pp.get();
                c8o.l(a7zVar);
                nqc1 nqc1Var = (nqc1) daqVar.wq.get();
                c8o.l(nqc1Var);
                yjj1 yjj1VarL2 = em0Var.l1();
                c8o.l(yjj1VarL2);
                c3s c3sVarC1 = em0Var.c0();
                c8o.l(c3sVarC1);
                pnd pndVar2 = new pnd(context2, kt91VarD1, flowable5, pqc1Var, a7zVar, nqc1Var, new yge0(yjj1VarL2, c3sVarC1, (byte) 0));
                a1r0 a1r0VarA0 = ((nwp) wdmVar.c).a.A0();
                c8o.l(a1r0VarA0);
                uk51 uk51Var2 = new uk51(a1r0VarA0, (byte) 1);
                FlowableMap flowableMapF2 = f2u0.f((Flowable) ((jly0) wdmVar.d).get());
                nwp nwpVar3 = (nwp) wdmVar.c;
                yjj1 yjj1VarL3 = nwpVar3.a.l1();
                c8o.l(yjj1VarL3);
                gw70 gw70VarA0 = nwpVar3.a.a0();
                c8o.l(gw70VarA0);
                suh1 suh1Var2 = new suh1(flowableMapF2, yjj1VarL3, gw70VarA0);
                nwp nwpVar4 = (nwp) wdmVar.c;
                et90 et90Var2 = new et90(new xu4(false, (luk) nwpVar4.g.get()), f2u0.f((Flowable) ((jly0) wdmVar.d).get()), (cbv) nwpVar4.P.get());
                uym0 uym0Var2 = new uym0(f2u0.j((Flowable) ((jly0) wdmVar.d).get()), (Flowable) ((jly0) wdmVar.g).get(), ((Flowable) ((jly0) wdmVar.d).get()).j(mo9.O0), (w9u0) ((jly0) wdmVar.i).get(), (d0r) ((jly0) wdmVar.t).get());
                gw70 gw70VarA1 = ((nwp) wdmVar.c).a.a0();
                c8o.l(gw70VarA1);
                return new tr60(w2k1Var, flowableMapF, flowable3, yjj1VarL1, c3sVarC0, flowable4, pndVar2, uk51Var2, suh1Var2, et90Var2, uym0Var2, new qlb(gw70VarA1, (d0r) ((jly0) wdmVar.t).get()), new ewx(new ogr((xfx) ((nwp) wdmVar.c).h.get())), (iac0) ((jly0) wdmVar.X).get(), nwpVar.e(), (Scheduler) nwpVar.s.get(), (Scheduler) nwpVar.t.get(), viewGroup, rr60Var, qr60Var, iu30Var, new jjv0((Flowable) ((jly0) wdmVar.h).get(), f2u0.D((Flowable) ((jly0) wdmVar.d).get())), new g2t0((i8h1) ((nwp) wdmVar.c).Z.get()));
            default:
                p2q p2qVar = (p2q) p2pVar;
                daq daqVar2 = p2qVar.b;
                w2k1 w2k1Var2 = (w2k1) daqVar2.L8.get();
                s24 s24Var = (s24) p2qVar.e;
                FlowableMap flowableMapF3 = f2u0.f((Flowable) ((jly0) s24Var.e).get());
                Flowable flowable6 = (Flowable) ((jly0) s24Var.h).get();
                yjj1 yjj1Var = (yjj1) daqVar2.zq.get();
                c3s c3sVar = (c3s) daqVar2.e6.get();
                Flowable flowable7 = (Flowable) ((jly0) s24Var.i).get();
                s24Var.getClass();
                daq daqVar3 = (daq) s24Var.c;
                pnd pndVar3 = new pnd((Context) daqVar3.x1.a, (kt91) daqVar3.f8.get(), (Flowable) daqVar3.D5.get(), (pqc1) daqVar3.O8.get(), (a7z) daqVar3.Pp.get(), (nqc1) daqVar3.wq.get(), new yge0((yjj1) daqVar3.zq.get(), (c3s) daqVar3.e6.get(), (byte) 0));
                uk51 uk51Var3 = new uk51((a1r0) ((v5q) s24Var.d).k1.get(), (byte) 1);
                FlowableMap flowableMapF4 = f2u0.f((Flowable) ((jly0) s24Var.e).get());
                daq daqVar4 = (daq) s24Var.c;
                suh1 suh1Var3 = new suh1(flowableMapF4, (yjj1) daqVar4.zq.get(), (gw70) daqVar4.d8.get());
                daq daqVar5 = (daq) s24Var.c;
                return new tr60(w2k1Var2, flowableMapF3, flowable6, yjj1Var, c3sVar, flowable7, pndVar3, uk51Var3, suh1Var3, new et90(new xu4(false, (luk) daqVar5.L1.get()), f2u0.f((Flowable) ((jly0) s24Var.e).get()), (cbv) daqVar5.vq.get()), new uym0(f2u0.j((Flowable) ((jly0) s24Var.e).get()), (Flowable) ((jly0) s24Var.h).get(), ((Flowable) ((jly0) s24Var.e).get()).j(mo9.O0), (w9u0) ((jly0) s24Var.t).get(), (d0r) ((jly0) s24Var.X).get()), new qlb((gw70) ((daq) s24Var.c).d8.get(), (d0r) ((jly0) s24Var.X).get()), new ewx(new ogr((xfx) ((v5q) s24Var.d).o1.get())), (iac0) ((jly0) s24Var.Y).get(), ((v5q) p2qVar.d).i(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), viewGroup, rr60Var, qr60Var, iu30Var, new jjv0((Flowable) ((jly0) s24Var.i).get(), f2u0.D((Flowable) ((jly0) s24Var.e).get())), new g2t0((i8h1) ((daq) s24Var.c).A5.get()));
        }
    }
}
