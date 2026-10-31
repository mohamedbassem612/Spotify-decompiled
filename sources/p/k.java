package p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ byte a;

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[Catch: all -> 0x005b, Exception -> 0x00b9, TryCatch #13 {Exception -> 0x00b9, all -> 0x005b, blocks: (B:18:0x003e, B:20:0x004e, B:23:0x0055, B:27:0x0062, B:29:0x006e, B:31:0x0074, B:47:0x00af, B:42:0x008e, B:43:0x0091, B:46:0x0098, B:26:0x005d), top: B:205:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[Catch: all -> 0x005b, Exception -> 0x00b9, TryCatch #13 {Exception -> 0x00b9, all -> 0x005b, blocks: (B:18:0x003e, B:20:0x004e, B:23:0x0055, B:27:0x0062, B:29:0x006e, B:31:0x0074, B:47:0x00af, B:42:0x008e, B:43:0x0091, B:46:0x0098, B:26:0x005d), top: B:205:0x003e }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x580 x580Var;
        Class clsB;
        String str;
        nql nqlVarO = null;
        final byte b = 1;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                if (dhn.a.contains(l.class)) {
                    return;
                }
                try {
                    l.a((ActivityManager) wf10.a().getSystemService("activity"));
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    dhn.a(l.class, th);
                    return;
                }
            case 1:
                z580.d();
                return;
            case 2:
                if (og0.f == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(wf10.a());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j != 0 && j2 != 0 && string != null) {
                        nql t01Var = new t01(Long.valueOf(j), Long.valueOf(j2));
                        t01Var.a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(wf10.a());
                        t01Var.f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new nql(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), (byte) 3) : null;
                        t01Var.e = Long.valueOf(System.currentTimeMillis());
                        t01Var.d = UUID.fromString(string);
                        nqlVarO = t01Var;
                    }
                    og0.f = nqlVarO;
                    return;
                }
                return;
            case 3:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 4:
                vz3.a();
                return;
            case 5:
                wdn0 wdn0Var = ha4.m2;
                synchronized (wdn0Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr2 = wdn0Var.a;
                        int i3 = wdn0Var.b;
                        if (i2 < 30) {
                            for (int i4 = 0; i4 < i3; i4++) {
                                final ha4 ha4Var = (ha4) objArr2[i4];
                                boolean showLayoutBounds = ha4Var.getShowLayoutBounds();
                                Class cls = ha4.j2;
                                ha4Var.setShowLayoutBounds(l9x0.i());
                                if (showLayoutBounds != ha4Var.getShowLayoutBounds()) {
                                    final Object[] objArr3 = objArr == true ? 1 : 0;
                                    ha4Var.post(new Runnable() { // from class: p.y94
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b2 = objArr3;
                                            ha4 ha4Var2 = ha4Var;
                                            switch (b2) {
                                                case 0:
                                                    ha4.k(ha4Var2.getRoot());
                                                    break;
                                                default:
                                                    ha4.k(ha4Var2.getRoot());
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            for (int i5 = 0; i5 < i3; i5++) {
                                final ha4 ha4Var2 = (ha4) objArr2[i5];
                                ha4Var2.post(new Runnable() { // from class: p.y94
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b2 = b;
                                        ha4 ha4Var3 = ha4Var2;
                                        switch (b2) {
                                            case 0:
                                                ha4.k(ha4Var3.getRoot());
                                                break;
                                            default:
                                                ha4.k(ha4Var3.getRoot());
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 6:
                if (dhn.a.contains(gm5.class)) {
                    return;
                }
                try {
                    hm5.F(gm5.a);
                    gm5.a = new x6o0();
                    return;
                } catch (Throwable th3) {
                    dhn.a(gm5.class, th3);
                    return;
                }
            case 7:
                HashSet hashSet = new HashSet();
                x6o0 x6o0Var = gm5.a;
                if (!dhn.a.contains(gm5.class)) {
                    try {
                        nqlVarO = gm5.a.o();
                    } catch (Throwable th4) {
                        dhn.a(gm5.class, th4);
                    }
                    break;
                }
                Iterator it = nqlVarO.iterator();
                while (it.hasNext()) {
                    hashSet.add(((zd) it.next()).a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    g120.k((String) it2.next(), true);
                }
                return;
            case 8:
            case 9:
                return;
            case 10:
                Context contextA = wf10.a();
                nql nqlVarF = x580.f(contextA, m580.g);
                if (nqlVarF.isEmpty()) {
                    Object obj = m580.g;
                    if (!dhn.a.contains(x580.class)) {
                        try {
                            nqlVarO = (obj != null && (clsB = (x580Var = x580.a).b(contextA, "com.android.vending.billing.IInAppBillingService")) != null && x580Var.c(clsB, "getPurchaseHistory") != null) ? x580Var.a(x580Var.d(contextA, obj)) : new ArrayList();
                        } catch (Throwable th5) {
                            dhn.a(x580.class, th5);
                        }
                    }
                    nqlVarF = nqlVarO;
                    break;
                }
                m580.a(contextA, nqlVarF, false);
                return;
            case 11:
                Context contextA2 = wf10.a();
                m580.a(contextA2, x580.f(contextA2, m580.g), false);
                Object obj2 = m580.g;
                if (!dhn.a.contains(x580.class)) {
                    try {
                        x580 x580Var2 = x580.a;
                        nqlVarO = x580Var2.a(x580Var2.e(contextA2, obj2, "subs"));
                    } catch (Throwable th6) {
                        dhn.a(x580.class, th6);
                    }
                    break;
                }
                m580.a(contextA2, nqlVarO, true);
                return;
            case 12:
                Set set = dhn.a;
                if (set.contains(fkj0.class)) {
                    return;
                }
                try {
                    en7 en7VarQ = lro1.q(wf10.a());
                    if ((en7VarQ != null && en7VarQ.e) == true) {
                        return;
                    }
                    fkj0 fkj0Var = fkj0.b;
                    if (!set.contains(fkj0Var)) {
                        try {
                            c120 c120VarK = g120.k(wf10.b(), false);
                            if (c120VarK != null && (str = c120VarK.j) != null) {
                                try {
                                    tmj0.a().clear();
                                    czo1.g(new JSONObject(str));
                                    break;
                                } catch (JSONException unused2) {
                                }
                            }
                        } catch (Throwable th7) {
                            dhn.a(fkj0Var, th7);
                        }
                    }
                    fkj0.c = true;
                    return;
                } catch (Throwable th8) {
                    dhn.a(fkj0.class, th8);
                    return;
                }
            case 13:
                dim0 dim0Var = dim0.a;
                Set set2 = dhn.a;
                if (set2.contains(dim0.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string2 = sharedPreferences.getString("models", null);
                    JSONObject jSONObject = (string2 == null || string2.length() == 0) ? new JSONObject() : new JSONObject(string2);
                    long j3 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (!mn10.b(kn10.Y) || jSONObject.length() == 0 || set2.contains(dim0Var) || j3 == 0) {
                        jSONObject = dim0Var.c();
                        if (jSONObject == null) {
                            return;
                        } else {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                    } else {
                        try {
                            if (System.currentTimeMillis() - j3 >= 259200000) {
                                jSONObject = dim0Var.c();
                                if (jSONObject == null) {
                                    return;
                                } else {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                }
                            }
                        } catch (Throwable th9) {
                            dhn.a(dim0Var, th9);
                        }
                    }
                    dim0Var.a(jSONObject);
                    dim0Var.b();
                    return;
                } catch (Exception unused3) {
                    return;
                } catch (Throwable th10) {
                    dhn.a(dim0.class, th10);
                    return;
                }
            case 14:
                return;
            default:
                if (dhn.a.contains(etc1.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = etc1.b;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    etc1.a.b();
                    return;
                } catch (Throwable th11) {
                    dhn.a(etc1.class, th11);
                    return;
                }
        }
    }

    public /* synthetic */ k(byte b) {
        this.a = b;
    }
}
