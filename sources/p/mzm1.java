package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mzm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzm1(qzm1 qzm1Var, byte b) {
        super(0);
        this.a = b;
        this.b = qzm1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        qzm1 qzm1Var = this.b;
        switch (b) {
            case 0:
                return new u911((i8h1) qzm1Var.r.get(), qzm1Var.s, (k911) qzm1Var.p.a.c.a.ke.get());
            case 1:
                return new bzl0(qzm1Var.s.b());
            default:
                return new kb81((bzl0) qzm1Var.u.getValue(), qzm1Var.r, qzm1Var.k);
        }
    }
}
