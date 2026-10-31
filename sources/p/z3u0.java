package p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z3u0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PlaybackSettingsEsperantoService.GetSettingsRequest getSettingsRequest, onm onmVar) {
        w3u0 w3u0Var;
        if (onmVar instanceof w3u0) {
            w3u0Var = (w3u0) onmVar;
            int i = w3u0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w3u0Var.c = i - Integer.MIN_VALUE;
            } else {
                w3u0Var = new w3u0(this, onmVar);
            }
        } else {
            w3u0Var = new w3u0(this, onmVar);
        }
        Object objCallSingle = w3u0Var.a;
        int i2 = w3u0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            w3u0Var.c = 1;
            objCallSingle = callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetSettings", getSettingsRequest, w3u0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaybackSettingsEsperantoService.GetSettingsResponse.r(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.GetSettingsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, onm onmVar) {
        x3u0 x3u0Var;
        if (onmVar instanceof x3u0) {
            x3u0Var = (x3u0) onmVar;
            int i = x3u0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x3u0Var.c = i - Integer.MIN_VALUE;
            } else {
                x3u0Var = new x3u0(this, onmVar);
            }
        } else {
            x3u0Var = new x3u0(this, onmVar);
        }
        Object objCallSingle = x3u0Var.a;
        int i2 = x3u0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            x3u0Var.c = 1;
            objCallSingle = callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", playbackSettingsEsperantoService$SetSettingsRequest, x3u0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
