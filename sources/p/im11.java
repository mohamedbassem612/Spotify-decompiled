package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class im11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im11(fob1 fob1Var, byte b) {
        super(3);
        this.a = b;
        this.b = fob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fob1 fob1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                String str = fob1Var.e;
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    if (str == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    objT = uri;
                    x340Var.s0(objT);
                }
                Uri uri2 = (Uri) objT;
                uri2.getClass();
                grx grxVar = grx.c;
                eso1.e(uri2, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(grxVar, grxVar), false, false, x340Var, 1073966128, 0, 3524);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = fob1Var.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1722);
                break;
        }
        return rih1Var;
    }
}
