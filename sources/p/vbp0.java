package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbp0(r2t r2tVar, byte b) {
        super(0);
        this.a = b;
        this.b = r2tVar;
    }

    public final Object invoke() {
        byte b = this.a;
        r2t r2tVar = this.b;
        switch (b) {
            case 0:
                return r2tVar.p();
            case 1:
                return r2tVar.b();
            default:
                return r2tVar.d();
        }
    }
}
