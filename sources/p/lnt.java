package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnt extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kkt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnt(kkt kktVar, byte b) {
        super(0);
        this.a = b;
        this.b = kktVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kkt kktVar = this.b;
        switch (b) {
            case 0:
                return cwl1.F((q7r0) kktVar.b);
            default:
                return cwl1.B((q7r0) kktVar.b);
        }
    }
}
