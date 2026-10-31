package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import com.spotify.wear.phoneonboardingimpl.events.proto.WearAppOnboardingTrigger;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2i1 implements Function, pe5, qiw, k1q0, ya, h8q0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public i2i1(byte b) {
        this.a = b;
        switch (b) {
            case 17:
                this.b = b380.m();
                break;
            default:
                Object obj = lz40.d;
                this.b = new SparseIntArray();
                break;
        }
    }

    public boolean a(n3j0 n3j0Var, n3j0 n3j0Var2) {
        return !f46.M((q4j0[]) this.b, n3j0Var.a) || uwo1.p(n3j0Var.b, n3j0Var2.b);
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        gal1 gal1Var = (gal1) this.b;
        if (gal1Var.a()) {
            return gal1Var.d() && !kskVar.b;
        }
        return gal1Var.d();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((ehi1) obj2).c.C(((ahi1) obj).a).w();
            case 6:
                return new gsk1(((irk1) obj2).a);
            default:
                return new v1l1(((j0l1) obj2).a, (String) obj);
        }
    }

    public Intent b() {
        return (Intent) this.b;
    }

    public void c() {
        ((Intent) this.b).putExtra("extra_clear_backstack", true);
    }

    public void d(String str, ohl1 ohl1Var) {
        ngl1 ngl1VarN = WearAppOnboardingTrigger.n();
        ngl1VarN.q(str);
        ngl1VarN.n(ohl1Var.a);
        ((t2j0) this.b).a(ngl1VarN.build());
    }

    public void e() {
        ((Intent) this.b).putExtra("title", "Settings");
    }

    public int f(Context context, px40 px40Var) {
        zod.s(context);
        zod.s(px40Var);
        int iC = 0;
        if (!px40Var.A()) {
            return 0;
        }
        int iL = px40Var.l();
        int iG = g(iL);
        if (iG != -1) {
            return iG;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iL && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iC == -1) {
                iC = lz40.e.c(context, iL);
            }
            sparseIntArray.put(iL, iC);
        }
        return iC;
    }

    public int g(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public uq20 get(int i) {
        return (gr20) this.b;
    }

    public void h() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public void i(int i, Object obj, ujp1 ujp1Var) {
        fhp1 fhp1Var = (fhp1) this.b;
        qgp1 qgp1Var = (qgp1) obj;
        fhp1Var.x(i, 2);
        fhp1Var.G(qgp1Var.c(ujp1Var));
        ujp1Var.c(qgp1Var, this);
    }

    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 android.content.SharedPreferences, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    public void onSuccess(Object obj) {
        int i;
        q5p1 q5p1Var;
        y1p1 y1p1VarC;
        switch (this.a) {
            case 15:
                pue0 pue0Var = b4e.m;
                ((jub1) this.b).g(new Status(0, (String) null, (PendingIntent) null, (lal) null));
                return;
            default:
                b3e b3eVar = (b3e) this.b;
                Bundle bundle = (Bundle) obj;
                if (emo1.k) {
                    Context context = b3eVar.a;
                    pxo1 pxo1Var = b3eVar.e;
                    emo1 emo1Var = new emo1(context, pxo1Var, b3eVar.b, b3eVar.i, b3eVar.f);
                    int i2 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                    boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                    boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                    emo1.k = z2;
                    if (i2 != 0) {
                        i = i2;
                    } else if (!z && !z2) {
                        return;
                    } else {
                        i = 0;
                    }
                    emo1Var.h = new jvn1(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L), context);
                    String packageName = context.getPackageName();
                    Locale locale = Locale.ROOT;
                    String strE = f4i1.e(packageName, ".client_cast_analytics_data");
                    emo1Var.i = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") != 0 ? 2 : 1;
                    jog1.b(context);
                    emo1Var.g = jog1.a().c(xhc.e).a("CAST_SENDER_SDK", new bbx("proto"), gtv0.X);
                    if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                        emo1Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                    }
                    SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(strE, 0);
                    if (i != 0) {
                        asd1 asd1VarB = asd1.b();
                        asd1VarB.d = new kpo1(pxo1Var, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, (byte) 0);
                        asd1VarB.a = new pl10[]{hm5.g};
                        asd1VarB.b = false;
                        asd1VarB.c = (char) 8426;
                        pxo1Var.e(0, asd1VarB.a()).n(new b8p1(emo1Var, packageName, i, sharedPreferences, (byte) 25));
                    }
                    if (z) {
                        zod.s(sharedPreferences);
                        pue0 pue0Var2 = q5p1.i;
                        synchronized (q5p1.class) {
                            q5p1Var = q5p1.k;
                            if (q5p1Var == null) {
                                q5p1Var = new q5p1(sharedPreferences, emo1Var, packageName);
                                q5p1.k = q5p1Var;
                            }
                            break;
                        }
                        String str = q5p1Var.c;
                        SharedPreferences sharedPreferences2 = q5p1Var.b;
                        HashSet hashSet = q5p1Var.f;
                        String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                        String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                        hashSet.clear();
                        HashSet hashSet2 = q5p1Var.g;
                        hashSet2.clear();
                        q5p1Var.h = r11;
                        String str2 = q5p1.j;
                        if (str2.equals(string) && str.equals(string2)) {
                            q5p1Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", r11);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            HashSet hashSet3 = new HashSet();
                            for (String str3 : sharedPreferences2.getAll().keySet()) {
                                if (str3.startsWith("feature_usage_timestamp_")) {
                                    long j = sharedPreferences2.getLong(str3, r11);
                                    if (j != 0 && jCurrentTimeMillis - j > 1209600000) {
                                        hashSet3.add(str3);
                                    } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                        y1p1 y1p1VarC2 = q5p1.c(str3.substring(41));
                                        if (y1p1VarC2 != null) {
                                            hashSet2.add(y1p1VarC2);
                                            hashSet.add(y1p1VarC2);
                                        }
                                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (y1p1VarC = q5p1.c(str3.substring(41))) != null) {
                                        hashSet.add(y1p1VarC);
                                    }
                                }
                            }
                            q5p1Var.b(hashSet3);
                            q5p1Var.e.post(q5p1Var.d);
                        } else {
                            HashSet hashSet4 = new HashSet();
                            for (String str4 : sharedPreferences2.getAll().keySet()) {
                                if (str4.startsWith("feature_usage_timestamp_")) {
                                    hashSet4.add(str4);
                                }
                            }
                            hashSet4.add("feature_usage_last_report_time");
                            q5p1Var.b(hashSet4);
                            sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                        }
                        q5p1.a(y1p1.g);
                    }
                    if (emo1.k) {
                        synchronized (xbp1.class) {
                            if (xbp1.b == null) {
                                xbp1 xbp1Var = new xbp1((byte) 0);
                                new ConcurrentHashMap();
                                xbp1.b = xbp1Var;
                            }
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void v(Object obj) {
        cej1 cej1Var = (cej1) this.b;
        String str = ((ouj1) obj).a;
        if (str.length() > 0) {
            cqw cqwVar = cej1Var.i;
            if (cqwVar != null) {
                cqwVar.b(str);
            }
            cej1Var.a.c(str, new sjf1(0, cej1Var, cej1.class, "onActive", "onActive()V", 0, (byte) 7), new sjf1(0, cej1Var, cej1.class, "onInactive", "onInactive()V", 0, (byte) 8));
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        ((ViewGroup) this.b).setPadding(0, hsl1Var.a.i(519).b, 0, 0);
        return hsl1.b;
    }

    public i2i1(fhp1 fhp1Var) {
        this.a = (byte) 18;
        Charset charset = mip1.a;
        this.b = fhp1Var;
        fhp1Var.e = this;
    }

    public /* synthetic */ i2i1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public i2i1(tlu tluVar) {
        this.a = (byte) 11;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(tluVar);
    }

    public i2i1(Context context, String str, Intent intent) {
        this.a = (byte) 5;
        this.b = intent;
        intent.setExtrasClassLoader(context.getClassLoader());
        intent.setClassName(context, str);
    }

    public i2i1(float f, float f2) {
        this.a = (byte) 2;
        this.b = new gr20(f, f2);
    }
}
