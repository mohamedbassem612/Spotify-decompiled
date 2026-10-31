package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kni1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ b5i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kni1(iu30 iu30Var, b5i1 b5i1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = b5i1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b5i1 b5i1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(b5i1Var.getUsername());
                return Boolean.TRUE;
            default:
                iu30Var.invoke(b5i1Var.getUsername());
                return rih1.a;
        }
    }
}
