package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Random;
import p.cvn1;
import p.drn1;
import p.fzn1;
import p.g5o1;
import p.kvn1;
import p.lzn1;
import p.np5;
import p.q9w;
import p.u0o1;
import p.u6o1;
import p.v4o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppMeasurementSdk {
    public final u6o1 a;

    public AppMeasurementSdk(u6o1 u6o1Var) {
        this.a = u6o1Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return u6o1.c(context, null).b;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IInterface, java.lang.Object, p.g5o1] */
    public final void a(np5 np5Var) {
        u6o1 u6o1Var = this.a;
        ArrayList arrayList = u6o1Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (np5Var.equals(((Pair) arrayList.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ?? g5o1Var = new g5o1(np5Var);
            arrayList.add(new Pair(np5Var, g5o1Var));
            if (u6o1Var.f != null) {
                try {
                    kvn1 kvn1Var = (kvn1) u6o1Var.f;
                    Parcel parcelS = kvn1Var.s();
                    drn1.b(parcelS, g5o1Var);
                    kvn1Var.B0(35, parcelS);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            u6o1Var.a(new lzn1(u6o1Var, (g5o1) g5o1Var));
        }
    }

    public void beginAdUnitExposure(String str) {
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new fzn1(u6o1Var, str, (byte) 1));
    }

    public void endAdUnitExposure(String str) {
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new fzn1(u6o1Var, str, (byte) 2));
    }

    public long generateEventId() {
        cvn1 cvn1Var = new cvn1();
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new u0o1(u6o1Var, cvn1Var, (byte) 2));
        Long lC1 = cvn1Var.c1();
        if (lC1 != null) {
            return lC1.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ q9w.b()).nextLong();
        int i = u6o1Var.d + 1;
        u6o1Var.d = i;
        return jNextLong + ((long) i);
    }

    public String getAppInstanceId() {
        cvn1 cvn1Var = new cvn1();
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new u0o1(u6o1Var, cvn1Var, (byte) 1));
        return cvn1Var.b1(50L);
    }

    public String getGmpAppId() {
        cvn1 cvn1Var = new cvn1();
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new u0o1(u6o1Var, cvn1Var, (byte) 0));
        return cvn1Var.b1(500L);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        u6o1 u6o1Var = this.a;
        u6o1Var.a(new v4o1(u6o1Var, str, str2, bundle, true));
    }
}
