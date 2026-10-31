package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c8f1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q8f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8f1(vu30 vu30Var, int i, q8f1 q8f1Var, byte b) {
        super(0);
        this.a = b;
        this.b = vu30Var;
        this.c = i;
        this.d = q8f1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        q8f1 q8f1Var = this.d;
        int i = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke(Integer.valueOf(i), q8f1Var.d);
                break;
            default:
                if (vu30Var != null) {
                    vu30Var.invoke(Integer.valueOf(i), q8f1Var.d);
                }
                break;
        }
        return rih1Var;
    }
}
