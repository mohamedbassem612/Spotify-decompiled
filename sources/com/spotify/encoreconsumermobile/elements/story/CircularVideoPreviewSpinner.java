package com.spotify.encoreconsumermobile.elements.story;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h94;
import p.lqc;
import p.yqg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/story/CircularVideoPreviewSpinner;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lp/yqg;", "clock", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILp/yqg;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p/lqc", "src_main_java_com_spotify_encoreconsumermobile_elements_story-story"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CircularVideoPreviewSpinner extends View {
    public static final /* synthetic */ int f = 0;
    public final yqg a;
    public final RectF b;
    public final Paint c;
    public long d;
    public boolean e;

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i, yqg yqgVar) {
        super(context, attributeSet, i);
        this.a = yqgVar;
        this.b = new RectF();
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-14829228);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fW;
        float f2;
        boolean z = this.e;
        Paint paint = this.c;
        RectF rectF = this.b;
        if (z) {
            long jB = this.a.b() - this.d;
            if (jB < 4200) {
                int i = (int) (jB / 1400);
                float f3 = (jB % 1400) / 1400.0f;
                float f4 = 360.0f;
                float fW2 = i < 2 ? ((lqc.w(f3 - 1.0f) * 360.0f) + 270.0f) % 360.0f : 270.0f;
                if (i < 3) {
                    if (i == 2) {
                        fW = lqc.w(f3 - 1.0f);
                        f2 = 345.0f;
                    } else {
                        fW = lqc.w((f3 * 2.0f) - 1.0f);
                        f2 = 45.0f;
                    }
                    f4 = 15.0f + (fW * f2);
                }
                canvas.drawArc(rectF, fW2, f4, false, paint);
                invalidate();
                return;
            }
            this.e = false;
        }
        canvas.drawArc(rectF, 270.0f, 360.0f, false, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float width = getWidth();
        float height = getHeight();
        float fMin = Math.min(width, height);
        RectF rectF = this.b;
        rectF.set((width - fMin) * 0.5f, (height - fMin) * 0.5f, fMin, fMin);
        float strokeWidth = this.c.getStrokeWidth() * 0.5f;
        rectF.inset(strokeWidth, strokeWidth);
    }

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularVideoPreviewSpinner(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CircularVideoPreviewSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new h94());
    }
}
