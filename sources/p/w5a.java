package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w5a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5a b;
    public final /* synthetic */ Button c;
    public final /* synthetic */ o8j0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5a(x5a x5aVar, Button button, o8j0 o8j0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = x5aVar;
        this.c = button;
        this.d = o8j0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0kVar2.b0();
                } else {
                    Button button = this.c;
                    this.b.g(button, new l8j0(button), this.d, this.e, "messaging_banner_primary_button_tag", b0kVar2, Button.$stable | 25152);
                }
                break;
            default:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b0kVar4.b0();
                } else {
                    Button button2 = this.c;
                    this.b.g(button2, new m8j0(button2), this.d, this.e, "messaging_banner_secondary_button_tag", b0kVar4, Button.$stable | 25152);
                }
                break;
        }
        return rih1Var;
    }
}
