package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hkm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ okm0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkm0(vu30 vu30Var, okm0 okm0Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = vu30Var;
        this.c = okm0Var;
        this.d = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        okm0 okm0Var = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                vu30Var.invoke(okm0Var, Integer.valueOf(i));
                break;
            case 1:
                vu30Var.invoke(okm0Var, Integer.valueOf(i));
                break;
            case 2:
                vu30Var.invoke(okm0Var, Integer.valueOf(i));
                break;
            default:
                vu30Var.invoke(okm0Var, Integer.valueOf(i));
                break;
        }
        return rih1Var;
    }
}
