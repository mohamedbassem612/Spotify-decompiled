package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kic0 extends q8v {
    public float c;
    public float d;
    public float e;

    public kic0(uic0 uic0Var) {
        super(uic0Var);
        this.c = 300.0f;
    }

    @Override // p.q8v
    public final void a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        uic0 uic0Var = (uic0) this.a;
        float f2 = uic0Var.a;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - uic0Var.a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (uic0Var.i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.d() && uic0Var.e == 1) || (this.b.c() && uic0Var.f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.d() || this.b.c()) {
            canvas.translate(0.0f, ((f - 1.0f) * uic0Var.a) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.d = uic0Var.a * f;
        this.e = uic0Var.b * f;
    }

    @Override // p.q8v
    public final void b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = (-f3) / 2.0f;
        float f5 = this.e * 2.0f;
        float f6 = f3 - f5;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f7 = this.d;
        RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
        float f8 = this.e;
        canvas.drawRoundRect(rectF, f8, f8, paint);
    }

    @Override // p.q8v
    public final void c(Canvas canvas, Paint paint) {
        int iM = ago1.m(((uic0) this.a).d, this.b.t);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iM);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // p.q8v
    public final int d() {
        return ((uic0) this.a).a;
    }

    @Override // p.q8v
    public final int e() {
        return -1;
    }
}
