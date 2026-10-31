package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bzi extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a0g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzi(a0g a0gVar, byte b) {
        super(3);
        this.a = b;
        this.b = a0gVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        a0g a0gVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                f2g f2gVar = a0gVar.b;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    String str = f2gVar.b;
                    if (str == null) {
                        str = "";
                    }
                    Uri uri = Uri.parse(str);
                    String str2 = f2gVar.a;
                    Integer num = f2gVar.c;
                    bmq0.a(uri, (qim0) null, hcx.d, (String) null, str2, num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.k, 0L, false, x340Var2, 384, 202);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str3 = a0gVar.b.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str3, (qim0) null, cbx.d(x340Var4).g, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1722);
                }
                break;
        }
        return rih1Var;
    }
}
