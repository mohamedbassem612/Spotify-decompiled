package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8s extends hab0 implements bv30 {
    public final /* synthetic */ umf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8s(umf0 umf0Var) {
        super(5);
        this.a = umf0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jdj0 jdj0Var = (jdj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        nas nasVar = (nas) this.a.e;
        cdj0 cdj0Var = jdj0Var.b;
        MessageTemplate messageTemplateI = p3d1.i(jdj0Var.a);
        if (messageTemplateI instanceof ModalTemplate.JitModal) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-152437364);
            x340Var2.r(false);
        } else if (messageTemplateI instanceof ModalTemplate.BaseModal) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(410728530);
            nasVar.a(jdj0Var.a, cdj0Var, iu30Var, x340Var3, MessageResponseToken.$stable | (iIntValue & 896));
            x340Var3.r(false);
        } else if (messageTemplateI instanceof ModalTemplate.BasicModal) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(410735699);
            nasVar.b(jdj0Var.a, cdj0Var, iu30Var, x340Var4, MessageResponseToken.$stable | (iIntValue & 896));
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(-151925492);
            x340Var5.r(false);
        }
        return rih1.a;
    }
}
