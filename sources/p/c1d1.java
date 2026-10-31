package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c1d1 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ d1d1 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f21p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public z60 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public c1d1(d1d1 d1d1Var, Menu menu) {
        this.E = d1d1Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d1d1 d1d1Var = this.E;
        Context context = d1d1Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                eg.m("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = d1d1Var.d;
            if (objA == null) {
                objA = d1d1.a(context);
                d1d1Var.d = objA;
            }
            String str = this.y;
            b1d1 b1d1Var = new b1d1();
            b1d1Var.b = objA;
            Class<?> cls = objA.getClass();
            try {
                b1d1Var.c = cls.getMethod(str, b1d1.d);
                menuItem.setOnMenuItemClickListener(b1d1Var);
            } catch (Exception e) {
                StringBuilder sbT = l1d.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbT.append(cls.getName());
                InflateException inflateException = new InflateException(sbT.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof ysi0) {
                ysi0 ysi0Var = (ysi0) menuItem;
                ysi0Var.x = (ysi0Var.x & (-5)) | 4;
            } else if (menuItem instanceof dti0) {
                dti0 dti0Var = (dti0) menuItem;
                e1d1 e1d1Var = dti0Var.c;
                try {
                    Method declaredMethod = dti0Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = e1d1Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        dti0Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(e1d1Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d1d1.e, d1d1Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        z60 z60Var = this.z;
        if (z60Var != null && (menuItem instanceof e1d1)) {
            ((e1d1) menuItem).a(z60Var);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof e1d1;
        if (z2) {
            ((e1d1) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            fpi1.L(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((e1d1) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            fpi1.P(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((e1d1) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            fpi1.J(menuItem, c, i3);
        }
        char c2 = this.f21p;
        int i4 = this.q;
        if (z2) {
            ((e1d1) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            fpi1.O(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((e1d1) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                fpi1.N(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((e1d1) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                fpi1.M(menuItem, colorStateList);
            }
        }
    }
}
