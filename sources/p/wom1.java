package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wom1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oom1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wom1(oom1 oom1Var, byte b) {
        super(3);
        this.a = b;
        this.b = oom1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oom1 oom1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = oom1Var.d;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                ltx ltxVar = ltx.c;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, b0kVar, 1073741872, 0, 3580);
                break;
            case 1:
                ((Number) obj3).intValue();
                bqn1.n(oom1Var.e, (b0k) obj2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                bqn1.r(oom1Var, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                bqn1.s(oom1Var, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
