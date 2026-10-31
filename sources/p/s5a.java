package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5a extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disclaimer b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5a(Disclaimer disclaimer, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = disclaimer;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        Disclaimer disclaimer = this.b;
        switch (b) {
            case 0:
                Button linkButton = disclaimer.getLinkButton();
                if (linkButton != null) {
                    iu30Var.invoke(new j8j0(linkButton));
                }
                break;
            case 1:
                Button linkButton2 = disclaimer.getLinkButton();
                if (linkButton2 != null) {
                    iu30Var.invoke(new w8j0(linkButton2));
                }
                break;
            case 2:
                Button linkButton3 = disclaimer.getLinkButton();
                if (linkButton3 != null) {
                    iu30Var.invoke(new abj0(linkButton3));
                }
                break;
            default:
                Button linkButton4 = disclaimer.getLinkButton();
                if (linkButton4 != null) {
                    iu30Var.invoke(new edj0(linkButton4));
                }
                break;
        }
        return rih1Var;
    }
}
