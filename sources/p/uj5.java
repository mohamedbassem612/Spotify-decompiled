package p;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uj5 extends pql1 {
    public h5a1 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ yj5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj5(yj5 yj5Var, Window.Callback callback) {
        super(callback);
        this.f = yj5Var;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    @Override // p.pql1, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // p.pql1, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            yj5 yj5Var = this.f;
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            if (fc11Var == null || !fc11Var.V(keyCode, keyEvent)) {
                xj5 xj5Var = yj5Var.k1;
                if (xj5Var == null || !yj5Var.D(xj5Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (yj5Var.k1 == null) {
                        xj5 xj5VarX = yj5Var.x(0);
                        yj5Var.E(xj5VarX, keyEvent);
                        boolean zD = yj5Var.D(xj5VarX, keyEvent.getKeyCode(), keyEvent);
                        xj5VarX.k = false;
                        if (zD) {
                        }
                    }
                    return false;
                }
                xj5 xj5Var2 = yj5Var.k1;
                if (xj5Var2 != null) {
                    xj5Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // p.pql1, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof msi0)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View viewI;
        h5a1 h5a1Var = this.b;
        return (h5a1Var == null || (viewI = h5a1Var.i(i)) == null) ? this.a.onCreatePanelView(i) : viewI;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        if (i == 108) {
            yj5 yj5Var = this.f;
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            if (fc11Var != null) {
                fc11Var.x(true);
            }
        }
        return true;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        yj5 yj5Var = this.f;
        if (i == 108) {
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            if (fc11Var != null) {
                fc11Var.x(false);
                return;
            }
            return;
        }
        if (i == 0) {
            xj5 xj5VarX = yj5Var.x(i);
            if (xj5VarX.m) {
                yj5Var.r(xj5VarX, false);
            }
        }
    }

    @Override // p.pql1, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        msi0 msi0Var = menu instanceof msi0 ? (msi0) menu : null;
        if (i == 0 && msi0Var == null) {
            return false;
        }
        if (msi0Var != null) {
            msi0Var.y(true);
        }
        h5a1 h5a1Var = this.b;
        if (h5a1Var != null) {
            h5a1Var.j(i);
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (msi0Var != null) {
            msi0Var.y(false);
        }
        return zOnPreparePanel;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        msi0 msi0Var = this.f.x(0).h;
        if (msi0Var != null) {
            super.onProvideKeyboardShortcuts(list, msi0Var, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // p.pql1, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        yj5 yj5Var = this.f;
        Context context = yj5Var.X;
        if (i != 0) {
            return this.a.onWindowStartingActionMode(callback, i);
        }
        ua91 ua91Var = new ua91(context, callback);
        o60 o60Var = yj5Var.T0;
        if (o60Var != null) {
            o60Var.b();
        }
        em3 em3Var = new em3(yj5Var, ua91Var);
        yj5Var.y();
        fc11 fc11Var = yj5Var.N0;
        if (fc11Var != null) {
            yj5Var.T0 = fc11Var.h0(em3Var);
        }
        if (yj5Var.T0 == null) {
            oek1 oek1Var = yj5Var.X0;
            if (oek1Var != null) {
                oek1Var.c();
            }
            o60 o60Var2 = yj5Var.T0;
            if (o60Var2 != null) {
                o60Var2.b();
            }
            if (yj5Var.U0 == null) {
                if (yj5Var.g1) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(2130968588, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        plm plmVar = new plm(context, 0);
                        plmVar.getTheme().setTo(themeNewTheme);
                        context = plmVar;
                    }
                    yj5Var.U0 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130968604);
                    yj5Var.V0 = popupWindow;
                    oap1.G(popupWindow);
                    yj5Var.V0.setContentView(yj5Var.U0);
                    yj5Var.V0.setWidth(-1);
                    context.getTheme().resolveAttribute(2130968582, typedValue, true);
                    yj5Var.U0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    yj5Var.V0.setHeight(-2);
                    yj5Var.W0 = new sj5(yj5Var, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) yj5Var.Z0.findViewById(2131427471);
                    if (viewStubCompat != null) {
                        yj5Var.y();
                        fc11 fc11Var2 = yj5Var.N0;
                        Context contextH = fc11Var2 != null ? fc11Var2.H() : null;
                        if (contextH != null) {
                            context = contextH;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        yj5Var.U0 = viewStubCompat.a();
                    }
                }
            }
            if (yj5Var.U0 != null) {
                oek1 oek1Var2 = yj5Var.X0;
                if (oek1Var2 != null) {
                    oek1Var2.c();
                }
                yj5Var.U0.e();
                qab1 qab1Var = new qab1(yj5Var.U0.getContext(), yj5Var.U0, em3Var);
                if (em3Var.w(qab1Var, qab1Var.f())) {
                    qab1Var.k();
                    yj5Var.U0.c(qab1Var);
                    yj5Var.T0 = qab1Var;
                    boolean z = yj5Var.Y0 && (viewGroup = yj5Var.Z0) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView = yj5Var.U0;
                    if (z) {
                        actionBarContextView.setAlpha(0.0f);
                        oek1 oek1VarC = b8k1.c(yj5Var.U0);
                        oek1VarC.a(1.0f);
                        yj5Var.X0 = oek1VarC;
                        oek1VarC.f(new tj5(yj5Var, (byte) 1));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        yj5Var.U0.setVisibility(0);
                        if (yj5Var.U0.getParent() instanceof View) {
                            View view = (View) yj5Var.U0.getParent();
                            WeakHashMap weakHashMap = b8k1.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (yj5Var.V0 != null) {
                        yj5Var.Y.getDecorView().post(yj5Var.W0);
                    }
                } else {
                    yj5Var.T0 = null;
                }
            }
            yj5Var.G();
            yj5Var.T0 = yj5Var.T0;
        }
        yj5Var.G();
        o60 o60Var3 = yj5Var.T0;
        if (o60Var3 != null) {
            return ua91Var.B(o60Var3);
        }
        return null;
    }

    @Override // p.pql1, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
