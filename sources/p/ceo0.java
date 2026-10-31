package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ceo0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eeo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ceo0(eeo0 eeo0Var, byte b) {
        super(3);
        this.a = b;
        this.b = eeo0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eeo0 eeo0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(eeo0Var.b);
                qim0 qim0VarQ = i1p1.q(nim0.a, er31.b(4.0f));
                grx grxVar = grx.c;
                nux nuxVar = new nux(grxVar, grxVar);
                eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, (b0k) obj2, 1073741872, 0, 3576);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = eeo0Var.d;
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 2, false, new cjc0(1), 0, null, b0kVar, 0, 0, 1714);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = eeo0Var.c;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar2).j, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1722);
                break;
        }
        return rih1Var;
    }
}
