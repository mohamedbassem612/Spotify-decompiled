package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class pne extends ViewGroup {
    public aet N0;
    public u2c0 O0;
    public wne P0;
    public String Q0;
    public w2c0 R0;
    public a1r S0;
    public une T0;
    public zdk1 U0;
    public qne V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;
    public boolean a;
    public boolean a1;
    public rne b;
    public i960[] b1;
    public boolean c;
    public float c1;
    public boolean d;
    public ArrayList d1;
    public float e;
    public boolean e1;
    public yeb0 f;
    public Paint g;
    public Paint h;
    public wjm1 i;
    public boolean t;

    public static void e(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                e(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public abstract i960 b(float f, float f2);

    public final void c(i960 i960Var) {
        rzy rzyVarB;
        i960[] i960VarArr = null;
        if (i960Var == null) {
            this.b1 = null;
        } else {
            int i = i960Var.e;
            if (this.a) {
                i960Var.toString();
            }
            rne rneVar = this.b;
            rneVar.getClass();
            ArrayList arrayList = rneVar.i;
            if (i >= arrayList.size()) {
                rzyVarB = null;
            } else {
                rzyVarB = ((u8a) ((rg70) arrayList.get(i))).b(i960Var.a, i960Var.b);
            }
            if (rzyVarB == null) {
                this.b1 = null;
            } else {
                i960VarArr = new i960[]{i960Var};
                this.b1 = i960VarArr;
            }
        }
        setLastHighlighted(i960VarArr);
        invalidate();
    }

    public abstract void d();

    public qne getAnimator() {
        return this.V0;
    }

    public duf0 getCenter() {
        return duf0.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public duf0 getCenterOfView() {
        return getCenter();
    }

    public duf0 getCenterOffsets() {
        RectF rectF = this.U0.b;
        return duf0.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.U0.b;
    }

    public rne getData() {
        return this.b;
    }

    public lk70 getDefaultValueFormatter() {
        return this.f;
    }

    public aet getDescription() {
        return this.N0;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.e;
    }

    public float getExtraBottomOffset() {
        return this.Y0;
    }

    public float getExtraLeftOffset() {
        return this.Z0;
    }

    public float getExtraRightOffset() {
        return this.X0;
    }

    public float getExtraTopOffset() {
        return this.W0;
    }

    public i960[] getHighlighted() {
        return this.b1;
    }

    public zg70 getHighlighter() {
        return this.T0;
    }

    public ArrayList<Runnable> getJobs() {
        return this.d1;
    }

    public u2c0 getLegend() {
        return this.O0;
    }

    public w2c0 getLegendRenderer() {
        return this.R0;
    }

    public ch70 getMarker() {
        return null;
    }

    @Deprecated
    public ch70 getMarkerView() {
        getMarker();
        return null;
    }

    public float getMaxHighlightDistance() {
        return this.c1;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public b2q0 getOnChartGestureListener() {
        return null;
    }

    public wne getOnTouchListener() {
        return this.P0;
    }

    public a1r getRenderer() {
        return this.S0;
    }

    public zdk1 getViewPortHandler() {
        return this.U0;
    }

    public wjm1 getXAxis() {
        return this.i;
    }

    public float getXChartMax() {
        return this.i.u;
    }

    public float getXChartMin() {
        return this.i.v;
    }

    public float getXRange() {
        return this.i.w;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.b.a;
    }

    public float getYMin() {
        return this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e1) {
            e(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.b == null) {
            if (TextUtils.isEmpty(this.Q0)) {
                return;
            }
            duf0 center = getCenter();
            canvas.drawText(this.Q0, center.b, center.c, this.h);
            return;
        }
        if (this.a1) {
            return;
        }
        a();
        this.a1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) npi1.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.d1;
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            zdk1 zdk1Var = this.U0;
            float f = i;
            float f2 = i2;
            RectF rectF = zdk1Var.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = zdk1Var.c - rectF.right;
            float f6 = zdk1Var.d - rectF.bottom;
            zdk1Var.d = f2;
            zdk1Var.c = f;
            rectF.set(f3, f4, f - f5, f2 - f6);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                post((Runnable) it.next());
            }
            arrayList.clear();
        }
        d();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(rne rneVar) {
        yeb0 yeb0Var = this.f;
        this.b = rneVar;
        this.a1 = false;
        if (rneVar == null) {
            return;
        }
        float f = rneVar.b;
        float f2 = rneVar.a;
        float fD = npi1.d(rneVar.d() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        yeb0Var.d(Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2);
        Iterator it = this.b.i.iterator();
        while (it.hasNext()) {
            u8a u8aVar = (u8a) ((rg70) it.next());
            Object obj = u8aVar.f;
            if (obj != null) {
                if (obj == null) {
                    obj = npi1.g;
                }
                if (obj == yeb0Var) {
                }
            }
            u8aVar.f = yeb0Var;
        }
        d();
    }

    public void setDescription(aet aetVar) {
        this.N0 = aetVar;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setExtraBottomOffset(float f) {
        this.Y0 = npi1.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.Z0 = npi1.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.X0 = npi1.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.W0 = npi1.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.c = z;
    }

    public void setHighlighter(une uneVar) {
        this.T0 = uneVar;
    }

    public void setLastHighlighted(i960[] i960VarArr) {
        i960 i960Var;
        if (i960VarArr == null || i960VarArr.length <= 0 || (i960Var = i960VarArr[0]) == null) {
            this.P0.b = null;
        } else {
            this.P0.b = i960Var;
        }
    }

    public void setLogEnabled(boolean z) {
        this.a = z;
    }

    @Deprecated
    public void setMarkerView(ch70 ch70Var) {
        setMarker(ch70Var);
    }

    public void setMaxHighlightDistance(float f) {
        this.c1 = npi1.c(f);
    }

    public void setNoDataText(String str) {
        this.Q0 = str;
    }

    public void setNoDataTextColor(int i) {
        this.h.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setOnTouchListener(wne wneVar) {
        this.P0 = wneVar;
    }

    public void setRenderer(a1r a1rVar) {
        if (a1rVar != null) {
            this.S0 = a1rVar;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.t = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.e1 = z;
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setMarker(ch70 ch70Var) {
    }

    public void setOnChartGestureListener(b2q0 b2q0Var) {
    }

    public void setOnChartValueSelectedListener(c2q0 c2q0Var) {
    }
}
