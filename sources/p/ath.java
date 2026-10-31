package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ath extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Paint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ath(float f, float f2, float f3, Paint paint) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = paint;
    }

    public final Object invoke(Object obj) {
        u84 u84VarP = ((DrawScope) obj).a1().p();
        Canvas canvas = v84.a;
        u84VarP.a.drawCircle(this.a, this.b, this.c, this.d);
        return rih1.a;
    }
}
