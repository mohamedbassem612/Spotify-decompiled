package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w7p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w9p0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7p0(w9p0 w9p0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = w9p0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        w9p0 w9p0Var = this.b;
        switch (b) {
            case 0:
                if (!w9p0Var.e) {
                    iu30Var.invoke(vlm1.a);
                } else {
                    iu30Var.invoke(tlm1.a);
                }
                break;
            default:
                if (!w9p0Var.e) {
                    iu30Var.invoke(wlm1.a);
                } else {
                    iu30Var.invoke(ulm1.a);
                }
                break;
        }
        return rih1Var;
    }
}
