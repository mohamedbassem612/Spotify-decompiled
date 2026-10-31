package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class slg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tlg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slg(tlg tlgVar, byte b) {
        super(0);
        this.a = b;
        this.b = tlgVar;
    }

    public final Object invoke() {
        StringBuilder sb;
        CharSequence string;
        byte b = this.a;
        tlg tlgVar = this.b;
        switch (b) {
            case 0:
                Typeface typefaceB = qx21.b(tlgVar.a, 2131296262);
                return typefaceB == null ? Typeface.create(Typeface.DEFAULT, 1) : typefaceB;
            case 1:
                TextPaint textPaint = new TextPaint(1);
                textPaint.setColor(-1);
                textPaint.setTextSize(tlgVar.e * 9.0f);
                textPaint.setTypeface((Typeface) tlgVar.k.getValue());
                return textPaint;
            case 2:
                n5f0 n5f0Var = tlgVar.d;
                if (n5f0Var.isEmpty()) {
                    return z6x.a;
                }
                return z561.k0(z561.X(tzf.Z, z561.T(new qna((byte) 6, n5f0Var.a * 1000, n5f0Var.b * 1000), new i46(tlgVar.c, (byte) 1))));
            case 3:
                float f = tlgVar.g;
                float f2 = tlgVar.e;
                float f3 = 8.0f * f2;
                return Float.valueOf((f2 * 12.0f) + (f2 * 4.0f) + f + f3 + ((StaticLayout) tlgVar.u.getValue()).getHeight() + ((StaticLayout) tlgVar.v.getValue()).getHeight() + f3);
            case 4:
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setColor(-1);
                textPaint2.setTextSize(tlgVar.e * 9.0f);
                textPaint2.setTypeface((Typeface) tlgVar.k.getValue());
                return textPaint2;
            case 5:
                TextPaint textPaint3 = new TextPaint(1);
                textPaint3.setColor(-1);
                textPaint3.setTextSize(tlgVar.e * 9.0f);
                textPaint3.setTypeface((Typeface) tlgVar.l.getValue());
                return textPaint3;
            case 6:
                Paint paint = new Paint(1);
                paint.setColor(tlgVar.j);
                return paint;
            case 7:
                Typeface typefaceB2 = qx21.b(tlgVar.a, 2131296269);
                return typefaceB2 == null ? Typeface.DEFAULT : typefaceB2;
            case 8:
                tlg tlgVar2 = this.b;
                idd1 idd1Var = tlgVar2.r;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1280, 1104, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f4 = tlgVar2.e;
                float f5 = 8.0f * f4;
                float f6 = tlgVar2.h;
                float fB = tlgVar2.b();
                float f7 = tlgVar2.f;
                float fB2 = tlgVar2.b();
                float f8 = tlgVar2.g;
                RectF rectF = new RectF(f6, fB, f6 + f7, fB2 + f8);
                Path path = new Path();
                path.addRect(rectF, Path.Direction.CW);
                path.addRoundRect(rectF, f5, f5, Path.Direction.CCW);
                Paint paint2 = new Paint(1);
                paint2.setColor(-16777216);
                canvas.drawPath(path, paint2);
                float fB3 = tlgVar2.b() + f8 + f5;
                float f9 = tlgVar2.h;
                canvas.save();
                canvas.translate(f9, fB3);
                idd1 idd1Var2 = tlgVar2.u;
                ((StaticLayout) idd1Var2.getValue()).draw(canvas);
                canvas.restore();
                float height = (f4 * 4.0f) + ((StaticLayout) idd1Var2.getValue()).getHeight() + fB3;
                canvas.save();
                canvas.translate(f9, height);
                idd1 idd1Var3 = tlgVar2.v;
                ((StaticLayout) idd1Var3.getValue()).draw(canvas);
                canvas.restore();
                float height2 = ((StaticLayout) idd1Var3.getValue()).getHeight() + f5 + height;
                Context context = tlgVar2.a;
                float f10 = f4 * 12.0f;
                float f11 = f10 / 2.0f;
                float f12 = height2 + f11;
                float f13 = f10 * 3.7083333f;
                tlgVar2.a(canvas, 2131233947, f9, f12 - f11, f13, f10);
                mlg mlgVar = tlgVar2.b;
                int i = mlgVar.c;
                String str = mlgVar.d;
                if (i >= 60) {
                    int i2 = i / 60;
                    i %= 60;
                    sb = new StringBuilder();
                    sb.append(i2);
                    sb.append("m ");
                } else {
                    sb = new StringBuilder();
                }
                sb.append(i);
                sb.append("s");
                String string2 = sb.toString();
                if (str == null || ihc1.y0(str)) {
                    string = context.getString(2131953917, string2);
                } else {
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(str, (TextPaint) tlgVar2.q.getValue(), (f7 - f13) - f5, TextUtils.TruncateAt.END);
                    String string3 = context.getString(2131953918, charSequenceEllipsize, string2);
                    int iW0 = ihc1.w0(string3, charSequenceEllipsize.toString(), 0, false, 6);
                    SpannableString spannableString = new SpannableString(string3);
                    if (iW0 >= 0) {
                        spannableString.setSpan(new qlg((Typeface) tlgVar2.k.getValue(), (byte) 0), iW0, charSequenceEllipsize.length() + iW0, 33);
                        string = spannableString;
                    } else {
                        string = spannableString;
                    }
                }
                int i3 = (int) (f4 * 9.0f);
                float f14 = f4 * 2.3f;
                float f15 = i3;
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(string, 0, string.length(), (TextPaint) tlgVar2.f42p.getValue(), (int) ((((f7 - f13) - f5) - f15) - f14)).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
                float lineWidth = (f9 + f7) - ((f15 + f14) + (staticLayoutBuild.getLineCount() > 0 ? staticLayoutBuild.getLineWidth(0) : 0.0f));
                tlgVar2.a(canvas, 2131232806, lineWidth, f12 - (i3 / 2), f15, f15);
                canvas.save();
                canvas.translate(lineWidth + f15 + f14, f12 - (staticLayoutBuild.getHeight() / 2.0f));
                staticLayoutBuild.draw(canvas);
                canvas.restore();
                float f16 = f10 + f6;
                float fB4 = (11.5f * f4) + tlgVar2.b();
                String string4 = context.getString(2131953919);
                float fMeasureText = ((TextPaint) idd1Var.getValue()).measureText(string4);
                Paint.FontMetrics fontMetrics = ((TextPaint) idd1Var.getValue()).getFontMetrics();
                float f17 = fontMetrics.descent - fontMetrics.ascent;
                float f18 = 3.0f * f4;
                float fMax = Math.max(f10, f17);
                float f19 = f4 * 2.0f;
                canvas.drawRoundRect(new RectF(f16, fB4, (f18 * 2.0f) + fMeasureText + f16, fB4 + fMax), f19, f19, (Paint) tlgVar2.t.getValue());
                canvas.drawText(string4, f16 + f18, (((fMax - f17) / 2.0f) + fB4) - fontMetrics.ascent, (TextPaint) idd1Var.getValue());
                return bitmapCreateBitmap;
            case 9:
                String str2 = tlgVar.b.b;
                return StaticLayout.Builder.obtain(str2, 0, str2.length(), (TextPaint) tlgVar.n.getValue(), (int) tlgVar.f).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
            case 10:
                TextPaint textPaint4 = new TextPaint(1);
                textPaint4.setColor(tlgVar.i);
                textPaint4.setTextSize(tlgVar.e * 11.0f);
                textPaint4.setTypeface((Typeface) tlgVar.l.getValue());
                return textPaint4;
            case 11:
                TextPaint textPaint5 = new TextPaint(1);
                textPaint5.setColor(-1);
                textPaint5.setTextSize(tlgVar.e * 9.0f);
                textPaint5.setTypeface((Typeface) tlgVar.k.getValue());
                return textPaint5;
            case 12:
                String str3 = tlgVar.b.a;
                return StaticLayout.Builder.obtain(str3, 0, str3.length(), (TextPaint) tlgVar.m.getValue(), (int) tlgVar.f).setMaxLines(3).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
            case 13:
                TextPaint textPaint6 = new TextPaint(1);
                textPaint6.setColor(-1);
                textPaint6.setTextSize(tlgVar.e * 11.0f);
                textPaint6.setTypeface((Typeface) tlgVar.k.getValue());
                return textPaint6;
            default:
                return Float.valueOf(Math.max(tlgVar.e * 16.0f, (1104.0f - ((Number) tlgVar.w.getValue()).floatValue()) / 2.0f));
        }
    }
}
