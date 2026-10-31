package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rkl1 extends hab0 implements vu30 {
    public final /* synthetic */ skl1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkl1(skl1 skl1Var) {
        super(2);
        this.a = skl1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        aqw m231Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            cir0 cir0Var = (cir0) x340Var2.k(k2r0.a);
            skl1 skl1Var = this.a;
            dll1 dll1Var = skl1Var.b;
            MessageResponseToken messageResponseToken = dll1Var.a;
            boolean zG = x340Var2.g(dll1Var);
            Object objT = x340Var2.T();
            if (zG || objT == obj3) {
                ilh1 ilh1Var = skl1Var.e;
                WebViewTemplate webViewTemplateI = p3d1.i(messageResponseToken);
                if (webViewTemplateI instanceof WebViewTemplate.BasicWebView) {
                    m231Var = new aqw(new hij1(ilh1Var, cir0Var, (byte) 27), new thj0(messageResponseToken, ((dll1) ilh1Var.c).b));
                } else {
                    m231Var = new m231(new IllegalArgumentException("No element found for template: " + webViewTemplateI));
                }
                e331 e331Var = new e331(m231Var);
                x340Var2.s0(e331Var);
                objT = e331Var;
            }
            Object obj4 = ((e331) objT).a;
            boolean zG2 = x340Var2.g(dll1Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == obj3) {
                objT2 = new qkl1(skl1Var);
                x340Var2.s0(objT2);
            }
            qkl1 qkl1Var = (qkl1) objT2;
            Throwable thA = e331.a(obj4);
            if (thA == null) {
                x340Var2.i0(-917552195);
                ((aqw) obj4).a(qkl1Var, cir0Var.d(), x340Var2, 0, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1456535015);
                boolean zI = x340Var2.i(skl1Var) | x340Var2.i(thA);
                Object objT3 = x340Var2.T();
                if (zI || objT3 == obj3) {
                    objT3 = new pkl1(skl1Var, thA, null);
                    x340Var2.s0(objT3);
                }
                int i = MessageResponseToken.$stable;
                qxd0.t(messageResponseToken, x340Var2, (vu30) objT3);
                t1c.a(nim0.a, x340Var2, 6);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
