package p;

import com.spotify.hovercraftasr.v1.AsrStreamRequest;
import com.spotify.hovercraftasr.v1.a;
import com.spotify.hovercraftasr.v1.b;
import com.spotify.hovercraftasr.v1.d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ev81 implements av81 {
    public final String a;
    public final azp0 b;
    public final czp0 c;
    public final bz81 d;
    public final t8r0 e;
    public ig01 f;
    public AsrStreamRequest.InteractionManagerParams g;

    public ev81(String str, azp0 azp0Var, czp0 czp0Var, bz81 bz81Var, t8r0 t8r0Var) {
        this.a = str;
        this.b = azp0Var;
        this.c = czp0Var;
        this.d = bz81Var;
        this.e = t8r0Var;
    }

    public final a b() {
        d dVarN = AsrStreamRequest.PartialTranscriptOptions.n();
        dVarN.n();
        AsrStreamRequest.PartialTranscriptOptions partialTranscriptOptionsBuild = dVarN.build();
        b bVarN = AsrStreamRequest.EndSpeechDetectionOptions.n();
        bVarN.n();
        AsrStreamRequest.EndSpeechDetectionOptions endSpeechDetectionOptionsBuild = bVarN.build();
        a aVarN = AsrStreamRequest.n();
        aVarN.q();
        aVarN.u(partialTranscriptOptionsBuild);
        aVarN.s(endSpeechDetectionOptionsBuild);
        AsrStreamRequest.InteractionManagerParams interactionManagerParams = this.g;
        if (interactionManagerParams != null) {
            aVarN.t(interactionManagerParams);
        }
        return aVarN;
    }
}
