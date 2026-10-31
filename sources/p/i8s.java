package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i8s extends hab0 implements bv30 {
    public final /* synthetic */ qj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8s(qj0 qj0Var) {
        super(5);
        this.a = qj0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fbj0 fbj0Var = (fbj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (p3d1.i(fbj0Var.a) instanceof FullscreenTemplate.BaseFullscreen) {
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.i0(-1082960840);
            ((f0s) this.a.e).a(fbj0Var, fbj0Var.b, iu30Var, b0kVar2, MessageResponseToken.$stable | ((iIntValue >> 3) & 14) | (iIntValue & 896));
            b0kVar2.r(false);
        } else {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(788105718);
            x340Var.r(false);
        }
        return rih1.a;
    }
}
