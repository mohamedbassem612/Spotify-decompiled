package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class shi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mey0 b;
    public final /* synthetic */ thi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shi0(mey0 mey0Var, thi0 thi0Var, byte b) {
        super(0);
        this.a = b;
        this.b = mey0Var;
        this.c = thi0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        thi0 thi0Var = this.c;
        mey0 mey0Var = this.b;
        switch (b) {
            case 0:
                n1x n1xVar = mey0Var.g;
                if (n1xVar != null) {
                    thi0Var.d.o(new wy(gho1.r(n1xVar)));
                }
                break;
            default:
                n1x n1xVar2 = mey0Var.g;
                if (n1xVar2 != null) {
                    thi0Var.d.o(new wy(gho1.r(n1xVar2)));
                }
                break;
        }
        return rih1Var;
    }
}
