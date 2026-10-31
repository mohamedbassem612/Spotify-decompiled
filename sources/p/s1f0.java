package p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s1f0 {
    public static final lfb b = new lfb((byte) 15);
    public static final Set c = f46.S0(new String[]{"ads_management", "create_event", "rsvp_event"});
    public static volatile s1f0 d;
    public final SharedPreferences a;

    static {
        s1f0.class.toString();
    }

    public s1f0() {
        w0h1.H();
        this.a = wf10.a().getSharedPreferences("com.facebook.loginManager", 0);
        if (!wf10.n || dro.z() == null) {
            return;
        }
        asn.e(wf10.a(), "com.android.chrome", new cro());
        Context contextA = wf10.a();
        String packageName = wf10.a().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext = contextA.getApplicationContext();
        try {
            asn.e(applicationContext, packageName, new fro(applicationContext));
        } catch (SecurityException unused) {
        }
    }

    public static void a(dg30 dg30Var, int i, Map map, FacebookException facebookException, boolean z, rye0 rye0Var) {
        m1f0 m1f0VarG = xi20.Y.g(dg30Var);
        if (rye0Var == null) {
            ScheduledExecutorService scheduledExecutorService = m1f0.d;
            if (dhn.a.contains(m1f0.class)) {
                return;
            }
            try {
                m1f0VarG.a("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th) {
                dhn.a(m1f0.class, th);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        String str = rye0Var.g;
        String str2 = rye0Var.O0 ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = m1f0.d;
        if (dhn.a.contains(m1f0VarG)) {
            return;
        }
        try {
            Bundle bundleO = qtg.o(str);
            if (i != 0) {
                bundleO.putString("2_result", g5d0.d(i));
            }
            if ((facebookException != null ? facebookException.getMessage() : null) != null) {
                bundleO.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleO.putString("6_extras", jSONObject.toString());
            }
            m1f0VarG.b.p(bundleO, str2);
            if (i != 1 || dhn.a.contains(m1f0VarG)) {
                return;
            }
            try {
                m1f0.d.schedule(new ag20(m1f0VarG, qtg.o(str), (byte) 15), 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                dhn.a(m1f0VarG, th2);
            }
        } catch (Throwable th3) {
            dhn.a(m1f0VarG, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final void b(int i, Intent intent, sf10 sf10Var) {
        int i2;
        boolean z;
        FacebookException facebookException;
        rl8 rl8Var;
        Map map;
        rye0 rye0Var;
        rl8 rl8Var2;
        l2f0 l2f0Var;
        rl8 rl8Var3;
        boolean z2;
        rl8 rl8Var4;
        if (intent != null) {
            intent.setExtrasClassLoader(sye0.class.getClassLoader());
            sye0 sye0Var = (sye0) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (sye0Var != null) {
                rye0 rye0Var2 = sye0Var.f;
                i2 = sye0Var.a;
                if (i != -1) {
                    if (i != 0) {
                        facebookException = null;
                        rl8Var3 = null;
                        rl8Var4 = rl8Var3;
                        z2 = false;
                    } else {
                        z2 = true;
                        facebookException = null;
                        rl8Var3 = null;
                        rl8Var4 = null;
                    }
                } else if (i2 == 1) {
                    rl8 rl8Var5 = sye0Var.b;
                    z2 = false;
                    rl8Var4 = sye0Var.c;
                    rl8Var3 = rl8Var5;
                    facebookException = null;
                } else {
                    facebookException = new FacebookAuthorizationException(sye0Var.d);
                    rl8Var3 = null;
                    rl8Var4 = rl8Var3;
                    z2 = false;
                }
                rl8 rl8Var6 = rl8Var3;
                map = sye0Var.g;
                rl8Var = rl8Var6;
                rye0Var = rye0Var2;
                rl8Var2 = rl8Var4;
                z = z2;
            } else {
                i2 = 3;
                facebookException = null;
                rl8Var = null;
                map = null;
                rye0Var = null;
                rl8Var2 = null;
                z = false;
            }
        } else if (i == 0) {
            i2 = 2;
            z = true;
            facebookException = null;
            rl8Var = null;
            map = null;
            rye0Var = null;
            rl8Var2 = null;
        } else {
            i2 = 3;
            facebookException = null;
            rl8Var = null;
            map = null;
            rye0Var = null;
            rl8Var2 = null;
            z = false;
        }
        if (facebookException == null && rl8Var == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        a(null, i2, map, facebookException2, true, rye0Var);
        if (rl8Var != null) {
            Date date = xd.Y;
            fuo1.y(rl8Var);
            vby0.o();
        }
        if (rl8Var2 != null) {
            eyh0.f.h().A(rl8Var2);
        }
        if (sf10Var != null) {
            if (rl8Var == null || rye0Var == null) {
                l2f0Var = null;
            } else {
                Set set = rye0Var.b;
                Set setO1 = o7h.o1(o7h.o0(((xd) rl8Var).b));
                if (rye0Var.h) {
                    setO1.retainAll(set);
                }
                Set setO2 = o7h.o1(o7h.o0(set));
                setO2.removeAll(setO1);
                l2f0Var = new l2f0(rl8Var, rl8Var2, setO1, setO2);
            }
            if (z || (l2f0Var != null && l2f0Var.c.isEmpty())) {
                pf10 pf10Var = sf10Var.g;
                if (pf10Var != null) {
                    kg0 kg0Var = pf10Var.J1;
                    if (kg0Var != null) {
                        kg0Var.a(true);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                return;
            }
            if (facebookException2 != null) {
                sf10Var.c.k(String.format(Locale.US, "A Facebook exception of type %s occurred ", Arrays.copyOf(new Object[]{facebookException2.getClass().getSimpleName()}, 1)));
                Logger.e(facebookException2, "A Facebook exception occurred while trying to authenticate", new Object[0]);
                if ("net::ERR_INTERNET_DISCONNECTED".equals(facebookException2.getMessage())) {
                    sf10Var.a(true);
                    return;
                } else {
                    sf10Var.a(false);
                    return;
                }
            }
            if (rl8Var == null || l2f0Var == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putBoolean("express_login_allowed", true);
            editorEdit.apply();
            sf10Var.d.dispose();
            utw0 utw0Var = sf10Var.a;
            sf10Var.d = Observable.fromCallable(new sra(utw0Var, cy30.g("fields", "id,first_name,name,email"), (byte) 21)).map(bjx0.h).startWithItem(gf10.a).subscribeOn((Scheduler) utw0Var.a).observeOn(sf10Var.b).subscribe(new rf10(sf10Var, (byte) 0), new rf10(sf10Var, (byte) 1));
        }
    }
}
