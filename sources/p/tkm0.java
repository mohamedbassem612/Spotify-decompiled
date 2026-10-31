package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tkm0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ okm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkm0(okm0 okm0Var, byte b) {
        super(3);
        this.a = b;
        this.b = okm0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nkm0 nkm0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(nkm0Var.d);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                cua cuaVar2 = cbx.b(b0kVar).f;
                qim0 qim0VarK = xcg1.k(cbx.a, u291.f(i1p1.q(nim0.a, new zvx()), 1.0f));
                as80 as80Var = mif1.P0;
                ltx ltxVar = ltx.c;
                eso1.e(uri, isl.a, qim0VarK, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, b0kVar, 1073741872, 0, 3512);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(nkm0Var.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
