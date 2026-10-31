package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyk1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Function0) obj).invoke();
                return rih1.a;
            case 1:
                return ((kly0) obj).get();
            default:
                evm1 evm1Var = (evm1) obj;
                luk lukVar = evm1Var.G;
                if (lukVar != null) {
                    return (evm1) lukVar.e(new c44(evm1Var, (byte) 16));
                }
                return null;
        }
    }
}
