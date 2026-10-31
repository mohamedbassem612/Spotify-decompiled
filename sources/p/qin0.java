package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qin0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oin0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qin0(oin0 oin0Var, byte b) {
        super(2);
        this.a = b;
        this.b = oin0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        min0 min0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eso1.e(Uri.parse(((lin0) min0Var).a), isl.a, anm1.N("npb-companion-image", i1p1.q(nim0Var, er31.b(4.0f))), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, true, x340Var2, 48, 48, 1528);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    q7f0.a("companionContentNPB", min0Var.a, null, anm1.N("npb-companion-looping-video", i1p1.q(nim0Var, er31.b(4.0f))), b3k1.c, false, x340Var4, 24966, 32);
                }
                break;
        }
        return rih1Var;
    }
}
