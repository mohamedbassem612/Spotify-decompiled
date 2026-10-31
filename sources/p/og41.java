package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class og41 extends Drawable.ConstantState {
    public final Drawable a;
    public final float b;
    public final int c;
    public int d;

    public og41(float f, int i, Drawable drawable) {
        this.a = drawable;
        this.b = f;
        this.c = i;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new x10(this.a, this.b, this.c, (byte) 2);
    }
}
