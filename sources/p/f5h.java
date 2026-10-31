package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f5h extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ e5h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5h(iu30 iu30Var, e5h e5hVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = e5hVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e5h e5hVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new x4h(e5hVar.a));
                break;
            case 1:
                iu30Var.invoke(new z4h(e5hVar.a));
                break;
            case 2:
                iu30Var.invoke(new y4h(e5hVar.a));
                break;
            default:
                iu30Var.invoke(new x4h(e5hVar.a));
                break;
        }
        return rih1Var;
    }
}
