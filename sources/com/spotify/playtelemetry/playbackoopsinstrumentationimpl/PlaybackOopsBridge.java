package com.spotify.playtelemetry.playbackoopsinstrumentationimpl;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.a2u0;
import p.b2u0;
import p.c2u0;
import p.e2u0;
import p.eg;
import p.g2p1;
import p.mtj0;
import p.mwt0;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J©\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001e¨\u0006 "}, d2 = {"Lcom/spotify/playtelemetry/playbackoopsinstrumentationimpl/PlaybackOopsBridge;", "", "<init>", "()V", "", "eventType", "onMismatch", "", "timestampNanos", "", "playbackId", "interactionId", "capturePoint", "contextUri", "contextType", "contentType", "clipUri", "audioFormat", "videoFormat", "playbackStack", "videoSurface", "appState", "error", "Lp/rih1;", "onPlaybackInstrumentationEvent", "(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lp/c2u0;", "instrumentation", "setInstrumentation", "(Lp/c2u0;)V", "Lp/c2u0;", "p/a2u0", "src_main_java_com_spotify_playtelemetry_playbackoopsinstrumentationimpl-playbackoopsinstrumentationimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class PlaybackOopsBridge {
    public static final PlaybackOopsBridge INSTANCE = new PlaybackOopsBridge();
    private static volatile c2u0 instrumentation;

    private PlaybackOopsBridge() {
    }

    public static final void onPlaybackInstrumentationEvent(int eventType, int onMismatch, long timestampNanos, String playbackId, String interactionId, String capturePoint, String contextUri, String contextType, String contentType, String clipUri, String audioFormat, String videoFormat, String playbackStack, String videoSurface, String appState, String error) {
        c2u0 c2u0Var = instrumentation;
        if (c2u0Var == null) {
            return;
        }
        long j = timestampNanos / 1000;
        t0z t0zVar = mtj0.c;
        mtj0 mtj0Var = (mtj0) ((onMismatch < 0 || onMismatch >= t0zVar.b()) ? mtj0.a : t0zVar.get(onMismatch));
        String str = capturePoint == null ? "unknown" : capturePoint;
        mwt0 mwt0Var = new mwt0(playbackId, interactionId, contextUri, clipUri, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, contextType, contentType, audioFormat, videoFormat, playbackStack, videoSurface, appState, 2032);
        LinkedHashMap linkedHashMap = a2u0.b;
        a2u0 a2u0VarF = g2p1.F(eventType);
        int i = a2u0VarF == null ? -1 : b2u0.a[a2u0VarF.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ((e2u0) c2u0Var).f(str, mwt0Var, mtj0Var, Long.valueOf(j));
                return;
            }
            if (i == 2) {
                ((e2u0) c2u0Var).e(j, mwt0Var);
                return;
            }
            if (i == 3) {
                ((e2u0) c2u0Var).d(error == null ? "" : error, mwt0Var);
                return;
            }
            if (i != 4) {
                eg.o();
                return;
            }
            e2u0 e2u0Var = (e2u0) c2u0Var;
            if (e2u0Var.c) {
                if (e2u0Var.b.d()) {
                    e2u0.c(e2u0Var, "cancelled", mwt0Var, null, null, 12);
                } else {
                    e2u0Var.b();
                }
            }
        }
    }

    public final synchronized void setInstrumentation(c2u0 instrumentation2) {
        instrumentation = instrumentation2;
    }
}
