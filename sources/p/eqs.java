package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ContentSettingUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ContentSettings;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldValue;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eqs {
    public final z3u0 a;

    public eqs(z3u0 z3u0Var) {
        this.a = z3u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, onm onmVar) throws Throwable {
        cqs cqsVar;
        Boolean m231Var;
        if (onmVar instanceof cqs) {
            cqsVar = (cqs) onmVar;
            int i = cqsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqsVar.d = i - Integer.MIN_VALUE;
            } else {
                cqsVar = new cqs(this, onmVar);
            }
        } else {
            cqsVar = new cqs(this, onmVar);
        }
        Object objA = cqsVar.b;
        int i2 = cqsVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                g4u0 g4u0VarQ = PlaybackSettingsEsperantoService.GetSettingsRequest.q();
                g4u0VarQ.r(c4u0.t);
                g4u0VarQ.q(str);
                PlaybackSettingsEsperantoService.GetSettingsRequest getSettingsRequestBuild = g4u0VarQ.build();
                z3u0 z3u0Var = this.a;
                getSettingsRequestBuild.getClass();
                cqsVar.a = str;
                cqsVar.d = 1;
                objA = z3u0Var.a(getSettingsRequestBuild, cqsVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = cqsVar.a;
                hm5.M(objA);
            }
            PlaybackSettingsEsperantoService$ContentSettings playbackSettingsEsperantoService$ContentSettings = (PlaybackSettingsEsperantoService$ContentSettings) ((PlaybackSettingsEsperantoService.GetSettingsResponse) objA).o().get(str);
            m231Var = Boolean.valueOf(playbackSettingsEsperantoService$ContentSettings != null ? playbackSettingsEsperantoService$ContentSettings.o() : false);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
        }
        throw thA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, boolean z) {
        dqs dqsVar;
        rih1 m231Var;
        if (onmVar instanceof dqs) {
            dqsVar = (dqs) onmVar;
            int i = dqsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqsVar.c = i - Integer.MIN_VALUE;
            } else {
                dqsVar = new dqs(this, onmVar);
            }
        } else {
            dqsVar = new dqs(this, onmVar);
        }
        Object obj = dqsVar.a;
        int i2 = dqsVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                z3u0 z3u0Var = this.a;
                j4u0 j4u0VarQ = PlaybackSettingsEsperantoService$SetSettingsRequest.q();
                a4u0 a4u0VarO = PlaybackSettingsEsperantoService$ContentSettingUpdate.o();
                a4u0VarO.q(str);
                d4u0 d4u0VarN = PlaybackSettingsEsperantoService$FieldUpdate.n();
                d4u0VarN.n(c4u0.t);
                e4u0 e4u0VarN = PlaybackSettingsEsperantoService$FieldValue.n();
                e4u0VarN.n(z);
                d4u0VarN.q((PlaybackSettingsEsperantoService$FieldValue) e4u0VarN.build());
                a4u0VarO.n((PlaybackSettingsEsperantoService$FieldUpdate) d4u0VarN.build());
                j4u0VarQ.q((PlaybackSettingsEsperantoService$ContentSettingUpdate) a4u0VarO.build());
                PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest = (PlaybackSettingsEsperantoService$SetSettingsRequest) j4u0VarQ.build();
                dqsVar.c = 1;
                Object objB = z3u0Var.b(playbackSettingsEsperantoService$SetSettingsRequest, dqsVar);
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
            m231Var = rih1.a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return m231Var;
        }
        throw thA;
    }
}
