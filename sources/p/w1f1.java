package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w1f1 implements pti0 {
    public msi0 a;
    public ysi0 b;
    public final /* synthetic */ Toolbar c;

    public w1f1(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // p.pti0
    public final void c(Context context, msi0 msi0Var) {
        ysi0 ysi0Var;
        msi0 msi0Var2 = this.a;
        if (msi0Var2 != null && (ysi0Var = this.b) != null) {
            msi0Var2.e(ysi0Var);
        }
        this.a = msi0Var;
    }

    @Override // p.pti0
    public final void e() {
        if (this.b != null) {
            msi0 msi0Var = this.a;
            if (msi0Var != null) {
                int size = msi0Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // p.pti0
    public final boolean f(ysi0 ysi0Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = ysi0Var.getActionView();
        toolbar.i = actionView;
        this.b = ysi0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            x1f1 x1f1Var = new x1f1();
            x1f1Var.a = (toolbar.Q0 & ContentType.LONG_FORM_ON_DEMAND) | 8388611;
            x1f1Var.b = (byte) 2;
            toolbar.i.setLayoutParams(x1f1Var);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((x1f1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.h1.add(childAt);
            }
        }
        toolbar.requestLayout();
        ysi0Var.C = true;
        ysi0Var.n.q(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof kzg) {
            ((kzg) callback).onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // p.pti0
    public final boolean g(ysi0 ysi0Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof kzg) {
            ((kzg) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.h1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        ysi0Var.C = false;
        ysi0Var.n.q(false);
        toolbar.u();
        return true;
    }

    @Override // p.pti0
    public final boolean h() {
        return false;
    }

    @Override // p.pti0
    public final boolean i(alc1 alc1Var) {
        return false;
    }

    @Override // p.pti0
    public final void b(msi0 msi0Var, boolean z) {
    }
}
