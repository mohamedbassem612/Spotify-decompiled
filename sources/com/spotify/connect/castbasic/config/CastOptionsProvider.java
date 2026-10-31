package com.spotify.connect.castbasic.config;

import android.content.Context;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.List;
import kotlin.Metadata;
import p.av21;
import p.g3e;
import p.il00;
import p.iuq0;
import p.jch0;
import p.lls0;
import p.o3e;
import p.o4b1;
import p.p3e;
import p.ppn1;
import p.q2e;
import p.t2b1;
import p.u2b1;
import p.ynb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/spotify/connect/castbasic/config/CastOptionsProvider;", "<init>", "()V", "Lp/q2e;", "applicationId", "", "relaunchIfRunning", "castConnectEnabled", "outputSwitcherEnabled", "Lp/u2b1;", "getNewOutputSwitcherCastOptions", "(Lp/q2e;ZZZ)Lp/u2b1;", "Landroid/content/Context;", "context", "Lp/p3e;", "getCastOptions", "(Landroid/content/Context;)Lp/p3e;", "", "Lp/ppn1;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "Lp/g3e;", "state", "getSpotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic", "(Lp/g3e;Lp/q2e;Z)Lp/u2b1;", "getSpotifyCastOptions", "getOldOutputSwitcherCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic", "getOldOutputSwitcherCastOptions", "src_main_java_com_spotify_connect_castbasic-castbasic"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CastOptionsProvider {
    private final u2b1 getNewOutputSwitcherCastOptions(q2e applicationId, boolean relaunchIfRunning, boolean castConnectEnabled, boolean outputSwitcherEnabled) {
        return new u2b1(new t2b1(), false, false, applicationId.a, new o4b1(relaunchIfRunning, castConnectEnabled), outputSwitcherEnabled, outputSwitcherEnabled);
    }

    public static /* synthetic */ u2b1 getSpotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic$default(CastOptionsProvider castOptionsProvider, g3e g3eVar, q2e q2eVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            q2eVar = q2e.PRODUCTION;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return castOptionsProvider.getSpotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic(g3eVar, q2eVar, z);
    }

    public List<ppn1> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public p3e getCastOptions(Context context) {
        ynb0 ynb0Var = jch0.a;
        av21 av21Var = new av21(ynb0Var != null ? (g3e) ynb0Var.get() : null, jch0.b);
        u2b1 spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic = getSpotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic(av21Var.b(), av21Var.a(), true);
        spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.getClass();
        o3e o3eVar = new o3e();
        lls0 lls0Var = new lls0((byte) 10);
        lls0Var.x();
        lls0Var.y();
        o3eVar.b(lls0Var.i());
        o3eVar.h(spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.b);
        o3eVar.c(spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.c);
        o3eVar.f(spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.d);
        il00 il00Var = new il00((byte) 20);
        o4b1 o4b1Var = spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.e;
        il00Var.n(o4b1Var.a);
        il00Var.k(o4b1Var.b);
        o3eVar.d(il00Var.i());
        o3eVar.g(spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.f);
        o3eVar.i(spotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic.g);
        o3eVar.e();
        return o3eVar.a();
    }

    public final u2b1 getOldOutputSwitcherCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic(q2e applicationId, boolean relaunchIfRunning, boolean castConnectEnabled, boolean outputSwitcherEnabled) {
        return new u2b1(new t2b1(), true, true, applicationId.a, new o4b1(relaunchIfRunning, castConnectEnabled), outputSwitcherEnabled, outputSwitcherEnabled);
    }

    public final u2b1 getSpotifyCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic(g3e state, q2e applicationId, boolean relaunchIfRunning) {
        boolean zB = state != null ? ((iuq0) state).b() : false;
        return state != null ? ((iuq0) state).c() : false ? getNewOutputSwitcherCastOptions(applicationId, relaunchIfRunning, zB, zB) : getOldOutputSwitcherCastOptions$src_main_java_com_spotify_connect_castbasic_castbasic(applicationId, relaunchIfRunning, zB, zB);
    }
}
