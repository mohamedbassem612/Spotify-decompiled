package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sdg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdg(ohd ohdVar, byte b) {
        super(0);
        this.a = b;
        this.b = ohdVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(rdg.a);
                }
                break;
            case 1:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(rdg.b);
                }
                break;
            case 2:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(rdg.c);
                }
                break;
            case 3:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(rih1Var);
                }
                break;
            case 4:
                ohdVar.resumeWith(Boolean.FALSE);
                break;
            case 5:
                ohdVar.resumeWith(Boolean.FALSE);
                break;
            default:
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(is1.a);
                }
                break;
        }
        return rih1Var;
    }
}
