package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1i1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ p1i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1i1(iu30 iu30Var, p1i1 p1i1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = p1i1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p1i1 p1i1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new l1i1(p1i1Var.d.b));
                break;
            default:
                iu30Var.invoke(new m1i1(p1i1Var.e.b));
                break;
        }
        return rih1Var;
    }
}
