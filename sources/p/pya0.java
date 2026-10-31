package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pya0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shg1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pya0(shg1 shg1Var, String str, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = shg1Var;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        String str = this.c;
        shg1 shg1Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new fya0(shg1Var.a(str)));
                break;
            default:
                iu30Var.invoke(new fya0(shg1Var.a(str)));
                break;
        }
        return rih1Var;
    }
}
