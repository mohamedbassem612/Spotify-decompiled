package p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s980 extends c8v {
    public final q8v Y;
    public o5 Z;

    public s980(Context context, eca ecaVar, q8v q8vVar, o5 o5Var) {
        super(context, ecaVar);
        this.Y = q8vVar;
        q8vVar.b = this;
        this.Z = o5Var;
        o5Var.b = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        float fB = b();
        q8v q8vVar = this.Y;
        q8vVar.a.a();
        q8vVar.a(canvas, fB);
        Paint paint = this.i;
        q8vVar.c(canvas, paint);
        int i = 0;
        while (true) {
            o5 o5Var = this.Z;
            int[] iArr = (int[]) o5Var.d;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            float[] fArr = (float[]) o5Var.c;
            int i2 = i * 2;
            this.Y.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // p.c8v
    public final boolean f(boolean z, boolean z2, boolean z3) {
        boolean zF = super.f(z, z2, z3);
        if (!isRunning()) {
            this.Z.m();
        }
        te5 te5Var = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        te5Var.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.Z.M();
        }
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.Y.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.Y.e();
    }
}
