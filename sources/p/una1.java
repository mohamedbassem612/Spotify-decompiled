package p;

import android.net.Uri;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class una1 extends onm {
    public t45 a;
    public VoiceAssistantLoggingContext b;
    public CommandPlayRequest c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vna1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public una1(vna1 vna1Var, onm onmVar) {
        super(onmVar);
        this.e = vna1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d((Uri) null, (String) null, (t45) null, (VoiceAssistantLoggingContext) null, this);
    }
}
