package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i7e extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ h7e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7e(iu30 iu30Var, h7e h7eVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = h7eVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h7e h7eVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new f7e(h7eVar.b));
                break;
            default:
                iu30Var.invoke(new f7e(h7eVar.b));
                break;
        }
        return rih1Var;
    }
}
