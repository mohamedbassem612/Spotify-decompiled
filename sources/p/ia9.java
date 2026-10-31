package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ia9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia9(int i, byte b) {
        super(0);
        this.a = b;
        this.b = i;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new err0(i);
            case 1:
                return bin.C(i);
            case 2:
                return new q8z0(i);
            case 3:
                return new dl71(i);
            default:
                return new err0(i);
        }
    }
}
