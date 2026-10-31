package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z7m extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kes b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7m(kes kesVar, byte b) {
        super(0);
        this.a = b;
        this.b = kesVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kes kesVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((err0) ((jkr0) kesVar).d.c).s());
            default:
                return Integer.valueOf(kesVar.o());
        }
    }
}
