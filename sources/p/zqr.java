package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqr extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqr(oyn oynVar, byte b) {
        super(3);
        this.a = b;
        this.b = oynVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oyn oynVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                eso1.e(Uri.parse(oynVar.h), isl.a, nim0.a, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 432, 0, 4088);
                break;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(oynVar.e, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(oynVar.d, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
