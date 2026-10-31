package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hs30 extends hab0 implements vu30 {
    public final /* synthetic */ is30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs30(is30 is30Var) {
        super(2);
        this.a = is30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        aqw m231Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            Object obj3 = fkj0.X;
            if (objT == obj3) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            is30 is30Var = this.a;
            bpb1 bpb1Var = is30Var.m;
            MessageResponseToken messageResponseToken = is30Var.b.a;
            bpb1 bpb1Var2 = is30Var.l;
            boolean zI = x340Var2.i(c9nVar) | x340Var2.i(is30Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == obj3) {
                objT2 = new h210(c9nVar, is30Var, (lnm) null, (byte) 13);
                x340Var2.s0(objT2);
            }
            qxd0.s(bpb1Var, bpb1Var2, (vu30) objT2, x340Var2);
            Object objT3 = x340Var2.T();
            if (objT3 == obj3) {
                objT3 = new gs30(is30Var, c9nVar);
                x340Var2.s0(objT3);
            }
            gs30 gs30Var = (gs30) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == obj3) {
                yr30 yr30Var = is30Var.c;
                FullscreenTemplate.JitFullscreen jitFullscreen = (FullscreenTemplate) p3d1.i(messageResponseToken);
                yr30Var.getClass();
                if (jitFullscreen instanceof FullscreenTemplate.JitFullscreen) {
                    FullscreenTemplate.JitFullscreen jitFullscreen2 = jitFullscreen;
                    m231Var = new aqw(new xr30(yr30Var, (byte) 0), new qgj0(messageResponseToken, jitFullscreen2.getHtmlString(), jitFullscreen2.getButtons(), true));
                } else if (jitFullscreen instanceof FullscreenTemplate.BaseFullscreen) {
                    FullscreenTemplate.BaseFullscreen baseFullscreen = (FullscreenTemplate.BaseFullscreen) jitFullscreen;
                    m231Var = new aqw(new xr30(yr30Var, (byte) 1), new fbj0(messageResponseToken, new zaj0(baseFullscreen.getBackground(), baseFullscreen.getAccessoryContent(), baseFullscreen.getHeadline(), baseFullscreen.getBody(), baseFullscreen.getPrimaryButton(), baseFullscreen.getSecondaryButton(), baseFullscreen.getDisclaimer(), baseFullscreen.getAccessoryContentSize(), baseFullscreen.getContentAlignment())));
                } else {
                    m231Var = new m231(new IllegalArgumentException("No element found for template: " + jitFullscreen));
                }
                objT4 = new e331(m231Var);
                x340Var2.s0(objT4);
            }
            Object obj4 = ((e331) objT4).a;
            Throwable thA = e331.a(obj4);
            if (thA == null) {
                aqw aqwVar = (aqw) obj4;
                x340Var2.i0(-17937707);
                d7q d7qVar = is30Var.j;
                MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
                if (messageTemplateI instanceof FullscreenTemplate.JitFullscreen) {
                    str = "messaging-fullscreen-html";
                } else {
                    if (!(messageTemplateI instanceof FullscreenTemplate.BaseFullscreen)) {
                        hhg1.n("Unknown FullscreenTemplate type");
                        return null;
                    }
                    str = "messaging-fullscreen-base";
                }
                otw.c(d7qVar.a(gs30Var, null, aqwVar, null, "messaging-fullscreen-slate", "messaging_slate_header", str, "messaging_slate_footer"), new ifj0(messageResponseToken, true), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                x340Var2.r(false);
            } else {
                x340Var2.i0(927033323);
                boolean zI2 = x340Var2.i(gs30Var) | x340Var2.i(is30Var) | x340Var2.i(thA);
                Object objT5 = x340Var2.T();
                if (zI2 || objT5 == obj3) {
                    objT5 = new bs30(gs30Var, is30Var, thA, null);
                    x340Var2.s0(objT5);
                }
                int i = MessageResponseToken.$stable;
                qxd0.t(messageResponseToken, x340Var2, (vu30) objT5);
                t1c.a(nim0.a, x340Var2, 6);
                x340Var2.r(false);
            }
            boolean zI3 = x340Var2.i(is30Var);
            Object objT6 = x340Var2.T();
            if (zI3 || objT6 == obj3) {
                objT6 = new cs30(is30Var, null, (byte) 0);
                x340Var2.s0(objT6);
            }
            qxd0.t(gs30Var, x340Var2, (vu30) objT6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
