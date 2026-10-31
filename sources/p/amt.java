package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class amt extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ amt(wlt wltVar, byte b) {
        super(3);
        this.a = b;
        this.b = wltVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wlt wltVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ult ultVar = wltVar instanceof ult ? (ult) wltVar : null;
                Uri uri = ultVar != null ? Uri.parse(ultVar.c) : Uri.EMPTY;
                uri.getClass();
                eso1.e(uri, isl.a, null, null, null, null, mif1.P0, null, null, null, false, false, b0kVar, 3120, 0, 4020);
                break;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                ult ultVar2 = wltVar instanceof ult ? (ult) wltVar : null;
                String str = ultVar2 != null ? ultVar2.a : null;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (str2.length() <= 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(2019099189);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(2018881042);
                    uwr uwrVar = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var3).k, cbx.a(x340Var3).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var3, 0, 0, 1778);
                    x340Var3.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
