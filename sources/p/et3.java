package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class et3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ft3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et3(ft3 ft3Var, byte b) {
        super(0);
        this.a = b;
        this.b = ft3Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ft3 ft3Var = this.b;
        switch (b) {
            case 0:
                ft3Var.e.invoke(n051.a);
                ft3Var.d.d.invoke("");
                break;
            default:
                ft3Var.e.invoke(iz41.a);
                break;
        }
        return rih1Var;
    }
}
