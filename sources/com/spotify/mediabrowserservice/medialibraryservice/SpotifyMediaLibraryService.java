package com.spotify.mediabrowserservice.medialibraryservice;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.c1i0;
import p.c681;
import p.d06;
import p.d1i0;
import p.d6b1;
import p.e06;
import p.em61;
import p.f280;
import p.fc11;
import p.gga1;
import p.hs41;
import p.idd1;
import p.iph0;
import p.iv81;
import p.ixh0;
import p.j1e1;
import p.jly0;
import p.kph0;
import p.m551;
import p.mqn1;
import p.n57;
import p.n5b1;
import p.n8d0;
import p.ny51;
import p.o5b1;
import p.oo70;
import p.oqh0;
import p.pno1;
import p.q1m;
import p.qm71;
import p.s7c0;
import p.u890;
import p.v8l;
import p.vsr0;
import p.whh0;
import p.wo70;
import p.x74;
import p.xph0;
import p.yi5;
import p.yoh0;
import p.yph0;
import p.zph0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/mediabrowserservice/medialibraryservice/SpotifyMediaLibraryService;", "Lp/o5b1;", "Lp/xph0;", "<init>", "()V", "src_main_java_com_spotify_mediabrowserservice_medialibraryservice-medialibraryservice"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class SpotifyMediaLibraryService extends d1i0 implements o5b1, xph0 {
    public hs41 N0;
    public v8l O0;
    public n5b1 P0;
    public final idd1 Q0 = new idd1(new gga1(this, (byte) 10));
    public oo70 X;
    public jly0 Y;
    public zph0 Z;
    public c681 t;

    @Override // p.xph0
    public final void a(kph0 kph0Var, String str) {
        s(kph0Var, "Getting onUnsubscribe from unknown MediaLibrarySession");
        n5b1 n5b1Var = this.P0;
        if (n5b1Var != null) {
            n5b1Var.m(new vsr0(str));
        } else {
            u890.C("serviceHandler");
            throw null;
        }
    }

    @Override // p.xph0
    public final n8d0 b(kph0 kph0Var, ixh0 ixh0Var, String str, iph0 iph0Var) {
        if (this.O0 == null) {
            u890.C("packageNameResolver");
            throw null;
        }
        String strA = v8l.a(ixh0Var);
        hs41 hs41Var = this.N0;
        if (hs41Var == null) {
            u890.C("searchLatencyMeasurementFactory");
            throw null;
        }
        q1m q1mVarA = hs41Var.a();
        q1mVarA.d(2, strA);
        s(kph0Var, "Getting onGetSearchResult from unknown MediaLibrarySession");
        em61 em61VarY = em61.y();
        n5b1 n5b1Var = this.P0;
        if (n5b1Var != null) {
            n5b1Var.k(str, iph0Var != null ? iph0Var.a : new Bundle(), strA, q1mVarA, new ny51(q1mVarA, em61VarY, iph0Var, (byte) 20), new qm71(q1mVarA, em61VarY, iph0Var, (byte) 23), new m551(q1mVarA, em61VarY, iph0Var, (byte) 25));
            return em61VarY;
        }
        u890.C("serviceHandler");
        throw null;
    }

    @Override // p.o5b1
    public final void c(String str) {
        n5b1 n5b1Var = this.P0;
        if (n5b1Var == null) {
            u890.C("serviceHandler");
            throw null;
        }
        n5b1Var.j(new vsr0(str));
        g(str);
    }

    @Override // p.xph0
    public final f280 d(kph0 kph0Var, ixh0 ixh0Var, iph0 iph0Var) {
        s(kph0Var, "Getting onGetLibraryRoot from unknown MediaLibrarySession");
        if (this.O0 == null) {
            u890.C("packageNameResolver");
            throw null;
        }
        String strA = v8l.a(ixh0Var);
        Logger.b("MLS: onGetLibraryRoot: package=%s, isRecent=%s, isSuggested=%s", new Object[]{strA, iph0Var != null ? Boolean.valueOf(iph0Var.b) : null, iph0Var != null ? Boolean.valueOf(iph0Var.d) : null});
        n5b1 n5b1Var = this.P0;
        if (n5b1Var == null) {
            u890.C("serviceHandler");
            throw null;
        }
        whh0 whh0VarB = n5b1Var.b(strA, ixh0Var.d(), mqn1.d(iph0Var, ixh0Var.b()));
        yoh0 yoh0VarC = whh0VarB != null ? mqn1.c(whh0VarB) : null;
        if (yoh0VarC == null) {
            Logger.b("MLS: onGetLibraryRoot: returning PERMISSION_DENIED (no root)", new Object[0]);
            return fc11.J(s7c0.b(-4));
        }
        Logger.b("MLS: onGetLibraryRoot: returning rootId=%s", new Object[]{yoh0VarC.a});
        return fc11.J(s7c0.c(yoh0VarC, (iph0) null));
    }

    @Override // p.xph0
    public final n8d0 f(kph0 kph0Var, String str, iph0 iph0Var) {
        s(kph0Var, "Getting onGetChildren from unknown MediaLibrarySession");
        em61 em61VarY = em61.y();
        n5b1 n5b1Var = this.P0;
        if (n5b1Var != null) {
            n5b1Var.f(new vsr0(str), iph0Var != null ? iph0Var.a : new Bundle(), new iv81(em61VarY, iph0Var, (byte) 28));
            return em61VarY;
        }
        u890.C("serviceHandler");
        throw null;
    }

    @Override // p.o5b1
    public final void g(String str) {
        kph0 kph0VarT = t();
        if (kph0VarT != null) {
            kph0VarT.h(str);
        }
    }

    @Override // p.xph0
    public final void h(kph0 kph0Var, String str) {
        s(kph0Var, "Getting onSubscribe from unknown MediaLibrarySession");
        n5b1 n5b1Var = this.P0;
        if (n5b1Var != null) {
            n5b1Var.l(new vsr0(str));
        } else {
            u890.C("serviceHandler");
            throw null;
        }
    }

    public final kph0 n(ixh0 ixh0Var) {
        if (this.O0 == null) {
            u890.C("packageNameResolver");
            throw null;
        }
        String strA = v8l.a(ixh0Var);
        n5b1 n5b1Var = this.P0;
        if (n5b1Var == null) {
            u890.C("serviceHandler");
            throw null;
        }
        if (!n5b1Var.e(ixh0Var.d(), strA)) {
            Logger.k("MLS: onGetSession: rejecting connection from untrusted package %s", new Object[]{strA});
            return null;
        }
        n5b1 n5b1Var2 = this.P0;
        if (n5b1Var2 == null) {
            u890.C("serviceHandler");
            throw null;
        }
        n5b1Var2.g(ixh0Var.d(), strA);
        kph0 kph0VarT = t();
        Logger.b("MLS: onGetSession: returning session=%s for package=%s", new Object[]{kph0VarT != null ? Integer.valueOf(System.identityHashCode(kph0VarT)) : "null", strA});
        return kph0VarT;
    }

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        c1i0 c1i0Var = ((d1i0) this).d;
        c1i0Var.getClass();
        return c1i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        super.onCreate();
        j1e1.r(this);
        zph0 zph0Var = this.Z;
        if (zph0Var == null) {
            u890.C("callbackDelegateRegistry");
            throw null;
        }
        zph0Var.a.set(this);
        oo70 oo70Var = this.X;
        if (oo70Var == null) {
            u890.C("idleManager");
            throw null;
        }
        boolean z = d06.a == ((e06) ((wo70) oo70Var).b.getValue());
        c681 c681Var = this.t;
        if (c681Var == null) {
            u890.C("handlerFactory");
            throw null;
        }
        n5b1 n5b1VarS = c681Var.s(this, z ? yi5.b : yi5.d);
        this.P0 = n5b1VarS;
        Logger.b("MLS: SpotifyMediaLibraryService created with handler: %s", new Object[]{n5b1VarS});
    }

    public final void onDestroy() {
        zph0 zph0Var = this.Z;
        if (zph0Var == null) {
            u890.C("callbackDelegateRegistry");
            throw null;
        }
        zph0Var.a.set(new yph0());
        n5b1 n5b1Var = this.P0;
        if (n5b1Var == null) {
            u890.C("serviceHandler");
            throw null;
        }
        n5b1Var.i();
        Logger.b("MLS: SpotifyMediaLibraryService destroyed.", new Object[0]);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (u890.j(intent != null ? intent.getAction() : null, "android.intent.action.MEDIA_BUTTON")) {
            try {
                pno1.r(this, x74.k(this), Build.VERSION.SDK_INT >= 29 ? 2 : 0);
                pno1.s(this);
                Logger.b("MLS: SpotifyMediaLibraryService satisfied FGS contract transiently", new Object[0]);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.l(e, "MLS: failed to satisfy FGS contract on ACTION_MEDIA_BUTTON", new Object[0]);
            }
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    public final void s(kph0 kph0Var, String str) {
        kph0 kph0VarT = t();
        if (u890.j(kph0Var, kph0VarT)) {
            return;
        }
        Logger.b("MLS: session mismatch: %s (received=%s, current=%s)", new Object[]{str, Integer.valueOf(System.identityHashCode(kph0Var)), kph0VarT != null ? Integer.valueOf(System.identityHashCode(kph0VarT)) : "null"});
        n57.s(str);
    }

    public final kph0 t() {
        idd1 idd1Var = this.Q0;
        if (((d6b1) idd1Var.getValue()).a() instanceof oqh0) {
            kph0 kph0VarM = ((d6b1) idd1Var.getValue()).a().m();
            if (kph0VarM == null) {
                n57.s(SpotifyMediaLibraryService.class + "#onGetSession was called while SpotifyMediaLibraryService#mediaLibrarySession was null.");
            }
            return kph0VarM;
        }
        n57.s("MediaSessionWrapperProvider does not provide a MediaLibrarySessionWrapper. Expected: " + oqh0.class + ", Actual: " + ((d6b1) idd1Var.getValue()).a().getClass());
        return null;
    }
}
