package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ze80 extends hab0 implements xu30 {
    public final /* synthetic */ lbj0 a;
    public final /* synthetic */ af80 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze80(lbj0 lbj0Var, af80 af80Var, iu30 iu30Var) {
        super(3);
        this.a = lbj0Var;
        this.b = af80Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ksw kswVar = (ksw) obj;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        Object obj4 = fkj0.X;
        lbj0 lbj0Var = this.a;
        if (objT == obj4) {
            objT = lbj0Var.a.getMessageData().getFormat().getTemplate();
            x340Var.s0(objT);
        }
        MessageTemplate messageTemplate = (MessageTemplate) objT;
        boolean zG = x340Var.g(lbj0Var);
        Object objT2 = x340Var.T();
        if (zG || objT2 == obj4) {
            objT2 = lbj0Var.b;
            x340Var.s0(objT2);
        }
        gbj0 gbj0Var = (gbj0) objT2;
        Signifier signifier = gbj0Var.a;
        HeaderContent headerContent = gbj0Var.b;
        MessageText messageText = gbj0Var.c;
        MessageText messageText2 = gbj0Var.e;
        ely0 ely0VarA = oi7.a.a(this.b.a);
        af80 af80Var = this.b;
        iu30 iu30Var = this.c;
        mod.b(ely0VarA, apo.r(-1633266254, new ye80(messageTemplate, gbj0Var, headerContent, signifier, messageText, messageText2, af80Var, iu30Var, lbj0Var), x340Var), x340Var, 56);
        Object objT3 = x340Var.T();
        Object obj5 = objT3;
        if (objT3 == obj4) {
            q811 q811Var = new q811();
            q811Var.a = Boolean.FALSE;
            x340Var.s0(q811Var);
            obj5 = q811Var;
        }
        q811 q811Var2 = (q811) obj5;
        boolean zI = x340Var.i(q811Var2) | x340Var.g(iu30Var);
        Object objT4 = x340Var.T();
        if (zI || objT4 == obj4) {
            objT4 = new ue80(q811Var2, iu30Var, (byte) 2);
            x340Var.s0(objT4);
        }
        n9p1.e(kswVar, (iu30) objT4, x340Var, iIntValue & 14);
        return rih1.a;
    }
}
