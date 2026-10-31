package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lr6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kb6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr6(kb6 kb6Var, byte b) {
        super(3);
        this.a = b;
        this.b = kb6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kb6 kb6Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = kb6Var.c;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                nkx nkxVar = nkx.c;
                nux nuxVar = new nux(nkxVar, nkxVar);
                eso1.e(uri, isl.a, i1p1.q(nim0.a, er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073766448, 0, 3560);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(kb6Var.b, null, null, 0L, null, null, 2, false, new cjc0(1), 0, null, (b0k) obj2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
