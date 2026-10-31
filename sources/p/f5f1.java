package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate$CustomTooltip;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f5f1 extends hab0 implements vu30 {
    public final /* synthetic */ mmr0 a;
    public final /* synthetic */ h5f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5f1(mmr0 mmr0Var, h5f1 h5f1Var) {
        super(2);
        this.a = mmr0Var;
        this.b = h5f1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object m231Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            Object obj3 = fkj0.X;
            if (objT == obj3) {
                objT = (MessageResponseToken) this.a.a;
                x340Var2.s0(objT);
            }
            MessageResponseToken messageResponseToken = (MessageResponseToken) objT;
            Object objT2 = x340Var2.T();
            h5f1 h5f1Var = this.b;
            if (objT2 == obj3) {
                objT2 = new e5f1(h5f1Var);
                x340Var2.s0(objT2);
            }
            e5f1 e5f1Var = (e5f1) objT2;
            TooltipTemplate.BaseTooltip baseTooltip = (TooltipTemplate) p3d1.i(messageResponseToken);
            boolean zG = x340Var2.g(messageResponseToken);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == obj3) {
                n4f1 n4f1Var = h5f1Var.g;
                Object obj4 = null;
                if (baseTooltip instanceof TooltipTemplate.BaseTooltip) {
                    TooltipTemplate.BaseTooltip baseTooltip2 = baseTooltip;
                    m231Var = new aqw(new qwc1(n4f1Var, (byte) 28), new zfj0(messageResponseToken, new vfj0(baseTooltip2.getAlignment(), baseTooltip2.getText(), baseTooltip2.getAccessoryContent(), baseTooltip2.getHeader(), baseTooltip2.getButton())));
                } else if (baseTooltip instanceof TooltipTemplate$CustomTooltip) {
                    m231Var = ((TooltipTemplate$CustomTooltip) baseTooltip).getElementAndProps();
                    if (m231Var == null) {
                        m231Var = new m231(new IllegalArgumentException("Custom tooltip template has no element and props"));
                    }
                } else if (baseTooltip instanceof TooltipTemplate.Undefined) {
                    m231Var = new m231(new IllegalArgumentException("Undefined tooltip template"));
                } else {
                    eg.o();
                    m231Var = null;
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    obj4 = m231Var;
                } else {
                    e5f1Var.a(messageResponseToken, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for TooltipElement: ", thA.getMessage())));
                }
                objT3 = (aqw) obj4;
                x340Var2.s0(objT3);
            }
            aqw aqwVar = (aqw) objT3;
            if (aqwVar != null) {
                x340Var2.i0(416034092);
                nyx.a(3, (wux) null, apo.r(2139661144, new bvd1(baseTooltip, h5f1Var, aqwVar, e5f1Var, (byte) 7), x340Var2), x340Var2, 3078, 6);
                x340Var2.r(false);
            } else {
                x340Var2.i0(416937432);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
