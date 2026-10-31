package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class etg extends View {
    public StaticLayout N0;
    public final TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Typeface d;
    public int e;
    public int f;
    public int g;
    public final CaptioningManager h;
    public final dtg i;
    public zsg t;

    public etg(Context context) {
        super(context, null);
        this.a = new TextPaint(129);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = qx21.b(context, 2131296269);
        this.e = -1;
        this.g = -16777216;
        Object systemService = context.getSystemService("captioning");
        this.h = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        this.i = new dtg(this);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CaptioningManager captioningManager = this.h;
        if (captioningManager != null) {
            captioningManager.addCaptioningChangeListener(this.i);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        CaptioningManager captioningManager = this.h;
        if (captioningManager != null) {
            captioningManager.removeCaptioningChangeListener(this.i);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:197:0x030e  */
    /* JADX WARN: Code duplicated, block: B:201:0x034a  */
    /* JADX WARN: Code duplicated, block: B:204:0x036b A[LOOP:2: B:203:0x0369->B:204:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x039d  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x03af  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:222:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:229:0x0192 A[EDGE_INSN: B:229:0x0192->B:85:0x0192 BREAK  A[LOOP:0: B:64:0x0127->B:83:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:83:0x017f A[LOOP:0: B:64:0x0127->B:83:0x017f, LOOP_END] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ysg ysgVar;
        double dDoubleValue;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double dN;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int lineCount;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        float fFloatValue;
        Layout.Alignment alignment;
        int i6;
        int i7;
        zsg zsgVar = this.t;
        if (zsgVar == null) {
            return;
        }
        atg atgVar = zsgVar.e;
        ysg ysgVar2 = atgVar.a;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        StaticLayout staticLayoutBuild = this.N0;
        TextPaint textPaint = this.a;
        Paint paint = this.b;
        Paint paint2 = this.c;
        if (staticLayoutBuild == null) {
            CaptioningManager captioningManager = this.h;
            if (captioningManager != null) {
                float fontScale = captioningManager.getFontScale();
                Float fValueOf = Float.valueOf(fontScale);
                if (!captioningManager.isEnabled() || fontScale <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
            } else {
                fFloatValue = 1.0f;
            }
            textPaint.setTextSize(getHeight() * 0.0533f * fFloatValue);
            this.e = -1;
            textPaint.setColor(-1);
            Typeface typeface = this.d;
            textPaint.setTypeface(typeface);
            paint.setColor(-1073741824);
            paint2.setColor(0);
            this.f = 0;
            this.g = -16777216;
            if (captioningManager != null && captioningManager.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                if (userStyle.hasForegroundColor()) {
                    int i8 = userStyle.foregroundColor;
                    this.e = i8;
                    textPaint.setColor(i8);
                }
                if (userStyle.hasBackgroundColor()) {
                    paint.setColor(userStyle.backgroundColor);
                }
                if (userStyle.hasWindowColor()) {
                    paint2.setColor(userStyle.windowColor);
                }
                if (userStyle.hasEdgeType()) {
                    this.f = userStyle.edgeType;
                }
                if (userStyle.hasEdgeColor()) {
                    this.g = userStyle.edgeColor;
                }
                Typeface typeface2 = userStyle.getTypeface();
                if (typeface2 != null) {
                    typeface = typeface2;
                }
                textPaint.setTypeface(typeface);
            }
            int width = getWidth() - (jch0.U(getResources().getDisplayMetrics().density * 16.0f) * 2);
            if (width < 1) {
                width = 1;
            }
            Double d6 = atgVar.e;
            int iS = jch0.S(((double) width) * (d6 != null ? yoi1.n(d6.doubleValue(), 0.0d, 1.0d) : 1.0d));
            if (iS < 1) {
                iS = 1;
            }
            String[] strArr = zsgVar.d;
            int[] iArr = zsgVar.c;
            int i9 = 2;
            String str = zsgVar.a;
            SpannableString spannableString = new SpannableString(str);
            int[] iArr2 = zsgVar.b;
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, iArr2.length - 2), 3);
            int i10 = rr80VarO.a;
            int i11 = rr80VarO.b;
            int i12 = rr80VarO.c;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    int i13 = iArr2[i10];
                    ysgVar = ysgVar2;
                    int i14 = iArr2[i10 + 1];
                    int i15 = iArr2[i10 + 2];
                    if (i13 >= 0 && i14 > i13) {
                        i6 = i12;
                        if (i14 <= str.length()) {
                            if ((i15 & 1) != 0) {
                                i7 = 33;
                                spannableString.setSpan(new StyleSpan(1), i13, i14, 33);
                            } else {
                                i7 = 33;
                            }
                            if ((i15 & 2) != 0) {
                                spannableString.setSpan(new StyleSpan(i9), i13, i14, i7);
                            }
                            if ((i15 & 4) != 0) {
                                spannableString.setSpan(new UnderlineSpan(), i13, i14, i7);
                            }
                        }
                        if (i10 != i11) {
                            break;
                        }
                        i10 += i6;
                        ysgVar2 = ysgVar;
                        i12 = i6;
                        str = str;
                        paint = paint;
                        i9 = 2;
                    } else {
                        i6 = i12;
                    }
                    paint = paint;
                    str = str;
                    if (i10 != i11) {
                        break;
                        break;
                    }
                    i10 += i6;
                    ysgVar2 = ysgVar;
                    i12 = i6;
                    str = str;
                    paint = paint;
                    i9 = 2;
                }
            } else {
                ysgVar = ysgVar2;
                paint = paint;
                str = str;
            }
            int iMin = Math.min(iArr.length / 2, strArr.length);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = i16 * 2;
                int i18 = iArr[i17];
                int i19 = iArr[i17 + 1];
                if (i18 >= 0 && i19 > i18 && i19 <= str.length()) {
                    spannableString.setSpan(new xsg(strArr[i16]), i18, i19, 33);
                }
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, iS);
            int i20 = ysgVar == null ? -1 : btg.a[ysgVar.ordinal()];
            if (i20 == -1 || i20 == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i20 == 2 || i20 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                if (i20 != 4 && i20 != 5) {
                    eg.o();
                    return;
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout.Builder alignment2 = builderObtain.setAlignment(alignment);
            int i21 = ysgVar == null ? -1 : ctg.a[ysgVar.ordinal()];
            staticLayoutBuild = alignment2.setTextDirection(i21 != 1 ? i21 != 2 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR).setIncludePad(true).build();
            this.N0 = staticLayoutBuild;
        } else {
            ysgVar = ysgVar2;
            paint = paint;
        }
        int width2 = getWidth();
        int height = getHeight();
        int width3 = staticLayoutBuild.getWidth();
        int height2 = staticLayoutBuild.getHeight();
        int lineBottom = staticLayoutBuild.getLineBottom(0) - staticLayoutBuild.getLineTop(0);
        int layoutDirection = getLayoutDirection();
        int i22 = ysgVar == null ? -1 : btg.a[ysgVar.ordinal()];
        if (i22 == -1 || i22 == 1) {
            dDoubleValue = 0.5d;
        } else if (i22 == 2 || i22 == 3) {
            dDoubleValue = 1.0d;
        } else {
            if (i22 != 4 && i22 != 5) {
                eg.o();
                return;
            }
            dDoubleValue = 0.0d;
        }
        Double d7 = atgVar.d;
        if (d7 != null) {
            dDoubleValue = d7.doubleValue();
        }
        double dN2 = yoi1.n(dDoubleValue, 0.0d, 1.0d);
        int i23 = ysgVar == null ? -1 : btg.a[ysgVar.ordinal()];
        if (i23 == -1 || i23 == 1) {
            d = 0.5d;
        } else if (i23 == 2) {
            d = layoutDirection == 1 ? 0.0d : 1.0d;
        } else if (i23 != 3) {
            if (i23 != 4) {
                if (i23 != 5) {
                    eg.o();
                    return;
                }
            } else if (layoutDirection == 1) {
            }
        }
        double d8 = (((double) width2) * dN2) - (((double) width3) * d);
        int i24 = width2 - width3;
        if (i24 < 0) {
            i24 = 0;
        }
        double dN3 = yoi1.n(d8, 0.0d, i24);
        Double d9 = atgVar.b;
        if (d9 == null) {
            Integer num = atgVar.c;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue >= 0) {
                    d5 = iIntValue;
                    dN = lineBottom;
                } else {
                    d2 = (((double) lineBottom) * ((double) (iIntValue + 1))) + ((double) height);
                    d3 = height2;
                }
            } else {
                d2 = height - height2;
                d3 = ((double) height) * 0.08d;
            }
            d4 = d2 - d3;
            double d10 = d4;
            i = height - height2;
            if (i < 0) {
                i = 0;
            }
            double dN4 = yoi1.n(d10, 0.0d, i);
            f = (float) dN3;
            f2 = (float) dN4;
            f3 = getResources().getDisplayMetrics().density * 4.0f;
            f4 = getResources().getDisplayMetrics().density * 2.0f;
            f5 = getResources().getDisplayMetrics().density * 2.0f;
            if (Color.alpha(paint2.getColor()) != 0) {
                canvas.drawRect(new RectF(f - f3, f2 - f4, staticLayoutBuild.getWidth() + f + f3, staticLayoutBuild.getHeight() + f2 + f4), paint2);
            }
            lineCount = staticLayoutBuild.getLineCount();
            for (i2 = 0; i2 < lineCount; i2++) {
                canvas.drawRoundRect(new RectF((staticLayoutBuild.getLineLeft(i2) + f) - f3, (staticLayoutBuild.getLineTop(i2) + f2) - f4, staticLayoutBuild.getLineRight(i2) + f + f3, staticLayoutBuild.getLineBottom(i2) + f2 + f4), f5, f5, paint);
            }
            canvas.save();
            canvas.translate(f, f2);
            i3 = this.f;
            if (i3 != 1) {
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                textPaint.setStrokeJoin(Paint.Join.ROUND);
                textPaint.setStrokeWidth(textPaint.getTextSize() * 0.08f);
                textPaint.setColor(this.g);
                staticLayoutBuild.draw(canvas);
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setColor(this.e);
                staticLayoutBuild.draw(canvas);
            } else if (i3 != 2) {
                float textSize = textPaint.getTextSize() * 0.05f;
                textPaint.setShadowLayer(textSize, textSize, textSize, this.g);
                staticLayoutBuild.draw(canvas);
                textPaint.clearShadowLayer();
            } else if (i3 != 3 || i3 == 4) {
                if (i3 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                float textSize2 = textPaint.getTextSize() * 0.05f;
                if (z) {
                    i4 = -1;
                } else {
                    i4 = this.g;
                }
                if (z) {
                    i5 = this.g;
                } else {
                    i5 = -1;
                }
                float f6 = -textSize2;
                textPaint.setShadowLayer(textSize2, f6, f6, i4);
                staticLayoutBuild.draw(canvas);
                textPaint.setShadowLayer(textSize2, textSize2, textSize2, i5);
                staticLayoutBuild.draw(canvas);
                textPaint.clearShadowLayer();
                staticLayoutBuild.draw(canvas);
            } else {
                staticLayoutBuild.draw(canvas);
            }
            canvas.restore();
        }
        double dDoubleValue2 = d9.doubleValue();
        d5 = height;
        dN = yoi1.n(dDoubleValue2, 0.0d, 1.0d);
        d4 = d5 * dN;
        double d11 = d4;
        i = height - height2;
        if (i < 0) {
            i = 0;
        }
        double dN5 = yoi1.n(d11, 0.0d, i);
        f = (float) dN3;
        f2 = (float) dN5;
        f3 = getResources().getDisplayMetrics().density * 4.0f;
        f4 = getResources().getDisplayMetrics().density * 2.0f;
        f5 = getResources().getDisplayMetrics().density * 2.0f;
        if (Color.alpha(paint2.getColor()) != 0) {
            canvas.drawRect(new RectF(f - f3, f2 - f4, staticLayoutBuild.getWidth() + f + f3, staticLayoutBuild.getHeight() + f2 + f4), paint2);
        }
        lineCount = staticLayoutBuild.getLineCount();
        while (i2 < lineCount) {
            canvas.drawRoundRect(new RectF((staticLayoutBuild.getLineLeft(i2) + f) - f3, (staticLayoutBuild.getLineTop(i2) + f2) - f4, staticLayoutBuild.getLineRight(i2) + f + f3, staticLayoutBuild.getLineBottom(i2) + f2 + f4), f5, f5, paint);
        }
        canvas.save();
        canvas.translate(f, f2);
        i3 = this.f;
        if (i3 != 1) {
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(textPaint.getTextSize() * 0.08f);
            textPaint.setColor(this.g);
            staticLayoutBuild.draw(canvas);
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setColor(this.e);
            staticLayoutBuild.draw(canvas);
        } else if (i3 != 2) {
            float textSize3 = textPaint.getTextSize() * 0.05f;
            textPaint.setShadowLayer(textSize3, textSize3, textSize3, this.g);
            staticLayoutBuild.draw(canvas);
            textPaint.clearShadowLayer();
        } else if (i3 != 3) {
            if (i3 == 3) {
                z = true;
            } else {
                z = false;
            }
            float textSize4 = textPaint.getTextSize() * 0.05f;
            if (z) {
                i4 = -1;
            } else {
                i4 = this.g;
            }
            if (z) {
                i5 = this.g;
            } else {
                i5 = -1;
            }
            float f7 = -textSize4;
            textPaint.setShadowLayer(textSize4, f7, f7, i4);
            staticLayoutBuild.draw(canvas);
            textPaint.setShadowLayer(textSize4, textSize4, textSize4, i5);
            staticLayoutBuild.draw(canvas);
            textPaint.clearShadowLayer();
            staticLayoutBuild.draw(canvas);
        } else {
            if (i3 == 3) {
                z = true;
            } else {
                z = false;
            }
            float textSize5 = textPaint.getTextSize() * 0.05f;
            if (z) {
                i4 = -1;
            } else {
                i4 = this.g;
            }
            if (z) {
                i5 = this.g;
            } else {
                i5 = -1;
            }
            float f8 = -textSize5;
            textPaint.setShadowLayer(textSize5, f8, f8, i4);
            staticLayoutBuild.draw(canvas);
            textPaint.setShadowLayer(textSize5, textSize5, textSize5, i5);
            staticLayoutBuild.draw(canvas);
            textPaint.clearShadowLayer();
            staticLayoutBuild.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.N0 = null;
    }

    public final void setCue(zsg zsgVar) {
        if (this.t == zsgVar) {
            return;
        }
        this.t = zsgVar;
        this.N0 = null;
        invalidate();
    }
}
