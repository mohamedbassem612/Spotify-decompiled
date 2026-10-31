package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nds extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ods b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nds(ods odsVar, byte b) {
        super(0);
        this.a = b;
        this.b = odsVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ods odsVar = this.b;
        switch (b) {
            case 0:
                odsVar.b.c("");
                break;
            case 1:
                odsVar.b.c("");
                break;
            default:
                odsVar.f(1, "");
                break;
        }
        return rih1Var;
    }
}
