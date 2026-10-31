package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class no51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no51(qo51 qo51Var, byte b) {
        super(1);
        this.a = b;
        this.b = qo51Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qo51 qo51Var = this.b;
        switch (b) {
            case 0:
                Flowable flowable = qo51Var.a;
                return Flowable.c(flowable.j(mo9.Y).J(l9x0.t), qo51Var.b.b0(qo51Var.h, m9x0.t).x(n9x0.i).J(o9x0.i), flowable.j(mo9.O0), flowable.j(mo9.R0), yoi1.h(lgv.a(qo51Var.g), o6x.a), new ep31(qo51Var, (byte) 6));
            case 1:
                rwq0.z((qtr) obj, new z821(qo51Var, (byte) 21));
                return rih1.a;
            default:
                return qo51Var.f;
        }
    }
}
