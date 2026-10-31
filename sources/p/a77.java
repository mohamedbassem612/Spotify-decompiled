package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.errorhandler.NotAuthenticatedException;
import com.spotify.voiceassistants.playermodels.ExplicitContentForbiddenException;
import com.spotify.voiceassistants.playermodels.MetadataItem;
import com.spotify.voiceassistants.playermodels.NoContentException;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import java.util.concurrent.TimeoutException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a77 {
    public final s610 a;
    public final tym0 b;

    public a77(s610 s610Var, tym0 tym0Var) {
        this.a = s610Var;
        this.b = tym0Var;
    }

    public final void a(VoiceAssistantLoggingContext voiceAssistantLoggingContext, Throwable th, String str) {
        String string;
        kkv kkvVar;
        if (th != null) {
            Logger.e(th, "Exception thrown during player operation", new Object[0]);
        }
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        if (th == null || (string = th.getMessage()) == null) {
            string = th != null ? th.toString() : "Playback failed";
        }
        this.b.h(new d77(packageId, requestedUri, string, voiceAssistantLoggingContext.getInteractionId(), 2, str, voiceAssistantLoggingContext.getUserId()));
        if (th instanceof ExplicitContentForbiddenException) {
            kkvVar = kkv.d;
        } else if (th instanceof NoContentException) {
            kkvVar = kkv.f;
        } else {
            kkvVar = (th != null && (th instanceof HttpException) && ((HttpException) th).a == 503) ? kkv.j : kkv.k;
        }
        this.a.a(kkvVar);
    }

    public final void b(MetadataItem metadataItem, VoiceAssistantLoggingContext voiceAssistantLoggingContext, String str) {
        String error;
        String error2;
        kkv kkvVar = kkv.g;
        boolean z = metadataItem instanceof MetadataItem.Error;
        if (z && (error2 = ((MetadataItem.Error) metadataItem).getError()) != null) {
            if (error2.equals("explicit-content-forbidden")) {
                kkvVar = kkv.d;
            } else if (error2.equals("no-content")) {
                kkvVar = kkv.f;
            }
        }
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        MetadataItem.Error error3 = z ? (MetadataItem.Error) metadataItem : null;
        if (error3 == null || (error = error3.getError()) == null) {
            error = "Search failed with metadata";
        }
        this.b.h(new d77(packageId, requestedUri, error, voiceAssistantLoggingContext.getInteractionId(), 1, str, voiceAssistantLoggingContext.getUserId()));
        this.a.a(kkvVar);
    }

    public final void c(VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        this.b.h(new d77(voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), "Search failed", voiceAssistantLoggingContext.getInteractionId(), 1, (String) null, voiceAssistantLoggingContext.getUserId()));
        this.a.a(kkv.g);
    }

    public final void d(Throwable th, VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        int i;
        kkv kkvVar;
        Logger.e(th, "Exception thrown during search", new Object[0]);
        boolean z = th instanceof NotAuthenticatedException;
        if (z) {
            i = 3;
        } else if (th instanceof TimeoutException) {
            i = 4;
        } else {
            i = ((th instanceof ExplicitContentForbiddenException) || (th instanceof NoContentException)) ? 1 : 6;
        }
        int i2 = i;
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        this.b.h(new d77(packageId, requestedUri, message, voiceAssistantLoggingContext.getInteractionId(), i2, (String) null, voiceAssistantLoggingContext.getUserId()));
        if (z) {
            kkvVar = kkv.e;
        } else if (th instanceof ExplicitContentForbiddenException) {
            kkvVar = kkv.d;
        } else if (th instanceof NoContentException) {
            kkvVar = kkv.f;
        } else {
            kkvVar = ((th instanceof HttpException) && ((HttpException) th).a == 503) ? kkv.j : kkv.g;
        }
        this.a.a(kkvVar);
    }
}
