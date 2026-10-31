package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lew0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gfw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lew0(gfw0 gfw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gfw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gfw0 gfw0Var = this.b;
        switch (b) {
            case 0:
                gfw0Var.D = true;
                if (gfw0Var.K == 1) {
                    gfw0Var.f4p.m((Object) null, Boolean.TRUE);
                }
                return rih1Var;
            case 1:
                gfw0Var.D = false;
                gfw0Var.f4p.m((Object) null, Boolean.FALSE);
                return rih1Var;
            case 2:
                return (r091) gfw0Var.k.b;
            case 3:
                return (Boolean) gfw0Var.f4p.getValue();
            default:
                return gfw0Var.v;
        }
    }
}
