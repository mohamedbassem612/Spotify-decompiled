package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zai0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zai0(yqg yqgVar, byte b) {
        super(0);
        this.a = b;
        this.b = yqgVar;
    }

    public final Object invoke() {
        byte b = this.a;
        yqg yqgVar = this.b;
        switch (b) {
            case 0:
                return Long.valueOf(yqgVar != null ? yqgVar.b() : 0L);
            default:
                return Long.valueOf(yqgVar.b());
        }
    }
}
