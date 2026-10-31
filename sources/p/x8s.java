package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate$CustomSnackbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x8s extends hab0 implements bv30 {
    public final /* synthetic */ qj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8s(qj0 qj0Var) {
        super(5);
        this.a = qj0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pfj0 pfj0Var = (pfj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        MessageTemplate messageTemplateI = p3d1.i(pfj0Var.a);
        if (messageTemplateI instanceof SnackBarTemplate.BaseSnackBar) {
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.i0(2069256998);
            int i = iIntValue >> 3;
            ((gr91) this.a.d).a(pfj0Var, iu30Var, b0kVar2, (i & 112) | (i & 14) | 8);
            b0kVar2.r(false);
        } else if (messageTemplateI instanceof SnackBarTemplate.JitSnackBar) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-277481492);
            x340Var.r(false);
        } else if (messageTemplateI instanceof SnackBarTemplate$CustomSnackbar) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-277382292);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-277334676);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
