package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xlg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ plg0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlg0(plg0 plg0Var, iu30 iu30Var, long j, byte b) {
        super(0);
        this.a = b;
        this.b = plg0Var;
        this.c = iu30Var;
        this.d = j;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        elg0 elg0Var = elg0.a;
        long j = this.d;
        iu30 iu30Var = this.c;
        plg0 plg0Var = this.b;
        switch (b) {
            case 0:
                nlg0 nlg0Var = (nlg0) plg0Var;
                if (!nlg0Var.d) {
                    iu30Var.invoke(elg0Var);
                } else {
                    iu30Var.invoke(new dlg0(nlg0Var.a.a, j));
                }
                break;
            default:
                nlg0 nlg0Var2 = (nlg0) plg0Var;
                if (!nlg0Var2.d) {
                    iu30Var.invoke(elg0Var);
                } else {
                    iu30Var.invoke(new dlg0(nlg0Var2.a.a, j));
                }
                break;
        }
        return rih1Var;
    }
}
