package p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o6a1 extends hba {
    public final RectF C;
    public final p9b0 D;
    public final float[] E;
    public final Path F;
    public final qkb0 G;
    public isi1 H;
    public isi1 I;

    public o6a1(cdf0 cdf0Var, qkb0 qkb0Var) {
        super(cdf0Var, qkb0Var);
        this.C = new RectF();
        p9b0 p9b0Var = new p9b0();
        this.D = p9b0Var;
        this.E = new float[8];
        this.F = new Path();
        this.G = qkb0Var;
        p9b0Var.setAlpha(0);
        p9b0Var.setStyle(Paint.Style.FILL);
        p9b0Var.setColor(qkb0Var.l);
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qkb0 qkb0Var = this.G;
        float f = qkb0Var.j;
        float f2 = qkb0Var.k;
        RectF rectF2 = this.C;
        rectF2.set(0.0f, 0.0f, f, f2);
        ((hba) this).n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        if (obj == ndf0.F) {
            if (j2e0Var == null) {
                this.H = null;
                return;
            } else {
                this.H = new isi1((Object) null, j2e0Var);
                return;
            }
        }
        if (obj == 1) {
            if (j2e0Var != null) {
                this.I = new isi1((Object) null, j2e0Var);
                return;
            }
            this.I = null;
            this.D.setColor(this.G.l);
        }
    }

    public final void j(Canvas canvas, Matrix matrix, int i) {
        qkb0 qkb0Var = this.G;
        int iAlpha = Color.alpha(qkb0Var.l);
        if (iAlpha == 0) {
            return;
        }
        isi1 isi1Var = this.I;
        Integer num = isi1Var == null ? null : (Integer) isi1Var.e();
        p9b0 p9b0Var = this.D;
        if (num != null) {
            p9b0Var.setColor(num.intValue());
        } else {
            p9b0Var.setColor(qkb0Var.l);
        }
        fba fbaVar = ((hba) this).w.j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (fbaVar == null ? 100 : ((Integer) fbaVar.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        p9b0Var.setAlpha(iIntValue);
        isi1 isi1Var2 = this.H;
        if (isi1Var2 != null) {
            p9b0Var.setColorFilter((ColorFilter) isi1Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = qkb0Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = qkb0Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, p9b0Var);
        }
    }
}
