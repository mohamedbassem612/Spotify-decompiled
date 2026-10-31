package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sb9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb9(String str, String str2, int i, String str3) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    if (str == null) {
                        str = "";
                    }
                    bmq0.a(Uri.parse(str), (qim0) null, hcx.e, this.c, this.d, 0L, 0L, false, x340Var2, 384, 226);
                }
                break;
            default:
                ((Number) obj2).intValue();
                oh80.d(str, this.c, this.d, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb9(String str, String str2, String str3) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
