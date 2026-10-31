package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kos extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ los b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kos(los losVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = losVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        los losVar = this.b;
        switch (b) {
            case 0:
                losVar.b.remove(iu30Var);
                break;
            default:
                losVar.c.remove(iu30Var);
                break;
        }
        return rih1Var;
    }
}
