package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tlf1 extends hab0 implements iu30 {
    public final /* synthetic */ rh11 X;
    public final /* synthetic */ bv40 a;
    public final /* synthetic */ t7y b;
    public final /* synthetic */ Flowable c;
    public final /* synthetic */ zr00 d;
    public final /* synthetic */ yh2 e;
    public final /* synthetic */ o241 f;
    public final /* synthetic */ f8b g;
    public final /* synthetic */ ne h;
    public final /* synthetic */ krh i;
    public final /* synthetic */ waz0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlf1(bv40 bv40Var, t7y t7yVar, Flowable flowable, zr00 zr00Var, yh2 yh2Var, o241 o241Var, f8b f8bVar, ne neVar, krh krhVar, waz0 waz0Var, rh11 rh11Var) {
        super(1);
        this.a = bv40Var;
        this.b = t7yVar;
        this.c = flowable;
        this.d = zr00Var;
        this.e = yh2Var;
        this.f = o241Var;
        this.g = f8bVar;
        this.h = neVar;
        this.i = krhVar;
        this.t = waz0Var;
        this.X = rh11Var;
    }

    public final Object invoke(Object obj) {
        plf1 plf1Var = (plf1) obj;
        String str = plf1Var.a;
        mr20 mr20VarK = plf1Var.v || plf1Var.w || plf1Var.s ? this.a.k(str) : new huz(md2.c, (byte) 10);
        o6x o6xVar = o6x.a;
        Flowable flowableH = yoi1.h(mr20VarK, o6xVar);
        int i = plf1Var.G;
        px3 px3Var = px3.a;
        Flowable flowableU = i == 2 ? yoi1.h(this.b.g(str), o6xVar).U(px3Var) : Flowable.I(px3Var);
        flowableU.getClass();
        Flowable flowableH2 = Flowable.h(flowableH, flowableU, r3x0.T0);
        Flowable flowableH3 = yoi1.h(this.d.a, o6xVar);
        Observable observableA = this.e.a();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        Flowable flowable = observableA.toFlowable(backpressureStrategy);
        Flowable flowable2 = this.f.a.toFlowable(backpressureStrategy);
        Flowable flowable3 = this.g.a(plf1Var.n.b).toFlowable(backpressureStrategy);
        String str2 = plf1Var.b;
        Flowable flowableD = Flowable.d(this.c, flowableH3, flowable, flowable2, flowable3, g7h.d((g7h) this.h.c, "", new String[]{str2}).toFlowable(backpressureStrategy).J(new vdn1(str2, (byte) 14)).J(b4x0.h), yoi1.h(new wz0(this.i.c(ql10.a), (byte) 3), o6xVar), flowableH2, new ulc(this.X, (byte) 27));
        waz0 waz0Var = this.t;
        Flowable flowableH4 = Flowable.h(flowableD, waz0Var.d().U(waz0Var.a()), new esa1(waz0Var, plf1Var, (byte) 28));
        flowableH4.getClass();
        return flowableH4.t(Functions.a);
    }
}
