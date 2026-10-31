package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxi1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t8r0 b;
    public final /* synthetic */ yoi1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxi1(t8r0 t8r0Var, yoi1 yoi1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = t8r0Var;
        this.c = yoi1Var;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        oyi1 oyi1Var = this.c;
        t8r0 t8r0Var = this.b;
        switch (b) {
            case 0:
                String str = ((lyi1) oyi1Var).h;
                iu30Var.invoke(new jwi1(str, t8r0Var.j(new qu80(str))));
                break;
            default:
                String str2 = oyi1Var.h;
                iu30Var.invoke(new pwi1(str2, t8r0Var.j(new ev80(str2))));
                break;
        }
        return rih1Var;
    }
}
