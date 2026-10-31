package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class re31 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re31(ne31 ne31Var, byte b) {
        super(3);
        this.a = b;
        this.b = ne31Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ne31 ne31Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = ne31Var.c;
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                eso1.e(uri2, isl.a, u291.r(nim0.a, 32.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar, 3120, 0, 4080);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = ne31Var.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                break;
        }
        return rih1Var;
    }
}
