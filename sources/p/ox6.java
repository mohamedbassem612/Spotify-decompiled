package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ox6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mx6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox6(mx6 mx6Var, byte b) {
        super(3);
        this.a = b;
        this.b = mx6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mx6 mx6Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = mx6Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                nkx nkxVar = nkx.c;
                eso1.e(uri, isl.a, i1p1.q(nim0.a, er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, b0kVar, 1073741872, 0, 3576);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = mx6Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
