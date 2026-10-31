package p;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xkb0 extends Picture {
    public final be50 a;

    public xkb0(be50 be50Var) {
        this.a = be50Var;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = v84.a;
        u84 u84Var = new u84();
        u84Var.a = canvas;
        this.a.c(u84Var, (be50) null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.a.u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.a.u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
