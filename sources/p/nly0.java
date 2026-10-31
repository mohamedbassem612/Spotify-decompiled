package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nly0 extends oxa {
    public final tlg e;
    public final idd1 f = new idd1(h0x0.S0);
    public final yrb1 g;

    public nly0(tlg tlgVar) {
        this.e = tlgVar;
        Pair pair = fwq0.a;
        Pair pair2 = fwq0.a;
        Pair pair3 = fwq0.c;
        Float fValueOf = Float.valueOf(0.0f);
        Pair pairCreate = Pair.create(fValueOf, fValueOf);
        dm5.m(-1.0f <= 0.0f && 0.0f <= 1.0f);
        this.g = new yrb1(Pair.create(fValueOf, fValueOf), pairCreate, pair3);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // p.oxa
    public final Bitmap a(long j) {
        String str;
        Bitmap bitmapCopy;
        Bitmap bitmap;
        Object next;
        tlg tlgVar = this.e;
        idd1 idd1Var = tlgVar.y;
        idd1 idd1Var2 = tlgVar.o;
        idd1 idd1Var3 = tlgVar.z;
        if (((List) idd1Var.getValue()).isEmpty() || j < 0) {
            str = null;
        } else {
            long j2 = (tlgVar.d.a * 1000) + j;
            Iterator it = ((List) tlgVar.y.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                rlg rlgVar = (rlg) next;
                long j3 = rlgVar.b;
                if (j2 < rlgVar.c && j3 <= j2) {
                    break;
                }
            }
            rlg rlgVar2 = (rlg) next;
            if (rlgVar2 != null) {
                str = rlgVar2.a;
            } else {
                str = null;
            }
        }
        if (str == null) {
            bitmap = (Bitmap) idd1Var3.getValue();
        } else if (str.equals(tlgVar.A)) {
            bitmap = tlgVar.D ? tlgVar.B : tlgVar.C;
            bitmap.getClass();
        } else {
            tlgVar.A = str;
            boolean z = tlgVar.D;
            tlgVar.D = !z;
            if (z) {
                bitmapCopy = tlgVar.C;
                if (bitmapCopy == null) {
                    bitmapCopy = ((Bitmap) idd1Var3.getValue()).copy(Bitmap.Config.ARGB_8888, true);
                    tlgVar.C = bitmapCopy;
                }
            } else {
                bitmapCopy = tlgVar.B;
                if (bitmapCopy == null) {
                    bitmapCopy = ((Bitmap) idd1Var3.getValue()).copy(Bitmap.Config.ARGB_8888, true);
                    tlgVar.B = bitmapCopy;
                }
            }
            Canvas canvas = new Canvas(bitmapCopy);
            bitmapCopy.eraseColor(0);
            canvas.drawBitmap((Bitmap) idd1Var3.getValue(), 0.0f, 0.0f, (Paint) null);
            float f = tlgVar.e;
            float f2 = 6.0f * f;
            float f3 = 3.583f * f;
            float f4 = 299.0f * f;
            float f5 = f2 * 2.0f;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, (TextPaint) idd1Var2.getValue(), f4 - f5, TextUtils.TruncateAt.END);
            float fMeasureText = ((TextPaint) idd1Var2.getValue()).measureText(charSequenceEllipsize, 0, charSequenceEllipsize.length());
            Paint.FontMetrics fontMetrics = ((TextPaint) idd1Var2.getValue()).getFontMetrics();
            float f6 = fontMetrics.descent - fontMetrics.ascent;
            float fMin = Math.min(fMeasureText + f5, f4);
            float f7 = (f3 * 2.0f) + f6;
            float f8 = ((tlgVar.f / 2.0f) + tlgVar.h) - (fMin / 2.0f);
            float fB = ((tlgVar.b() + tlgVar.g) - (f * 12.0f)) - f7;
            float f9 = fMin + f8;
            float f10 = f7 + fB;
            canvas.drawRoundRect(new RectF(f8, fB, f9, f10), f3, f3, (Paint) tlgVar.s.getValue());
            float f11 = (f3 + fB) - fontMetrics.ascent;
            canvas.save();
            canvas.clipRect(f8, fB, f9, f10);
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), f8 + f2, f11, (TextPaint) idd1Var2.getValue());
            canvas.restore();
            bitmap = bitmapCopy;
        }
        return bitmap == null ? (Bitmap) this.f.getValue() : bitmap;
    }

    @Override // p.oxa
    public final yrb1 b() {
        return this.g;
    }
}
