package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import io.reactivex.rxjava3.functions.Function;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xd80 implements Function {
    public final /* synthetic */ ae80 a;
    public final /* synthetic */ MessageResponseToken b;
    public final /* synthetic */ iac0 c;

    public xd80(ae80 ae80Var, MessageResponseToken messageResponseToken, iac0 iac0Var) {
        this.a = ae80Var;
        this.b = messageResponseToken;
        this.c = iac0Var;
    }

    public final Object apply(Object obj) {
        ef80 ef80Var;
        PresentationOperation presentationOperation = (PresentationOperation) obj;
        ae80 ae80Var = this.a;
        LinkedHashMap linkedHashMap = ae80Var.f;
        boolean z = presentationOperation instanceof PresentationOperation.Present;
        MessageResponseToken messageResponseToken = this.b;
        if (!z) {
            if (!(presentationOperation instanceof PresentationOperation.Dismiss)) {
                eg.o();
                return null;
            }
            WeakReference weakReference = (WeakReference) linkedHashMap.get(messageResponseToken.getRequestId());
            if (weakReference != null && (ef80Var = (ef80) weakReference.get()) != null) {
                ((PresentationOperation.Dismiss) presentationOperation).getDismissReason();
                ef80Var.c();
            }
            PresentationOperation.Dismiss dismiss = (PresentationOperation.Dismiss) presentationOperation;
            if (!u890.j(dismiss.getDismissReason(), DismissReason.ContextChanged.INSTANCE)) {
                dismiss.getOnDismissedCallback().a(messageResponseToken, dismiss.getDismissReason());
            }
            return new hf80(dismiss.getDismissReason());
        }
        vlc vlcVar = ae80Var.e;
        y4q0 y4q0Var = ae80Var.c;
        DiscardReason discardReasonA = vlcVar.a(messageResponseToken.getRequestId());
        if (discardReasonA != null) {
            y4q0Var.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), discardReasonA);
            return new gf80(discardReasonA);
        }
        iac0 iac0Var = this.c;
        iac0Var.getLifecycle().a(new wd80(ae80Var, messageResponseToken, iac0Var));
        r4j0 presenter = ((PresentationOperation.Present) presentationOperation).getPresenter();
        if (!(presenter instanceof ef80)) {
            y4q0Var.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), new DiscardReason$PresentationFailed("Invalid presenter type"));
            return new gf80(new DiscardReason$PresentationFailed("Invalid presenter type"));
        }
        if80 if80Var = new if80((ef80) presenter);
        linkedHashMap.put(messageResponseToken.getRequestId(), new WeakReference(presenter));
        return if80Var;
    }
}
