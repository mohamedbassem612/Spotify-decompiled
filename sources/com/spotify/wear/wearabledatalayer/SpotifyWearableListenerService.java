package com.spotify.wear.wearabledatalayer;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.util.Log;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p.bsd1;
import p.faa0;
import p.flo1;
import p.fn31;
import p.guo1;
import p.hfp1;
import p.iu30;
import p.ix7;
import p.j0d1;
import p.j1e1;
import p.jzq;
import p.k7b1;
import p.kim1;
import p.kzq;
import p.l5b1;
import p.lfe;
import p.llm;
import p.lnm;
import p.m210;
import p.n3t;
import p.nfa0;
import p.ntn1;
import p.nwq;
import p.o8n;
import p.oo70;
import p.p651;
import p.pgn1;
import p.q8n;
import p.rc11;
import p.s9u0;
import p.smo1;
import p.spn1;
import p.szc0;
import p.tgg;
import p.u890;
import p.v9u0;
import p.xab1;
import p.ydp1;
import p.zyq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000:\u0001\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/spotify/wear/wearabledatalayer/SpotifyWearableListenerService;", "<init>", "()V", "p/crn1", "src_main_java_com_spotify_ubi_model-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpotifyWearableListenerService extends Service implements nwq, lfe {
    public static final String S0;
    public static final m210 T0;
    public q8n N0;
    public nfa0 O0;
    public llm P0;
    public faa0 R0;
    public szc0 X;
    public n3t Y;
    public oo70 Z;
    public ComponentName a;
    public ydp1 b;
    public pgn1 c;
    public Intent d;
    public HandlerThread e;
    public boolean g;
    public ix7 i;
    public v9u0 t;
    public final Object f = new Object();
    public final spn1 h = new spn1(new kim1(this));
    public final AtomicInteger Q0 = new AtomicInteger(0);

    static {
        String strO = rc11.a.b(SpotifyWearableListenerService.class).o();
        strO.getClass();
        S0 = strO;
        T0 = new m210(1502, "wear_os", (String) null, (String) null, (String) null, "wearable", (String) null, (String) null, (String) null, "wear_data_layer", (String) null);
    }

    public final nfa0 f() {
        nfa0 nfa0Var = this.O0;
        if (nfa0Var != null) {
            return nfa0Var;
        }
        u890.C("json");
        throw null;
    }

    public final s9u0 g() {
        v9u0 v9u0Var = this.t;
        if (v9u0Var != null) {
            return v9u0Var;
        }
        u890.C("playerController");
        throw null;
    }

    public final hfp1 h(iu30 iu30Var, l5b1 l5b1Var, iu30 iu30Var2) {
        bsd1 bsd1Var = new bsd1();
        if (this.Q0.getAndIncrement() == 0) {
            try {
                startService(new Intent(this, (Class<?>) SpotifyWearableListenerService.class));
            } catch (Exception e) {
                Logger.e(e, "Could not start service", new Object[0]);
            }
        }
        llm llmVar = this.P0;
        if (llmVar == null) {
            u890.C("serviceScope");
            throw null;
        }
        xab1 xab1VarT = fn31.T(llmVar, (o8n) null, 0, new p651(iu30Var, bsd1Var, this, iu30Var2, (lnm) null, (byte) 21), 3);
        if (l5b1Var != null) {
            l5b1Var.invoke(xab1VarT);
        }
        return bsd1Var.a;
    }

    public final hfp1 i(iu30 iu30Var) {
        faa0 faa0Var = this.R0;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        return h(new k7b1(1, kzq.Companion, jzq.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/DataLayerResponse;", 0, (byte) 2), new l5b1(this, (byte) 1), new tgg(this, iu30Var, (lnm) null, (byte) 3));
    }

    public final void j() {
        super.onCreate();
        this.a = new ComponentName(this, SpotifyWearableListenerService.class.getName());
        if (Log.isLoggable("WearableLS", 3)) {
            "onCreate: ".concat(String.valueOf(this.a));
        }
        HandlerThread handlerThread = this.e;
        if (handlerThread == null) {
            handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.e = handlerThread;
        }
        this.b = new ydp1(this, handlerThread.getLooper());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new pgn1(this);
    }

    public final void k() {
        if (Log.isLoggable("WearableLS", 3)) {
            "onDestroy: ".concat(String.valueOf(this.a));
        }
        synchronized (this.f) {
            this.g = true;
            ydp1 ydp1Var = this.b;
            if (ydp1Var == null) {
                String strValueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            SpotifyWearableListenerService spotifyWearableListenerService = ydp1Var.c;
            HandlerThread handlerThread = spotifyWearableListenerService.e;
            if (handlerThread == null) {
                ydp1Var.getLooper().quit();
            } else {
                handlerThread.quitSafely();
                try {
                    spotifyWearableListenerService.e.join();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                spotifyWearableListenerService.e = null;
            }
            ydp1Var.a("quit");
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.NODE_MIGRATED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return r2.c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            goto L6b
        L4:
            java.lang.String r0 = r3.getAction()
            if (r0 == 0) goto L6b
            int r1 = r0.hashCode()
            switch(r1) {
                case -1487371046: goto L48;
                case -1140095138: goto L3f;
                case -786751258: goto L36;
                case 705066793: goto L2d;
                case 915816236: goto L24;
                case 1003809169: goto L1b;
                case 1460975593: goto L12;
                default: goto L11;
            }
        L11:
            goto L53
        L12:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L1b:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L24:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L2d:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L36:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L3f:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            goto L50
        L48:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
        L50:
            p.pgn1 r2 = r2.c
            return r2
        L53:
            java.lang.String r2 = "WearableLS"
            r0 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            if (r2 == 0) goto L6b
            java.lang.String r2 = r3.toString()
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 46
            r3.<init>(r2)
        L6b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public final void onCreate() {
        j1e1.r(this);
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.N0;
        if (q8nVar == null) {
            u890.C("ioDispatcher");
            throw null;
        }
        this.P0 = smo1.e(flo1.l(j0d1VarB, q8nVar));
        j();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        llm llmVar = this.P0;
        if (llmVar == null) {
            u890.C("serviceScope");
            throw null;
        }
        smo1.p(llmVar, (CancellationException) null);
        k();
    }

    public final void a(ntn1 ntn1Var) {
    }

    public final void b(zyq zyqVar) {
    }

    public final void c(ntn1 ntn1Var) {
    }

    public final void d(ntn1 ntn1Var) {
    }

    public final void e(ntn1 ntn1Var) {
    }
}
