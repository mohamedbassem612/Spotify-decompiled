package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p.b8p1;
import p.cy30;
import p.fc11;
import p.hfp1;
import p.l2o1;
import p.nzo1;
import p.o0c;
import p.oj80;
import p.pkn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public final ExecutorService a;

    public FirebaseInstanceIdReceiver() {
        pkn0 pkn0Var = new pkn0("firebase-iid-executor");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), pkn0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static /* synthetic */ void a(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iC = intent2 != null ? c(intent2) : b(context, intent);
            if (z) {
                pendingResult.setResultCode(iC);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public static int b(Context context, Intent intent) {
        int i;
        hfp1 hfp1VarK;
        Bundle extras = intent.getExtras();
        int iIntValue = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
        if (extras == null) {
            return CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            hfp1VarK = o0c.z((Object) null);
        } else {
            Bundle bundleG = cy30.g("google.message_id", stringExtra);
            b8p1 b8p1VarE = b8p1.E(context);
            synchronized (b8p1VarE) {
                i = b8p1VarE.b;
                b8p1VarE.b = i + 1;
            }
            hfp1VarK = b8p1VarE.K(new nzo1(i, 2, bundleG));
        }
        try {
            iIntValue = ((Integer) o0c.g(new oj80(context).p(intent))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
        }
        try {
            o0c.h(hfp1VarK, 1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            new StringBuilder(String.valueOf(e).length() + 20);
        }
        return iIntValue;
    }

    public static int c(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            return CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
        }
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (!fc11.g0(intentPutExtras)) {
            return -1;
        }
        fc11.S(intentPutExtras.getExtras(), "_nd");
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        this.a.execute(new l2o1(this, intent, context, isOrderedBroadcast(), goAsync()));
    }
}
