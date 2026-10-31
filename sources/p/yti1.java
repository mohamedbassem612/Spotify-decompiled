package p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yti1 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public yti1(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        zti1 zti1Var = new zti1();
        zti1Var.a = (VectorDrawable) this.a.newDrawable();
        return zti1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        zti1 zti1Var = new zti1();
        zti1Var.a = (VectorDrawable) this.a.newDrawable(resources);
        return zti1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        zti1 zti1Var = new zti1();
        zti1Var.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return zti1Var;
    }
}
