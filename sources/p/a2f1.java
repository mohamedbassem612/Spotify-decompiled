package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a2f1 extends fc11 {
    public final t3f1 c;
    public final Window.Callback d;
    public final h5a1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final ArrayList i = new ArrayList();
    public final xfz0 j = new xfz0(this, (byte) 26);

    public a2f1(Toolbar toolbar, CharSequence charSequence, uj5 uj5Var) {
        ezb1 ezb1Var = new ezb1(this, (byte) 7);
        t3f1 t3f1Var = new t3f1(toolbar, false);
        this.c = t3f1Var;
        uj5Var.getClass();
        this.d = uj5Var;
        t3f1Var.k = uj5Var;
        toolbar.setOnMenuItemClickListener(ezb1Var);
        boolean z = t3f1Var.g;
        if (!z) {
            t3f1Var.h = charSequence;
            if ((t3f1Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    b8k1.r(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.e = new h5a1(this, (byte) 12);
    }

    public final int B() {
        return this.c.b;
    }

    public final Context H() {
        return this.c.a.getContext();
    }

    public final void I() {
        this.c.a.setVisibility(8);
    }

    public final boolean L() {
        t3f1 t3f1Var = this.c;
        Toolbar toolbar = t3f1Var.a;
        Runnable runnable = this.j;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = t3f1Var.a;
        WeakHashMap weakHashMap = b8k1.a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    public final void U() {
        this.c.a.removeCallbacks(this.j);
    }

    public final boolean V(int i, KeyEvent keyEvent) {
        Menu menuO0 = o0();
        if (menuO0 == null) {
            return false;
        }
        menuO0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuO0.performShortcut(i, keyEvent, 0);
    }

    public final boolean W(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            X();
        }
        return true;
    }

    public final boolean X() {
        return this.c.a.t();
    }

    public final void b0(boolean z) {
        t3f1 t3f1Var = this.c;
        t3f1Var.a((t3f1Var.b & (-5)) | 4);
    }

    public final void c0() {
        t3f1 t3f1Var = this.c;
        t3f1Var.a(t3f1Var.b & (-9));
    }

    public final void d0(g4b1 g4b1Var) {
        t3f1 t3f1Var = this.c;
        t3f1Var.f = g4b1Var;
        int i = t3f1Var.b & 4;
        Toolbar toolbar = t3f1Var.a;
        if (i != 0) {
            toolbar.setNavigationIcon(g4b1Var);
        } else {
            toolbar.setNavigationIcon((Drawable) null);
        }
    }

    public final void f0(CharSequence charSequence) {
        t3f1 t3f1Var = this.c;
        if (t3f1Var.g) {
            return;
        }
        Toolbar toolbar = t3f1Var.a;
        t3f1Var.h = charSequence;
        if ((t3f1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (t3f1Var.g) {
                b8k1.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu o0() {
        boolean z = this.g;
        t3f1 t3f1Var = this.c;
        if (!z) {
            svh0 svh0Var = new svh0(this, (byte) 19);
            xq81 xq81Var = new xq81(this, (byte) 18);
            Toolbar toolbar = t3f1Var.a;
            toolbar.q1 = svh0Var;
            toolbar.r1 = xq81Var;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.X0 = svh0Var;
                actionMenuView.Y0 = xq81Var;
            }
            this.g = true;
        }
        return t3f1Var.a.getMenu();
    }

    public final boolean q() {
        g60 g60Var;
        ActionMenuView actionMenuView = this.c.a.a;
        return (actionMenuView == null || (g60Var = actionMenuView.W0) == null || !g60Var.j()) ? false : true;
    }

    public final boolean r() {
        ysi0 ysi0Var;
        w1f1 w1f1Var = this.c.a.p1;
        if (w1f1Var == null || (ysi0Var = w1f1Var.b) == null) {
            return false;
        }
        if (w1f1Var == null) {
            ysi0Var = null;
        }
        if (ysi0Var == null) {
            return true;
        }
        ysi0Var.collapseActionView();
        return true;
    }

    public final void x(boolean z) {
        if (z == this.h) {
            return;
        }
        this.h = z;
        ArrayList arrayList = this.i;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        bhn0.d();
    }
}
