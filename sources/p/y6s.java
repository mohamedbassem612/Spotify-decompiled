package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6s(goq goqVar, byte b) {
        super(0);
        this.a = b;
        this.b = goqVar;
    }

    public final Object invoke() {
        byte b = this.a;
        goq goqVar = this.b;
        switch (b) {
            case 0:
                return ((gj5) goqVar.b).getString(2131958183);
            case 1:
                return ((gj5) goqVar.b).getString(2131958184);
            case 2:
                return ((gj5) goqVar.b).getString(2131958185);
            default:
                return ((gj5) goqVar.b).getString(2131958186);
        }
    }
}
