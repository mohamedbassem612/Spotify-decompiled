package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class gj5 extends dg30 implements lj5 {
    public yj5 Z0;

    public gj5() {
        this.d.j().c("androidx:appcompat", new ej5(this, (byte) 0));
        this.b.a(new fj5(this));
    }

    @Override // p.g0i, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        yj5 yj5Var = (yj5) h0();
        yj5Var.v();
        ((ViewGroup) yj5Var.Z0.findViewById(R.id.content)).addView(view, layoutParams);
        yj5Var.Z.a(yj5Var.Y.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        plm plmVar;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        LocaleList locales;
        LocaleList locales2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        yj5 yj5Var = (yj5) h0();
        yj5Var.m1 = true;
        int i37 = yj5Var.q1;
        if (i37 == -100) {
            i37 = rj5.b;
        }
        int iA = yj5Var.A(context, i37);
        if (rj5.b(context) && rj5.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (rj5.i) {
                    try {
                        fhe0 fhe0Var = rj5.c;
                        if (fhe0Var == null) {
                            fhe0 fhe0VarA = rj5.d;
                            if (fhe0VarA == null) {
                                fhe0VarA = fhe0.a(zr7.H(context));
                                rj5.d = fhe0VarA;
                            }
                            if (!fhe0VarA.a.a.isEmpty()) {
                                rj5.c = rj5.d;
                            }
                        } else if (!fhe0Var.equals(rj5.d)) {
                            fhe0 fhe0Var2 = rj5.c;
                            rj5.d = fhe0Var2;
                            zr7.G(context, fhe0Var2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!rj5.f) {
                rj5.a.execute(new pj5(context, (byte) 0));
            }
        }
        fhe0 fhe0VarO = yj5.o(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(yj5.s(context, iA, fhe0VarO, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof plm) {
                    try {
                        ((plm) context).a(yj5.s(context, iA, fhe0VarO, null, false));
                    } catch (IllegalStateException unused2) {
                        if (yj5.H1) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    locales = configuration.getLocales();
                                    locales2 = configuration2.getLocales();
                                    if (!locales.equals(locales2)) {
                                        configuration3.setLocales(locales2);
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        kw7.t(configuration, configuration2, configuration3);
                                    }
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationS = yj5.s(context, iA, fhe0VarO, configuration3, true);
                            plmVar = new plm(context, 2132018107);
                            plmVar.a(configurationS);
                            try {
                                if (context.getTheme() != null) {
                                    wm5.E(plmVar.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = plmVar;
                        }
                    }
                } else if (yj5.H1) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            locales = configuration.getLocales();
                            locales2 = configuration2.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration3.setLocales(locales2);
                                configuration3.locale = configuration2.locale;
                            }
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                kw7.t(configuration, configuration2, configuration3);
                            }
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    }
                    Configuration configurationS2 = yj5.s(context, iA, fhe0VarO, configuration3, true);
                    plmVar = new plm(context, 2132018107);
                    plmVar.a(configurationS2);
                    if (context.getTheme() != null) {
                        wm5.E(plmVar.getTheme());
                    }
                    context = plmVar;
                }
            }
        } else if (context instanceof plm) {
            ((plm) context).a(yj5.s(context, iA, fhe0VarO, null, false));
        } else if (yj5.H1) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    locales = configuration.getLocales();
                    locales2 = configuration2.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration3.setLocales(locales2);
                        configuration3.locale = configuration2.locale;
                    }
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        kw7.t(configuration, configuration2, configuration3);
                    }
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            }
            Configuration configurationS3 = yj5.s(context, iA, fhe0VarO, configuration3, true);
            plmVar = new plm(context, 2132018107);
            plmVar.a(configurationS3);
            if (context.getTheme() != null) {
                wm5.E(plmVar.getTheme());
            }
            context = plmVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        fc11 fc11VarI0 = i0();
        if (getWindow().hasFeature(0)) {
            if (fc11VarI0 == null || !fc11VarI0.q()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p.f0i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        fc11 fc11VarI0 = i0();
        if (keyCode == 82 && fc11VarI0 != null && fc11VarI0.W(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        yj5 yj5Var = (yj5) h0();
        yj5Var.v();
        return yj5Var.Y.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        yj5 yj5Var = (yj5) h0();
        d1d1 d1d1Var = yj5Var.O0;
        if (d1d1Var == null) {
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            d1d1Var = new d1d1(fc11Var != null ? fc11Var.H() : yj5Var.X);
            yj5Var.O0 = d1d1Var;
        }
        return d1d1Var;
    }

    public final rj5 h0() {
        yj5 yj5Var = this.Z0;
        if (yj5Var != null) {
            return yj5Var;
        }
        qj5 qj5Var = rj5.a;
        yj5 yj5Var2 = new yj5(this, null, this, this);
        this.Z0 = yj5Var2;
        return yj5Var2;
    }

    public final fc11 i0() {
        yj5 yj5Var = (yj5) h0();
        yj5Var.y();
        return yj5Var.N0;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        h0().a();
    }

    public boolean j0() {
        Intent intentP = mno1.p(this);
        if (intentP == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentP)) {
            navigateUpTo(intentP);
            return true;
        }
        rya1 rya1VarD = rya1.d(this);
        rya1VarD.c(this);
        rya1VarD.e();
        try {
            ag0.y0(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final void k0(Toolbar toolbar) {
        yj5 yj5Var = (yj5) h0();
        Object obj = yj5Var.t;
        if (obj instanceof Activity) {
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            if (fc11Var instanceof tql1) {
                eg.m("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            yj5Var.O0 = null;
            if (fc11Var != null) {
                fc11Var.U();
            }
            yj5Var.N0 = null;
            a2f1 a2f1Var = new a2f1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : yj5Var.P0, yj5Var.Z);
            yj5Var.N0 = a2f1Var;
            yj5Var.Z.b = a2f1Var.e;
            toolbar.setBackInvokedCallbackEnabled(true);
            yj5Var.a();
        }
    }

    @Override // p.g0i, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        yj5 yj5Var = (yj5) h0();
        if (yj5Var.d1 && yj5Var.Y0) {
            yj5Var.y();
            fc11 fc11Var = yj5Var.N0;
            if (fc11Var != null) {
                fc11Var.T();
            }
        }
        ck5 ck5VarA = ck5.a();
        Context context = yj5Var.X;
        synchronized (ck5VarA) {
            ex21 ex21Var = ck5VarA.a;
            synchronized (ex21Var) {
                q5f0 q5f0Var = (q5f0) ex21Var.b.get(context);
                if (q5f0Var != null) {
                    q5f0Var.a();
                }
            }
        }
        yj5Var.p1 = new Configuration(yj5Var.X.getResources().getConfiguration());
        yj5Var.m(false, false);
    }

    @Override // p.dg30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h0().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // p.dg30, p.g0i, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        fc11 fc11VarI0 = i0();
        if (menuItem.getItemId() != 16908332 || fc11VarI0 == null || (fc11VarI0.B() & 4) == 0) {
            return false;
        }
        return j0();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((yj5) h0()).v();
    }

    @Override // p.dg30, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        yj5 yj5Var = (yj5) h0();
        yj5Var.y();
        fc11 fc11Var = yj5Var.N0;
        if (fc11Var != null) {
            fc11Var.e0(true);
        }
    }

    @Override // p.dg30, android.app.Activity
    public void onStart() {
        super.onStart();
        ((yj5) h0()).m(true, false);
    }

    @Override // p.dg30, android.app.Activity
    public void onStop() {
        super.onStop();
        yj5 yj5Var = (yj5) h0();
        yj5Var.y();
        fc11 fc11Var = yj5Var.N0;
        if (fc11Var != null) {
            fc11Var.e0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h0().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        fc11 fc11VarI0 = i0();
        if (getWindow().hasFeature(0)) {
            if (fc11VarI0 == null || !fc11VarI0.X()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p.g0i, android.app.Activity
    public final void setContentView(int i) {
        d0();
        h0().i(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((yj5) h0()).r1 = i;
    }

    @Override // p.g0i, android.app.Activity
    public void setContentView(View view) {
        d0();
        h0().j(view);
    }

    @Override // p.g0i, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        h0().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
