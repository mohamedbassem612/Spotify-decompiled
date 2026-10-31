package p;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u7v implements Drawable.Callback {
    public final /* synthetic */ w7v a;

    public u7v(w7v w7vVar) {
        this.a = w7vVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long jFloatToRawIntBits;
        w7v w7vVar = this.a;
        hrr0 hrr0Var = w7vVar.g;
        hrr0Var.setValue(Integer.valueOf(((Number) hrr0Var.getValue()).intValue() + 1));
        Drawable drawable2 = w7vVar.f;
        znb0 znb0Var = x7v.a;
        if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable2.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable2.getIntrinsicHeight())) & 4294967295L);
        }
        w7vVar.h.setValue(new Size(jFloatToRawIntBits));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ((Handler) x7v.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        ((Handler) x7v.a.getValue()).removeCallbacks(runnable);
    }
}
