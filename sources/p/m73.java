package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m73 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m73(xfx xfxVar, byte b) {
        super(1);
        this.a = b;
        this.b = xfxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                return new nzj(xfxVar.b.a, u5i.a);
            case 1:
                Context context = xfxVar.b.a;
                return yb10.d != o810.d ? new nzj(context, fqi.b) : new nzj(context, fqi.a);
            case 2:
                return new nzj(xfxVar.b.a, fqi.a);
            default:
                return new h98(xfxVar.f.a, (byte) 7);
        }
    }
}
