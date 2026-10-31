package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w1q0 extends hab0 implements iu30 {
    public final /* synthetic */ DismissType a;
    public final /* synthetic */ MessageResponseToken b;
    public final /* synthetic */ x1q0 c;
    public final /* synthetic */ Button d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1q0(DismissType dismissType, MessageResponseToken messageResponseToken, x1q0 x1q0Var, Button button, Function0 function0) {
        super(1);
        this.a = dismissType;
        this.b = messageResponseToken;
        this.c = x1q0Var;
        this.d = button;
        this.e = function0;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x1q0 x1q0Var = this.c;
        a5q0 a5q0Var = x1q0Var.e;
        DismissType dismissType = this.a;
        if (!(dismissType instanceof DismissType.ActionDeterminedDismiss)) {
            if (!(dismissType instanceof DismissType.OverriddenDismiss)) {
                eg.o();
                return null;
            }
            zBooleanValue = ((DismissType.OverriddenDismiss) dismissType).getShouldDismiss();
        }
        if (zBooleanValue) {
            MessageResponseToken messageResponseToken = this.b;
            FormatType formatTypeB = yhm0.b(messageResponseToken.getMessageData());
            FormatType formatType = FormatType.INLINE_CARD;
            Button button = this.d;
            if (formatTypeB != formatType) {
                a5q0Var.a(messageResponseToken, new DismissReason.MessageButtonTapped(button));
            } else {
                hmc hmcVar = x1q0Var.c;
                vz21 vz21Var = (vz21) hmcVar.a.get(messageResponseToken.getRequestId());
                if (vz21Var != null) {
                    vz21Var.b.onNext(new PresentationOperation.Dismiss(new DismissReason.MessageButtonTapped(button), a5q0Var));
                }
            }
            this.e.invoke();
        }
        return rih1.a;
    }
}
