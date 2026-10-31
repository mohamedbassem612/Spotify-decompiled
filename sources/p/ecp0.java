package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ecp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z2t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ecp0(z2t z2tVar, byte b) {
        super(0);
        this.a = b;
        this.b = z2tVar;
    }

    public final Object invoke() {
        byte b = this.a;
        z2t z2tVar = this.b;
        switch (b) {
            case 0:
                return z2tVar.t3;
            default:
                return z2tVar.e1;
        }
    }
}
