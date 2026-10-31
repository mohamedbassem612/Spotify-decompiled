package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gyr0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyr0(xxr0 xxr0Var, byte b) {
        super(3);
        this.a = b;
        this.b = xxr0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hux huxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xxr0 xxr0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                hyr0.a(xxr0Var, (b0k) obj2, 0);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                hyr0.e(xxr0Var, (b0k) obj2, 0);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                hyr0.f(xxr0Var, (b0k) obj2, 0);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.EMPTY;
                int i = xxr0Var.b;
                int iC = l1d.C(i);
                if (iC == 0) {
                    huxVar = ltx.c;
                } else if (iC == 1) {
                    huxVar = nkx.c;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    huxVar = pkx.c;
                }
                nux nuxVar = new nux(huxVar, huxVar);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                eso1.e(uri, isl.a, i1p1.q(u291.r(nim0.a, 48.0f), hyr0.g(b0kVar, i)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073741872, 0, 3576);
                return rih1Var;
        }
    }
}
