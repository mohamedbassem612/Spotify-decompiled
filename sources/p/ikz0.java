package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ikz0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fkz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ikz0(fkz0 fkz0Var, byte b) {
        super(3);
        this.a = b;
        this.b = fkz0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fkz0 fkz0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                as80 as80Var = mif1.P0;
                String str = fkz0Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                nkx nkxVar = nkx.c;
                nux nuxVar = new nux(nkxVar, nkxVar);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                eso1.e(uri, isl.a, xcg1.k(cbx.a, i1p1.q(nim0.a, er31.b(4.0f))), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073741872, 0, 3512);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = fkz0Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                break;
        }
        return rih1Var;
    }
}
