package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iqc1 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f72p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public iqc1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = fRound;
        this.b = fRound;
        this.c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0514  */
    /* JADX WARN: Code duplicated, block: B:233:0x0517  */
    /* JADX WARN: Code duplicated, block: B:235:0x051a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final void a(feo feoVar, bnd bndVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        float f4;
        int i5;
        TextPaint textPaint;
        Spanned spanned;
        Object[] objArr;
        int[] iArr;
        int[] iArr2;
        List listC;
        int i6;
        int i7;
        float f5;
        int i8;
        float f6;
        int i9;
        int iMax;
        int iMin;
        int iRound;
        Bitmap bitmap = feoVar.d;
        float f7 = feoVar.k;
        float f8 = feoVar.j;
        int i10 = feoVar.i;
        float f9 = feoVar.h;
        int i11 = feoVar.g;
        int i12 = feoVar.f;
        float f10 = feoVar.e;
        Layout.Alignment alignment = feoVar.b;
        ?? spannableStringBuilder = feoVar.a;
        boolean z = bitmap == null;
        if (!z) {
            f4 = f9;
            i5 = -16777216;
        } else {
            if (TextUtils.isEmpty(spannableStringBuilder)) {
                return;
            }
            f4 = f9;
            i5 = feoVar.l ? feoVar.m : bndVar.c;
        }
        ?? r15 = this.i;
        TextPaint textPaint2 = this.f;
        if ((r15 == spannableStringBuilder || (r15 != 0 && r15.equals(spannableStringBuilder))) && Objects.equals(this.j, alignment) && this.k == bitmap && this.l == f10 && this.m == i12) {
            textPaint = textPaint2;
            if (Integer.valueOf(this.n).equals(Integer.valueOf(i11)) && this.o == f4 && Integer.valueOf(this.f72p).equals(Integer.valueOf(i10)) && this.q == f8 && this.r == f7 && this.s == bndVar.a && this.t == bndVar.b && this.u == i5 && this.w == bndVar.d && this.v == bndVar.e && Objects.equals(textPaint.getTypeface(), bndVar.f) && this.x == f && this.y == f2 && this.z == f3 && this.A == i && this.B == i2 && this.C == i3 && this.D == i4) {
                b(canvas, z);
                return;
            }
        } else {
            textPaint = textPaint2;
        }
        tya1 tya1Var = jra.a;
        if (spannableStringBuilder == 0) {
            z = z;
        } else {
            int length = spannableStringBuilder.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount < length) {
                    int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                    int i13 = iCharCount;
                    byte directionality = Character.getDirectionality(iCodePointAt);
                    int i14 = length;
                    if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                        if (spannableStringBuilder instanceof Spanned) {
                            spanned = (Spanned) spannableStringBuilder;
                            Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                            int[] iArr3 = new int[spans.length];
                            iArr = new int[spans.length];
                            Arrays.fill(iArr3, -1);
                            Arrays.fill(iArr, -1);
                            objArr = spans;
                            iArr2 = iArr3;
                        } else {
                            spanned = null;
                            objArr = null;
                            iArr = null;
                            iArr2 = null;
                        }
                        int[] iArr4 = iArr;
                        if (spannableStringBuilder.toString().contains("\r\n")) {
                            listC = jra.b.c((CharSequence) spannableStringBuilder);
                            i6 = 2;
                        } else {
                            listC = jra.a.c((CharSequence) spannableStringBuilder);
                            i6 = 1;
                        }
                        List<String> list = listC;
                        ArrayList arrayList = new ArrayList(list.size());
                        int i15 = 0;
                        int i16 = 0;
                        for (String str : list) {
                            int i17 = i6;
                            String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int length2 = strUnicodeWrap.length() - str.length();
                                if (length2 > 0) {
                                    i16++;
                                }
                                for (int i18 = 0; i18 < objArr.length; i18 = i7 + 1) {
                                    if (iArr2[i18] >= 0 || spanned.getSpanStart(objArr[i18]) < i15) {
                                        i7 = i18;
                                    } else {
                                        i7 = i18;
                                        if (spanned.getSpanStart(objArr[i18]) < str.length() + i15) {
                                            iArr2[i7] = i16;
                                        }
                                    }
                                    if (iArr4[i7] < 0 && spanned.getSpanEnd(objArr[i7]) - 1 >= i15 && spanned.getSpanEnd(objArr[i7]) - 1 < str.length() + i15) {
                                        iArr4[i7] = i16;
                                    }
                                }
                                int length3 = str.length() + i17 + i15;
                                if (length2 > 0) {
                                    i16++;
                                }
                                i15 = length3;
                            }
                            arrayList.add(strUnicodeWrap);
                            i6 = i17;
                            bidiFormatter = bidiFormatter;
                        }
                        spannableStringBuilder = new SpannableStringBuilder(jra.c.c(arrayList));
                        if (objArr != null) {
                            spanned.getClass();
                            iArr2.getClass();
                            iArr4.getClass();
                            int i19 = 0;
                            while (i19 < objArr.length) {
                                int spanStart = spanned.getSpanStart(objArr[i19]) + iArr2[i19];
                                int spanEnd = spanned.getSpanEnd(objArr[i19]) + iArr4[i19];
                                int spanFlags = spanned.getSpanFlags(objArr[i19]);
                                int i20 = i19;
                                if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                    StringBuilder sbQ = cy30.q(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                    sbQ.append(spannableStringBuilder.length());
                                    oon1.H(sbQ.toString());
                                } else {
                                    spannableStringBuilder.setSpan(objArr[i20], spanStart, spanEnd, spanFlags);
                                }
                                i19 = i20 + 1;
                                objArr = objArr;
                            }
                        }
                    } else {
                        iCharCount = Character.charCount(iCodePointAt) + i13;
                        length = i14;
                    }
                } else {
                    z = z;
                }
            }
        }
        this.i = spannableStringBuilder;
        this.j = alignment;
        this.k = bitmap;
        this.l = f10;
        this.m = i12;
        this.n = i11;
        this.o = f4;
        this.f72p = i10;
        this.q = f8;
        this.r = f7;
        this.s = bndVar.a;
        this.t = bndVar.b;
        this.u = i5;
        this.w = bndVar.d;
        this.v = bndVar.e;
        TextPaint textPaint3 = textPaint;
        textPaint3.setTypeface(bndVar.f);
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = i;
        this.B = i2;
        this.C = i3;
        this.D = i4;
        if (z) {
            this.i.getClass();
            CharSequence charSequence = this.i;
            SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.i);
            int i21 = this.C - this.A;
            int i22 = this.D - this.B;
            textPaint3.setTextSize(this.x);
            int i23 = (int) ((this.x * 0.125f) + 0.5f);
            int i24 = i23 * 2;
            int i25 = i21 - i24;
            float f11 = this.q;
            if (f11 != -3.4028235E38f) {
                i25 = (int) (i25 * f11);
            }
            int i26 = i25;
            if (i26 <= 0) {
                oon1.H("Skipped drawing subtitle cue (insufficient space)");
            } else {
                if (this.y > 0.0f) {
                    i9 = 0;
                    spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) this.y), 0, spannableStringBuilder2.length(), 16711680);
                } else {
                    i9 = 0;
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                if (this.w == 1) {
                    for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i9, spannableStringBuilder3.length(), ForegroundColorSpan.class)) {
                        spannableStringBuilder3.removeSpan(foregroundColorSpan);
                    }
                }
                if (Color.alpha(this.t) > 0) {
                    int i27 = this.w;
                    if (i27 == 0 || i27 == 2) {
                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        spannableStringBuilder3.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder3.length(), 16711680);
                    }
                }
                Layout.Alignment alignment2 = this.j;
                if (alignment2 == null) {
                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                }
                Layout.Alignment alignment3 = alignment2;
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint3, i26, alignment3, this.d, this.e, true);
                this.E = staticLayout;
                int height = staticLayout.getHeight();
                int lineCount = this.E.getLineCount();
                int iMax2 = 0;
                for (int i28 = 0; i28 < lineCount; i28++) {
                    iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i28)), iMax2);
                }
                int i29 = ((this.q == -3.4028235E38f || iMax2 >= i26) ? iMax2 : i26) + i24;
                float f12 = this.o;
                if (f12 != -3.4028235E38f) {
                    int iRound2 = Math.round(i21 * f12);
                    int i30 = this.A;
                    int i31 = iRound2 + i30;
                    int i32 = this.f72p;
                    if (i32 == 1) {
                        i31 = ((i31 * 2) - i29) / 2;
                    } else if (i32 == 2) {
                        i31 -= i29;
                    }
                    iMax = Math.max(i31, i30);
                    iMin = Math.min(iMax + i29, this.C);
                } else {
                    iMax = this.A + ((i21 - i29) / 2);
                    iMin = iMax + i29;
                }
                int i33 = iMin - iMax;
                if (i33 <= 0) {
                    oon1.H("Skipped drawing subtitle cue (invalid horizontal positioning)");
                } else {
                    float f13 = this.l;
                    if (f13 != -3.4028235E38f) {
                        if (this.m == 0) {
                            iRound = Math.round(i22 * f13) + this.B;
                            int i34 = this.n;
                            if (i34 == 2) {
                                iRound -= height;
                            } else if (i34 == 1) {
                                iRound = ((iRound * 2) - height) / 2;
                            }
                        } else {
                            int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                            float f14 = this.l;
                            if (f14 >= 0.0f) {
                                iRound = Math.round(f14 * lineBottom) + this.B;
                            } else {
                                iRound = Math.round((f14 + 1.0f) * lineBottom) + this.D;
                                iRound -= height;
                            }
                        }
                        int i35 = iRound + height;
                        int i36 = this.D;
                        if (i35 > i36) {
                            iRound = i36 - height;
                        } else {
                            int i37 = this.B;
                            if (iRound < i37) {
                                iRound = i37;
                            }
                        }
                    } else {
                        iRound = (this.D - height) - ((int) (i22 * this.z));
                    }
                    this.E = new StaticLayout(spannableStringBuilder4, textPaint3, i33, alignment3, this.d, this.e, true);
                    this.F = new StaticLayout(spannableStringBuilder3, textPaint3, i33, alignment3, this.d, this.e, true);
                    this.G = iMax;
                    this.H = iRound;
                    this.I = i23;
                }
            }
        } else {
            this.k.getClass();
            Bitmap bitmap2 = this.k;
            int i38 = this.C;
            int i39 = this.A;
            int i40 = this.D;
            int i41 = this.B;
            float f15 = i38 - i39;
            float f16 = (this.o * f15) + i39;
            float f17 = i40 - i41;
            float f18 = (this.l * f17) + i41;
            int iRound3 = Math.round(f15 * this.q);
            float f19 = this.r;
            int iRound4 = f19 != -3.4028235E38f ? Math.round(f17 * f19) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
            int i42 = this.f72p;
            if (i42 == 2) {
                f5 = iRound3;
            } else {
                if (i42 == 1) {
                    f5 = iRound3 / 2;
                }
                int iRound5 = Math.round(f16);
                i8 = this.n;
                if (i8 == 2) {
                    f6 = iRound4;
                } else {
                    if (i8 == 1) {
                        f6 = iRound4 / 2;
                    }
                    int iRound6 = Math.round(f18);
                    this.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                }
                f18 -= f6;
                int iRound7 = Math.round(f18);
                this.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
            }
            f16 -= f5;
            int iRound8 = Math.round(f16);
            i8 = this.n;
            if (i8 == 2) {
                f6 = iRound4;
            } else {
                if (i8 == 1) {
                    f6 = iRound4 / 2;
                }
                int iRound9 = Math.round(f18);
                this.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
            }
            f18 -= f6;
            int iRound10 = Math.round(f18);
            this.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
        }
        b(canvas, z);
    }

    public final void b(Canvas canvas, boolean z) {
        Canvas canvas2;
        if (!z) {
            this.J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.J, this.h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.u) > 0) {
            int i = this.u;
            Paint paint = this.g;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.w;
        TextPaint textPaint = this.f;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.a);
            textPaint.setColor(this.v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.b;
            if (i2 == 2) {
                float f2 = this.c;
                textPaint.setShadowLayer(f, f2, f2, this.v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.v;
                int i4 = z2 ? this.v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
