package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rx6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ di4 b;
    public final /* synthetic */ g7h c;
    public final /* synthetic */ f8b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx6(f8b f8bVar, di4 di4Var, g7h g7hVar) {
        super(1);
        this.d = f8bVar;
        this.b = di4Var;
        this.c = g7hVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f8b f8bVar = this.d;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        g7h g7hVar = this.c;
        di4 di4Var = this.b;
        switch (b) {
            case 0:
                jx6 jx6Var = (jx6) obj;
                return Flowable.h(f8bVar.a(jx6Var.i.b).toFlowable(backpressureStrategy).J(qzs0.i), di4Var.d0() ? g7h.d(g7hVar, "", new String[]{jx6Var.a}).toFlowable(backpressureStrategy).J(new x5j1(jx6Var, (byte) 22)) : Flowable.I(Boolean.FALSE), rzs0.h).M(s321.i).t(Functions.a);
            default:
                dp8 dp8Var = (dp8) obj;
                return di4Var.e0() ? Flowable.h(g7h.d(g7hVar, "", new String[]{dp8Var.a}).toFlowable(backpressureStrategy).J(new fp8(dp8Var, (byte) 0)), f8bVar.a(dp8Var.e.b).toFlowable(backpressureStrategy).J(rbc.X), uwg.X).M(m9h.X).t(Functions.a) : Flowable.I(new a910(false, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx6(di4 di4Var, g7h g7hVar, f8b f8bVar) {
        super(1);
        this.b = di4Var;
        this.c = g7hVar;
        this.d = f8bVar;
    }
}
