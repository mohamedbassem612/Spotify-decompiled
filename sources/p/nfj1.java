package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nfj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zej1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfj1(iu30 iu30Var, zej1 zej1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = zej1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zej1 zej1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new sej1(zej1Var.e, zej1Var.k, zej1Var.m));
                break;
            case 1:
                iu30Var.invoke(new uej1(zej1Var.e, zej1Var.t));
                break;
            default:
                iu30Var.invoke(new tej1(zej1Var.e, zej1Var.n, zej1Var.v));
                break;
        }
        return rih1Var;
    }
}
