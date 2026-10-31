package com.spotify.login.adaptiveauthentication.challenge.web;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import app.p000rive.semantics.SemanticState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import p.asn;
import p.eg;
import p.fuo1;
import p.gv40;
import p.hhg1;
import p.hwb;
import p.j1e1;
import p.jgu;
import p.khv0;
import p.lir0;
import p.lt50;
import p.lxa1;
import p.m2d;
import p.mir0;
import p.mxa1;
import p.nkb0;
import p.nl51;
import p.nxg1;
import p.ohv0;
import p.oql;
import p.oxg1;
import p.pwg1;
import p.q371;
import p.q7g0;
import p.s9g;
import p.syy0;
import p.t8e1;
import p.u890;
import p.ubc;
import p.uf0;
import p.utw0;
import p.wnh1;
import p.wzn;
import p.x4p1;
import p.xze1;
import p.ykb0;
import p.zyh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/web/NoAnimLauncherActivity;", "Lp/lt50;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NoAnimLauncherActivity extends Activity implements lt50, lir0 {
    public static boolean h;
    public static int i;
    public nkb0 a;
    public boolean b;
    public syy0 c;
    public oxg1 d;
    public ohv0 e;
    public wnh1 f;
    public jgu g;

    public final wnh1 a() {
        wnh1 wnh1Var = this.f;
        if (wnh1Var != null) {
            return wnh1Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    public final mir0 c() {
        return new mir0(a().a());
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x033b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(Bundle bundle) {
        List parcelableArrayListExtra;
        q371 q371Var;
        int iB;
        int identifier;
        boolean z;
        ArrayList arrayListA;
        utw0 utw0Var;
        Bitmap bitmapCreateBitmap;
        Integer num;
        Integer num2;
        IntentFilter intentFilter;
        String str;
        super.onCreate(bundle);
        int i2 = i + 1;
        i = i2;
        boolean z2 = i2 > 1;
        boolean z3 = getIntent().getData() != null;
        String action = getIntent().getAction();
        boolean z4 = "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        if (z2 && !z3 && !z4) {
            finish();
            return;
        }
        boolean z5 = (getIntent().getFlags() & 268435456) != 0;
        boolean z6 = (getIntent().getFlags() & 524288) != 0;
        if (!z5 || z6) {
            Intent intent = new Intent(getIntent());
            intent.setFlags((getIntent().getFlags() | 268435456) & (-524289));
            startActivity(intent);
            finish();
            return;
        }
        if (bundle != null && bundle.getBoolean("android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY")) {
            finish();
            return;
        }
        nkb0 nkb0VarA = nkb0.a(this);
        this.a = nkb0VarA;
        if (nkb0VarA.h == 0 ? false : isTaskRoot()) {
            nkb0 nkb0Var = this.a;
            int i3 = nkb0Var.h;
            int color = getColor(nkb0Var.i);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            nkb0 nkb0Var2 = this.a;
            this.c = new syy0(this, i3, color, nkb0Var2.k, nkb0Var2.j);
        }
        if (isFinishing()) {
            return;
        }
        wzn wznVar = new wzn(Integer.valueOf(getColor(this.a.c) | (-16777216)), (Object) null, Integer.valueOf(getColor(this.a.e) | (-16777216)), Integer.valueOf(getColor(this.a.g)));
        Uri data = getIntent().getData();
        if (data != null) {
            data.toString();
        } else {
            String str2 = this.a.a;
            data = str2 != null ? Uri.parse(str2) : Uri.parse("https://www.example.com/");
        }
        pwg1 pwg1Var = new pwg1(data);
        int color2 = getColor(this.a.b);
        oxg1 oxg1Var = pwg1Var.b;
        oxg1Var.h(color2);
        asn asnVar = (asn) oxg1Var.d;
        asnVar.b = Integer.valueOf((-16777216) | getColor(this.a.d));
        asnVar.c = Integer.valueOf(getColor(this.a.f));
        oxg1Var.c(0);
        oxg1Var.d(2, wznVar);
        nkb0 nkb0Var3 = this.a;
        pwg1Var.g = nkb0Var3.n;
        pwg1Var.h = nkb0Var3.o;
        List list = nkb0Var3.l;
        if (list != null) {
            pwg1Var.c = list;
        }
        Intent intent2 = getIntent();
        String action2 = intent2.getAction();
        if ("android.intent.action.SEND".equals(action2) || "android.intent.action.SEND_MULTIPLE".equals(action2)) {
            if ("android.intent.action.SEND".equals(intent2.getAction())) {
                Uri uri = (Uri) intent2.getParcelableExtra("android.intent.extra.STREAM");
                parcelableArrayListExtra = uri != null ? Collections.singletonList(uri) : null;
            } else {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            q371Var = new q371(intent2.getStringExtra("android.intent.extra.SUBJECT"), parcelableArrayListExtra, intent2.getStringExtra("android.intent.extra.TEXT"));
        } else {
            q371Var = null;
        }
        if (q371Var != null && (str = this.a.f103p) != null) {
            try {
                pwg1Var.f = x4p1.n(str);
                pwg1Var.e = q371Var;
            } catch (JSONException e) {
                e.toString();
            }
        }
        oxg1 oxg1Var2 = new oxg1(this);
        this.d = oxg1Var2;
        hwb hwbVar = new hwb((byte) 21);
        syy0 syy0Var = this.c;
        gv40 gv40Var = new gv40(this, (byte) 9);
        t8e1 t8e1Var = "webview".equalsIgnoreCase(this.a.m) ? oxg1.i : oxg1.h;
        String str3 = (String) oxg1Var2.d;
        if (oxg1Var2.b) {
            eg.m("TwaLauncher already destroyed");
            return;
        }
        if (oxg1Var2.a == 0) {
            if (syy0Var != null) {
                syy0Var.h = str3;
                NoAnimLauncherActivity noAnimLauncherActivity = syy0Var.a;
                ResolveInfo resolveInfoResolveService = noAnimLauncherActivity.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str3), 64);
                boolean zHasCategory = (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) ? false : intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
                syy0Var.i = zHasCategory;
                if (zHasCategory) {
                    ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
                    Drawable drawable = noAnimLauncherActivity.getDrawable(syy0Var.b);
                    if (drawable == null) {
                        bitmapCreateBitmap = null;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                    }
                    syy0Var.f = bitmapCreateBitmap;
                    if (bitmapCreateBitmap != null) {
                        ImageView imageView = new ImageView(noAnimLauncherActivity);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        imageView.setImageBitmap(syy0Var.f);
                        imageView.setBackgroundColor(syy0Var.c);
                        imageView.setScaleType(scaleType2);
                        ImageView.ScaleType scaleType3 = ImageView.ScaleType.MATRIX;
                        noAnimLauncherActivity.setContentView(imageView);
                    }
                    if (syy0Var.f != null) {
                        nl51 nl51Var = syy0.l;
                        nl51Var.getClass();
                        Intent intent3 = (Intent) oxg1Var.a().b;
                        if (nl51Var.h(noAnimLauncherActivity, str3).a) {
                            if (nl51Var.h(noAnimLauncherActivity, str3).b) {
                                num = (Integer) oql.d(intent3, nl51.e(noAnimLauncherActivity, pwg1Var)).c;
                            } else {
                                Bundle extras = intent3.getExtras();
                                if (extras == null) {
                                    num = null;
                                } else {
                                    num = (Integer) extras.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR");
                                }
                            }
                        } else if (s9g.a.contains(str3)) {
                            num = -1;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            int iIntValue = num.intValue();
                            noAnimLauncherActivity.getWindow().setNavigationBarColor(iIntValue);
                            if (Build.VERSION.SDK_INT >= 26 && fuo1.z(iIntValue)) {
                                View rootView = noAnimLauncherActivity.getWindow().getDecorView().getRootView();
                                rootView.setSystemUiVisibility(rootView.getSystemUiVisibility() | 16);
                            }
                        }
                        Intent intent4 = (Intent) oxg1Var.a().b;
                        if (nl51Var.h(noAnimLauncherActivity, str3).b) {
                            num2 = (Integer) oql.d(intent4, nl51.e(noAnimLauncherActivity, pwg1Var)).a;
                        } else {
                            Bundle extras2 = intent4.getExtras();
                            num2 = extras2 == null ? null : (Integer) extras2.get("android.support.customtabs.extra.TOOLBAR_COLOR");
                        }
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            noAnimLauncherActivity.getWindow().setStatusBarColor(iIntValue2);
                            if (fuo1.z(iIntValue2)) {
                                View rootView2 = noAnimLauncherActivity.getWindow().getDecorView().getRootView();
                                rootView2.setSystemUiVisibility(rootView2.getSystemUiVisibility() | SemanticState.Multiline);
                            }
                        }
                    }
                } else {
                    t8e1Var = t8e1Var;
                }
            } else {
                t8e1Var = t8e1Var;
            }
            m2d m2dVar = new m2d((Object) oxg1Var2, (Object) pwg1Var, (Object) syy0Var, (Object) gv40Var, (byte) 26);
            if (((wzn) oxg1Var2.f) != null) {
                m2dVar.run();
            } else {
                m2d m2dVar2 = new m2d((Object) oxg1Var2, (Object) t8e1Var, (Object) pwg1Var, (Object) gv40Var, (byte) 27);
                nxg1 nxg1Var = (nxg1) oxg1Var2.e;
                if (nxg1Var == null) {
                    nxg1Var = new nxg1(oxg1Var2, hwbVar);
                    oxg1Var2.e = nxg1Var;
                }
                nxg1Var.b = m2dVar;
                nxg1Var.c = m2dVar2;
                NoAnimLauncherActivity noAnimLauncherActivity2 = (NoAnimLauncherActivity) oxg1Var2.c;
                nxg1Var.a = noAnimLauncherActivity2.getApplicationContext();
                Intent intent5 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (str3.isEmpty()) {
                    hhg1.n("Service Intents must be explicit");
                    return;
                } else {
                    intent5.setPackage(str3);
                    noAnimLauncherActivity2.bindService(intent5, nxg1Var, 1);
                }
            }
        } else {
            t8e1Var.f((NoAnimLauncherActivity) oxg1Var2.c, pwg1Var, str3, gv40Var);
        }
        if (!((NoAnimLauncherActivity) oxg1Var2.c).getPackageManager().hasSystemFeature("org.chromium.arc")) {
            uf0 uf0Var = (uf0) oxg1Var2.g;
            try {
                arrayListA = (Build.VERSION.SDK_INT >= 28 ? new ykb0() : new ubc((byte) 18)).a(((NoAnimLauncherActivity) oxg1Var2.c).getPackageManager(), str3);
            } catch (PackageManager.NameNotFoundException unused) {
                arrayListA = null;
            }
            if (arrayListA == null) {
                utw0Var = null;
            } else {
                try {
                    utw0Var = new utw0(xze1.a(str3, arrayListA));
                } catch (IOException unused2) {
                    utw0Var = null;
                }
            }
            SharedPreferences sharedPreferences = uf0Var.a.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
            if (utw0Var == null) {
                sharedPreferences.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
            } else {
                byte[] bArr = ((xze1) utw0Var.a).a;
                sharedPreferences.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
            }
        }
        if (!h) {
            String str4 = (String) this.d.d;
            if (s9g.b.contains(str4) && (iB = s9g.b(getPackageManager(), str4)) != 0 && iB < 362600000 && (identifier = getResources().getIdentifier("string/update_chrome_toast", null, getPackageName())) != 0) {
                z = true;
                Toast.makeText(this, identifier, 1).show();
            } else {
                z = true;
            }
            h = z;
        }
        if (getApplicationContext().getPackageManager().hasSystemFeature("org.chromium.arc")) {
            getSharedPreferences("TrustedWebActivityLauncherPrefs", 0).edit().putString("KEY_PROVIDER_PACKAGE", "org.chromium.arc.payment_app").apply();
        } else {
            getSharedPreferences("TrustedWebActivityLauncherPrefs", 0).edit().putString("KEY_PROVIDER_PACKAGE", (String) this.d.d).apply();
        }
        q7g0.a(this, (String) this.d.d);
    }

    public final void e(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY", this.b);
    }

    public final jgu f() {
        jgu jguVar = this.g;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        j1e1.q(this);
        d(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("PBL_STATE")) != null) {
            a().y(bundle2);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        mxa1 mxa1Var;
        super.onDestroy();
        i--;
        oxg1 oxg1Var = this.d;
        if (oxg1Var != null && !oxg1Var.b) {
            nxg1 nxg1Var = (nxg1) oxg1Var.e;
            if (nxg1Var != null) {
                ((NoAnimLauncherActivity) oxg1Var.c).unbindService(nxg1Var);
            }
            oxg1Var.c = null;
            oxg1Var.b = true;
        }
        syy0 syy0Var = this.c;
        if (syy0Var == null || (mxa1Var = syy0Var.g) == null) {
            return;
        }
        ((lxa1) mxa1Var.h).cancel(true);
        mxa1Var.g = null;
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        syy0 syy0Var = this.c;
        if (syy0Var != null) {
            syy0Var.j = true;
            zyh0 zyh0Var = syy0Var.k;
            if (zyh0Var != null) {
                zyh0Var.run();
                syy0Var.k = null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        wnh1.H(a());
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.b) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        a().F();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundleI;
        e(bundle);
        if (!isChangingConfigurations() || (bundleI = a().I()) == null) {
            return;
        }
        bundle.putBundle("PBL_STATE", bundleI);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        a().G();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
            overridePendingTransition(0, 0);
        } catch (ActivityNotFoundException unused) {
            ohv0 ohv0Var = this.e;
            if (ohv0Var == null) {
                u890.C("preAuthUbiTracker");
                throw null;
            }
            ohv0Var.a(new khv0("web_challenge", 4, (Map) null, "no_browser"));
            Toast.makeText(this, 2131958600, 0).show();
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
