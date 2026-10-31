package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jqw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqw(kqw kqwVar, byte b) {
        super(0);
        this.a = b;
        this.b = kqwVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kqw kqwVar = this.b;
        switch (b) {
            case 0:
                return kqwVar.d;
            default:
                return hap1.w(kqwVar.a);
        }
    }
}
