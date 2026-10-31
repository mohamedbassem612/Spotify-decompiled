package com.spotify.coremediarenderer.bridge;

import android.view.Surface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.otg;
import p.smo1;
import p.stg;
import p.tsg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJP\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0082 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003R$\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/spotify/coremediarenderer/bridge/CmrBridge;", "Lcom/spotify/coremediarenderer/bridge/NativeCmrBridge;", "<init>", "()V", "Lp/rih1;", "destroy", "", "playbackId", "", "width", "height", "nativeSetMaxVideoResolution", "(Ljava/lang/String;JJ)V", "nativeForgetVideoQualityPlayback", "(Ljava/lang/String;)V", "Lcom/spotify/coremediarenderer/bridge/CmrVideoQualityCallback;", "listener", "nativeSetVideoQualityListener", "(Lcom/spotify/coremediarenderer/bridge/CmrVideoQualityCallback;)V", "Lcom/spotify/coremediarenderer/bridge/PlaybackRegistrationListener;", "nativeSetPlaybackRegistrationListener", "(Lcom/spotify/coremediarenderer/bridge/PlaybackRegistrationListener;)V", "mediaUrl", "trackUri", "trackUid", "sessionId", "Landroid/view/Surface;", "surface", "nativeSetRenderTarget", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/Surface;)V", "", "", "deviceScale", "nativeSetPlayerSurfaceSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIF)V", "close", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_coremediarenderer_bridge-bridge"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CmrBridge implements NativeCmrBridge {
    public final otg a = new otg(this);
    private long nThis;

    private CmrBridge() {
    }

    private final native void destroy();

    private final native void nativeForgetVideoQualityPlayback(String playbackId);

    private final native void nativeSetMaxVideoResolution(String playbackId, long width, long height);

    private final native void nativeSetPlaybackRegistrationListener(PlaybackRegistrationListener listener);

    private final native void nativeSetPlayerSurfaceSize(String playbackId, String mediaUrl, String trackUri, String trackUid, String sessionId, int width, int height, float deviceScale);

    private final native void nativeSetRenderTarget(String playbackId, String mediaUrl, String trackUri, String trackUid, String sessionId, Surface surface);

    private final native void nativeSetVideoQualityListener(CmrVideoQualityCallback listener);

    public final synchronized void a(String str) {
        if (this.nThis != 0) {
            nativeForgetVideoQualityPlayback(str);
        }
    }

    public final synchronized void c(String str, stg stgVar) throws Throwable {
        Throwable th;
        CmrBridge cmrBridge;
        long j;
        try {
            try {
                if (this.nThis != 0) {
                    if (stgVar != null) {
                        try {
                            j = stgVar.a;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        j = -1;
                    }
                    cmrBridge = this;
                    cmrBridge.nativeSetMaxVideoResolution(str, j, stgVar != null ? stgVar.b : -1L);
                } else {
                    cmrBridge = this;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        otg otgVar = this.a;
        CmrVideoQualityCallback cmrVideoQualityCallback = otgVar.b;
        if (cmrVideoQualityCallback != null) {
            smo1.p(cmrVideoQualityCallback.c, (CancellationException) null);
        }
        otgVar.b = null;
        otgVar.c.l((Object) null);
        if (this.nThis != 0) {
            destroy();
        }
    }

    public final synchronized void d(tsg tsgVar) {
        if (this.nThis != 0) {
            nativeSetPlaybackRegistrationListener(tsgVar);
        }
    }

    public final synchronized void e(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        if (this.nThis != 0) {
            nativeSetPlayerSurfaceSize(str, str2, str3, str4, str5, i, i2, 1.0f);
        }
    }

    public final synchronized void f(String str, String str2, String str3, String str4, String str5, Surface surface) {
        if (this.nThis != 0) {
            nativeSetRenderTarget(str, str2, str3, str4, str5, surface);
        }
    }

    public final synchronized void g(CmrVideoQualityCallback cmrVideoQualityCallback) {
        if (this.nThis != 0) {
            nativeSetVideoQualityListener(cmrVideoQualityCallback);
        }
    }

    public final long getNThis() {
        return this.nThis;
    }
}
