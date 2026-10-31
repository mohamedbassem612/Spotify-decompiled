package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ph50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dji0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph50(dji0 dji0Var, byte b) {
        super(3);
        this.a = b;
        this.b = dji0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dji0 dji0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = dji0Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                bmq0.a(uri, (qim0) null, hcx.d, dji0Var.b, dji0Var.a, 0L, 0L, false, b0kVar, 384, 226);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(dji0Var.a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
