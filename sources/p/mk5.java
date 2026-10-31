package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mk5 extends jk5 {
    public final lk5 d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public mk5(lk5 lk5Var) {
        super(lk5Var);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = lk5Var;
    }

    @Override // p.jk5
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        lk5 lk5Var = this.d;
        Context context = lk5Var.getContext();
        int[] iArr = moz0.g;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        b8k1.o(lk5Var, lk5Var.getContext(), iArr, attributeSet, (TypedArray) lvc1VarE.c, i);
        Drawable drawableL = lvc1VarE.l(0);
        if (drawableL != null) {
            lk5Var.setThumb(drawableL);
        }
        Drawable drawableK = lvc1VarE.k(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableK;
        if (drawableK != null) {
            drawableK.setCallback(lk5Var);
            drawableK.setLayoutDirection(lk5Var.getLayoutDirection());
            if (drawableK.isStateful()) {
                drawableK.setState(lk5Var.getDrawableState());
            }
            c();
        }
        lk5Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = a8v.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = lvc1VarE.g(2);
            this.h = true;
        }
        lvc1VarE.I();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            lk5 lk5Var = this.d;
            int max = lk5Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((lk5Var.getWidth() - lk5Var.getPaddingLeft()) - lk5Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(lk5Var.getPaddingLeft(), lk5Var.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
