package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pwx0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ hdn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwx0(iu30 iu30Var, List list, hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = list;
        this.d = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        err0 err0Var = this.d;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(mwx0.a);
                err0 err0Var2 = err0Var;
                err0Var2.t((err0Var2.s() + (-1) < 0 ? list.size() : err0Var2.s()) - 1);
                break;
            default:
                iu30Var.invoke(lwx0.a);
                err0 err0Var3 = err0Var;
                err0Var3.t((err0Var3.s() + 1) % list.size());
                break;
        }
        return rih1Var;
    }
}
