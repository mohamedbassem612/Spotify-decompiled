package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yd80 implements Function {
    public static final yd80 a = new yd80();

    public final Object apply(Object obj) {
        m231 m231Var = (MessageResponse) obj;
        if (!(m231Var instanceof MessageResponse.Success)) {
            if (!(m231Var instanceof MessageResponse.Failure)) {
                eg.o();
                return null;
            }
            m231Var = new m231(new Throwable("Failed to fetch inline card: " + ((MessageResponse.Failure) m231Var).getDiscardReason()));
        }
        return new e331(m231Var);
    }
}
