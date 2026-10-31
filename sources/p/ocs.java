package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ocs extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tcs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocs(tcs tcsVar, byte b) {
        super(0);
        this.a = b;
        this.b = tcsVar;
    }

    public final Object invoke() {
        byte b = this.a;
        tcs tcsVar = this.b;
        switch (b) {
            case 0:
                return (ww9) tcsVar.V0.get();
            default:
                return tcsVar.c1.a(tcsVar);
        }
    }
}
