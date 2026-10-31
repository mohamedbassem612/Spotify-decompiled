package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uae extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ db b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uae(db dbVar, byte b) {
        super(0);
        this.a = b;
        this.b = dbVar;
    }

    public final Object invoke() {
        byte b = this.a;
        yae yaeVar = yae.b;
        rih1 rih1Var = rih1.a;
        db dbVar = this.b;
        switch (b) {
            case 0:
                dbVar.invoke(yae.a);
                break;
            case 1:
                dbVar.invoke(yaeVar);
                break;
            default:
                dbVar.invoke(yaeVar);
                break;
        }
        return rih1Var;
    }
}
