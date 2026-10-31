package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ekk1 extends View {
    public RectF a;
    public final Paint b;

    public ekk1(Context context) {
        super(context, null, 0);
        this.a = new RectF();
        Paint paint = new Paint();
        paint.setColor(2130771712);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.a, this.b);
    }

    public final void setVisibleRect(RectF rectF) {
        this.a = rectF;
        invalidate();
    }
}
