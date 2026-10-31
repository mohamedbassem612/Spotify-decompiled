package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lcg extends q8v {
    public int c;
    public float d;
    public float e;
    public float f;

    @Override // p.q8v
    public final void a(Canvas canvas, float f) {
        ucg ucgVar = (ucg) this.a;
        float f2 = (ucgVar.g / 2.0f) + ucgVar.h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.c = ucgVar.i == 0 ? 1 : -1;
        int i = ucgVar.a;
        this.d = i * f;
        this.e = ucgVar.b * f;
        this.f = (ucgVar.g - i) / 2.0f;
        if ((this.b.d() && ucgVar.e == 2) || (this.b.c() && ucgVar.f == 1)) {
            this.f = (((1.0f - f) * ucgVar.a) / 2.0f) + this.f;
        } else if ((this.b.d() && ucgVar.e == 1) || (this.b.c() && ucgVar.f == 2)) {
            this.f -= ((1.0f - f) * ucgVar.a) / 2.0f;
        }
    }

    @Override // p.q8v
    public final void b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        f(canvas, paint, this.d, this.e, f4);
        f(canvas, paint, this.d, this.e, f4 + f5);
    }

    @Override // p.q8v
    public final void c(Canvas canvas, Paint paint) {
        int iM = ago1.m(((ucg) this.a).d, this.b.t);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iM);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    public final void f(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }
}
