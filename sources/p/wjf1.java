package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wjf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rjf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjf1(rjf1 rjf1Var, byte b) {
        super(3);
        this.a = b;
        this.b = rjf1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rjf1 rjf1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = rjf1Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                String str2 = rjf1Var.a;
                String str3 = rjf1Var.b;
                bmq0.a(uri, (qim0) null, hcx.d, str2, str3 == null ? str2 : str3, 0L, 0L, false, b0kVar, 384, 226);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str4 = rjf1Var.b;
                if (str4 == null) {
                    str4 = rjf1Var.a;
                }
                uwo1.e(str4, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
