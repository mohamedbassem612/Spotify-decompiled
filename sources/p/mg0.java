package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ mg0(Context context, String str, long j) {
        this.a = (byte) 0;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t01 t01Var;
        int i = 60;
        switch (this.a) {
            case 0:
                long j = this.b;
                String str = this.c;
                t01 t01Var2 = og0.f;
                Long l = t01Var2 != null ? (Long) t01Var2.c : null;
                if (og0.f == null) {
                    og0.f = new t01(Long.valueOf(j), null);
                    vf61.a(str, og0.h);
                } else if (l != null) {
                    long jLongValue = j - l.longValue();
                    ScheduledExecutorService scheduledExecutorService = og0.a;
                    c120 c120VarB = g120.b(wf10.b());
                    if (jLongValue > (c120VarB != null ? c120VarB.b : 60) * 1000) {
                        vf61.c(str, og0.f, og0.h);
                        vf61.a(str, og0.h);
                        og0.f = new t01(Long.valueOf(j), null);
                    } else if (jLongValue > 1000 && (t01Var = og0.f) != null) {
                        t01Var.a++;
                    }
                }
                t01 t01Var3 = og0.f;
                if (t01Var3 != null) {
                    t01Var3.c = Long.valueOf(j);
                }
                t01 t01Var4 = og0.f;
                if (t01Var4 != null) {
                    t01Var4.I();
                    return;
                }
                return;
            case 1:
                long j2 = this.b;
                String str2 = this.c;
                if (og0.f == null) {
                    og0.f = new t01(Long.valueOf(j2), null);
                }
                t01 t01Var5 = og0.f;
                if (t01Var5 != null) {
                    t01Var5.c = Long.valueOf(j2);
                }
                if (og0.e.get() <= 0) {
                    mg0 mg0Var = new mg0((byte) 2, j2, str2);
                    synchronized (og0.d) {
                        ScheduledExecutorService scheduledExecutorService2 = og0.a;
                        c120 c120VarB2 = g120.b(wf10.b());
                        if (c120VarB2 != null) {
                            i = c120VarB2.b;
                        }
                        og0.c = scheduledExecutorService2.schedule(mg0Var, i, TimeUnit.SECONDS);
                    }
                }
                long j3 = og0.i;
                long j4 = j3 > 0 ? (j2 - j3) / 1000 : 0L;
                ouz ouzVar = m69.a;
                Context contextA = wf10.a();
                c120 c120VarK = g120.k(wf10.b(), false);
                if (c120VarK != null && c120VarK.d && j4 > 0) {
                    rm5 rm5Var = new rm5(contextA, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str2);
                    double d = j4;
                    if (wgi1.c() && !dhn.a.contains(rm5Var)) {
                        try {
                            rm5.A(rm5Var, "fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, og0.b());
                        } catch (Throwable th) {
                            dhn.a(rm5Var, th);
                        }
                    }
                    break;
                }
                t01 t01Var6 = og0.f;
                if (t01Var6 != null) {
                    t01Var6.I();
                    return;
                }
                return;
            default:
                long j5 = this.b;
                String str3 = this.c;
                if (og0.f == null) {
                    og0.f = new t01(Long.valueOf(j5), null);
                }
                if (og0.e.get() <= 0) {
                    vf61.c(str3, og0.f, og0.h);
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(wf10.a()).edit();
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(wf10.a()).edit();
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    editorEdit2.apply();
                    og0.f = null;
                }
                synchronized (og0.d) {
                    og0.c = null;
                }
                return;
        }
    }

    public /* synthetic */ mg0(byte b, long j, String str) {
        this.a = b;
        this.b = j;
        this.c = str;
    }
}
