package p;

import android.content.Context;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mqp {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ mqp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final umf0 a(Function0 function0, hcb0 hcb0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zl5 zl5Var = (zl5) ((blp) obj).c;
                Scheduler scheduler = (Scheduler) ((sjf0) zl5Var.b).l.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) ((sjf0) zl5Var.b).k.get();
                c8o.l(scheduler2);
                sjf0 sjf0Var = (sjf0) zl5Var.b;
                Context context = (Context) sjf0Var.b.get();
                c8o.l(context);
                gw70 gw70VarB = ((ryj) zl5Var.c).b();
                c8o.l(gw70VarB);
                luk lukVarA = sjf0Var.a();
                c8o.l(lukVarA);
                new im4(false, lukVarA);
                xfx xfxVar = new xfx(context, gw70VarB, new sua((byte) 9));
                w9u0 w9u0Var = (w9u0) ((jly0) zl5Var.e).get();
                gn10 gn10Var = mno1.Y;
                FlowableMap flowableMapF = f2u0.f((Flowable) ((jly0) zl5Var.f).get());
                Flowable flowable = (Flowable) ((jly0) zl5Var.f).get();
                mo9 mo9Var = mo9.O0;
                Flowable flowableJ = flowable.j(mo9Var);
                Flowable flowableJ2 = ((Flowable) ((jly0) zl5Var.f).get()).j(mo9.N0);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) ((jly0) zl5Var.f).get());
                pe peVarH = ((ryj) zl5Var.c).h();
                c8o.l(peVarH);
                luk lukVarA2 = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA2);
                dfm dfmVar = new dfm(w9u0Var, gn10Var, flowableMapF, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarA2)));
                Flowable flowable2 = (Flowable) ((jly0) zl5Var.f).get();
                Flowable flowable3 = (Flowable) ((jly0) zl5Var.i).get();
                w9u0 w9u0Var2 = (w9u0) ((jly0) zl5Var.e).get();
                Consumer consumer = (Consumer) ((jly0) zl5Var.k).get();
                sjf0 sjf0Var2 = (sjf0) zl5Var.b;
                luk lukVarA3 = sjf0Var2.a();
                c8o.l(lukVarA3);
                jn4 jn4Var = new jn4(lukVarA3);
                dma1 dma1Var = (dma1) sjf0Var2.B.get();
                c8o.l(dma1Var);
                mo51 mo51Var = new mo51(flowable2, flowable3, w9u0Var2, consumer, jn4Var, dma1Var);
                s691 s691Var = new s691(f2u0.D((Flowable) ((jly0) zl5Var.f).get()), (Flowable) ((jly0) zl5Var.m).get(), ((Flowable) ((jly0) zl5Var.f).get()).j(mo9Var), (w9u0) ((jly0) zl5Var.e).get());
                k691 k691Var = new k691((Flowable) ((jly0) zl5Var.f).get(), (Flowable) ((jly0) zl5Var.m).get(), (w9u0) ((jly0) zl5Var.e).get(), (mrq0) ((jly0) zl5Var.n).get(), i691.a);
                sjf0 sjf0Var3 = (sjf0) zl5Var.b;
                q8q q8qVar = (q8q) sjf0Var3.c.get();
                c8o.l(q8qVar);
                Flowable flowable4 = (Flowable) ((jly0) zl5Var.l).get();
                Flowable flowable5 = (Flowable) sjf0Var3.f75p.get();
                c8o.l(flowable5);
                Scheduler scheduler3 = (Scheduler) sjf0Var3.k.get();
                c8o.l(scheduler3);
                yqg yqgVar = (yqg) sjf0Var3.j.get();
                c8o.l(yqgVar);
                Flowable flowableW = zgf0.w(flowable5, scheduler3, yqgVar);
                Flowable flowable6 = (Flowable) ((jly0) zl5Var.o).get();
                oqa1 oqa1Var = (oqa1) sjf0Var3.A.get();
                c8o.l(oqa1Var);
                if (oqa1Var.h) {
                    flowable4 = flowableW;
                }
                e27 e27VarA = q8qVar.a(flowable4, flowable6);
                xh71 xh71Var = (xh71) ((sjf0) zl5Var.b).x.get();
                c8o.l(xh71Var);
                ifl1 ifl1Var = new ifl1(xh71Var, (byte) 22);
                hq41 hq41Var = (hq41) ((sjf0) zl5Var.b).r.get();
                c8o.l(hq41Var);
                i8h1 i8h1Var = (i8h1) ((sjf0) zl5Var.b).i.get();
                c8o.l(i8h1Var);
                blp blpVar = (blp) zl5Var.p;
                blp blpVar2 = (blp) zl5Var.q;
                Flowable flowable7 = (Flowable) ((sjf0) zl5Var.b).f75p.get();
                c8o.l(flowable7);
                Flowable flowable8 = (Flowable) ((sjf0) zl5Var.b).f75p.get();
                c8o.l(flowable8);
                ekf0 ekf0Var = new ekf0(flowable8, (jly0) zl5Var.r);
                bhf0 bhf0Var = (bhf0) ((sjf0) zl5Var.b).f.get();
                c8o.l(bhf0Var);
                lnf0 lnf0Var = (lnf0) ((sjf0) zl5Var.b).g.get();
                c8o.l(lnf0Var);
                blp blpVar3 = (blp) zl5Var.r;
                wlk1 wlk1Var = (wlk1) ((sjf0) zl5Var.b).h.get();
                c8o.l(wlk1Var);
                w9u0 w9u0Var3 = (w9u0) ((jly0) zl5Var.e).get();
                eof0 eof0Var = (eof0) ((sjf0) zl5Var.b).v.get();
                c8o.l(eof0Var);
                kt91 kt91Var = (kt91) ((sjf0) zl5Var.b).e.get();
                c8o.l(kt91Var);
                t2j0 t2j0Var = (t2j0) ((sjf0) zl5Var.b).u.get();
                c8o.l(t2j0Var);
                zwz0 zwz0Var = (zwz0) ((sjf0) zl5Var.b).w.get();
                c8o.l(zwz0Var);
                sqs0 sqs0Var = (sqs0) ((sjf0) zl5Var.b).y.get();
                c8o.l(sqs0Var);
                sqs0 sqs0Var2 = (sqs0) ((sjf0) zl5Var.b).z.get();
                c8o.l(sqs0Var2);
                return new umf0(function0, hcb0Var, scheduler, scheduler2, xfxVar, dfmVar, mo51Var, s691Var, k691Var, e27VarA, ifl1Var, hq41Var, i8h1Var, blpVar, blpVar2, flowable7, ekf0Var, bhf0Var, lnf0Var, blpVar3, wlk1Var, w9u0Var3, eof0Var, kt91Var, t2j0Var, zwz0Var, sqs0Var, sqs0Var2, (oov0) ((jly0) zl5Var.v).get(), (j8a1) ((jly0) zl5Var.x).get(), (s8a1) ((jly0) zl5Var.u).get());
            case 1:
                s2q s2qVar = (s2q) obj;
                daq daqVar = s2qVar.b;
                Scheduler scheduler4 = (Scheduler) daqVar.r3.get();
                Scheduler scheduler5 = (Scheduler) daqVar.z1.get();
                s3p s3pVar = (s3p) s2qVar.d;
                xfx xfxVar2 = (xfx) ((s2q) s3pVar.h1).get();
                w9u0 w9u0Var4 = (w9u0) ((jly0) s3pVar.d).get();
                gn10 gn10VarR = j310.r((LyricsFullscreenPageActivity) s3pVar.X0);
                FlowableMap flowableMapF2 = f2u0.f((Flowable) ((jly0) s3pVar.e).get());
                Flowable flowable9 = (Flowable) ((jly0) s3pVar.e).get();
                mo9 mo9Var2 = mo9.O0;
                dfm dfmVar2 = new dfm(w9u0Var4, gn10VarR, flowableMapF2, flowable9.j(mo9Var2), ((Flowable) ((jly0) s3pVar.e).get()).j(mo9.N0), f2u0.d((Flowable) ((jly0) s3pVar.e).get()), (pe) ((daq) s3pVar.Y0).p9.get(), new qmr((in4) ((s2q) s3pVar.j1).get()));
                Flowable flowable10 = (Flowable) ((jly0) s3pVar.e).get();
                Flowable flowable11 = (Flowable) ((jly0) s3pVar.h).get();
                w9u0 w9u0Var5 = (w9u0) ((jly0) s3pVar.d).get();
                Consumer consumer2 = (Consumer) ((jly0) s3pVar.t).get();
                daq daqVar2 = (daq) s3pVar.Y0;
                mo51 mo51Var2 = new mo51(flowable10, flowable11, w9u0Var5, consumer2, new jn4((luk) daqVar2.L1.get()), (dma1) daqVar2.C1.get());
                s691 s691Var2 = new s691(f2u0.D((Flowable) ((jly0) s3pVar.e).get()), (Flowable) ((jly0) s3pVar.Y).get(), ((Flowable) ((jly0) s3pVar.e).get()).j(mo9Var2), (w9u0) ((jly0) s3pVar.d).get());
                k691 k691Var2 = new k691((Flowable) ((jly0) s3pVar.e).get(), (Flowable) ((jly0) s3pVar.Y).get(), (w9u0) ((jly0) s3pVar.d).get(), (mrq0) ((jly0) s3pVar.Z).get(), i691.a);
                daq daqVar3 = (daq) s3pVar.Y0;
                q8q q8qVar2 = (q8q) daqVar3.mo.get();
                Flowable flowable12 = (Flowable) ((jly0) s3pVar.X).get();
                Flowable flowableW2 = zgf0.w((Flowable) daqVar3.D5.get(), (Scheduler) daqVar3.z1.get(), (yqg) daqVar3.J1.get());
                Flowable flowable13 = (Flowable) ((jly0) s3pVar.N0).get();
                if (((oqa1) daqVar3.no.get()).h) {
                    flowable12 = flowableW2;
                }
                return new umf0(function0, hcb0Var, scheduler4, scheduler5, xfxVar2, dfmVar2, mo51Var2, s691Var2, k691Var2, q8qVar2.a(flowable12, flowable13), new ifl1((xh71) ((s2q) s3pVar.k1).get(), (byte) 22), (hq41) ((s2q) s3pVar.l1).get(), (i8h1) daqVar.A5.get(), (s2q) s3pVar.m1, (s2q) s3pVar.n1, (Flowable) daqVar.D5.get(), new ekf0((Flowable) ((daq) s3pVar.Y0).D5.get(), (s2q) s3pVar.o1), (bhf0) daqVar.oo.get(), (lnf0) daqVar.po.get(), (s2q) s3pVar.o1, (wlk1) daqVar.ro.get(), (w9u0) ((jly0) s3pVar.d).get(), (eof0) daqVar.to.get(), (kt91) daqVar.f8.get(), (t2j0) daqVar.f2.get(), (zwz0) daqVar.U1.get(), (sqs0) daqVar.uo.get(), (sqs0) daqVar.uo.get(), (oov0) ((jly0) s3pVar.U0).get(), (j8a1) ((jly0) s3pVar.W0).get(), (s8a1) ((jly0) s3pVar.T0).get());
            default:
                return ((mqp) obj).a(function0, hcb0Var);
        }
    }
}
