package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n6p0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l6p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6p0(l6p0 l6p0Var, byte b) {
        super(3);
        this.a = b;
        this.b = l6p0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l6p0 l6p0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                qim0 qim0VarQ = i1p1.q(nim0.a, er31.b(4.0f));
                Uri uri = Uri.parse(l6p0Var.d);
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, b0kVar, ltx.d, 30);
                eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, b0kVar, 1073741872, 0, 3480);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(l6p0Var.c, null, null, 0L, null, null, 2, false, new cjc0(1), 0, null, (b0k) obj2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
