package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r4u0 implements f961 {
    public final z3u0 a;

    public r4u0(z3u0 z3u0Var) {
        this.a = z3u0Var;
    }

    public final Object a(String str, c4u0[] c4u0VarArr, a8d1 a8d1Var) {
        g4u0 g4u0VarQ = PlaybackSettingsEsperantoService.GetSettingsRequest.q();
        g4u0VarQ.n(f46.Q0(c4u0VarArr));
        g4u0VarQ.s(false);
        g4u0VarQ.q(str);
        return this.a.a(g4u0VarQ.build(), a8d1Var);
    }

    public final php0 b(c4u0... c4u0VarArr) {
        m4u0 m4u0VarP = PlaybackSettingsEsperantoService.StreamSettingChangesRequest.p();
        m4u0VarP.n(f46.Q0(c4u0VarArr));
        return new php0(this.a.callStream("spotify.playback_settings.esperanto.proto.PlaybackSettings", "StreamSettingChanges", m4u0VarP.build()), (byte) 23);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, onm onmVar) {
        q4u0 q4u0Var;
        if (onmVar instanceof q4u0) {
            q4u0Var = (q4u0) onmVar;
            int i = q4u0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4u0Var.c = i - Integer.MIN_VALUE;
            } else {
                q4u0Var = new q4u0(this, onmVar);
            }
        } else {
            q4u0Var = new q4u0(this, onmVar);
        }
        Object obj = q4u0Var.a;
        int i2 = q4u0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            q4u0Var.c = 1;
            Object objB = this.a.b(playbackSettingsEsperantoService$SetSettingsRequest, q4u0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
