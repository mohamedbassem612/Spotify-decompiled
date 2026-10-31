package com.spotify.notifications.notifications.firebaseservice;

import android.app.ActivityManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.spotify.base.java.logging.Logger;
import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;
import kotlin.Metadata;
import p.awl1;
import p.ciq0;
import p.cwq;
import p.ega0;
import p.f15;
import p.f321;
import p.fga0;
import p.j1e1;
import p.nfa0;
import p.qwl1;
import p.rp5;
import p.u890;
import p.vwl1;
import p.xxy0;
import p.y36;
import p.zg4;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/notifications/notifications/firebaseservice/SpotifyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "src_main_java_com_spotify_notifications_notifications_firebaseservice-firebaseservice"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpotifyFirebaseMessagingService extends FirebaseMessagingService {
    public xxy0 g;
    public zg4 h;
    public rp5 i;
    public nfa0 t;

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(f321 f321Var) {
        String str;
        char c = 0;
        if (f321Var.j().isEmpty()) {
            Logger.d("Received push notification with empty data", new Object[0]);
            return;
        }
        f321Var.j();
        y36 y36VarJ = f321Var.j();
        Bundle bundle = f321Var.a;
        String string = bundle.getString("google.delivered_priority");
        if (string != null) {
            if ("high".equals(string)) {
                c = 1;
            } else if ("normal".equals(string)) {
                c = 2;
            }
        } else if ("1".equals(bundle.getString("google.priority_reduced"))) {
            c = 2;
        } else {
            string = bundle.getString("google.priority");
            if ("high".equals(string)) {
                c = 1;
            } else if ("normal".equals(string)) {
                c = 2;
            }
        }
        y36 y36Var = y36VarJ;
        String str2 = (String) y36Var.get("type");
        if (u890.j(str2, "notification") || u890.j(str2, "silent_push")) {
            rp5 rp5Var = this.i;
            String strB = null;
            if (rp5Var == null) {
                u890.C("appProcessStateDetector");
                throw null;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance <= 100) {
                str = "Foreground";
            } else {
                str = f15.a(rp5Var.a) ? "Background" : "ColdStart";
            }
            zg4 zg4Var = this.h;
            if (zg4Var == null) {
                u890.C("properties");
                throw null;
            }
            String strConcat = "notification-handling-worker";
            if (zg4Var.c()) {
                String str3 = (String) y36Var.get("push_context");
                if (str3 != null) {
                    try {
                        nfa0 nfa0Var = this.t;
                        if (nfa0Var == null) {
                            u890.C("json");
                            throw null;
                        }
                        ega0 ega0Var = (ega0) fga0.l(nfa0Var.c(str3)).get("messageId");
                        if (ega0Var != null) {
                            strB = fga0.m(ega0Var).b();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (strB != null) {
                    strConcat = "notification-handling-worker-".concat(strB);
                }
            }
            ciq0 ciq0Var = new ciq0(NotificationHandlingQuasarWorker.class);
            if (c == 1) {
                vwl1 vwl1Var = ((qwl1) ciq0Var).c;
                vwl1Var.q = true;
                vwl1Var.r = 1;
            }
            cwq cwqVar = new cwq();
            cwqVar.d(y36VarJ);
            cwqVar.a.put("app_state", str);
            awl1.d(getApplicationContext()).c(strConcat, 4, ciq0Var.i(cwqVar.a()).b());
        }
    }

    public final void d(String str) {
        xxy0 xxy0Var = this.g;
        if (xxy0Var != null) {
            xxy0Var.b(2, str);
        } else {
            u890.C("pushTokenManager");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        j1e1.r(this);
        super/*android.app.Service*/.onCreate();
    }

    public final void onDestroy() {
        super.onDestroy();
        xxy0 xxy0Var = this.g;
        if (xxy0Var != null) {
            if (xxy0Var != null) {
                xxy0Var.a();
            } else {
                u890.C("pushTokenManager");
                throw null;
            }
        }
    }
}
