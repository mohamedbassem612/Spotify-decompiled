package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gcj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcj(nx01 nx01Var, byte b) {
        super(3);
        this.a = b;
        this.b = nx01Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nx01 nx01Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(nx01Var.d);
                as80 as80Var = mif1.P0;
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, (b0k) obj2, 3120, 0, 4020);
                break;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(nx01Var.e, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(nx01Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 1982);
                break;
        }
        return rih1Var;
    }
}
