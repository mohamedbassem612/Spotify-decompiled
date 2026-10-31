package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ng41 extends Drawable.ConstantState {
    public final Drawable a;
    public final float b;
    public int c;

    public ng41(Drawable drawable, float f) {
        this.a = drawable;
        this.b = f;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new x10(this.a, this.b);
    }
}
