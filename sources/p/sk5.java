package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sk5 extends y0d0 implements uk5 {
    public CharSequence b1;
    public ListAdapter c1;
    public final Rect d1;
    public int e1;
    public final /* synthetic */ vk5 f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk5(vk5 vk5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130970274, 0);
        this.f1 = vk5Var;
        this.d1 = new Rect();
        this.O0 = vk5Var;
        this.X0 = true;
        this.Y0.setFocusable(true);
        this.P0 = new qk5(this, (byte) 0);
    }

    @Override // p.uk5
    public final CharSequence e() {
        return this.b1;
    }

    @Override // p.uk5
    public final void f(CharSequence charSequence) {
        this.b1 = charSequence;
    }

    @Override // p.uk5
    public final void h(int i) {
        this.e1 = i;
    }

    @Override // p.uk5
    public final void i(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ik5 ik5Var = this.Y0;
        boolean zIsShowing = ik5Var.isShowing();
        s();
        ik5Var.setInputMethodMode(2);
        m();
        m9v m9vVar = this.c;
        m9vVar.setChoiceMode(1);
        m9vVar.setTextDirection(i);
        m9vVar.setTextAlignment(i2);
        vk5 vk5Var = this.f1;
        int selectedItemPosition = vk5Var.getSelectedItemPosition();
        m9v m9vVar2 = this.c;
        if (ik5Var.isShowing() && m9vVar2 != null) {
            m9vVar2.setListSelectionHidden(false);
            m9vVar2.setSelection(selectedItemPosition);
            if (m9vVar2.getChoiceMode() != 0) {
                m9vVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = vk5Var.getViewTreeObserver()) == null) {
            return;
        }
        x22 x22Var = new x22(this, (byte) 2);
        viewTreeObserver.addOnGlobalLayoutListener(x22Var);
        ik5Var.setOnDismissListener(new rk5(this, x22Var));
    }

    @Override // p.y0d0, p.uk5
    public final void k(ListAdapter listAdapter) {
        super.k(listAdapter);
        this.c1 = listAdapter;
    }

    public final void s() {
        int i;
        ik5 ik5Var = this.Y0;
        Drawable background = ik5Var.getBackground();
        vk5 vk5Var = this.f1;
        Rect rect = vk5Var.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = sik1.a;
            i = vk5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = vk5Var.getPaddingLeft();
        int paddingRight = vk5Var.getPaddingRight();
        int width = vk5Var.getWidth();
        int i2 = vk5Var.g;
        if (i2 == -2) {
            int iA = vk5Var.a((SpinnerAdapter) this.c1, ik5Var.getBackground());
            int i3 = (vk5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = sik1.a;
        this.f = vk5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.e1) + i : paddingLeft + this.e1 + i;
    }
}
