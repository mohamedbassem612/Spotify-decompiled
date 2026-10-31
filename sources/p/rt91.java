package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate$CustomSnackbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rt91 extends hab0 implements vu30 {
    public final /* synthetic */ mmr0 a;
    public final /* synthetic */ tt91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt91(mmr0 mmr0Var, tt91 tt91Var) {
        super(2);
        this.a = mmr0Var;
        this.b = tt91Var;
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
            tt91 tt91Var = this.b;
            if (objT2 == obj3) {
                objT2 = new qt91(tt91Var);
                x340Var2.s0(objT2);
            }
            qt91 qt91Var = (qt91) objT2;
            SnackBarTemplate.BaseSnackBar baseSnackBar = (SnackBarTemplate) p3d1.i(messageResponseToken);
            boolean zG = x340Var2.g(messageResponseToken);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == obj3) {
                kr91 kr91Var = tt91Var.g;
                Object obj4 = null;
                if (baseSnackBar instanceof SnackBarTemplate.BaseSnackBar) {
                    SnackBarTemplate.BaseSnackBar baseSnackBar2 = baseSnackBar;
                    m231Var = new aqw(new jr91(kr91Var, (byte) 0), new pfj0(messageResponseToken, new kfj0(baseSnackBar2.getHeader(), baseSnackBar2.getBody(), baseSnackBar2.getAccessoryContent(), baseSnackBar2.getPrimaryButton(), baseSnackBar2.getDismissButton())));
                } else if (baseSnackBar instanceof SnackBarTemplate$CustomSnackbar) {
                    m231Var = ((SnackBarTemplate$CustomSnackbar) baseSnackBar).getElementAndProps();
                    if (m231Var == null) {
                        m231Var = new m231(new IllegalArgumentException("No custom element found for template: " + baseSnackBar));
                    }
                } else if (baseSnackBar instanceof SnackBarTemplate.JitSnackBar) {
                    SnackBarTemplate.JitSnackBar jitSnackBar = (SnackBarTemplate.JitSnackBar) baseSnackBar;
                    m231Var = new aqw(new jr91(kr91Var, (byte) 1), new qgj0(messageResponseToken, jitSnackBar.getHtmlString(), jitSnackBar.getButtons(), false));
                } else if (baseSnackBar instanceof SnackBarTemplate.Undefined) {
                    m231Var = new m231(new IllegalArgumentException("Undefined template cannot be used to create an element"));
                } else {
                    eg.o();
                    m231Var = null;
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    obj4 = m231Var;
                } else {
                    qt91Var.a(messageResponseToken, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for SnackbarTemplate: ", thA.getMessage())));
                }
                objT3 = (aqw) obj4;
                x340Var2.s0(objT3);
            }
            aqw aqwVar = (aqw) objT3;
            if (aqwVar != null) {
                x340Var2.i0(-1948404318);
                nyx.a(3, (wux) null, apo.r(-1974202685, new gh61(baseSnackBar, tt91Var, aqwVar, qt91Var, (byte) 14), x340Var2), x340Var2, 3078, 6);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1947528847);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
