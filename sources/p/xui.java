package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xui extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ kka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xui(iu30 iu30Var, kka kkaVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = kkaVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kka kkaVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new uym1(kkaVar.d));
                break;
            case 1:
                iu30Var.invoke(new teb0(kkaVar.d));
                break;
            case 2:
                iu30Var.invoke(new uym1(kkaVar.d));
                break;
            default:
                iu30Var.invoke(new tf91(kkaVar.d));
                break;
        }
        return rih1Var;
    }
}
