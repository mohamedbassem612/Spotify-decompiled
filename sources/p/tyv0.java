package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tyv0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ syv0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyv0(iu30 iu30Var, syv0 syv0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = syv0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        syv0 syv0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new pyv0(syv0Var.d));
                break;
            default:
                iu30Var.invoke(new qyv0(syv0Var, 2));
                break;
        }
        return rih1Var;
    }
}
