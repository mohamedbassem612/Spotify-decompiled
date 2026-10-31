package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cni1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fni1 b;
    public final /* synthetic */ coi1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cni1(fni1 fni1Var, coi1 coi1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = fni1Var;
        this.c = coi1Var;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        coi1 coi1Var = this.c;
        fni1 fni1Var = this.b;
        switch (b) {
            case 0:
                fni1Var.c().a(coi1Var);
                iu30Var.invoke(omi1.a);
                break;
            default:
                fni1Var.c().a(coi1Var);
                iu30Var.invoke(kmi1.a);
                break;
        }
        return rih1Var;
    }
}
