package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xv10 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ wv10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv10(iu30 iu30Var, wv10 wv10Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = wv10Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wv10 wv10Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new iv10(wv10Var.b));
                break;
            default:
                iu30Var.invoke(new xu10(wv10Var.b));
                break;
        }
        return rih1Var;
    }
}
