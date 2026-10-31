package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qqc extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ scx b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqc(scx scxVar, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = scxVar;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        scx scxVar = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                scxVar.a();
                break;
            case 1:
                ven0Var.setValue(l16.a);
                scxVar.a();
                break;
            default:
                ven0Var.setValue(m16.a);
                scxVar.a();
                break;
        }
        return rih1Var;
    }
}
