package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class js70 extends hab0 implements iu30 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ i3 f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ drr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js70(Bitmap bitmap, float f, float f2, int i, int i2, i3 i3Var, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3) {
        super(1);
        this.a = bitmap;
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = i2;
        this.f = i3Var;
        this.g = drr0Var;
        this.h = drr0Var2;
        this.i = drr0Var3;
    }

    public final Object invoke(Object obj) {
        u84 u84VarP = ((DrawScope) obj).a1().p();
        Matrix matrix = new Matrix();
        drr0 drr0Var = this.g;
        matrix.postScale(drr0Var.s(), drr0Var.s());
        drr0 drr0Var2 = this.h;
        float fS = drr0Var2.s();
        drr0 drr0Var3 = this.i;
        matrix.postTranslate(fS, drr0Var3.s());
        Canvas canvas = v84.a;
        u84VarP.a.drawBitmap(this.a, matrix, null);
        float fS2 = drr0Var.s() * this.b;
        float fAbs = Math.abs(drr0Var2.s()) / fS2;
        float f = this.c / fS2;
        float f2 = this.d;
        float fO = yoi1.o(fAbs + f, 0.0f, f2);
        float fAbs2 = Math.abs(drr0Var3.s()) / fS2;
        float f3 = this.e;
        this.f.invoke(new RectF(fAbs / f2, fAbs2 / f3, fO / f2, yoi1.o(f + fAbs2, 0.0f, f3) / f3));
        return rih1.a;
    }
}
