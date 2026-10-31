package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lu31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hu31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu31(iu30 iu30Var, hu31 hu31Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = hu31Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hu31 hu31Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(hu31Var.c ? st31.a : xt31.a);
                break;
            default:
                iu30Var.invoke(hu31Var.c ? tt31.a : ut31.a);
                break;
        }
        return rih1Var;
    }
}
