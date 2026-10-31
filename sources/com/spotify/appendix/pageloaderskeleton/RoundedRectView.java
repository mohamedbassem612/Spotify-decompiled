package com.spotify.appendix.pageloaderskeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import p.qmz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class RoundedRectView extends View {
    public final Paint a;
    public float b;

    public RoundedRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-65536);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qmz0.a);
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                setColor(typedArrayObtainStyledAttributes.getColor(index, this.a.getColor()));
            } else if (index == 1) {
                setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        float height = getHeight();
        float f = this.b;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.a);
    }

    public void setColor(int i) {
        this.a.setColor(i);
    }

    public void setCornerRadius(float f) {
        this.b = f;
    }

    public RoundedRectView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-65536);
    }
}
