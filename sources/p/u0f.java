package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u0f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ tkf c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0f(vu30 vu30Var, tkf tkfVar, int i, byte b) {
        super(0);
        this.a = b;
        this.b = vu30Var;
        this.c = tkfVar;
        this.d = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        tkf tkfVar = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke(tkfVar, Integer.valueOf(i));
                break;
            default:
                vu30Var.invoke(tkfVar, Integer.valueOf(i));
                break;
        }
        return rih1Var;
    }
}
