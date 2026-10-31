package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zut extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zut(bvt bvtVar, byte b) {
        super(0);
        this.a = b;
        this.b = bvtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bvt bvtVar = this.b;
        switch (b) {
            case 0:
                bvtVar.d = null;
                bvtVar.e.clear();
                break;
            default:
                bvtVar.e.clear();
                break;
        }
        return rih1Var;
    }
}
