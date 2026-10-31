package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jjh extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kjh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjh(kjh kjhVar, byte b) {
        super(0);
        this.a = b;
        this.b = kjhVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kjh kjhVar = this.b;
        switch (b) {
            case 0:
                kjhVar.Z.onNext(vkh.a);
                return rih1.a;
            default:
                return Boolean.valueOf(kjhVar.R0);
        }
    }
}
