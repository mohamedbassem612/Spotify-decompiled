package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p.bhn0;
import p.gzn1;
import p.lj20;
import p.lyn1;
import p.mj20;
import p.o0c;
import p.u6o1;
import p.wi20;
import p.wto1;
import p.zod;
import p.zov0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final u6o1 a;

    public FirebaseAnalytics(u6o1 u6o1Var) {
        zod.s(u6o1Var);
        this.a = u6o1Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(u6o1.c(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static wto1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (u6o1.c(context, bundle) == null) {
            return null;
        }
        return new zov0((byte) 23);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = lj20.l;
            return (String) o0c.h(((lj20) wi20.c().b(mj20.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            bhn0.p(e);
            return null;
        } catch (ExecutionException e2) {
            bhn0.p(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        lyn1 lyn1VarJ = lyn1.j(activity);
        u6o1 u6o1Var = this.a;
        u6o1Var.getClass();
        u6o1Var.a(new gzn1(u6o1Var, lyn1VarJ, str, str2));
    }
}
