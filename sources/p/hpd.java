package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hpd extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ apd c;
    public final /* synthetic */ ouk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpd(xu30 xu30Var, apd apdVar, ouk0 ouk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xu30Var;
        this.c = apdVar;
        this.d = ouk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ouk0 ouk0Var = this.d;
        apd apdVar = this.c;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                xu30Var.invoke(apdVar, 0, ouk0Var);
                break;
            default:
                xu30Var.invoke(apdVar, 0, ouk0Var);
                break;
        }
        return rih1Var;
    }
}
