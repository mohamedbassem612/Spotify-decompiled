package p;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o7v extends CharacterStyle implements UpdateAppearance {
    public final DrawStyle a;

    public o7v(DrawStyle drawStyle) {
        this.a = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            z520 z520Var = z520.a;
            DrawStyle drawStyle = this.a;
            if (u890.j(drawStyle, z520Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof phc1)) {
                eg.o();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            phc1 phc1Var = (phc1) drawStyle;
            textPaint.setStrokeWidth(phc1Var.a);
            textPaint.setStrokeMiter(phc1Var.b);
            int i = phc1Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = phc1Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            uw4 uw4Var = phc1Var.e;
            textPaint.setPathEffect(uw4Var != null ? uw4Var.a : null);
        }
    }
}
