package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cvo extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvo(bvo bvoVar, byte b) {
        super(3);
        this.a = b;
        this.b = bvoVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bvo bvoVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                w4i1 w4i1Var = bvoVar.c.a;
                String str = w4i1Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                bmq0.a(uri, (qim0) null, hcx.e, w4i1Var.a, w4i1Var.b, bro1.q(w4i1Var.d), 0L, false, b0kVar, 384, 194);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = bvoVar.c.a.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).c, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
