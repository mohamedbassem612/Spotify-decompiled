package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qfb1 extends iti0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public oti0 N0;
    public ViewTreeObserver O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean T0;
    public PopupWindow.OnDismissListener X;
    public View Y;
    public View Z;
    public final Context b;
    public final msi0 c;
    public final jsi0 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final lti0 h;
    public final x22 i = new x22(this, (byte) 8);
    public final y22 t = new y22(this, (byte) 16);
    public int S0 = 0;

    public qfb1(Context context, msi0 msi0Var, View view, int i, boolean z) {
        this.b = context;
        this.c = msi0Var;
        this.e = z;
        this.d = new jsi0(msi0Var, LayoutInflater.from(context), z, 2131623955);
        this.g = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.Y = view;
        this.h = new lti0(context, null, i, 0);
        msi0Var.c(this, context);
    }

    @Override // p.gc81
    public final boolean a() {
        return !this.P0 && this.h.Y0.isShowing();
    }

    @Override // p.pti0
    public final void b(msi0 msi0Var, boolean z) {
        if (msi0Var != this.c) {
            return;
        }
        dismiss();
        oti0 oti0Var = this.N0;
        if (oti0Var != null) {
            oti0Var.b(msi0Var, z);
        }
    }

    @Override // p.pti0
    public final void d(oti0 oti0Var) {
        this.N0 = oti0Var;
    }

    @Override // p.gc81
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // p.pti0
    public final void e() {
        this.Q0 = false;
        jsi0 jsi0Var = this.d;
        if (jsi0Var != null) {
            jsi0Var.notifyDataSetChanged();
        }
    }

    @Override // p.pti0
    public final boolean h() {
        return false;
    }

    @Override // p.pti0
    public final boolean i(alc1 alc1Var) {
        boolean z;
        if (alc1Var.hasVisibleItems()) {
            jti0 jti0Var = new jti0(this.b, alc1Var, this.Z, this.e, this.g, 0);
            oti0 oti0Var = this.N0;
            jti0Var.h = oti0Var;
            iti0 iti0Var = (iti0) jti0Var.i;
            if (iti0Var != null) {
                iti0Var.d(oti0Var);
            }
            int size = alc1Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = alc1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            jti0Var.b = z;
            iti0 iti0Var2 = (iti0) jti0Var.i;
            if (iti0Var2 != null) {
                iti0Var2.o(z);
            }
            jti0Var.t = this.X;
            this.X = null;
            this.c.d(false);
            lti0 lti0Var = this.h;
            int width = lti0Var.f;
            int iJ = lti0Var.j();
            if ((Gravity.getAbsoluteGravity(this.S0, this.Y.getLayoutDirection()) & 7) == 5) {
                width += this.Y.getWidth();
            }
            if (!jti0Var.b()) {
                if (((View) jti0Var.g) != null) {
                    jti0Var.g(width, iJ, true, true);
                }
            }
            oti0 oti0Var2 = this.N0;
            if (oti0Var2 != null) {
                oti0Var2.g(alc1Var);
            }
            return true;
        }
        return false;
    }

    @Override // p.iti0
    public final void l(View view) {
        this.Y = view;
    }

    @Override // p.gc81
    public final void m() {
        View view;
        if (a()) {
            return;
        }
        if (this.P0 || (view = this.Y) == null) {
            eg.m("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.Z = view;
        lti0 lti0Var = this.h;
        ik5 ik5Var = lti0Var.Y0;
        ik5 ik5Var2 = lti0Var.Y0;
        ik5Var.setOnDismissListener(this);
        lti0Var.P0 = this;
        lti0Var.X0 = true;
        ik5Var2.setFocusable(true);
        View view2 = this.Z;
        boolean z = this.O0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.O0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.t);
        lti0Var.O0 = view2;
        lti0Var.Y = this.S0;
        boolean z2 = this.Q0;
        Context context = this.b;
        jsi0 jsi0Var = this.d;
        if (!z2) {
            this.R0 = iti0.k(jsi0Var, context, this.f);
            this.Q0 = true;
        }
        lti0Var.r(this.R0);
        ik5Var2.setInputMethodMode(2);
        Rect rect = this.a;
        lti0Var.W0 = rect != null ? new Rect(rect) : null;
        lti0Var.m();
        m9v m9vVar = lti0Var.c;
        m9vVar.setOnKeyListener(this);
        if (this.T0) {
            msi0 msi0Var = this.c;
            if (msi0Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131623954, (ViewGroup) m9vVar, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(msi0Var.m);
                }
                frameLayout.setEnabled(false);
                m9vVar.addHeaderView(frameLayout, null, false);
            }
        }
        lti0Var.k(jsi0Var);
        lti0Var.m();
    }

    @Override // p.gc81
    public final m9v n() {
        return this.h.c;
    }

    @Override // p.iti0
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.P0 = true;
        this.c.d(true);
        ViewTreeObserver viewTreeObserver = this.O0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.O0 = this.Z.getViewTreeObserver();
            }
            this.O0.removeGlobalOnLayoutListener(this.i);
            this.O0 = null;
        }
        this.Z.removeOnAttachStateChangeListener(this.t);
        PopupWindow.OnDismissListener onDismissListener = this.X;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.iti0
    public final void p(int i) {
        this.S0 = i;
    }

    @Override // p.iti0
    public final void q(int i) {
        this.h.f = i;
    }

    @Override // p.iti0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.X = onDismissListener;
    }

    @Override // p.iti0
    public final void s(boolean z) {
        this.T0 = z;
    }

    @Override // p.iti0
    public final void t(int i) {
        this.h.g(i);
    }
}
