package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x9n extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9n(xfx xfxVar, byte b) {
        super(0);
        this.a = b;
        this.b = xfxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                wfx wfxVar = xfxVar.c;
                return new nqr(new b2c(wfxVar.b, wfxVar.a), null, null, null);
            case 1:
                return new yir(xfxVar.c.b, (byte) 25);
            default:
                return new yir(xfxVar.c.b, (byte) 25);
        }
    }
}
