package p;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pzg {
    public ghd A;
    public ghd B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public Bitmap G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;
    public final TextPaint L;
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public ColorStateList W;
    public float X;
    public float Y;
    public StaticLayout Z;
    public final ViewGroup a;
    public float a0;
    public boolean b;
    public float b0;
    public float c;
    public float c0;
    public boolean d;
    public float d0;
    public float e;
    public CharSequence e0;
    public float f;
    public int g;
    public final Rect h;
    public final Rect i;
    public final RectF j;
    public ColorStateList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f97p;
    public int q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public boolean F = true;
    public int f0 = 1;
    public float g0 = 0.0f;
    public float h0 = 1.0f;
    public int i0 = 1;

    public pzg(ViewGroup viewGroup) {
        this.a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.L = textPaint;
        this.M = new TextPaint(textPaint);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        float f = this.e;
        this.f = l1d.e(1.0f, f, 0.5f, f);
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return je5.a(f, f2, f3);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = b8k1.a;
        boolean z = this.a.getLayoutDirection() == 1;
        if (this.F) {
            return (z ? a4e1.d : a4e1.c).p(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void c(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.C == null) {
            return;
        }
        float fWidth = this.i.width();
        float fWidth2 = this.h.width();
        int i = 1;
        if (Math.abs(f - this.n) < 0.001f) {
            f2 = this.n;
            this.H = 1.0f;
            Typeface typeface = this.z;
            Typeface typeface2 = this.x;
            if (typeface != typeface2) {
                this.z = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f3 = this.m;
            Typeface typeface3 = this.z;
            Typeface typeface4 = this.y;
            if (typeface3 != typeface4) {
                this.z = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.H = 1.0f;
            } else {
                this.H = f / this.m;
            }
            float f4 = this.n / this.m;
            fWidth = (!z && fWidth2 * f4 > fWidth) ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
            z3 = z2;
        }
        if (fWidth > 0.0f) {
            z3 = this.I != f2 || this.K || z3;
            this.I = f2;
            this.K = false;
        }
        if (this.D == null || z3) {
            float f5 = this.I;
            TextPaint textPaint = this.L;
            textPaint.setTextSize(f5);
            textPaint.setTypeface(this.z);
            textPaint.setLinearText(this.H != 1.0f);
            boolean zB = b(this.C);
            this.E = zB;
            int i2 = this.f0;
            if (i2 > 1 && (!zB || this.d)) {
                i = i2;
            }
            urb1 urb1VarB = urb1.b(this.C, textPaint, (int) fWidth);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            urb1VarB.d();
            urb1VarB.g(zB);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            urb1VarB.c();
            urb1VarB.f();
            urb1VarB.i(i);
            urb1VarB.h(this.g0, this.h0);
            urb1VarB.e(this.i0);
            StaticLayout staticLayoutA = urb1VarB.a();
            staticLayoutA.getClass();
            this.Z = staticLayoutA;
            this.D = staticLayoutA.getText();
        }
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.D == null || !this.b) {
            return;
        }
        int i = this.f0;
        StaticLayout staticLayout = this.Z;
        float lineStart = (this.v + (i > 1 ? staticLayout.getLineStart(0) : staticLayout.getLineLeft(0))) - (this.d0 * 2.0f);
        float f = this.I;
        TextPaint textPaint = this.L;
        textPaint.setTextSize(f);
        float f2 = this.v;
        float f3 = this.w;
        float f4 = this.H;
        if (f4 != 1.0f && !this.d) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (this.f0 <= 1 || ((this.E && !this.d) || (this.d && this.c <= this.f))) {
            canvas.translate(f2, f3);
            this.Z.draw(canvas);
        } else {
            int alpha = textPaint.getAlpha();
            canvas.translate(lineStart, f3);
            float f5 = alpha;
            textPaint.setAlpha((int) (this.c0 * f5));
            this.Z.draw(canvas);
            textPaint.setAlpha((int) (this.b0 * f5));
            int lineBaseline = this.Z.getLineBaseline(0);
            CharSequence charSequence = this.e0;
            float f6 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
            if (!this.d) {
                String strTrim = this.e0.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = cy30.h(1, 0, strTrim);
                }
                String str = strTrim;
                textPaint.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.Z.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
            }
            canvas = canvas;
        }
        canvas.restoreToCount(iSave);
    }

    public final float e() {
        float f = this.n;
        TextPaint textPaint = this.M;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.X);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public final void h() {
        boolean z;
        Rect rect = this.i;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            Rect rect2 = this.h;
            if (rect2.width() <= 0 || rect2.height() <= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0281  */
    public final void i(boolean z) {
        float lineStart;
        float f;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        float f2 = this.I;
        c(this.n, z);
        CharSequence charSequence = this.D;
        TextPaint textPaint = this.L;
        if (charSequence != null && (staticLayout = this.Z) != null) {
            this.e0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        float fA = 0.0f;
        if (this.e0 != null) {
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setLetterSpacing(this.X);
            CharSequence charSequence2 = this.e0;
            this.a0 = textPaint2.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.a0 = 0.0f;
        }
        int iK = qpn1.k(this.l, this.E ? 1 : 0);
        int i = iK & 112;
        Rect rect = this.i;
        if (i == 48) {
            this.s = rect.top;
        } else if (i != 80) {
            this.s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.s = textPaint.ascent() + rect.bottom;
        }
        int i2 = iK & 8388615;
        if (i2 == 1) {
            this.u = rect.centerX() - (this.a0 / 2.0f);
        } else if (i2 != 5) {
            this.u = rect.left;
        } else {
            this.u = rect.right - this.a0;
        }
        c(this.m, z);
        StaticLayout staticLayout2 = this.Z;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.Z;
        this.q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        CharSequence charSequence3 = this.D;
        float fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout4 = this.Z;
        if (staticLayout4 != null && this.f0 > 1) {
            fMeasureText = staticLayout4.getWidth();
        }
        StaticLayout staticLayout5 = this.Z;
        if (staticLayout5 != null) {
            lineStart = this.f0 > 1 ? staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0);
        } else {
            lineStart = 0.0f;
        }
        this.d0 = lineStart;
        int iK2 = qpn1.k(this.k, this.E ? 1 : 0);
        int i3 = iK2 & 112;
        Rect rect2 = this.h;
        if (i3 == 48) {
            this.r = rect2.top;
        } else if (i3 != 80) {
            this.r = rect2.centerY() - (height / 2.0f);
        } else {
            this.r = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = iK2 & 8388615;
        if (i4 == 1) {
            this.t = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.t = rect2.left;
        } else {
            this.t = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
        o(f2);
        float f3 = this.c;
        boolean z2 = this.d;
        RectF rectF = this.j;
        if (z2) {
            if (f3 < this.f) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f3, this.N);
            rectF.top = g(this.r, this.s, f3, this.N);
            rectF.right = g(rect2.right, rect.right, f3, this.N);
            rectF.bottom = g(rect2.bottom, rect.bottom, f3, this.N);
        }
        if (!this.d) {
            this.v = g(this.t, this.u, f3, this.N);
            this.w = g(this.r, this.s, f3, this.N);
            o(g(this.m, this.n, f3, this.O));
            f = f3;
        } else if (f3 < this.f) {
            this.v = this.t;
            this.w = this.r;
            o(this.m);
            f = 0.0f;
        } else {
            this.v = this.u;
            this.w = this.s - Math.max(0, this.g);
            o(this.n);
            f = 1.0f;
        }
        hl10 hl10Var = je5.b;
        this.b0 = 1.0f - g(0.0f, 1.0f, 1.0f - f3, hl10Var);
        WeakHashMap weakHashMap = b8k1.a;
        viewGroup.postInvalidateOnAnimation();
        this.c0 = g(1.0f, 0.0f, f3, hl10Var);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f97p;
        ColorStateList colorStateList2 = this.o;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f(colorStateList2), f(this.f97p), f));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        float f4 = this.X;
        float f5 = this.Y;
        if (f4 != f5) {
            textPaint.setLetterSpacing(g(f5, f4, f3, hl10Var));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        textPaint.setShadowLayer(je5.a(this.T, this.P, f3), je5.a(this.U, this.Q, f3), je5.a(this.V, this.R, f3), a(f(this.W), f(this.S), f3));
        if (this.d) {
            int alpha = textPaint.getAlpha();
            float f6 = this.f;
            if (f3 <= f6) {
                float f7 = this.e;
                if (f3 < f7) {
                    fA = 1.0f;
                } else if (f3 <= f6) {
                    fA = je5.a(1.0f, 0.0f, (f3 - f7) / (f6 - f7));
                }
            } else if (f3 >= f6) {
                if (f3 > 1.0f) {
                    fA = 1.0f;
                } else {
                    fA = je5.a(0.0f, 1.0f, (f3 - f6) / (1.0f - f6));
                }
            }
            textPaint.setAlpha((int) (fA * alpha));
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void j(int i) {
        ViewGroup viewGroup = this.a;
        k0e1 k0e1Var = new k0e1(viewGroup.getContext(), i);
        ColorStateList colorStateList = k0e1Var.j;
        if (colorStateList != null) {
            this.f97p = colorStateList;
        }
        float f = k0e1Var.k;
        if (f != 0.0f) {
            this.n = f;
        }
        ColorStateList colorStateList2 = k0e1Var.a;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = k0e1Var.e;
        this.R = k0e1Var.f;
        this.P = k0e1Var.g;
        this.X = k0e1Var.i;
        ghd ghdVar = this.B;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        i3b i3bVar = new i3b(this, (byte) 13);
        k0e1Var.a();
        this.B = new ghd(i3bVar, k0e1Var.n);
        k0e1Var.c(viewGroup.getContext(), this.B);
        i(false);
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f97p != colorStateList) {
            this.f97p = colorStateList;
            i(false);
        }
    }

    public final void l(int i) {
        if (this.l != i) {
            this.l = i;
            i(false);
        }
    }

    public final void m(int i) {
        ViewGroup viewGroup = this.a;
        k0e1 k0e1Var = new k0e1(viewGroup.getContext(), i);
        ColorStateList colorStateList = k0e1Var.j;
        if (colorStateList != null) {
            this.o = colorStateList;
        }
        float f = k0e1Var.k;
        if (f != 0.0f) {
            this.m = f;
        }
        ColorStateList colorStateList2 = k0e1Var.a;
        if (colorStateList2 != null) {
            this.W = colorStateList2;
        }
        this.U = k0e1Var.e;
        this.V = k0e1Var.f;
        this.T = k0e1Var.g;
        this.Y = k0e1Var.i;
        ghd ghdVar = this.A;
        if (ghdVar != null) {
            ghdVar.e = true;
        }
        n4b n4bVar = new n4b(this, (byte) 10);
        k0e1Var.a();
        this.A = new ghd(n4bVar, k0e1Var.n);
        k0e1Var.c(viewGroup.getContext(), this.A);
        i(false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    public final void n(float f) {
        float f2;
        float fA = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            boolean z = this.d;
            Rect rect = this.i;
            Rect rect2 = this.h;
            RectF rectF = this.j;
            if (z) {
                if (f < this.f) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f, this.N);
                rectF.top = g(this.r, this.s, f, this.N);
                rectF.right = g(rect2.right, rect.right, f, this.N);
                rectF.bottom = g(rect2.bottom, rect.bottom, f, this.N);
            }
            if (!this.d) {
                this.v = g(this.t, this.u, f, this.N);
                this.w = g(this.r, this.s, f, this.N);
                o(g(this.m, this.n, f, this.O));
                f2 = f;
            } else if (f < this.f) {
                this.v = this.t;
                this.w = this.r;
                o(this.m);
                f2 = 0.0f;
            } else {
                this.v = this.u;
                this.w = this.s - Math.max(0, this.g);
                o(this.n);
                f2 = 1.0f;
            }
            hl10 hl10Var = je5.b;
            this.b0 = 1.0f - g(0.0f, 1.0f, 1.0f - f, hl10Var);
            WeakHashMap weakHashMap = b8k1.a;
            ViewGroup viewGroup = this.a;
            viewGroup.postInvalidateOnAnimation();
            this.c0 = g(1.0f, 0.0f, f, hl10Var);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f97p;
            ColorStateList colorStateList2 = this.o;
            TextPaint textPaint = this.L;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f(this.f97p), f2));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f3 = this.X;
            float f4 = this.Y;
            if (f3 != f4) {
                textPaint.setLetterSpacing(g(f4, f3, f, hl10Var));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            textPaint.setShadowLayer(je5.a(this.T, this.P, f), je5.a(this.U, this.Q, f), je5.a(this.V, this.R, f), a(f(this.W), f(this.S), f));
            if (this.d) {
                int alpha = textPaint.getAlpha();
                float f5 = this.f;
                if (f <= f5) {
                    float f6 = this.e;
                    if (f < f6) {
                        fA = 1.0f;
                    } else if (f <= f5) {
                        fA = je5.a(1.0f, 0.0f, (f - f6) / (f5 - f6));
                    }
                } else if (f >= f5) {
                    if (f > 1.0f) {
                        fA = 1.0f;
                    } else {
                        fA = je5.a(0.0f, 1.0f, (f - f5) / (1.0f - f5));
                    }
                }
                textPaint.setAlpha((int) (fA * alpha));
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void o(float f) {
        c(f, false);
        WeakHashMap weakHashMap = b8k1.a;
        this.a.postInvalidateOnAnimation();
    }
}
