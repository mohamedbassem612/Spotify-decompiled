package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ahh extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c861 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahh(c861 c861Var, byte b) {
        super(0);
        this.a = b;
        this.b = c861Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c861 c861Var = this.b;
        switch (b) {
            case 0:
                c861Var.invoke(zgh.a);
                break;
            default:
                c861Var.invoke(zgh.c);
                break;
        }
        return rih1Var;
    }
}
