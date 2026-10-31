package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class czb0 implements l5r0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public czb0(xrp0 xrp0Var, g7o0 g7o0Var, des desVar) {
        this.a = (byte) 1;
        this.b = xrp0Var;
        this.c = g7o0Var;
        this.d = desVar;
        this.f = new BehaviorProcessor();
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        lgo lgoVar;
        ezb0 ezb0Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                plp plpVar = (plp) obj;
                switch (plpVar.a) {
                    case 0:
                        lgoVar = new lgo(new lcb0((jly0) ((p2o0) plpVar.b.c).e), layoutInflater, viewGroup);
                        break;
                    default:
                        lgoVar = new lgo(new lcb0((jly0) ((cp31) plpVar.b.c).d), layoutInflater, viewGroup);
                        break;
                }
                this.e = lgoVar;
                olp olpVar = (olp) obj3;
                List list = (List) obj2;
                switch (olpVar.a) {
                    case 0:
                        lgo lgoVar2 = lgoVar;
                        p2o0 p2o0Var = (p2o0) olpVar.b.c;
                        vyb0 vyb0Var = (vyb0) p2o0Var.b;
                        ao0 ao0Var = (ao0) vyb0Var.e.get();
                        c8o.l(ao0Var);
                        ko0 ko0Var = (ko0) vyb0Var.d.get();
                        c8o.l(ko0Var);
                        lzn0 lzn0Var = (lzn0) vyb0Var.k.get();
                        c8o.l(lzn0Var);
                        dg30 dg30Var = (dg30) vyb0Var.c.get();
                        c8o.l(dg30Var);
                        i8h1 i8h1Var = (i8h1) vyb0Var.n.get();
                        c8o.l(i8h1Var);
                        dxy dxyVar = new dxy(ao0Var, ko0Var, lzn0Var, dg30Var, new yqu0(i8h1Var));
                        vyb0 vyb0Var2 = (vyb0) p2o0Var.b;
                        eo0 eo0Var = (eo0) vyb0Var2.h.get();
                        c8o.l(eo0Var);
                        rdo rdoVar = (rdo) vyb0Var2.j.get();
                        c8o.l(rdoVar);
                        Scheduler scheduler = (Scheduler) vyb0Var2.p.get();
                        c8o.l(scheduler);
                        aru0 aru0Var = new aru0(eo0Var, rdoVar, scheduler, (byte) 5);
                        i8h1 i8h1Var2 = (i8h1) vyb0Var2.n.get();
                        c8o.l(i8h1Var2);
                        yqu0 yqu0Var = new yqu0(i8h1Var2);
                        t2j0 t2j0Var = (t2j0) vyb0Var2.g.get();
                        c8o.l(t2j0Var);
                        hr0 hr0Var = new hr0(t2j0Var);
                        ao0 ao0Var2 = (ao0) vyb0Var2.e.get();
                        c8o.l(ao0Var2);
                        uyb0 uyb0Var = (uyb0) p2o0Var.c;
                        ezb0Var = new ezb0(dxyVar, aru0Var, yqu0Var, hr0Var, ao0Var2, l1b0.u(uyb0Var), l1b0.C(uyb0Var), lgoVar2, list);
                        break;
                    default:
                        cp31 cp31Var = (cp31) olpVar.b.c;
                        xyb0 xyb0Var = (xyb0) cp31Var.a;
                        ao0 ao0Var3 = (ao0) xyb0Var.e.get();
                        c8o.l(ao0Var3);
                        ko0 ko0Var2 = (ko0) xyb0Var.d.get();
                        c8o.l(ko0Var2);
                        lzn0 lzn0Var2 = (lzn0) xyb0Var.k.get();
                        c8o.l(lzn0Var2);
                        dg30 dg30Var2 = (dg30) xyb0Var.c.get();
                        c8o.l(dg30Var2);
                        i8h1 i8h1Var3 = (i8h1) xyb0Var.n.get();
                        c8o.l(i8h1Var3);
                        dxy dxyVar2 = new dxy(ao0Var3, ko0Var2, lzn0Var2, dg30Var2, new yqu0(i8h1Var3));
                        xyb0 xyb0Var2 = (xyb0) cp31Var.a;
                        eo0 eo0Var2 = (eo0) xyb0Var2.h.get();
                        c8o.l(eo0Var2);
                        rdo rdoVar2 = (rdo) xyb0Var2.j.get();
                        c8o.l(rdoVar2);
                        Scheduler scheduler2 = (Scheduler) xyb0Var2.p.get();
                        c8o.l(scheduler2);
                        aru0 aru0Var2 = new aru0(eo0Var2, rdoVar2, scheduler2, (byte) 5);
                        i8h1 i8h1Var4 = (i8h1) xyb0Var2.n.get();
                        c8o.l(i8h1Var4);
                        yqu0 yqu0Var2 = new yqu0(i8h1Var4);
                        t2j0 t2j0Var2 = (t2j0) xyb0Var2.g.get();
                        c8o.l(t2j0Var2);
                        hr0 hr0Var2 = new hr0(t2j0Var2);
                        ao0 ao0Var4 = (ao0) xyb0Var2.e.get();
                        c8o.l(ao0Var4);
                        wyb0 wyb0Var = (wyb0) cp31Var.b;
                        ezb0Var = new ezb0(dxyVar2, aru0Var2, yqu0Var2, hr0Var2, ao0Var4, l1b0.u(wyb0Var), l1b0.C(wyb0Var), lgoVar, list);
                        break;
                }
                this.f = ezb0Var;
                break;
            default:
                tka0 tka0Var = dtw.C;
                qtw qtwVarA = f6o1.A(((xrp0) obj3).a(new mdp0(0, (des) obj2, des.class, "retry", "retry()V", 0, (byte) 22)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                int i = 3;
                int iOrdinal = ((g7o0) obj).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 4;
                        }
                    }
                }
                dtw dtwVarB = mhc.b(context, viewGroup, qtwVarA, new yrp0(i), (ipb1) null, 112);
                View view = dtwVarB.w;
                op80 jp80Var = new jp80(viewGroup);
                op80 g6r0Var = new g6r0(new FlowableOnBackpressureLatest(((BehaviorProcessor) this.f).t(Functions.a)));
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && g6r0Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = g6r0Var;
                } else if (!g6r0Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, g6r0Var);
                    jp80Var = wchVar;
                }
                xhk1.c(view, jp80Var);
                this.e = dtwVarB;
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                lgo lgoVar = (lgo) this.e;
                if (lgoVar != null) {
                    return (View) lgoVar.c;
                }
                return null;
            default:
                dtw dtwVar = (dtw) this.e;
                if (dtwVar != null) {
                    return dtwVar.w;
                }
                return null;
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                ezb0 ezb0Var = (ezb0) this.f;
                if (ezb0Var != null) {
                    ezb0Var.start();
                    return;
                } else {
                    u890.C("presenter");
                    throw null;
                }
            default:
                ((BehaviorProcessor) this.f).onNext(Boolean.TRUE);
                return;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                ezb0 ezb0Var = (ezb0) this.f;
                if (ezb0Var != null) {
                    ezb0Var.stop();
                    return;
                } else {
                    u890.C("presenter");
                    throw null;
                }
            default:
                ((BehaviorProcessor) this.f).onNext(Boolean.FALSE);
                return;
        }
    }

    public czb0(olp olpVar, plp plpVar, List list) {
        this.a = (byte) 0;
        this.b = olpVar;
        this.c = plpVar;
        this.d = list;
    }
}
