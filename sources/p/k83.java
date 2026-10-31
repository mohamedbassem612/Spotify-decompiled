package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k83 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k83(wto wtoVar, byte b) {
        super(1);
        this.a = b;
        this.b = wtoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wto wtoVar = this.b;
        switch (b) {
            case 0:
                uv11 uv11Var = (uv11) obj;
                return new yjo(wtoVar.a, uv11Var.b, uv11Var.a);
            case 1:
                return new bll(wtoVar.a);
            case 2:
                return new b83(wtoVar.a);
            case 3:
                return Collections.singleton(wtoVar.a);
            case 4:
                return new lzv0(wtoVar.a);
            case 5:
                return Collections.singleton(wtoVar.a);
            case 6:
                return Collections.singleton(wtoVar.a);
            default:
                return new uiv0(1, wtoVar.f.d, (String) obj, 1);
        }
    }
}
