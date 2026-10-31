package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b7a extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7a(g7a g7aVar, byte b) {
        super(0);
        this.a = b;
        this.b = g7aVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g7a g7aVar = this.b;
        switch (b) {
            case 0:
                z7a z7aVar = g7aVar.i;
                if (z7aVar != null) {
                    z7aVar.a();
                }
                g7aVar.i = null;
                break;
            default:
                z7a z7aVar2 = g7aVar.i;
                if (z7aVar2 != null) {
                    z7aVar2.a();
                }
                g7aVar.i = null;
                break;
        }
        return rih1Var;
    }
}
