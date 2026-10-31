package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xf3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7h b;
    public final /* synthetic */ f8b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf3(f8b f8bVar, g7h g7hVar) {
        super(1);
        this.a = (byte) 0;
        this.c = f8bVar;
        this.b = g7hVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f8b f8bVar = this.c;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        g7h g7hVar = this.b;
        switch (b) {
            case 0:
                tf3 tf3Var = (tf3) obj;
                Flowable flowableH = Flowable.h(f8bVar.a(tf3Var.h.b).toFlowable(backpressureStrategy).J(drm0.e), g7h.d(g7hVar, "", new String[]{tf3Var.a}).toFlowable(backpressureStrategy).J(new w4b1(tf3Var, (byte) 14)), cq41.e);
                flowableH.getClass();
                return flowableH.t(Functions.a);
            case 1:
                pn8 pn8Var = (pn8) obj;
                return Flowable.h(g7h.d(g7hVar, "", new String[]{pn8Var.a}).toFlowable(backpressureStrategy).J(new cp5(pn8Var, (byte) 27)), f8bVar.a(pn8Var.e.b).toFlowable(backpressureStrategy).J(vap1.i), xbp1.t).M(wcp1.i).t(Functions.a);
            default:
                qd60 qd60Var = (qd60) obj;
                Flowable flowableH2 = Flowable.h(g7h.d(g7hVar, "", new String[]{qd60Var.a}).toFlowable(backpressureStrategy).J(new j3v(qd60Var, (byte) 27)), f8bVar.a(qd60Var.i.b).toFlowable(backpressureStrategy).J(e710.f), d710.f);
                flowableH2.getClass();
                return flowableH2.t(Functions.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf3(g7h g7hVar, f8b f8bVar, byte b) {
        super(1);
        this.a = b;
        this.b = g7hVar;
        this.c = f8bVar;
    }
}
