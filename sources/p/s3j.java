package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ beo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3j(beo0 beo0Var, byte b) {
        super(3);
        this.a = b;
        this.b = beo0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        beo0 beo0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(beo0Var.b);
                qim0 qim0VarQ = i1p1.q(nim0.a, er31.b(4.0f));
                grx grxVar = grx.c;
                nux nuxVar = new nux(grxVar, grxVar);
                eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, (b0k) obj2, 1073741872, 0, 3576);
                break;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(beo0Var.d, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(beo0Var.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
