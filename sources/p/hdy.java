package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hdy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zeu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdy(zeu zeuVar, byte b) {
        super(0);
        this.a = b;
        this.b = zeuVar;
    }

    public final Object invoke() {
        byte b = this.a;
        zeu zeuVar = this.b;
        switch (b) {
            case 0:
                return ((gdy) zeuVar.a).findViewById(2131427733);
            default:
                return ((gdy) zeuVar.a).findViewById(2131428692);
        }
    }
}
