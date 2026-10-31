package p;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.spotify.cosmos.cosmos.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lj20 implements mj20 {
    public static final Object l = new Object();
    public final wi20 a;
    public final jj20 b;
    public final t8r0 c;
    public final ppi1 d;
    public final aob0 e;
    public final Object f;
    public final ExecutorService g;
    public final f661 h;
    public String i;
    public final HashSet j;
    public final ArrayList k;

    static {
        new AtomicInteger(1);
    }

    public lj20(wi20 wi20Var, lly0 lly0Var, ExecutorService executorService, f661 f661Var) {
        wi20Var.a();
        jj20 jj20Var = new jj20(wi20Var.a, lly0Var);
        t8r0 t8r0Var = new t8r0();
        t8r0Var.b = wi20Var;
        ypa ypaVarI = ypa.i();
        ppi1 ppi1Var = ppi1.c;
        if (ppi1Var == null) {
            ppi1Var = new ppi1(ypaVarI);
            ppi1.c = ppi1Var;
        }
        aob0 aob0Var = new aob0(new s0i(wi20Var, (byte) 2));
        this.f = new Object();
        this.j = new HashSet();
        this.k = new ArrayList();
        this.a = wi20Var;
        this.b = jj20Var;
        this.c = t8r0Var;
        this.d = ppi1Var;
        this.e = aob0Var;
        this.g = executorService;
        this.h = f661Var;
    }

    public final void a() {
        s19 s19VarO;
        synchronized (l) {
            try {
                wi20 wi20Var = this.a;
                wi20Var.a();
                rm5 rm5VarK = rm5.k(wi20Var.a);
                try {
                    s19VarO = this.c.o();
                    int i = s19VarO.b;
                    if (i == 2 || i == 1) {
                        String strF = f(s19VarO);
                        t8r0 t8r0Var = this.c;
                        at7 at7Var = new at7(s19VarO);
                        at7Var.g(strF);
                        at7Var.j(3);
                        s19VarO = at7Var.b();
                        t8r0Var.g(s19VarO);
                    }
                    if (rm5VarK != null) {
                        rm5VarK.I();
                    }
                } catch (Throwable th) {
                    if (rm5VarK != null) {
                        rm5VarK.I();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(s19VarO);
        this.h.execute(new kj20(this, (byte) 1));
    }

    public final s19 b(s19 s19Var) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionC;
        r29 r29VarF;
        jj20 jj20Var = this.b;
        wi20 wi20Var = this.a;
        wi20Var.a();
        String str = wi20Var.c.a;
        String str2 = s19Var.a;
        wi20 wi20Var2 = this.a;
        wi20Var2.a();
        String str3 = wi20Var2.c.g;
        String str4 = s19Var.d;
        fp21 fp21Var = jj20Var.c;
        if (!fp21Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = jj20.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = jj20Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(Request.POST);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    jj20.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    fp21Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        r29VarF = jj20.f(httpURLConnectionC);
                        break;
                    }
                    jj20.b(httpURLConnectionC, null);
                    if (responseCode == 401 || responseCode == 404) {
                        mgc mgcVarA = r29.a();
                        mgcVarA.T(3);
                        r29VarF = mgcVarA.h();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        mgc mgcVarA2 = r29.a();
                        mgcVarA2.T(2);
                        r29VarF = mgcVarA2.h();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iC = l1d.C(r29VarF.b());
        if (iC == 0) {
            String strC = r29VarF.c();
            long jD = r29VarF.d();
            this.d.a.getClass();
            long jG = ypa.g() / 1000;
            at7 at7Var = new at7(s19Var);
            at7Var.e(strC);
            at7Var.f(jD);
            at7Var.k(jG);
            return at7Var.b();
        }
        if (iC == 1) {
            at7 at7Var2 = new at7(s19Var);
            at7Var2.h("BAD CONFIG");
            at7Var2.j(5);
            return at7Var2.b();
        }
        if (iC != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.i = null;
        }
        at7 at7Var3 = new at7(s19Var);
        at7Var3.j(2);
        return at7Var3.b();
    }

    public final hfp1 c() {
        String str;
        e();
        synchronized (this) {
            str = this.i;
        }
        if (str != null) {
            return o0c.z(str);
        }
        bsd1 bsd1Var = new bsd1();
        on40 on40Var = new on40(bsd1Var);
        synchronized (this.f) {
            this.k.add(on40Var);
        }
        hfp1 hfp1Var = bsd1Var.a;
        this.g.execute(new n6(this, (byte) 6));
        return hfp1Var;
    }

    public final hfp1 d() {
        e();
        bsd1 bsd1Var = new bsd1();
        bl40 bl40Var = new bl40(this.d, bsd1Var);
        synchronized (this.f) {
            this.k.add(bl40Var);
        }
        hfp1 hfp1Var = bsd1Var.a;
        this.g.execute(new kj20(this, (byte) 0));
        return hfp1Var;
    }

    public final void e() {
        wi20 wi20Var = this.a;
        wi20Var.a();
        zod.p(wi20Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        wi20Var.a();
        zod.p(wi20Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        wi20Var.a();
        zod.p(wi20Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        wi20Var.a();
        String str = wi20Var.c.b;
        Pattern pattern = ppi1.b;
        zod.j("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        wi20Var.a();
        zod.j("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", ppi1.b.matcher(wi20Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0054, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0054, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(s19 s19Var) {
        gp70 gp70Var;
        String string;
        wi20 wi20Var = this.a;
        wi20Var.a();
        if (!wi20Var.b.equals("CHIME_ANDROID_SDK")) {
            wi20 wi20Var2 = this.a;
            wi20Var2.a();
            if ("[DEFAULT]".equals(wi20Var2.b)) {
                if (s19Var.b == 1) {
                    gp70Var = (gp70) this.e.get();
                    synchronized (gp70Var.a) {
                        try {
                            synchronized (gp70Var.a) {
                                string = gp70Var.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = gp70Var.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return gqz0.a();
                    }
                    return string;
                }
            }
        } else if (s19Var.b == 1) {
            gp70Var = (gp70) this.e.get();
            synchronized (gp70Var.a) {
                synchronized (gp70Var.a) {
                    string = gp70Var.a.getString("|S|id", null);
                    if (string != null) {
                        string = gp70Var.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return gqz0.a();
                    }
                    return string;
                }
            }
        }
        return gqz0.a();
    }

    public final s19 g(s19 s19Var) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionC;
        e19 e19VarE;
        String str = s19Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            gp70 gp70Var = (gp70) this.e.get();
            synchronized (gp70Var.a) {
                try {
                    String[] strArr = gp70.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = gp70Var.a.getString("|T|" + gp70Var.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jj20 jj20Var = this.b;
        wi20 wi20Var = this.a;
        wi20Var.a();
        String str3 = wi20Var.c.a;
        String str4 = s19Var.a;
        wi20 wi20Var2 = this.a;
        wi20Var2.a();
        String str5 = wi20Var2.c.g;
        wi20 wi20Var3 = this.a;
        wi20Var3.a();
        String str6 = wi20Var3.c.b;
        fp21 fp21Var = jj20Var.c;
        if (!fp21Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = jj20.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            httpURLConnectionC = jj20Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(Request.POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    jj20.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    fp21Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        e19VarE = jj20.e(httpURLConnectionC);
                        break;
                    }
                    jj20.b(httpURLConnectionC, str6);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        o0g1 o0g1Var = new o0g1((byte) 2);
                        o0g1Var.r(2);
                        e19VarE = o0g1Var.g();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iC = l1d.C(e19VarE.e);
        if (iC != 0) {
            if (iC != 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            at7 at7Var = new at7(s19Var);
            at7Var.h("BAD CONFIG");
            at7Var.j(5);
            return at7Var.b();
        }
        String str7 = e19VarE.b;
        String str8 = e19VarE.c;
        this.d.a.getClass();
        long jG = ypa.g() / 1000;
        String strC = e19VarE.d.c();
        long jD = e19VarE.d.d();
        at7 at7Var2 = new at7(s19Var);
        at7Var2.g(str7);
        at7Var2.j(4);
        at7Var2.e(strC);
        at7Var2.i(str8);
        at7Var2.f(jD);
        at7Var2.k(jG);
        return at7Var2.b();
    }

    public final void h(Exception exc) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((ppb1) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(s19 s19Var) {
        synchronized (this.f) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (((ppb1) it.next()).b(s19Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
