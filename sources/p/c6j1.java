package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c6j1 extends hab0 implements iu30 {
    public final /* synthetic */ Brush a;
    public final /* synthetic */ Paint b;
    public final /* synthetic */ Brush c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6j1(mic0 mic0Var, Paint paint, mic0 mic0Var2, float f, float f2) {
        super(1);
        this.a = mic0Var;
        this.b = paint;
        this.c = mic0Var2;
        this.d = f;
        this.e = f2;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        Brush brush = this.a;
        if (brush != null) {
            DrawScope.S0(drawScope, brush, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
        }
        Paint paint = this.b;
        if (paint != null) {
            u84 u84VarP = drawScope.a1().p();
            Canvas canvas = v84.a;
            Canvas canvas2 = u84VarP.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            float f = this.d;
            canvas2.drawRoundRect(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, f, f, paint);
        }
        Brush brush2 = this.c;
        if (brush2 != null) {
            float f2 = this.d;
            DrawScope.c0(drawScope, brush2, 0L, 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))), 0.0f, new phc1(this.e, 0.0f, 0, 1, (uw4) null, 22), 214);
        }
        return rih1.a;
    }
}
