package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wuk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbp0(wuk wukVar, byte b) {
        super(0);
        this.a = b;
        this.b = wukVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wuk wukVar = this.b;
        switch (b) {
            case 0:
                return wukVar.q;
            case 1:
                return wukVar.l;
            default:
                return wukVar.i;
        }
    }
}
