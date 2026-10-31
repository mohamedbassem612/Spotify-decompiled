package p;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class due1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public due1(float f, float f2, float f3, float f4, long j) {
        super(1);
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        tw4 tw4VarA = ww4.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f = this.d;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        float f2 = this.b;
        float f3 = this.c;
        tw4VarA.e(ila0.g(f2, 0.0f, f3, fIntBitsToFloat, jFloatToRawIntBits), 1);
        tw4 tw4VarA2 = ww4.a();
        float fX0 = drawScope.X0(14.0f);
        float f4 = f2 + fX0;
        float f5 = f3 - fX0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f6 = this.e;
        float f7 = fIntBitsToFloat2 - f6;
        if (Float.isNaN(f4) || Float.isNaN(f6) || Float.isNaN(f5) || Float.isNaN(f7)) {
            ww4.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = tw4VarA2.b;
        if (rectF == null) {
            rectF = new RectF();
            tw4VarA2.b = rectF;
        }
        rectF.set(f4, f6, f5, f7);
        Path path = tw4VarA2.a;
        RectF rectF2 = tw4VarA2.b;
        rectF2.getClass();
        path.addRect(rectF2, ww4.c(1));
        tw4VarA.l(tw4VarA, tw4VarA2, 0);
        DrawScope.w0(drawScope, tw4VarA, this.a, (DrawStyle) null, 60);
        return rih1.a;
    }
}
