package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gg3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hg3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg3(hg3 hg3Var, byte b) {
        super(1);
        this.a = b;
        this.b = hg3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hg3 hg3Var = this.b;
        switch (b) {
            case 0:
                fai0 fai0Var = new fai0();
                fai0Var.m(new dg3(false, false));
                dp4 dp4Var = hg3Var.d;
                ux3 ux3Var = hg3Var.e;
                if (dp4Var.b()) {
                    fai0Var.n(new soy0(hg3Var.c.a.toFlowable(BackpressureStrategy.d)), new df3(fai0Var, (byte) 1));
                }
                if (ux3Var.a()) {
                    fai0Var.n(t5p1.j(ux3Var.b(), 3), new df3(fai0Var, (byte) 2));
                }
                return fai0Var;
            case 1:
                ((qtr) obj).b(new ep0(hg3Var, (lnm) null, (byte) 3));
                return rih1.a;
            default:
                return hg3Var.a.a((l0i) null);
        }
    }
}
