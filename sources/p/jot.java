package p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jot extends c8v {
    public static final iot Q0 = new iot();
    public final d8b1 N0;
    public float O0;
    public boolean P0;
    public final kic0 Y;
    public final e8b1 Z;

    public jot(Context context, uic0 uic0Var, kic0 kic0Var) {
        super(context, uic0Var);
        this.P0 = false;
        this.Y = kic0Var;
        kic0Var.b = this;
        e8b1 e8b1Var = new e8b1();
        this.Z = e8b1Var;
        e8b1Var.a();
        e8b1Var.b(50.0f);
        d8b1 d8b1Var = new d8b1(this);
        this.N0 = d8b1Var;
        d8b1Var.m = e8b1Var;
        if (this.h != 1.0f) {
            this.h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            float fB = b();
            kic0 kic0Var = this.Y;
            kic0Var.a.a();
            kic0Var.a(canvas, fB);
            Paint paint = this.i;
            kic0Var.c(canvas, paint);
            int iM = ago1.m(this.b.c[0], this.t);
            this.Y.b(canvas, paint, 0.0f, this.O0, iM);
            canvas.restore();
        }
    }

    @Override // p.c8v
    public final boolean f(boolean z, boolean z2, boolean z3) {
        boolean zF = super.f(z, z2, z3);
        te5 te5Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        te5Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.P0 = true;
            return zF;
        }
        this.P0 = false;
        this.Z.b(50.0f / f);
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.Y.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.Y.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.N0.d();
        this.O0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.P0;
        d8b1 d8b1Var = this.N0;
        if (z) {
            d8b1Var.d();
            this.O0 = i / 10000.0f;
            invalidateSelf();
        } else {
            d8b1Var.b = this.O0 * 10000.0f;
            d8b1Var.c = true;
            d8b1Var.a(i);
        }
        return true;
    }
}
