package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gks extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hks b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gks(hks hksVar, byte b) {
        super(0);
        this.a = b;
        this.b = hksVar;
    }

    public final Object invoke() {
        byte b = this.a;
        hks hksVar = this.b;
        switch (b) {
            case 0:
                p7s p7sVar = hksVar.a;
                w2z w2zVar = hksVar.f;
                w2zVar.getClass();
                p7sVar.e(w2zVar);
                return rih1.a;
            default:
                q8n q8nVar = hksVar.d;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return flo1.l(q8nVar, j0d1VarB);
        }
    }
}
