package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yy9 extends View {
    public final Path a;
    public final Path b;
    public final Path c;
    public final Paint d;
    public final Paint e;
    public final int f;
    public final int g;
    public final idd1 h;
    public List i;
    public ValueAnimator t;

    public yy9(Context context) {
        super(context, null, 0, 0);
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(context.getColor(2131101398));
        paint.setStrokeWidth(getResources().getDimensionPixelSize(2131165977));
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.e = paint2;
        this.f = context.getColor(2131101397);
        this.g = context.getColor(2131101396);
        this.h = new idd1(new vv8(this, (byte) 5));
        this.i = z6x.a;
    }

    private final long getShortDuration() {
        return ((Number) this.h.getValue()).longValue();
    }

    public final void a(ArrayList arrayList, boolean z) {
        if (u890.j(this.i, arrayList)) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            b(arrayList);
        } else if (this.i.isEmpty()) {
            b(arrayList);
        } else {
            List list = this.i;
            ValueAnimator valueAnimator2 = this.t;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(getShortDuration());
            valueAnimatorOfFloat.addUpdateListener(new xy9(list, arrayList, this));
            valueAnimatorOfFloat.start();
            this.t = valueAnimatorOfFloat;
        }
        this.i = arrayList;
    }

    public final void b(ArrayList arrayList) {
        ArrayList arrayList2;
        int i;
        Path path = this.a;
        path.reset();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PointF pointF = (PointF) it.next();
            arrayList3.add(Float.valueOf(pointF.x));
            arrayList3.add(Float.valueOf(pointF.y));
        }
        int i2 = 0;
        arrayList3.add(0, Float.valueOf(((PointF) arrayList.get(0)).x));
        arrayList3.add(1, Float.valueOf(((PointF) arrayList.get(0)).y));
        arrayList3.add(Float.valueOf(((PointF) arrayList.get(p7h.L(arrayList))).x));
        arrayList3.add(Float.valueOf(((PointF) arrayList.get(p7h.L(arrayList))).y));
        ArrayList arrayList4 = new ArrayList();
        rr80 rr80VarO = yoi1.O(yoi1.Q(2, arrayList3.size() - 4), 2);
        int i3 = rr80VarO.a;
        int i4 = rr80VarO.b;
        int i5 = rr80VarO.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            arrayList2 = arrayList4;
            i = 0;
        } else {
            while (true) {
                int i6 = i2;
                while (i6 < 25) {
                    int i7 = i3 + 2;
                    float fFloatValue = (((Number) arrayList3.get(i7)).floatValue() - ((Number) arrayList3.get(i3 - 2)).floatValue()) * 0.6f;
                    float fFloatValue2 = (((Number) arrayList3.get(i3 + 4)).floatValue() - ((Number) arrayList3.get(i3)).floatValue()) * 0.6f;
                    int i8 = i3 + 3;
                    float fFloatValue3 = (((Number) arrayList3.get(i8)).floatValue() - ((Number) arrayList3.get(i3 - 1)).floatValue()) * 0.6f;
                    int i9 = i3 + 1;
                    float fFloatValue4 = (((Number) arrayList3.get(i3 + 5)).floatValue() - ((Number) arrayList3.get(i9)).floatValue()) * 0.6f;
                    double d = ((double) i6) / 24.0d;
                    double dPow = ((Math.pow(d, 3.0d) * 2.0d) - (Math.pow(d, 2.0d) * 3.0d)) + 1.0d;
                    double dPow2 = (Math.pow(d, 2.0d) * 3.0d) + (-(Math.pow(d, 3.0d) * 2.0d));
                    ArrayList arrayList5 = arrayList4;
                    double dPow3 = (Math.pow(d, 3.0d) - (Math.pow(d, 2.0d) * 2.0d)) + d;
                    double dPow4 = Math.pow(d, 3.0d) - Math.pow(d, 2.0d);
                    arrayList5.add(new PointF((float) ((((double) fFloatValue2) * dPow4) + (((double) fFloatValue) * dPow3) + (((Number) arrayList3.get(i7)).doubleValue() * dPow2) + (((Number) arrayList3.get(i3)).doubleValue() * dPow)), (float) ((dPow4 * ((double) fFloatValue4)) + (dPow3 * ((double) fFloatValue3)) + (((Number) arrayList3.get(i8)).doubleValue() * dPow2) + (((Number) arrayList3.get(i9)).doubleValue() * dPow))));
                    i6++;
                    arrayList4 = arrayList5;
                    i4 = i4;
                }
                arrayList2 = arrayList4;
                int i10 = i4;
                if (i3 == i10) {
                    break;
                }
                i3 += i5;
                i4 = i10;
                arrayList4 = arrayList2;
                i2 = 0;
            }
            i = 0;
        }
        path.moveTo(((PointF) arrayList2.get(i)).x, ((PointF) arrayList2.get(i)).y);
        int iL = p7h.L(arrayList2);
        for (int i11 = 1; i11 < iL; i11++) {
            path.lineTo(((PointF) arrayList2.get(i11)).x, ((PointF) arrayList2.get(i11)).y);
        }
        this.b.set(path);
        path.lineTo(((PointF) o7h.A0(arrayList)).x, getHeight());
        path.lineTo(((PointF) o7h.q0(arrayList)).x, getHeight());
        path.close();
        this.c.set(path);
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.c, this.e);
        canvas.drawPath(this.b, this.d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.e.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.f, this.g, Shader.TileMode.MIRROR));
    }
}
