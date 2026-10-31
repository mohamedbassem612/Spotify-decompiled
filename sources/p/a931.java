package p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a931 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ProgressPlaybackEsperanto.OnUpdateRequest onUpdateRequest, onm onmVar) {
        z831 z831Var;
        if (onmVar instanceof z831) {
            z831Var = (z831) onmVar;
            int i = z831Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z831Var.c = i - Integer.MIN_VALUE;
            } else {
                z831Var = new z831(this, onmVar);
            }
        } else {
            z831Var = new z831(this, onmVar);
        }
        Object objCallSingle = z831Var.a;
        int i2 = z831Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            z831Var.c = 1;
            objCallSingle = callSingle("spotify.progress_playback_esperanto.proto.ResumptionProgressPlayback", "OnUpdate", onUpdateRequest, z831Var);
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
            return ProgressPlaybackEsperanto.OnUpdateResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto.OnUpdateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
