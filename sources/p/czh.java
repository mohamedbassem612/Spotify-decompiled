package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class czh implements v0i, mnm, jn10, yg30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ czh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.mnm
    public Object d(Task task) {
        ((Runnable) this.b).run();
        return o0c.z((Object) null);
    }

    public void f(zf30 zf30Var) {
        k1f0 k1f0Var = (k1f0) zf30Var;
        j1p1.o((g0f0) ((sva) this.b).b.get(), k1f0Var).e(k1f0Var);
    }

    @Override // p.jn10
    public void i(boolean z) {
        String str = (String) this.b;
        SecureRandom secureRandom = FacebookException.a;
        if (z) {
            try {
                uyn1.D(str);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0216  */
    @Override // p.v0i
    public Object m(dxy dxyVar) {
        ghn ghnVar;
        dm70 dm70Var;
        uo5 uo5Var;
        byte b;
        FirebaseCrashlytics firebaseCrashlytics;
        boolean z;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                return obj;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) obj;
                int i = CrashlyticsRegistrar.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                wi20 wi20Var = (wi20) dxyVar.a(wi20.class);
                mj20 mj20Var = (mj20) dxyVar.a(mj20.class);
                aqq0 aqq0VarX = dxyVar.x(shn.class);
                aqq0 aqq0VarX2 = dxyVar.x(nz3.class);
                aqq0 aqq0VarX3 = dxyVar.x(qj20.class);
                ExecutorService executorService = (ExecutorService) dxyVar.d(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) dxyVar.d(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) dxyVar.d(crashlyticsRegistrar.c);
                wi20Var.a();
                Context context = wi20Var.a;
                String packageName = context.getPackageName();
                ws10 ws10Var = ws10.Z;
                ws10Var.f();
                uo5 uo5Var2 = new uo5(executorService, executorService2);
                d520 d520Var = new d520(context);
                p68 p68Var = new p68(wi20Var);
                dm70 dm70Var2 = new dm70(context, packageName, mj20Var, p68Var);
                vhn vhnVar = new vhn(aqq0VarX);
                qz3 qz3Var = new qz3(aqq0VarX2);
                ghn ghnVar2 = new ghn(p68Var, d520Var);
                vj20 vj20Var = vj20.a;
                di61 di61Var = di61.a;
                tj20 tj20VarA = vj20.a(di61Var);
                if (tj20VarA.b != null) {
                    di61Var.toString();
                } else {
                    tj20VarA.b = ghnVar2;
                    di61Var.toString();
                    fdg1.o0(tj20VarA.a);
                }
                ohn ohnVar = new ohn(wi20Var, dm70Var2, vhnVar, p68Var, qz3Var.b(), qz3Var.a(), d520Var, ghnVar2, new tz01(aqq0VarX3, (byte) 4), uo5Var2);
                ghn ghnVar3 = ohnVar.m;
                dm70 dm70Var3 = ohnVar.i;
                d520 d520Var2 = ohnVar.j;
                uo5 uo5Var3 = ohnVar.f84p;
                djn djnVar = (djn) uo5Var3.b;
                wi20Var.a();
                String str = wi20Var.c.b;
                int iX = eth.x(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iX == 0) {
                    iX = eth.x(context, "com.crashlytics.android.build_id", "string");
                }
                String string = iX != 0 ? context.getResources().getString(iX) : null;
                ArrayList arrayList = new ArrayList();
                int iX2 = eth.x(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                String str2 = string;
                int iX3 = eth.x(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iX4 = eth.x(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iX2 == 0 || iX3 == 0 || iX4 == 0) {
                    ghnVar = ghnVar3;
                    dm70Var = dm70Var3;
                    uo5Var = uo5Var3;
                    b = 0;
                    String.format("Could not find resources: %d %d %d", Integer.valueOf(iX2), Integer.valueOf(iX3), Integer.valueOf(iX4));
                    ws10Var.c();
                } else {
                    b = 0;
                    String[] stringArray = context.getResources().getStringArray(iX2);
                    String[] stringArray2 = context.getResources().getStringArray(iX3);
                    String[] stringArray3 = context.getResources().getStringArray(iX4);
                    ghnVar = ghnVar3;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i2 = 0;
                        while (i2 < stringArray3.length) {
                            int i3 = i2;
                            arrayList.add(new mbc(stringArray[i3], stringArray2[i3], stringArray3[i3]));
                            i2 = i3 + 1;
                            dm70Var3 = dm70Var3;
                            uo5Var3 = uo5Var3;
                        }
                        dm70Var = dm70Var3;
                        uo5Var = uo5Var3;
                    } else {
                        dm70Var = dm70Var3;
                        uo5Var = uo5Var3;
                        String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        ws10Var.c();
                    }
                }
                ws10Var.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((mbc) it.next()).getClass();
                    ws10Var.c();
                }
                uo5 uo5Var4 = uo5Var;
                try {
                    wl5 wl5VarA = wl5.a(context, dm70Var2, str, str2, arrayList, new rm5(context, (byte) 27));
                    ws10Var.g();
                    s880 s880VarE = s880.e(context, str, dm70Var2, new vhc((byte) 12), wl5VarA.f, wl5VarA.g, d520Var, p68Var);
                    s880VarE.m(uo5Var2).c(executorService3, new n9v((byte) 26));
                    Context context2 = ohnVar.a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z = true;
                    } else {
                        int iX5 = eth.x(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iX5 > 0) {
                            z = resources.getBoolean(iX5);
                        } else {
                            int iX6 = eth.x(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iX6 > 0) {
                                z = Boolean.parseBoolean(context2.getString(iX6));
                            } else {
                                z = true;
                            }
                        }
                    }
                    String str3 = wl5VarA.b;
                    if (!z) {
                        ws10Var.g();
                    } else if (TextUtils.isEmpty(str3)) {
                        eg.m("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        return null;
                    }
                    String str4 = new fic().a;
                    try {
                        ohnVar.f = new ham("crash_marker", d520Var2, (byte) 8);
                        ohnVar.e = new ham("initialization_marker", d520Var2, (byte) 8);
                        mxa1 mxa1Var = new mxa1(str4, d520Var2, uo5Var4);
                        rm5 rm5Var = new rm5(d520Var2);
                        dab1[] dab1VarArr = new dab1[1];
                        dab1VarArr[b] = new mka((byte) 23);
                        bnj0 bnj0Var = new bnj0(dab1VarArr);
                        ohnVar.o.k(mxa1Var);
                        ohnVar.h = new jhn(ohnVar.a, dm70Var, ohnVar.b, d520Var2, ohnVar.f, wl5VarA, mxa1Var, rm5Var, bh61.c(ohnVar.a, dm70Var, d520Var2, wl5VarA, rm5Var, mxa1Var, bnj0Var, s880VarE, ohnVar.c, ghnVar, uo5Var4), ohnVar.n, ohnVar.l, ghnVar, uo5Var4);
                        boolean zO = ohnVar.e.o();
                        try {
                            ohnVar.g = Boolean.TRUE.equals((Boolean) djnVar.a.submit((Callable) new lhn(ohnVar, b)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                            ohnVar.g = false;
                        }
                        jhn jhnVar = ohnVar.h;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        ((djn) jhnVar.e.b).a(new e0i(jhnVar, str4, (byte) 5));
                        cjn cjnVar = new cjn(new n4b(jhnVar, (byte) 17), s880VarE, defaultUncaughtExceptionHandler, jhnVar.j);
                        jhnVar.n = cjnVar;
                        Thread.setDefaultUncaughtExceptionHandler(cjnVar);
                        if (zO && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            ws10Var.c();
                            ohnVar.b(s880VarE);
                        } else {
                            ws10Var.c();
                            djnVar.a(new khn(ohnVar, s880VarE, (byte) 0));
                        }
                    } catch (Exception unused2) {
                        ws10Var.d();
                        ohnVar.h = null;
                    }
                    firebaseCrashlytics = new FirebaseCrashlytics(ohnVar);
                    break;
                } catch (PackageManager.NameNotFoundException unused3) {
                    ws10Var.d();
                    firebaseCrashlytics = null;
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis <= 16) {
                    return firebaseCrashlytics;
                }
                ws10Var.c();
                return firebaseCrashlytics;
        }
    }
}
