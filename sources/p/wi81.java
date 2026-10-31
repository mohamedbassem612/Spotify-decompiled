package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wi81 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aj81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi81(aj81 aj81Var, byte b) {
        super(3);
        this.a = b;
        this.b = aj81Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aj81 aj81Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                kiv kivVar = jv71.a;
                qim0 qim0VarI = zr7.i(nim0.a, new kk11(3, (byte) 5));
                Uri uri = aj81Var.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                String str2 = aj81Var.a;
                String str3 = str2 == null ? "" : str2;
                String str4 = aj81Var.c;
                String str5 = str4 == null ? "" : str4;
                u7h u7hVar = aj81Var.d;
                if (u7hVar != null) {
                    j = u7hVar.a;
                } else {
                    uwr uwrVar = cbx.a;
                    j = ((yex) zex.a.d).c;
                }
                bmq0.a(uri2, qim0VarI, (hcx) null, str3, str5, j, 0L, false, b0kVar, 0, 196);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str6 = aj81Var.c;
                if (str6 == null) {
                    String str7 = aj81Var.a;
                    str = str7 == null ? "" : str7;
                } else {
                    str = str6;
                }
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1722);
                break;
        }
        return rih1Var;
    }
}
