package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import p.bhn0;
import p.djn;
import p.dqo;
import p.e0i;
import p.jhn;
import p.mhn;
import p.o0c;
import p.ohn;
import p.wi20;
import p.ws10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseCrashlytics {
    public final ohn a;

    public FirebaseCrashlytics(ohn ohnVar) {
        this.a = ohnVar;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) wi20.c().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        bhn0.i("FirebaseCrashlytics component is not present.");
        return null;
    }

    public Task checkForUnsentReports() {
        jhn jhnVar = this.a.h;
        if (jhnVar.r.compareAndSet(false, true)) {
            return jhnVar.o.a;
        }
        ws10.Z.j();
        return o0c.z(Boolean.FALSE);
    }

    public void deleteUnsentReports() {
        this.a.h.f54p.d(Boolean.FALSE);
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.g;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.a.b.f();
    }

    public void log(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ohn ohnVar = this.a;
        ((djn) ohnVar.f84p.b).a(new mhn(ohnVar, jCurrentTimeMillis - ohnVar.d, str, (byte) 0));
    }

    public void recordException(Throwable th) {
        if (th == null) {
            ws10.Z.j();
        } else {
            ohn ohnVar = this.a;
            ((djn) ohnVar.f84p.b).a(new e0i(ohnVar, th, (byte) 6));
        }
    }

    public void sendUnsentReports() {
        this.a.h.f54p.d(Boolean.TRUE);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.b.h(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, boolean z) {
        this.a.d(str, Boolean.toString(z));
    }

    public void setCustomKeys(dqo dqoVar) {
        HashMap map = dqoVar.a;
        if (map.isEmpty()) {
            return;
        }
        ohn ohnVar = this.a;
        ((djn) ohnVar.f84p.b).a(new e0i(ohnVar, map, (byte) 8));
    }

    public void setUserId(String str) {
        ohn ohnVar = this.a;
        ((djn) ohnVar.f84p.b).a(new e0i(ohnVar, str, (byte) 7));
    }

    public void setCustomKey(String str, double d) {
        this.a.d(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.a.d(str, Float.toString(f));
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.a.b.h(bool);
    }

    public void setCustomKey(String str, int i) {
        this.a.d(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.a.d(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.a.d(str, str2);
    }
}
