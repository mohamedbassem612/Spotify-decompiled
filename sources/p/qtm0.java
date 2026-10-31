package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qtm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r091 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtm0(r091 r091Var, byte b) {
        super(0);
        this.a = b;
        this.b = r091Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r091 r091Var = this.b;
        switch (b) {
            case 0:
                r091.f(r091Var, (tv80) null, (Long) null, gjy0.a, 7);
                break;
            default:
                if (((i091) r091Var.g.getValue()).g) {
                    r091Var.k();
                }
                break;
        }
        return rih1Var;
    }
}
