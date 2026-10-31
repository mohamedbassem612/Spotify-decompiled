package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nj5 {
    public final mj5 a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public nj5(mj5 mj5Var) {
        this.a = mj5Var;
    }

    public final void a() {
        mj5 mj5Var = this.a;
        Drawable checkMarkDrawable = mj5Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    drawableMutate.setTintMode(this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(mj5Var.getDrawableState());
                }
                mj5Var.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
