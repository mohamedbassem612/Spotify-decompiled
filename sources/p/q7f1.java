package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q7f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ k7f1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7f1(k7f1 k7f1Var, Function0 function0, int i, Integer num) {
        super(1);
        this.e = k7f1Var;
        this.b = function0;
        this.c = i;
        this.d = num;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k7f1 k7f1Var = this.e;
        Integer num = this.d;
        int i = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, k7f1Var.e);
                if (function0 != null) {
                    b261.x(e261Var, 0);
                    if (num != null && i == num.intValue()) {
                        b261.y(e261Var, true);
                    }
                    b261.g(e261Var, k7f1Var.g, new uuc1(function0, (byte) 13));
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                if (function0 != null) {
                    b261.x(e261Var2, 0);
                    if (num != null && i == num.intValue()) {
                        b261.y(e261Var2, true);
                    }
                    b261.g(e261Var2, k7f1Var.g, new uuc1(function0, (byte) 14));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7f1(Function0 function0, int i, Integer num, k7f1 k7f1Var) {
        super(1);
        this.b = function0;
        this.c = i;
        this.d = num;
        this.e = k7f1Var;
    }
}
