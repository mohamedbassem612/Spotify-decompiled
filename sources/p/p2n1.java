package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p2n1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2n1(umo0 umo0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = umo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    public final Object invoke(Object obj, Object obj2) {
        Uri uri;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        umo0 umo0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str2 = umo0Var.b.a;
                    if (str2 == null) {
                        uri = Uri.EMPTY;
                    } else {
                        str = ihc1.y0(str2) ? null : str2;
                        if (str != null) {
                            uri = Uri.parse(str);
                        } else {
                            uri = Uri.EMPTY;
                        }
                    }
                    Uri uri2 = uri;
                    uri2.getClass();
                    bmq0.a(uri2, (qim0) null, (hcx) null, (String) null, umo0Var.b.b, 0L, 0L, false, x340Var2, 0, 238);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str3 = umo0Var.c.b;
                    str = ihc1.y0(str3) ? null : str3;
                    Uri uri3 = str != null ? Uri.parse(str) : Uri.EMPTY;
                    uri3.getClass();
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    p3v p3vVar = new p3v(48.0f);
                    hux huxVarS = irn1.S(umo0Var.c.c);
                    eso1.e(uri3, isl.a, null, p3vVar, null, null, null, null, null, new nux(huxVarS, huxVarS), false, false, x340Var4, 1073741872, 0, 3572);
                }
                break;
            default:
                ((Number) obj2).intValue();
                irn1.F(umo0Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2n1(umo0 umo0Var, byte b) {
        super(2);
        this.a = b;
        this.b = umo0Var;
    }
}
