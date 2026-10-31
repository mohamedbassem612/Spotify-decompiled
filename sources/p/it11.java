package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class it11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jt11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it11(jt11 jt11Var, byte b) {
        super(1);
        this.a = b;
        this.b = jt11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        jt11 jt11Var = this.b;
        switch (b) {
            case 0:
                fai0 fai0Var = new fai0();
                fai0Var.m(new ft11((ioj0) null, false));
                if (jt11Var.e.b()) {
                    fai0Var.n(new soy0(jt11Var.d.a.toFlowable(BackpressureStrategy.d)), new df3(fai0Var, (byte) 26));
                }
                fai0Var.n(jt11Var.f, new df3(fai0Var, (byte) 27));
                return fai0Var;
            case 1:
                ((qtr) obj).b(new k8y0(jt11Var, (lnm) null, (byte) 7));
                return rih1.a;
            default:
                return jt11Var.b.a((l0i) null);
        }
    }
}
