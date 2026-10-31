package p;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tql1 extends fc11 implements f20 {
    public static final AccelerateInterpolator B = new AccelerateInterpolator();
    public static final DecelerateInterpolator C = new DecelerateInterpolator();
    public Context c;
    public Context d;
    public ActionBarOverlayLayout e;
    public ActionBarContainer f;
    public jar g;
    public ActionBarContextView h;
    public final View i;
    public boolean j;
    public sql1 k;
    public sql1 l;
    public em3 m;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean t;
    public bz60 v;
    public boolean w;
    public boolean x;
    public final ArrayList o = xvj1.m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f143p = 0;
    public boolean q = true;
    public boolean u = true;
    public final rql1 y = new rql1(this, 0);
    public final rql1 z = new rql1(this, 1);
    public final qeh1 A = new qeh1(this, (byte) 13);

    public tql1(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        p0(decorView);
        if (z) {
            return;
        }
        this.i = decorView.findViewById(R.id.content);
    }

    public final int B() {
        return ((t3f1) this.g).b;
    }

    public final Context H() {
        Context context = this.d;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.c.getTheme().resolveAttribute(2130968589, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.c, i);
            this.d = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.c;
        this.d = context2;
        return context2;
    }

    public final void I() {
        if (this.r) {
            return;
        }
        this.r = true;
        r0(false);
    }

    public final void T() {
        q0(this.c.getResources().getBoolean(2131034112));
    }

    public final boolean V(int i, KeyEvent keyEvent) {
        msi0 msi0Var;
        sql1 sql1Var = this.k;
        if (sql1Var == null || (msi0Var = sql1Var.e) == null) {
            return false;
        }
        msi0Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return msi0Var.performShortcut(i, keyEvent, 0);
    }

    public final void a0(boolean z) {
        if (this.j) {
            return;
        }
        b0(z);
    }

    public final void b0(boolean z) {
        int i = z ? 4 : 0;
        t3f1 t3f1Var = (t3f1) this.g;
        int i2 = t3f1Var.b;
        this.j = true;
        t3f1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void c0() {
        t3f1 t3f1Var = (t3f1) this.g;
        t3f1Var.a(t3f1Var.b & (-9));
    }

    public final void d0(g4b1 g4b1Var) {
        t3f1 t3f1Var = (t3f1) this.g;
        t3f1Var.f = g4b1Var;
        int i = t3f1Var.b & 4;
        Toolbar toolbar = t3f1Var.a;
        if (i != 0) {
            toolbar.setNavigationIcon(g4b1Var);
        } else {
            toolbar.setNavigationIcon((Drawable) null);
        }
    }

    public final void e0(boolean z) {
        bz60 bz60Var;
        this.w = z;
        if (z || (bz60Var = this.v) == null) {
            return;
        }
        bz60Var.a();
    }

    public final void f0(CharSequence charSequence) {
        t3f1 t3f1Var = (t3f1) this.g;
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

    public final o60 h0(em3 em3Var) {
        sql1 sql1Var = this.k;
        if (sql1Var != null) {
            sql1Var.b();
        }
        this.e.setHideOnContentScrollEnabled(false);
        this.h.e();
        sql1 sql1Var2 = new sql1(this, this.h.getContext(), em3Var);
        msi0 msi0Var = sql1Var2.e;
        msi0Var.A();
        try {
            boolean zO = ((ua91) sql1Var2.f.b).O(sql1Var2, msi0Var);
            msi0Var.z();
            if (!zO) {
                return null;
            }
            this.k = sql1Var2;
            sql1Var2.k();
            this.h.c(sql1Var2);
            o0(true);
            return sql1Var2;
        } catch (Throwable th) {
            msi0Var.z();
            throw th;
        }
    }

    public final void o0(boolean z) {
        oek1 oek1VarK;
        oek1 oek1VarK2;
        boolean z2 = this.t;
        if (z) {
            if (!z2) {
                this.t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                r0(false);
            }
        } else if (z2) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            r0(false);
        }
        boolean zIsLaidOut = this.f.isLaidOut();
        jar jarVar = this.g;
        if (!zIsLaidOut) {
            if (z) {
                ((t3f1) jarVar).a.setVisibility(4);
                this.h.setVisibility(0);
                return;
            } else {
                ((t3f1) jarVar).a.setVisibility(0);
                this.h.setVisibility(8);
                return;
            }
        }
        if (z) {
            t3f1 t3f1Var = (t3f1) jarVar;
            oek1VarK = b8k1.c(t3f1Var.a);
            oek1VarK.a(0.0f);
            oek1VarK.d(100L);
            oek1VarK.f(new s3f1(t3f1Var, 4));
            oek1VarK2 = this.h.k(0, 200L);
        } else {
            t3f1 t3f1Var2 = (t3f1) jarVar;
            oek1 oek1VarC = b8k1.c(t3f1Var2.a);
            oek1VarC.a(1.0f);
            oek1VarC.d(200L);
            oek1VarC.f(new s3f1(t3f1Var2, 0));
            oek1VarK = this.h.k(8, 100L);
            oek1VarK2 = oek1VarC;
        }
        bz60 bz60Var = new bz60();
        ArrayList arrayList = (ArrayList) bz60Var.c;
        arrayList.add(oek1VarK);
        View view = (View) oek1VarK.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) oek1VarK2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(oek1VarK2);
        bz60Var.d();
    }

    public final void p0(View view) {
        jar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131428422);
        this.e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        Toolbar toolbarFindViewById = view.findViewById(2131427445);
        if (toolbarFindViewById instanceof jar) {
            wrapper = (jar) toolbarFindViewById;
        } else {
            if (!(toolbarFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(toolbarFindViewById != null ? toolbarFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = toolbarFindViewById.getWrapper();
        }
        this.g = wrapper;
        this.h = (ActionBarContextView) view.findViewById(2131427464);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131427447);
        this.f = actionBarContainer;
        jar jarVar = this.g;
        if (jarVar == null || this.h == null || actionBarContainer == null) {
            eg.m(tql1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((t3f1) jarVar).a.getContext();
        this.c = context;
        if ((((t3f1) this.g).b & 4) != 0) {
            this.j = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.g.getClass();
        q0(context.getResources().getBoolean(2131034112));
        TypedArray typedArrayObtainStyledAttributes = this.c.obtainStyledAttributes(null, moz0.a, 2130968584, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
            if (!actionBarOverlayLayout2.g) {
                eg.m("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.x = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f;
            WeakHashMap weakHashMap = b8k1.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void q0(boolean z) {
        if (z) {
            this.f.setTabContainer(null);
            ((t3f1) this.g).getClass();
        } else {
            ((t3f1) this.g).getClass();
            this.f.setTabContainer(null);
        }
        this.g.getClass();
        ((t3f1) this.g).a.setCollapsible(false);
        this.e.setHasNonEmbeddedTabs(false);
    }

    public final boolean r() {
        w1f1 w1f1Var;
        jar jarVar = this.g;
        if (jarVar == null || (w1f1Var = ((t3f1) jarVar).a.p1) == null || w1f1Var.b == null) {
            return false;
        }
        w1f1 w1f1Var2 = ((t3f1) jarVar).a.p1;
        ysi0 ysi0Var = w1f1Var2 == null ? null : w1f1Var2.b;
        if (ysi0Var == null) {
            return true;
        }
        ysi0Var.collapseActionView();
        return true;
    }

    public final void r0(boolean z) {
        boolean z2 = this.t || !(this.r || this.s);
        boolean z3 = this.u;
        final qeh1 qeh1Var = this.A;
        View view = this.i;
        if (!z2) {
            if (z3) {
                this.u = false;
                bz60 bz60Var = this.v;
                if (bz60Var != null) {
                    bz60Var.a();
                }
                int i = this.f143p;
                rql1 rql1Var = this.y;
                if (i != 0 || (!this.w && !z)) {
                    rql1Var.d(null);
                    return;
                }
                this.f.setAlpha(1.0f);
                this.f.setTransitioning(true);
                bz60 bz60Var2 = new bz60();
                ArrayList arrayList = (ArrayList) bz60Var2.c;
                float f = -this.f.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                oek1 oek1VarC = b8k1.c(this.f);
                oek1VarC.h(f);
                final View view2 = (View) oek1VarC.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(qeh1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: p.nek1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((tql1) qeh1Var.b).f.getParent()).invalidate();
                        }
                    } : null);
                }
                if (!bz60Var2.b) {
                    arrayList.add(oek1VarC);
                }
                if (this.q && view != null) {
                    oek1 oek1VarC2 = b8k1.c(view);
                    oek1VarC2.h(f);
                    if (!bz60Var2.b) {
                        arrayList.add(oek1VarC2);
                    }
                }
                boolean z4 = bz60Var2.b;
                if (!z4) {
                    bz60Var2.d = B;
                }
                if (!z4) {
                    bz60Var2.a = 250L;
                }
                if (!z4) {
                    bz60Var2.e = rql1Var;
                }
                this.v = bz60Var2;
                bz60Var2.d();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.u = true;
        bz60 bz60Var3 = this.v;
        if (bz60Var3 != null) {
            bz60Var3.a();
        }
        this.f.setVisibility(0);
        int i2 = this.f143p;
        rql1 rql1Var2 = this.z;
        if (i2 == 0 && (this.w || z)) {
            this.f.setTranslationY(0.0f);
            float f2 = -this.f.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f.setTranslationY(f2);
            bz60 bz60Var4 = new bz60();
            ArrayList arrayList2 = (ArrayList) bz60Var4.c;
            oek1 oek1VarC3 = b8k1.c(this.f);
            oek1VarC3.h(0.0f);
            final View view3 = (View) oek1VarC3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(qeh1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: p.nek1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((tql1) qeh1Var.b).f.getParent()).invalidate();
                    }
                } : null);
            }
            if (!bz60Var4.b) {
                arrayList2.add(oek1VarC3);
            }
            if (this.q && view != null) {
                view.setTranslationY(f2);
                oek1 oek1VarC4 = b8k1.c(view);
                oek1VarC4.h(0.0f);
                if (!bz60Var4.b) {
                    arrayList2.add(oek1VarC4);
                }
            }
            boolean z5 = bz60Var4.b;
            if (!z5) {
                bz60Var4.d = C;
            }
            if (!z5) {
                bz60Var4.a = 250L;
            }
            if (!z5) {
                bz60Var4.e = rql1Var2;
            }
            this.v = bz60Var4;
            bz60Var4.d();
        } else {
            this.f.setAlpha(1.0f);
            this.f.setTranslationY(0.0f);
            if (this.q && view != null) {
                view.setTranslationY(0.0f);
            }
            rql1Var2.d(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = b8k1.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void x(boolean z) {
        if (z == this.n) {
            return;
        }
        this.n = z;
        ArrayList arrayList = this.o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        bhn0.d();
    }

    public tql1(Dialog dialog) {
        p0(dialog.getWindow().getDecorView());
    }
}
