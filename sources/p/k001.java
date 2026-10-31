package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k001 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j001 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k001(j001 j001Var, byte b) {
        super(3);
        this.a = b;
        this.b = j001Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j001 j001Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = j001Var.d;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                ltx ltxVar = ltx.c;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, b0kVar, 1073741872, 0, 3580);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = j001Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                uwr uwrVar = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                break;
        }
        return rih1Var;
    }
}
