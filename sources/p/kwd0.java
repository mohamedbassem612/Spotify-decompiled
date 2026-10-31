package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kwd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb50 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwd0(lb50 lb50Var, String str, byte b) {
        super(0);
        this.a = b;
        this.b = lb50Var;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        lb50 lb50Var = this.b;
        switch (b) {
            case 0:
                lb50Var.invoke(new zxd0(str));
                break;
            case 1:
                lb50Var.invoke(new ryd0(str, null));
                break;
            case 2:
                lb50Var.invoke(new syd0(str));
                break;
            default:
                lb50Var.invoke(new dyd0(str, null, true));
                break;
        }
        return rih1Var;
    }
}
