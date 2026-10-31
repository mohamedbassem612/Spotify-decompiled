package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x8a extends pne {
    public xjm1 A1;
    public RectF B1;
    public Matrix C1;
    public cuf0 D1;
    public cuf0 E1;
    public float[] F1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public Paint n1;
    public Paint o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public float s1;
    public boolean t1;
    public ymm1 u1;
    public ymm1 v1;
    public zmm1 w1;
    public zmm1 x1;
    public vi11 y1;
    public vi11 z1;

    @Override // p.pne
    public final void a() {
        RectF rectF = this.B1;
        zdk1 zdk1Var = this.U0;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        u2c0 u2c0Var = this.O0;
        if (u2c0Var != null) {
            int iC = l1d.C(u2c0Var.h);
            if (iC == 0) {
                int iC2 = l1d.C(this.O0.g);
                if (iC2 == 0) {
                    float f = rectF.top;
                    u2c0 u2c0Var2 = this.O0;
                    rectF.top = Math.min(u2c0Var2.r, zdk1Var.d * u2c0Var2.f145p) + this.O0.b + f;
                    getXAxis().getClass();
                    if (getXAxis().o) {
                        rectF.top += getXAxis().x;
                    }
                } else if (iC2 == 2) {
                    float f2 = rectF.bottom;
                    u2c0 u2c0Var3 = this.O0;
                    rectF.bottom = Math.min(u2c0Var3.r, zdk1Var.d * u2c0Var3.f145p) + this.O0.b + f2;
                    getXAxis().getClass();
                    if (getXAxis().o) {
                        rectF.bottom += getXAxis().x;
                    }
                }
            } else if (iC == 1) {
                int iC3 = l1d.C(this.O0.f);
                if (iC3 == 0) {
                    float f3 = rectF.left;
                    u2c0 u2c0Var4 = this.O0;
                    rectF.left = Math.min(u2c0Var4.q, zdk1Var.c * u2c0Var4.f145p) + this.O0.a + f3;
                } else if (iC3 == 1) {
                    int iC4 = l1d.C(this.O0.g);
                    if (iC4 == 0) {
                        float f4 = rectF.top;
                        u2c0 u2c0Var5 = this.O0;
                        rectF.top = Math.min(u2c0Var5.r, zdk1Var.d * u2c0Var5.f145p) + this.O0.b + f4;
                    } else if (iC4 == 2) {
                        float f5 = rectF.bottom;
                        u2c0 u2c0Var6 = this.O0;
                        rectF.bottom = Math.min(u2c0Var6.r, zdk1Var.d * u2c0Var6.f145p) + this.O0.b + f5;
                    }
                } else if (iC3 == 2) {
                    float f6 = rectF.right;
                    u2c0 u2c0Var7 = this.O0;
                    rectF.right = Math.min(u2c0Var7.q, zdk1Var.c * u2c0Var7.f145p) + this.O0.a + f6;
                }
            }
        }
        float fC = rectF.left + 0.0f;
        float f7 = rectF.top + 0.0f;
        float fC2 = rectF.right + 0.0f;
        float f8 = rectF.bottom + 0.0f;
        ymm1 ymm1Var = this.u1;
        if (ymm1Var.o) {
            fC += ymm1Var.c(this.w1.f);
        }
        ymm1 ymm1Var2 = this.v1;
        if (ymm1Var2.o) {
            fC2 += ymm1Var2.c(this.x1.f);
        }
        wjm1 wjm1Var = this.i;
        wjm1Var.getClass();
        if (wjm1Var.o) {
            float f9 = wjm1Var.x + wjm1Var.b;
            int i = wjm1Var.y;
            if (i == 2) {
                f8 += f9;
            } else if (i == 1) {
                f7 += f9;
            } else if (i == 3) {
                f8 += f9;
                f7 += f9;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f7;
        float extraRightOffset = getExtraRightOffset() + fC2;
        float extraBottomOffset = getExtraBottomOffset() + f8;
        float extraLeftOffset = getExtraLeftOffset() + fC;
        float fC3 = npi1.c(this.s1);
        zdk1Var.b.set(Math.max(fC3, extraLeftOffset), Math.max(fC3, extraTopOffset), zdk1Var.c - Math.max(fC3, extraRightOffset), zdk1Var.d - Math.max(fC3, extraBottomOffset));
        if (this.a) {
            zdk1Var.b.toString();
        }
        vi11 vi11Var = this.z1;
        this.v1.getClass();
        vi11Var.K();
        vi11 vi11Var2 = this.y1;
        this.u1.getClass();
        vi11Var2.K();
        if (this.a) {
            float f10 = this.i.v;
        }
        vi11 vi11Var3 = this.z1;
        wjm1 wjm1Var2 = this.i;
        float f11 = wjm1Var2.v;
        float f12 = wjm1Var2.w;
        ymm1 ymm1Var3 = this.v1;
        vi11Var3.L(f11, f12, ymm1Var3.w, ymm1Var3.v);
        vi11 vi11Var4 = this.y1;
        wjm1 wjm1Var3 = this.i;
        float f13 = wjm1Var3.v;
        float f14 = wjm1Var3.w;
        ymm1 ymm1Var4 = this.u1;
        vi11Var4.L(f13, f14, ymm1Var4.w, ymm1Var4.v);
    }

    @Override // android.view.View
    public final void computeScroll() {
        wne wneVar = this.P0;
        if (wneVar instanceof y8a) {
            y8a y8aVar = (y8a) wneVar;
            duf0 duf0Var = y8aVar.P0;
            x8a x8aVar = y8aVar.d;
            if (duf0Var.b == 0.0f && duf0Var.c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            duf0Var.b = x8aVar.getDragDecelerationFrictionCoef() * duf0Var.b;
            float dragDecelerationFrictionCoef = x8aVar.getDragDecelerationFrictionCoef() * duf0Var.c;
            duf0Var.c = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - y8aVar.N0) / 1000.0f;
            float f2 = duf0Var.b * f;
            float f3 = dragDecelerationFrictionCoef * f;
            duf0 duf0Var2 = y8aVar.O0;
            float f4 = duf0Var2.b + f2;
            duf0Var2.b = f4;
            float f5 = duf0Var2.c + f3;
            duf0Var2.c = f5;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f4, f5, 0);
            y8aVar.c(motionEventObtain);
            motionEventObtain.recycle();
            zdk1 viewPortHandler = x8aVar.getViewPortHandler();
            Matrix matrix = y8aVar.e;
            viewPortHandler.d(matrix, x8aVar, false);
            y8aVar.e = matrix;
            y8aVar.N0 = jCurrentAnimationTimeMillis;
            if (Math.abs(duf0Var.b) >= 0.01d || Math.abs(duf0Var.c) >= 0.01d) {
                DisplayMetrics displayMetrics = npi1.a;
                x8aVar.postInvalidateOnAnimation();
            } else {
                x8aVar.a();
                x8aVar.postInvalidate();
                duf0Var.b = 0.0f;
                duf0Var.c = 0.0f;
            }
        }
    }

    @Override // p.pne
    public final void d() {
        ArrayList arrayList;
        String str;
        float f;
        int i;
        float f2;
        if (this.b == null) {
            return;
        }
        a1r a1rVar = this.S0;
        if (a1rVar != null) {
            a1rVar.w1();
        }
        q8a q8aVar = (q8a) this;
        boolean z = q8aVar.J1;
        wjm1 wjm1Var = q8aVar.i;
        rne rneVar = q8aVar.b;
        if (z) {
            t8a t8aVar = (t8a) rneVar;
            float f3 = t8aVar.d;
            float f4 = t8aVar.j / 2.0f;
            wjm1Var.a(f3 - f4, f4 + t8aVar.c);
        } else {
            t8a t8aVar2 = (t8a) rneVar;
            wjm1Var.a(t8aVar2.d, t8aVar2.c);
        }
        int i2 = 1;
        q8aVar.u1.a(((t8a) q8aVar.b).f(1), ((t8a) q8aVar.b).e(1));
        q8aVar.v1.a(((t8a) q8aVar.b).f(2), ((t8a) q8aVar.b).e(2));
        zmm1 zmm1Var = this.w1;
        ymm1 ymm1Var = this.u1;
        zmm1Var.v1(ymm1Var.v, ymm1Var.u);
        zmm1 zmm1Var2 = this.x1;
        ymm1 ymm1Var2 = this.v1;
        zmm1Var2.v1(ymm1Var2.v, ymm1Var2.u);
        xjm1 xjm1Var = this.A1;
        wjm1 wjm1Var2 = this.i;
        xjm1Var.v1(wjm1Var2.v, wjm1Var2.u);
        if (this.O0 != null) {
            w2c0 w2c0Var = this.R0;
            rne rneVar2 = this.b;
            Paint paint = w2c0Var.c;
            u2c0 u2c0Var = w2c0Var.e;
            u2c0Var.getClass();
            ArrayList arrayList2 = w2c0Var.f;
            arrayList2.clear();
            int i3 = 0;
            while (i3 < rneVar2.c()) {
                rg70 rg70VarB = rneVar2.b(i3);
                ArrayList arrayList3 = ((u8a) rg70VarB).a;
                int size = ((u8a) rg70VarB).o.size();
                int i4 = 0;
                while (i4 < arrayList3.size() && i4 < size) {
                    u8a u8aVar = (u8a) rg70VarB;
                    arrayList2.add(new v2c0((i4 >= arrayList3.size() - i2 || i4 >= size + (-1)) ? ((u8a) rneVar2.b(i3)).c : null, u8aVar.g, u8aVar.h, u8aVar.i, ((Integer) arrayList3.get(i4)).intValue()));
                    i4++;
                    i2 = 1;
                }
                i3++;
                i2 = 1;
            }
            u2c0Var.e = (v2c0[]) arrayList2.toArray(new v2c0[arrayList2.size()]);
            paint.setTextSize(u2c0Var.c);
            paint.setColor(u2c0Var.d);
            zdk1 zdk1Var = (zdk1) w2c0Var.b;
            ArrayList arrayList4 = u2c0Var.t;
            ArrayList arrayList5 = u2c0Var.s;
            ArrayList arrayList6 = u2c0Var.u;
            float f5 = u2c0Var.k;
            float fC = npi1.c(f5);
            float fC2 = npi1.c(u2c0Var.o);
            float f6 = u2c0Var.n;
            float fC3 = npi1.c(f6);
            float fC4 = npi1.c(u2c0Var.m);
            float fC5 = npi1.c(0.0f);
            v2c0[] v2c0VarArr = u2c0Var.e;
            int length = v2c0VarArr.length;
            npi1.c(f6);
            v2c0[] v2c0VarArr2 = u2c0Var.e;
            int length2 = v2c0VarArr2.length;
            int i5 = 0;
            float f7 = 0.0f;
            float f8 = 0.0f;
            while (i5 < length2) {
                int i6 = length2;
                v2c0 v2c0Var = v2c0VarArr2[i5];
                int i7 = i5;
                float fC6 = npi1.c(Float.isNaN(v2c0Var.c) ? f5 : v2c0Var.c);
                if (fC6 > f8) {
                    f8 = fC6;
                }
                String str2 = v2c0Var.a;
                if (str2 != null) {
                    float fMeasureText = (int) paint.measureText(str2);
                    if (fMeasureText > f7) {
                        f7 = fMeasureText;
                    }
                }
                i5 = i7 + 1;
                length2 = i6;
            }
            v2c0[] v2c0VarArr3 = u2c0Var.e;
            int length3 = v2c0VarArr3.length;
            int i8 = 0;
            float f9 = 0.0f;
            while (i8 < length3) {
                int i9 = i8;
                String str3 = v2c0VarArr3[i9].a;
                if (str3 != null) {
                    float fA = npi1.a(paint, str3);
                    if (fA > f9) {
                        f9 = fA;
                    }
                }
                i8 = i9 + 1;
            }
            int iC = l1d.C(u2c0Var.h);
            if (iC == 0) {
                Paint.FontMetrics fontMetrics = npi1.e;
                paint.getFontMetrics(fontMetrics);
                float f10 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f11 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fC5;
                zdk1Var.b.width();
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                int i10 = -1;
                int i11 = 0;
                float fMax = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                while (i11 < length) {
                    v2c0 v2c0Var2 = v2c0VarArr[i11];
                    float f14 = fC2;
                    int i12 = v2c0Var2.b;
                    float f15 = f11;
                    float f16 = v2c0Var2.c;
                    boolean z2 = i12 != 1;
                    float fC7 = Float.isNaN(f16) ? fC : npi1.c(f16);
                    String str4 = v2c0Var2.a;
                    boolean z3 = z2;
                    arrayList4.add(Boolean.FALSE);
                    float f17 = i10 == -1 ? 0.0f : f12 + f14;
                    if (str4 != null) {
                        arrayList = arrayList4;
                        arrayList5.add(npi1.b(paint, str4));
                        f = f17 + (z3 ? fC3 + fC7 : 0.0f) + ((zc10) arrayList5.get(i11)).b;
                        str = str4;
                        i = -1;
                    } else {
                        arrayList = arrayList4;
                        zc10 zc10Var = (zc10) zc10.d.b();
                        str = str4;
                        zc10Var.b = 0.0f;
                        zc10Var.c = 0.0f;
                        arrayList5.add(zc10Var);
                        if (!z3) {
                            fC7 = 0.0f;
                        }
                        f = f17 + fC7;
                        i = -1;
                        if (i10 == -1) {
                            i10 = i11;
                        }
                    }
                    if (str != null || i11 == length - 1) {
                        float f18 = (f13 == 0.0f ? 0.0f : fC4) + f + f13;
                        if (i11 == length - 1) {
                            zc10 zc10Var2 = (zc10) zc10.d.b();
                            zc10Var2.b = f18;
                            zc10Var2.c = f10;
                            arrayList6.add(zc10Var2);
                            fMax = Math.max(fMax, f18);
                        }
                        f13 = f18;
                    }
                    if (str != null) {
                        i10 = i;
                    }
                    i11++;
                    arrayList4 = arrayList;
                    f11 = f15;
                    f12 = f;
                    fC2 = f14;
                }
                float f19 = f11;
                u2c0Var.q = fMax;
                u2c0Var.r = (f19 * (arrayList6.size() == 0 ? 0 : arrayList6.size() - 1)) + (f10 * arrayList6.size());
            } else if (iC == 1) {
                Paint.FontMetrics fontMetrics2 = npi1.e;
                paint.getFontMetrics(fontMetrics2);
                float f20 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                int i13 = 0;
                boolean z4 = false;
                while (i13 < length) {
                    v2c0 v2c0Var3 = v2c0VarArr[i13];
                    int i14 = v2c0Var3.b;
                    float f23 = f20;
                    float f24 = v2c0Var3.c;
                    boolean z5 = i14 != 1;
                    float fC8 = Float.isNaN(f24) ? fC : npi1.c(f24);
                    String str5 = v2c0Var3.a;
                    if (!z4) {
                        f22 = 0.0f;
                    }
                    if (z5) {
                        if (z4) {
                            f22 += fC2;
                        }
                        f22 += fC8;
                    }
                    if (str5 != null) {
                        if (z5 && !z4) {
                            f2 = f22 + fC3;
                        } else if (z4) {
                            fMax2 = Math.max(fMax2, f22);
                            f21 += f23 + fC5;
                            f2 = 0.0f;
                            z4 = false;
                        } else {
                            f2 = f22;
                        }
                        float fMeasureText2 = f2 + ((int) paint.measureText(str5));
                        if (i13 < length - 1) {
                            f21 = f23 + fC5 + f21;
                        }
                        f22 = fMeasureText2;
                    } else {
                        f22 += fC8;
                        if (i13 < length - 1) {
                            f22 += fC2;
                        }
                        z4 = true;
                    }
                    fMax2 = Math.max(fMax2, f22);
                    i13++;
                    f20 = f23;
                }
                u2c0Var.q = fMax2;
                u2c0Var.r = f21;
            }
            u2c0Var.r += u2c0Var.b;
            u2c0Var.q += u2c0Var.a;
        }
        a();
    }

    public final vi11 f(int i) {
        return i == 1 ? this.y1 : this.z1;
    }

    public final void g(int i) {
        (i == 1 ? this.u1 : this.v1).getClass();
    }

    public ymm1 getAxisLeft() {
        return this.u1;
    }

    public ymm1 getAxisRight() {
        return this.v1;
    }

    @Override // p.pne
    public /* bridge */ /* synthetic */ z8a getData() {
        return (z8a) getData();
    }

    public c5q0 getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        vi11 vi11Var = this.y1;
        RectF rectF = this.U0.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        cuf0 cuf0Var = this.E1;
        vi11Var.x(f, f2, cuf0Var);
        return (float) Math.min(this.i.u, cuf0Var.b);
    }

    public float getLowestVisibleX() {
        vi11 vi11Var = this.y1;
        RectF rectF = this.U0.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        cuf0 cuf0Var = this.D1;
        vi11Var.x(f, f2, cuf0Var);
        return (float) Math.max(this.i.v, cuf0Var.b);
    }

    @Override // p.pne
    public int getMaxVisibleCount() {
        return this.f1;
    }

    public float getMinOffset() {
        return this.s1;
    }

    public zmm1 getRendererLeftYAxis() {
        return this.w1;
    }

    public zmm1 getRendererRightYAxis() {
        return this.x1;
    }

    public xjm1 getRendererXAxis() {
        return this.A1;
    }

    @Override // android.view.View
    public float getScaleX() {
        zdk1 zdk1Var = this.U0;
        if (zdk1Var == null) {
            return 1.0f;
        }
        return zdk1Var.g;
    }

    @Override // android.view.View
    public float getScaleY() {
        zdk1 zdk1Var = this.U0;
        if (zdk1Var == null) {
            return 1.0f;
        }
        return zdk1Var.h;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // p.pne
    public float getYChartMax() {
        return Math.max(this.u1.u, this.v1.u);
    }

    @Override // p.pne
    public float getYChartMin() {
        return Math.min(this.u1.v, this.v1.v);
    }

    /* JADX WARN: Code duplicated, block: B:254:0x074d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0750  */
    /* JADX WARN: Code duplicated, block: B:257:0x0754  */
    /* JADX WARN: Code duplicated, block: B:259:0x0757  */
    /* JADX WARN: Code duplicated, block: B:262:0x0773  */
    /* JADX WARN: Code duplicated, block: B:263:0x0776  */
    /* JADX WARN: Code duplicated, block: B:264:0x0778  */
    /* JADX WARN: Code duplicated, block: B:266:0x0784  */
    /* JADX WARN: Code duplicated, block: B:268:0x0787 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0789  */
    /* JADX WARN: Code duplicated, block: B:270:0x078b  */
    /* JADX WARN: Code duplicated, block: B:273:0x078f  */
    /* JADX WARN: Code duplicated, block: B:276:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:279:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:280:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:282:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:284:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:285:0x07b7  */
    @Override // p.pne, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        zdk1 zdk1Var;
        Paint paint;
        RectF rectF;
        float f3;
        float fD;
        float f4;
        int i3;
        int i4;
        int i5;
        int i6;
        Canvas canvas2;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        float f5;
        float f6;
        float f7;
        float f8;
        w2c0 w2c0Var;
        float f9;
        float f10;
        float f11;
        Canvas canvas3;
        String str;
        float f12;
        int i10;
        float fMeasureText;
        Paint paint2;
        float f13;
        float f14;
        float fWidth;
        float f15;
        i960[] i960VarArr;
        v8a v8aVar;
        x8a x8aVar = this;
        zdk1 zdk1Var2 = x8aVar.U0;
        super.onDraw(canvas);
        if (x8aVar.b == null) {
            return;
        }
        System.currentTimeMillis();
        if (x8aVar.p1) {
            canvas.drawRect(zdk1Var2.b, x8aVar.n1);
        }
        if (x8aVar.q1) {
            canvas.drawRect(zdk1Var2.b, x8aVar.o1);
        }
        int i11 = 1;
        if (x8aVar.g1) {
            float lowestVisibleX = x8aVar.getLowestVisibleX();
            float highestVisibleX = x8aVar.getHighestVisibleX();
            z8a z8aVar = (z8a) x8aVar.b;
            Iterator it = z8aVar.i.iterator();
            while (it.hasNext()) {
                u8a u8aVar = (u8a) ((rg70) it.next());
                ArrayList arrayList2 = u8aVar.o;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    u8aVar.f148p = -3.4028235E38f;
                    u8aVar.q = Float.MAX_VALUE;
                    int iC = u8aVar.c(1, highestVisibleX, Float.NaN);
                    for (int iC2 = u8aVar.c(2, lowestVisibleX, Float.NaN); iC2 <= iC; iC2++) {
                        rzy rzyVar = (rzy) arrayList2.get(iC2);
                        if (rzyVar.a() < u8aVar.q) {
                            u8aVar.q = rzyVar.a();
                        }
                        if (rzyVar.a() > u8aVar.f148p) {
                            u8aVar.f148p = rzyVar.a();
                        }
                    }
                }
            }
            z8aVar.a();
            wjm1 wjm1Var = x8aVar.i;
            z8a z8aVar2 = (z8a) x8aVar.b;
            wjm1Var.a(z8aVar2.d, z8aVar2.c);
            ymm1 ymm1Var = x8aVar.u1;
            ymm1Var.getClass();
            ymm1Var.a(((z8a) x8aVar.b).f(1), ((z8a) x8aVar.b).e(1));
            ymm1 ymm1Var2 = x8aVar.v1;
            ymm1Var2.getClass();
            ymm1Var2.a(((z8a) x8aVar.b).f(2), ((z8a) x8aVar.b).e(2));
            x8aVar.a();
        }
        ymm1 ymm1Var3 = x8aVar.u1;
        ymm1Var3.getClass();
        x8aVar.w1.v1(ymm1Var3.v, ymm1Var3.u);
        ymm1 ymm1Var4 = x8aVar.v1;
        ymm1Var4.getClass();
        x8aVar.x1.v1(ymm1Var4.v, ymm1Var4.u);
        wjm1 wjm1Var2 = x8aVar.i;
        wjm1Var2.getClass();
        x8aVar.A1.v1(wjm1Var2.v, wjm1Var2.u);
        x8aVar.A1.y1(canvas);
        x8aVar.w1.z1(canvas);
        x8aVar.x1.z1(canvas);
        xjm1 xjm1Var = x8aVar.A1;
        Paint paint3 = xjm1Var.e;
        wc9 wc9Var = xjm1Var.c;
        zdk1 zdk1Var3 = (zdk1) xjm1Var.b;
        wjm1 wjm1Var3 = xjm1Var.i;
        if (wjm1Var3.m) {
            int iSave = canvas.save();
            RectF rectF2 = xjm1Var.Y;
            RectF rectF3 = zdk1Var3.b;
            rectF2.set(rectF3);
            wc9Var.getClass();
            i = 0;
            rectF2.inset(-1.0f, 0.0f);
            canvas.clipRect(rectF2);
            float[] fArr = xjm1Var.X;
            if (fArr.length != wc9Var.g * 2) {
                fArr = new float[wjm1Var3.g * 2];
                xjm1Var.X = fArr;
            }
            for (int i12 = 0; i12 < fArr.length; i12 += 2) {
                float[] fArr2 = wjm1Var3.f;
                int i13 = i12 / 2;
                fArr[i12] = fArr2[i13];
                fArr[i12 + 1] = fArr2[i13];
            }
            xjm1Var.d.I(fArr);
            paint3.setColor(-7829368);
            paint3.setStrokeWidth(1.0f);
            paint3.setPathEffect(null);
            Path path = xjm1Var.t;
            path.reset();
            for (int i14 = 0; i14 < fArr.length; i14 += 2) {
                float f16 = fArr[i14];
                float f17 = fArr[i14 + 1];
                path.moveTo(f16, rectF3.bottom);
                path.lineTo(f16, rectF3.top);
                canvas.drawPath(path, paint3);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        } else {
            i = 0;
        }
        x8aVar.w1.A1(canvas);
        x8aVar.x1.A1(canvas);
        x8aVar.i.getClass();
        x8aVar.u1.getClass();
        x8aVar.v1.getClass();
        int iSave2 = canvas.save();
        RectF rectF4 = zdk1Var2.b;
        RectF rectF5 = zdk1Var2.b;
        canvas.clipRect(rectF4);
        r8a r8aVar = (r8a) x8aVar.S0;
        t8a barData = r8aVar.g.getBarData();
        for (int i15 = i; i15 < barData.c(); i15++) {
            u8a u8aVar2 = (u8a) barData.b(i15);
            if (u8aVar2.n) {
                r8aVar.x1(canvas, u8aVar2, i15);
            }
        }
        i960[] i960VarArr2 = x8aVar.b1;
        if (i960VarArr2 == null || i960VarArr2.length <= 0 || i960VarArr2[i] == null) {
            i2 = 1;
            f = 1.0f;
            f2 = 2.0f;
        } else {
            r8a r8aVar2 = (r8a) x8aVar.S0;
            qne qneVar = r8aVar2.c;
            RectF rectF6 = r8aVar2.h;
            q8a q8aVar = r8aVar2.g;
            f2 = 2.0f;
            t8a barData2 = q8aVar.getBarData();
            int length = i960VarArr2.length;
            f = 1.0f;
            int i16 = i;
            while (i16 < length) {
                int i17 = i11;
                i960 i960Var = i960VarArr2[i16];
                u8a u8aVar3 = (u8a) barData2.b(i960Var.e);
                if (u8aVar3 != null) {
                    ArrayList arrayList3 = u8aVar3.o;
                    i960VarArr = i960VarArr2;
                    if (u8aVar3.e && (v8aVar = (v8a) u8aVar3.b(i960Var.a, i960Var.b)) != null) {
                        float fIndexOf = arrayList3.indexOf(v8aVar);
                        float size = arrayList3.size();
                        qneVar.getClass();
                        if (fIndexOf < size * 1.0f) {
                            vi11 vi11VarF = q8aVar.f(u8aVar3.d);
                            r8aVar2.e.setColor(u8aVar3.t);
                            r8aVar2.e.setAlpha(120);
                            float f18 = ((rzy) v8aVar).a;
                            float f19 = ((rzy) v8aVar).c;
                            float f20 = barData2.j / 2.0f;
                            rectF6.set(f19 - f20, f18, f19 + f20, 0.0f);
                            vi11VarF.getClass();
                            rectF6.top *= 1.0f;
                            rectF6.bottom *= 1.0f;
                            ((Matrix) vi11VarF.b).mapRect(rectF6);
                            ((zdk1) vi11VarF.d).a.mapRect(rectF6);
                            ((Matrix) vi11VarF.c).mapRect(rectF6);
                            rectF6.centerX();
                            canvas.drawRect(rectF6, r8aVar2.e);
                        }
                    }
                    i16++;
                    i11 = i17;
                    i960VarArr2 = i960VarArr;
                    qneVar = qneVar;
                } else {
                    i960VarArr = i960VarArr2;
                }
                i16++;
                i11 = i17;
                i960VarArr2 = i960VarArr;
                qneVar = qneVar;
            }
            i2 = i11;
        }
        canvas.restoreToCount(iSave2);
        x8aVar.S0.getClass();
        x8aVar.i.getClass();
        xjm1 xjm1Var2 = x8aVar.A1;
        Paint paint4 = xjm1Var2.h;
        zdk1 zdk1Var4 = (zdk1) xjm1Var2.b;
        RectF rectF7 = xjm1Var2.N0;
        ArrayList arrayList4 = xjm1Var2.i.f163p;
        if (arrayList4.size() > 0) {
            float[] fArr3 = xjm1Var2.Z;
            fArr3[i] = 0.0f;
            fArr3[i2] = 0.0f;
            int i18 = i;
            while (i18 < arrayList4.size()) {
                cgc0 cgc0Var = (cgc0) arrayList4.get(i18);
                cgc0Var.getClass();
                int iSave3 = canvas.save();
                RectF rectF8 = zdk1Var4.b;
                rectF7.set(rectF8);
                rectF7.inset(-cgc0Var.f, 0.0f);
                canvas.clipRect(rectF7);
                fArr3[i] = cgc0Var.e;
                fArr3[i2] = 0.0f;
                xjm1Var2.d.I(fArr3);
                float[] fArr4 = xjm1Var2.O0;
                fArr4[i] = fArr3[i];
                fArr4[i2] = rectF8.top;
                fArr4[r8] = fArr3[i];
                zdk1 zdk1Var5 = zdk1Var4;
                fArr4[3] = rectF8.bottom;
                Path path2 = xjm1Var2.P0;
                path2.reset();
                xjm1 xjm1Var3 = xjm1Var2;
                path2.moveTo(fArr4[i], fArr4[i2]);
                path2.lineTo(fArr4[r8], fArr4[3]);
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setColor(cgc0Var.g);
                paint4.setStrokeWidth(cgc0Var.f);
                paint4.setPathEffect(null);
                canvas.drawPath(path2, paint4);
                float f21 = cgc0Var.b + f2;
                String str2 = cgc0Var.i;
                if (str2 != null && !str2.equals("")) {
                    paint4.setStyle(cgc0Var.h);
                    paint4.setPathEffect(null);
                    paint4.setColor(cgc0Var.d);
                    paint4.setStrokeWidth(0.5f);
                    paint4.setTextSize(cgc0Var.c);
                    float f22 = cgc0Var.f + cgc0Var.a;
                    int i19 = cgc0Var.j;
                    if (i19 == 3) {
                        float fA = npi1.a(paint4, str2);
                        paint4.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str2, fArr3[i] + f22, rectF8.top + f21 + fA, paint4);
                    } else if (i19 == 4) {
                        paint4.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str2, fArr3[i] + f22, rectF8.bottom - f21, paint4);
                    } else if (i19 == i2) {
                        paint4.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str2, fArr3[i] - f22, rectF8.top + f21 + npi1.a(paint4, str2), paint4);
                    } else {
                        paint4.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str2, fArr3[i] - f22, rectF8.bottom - f21, paint4);
                    }
                }
                canvas.restoreToCount(iSave3);
                i18++;
                zdk1Var4 = zdk1Var5;
                xjm1Var2 = xjm1Var3;
                i2 = 1;
            }
        }
        x8aVar.u1.getClass();
        x8aVar.w1.B1(canvas);
        x8aVar.v1.getClass();
        x8aVar.x1.B1(canvas);
        xjm1 xjm1Var4 = x8aVar.A1;
        Paint paint5 = xjm1Var4.f;
        zdk1 zdk1Var6 = (zdk1) xjm1Var4.b;
        wjm1 wjm1Var4 = xjm1Var4.i;
        wjm1Var4.getClass();
        if (wjm1Var4.o) {
            float f23 = wjm1Var4.b;
            paint5.setTypeface(null);
            paint5.setTextSize(wjm1Var4.c);
            paint5.setColor(wjm1Var4.d);
            duf0 duf0VarB = duf0.b(0.0f, 0.0f);
            int i20 = wjm1Var4.y;
            if (i20 == 1) {
                duf0VarB.b = 0.5f;
                duf0VarB.c = f;
                xjm1Var4.x1(canvas, zdk1Var6.b.top - f23, duf0VarB);
            } else {
                float f24 = f;
                if (i20 == 4) {
                    duf0VarB.b = 0.5f;
                    duf0VarB.c = f24;
                    xjm1Var4.x1(canvas, zdk1Var6.b.top + f23 + wjm1Var4.x, duf0VarB);
                } else if (i20 == 2) {
                    duf0VarB.b = 0.5f;
                    duf0VarB.c = 0.0f;
                    xjm1Var4.x1(canvas, zdk1Var6.b.bottom + f23, duf0VarB);
                } else if (i20 == 5) {
                    duf0VarB.b = 0.5f;
                    duf0VarB.c = 0.0f;
                    xjm1Var4.x1(canvas, (zdk1Var6.b.bottom - f23) - wjm1Var4.x, duf0VarB);
                } else {
                    duf0VarB.b = 0.5f;
                    duf0VarB.c = 1.0f;
                    xjm1Var4.x1(canvas, zdk1Var6.b.top - f23, duf0VarB);
                    duf0VarB.b = 0.5f;
                    duf0VarB.c = 0.0f;
                    xjm1Var4.x1(canvas, zdk1Var6.b.bottom + f23, duf0VarB);
                }
            }
            duf0.d.c(duf0VarB);
        }
        x8aVar.w1.y1(canvas);
        x8aVar.x1.y1(canvas);
        if (x8aVar.r1) {
            int iSave4 = canvas.save();
            canvas.clipRect(rectF5);
            x8aVar.S0.v1(canvas);
            canvas.restoreToCount(iSave4);
        } else {
            x8aVar.S0.v1(canvas);
        }
        w2c0 w2c0Var2 = x8aVar.R0;
        Paint.FontMetrics fontMetrics = w2c0Var2.g;
        Paint paint6 = w2c0Var2.c;
        zdk1 zdk1Var7 = (zdk1) w2c0Var2.b;
        u2c0 u2c0Var = w2c0Var2.e;
        u2c0Var.getClass();
        paint6.setTextSize(u2c0Var.c);
        paint6.setColor(u2c0Var.d);
        DisplayMetrics displayMetrics = npi1.a;
        paint6.getFontMetrics(fontMetrics);
        float f25 = fontMetrics.descent - fontMetrics.ascent;
        paint6.getFontMetrics(fontMetrics);
        float fC = npi1.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
        float fA2 = f25 - (npi1.a(paint6, "ABC") / f2);
        v2c0[] v2c0VarArr = u2c0Var.e;
        float fC2 = npi1.c(u2c0Var.n);
        float fC3 = npi1.c(u2c0Var.m);
        int i21 = u2c0Var.h;
        int i22 = u2c0Var.f;
        int i23 = u2c0Var.g;
        int i24 = u2c0Var.i;
        float fC4 = npi1.c(u2c0Var.k);
        float fC5 = npi1.c(u2c0Var.o);
        float f26 = u2c0Var.b;
        float f27 = u2c0Var.a;
        int iC3 = l1d.C(i22);
        if (iC3 != 0) {
            rectF = rectF5;
            if (iC3 == 1) {
                if (i21 == 2) {
                    fWidth = zdk1Var7.c / f2;
                } else {
                    RectF rectF9 = zdk1Var7.b;
                    fWidth = (rectF9.width() / f2) + rectF9.left;
                }
                f15 = fWidth + (i24 == 1 ? f27 : -f27);
                if (i21 == 2) {
                    zdk1Var = zdk1Var2;
                    paint = paint6;
                    double d = f15;
                    float f28 = u2c0Var.q;
                    f3 = (float) (d + (i24 == 1 ? (((double) (-f28)) / 2.0d) + ((double) f27) : (((double) f28) / 2.0d) - ((double) f27)));
                } else {
                    zdk1Var = zdk1Var2;
                    paint = paint6;
                    f3 = f15;
                }
            } else if (iC3 != 2) {
                zdk1Var = zdk1Var2;
                paint = paint6;
                f3 = 0.0f;
            } else {
                f15 = (i21 == 2 ? zdk1Var7.c : zdk1Var7.b.right) - f27;
                if (i24 == 1) {
                    f15 -= u2c0Var.q;
                }
                zdk1Var = zdk1Var2;
                paint = paint6;
                f3 = f15;
            }
        } else {
            zdk1Var = zdk1Var2;
            paint = paint6;
            rectF = rectF5;
            f3 = i21 == 2 ? f27 : zdk1Var7.b.left + f27;
            if (i24 == 2) {
                f3 += u2c0Var.q;
            }
        }
        int iC4 = l1d.C(i21);
        if (iC4 == 0) {
            float f29 = f3;
            Paint paint7 = paint;
            ArrayList arrayList5 = u2c0Var.u;
            ArrayList arrayList6 = u2c0Var.s;
            ArrayList arrayList7 = u2c0Var.t;
            int iC5 = l1d.C(i23);
            if (iC5 == 0) {
                fD = f26;
            } else if (iC5 != 1) {
                fD = iC5 != 2 ? 0.0f : (zdk1Var7.d - f26) - u2c0Var.r;
            } else {
                fD = c13.d(zdk1Var7.d, u2c0Var.r, f2, f26);
            }
            int length2 = v2c0VarArr.length;
            int i25 = i;
            int i26 = i25;
            float f30 = f29;
            while (i25 < length2) {
                float f31 = fD;
                v2c0 v2c0Var = v2c0VarArr[i25];
                float f32 = f30;
                int i27 = v2c0Var.b;
                int i28 = length2;
                String str3 = v2c0Var.a;
                v2c0[] v2c0VarArr2 = v2c0VarArr;
                float f33 = v2c0Var.c;
                int i29 = i27 != 1 ? 1 : i;
                float fC6 = Float.isNaN(f33) ? fC4 : npi1.c(f33);
                if (i25 >= arrayList7.size() || !((Boolean) arrayList7.get(i25)).booleanValue()) {
                    f4 = f32;
                } else {
                    f31 = f25 + fC + f31;
                    f4 = f29;
                }
                if (f4 == f29) {
                    i3 = i29;
                    i4 = i25;
                    if (i22 == 2 && i26 < arrayList5.size()) {
                        f4 += (i24 == 2 ? ((zc10) arrayList5.get(i26)).b : -((zc10) arrayList5.get(i26)).b) / 2.0f;
                        i26++;
                    }
                    i5 = i26;
                    if (str3 == null) {
                        i6 = 1;
                    } else {
                        i6 = i;
                    }
                    if (i3 != 0) {
                        if (i24 == 2) {
                            f4 -= fC6;
                        }
                        i8 = i22;
                        i7 = i5;
                        i9 = i4;
                        arrayList = arrayList7;
                        f7 = f4;
                        canvas2 = canvas;
                        w2c0Var2.v1(canvas2, f7, f31 + fA2, v2c0Var, w2c0Var2.e);
                        if (i24 == 1) {
                            f4 = f7 + fC6;
                        } else {
                            f4 = f7;
                        }
                    } else {
                        canvas2 = canvas;
                        i7 = i5;
                        i8 = i22;
                        i9 = i4;
                        arrayList = arrayList7;
                    }
                    if (i6 == 0) {
                        if (i3 != 0) {
                            if (i24 == 2) {
                                f6 = -fC2;
                            } else {
                                f6 = fC2;
                            }
                            f4 += f6;
                        }
                        if (i24 == 2) {
                            f4 -= ((zc10) arrayList6.get(i9)).b;
                        }
                        canvas2.drawText(str3, f4, f31 + f25, paint7);
                        if (i24 == 1) {
                            f4 += ((zc10) arrayList6.get(i9)).b;
                        }
                        if (i24 == 2) {
                            f5 = -fC3;
                        } else {
                            f5 = fC3;
                        }
                    } else if (i24 == 2) {
                        f5 = -fC5;
                    } else {
                        f5 = fC5;
                    }
                    f30 = f4 + f5;
                    i25 = i9 + 1;
                    fD = f31;
                    length2 = i28;
                    v2c0VarArr = v2c0VarArr2;
                    i22 = i8;
                    arrayList7 = arrayList;
                    i26 = i7;
                } else {
                    i3 = i29;
                    i4 = i25;
                }
                i5 = i26;
                if (str3 == null) {
                    i6 = 1;
                } else {
                    i6 = i;
                }
                if (i3 != 0) {
                    if (i24 == 2) {
                        f4 -= fC6;
                    }
                    i8 = i22;
                    i7 = i5;
                    i9 = i4;
                    arrayList = arrayList7;
                    f7 = f4;
                    canvas2 = canvas;
                    w2c0Var2.v1(canvas2, f7, f31 + fA2, v2c0Var, w2c0Var2.e);
                    if (i24 == 1) {
                        f4 = f7 + fC6;
                    } else {
                        f4 = f7;
                    }
                } else {
                    canvas2 = canvas;
                    i7 = i5;
                    i8 = i22;
                    i9 = i4;
                    arrayList = arrayList7;
                }
                if (i6 == 0) {
                    if (i3 != 0) {
                        if (i24 == 2) {
                            f6 = -fC2;
                        } else {
                            f6 = fC2;
                        }
                        f4 += f6;
                    }
                    if (i24 == 2) {
                        f4 -= ((zc10) arrayList6.get(i9)).b;
                    }
                    canvas2.drawText(str3, f4, f31 + f25, paint7);
                    if (i24 == 1) {
                        f4 += ((zc10) arrayList6.get(i9)).b;
                    }
                    if (i24 == 2) {
                        f5 = -fC3;
                    } else {
                        f5 = fC3;
                    }
                } else if (i24 == 2) {
                    f5 = -fC5;
                } else {
                    f5 = fC5;
                }
                f30 = f4 + f5;
                i25 = i9 + 1;
                fD = f31;
                length2 = i28;
                v2c0VarArr = v2c0VarArr2;
                i22 = i8;
                arrayList7 = arrayList;
                i26 = i7;
            }
            x8aVar = this;
        } else if (iC4 == 1) {
            int iC6 = l1d.C(i23);
            if (iC6 == 0) {
                f8 = (i22 == 2 ? 0.0f : zdk1Var7.b.top) + f26;
            } else if (iC6 == 1) {
                f8 = ((zdk1Var7.d / f2) - (u2c0Var.r / f2)) + u2c0Var.b;
            } else if (iC6 != 2) {
                f8 = 0.0f;
            } else {
                f8 = (i22 == 2 ? zdk1Var7.d : zdk1Var7.b.bottom) - (u2c0Var.r + f26);
            }
            float f34 = f8;
            int i30 = i;
            int i31 = i30;
            float f35 = 0.0f;
            while (i31 < v2c0VarArr.length) {
                v2c0 v2c0Var2 = v2c0VarArr[i31];
                int i32 = v2c0Var2.b;
                String str4 = v2c0Var2.a;
                float f36 = v2c0Var2.c;
                int i33 = i32 != 1 ? 1 : i;
                float fC7 = Float.isNaN(f36) ? fC4 : npi1.c(f36);
                if (i33 != 0) {
                    float f37 = i24 == 1 ? f3 + f35 : f3 - (fC7 - f35);
                    f9 = f3;
                    f11 = fC5;
                    f12 = f34;
                    i10 = 1;
                    f10 = f35;
                    str = str4;
                    fMeasureText = f37;
                    w2c0Var2.v1(canvas, fMeasureText, f34 + fA2, v2c0Var2, w2c0Var2.e);
                    w2c0Var = w2c0Var2;
                    canvas3 = canvas;
                    if (i24 == 1) {
                        fMeasureText += fC7;
                    }
                } else {
                    w2c0Var = w2c0Var2;
                    f9 = f3;
                    f10 = f35;
                    f11 = fC5;
                    canvas3 = canvas;
                    str = str4;
                    f12 = f34;
                    i10 = 1;
                    fMeasureText = f9;
                }
                if (str != null) {
                    if (i33 != 0 && i30 == 0) {
                        fMeasureText += i24 == i10 ? fC2 : -fC2;
                    } else if (i30 != 0) {
                        fMeasureText = f9;
                    }
                    if (i24 == 2) {
                        paint2 = paint;
                        fMeasureText -= (int) paint2.measureText(str);
                    } else {
                        paint2 = paint;
                    }
                    if (i30 == 0) {
                        canvas3.drawText(str, fMeasureText, f12 + f25, paint2);
                        f14 = f12;
                    } else {
                        f14 = f25 + fC + f12;
                        canvas3.drawText(str, fMeasureText, f14 + f25, paint2);
                    }
                    f13 = f25 + fC + f14;
                    f35 = 0.0f;
                } else {
                    paint2 = paint;
                    f35 = fC7 + f11 + f10;
                    f13 = f12;
                    i30 = 1;
                }
                i31++;
                w2c0Var2 = w2c0Var;
                fC5 = f11;
                paint = paint2;
                f3 = f9;
                f34 = f13;
            }
        }
        if (x8aVar.N0 != null) {
            x8aVar.g.setTypeface(null);
            x8aVar.g.setTextSize(x8aVar.N0.c);
            x8aVar.g.setColor(x8aVar.N0.d);
            x8aVar.g.setTextAlign(x8aVar.N0.f);
            zdk1 zdk1Var8 = zdk1Var;
            RectF rectF10 = rectF;
            float width = (x8aVar.getWidth() - (zdk1Var8.c - rectF10.right)) - x8aVar.N0.a;
            float height = x8aVar.getHeight() - (zdk1Var8.d - rectF10.bottom);
            aet aetVar = x8aVar.N0;
            canvas.drawText(aetVar.e, width, height - aetVar.b, x8aVar.g);
        }
        if (x8aVar.a) {
            System.currentTimeMillis();
        }
    }

    @Override // p.pne, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        zdk1 zdk1Var = this.U0;
        float[] fArr = this.F1;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.t1) {
            RectF rectF = zdk1Var.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.y1.H(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.t1) {
            zdk1Var.d(zdk1Var.a, this, true);
            return;
        }
        this.y1.I(fArr);
        Matrix matrix = zdk1Var.l;
        matrix.reset();
        matrix.set(zdk1Var.a);
        float f = fArr[0];
        RectF rectF2 = zdk1Var.b;
        matrix.postTranslate(-(f - rectF2.left), -(fArr[1] - rectF2.top));
        zdk1Var.d(matrix, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        wne wneVar = this.P0;
        if (wneVar == null || this.b == null || !this.t) {
            return false;
        }
        return ((y8a) wneVar).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.g1 = z;
    }

    public void setBorderColor(int i) {
        this.o1.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.o1.setStrokeWidth(npi1.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.r1 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.i1 = z;
    }

    public void setDragEnabled(boolean z) {
        this.k1 = z;
    }

    public void setDragOffsetX(float f) {
        zdk1 zdk1Var = this.U0;
        zdk1Var.getClass();
        zdk1Var.j = npi1.c(f);
    }

    public void setDragOffsetY(float f) {
        zdk1 zdk1Var = this.U0;
        zdk1Var.getClass();
        zdk1Var.k = npi1.c(f);
    }

    public void setDrawBorders(boolean z) {
        this.q1 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.p1 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.n1.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.j1 = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.t1 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f1 = i;
    }

    public void setMinOffset(float f) {
        this.s1 = f;
    }

    public void setPinchZoom(boolean z) {
        this.h1 = z;
    }

    public void setRendererLeftYAxis(zmm1 zmm1Var) {
        this.w1 = zmm1Var;
    }

    public void setRendererRightYAxis(zmm1 zmm1Var) {
        this.x1 = zmm1Var;
    }

    public void setScaleEnabled(boolean z) {
        this.l1 = z;
        this.m1 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.l1 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.m1 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.i.w / f;
        zdk1 zdk1Var = this.U0;
        zdk1Var.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        zdk1Var.e = f2;
        zdk1Var.c(zdk1Var.a, zdk1Var.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.i.w / f;
        zdk1 zdk1Var = this.U0;
        zdk1Var.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        zdk1Var.f = f2;
        zdk1Var.c(zdk1Var.a, zdk1Var.b);
    }

    public void setXAxisRenderer(xjm1 xjm1Var) {
        this.A1 = xjm1Var;
    }

    public void setOnDrawListener(c5q0 c5q0Var) {
    }
}
