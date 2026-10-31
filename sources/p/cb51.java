package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cb51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ db51 b;
    public final /* synthetic */ apd c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb51(db51 db51Var, apd apdVar, int i, byte b) {
        super(0);
        this.a = b;
        this.b = db51Var;
        this.c = apdVar;
        this.d = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        apd apdVar = this.c;
        db51 db51Var = this.b;
        switch (b) {
            case 0:
                db51Var.l(apdVar, i, db51Var.Z0);
                break;
            default:
                db51Var.l(apdVar, i, db51Var.Z0);
                break;
        }
        return rih1Var;
    }
}
