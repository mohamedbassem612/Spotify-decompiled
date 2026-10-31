package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zgt implements Function0 {
    public final /* synthetic */ byte a;
    public final cht b;
    public final g6b0 c;

    public /* synthetic */ zgt(cht chtVar, g6b0 g6b0Var, byte b) {
        this.a = b;
        this.b = chtVar;
        this.c = g6b0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        g6b0 g6b0Var = this.c;
        cht chtVar = this.b;
        switch (b) {
            case 0:
                ce0 ce0Var = chtVar.a.b;
                mma0 mma0Var = fht.Y[0];
                return ihc1.Z0(((lfg) ((sgp0) ce0Var).a).b(g6b0Var.k(rfb1.C), chtVar), "Collection");
            default:
                ce0 ce0Var2 = chtVar.a.b;
                mma0 mma0Var2 = fht.Y[0];
                return ihc1.Z0(((lfg) ((sgp0) ce0Var2).a).b(g6b0Var.l("Array"), chtVar), "Array");
        }
    }
}
