package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xna1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ VoiceAssistantLoggingContext c;
    public final /* synthetic */ aoa1 d;

    public /* synthetic */ xna1(Uri uri, VoiceAssistantLoggingContext voiceAssistantLoggingContext, aoa1 aoa1Var, byte b) {
        this.a = b;
        this.b = uri;
        this.c = voiceAssistantLoggingContext;
        this.d = aoa1Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        aoa1 aoa1Var = this.d;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext = this.c;
        Uri uri = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Voice search error - Exception while calling prepare. uri=%s, interactionId=%s, packageId=%s, requestedUri=%s, userId=%s", new Object[]{uri, voiceAssistantLoggingContext.getInteractionId(), voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), voiceAssistantLoggingContext.getUserId()});
                aoa1Var.f.remove(uri);
                ((lv41) aoa1Var.b).c.d(th, voiceAssistantLoggingContext);
                break;
            default:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, "Voice search error - Exception while calling search for searchAndPrepare. uri=%s, interactionId=%s, packageId=%s, requestedUri=%s, userId=%s", new Object[]{uri, voiceAssistantLoggingContext.getInteractionId(), voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), voiceAssistantLoggingContext.getUserId()});
                aoa1Var.f.remove(uri);
                bmk1 bmk1Var = aoa1Var.b;
                th2.getClass();
                ((lv41) bmk1Var).c.d(th2, voiceAssistantLoggingContext);
                break;
        }
        return CompletableEmpty.a;
    }
}
