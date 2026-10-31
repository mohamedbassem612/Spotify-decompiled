package p;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yj5 extends rj5 implements ksi0, LayoutInflater.Factory2 {
    public static final jv81 F1 = new jv81(0);
    public static final int[] G1 = {R.attr.windowBackground};
    public static final boolean H1 = !"robolectric".equals(Build.FINGERPRINT);
    public Rect A1;
    public Rect B1;
    public kl5 C1;
    public OnBackInvokedDispatcher D1;
    public wh5 E1;
    public fc11 N0;
    public d1d1 O0;
    public CharSequence P0;
    public ActionBarOverlayLayout Q0;
    public cp5 R0;
    public bv40 S0;
    public o60 T0;
    public ActionBarContextView U0;
    public PopupWindow V0;
    public sj5 W0;
    public final Context X;
    public Window Y;
    public boolean Y0;
    public uj5 Z;
    public ViewGroup Z0;
    public TextView a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public xj5[] j1;
    public xj5 k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public Configuration p1;
    public final int q1;
    public int r1;
    public int s1;
    public final Object t;
    public boolean t1;
    public vj5 u1;
    public vj5 v1;
    public boolean w1;
    public int x1;
    public boolean z1;
    public oek1 X0 = null;
    public final sj5 y1 = new sj5(this, (byte) 0);

    public yj5(Context context, Window window, lj5 lj5Var, Object obj) {
        gj5 gj5Var = null;
        this.q1 = -100;
        this.X = context;
        this.t = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof gj5)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    gj5Var = (gj5) context;
                    break;
                }
            }
            if (gj5Var != null) {
                this.q1 = ((yj5) gj5Var.h0()).q1;
            }
        }
        if (this.q1 == -100) {
            String name = this.t.getClass().getName();
            jv81 jv81Var = F1;
            Integer num = (Integer) jv81Var.get(name);
            if (num != null) {
                this.q1 = num.intValue();
                jv81Var.remove(this.t.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        ck5.d();
    }

    public static fhe0 o(Context context) {
        fhe0 fhe0Var;
        if (Build.VERSION.SDK_INT >= 33 || (fhe0Var = rj5.c) == null) {
            return null;
        }
        fhe0 fhe0VarA = fhe0.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        fhe0 fhe0VarL = p8p1.l(fhe0Var, fhe0VarA);
        return fhe0VarL.a.a.isEmpty() ? fhe0VarA : fhe0VarL;
    }

    public static Configuration s(Context context, int i, fhe0 fhe0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fhe0Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(fhe0Var.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final int A(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            eg.m("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        vj5 vj5Var = this.v1;
                        if (vj5Var == null) {
                            vj5Var = new vj5(this, context);
                            this.v1 = vj5Var;
                        }
                        return vj5Var.v();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    vj5 vj5Var2 = this.u1;
                    if (vj5Var2 == null) {
                        vj5Var2 = new vj5(this, dlg1.m(context));
                        this.u1 = vj5Var2;
                    }
                    return vj5Var2.v();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean B() {
        boolean z = this.l1;
        this.l1 = false;
        xj5 xj5VarX = x(0);
        if (!xj5VarX.m) {
            o60 o60Var = this.T0;
            if (o60Var != null) {
                o60Var.b();
                return true;
            }
            y();
            fc11 fc11Var = this.N0;
            if (fc11Var == null || !fc11Var.r()) {
                return false;
            }
        } else if (!z) {
            r(xj5VarX, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final void C(xj5 xj5Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = xj5Var.m;
        int i2 = xj5Var.a;
        if (z || this.o1) {
            return;
        }
        Context context = this.X;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.Y.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, xj5Var.h)) {
            r(xj5Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && E(xj5Var, keyEvent)) {
            wj5 wj5Var = xj5Var.e;
            if (wj5Var != null && !xj5Var.n) {
                View view = xj5Var.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                xj5Var.l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, CollectionItemdata$ItemData.BAN_ITEM_DATA_FIELD_NUMBER, 8519680, -3);
                layoutParams2.gravity = xj5Var.c;
                layoutParams2.windowAnimations = xj5Var.d;
                windowManager.addView(xj5Var.e, layoutParams2);
                xj5Var.m = true;
                if (i2 == 0) {
                    G();
                }
            }
            if (wj5Var == null) {
                y();
                fc11 fc11Var = this.N0;
                Context contextH = fc11Var != null ? fc11Var.H() : null;
                if (contextH != null) {
                    context = contextH;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(2130968581, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(2130969921, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(2132018095, true);
                }
                plm plmVar = new plm(context, 0);
                plmVar.getTheme().setTo(themeNewTheme);
                xj5Var.j = plmVar;
                TypedArray typedArrayObtainStyledAttributes = plmVar.obtainStyledAttributes(moz0.j);
                xj5Var.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                xj5Var.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                xj5Var.e = new wj5(this, xj5Var.j);
                xj5Var.c = (byte) 81;
            } else if (xj5Var.n && wj5Var.getChildCount() > 0) {
                xj5Var.e.removeAllViews();
            }
            View view2 = xj5Var.g;
            if (view2 == null) {
                if (xj5Var.h != null) {
                    bv40 bv40Var = this.S0;
                    if (bv40Var == null) {
                        bv40Var = new bv40(this, (byte) 18);
                        this.S0 = bv40Var;
                    }
                    if (xj5Var.i == null) {
                        axc0 axc0Var = new axc0(xj5Var.j);
                        xj5Var.i = axc0Var;
                        axc0Var.d(bv40Var);
                        xj5Var.h.b(xj5Var.i);
                    }
                    View viewJ = xj5Var.i.j(xj5Var.e);
                    xj5Var.f = viewJ;
                    if (viewJ != null) {
                    }
                }
                xj5Var.n = true;
                return;
            }
            xj5Var.f = view2;
            if (xj5Var.g != null || xj5Var.i.a().getCount() > 0) {
                ViewGroup.LayoutParams layoutParams3 = xj5Var.f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                xj5Var.e.setBackgroundResource(xj5Var.b);
                ViewParent parent = xj5Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(xj5Var.f);
                }
                xj5Var.e.addView(xj5Var.f, layoutParams3);
                if (!xj5Var.f.hasFocus()) {
                    xj5Var.f.requestFocus();
                }
            }
            xj5Var.n = true;
            return;
            i = -2;
            xj5Var.l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, CollectionItemdata$ItemData.BAN_ITEM_DATA_FIELD_NUMBER, 8519680, -3);
            layoutParams4.gravity = xj5Var.c;
            layoutParams4.windowAnimations = xj5Var.d;
            windowManager.addView(xj5Var.e, layoutParams4);
            xj5Var.m = true;
            if (i2 == 0) {
                G();
            }
        }
    }

    public final boolean D(xj5 xj5Var, int i, KeyEvent keyEvent) {
        msi0 msi0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((xj5Var.k || E(xj5Var, keyEvent)) && (msi0Var = xj5Var.h) != null) {
            return msi0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[PHI: r6
      0x00cf: PHI (r6v2 p.msi0) = (r6v1 p.msi0), (r6v8 p.msi0) binds: [B:34:0x004e, B:60:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    public final boolean E(xj5 xj5Var, KeyEvent keyEvent) {
        msi0 msi0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        cp5 cp5Var;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.o1) {
            boolean z = xj5Var.k;
            int i = xj5Var.a;
            if (z) {
                return true;
            }
            xj5 xj5Var2 = this.k1;
            if (xj5Var2 != null && xj5Var2 != xj5Var) {
                r(xj5Var2, false);
            }
            Window.Callback callback = this.Y.getCallback();
            if (callback != null) {
                xj5Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.Q0) != null) {
                actionBarOverlayLayout4.r();
            }
            if (xj5Var.g == null && (!z2 || !(this.N0 instanceof a2f1))) {
                msi0 msi0Var2 = xj5Var.h;
                if (msi0Var2 == null || xj5Var.o) {
                    if (msi0Var2 == null) {
                        Context context = this.X;
                        if ((i == 0 || i == 108) && this.Q0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130968588, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(2130968589, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130968589, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                plm plmVar = new plm(context, 0);
                                plmVar.getTheme().setTo(themeNewTheme);
                                context = plmVar;
                            }
                        }
                        msi0 msi0Var3 = new msi0(context);
                        msi0Var3.w(this);
                        msi0 msi0Var4 = xj5Var.h;
                        if (msi0Var3 != msi0Var4) {
                            if (msi0Var4 != null) {
                                msi0Var4.t(xj5Var.i);
                            }
                            xj5Var.h = msi0Var3;
                            axc0 axc0Var = xj5Var.i;
                            if (axc0Var != null) {
                                msi0Var3.b(axc0Var);
                            }
                        }
                        msi0Var2 = xj5Var.h;
                        if (msi0Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.Q0) != null) {
                                cp5Var = this.R0;
                                if (cp5Var == null) {
                                    cp5Var = new cp5(this, (byte) 19);
                                    this.R0 = cp5Var;
                                }
                                actionBarOverlayLayout2.q(msi0Var2, cp5Var);
                            }
                            xj5Var.h.A();
                            if (callback.onCreatePanelMenu(i, xj5Var.h)) {
                                xj5Var.o = false;
                            } else {
                                msi0Var = xj5Var.h;
                                if (msi0Var != null) {
                                    if (msi0Var != null) {
                                        msi0Var.t(xj5Var.i);
                                    }
                                    xj5Var.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.Q0) != null) {
                                    actionBarOverlayLayout.q((msi0) null, this.R0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            cp5Var = this.R0;
                            if (cp5Var == null) {
                                cp5Var = new cp5(this, (byte) 19);
                                this.R0 = cp5Var;
                            }
                            actionBarOverlayLayout2.q(msi0Var2, cp5Var);
                        }
                        xj5Var.h.A();
                        if (callback.onCreatePanelMenu(i, xj5Var.h)) {
                            msi0Var = xj5Var.h;
                            if (msi0Var != null) {
                                if (msi0Var != null) {
                                    msi0Var.t(xj5Var.i);
                                }
                                xj5Var.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.q((msi0) null, this.R0);
                            }
                        } else {
                            xj5Var.o = false;
                        }
                    }
                }
                xj5Var.h.A();
                Bundle bundle = xj5Var.f141p;
                if (bundle != null) {
                    xj5Var.h.u(bundle);
                    xj5Var.f141p = null;
                }
                if (!callback.onPreparePanel(0, xj5Var.g, xj5Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.Q0) != null) {
                        actionBarOverlayLayout3.q((msi0) null, this.R0);
                    }
                    xj5Var.h.z();
                    return false;
                }
                xj5Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                xj5Var.h.z();
            }
            xj5Var.k = true;
            xj5Var.l = false;
            this.k1 = xj5Var;
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.Y0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        wh5 wh5Var;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.D1 != null && (x(0).m || this.T0 != null)) {
                z = true;
            }
            if (z && this.E1 == null) {
                this.E1 = yh5.h(this.D1, this);
            } else {
                if (z || (wh5Var = this.E1) == null) {
                    return;
                }
                yh5.i(this.D1, wh5Var);
                this.E1 = null;
            }
        }
    }

    @Override // p.rj5
    public final void a() {
        if (this.N0 != null) {
            y();
            if (this.N0.L()) {
                return;
            }
            z(0);
        }
    }

    @Override // p.rj5
    public final void c() {
        String strQ;
        this.m1 = true;
        m(false, true);
        w();
        Object obj = this.t;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strQ = mno1.q(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strQ = null;
            }
            if (strQ != null) {
                fc11 fc11Var = this.N0;
                if (fc11Var == null) {
                    this.z1 = true;
                } else {
                    fc11Var.a0(true);
                }
            }
            synchronized (rj5.h) {
                rj5.f(this);
                rj5.g.add(new WeakReference(this));
            }
        }
        this.p1 = new Configuration(this.X.getResources().getConfiguration());
        this.n1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p.ksi0
    public final boolean d(msi0 msi0Var, ysi0 ysi0Var) {
        xj5 xj5Var;
        Window.Callback callback = this.Y.getCallback();
        if (callback != null && !this.o1) {
            msi0 msi0VarL = msi0Var.l();
            xj5[] xj5VarArr = this.j1;
            int length = xj5VarArr != null ? xj5VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                xj5Var = xj5VarArr[i];
                if (xj5Var != null && xj5Var.h == msi0VarL) {
                    if (xj5Var != null) {
                        return callback.onMenuItemSelected(xj5Var.a, ysi0Var);
                    }
                }
            }
            xj5Var = null;
            if (xj5Var != null) {
                return callback.onMenuItemSelected(xj5Var.a, ysi0Var);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p.rj5
    public final void e() {
        if (this.t instanceof Activity) {
            synchronized (rj5.h) {
                rj5.f(this);
            }
        }
        if (this.w1) {
            this.Y.getDecorView().removeCallbacks(this.y1);
        }
        this.o1 = true;
        if (this.q1 != -100) {
            Object obj = this.t;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                F1.put(this.t.getClass().getName(), Integer.valueOf(this.q1));
            } else {
                F1.remove(this.t.getClass().getName());
            }
        } else {
            F1.remove(this.t.getClass().getName());
        }
        fc11 fc11Var = this.N0;
        if (fc11Var != null) {
            fc11Var.U();
        }
        vj5 vj5Var = this.u1;
        if (vj5Var != null) {
            vj5Var.c();
        }
        vj5 vj5Var2 = this.v1;
        if (vj5Var2 != null) {
            vj5Var2.c();
        }
    }

    @Override // p.rj5
    public final boolean g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.h1 && i == 108) {
            return false;
        }
        if (this.d1 && i == 1) {
            this.d1 = false;
        }
        if (i == 1) {
            F();
            this.h1 = true;
            return true;
        }
        if (i == 2) {
            F();
            this.b1 = true;
            return true;
        }
        if (i == 5) {
            F();
            this.c1 = true;
            return true;
        }
        if (i == 10) {
            F();
            this.f1 = true;
            return true;
        }
        if (i == 108) {
            F();
            this.d1 = true;
            return true;
        }
        if (i != 109) {
            return this.Y.requestFeature(i);
        }
        F();
        this.e1 = true;
        return true;
    }

    @Override // p.ksi0
    public final void h(msi0 msi0Var) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.Q0;
        if (actionBarOverlayLayout == null || !actionBarOverlayLayout.a() || (ViewConfiguration.get(this.X).hasPermanentMenuKey() && !this.Q0.m())) {
            xj5 xj5VarX = x(0);
            xj5VarX.n = true;
            r(xj5VarX, false);
            C(xj5VarX, null);
            return;
        }
        Window.Callback callback = this.Y.getCallback();
        if (this.Q0.n()) {
            this.Q0.f();
            if (this.o1) {
                return;
            }
            callback.onPanelClosed(108, x(0).h);
            return;
        }
        if (callback == null || this.o1) {
            return;
        }
        if (this.w1 && (1 & this.x1) != 0) {
            View decorView = this.Y.getDecorView();
            sj5 sj5Var = this.y1;
            decorView.removeCallbacks(sj5Var);
            sj5Var.run();
        }
        xj5 xj5VarX2 = x(0);
        msi0 msi0Var2 = xj5VarX2.h;
        if (msi0Var2 == null || xj5VarX2.o || !callback.onPreparePanel(0, xj5VarX2.g, msi0Var2)) {
            return;
        }
        callback.onMenuOpened(108, xj5VarX2.h);
        this.Q0.s();
    }

    @Override // p.rj5
    public final void i(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Z0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.X).inflate(i, viewGroup);
        this.Z.a(this.Y.getCallback());
    }

    @Override // p.rj5
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Z0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.Z.a(this.Y.getCallback());
    }

    @Override // p.rj5
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Z0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.Z.a(this.Y.getCallback());
    }

    @Override // p.rj5
    public final void l(CharSequence charSequence) {
        this.P0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.Q0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        fc11 fc11Var = this.N0;
        if (fc11Var != null) {
            fc11Var.f0(charSequence);
            return;
        }
        TextView textView = this.a1;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.o1) {
            return false;
        }
        int i2 = this.q1;
        if (i2 == -100) {
            i2 = rj5.b;
        }
        Context context = this.X;
        int iA = A(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        fhe0 fhe0VarO = i3 < 33 ? o(context) : null;
        if (!z2 && fhe0VarO != null) {
            fhe0VarO = fhe0.a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationS = s(context, iA, fhe0VarO, null, false);
        boolean z4 = this.t1;
        boolean z5 = true;
        Object obj3 = this.t;
        if (z4 || !(obj3 instanceof Activity)) {
            this.t1 = true;
            i = this.s1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.s1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.s1 = 0;
                }
                this.t1 = true;
                i = this.s1;
            }
        }
        Configuration configuration = this.p1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationS.uiMode & 48;
        fhe0 fhe0VarA = fhe0.a(configuration.getLocales().toLanguageTags());
        fhe0 fhe0VarA2 = fhe0VarO == null ? null : fhe0.a(configurationS.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS : 0;
        if (fhe0VarA2 != null && !fhe0VarA.equals(fhe0VarA2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.m1 && ((H1 || this.n1) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationS.getLayoutDirection());
                }
                ag0.A0(activity);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (fhe0VarA2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(fhe0VarA2.a.a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 26 && i7 < 28) {
                if (!eth.q) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        eth.f31p = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused2) {
                    }
                    eth.q = true;
                }
                Field field = eth.f31p;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj != null) {
                        if (!eth.k) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                eth.j = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException unused4) {
                            }
                            eth.k = true;
                        }
                        Field field2 = eth.j;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException unused5) {
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!eth.m) {
                                try {
                                    eth.l = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException unused6) {
                                }
                                eth.m = true;
                            }
                            Class cls = eth.l;
                            if (cls != null) {
                                if (!eth.o) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        eth.n = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException unused7) {
                                    }
                                    eth.o = true;
                                }
                                Field field3 = eth.n;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException unused8) {
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i8 = this.r1;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.r1, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof iac0) {
                    if (((iac0) activity2).getLifecycle().b().a(w8c0.c)) {
                        activity2.onConfigurationChanged(configuration2);
                        this.Y.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.n1 && !this.o1) {
                    activity2.onConfigurationChanged(configuration2);
                    this.Y.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (fhe0VarA2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fhe0.a(context.getResources().getConfiguration().getLocales().toLanguageTags()).a.a.toLanguageTags()));
        }
        vj5 vj5Var = this.u1;
        if (i2 == 0) {
            if (vj5Var == null) {
                vj5Var = new vj5(this, dlg1.m(context));
                this.u1 = vj5Var;
            }
            vj5Var.s();
        } else if (vj5Var != null) {
            vj5Var.c();
        }
        vj5 vj5Var2 = this.v1;
        if (i2 == 3) {
            if (vj5Var2 == null) {
                vj5Var2 = new vj5(this, context);
                this.v1 = vj5Var2;
            }
            vj5Var2.s();
        } else if (vj5Var2 != null) {
            vj5Var2.c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void n(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        wh5 wh5Var;
        if (this.Y != null) {
            eg.m("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof uj5) {
            eg.m("AppCompat has already installed itself into the Window");
            return;
        }
        uj5 uj5Var = new uj5(this, callback);
        this.Z = uj5Var;
        window.setCallback(uj5Var);
        lvc1 lvc1VarD = lvc1.D(this.X, (AttributeSet) null, G1);
        Drawable drawableL = lvc1VarD.l(0);
        if (drawableL != null) {
            window.setBackgroundDrawable(drawableL);
        }
        lvc1VarD.I();
        this.Y = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.D1) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (wh5Var = this.E1) != null) {
            yh5.i(onBackInvokedDispatcher, wh5Var);
            this.E1 = null;
        }
        Object obj = this.t;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.D1 = yh5.a(activity);
            } else {
                this.D1 = null;
            }
        } else {
            this.D1 = null;
        }
        G();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        kl5 kl5Var = this.C1;
        if (kl5Var == null) {
            int[] iArr = moz0.j;
            Context context2 = this.X;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                kl5Var = new kl5();
                this.C1 = kl5Var;
            } else {
                try {
                    kl5Var = (kl5) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.C1 = kl5Var;
                } catch (Throwable unused) {
                    kl5Var = new kl5();
                    this.C1 = kl5Var;
                }
            }
        }
        return kl5Var.createView(view, str, context, attributeSet, false, false, true, false);
    }

    public final void p(int i, xj5 xj5Var, msi0 msi0Var) {
        if (msi0Var == null) {
            if (xj5Var == null && i >= 0) {
                xj5[] xj5VarArr = this.j1;
                if (i < xj5VarArr.length) {
                    xj5Var = xj5VarArr[i];
                }
            }
            if (xj5Var != null) {
                msi0Var = xj5Var.h;
            }
        }
        if ((xj5Var == null || xj5Var.m) && !this.o1) {
            uj5 uj5Var = this.Z;
            Window.Callback callback = this.Y.getCallback();
            uj5Var.getClass();
            try {
                uj5Var.e = true;
                callback.onPanelClosed(i, msi0Var);
            } finally {
                uj5Var.e = false;
            }
        }
    }

    public final void q(msi0 msi0Var) {
        if (this.i1) {
            return;
        }
        this.i1 = true;
        this.Q0.b();
        Window.Callback callback = this.Y.getCallback();
        if (callback != null && !this.o1) {
            callback.onPanelClosed(108, msi0Var);
        }
        this.i1 = false;
    }

    public final void r(xj5 xj5Var, boolean z) {
        wj5 wj5Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && xj5Var.a == 0 && (actionBarOverlayLayout = this.Q0) != null && actionBarOverlayLayout.n()) {
            q(xj5Var.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.X.getSystemService("window");
        if (windowManager != null && xj5Var.m && (wj5Var = xj5Var.e) != null) {
            windowManager.removeView(wj5Var);
            if (z) {
                p(xj5Var.a, xj5Var, null);
            }
        }
        xj5Var.k = false;
        xj5Var.l = false;
        xj5Var.m = false;
        xj5Var.f = null;
        xj5Var.n = true;
        if (this.k1 == xj5Var) {
            this.k1 = null;
        }
        if (xj5Var.a == 0) {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6 A[RETURN] */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        xj5 xj5VarX;
        ActionBarOverlayLayout actionBarOverlayLayout;
        boolean z;
        boolean zF;
        boolean zE;
        AudioManager audioManager;
        xj5 xj5VarX2;
        Object obj = this.t;
        if ((!(obj instanceof dpa0) && !(obj instanceof ak5)) || (decorView = this.Y.getDecorView()) == null || !wqn1.p(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                uj5 uj5Var = this.Z;
                Window.Callback callback = this.Y.getCallback();
                uj5Var.getClass();
                try {
                    uj5Var.d = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    uj5Var.d = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.l1 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    xj5VarX2 = x(0);
                                    if (!xj5VarX2.m) {
                                        E(xj5VarX2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.T0 == null) {
                                    xj5VarX = x(0);
                                    actionBarOverlayLayout = this.Q0;
                                    Context context = this.X;
                                    if (actionBarOverlayLayout != null || !actionBarOverlayLayout.a() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = xj5VarX.m;
                                        if (!z || xj5VarX.l) {
                                            r(xj5VarX, true);
                                            zF = z;
                                        } else if (xj5VarX.k) {
                                            if (xj5VarX.o) {
                                                xj5VarX.k = false;
                                                zE = E(xj5VarX, keyEvent);
                                            } else {
                                                zE = true;
                                            }
                                            if (zE) {
                                                C(xj5VarX, keyEvent);
                                                zF = true;
                                            } else {
                                                zF = false;
                                            }
                                        } else {
                                            zF = false;
                                        }
                                    } else if (this.Q0.n()) {
                                        zF = this.Q0.f();
                                    } else if (this.o1 || !E(xj5VarX, keyEvent)) {
                                        zF = false;
                                    } else {
                                        zF = this.Q0.s();
                                    }
                                    if (zF && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (B()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    uj5Var.d = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.l1 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            xj5VarX2 = x(0);
                            if (!xj5VarX2.m) {
                                E(xj5VarX2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.T0 == null) {
                            xj5VarX = x(0);
                            actionBarOverlayLayout = this.Q0;
                            Context context2 = this.X;
                            if (actionBarOverlayLayout != null) {
                                z = xj5VarX.m;
                                if (z) {
                                    r(xj5VarX, true);
                                    zF = z;
                                } else {
                                    r(xj5VarX, true);
                                    zF = z;
                                }
                            } else {
                                z = xj5VarX.m;
                                if (z) {
                                    r(xj5VarX, true);
                                    zF = z;
                                } else {
                                    r(xj5VarX, true);
                                    zF = z;
                                }
                            }
                            if (zF) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (B()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void u(int i) {
        xj5 xj5VarX = x(i);
        if (xj5VarX.h != null) {
            Bundle bundle = new Bundle();
            xj5VarX.h.v(bundle);
            if (bundle.size() > 0) {
                xj5VarX.f141p = bundle;
            }
            xj5VarX.h.A();
            xj5VarX.h.clear();
        }
        xj5VarX.o = true;
        xj5VarX.n = true;
        if ((i == 108 || i == 0) && this.Q0 != null) {
            xj5 xj5VarX2 = x(0);
            xj5VarX2.k = false;
            E(xj5VarX2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.Y0) {
            return;
        }
        Context context = this.X;
        int[] iArr = moz0.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            eg.m("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.g1 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.Y.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.h1) {
            viewGroup = this.f1 ? (ViewGroup) layoutInflaterFrom.inflate(2131623958, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131623957, (ViewGroup) null);
        } else if (this.g1) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131623948, (ViewGroup) null);
            this.e1 = false;
            this.d1 = false;
        } else if (this.d1) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968588, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new plm(context, typedValue.resourceId) : context).inflate(2131623959, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayoutFindViewById = viewGroup.findViewById(2131428422);
            this.Q0 = actionBarOverlayLayoutFindViewById;
            actionBarOverlayLayoutFindViewById.setWindowCallback(this.Y.getCallback());
            if (this.e1) {
                this.Q0.i(109);
            }
            if (this.b1) {
                this.Q0.i(2);
            }
            if (this.c1) {
                this.Q0.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.d1);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.e1);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.g1);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f1);
            sb.append(", windowNoTitle: ");
            hhg1.n(l1d.r(sb, this.h1, " }"));
            return;
        }
        ifl1 ifl1Var = new ifl1((Object) this, (byte) 4);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(viewGroup, ifl1Var);
        if (this.Q0 == null) {
            this.a1 = (TextView) viewGroup.findViewById(2131431356);
        }
        boolean z = sik1.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131427446);
        ViewGroup viewGroup2 = (ViewGroup) this.Y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.Y.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new a42(this, (byte) 21));
        this.Z0 = viewGroup;
        Object obj = this.t;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.P0;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.Q0;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setWindowTitle(title);
            } else {
                fc11 fc11Var = this.N0;
                if (fc11Var != null) {
                    fc11Var.f0(title);
                } else {
                    TextView textView = this.a1;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.Z0.findViewById(R.id.content);
        View decorView = this.Y.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.Y0 = true;
        xj5 xj5VarX = x(0);
        if (this.o1 || xj5VarX.h != null) {
            return;
        }
        z(108);
    }

    public final void w() {
        if (this.Y == null) {
            Object obj = this.t;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.Y != null) {
            return;
        }
        eg.m("We have not been given a Window");
    }

    public final xj5 x(int i) {
        xj5[] xj5VarArr = this.j1;
        if (xj5VarArr == null || xj5VarArr.length <= i) {
            xj5[] xj5VarArr2 = new xj5[i + 1];
            if (xj5VarArr != null) {
                System.arraycopy(xj5VarArr, 0, xj5VarArr2, 0, xj5VarArr.length);
            }
            this.j1 = xj5VarArr2;
            xj5VarArr = xj5VarArr2;
        }
        xj5 xj5Var = xj5VarArr[i];
        if (xj5Var != null) {
            return xj5Var;
        }
        xj5 xj5Var2 = new xj5();
        xj5Var2.a = i;
        xj5Var2.n = false;
        xj5VarArr[i] = xj5Var2;
        return xj5Var2;
    }

    public final void y() {
        tql1 tql1Var;
        v();
        if (this.d1 && (tql1Var = this.N0) == null) {
            Object obj = this.t;
            if (obj instanceof Activity) {
                tql1Var = new tql1((Activity) obj, this.e1);
                this.N0 = tql1Var;
            } else if (obj instanceof Dialog) {
                tql1Var = new tql1((Dialog) obj);
                this.N0 = tql1Var;
            }
            if (tql1Var != null) {
                tql1Var.a0(this.z1);
            }
        }
    }

    public final void z(int i) {
        this.x1 = (1 << i) | this.x1;
        if (this.w1) {
            return;
        }
        View decorView = this.Y.getDecorView();
        WeakHashMap weakHashMap = b8k1.a;
        decorView.postOnAnimation(this.y1);
        this.w1 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
