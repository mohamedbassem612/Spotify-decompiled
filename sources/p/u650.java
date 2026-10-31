package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u650 extends Drawable.ConstantState {
    public w650 a;
    public int b;
    public int c;
    public boolean d;
    public int e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new x650(this.a, this.b, this.c, this.d);
    }
}
