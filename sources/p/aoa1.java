package p;

import android.net.Uri;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aoa1 {
    public final qna1 a;
    public final bmk1 b;
    public final Scheduler c;
    public final dn81 d;
    public final dn81 e;
    public final HashMap f = new HashMap(3);

    public aoa1(qna1 qna1Var, bmk1 bmk1Var, Scheduler scheduler, dn81 dn81Var, dn81 dn81Var2) {
        this.a = qna1Var;
        this.b = bmk1Var;
        this.c = scheduler;
        this.d = dn81Var;
        this.e = dn81Var2;
    }

    public final CompletableResumeNext a(Uri uri, SearchEndpointRequest searchEndpointRequest, zle1 zle1Var, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        Single map;
        HashMap map2 = this.f;
        if (!map2.containsKey(uri)) {
            gyv0 gyv0Var = new gyv0();
            gyv0Var.a = false;
            gyv0Var.b = false;
            gyv0Var.c = null;
            map2.put(uri, gyv0Var);
        }
        if (don1.x(uri)) {
            t45Var.a(VoiceAssistantsPerformance.DIMENSION_NL_URI, "1");
            map = Single.just(new SpeakeasyDualResponse.CanPrepareResponse.ActionNlResponse(uri.toString()));
            map.getClass();
        } else {
            t45Var.a(VoiceAssistantsPerformance.DIMENSION_NL_URI, "0");
            map = this.a.b(searchEndpointRequest).compose(this.d).map(yna1.a);
        }
        return map.doOnSubscribe(new zna1(t45Var, (byte) 0)).flatMapCompletable(new bjx(this, uri, searchEndpointRequest, zle1Var, t45Var, voiceAssistantLoggingContext, (byte) 28)).n(this.c).p(new xna1(uri, voiceAssistantLoggingContext, this, (byte) 1));
    }
}
