package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cpc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpc0(g2z g2zVar, byte b) {
        super(0);
        this.a = b;
        this.b = g2zVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g2z g2zVar = this.b;
        switch (b) {
            case 0:
                return new bpc0(g2zVar, (byte) 0);
            default:
                return new bpc0(g2zVar, (byte) 1);
        }
    }
}
