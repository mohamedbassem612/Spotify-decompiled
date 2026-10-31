package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5a extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Button c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5a(iu30 iu30Var, Button button, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = button;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Button button = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new i8j0(button));
                break;
            case 1:
                iu30Var.invoke(new h8j0(button));
                break;
            case 2:
                iu30Var.invoke(new u8j0(button));
                break;
            case 3:
                iu30Var.invoke(new v8j0(button));
                break;
            case 4:
                iu30Var.invoke(new u8j0(button));
                break;
            case 5:
                iu30Var.invoke(new v8j0(button));
                break;
            case 6:
                iu30Var.invoke(new u8j0(button));
                break;
            case 7:
                iu30Var.invoke(new v8j0(button));
                break;
            case 8:
                iu30Var.invoke(new u8j0(button));
                break;
            case 9:
                iu30Var.invoke(new v8j0(button));
                break;
            case 10:
                iu30Var.invoke(new dbj0(button));
                break;
            case 11:
                iu30Var.invoke(new gdj0(button));
                break;
            case 12:
                iu30Var.invoke(new hdj0(button));
                break;
            case 13:
                iu30Var.invoke(new hbj0(button));
                break;
            case 14:
                iu30Var.invoke(new hbj0(button));
                break;
            case 15:
                iu30Var.invoke(new hbj0(button));
                break;
            case 16:
                iu30Var.invoke(new ibj0(button));
                break;
            case 17:
                iu30Var.invoke(new mfj0(button));
                break;
            case 18:
                iu30Var.invoke(new lfj0(button));
                break;
            default:
                iu30Var.invoke(new wfj0(button));
                break;
        }
        return rih1Var;
    }
}
