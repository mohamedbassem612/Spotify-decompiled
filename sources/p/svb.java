package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class svb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivo0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svb(ivo0 ivo0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ivo0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ivo0 ivo0Var = this.b;
        switch (b) {
            case 0:
                ivo0Var.a(hv80.e);
                iu30Var.invoke(jlk.a);
                break;
            default:
                ivo0Var.a(hv80.f);
                iu30Var.invoke(ilk.a);
                break;
        }
        return rih1Var;
    }
}
