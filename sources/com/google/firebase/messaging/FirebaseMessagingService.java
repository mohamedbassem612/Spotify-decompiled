package com.google.firebase.messaging;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.a9j0;
import p.b9j0;
import p.bbx;
import p.bsd1;
import p.c45;
import p.c9j0;
import p.czh0;
import p.d9j0;
import p.e9j0;
import p.efr;
import p.eg;
import p.f321;
import p.fc11;
import p.hfp1;
import p.hog1;
import p.ioo1;
import p.ivl1;
import p.l5o;
import p.lj20;
import p.mj20;
import p.o0c;
import p.pj20;
import p.pkn0;
import p.r09;
import p.swm0;
import p.u961;
import p.uk4;
import p.uo5;
import p.wi20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class FirebaseMessagingService extends Service {
    public static final ArrayDeque f = new ArrayDeque(10);
    public final ExecutorService a;
    public ivl1 b;
    public final Object c;
    public int d;
    public int e;

    public FirebaseMessagingService() {
        pkn0 pkn0Var = new pkn0("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), pkn0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            ioo1.y(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:138:0x020d A[Catch: NumberFormatException -> 0x021b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {NumberFormatException -> 0x021b, blocks: (B:138:0x020d, B:146:0x0226), top: B:199:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0212  */
    /* JADX WARN: Code duplicated, block: B:143:0x021d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0226 A[Catch: NumberFormatException -> 0x021b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {NumberFormatException -> 0x021b, blocks: (B:138:0x020d, B:146:0x0226), top: B:199:0x020b }] */
    /* JADX WARN: Code duplicated, block: B:192:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    public final void b(Intent intent) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z;
        hog1 hog1Var;
        long j;
        wi20 wi20VarC;
        pj20 pj20Var;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = f;
            if (arrayDeque.contains(stringExtra)) {
                Log.isLoggable("FirebaseMessaging", 3);
                return;
            } else {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
        }
        String stringExtra2 = intent.getStringExtra("message_type");
        if (stringExtra2 == null) {
            stringExtra2 = "gcm";
        }
        int iIntValue = 0;
        switch (stringExtra2) {
            case "gcm":
                if (fc11.g0(intent)) {
                    fc11.S(intent.getExtras(), "_nr");
                }
                if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                    z = false;
                } else {
                    try {
                        wi20.c();
                        wi20 wi20VarC2 = wi20.c();
                        wi20VarC2.a();
                        Context context = wi20VarC2.a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z = false;
                            } else {
                                z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    }
                }
                if (z && (hog1Var = FirebaseMessaging.k) != null) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = Bundle.EMPTY;
                    }
                    Object obj = extras.get("google.ttl");
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    int i = iIntValue;
                    String string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            wi20 wi20VarC3 = wi20.c();
                            try {
                                Object obj2 = lj20.l;
                                string = (String) o0c.g(((lj20) wi20VarC3.b(mj20.class)).c());
                            } catch (InterruptedException e) {
                                e = e;
                                eg.j(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e2) {
                            e = e2;
                        }
                    }
                    String str4 = string;
                    wi20 wi20VarC4 = wi20.c();
                    wi20VarC4.a();
                    String packageName = wi20VarC4.a.getPackageName();
                    b9j0 b9j0Var = swm0.t(extras) ? b9j0.DISPLAY_NOTIFICATION : b9j0.DATA_MESSAGE;
                    String string2 = extras.getString("google.message_id");
                    if (string2 == null) {
                        string2 = extras.getString("message_id");
                    }
                    String str5 = string2 != null ? string2 : "";
                    String string3 = extras.getString("from");
                    if (string3 == null || !string3.startsWith("/topics/")) {
                        string3 = null;
                    }
                    String str6 = string3 != null ? string3 : "";
                    String string4 = extras.getString("collapse_key");
                    String str7 = string4 != null ? string4 : "";
                    String string5 = extras.getString("google.c.a.m_l");
                    String str8 = string5 != null ? string5 : "";
                    String string6 = extras.getString("google.c.a.c_l");
                    String str9 = string6 != null ? string6 : "";
                    if (!extras.containsKey("google.c.sender.id")) {
                        wi20VarC = wi20.c();
                        pj20Var = wi20VarC.c;
                        wi20VarC.a();
                        str = pj20Var.e;
                        if (str != null) {
                            wi20VarC.a();
                            str2 = pj20Var.b;
                            if (str2.startsWith("1:")) {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length >= 2) {
                                    str3 = strArrSplit[1];
                                    if (!str3.isEmpty()) {
                                        j = Long.parseLong(str3);
                                    }
                                }
                                j = 0;
                            } else {
                                j = Long.parseLong(str2);
                            }
                        } else {
                            j = Long.parseLong(str);
                        }
                        break;
                    } else {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                            break;
                        } catch (NumberFormatException unused3) {
                            wi20VarC = wi20.c();
                            pj20Var = wi20VarC.c;
                            wi20VarC.a();
                            str = pj20Var.e;
                            if (str != null) {
                                wi20VarC.a();
                                str2 = pj20Var.b;
                                if (str2.startsWith("1:")) {
                                    j = Long.parseLong(str2);
                                } else {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length >= 2) {
                                        str3 = strArrSplit[1];
                                        if (!str3.isEmpty()) {
                                            j = Long.parseLong(str3);
                                        }
                                    }
                                    j = 0;
                                }
                                break;
                            } else {
                                try {
                                    j = Long.parseLong(str);
                                    break;
                                } catch (NumberFormatException unused4) {
                                    wi20VarC.a();
                                    str2 = pj20Var.b;
                                    try {
                                        if (str2.startsWith("1:")) {
                                            j = Long.parseLong(str2);
                                        } else {
                                            strArrSplit = str2.split(":");
                                            if (strArrSplit.length >= 2) {
                                                str3 = strArrSplit[1];
                                                if (!str3.isEmpty()) {
                                                    j = Long.parseLong(str3);
                                                }
                                            }
                                            j = 0;
                                        }
                                        break;
                                    } catch (NumberFormatException unused5) {
                                    }
                                }
                            }
                        }
                    }
                    try {
                        hog1Var.a("FCM_CLIENT_EVENT_LOGGING", new bbx("proto"), new czh0((byte) 24)).b(r09.a(new e9j0(new d9j0(j > 0 ? j : 0L, str5, str4, b9j0Var, c9j0.ANDROID, packageName, str7, i, str6, a9j0.MESSAGE_DELIVERED, str8, str9))));
                        break;
                    } catch (RuntimeException unused6) {
                    }
                    break;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    extras2 = new Bundle();
                }
                extras2.remove("androidx.content.wakelockid");
                if (swm0.t(extras2)) {
                    swm0 swm0Var = new swm0(extras2);
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new pkn0("Firebase-Messaging-Network-Io"));
                    try {
                        if (new uo5(this, swm0Var, executorServiceNewSingleThreadExecutor).G()) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            return;
                        } else {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            if (fc11.g0(intent)) {
                                fc11.S(intent.getExtras(), "_nf");
                            }
                        }
                    } catch (Throwable th) {
                        executorServiceNewSingleThreadExecutor.shutdown();
                        throw th;
                    }
                }
                c(new f321(extras2));
                return;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra3 = intent.getStringExtra("error");
                new SendException(stringExtra3);
                if (stringExtra3 == null) {
                    return;
                }
                stringExtra3.toLowerCase(Locale.US).getClass();
                return;
            case "send_event":
                intent.getStringExtra("google.message_id");
                return;
            default:
                return;
        }
    }

    public void d(String str) {
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        ivl1 ivl1Var;
        Log.isLoggable("EnhancedIntentService", 3);
        ivl1Var = this.b;
        if (ivl1Var == null) {
            ivl1Var = new ivl1(new efr(this, (byte) 24));
            this.b = ivl1Var;
        }
        return ivl1Var;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) u961.w().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        bsd1 bsd1Var = new bsd1();
        this.a.execute(new c45(this, intent2, bsd1Var, (byte) 17));
        hfp1 hfp1Var = bsd1Var.a;
        if (hfp1Var.i()) {
            a(intent);
            return 2;
        }
        hfp1Var.l(new l5o(), new uk4(this, intent, (byte) 22));
        return 3;
    }

    public void c(f321 f321Var) {
    }
}
