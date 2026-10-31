package p;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gg10 extends Drawable.ConstantState {
    public Context a;
    public String b;
    public int c;
    public int d;
    public int e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new hg10(this.a, this.b, this.c, this.d);
    }
}
