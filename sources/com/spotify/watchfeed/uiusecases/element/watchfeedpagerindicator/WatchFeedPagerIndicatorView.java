package com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8p1;
import p.i2k;
import p.l1d;
import p.mmr0;
import p.t9l1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/spotify/watchfeed/uiusecases/element/watchfeedpagerindicator/WatchFeedPagerIndicatorView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/rih1;", "setColor", "(Ljava/lang/Integer;)V", "p/b8p1", "src_main_java_com_spotify_watchfeed_uiusecases_element_watchfeedpagerindicator-watchfeedpagerindicator"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WatchFeedPagerIndicatorView extends View {
    public final Paint N0;
    public ViewPager2 O0;
    public final int a;
    public final int b;
    public PorterDuffColorFilter c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public b8p1 h;
    public i2k i;
    public final ArgbEvaluator t;

    public WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.getColor(2131104462);
        this.b = context.getColor(2131104465);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166802);
        this.d = dimensionPixelSize;
        this.e = getResources().getDimension(2131166803);
        this.f = dimensionPixelSize;
        this.g = getResources().getDimensionPixelSize(2131166973);
        this.h = new b8p1(0);
        this.t = new ArgbEvaluator();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.N0 = paint;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131167027);
        setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
    }

    public final void a(int i) {
        if (this.O0 != null) {
            this.h = new b8p1(i);
            ViewPager2 viewPager2 = this.O0;
            if (viewPager2 == null) {
                u890.C("viewPager");
                throw null;
            }
            this.h.x(0.0f, viewPager2.getCurrentItem());
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b8p1 b8p1Var = this.h;
        int i = this.d;
        float f = i;
        float f2 = this.f;
        float f3 = (-((Number) ((mmr0) b8p1Var.d).a).floatValue()) * f;
        float f4 = 1.0f;
        float fFloatValue = (((Number) ((mmr0) b8p1Var.d).a).floatValue() - 1.0f) * f2;
        float f5 = 0.0f;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        canvas.translate(f3 - fFloatValue, 0.0f);
        b8p1 b8p1Var2 = this.h;
        t9l1[] t9l1VarArr = (t9l1[]) b8p1Var2.e;
        float[] fArr = (float[]) b8p1Var2.c;
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f6 = fArr[i2];
            int i4 = i3 + 1;
            float f7 = f4;
            int iIntValue = ((Integer) this.t.evaluate(f6, Integer.valueOf(this.a), Integer.valueOf(this.b))).intValue();
            Paint paint = this.N0;
            paint.setColor(iIntValue);
            paint.setColorFilter(this.c);
            int i5 = this.g;
            float f8 = i5 - ((i5 - i) * f6);
            float paddingTop = getPaddingTop();
            float[] fArr2 = fArr;
            int i6 = i;
            float f9 = f2;
            RectF rectF = new RectF(f5, paddingTop, f5 + f8, paddingTop + f);
            float f10 = t9l1VarArr[i3].a;
            if (f10 == f7) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                float f11 = this.e;
                float fE = l1d.e(f, f11, f10, f11);
                if (f6 == f7) {
                    float fCenterX = rectF.centerX();
                    float fCenterY = rectF.centerY();
                    float fWidth = (((rectF.width() - f11) * f10) + f11) / 2.0f;
                    float fHeight = (((rectF.height() - f11) * f10) + f11) / 2.0f;
                    canvas.drawRoundRect(new RectF(fCenterX - fWidth, fCenterY - fHeight, fCenterX + fWidth, fCenterY + fHeight), fE, fE, paint);
                } else {
                    float fCenterY2 = rectF.centerY();
                    float fHeight2 = (((rectF.height() - f11) * f10) + f11) / 2.0f;
                    rectF.top = fCenterY2 - fHeight2;
                    rectF.bottom = fCenterY2 + fHeight2;
                    canvas.drawRoundRect(rectF, fE, fE, paint);
                }
            }
            f5 += f8 + f9;
            i2++;
            i3 = i4;
            f4 = f7;
            fArr = fArr2;
            i = i6;
            f2 = f9;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(this.h.b, 4);
        int i3 = this.d;
        setMeasuredDimension(View.resolveSize(((iMin - 1) * this.f) + (iMin * i3) + this.g, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + i3, i2));
    }

    public final void setColor(Integer color) {
        this.c = color != null ? new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.MULTIPLY) : null;
        invalidate();
    }

    public WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WatchFeedPagerIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ WatchFeedPagerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
