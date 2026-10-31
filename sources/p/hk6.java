package p;

import android.graphics.Canvas;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hk6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Brush b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk6(Brush brush, byte b) {
        super(1);
        this.a = b;
        this.b = brush;
    }

    public void a(lsl lslVar) {
        u84 u84VarP = lslVar.a1().p();
        Canvas canvas = v84.a;
        Canvas canvas2 = u84VarP.a;
        int iSaveLayer = canvas2.saveLayer(null, null);
        lslVar.s1();
        DrawScope.drawRect-0a6MmAQ$default(lslVar, this.b, (Offset) null, (Size) null, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62, (Object) null);
        canvas2.restoreToCount(iSaveLayer);
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Brush brush = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.S0(lslVar, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 5, 62);
                return rih1Var;
            case 1:
                return ((eqc) obj).b(new hk6(brush, (byte) 0));
            case 2:
                a((lsl) obj);
                return rih1Var;
            case 3:
                return ((eqc) obj).b(new hk6(brush, (byte) 2));
            case 4:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.S0(lslVar2, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            default:
                lsl lslVar3 = (lsl) obj;
                lslVar3.s1();
                DrawScope.S0(lslVar3, this.b, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
        }
    }
}
