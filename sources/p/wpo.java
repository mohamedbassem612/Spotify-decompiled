package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wpo implements LeadingMarginSpan {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public wpo(float f, float f2, float f3, wat watVar, float f4) {
        this.a = f;
        this.b = f2;
        int iU = jch0.U(f + f3);
        this.c = iU;
        this.d = jch0.U(f4) - iU;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [p.vpo] */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Integer numValueOf;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.c;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
        ?? r2 = new Function0(this) { // from class: p.vpo
            public final Object invoke() {
                long j = jFloatToRawIntBits;
                float fE = Size.e(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
                vq31 vq31VarF = ila0.f(anm1.g(0L, j), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new jtq0(vq31VarF);
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (ila0.w(vq31VarF)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (vq31VarF.e >> 32));
                    canvas2.drawRoundRect(f2, f3 - (vq31VarF.a() / 2.0f), (vq31VarF.b() * i2) + f2, (vq31VarF.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    tw4 tw4VarA = ww4.a();
                    tw4VarA.e(vq31VarF, 1);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (vq31VarF.a() / 2.0f));
                    canvas2.drawPath(tw4VarA.a, paint2);
                    canvas2.restore();
                }
                return rih1.a;
            }
        };
        if (Float.isNaN(Float.NaN)) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Double.NaN));
        }
        r2.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.d;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
