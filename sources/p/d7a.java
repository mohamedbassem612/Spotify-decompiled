package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate$CustomBanner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7a implements e5a {
    public final /* synthetic */ g7a a;

    public d7a(g7a g7aVar) {
        this.a = g7aVar;
    }

    public final void a(h8a h8aVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        h8a h8aVar2;
        qim0 qim0Var2;
        c6a c6aVar;
        aqw m231Var;
        String str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-217135661);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(h8aVar) : b0kVar3.i(h8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(this) ? 256 : 128;
        }
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            aqw aqwVar = null;
            g7a g7aVar = this.a;
            if (objT == m4cVar) {
                mmr0 mmr0Var = g7aVar.h;
                objT = mmr0Var != null ? (MessageResponseToken) mmr0Var.a : null;
                b0kVar3.s0(objT);
            }
            MessageResponseToken messageResponseToken = (MessageResponseToken) objT;
            if (messageResponseToken == null) {
                n57.e("ClientMessagingPlatform: bindMessage should be invoked before invoking display");
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new a7a(this, h8aVar, qim0Var, i, (byte) 1);
                    return;
                }
                return;
            }
            h8aVar2 = h8aVar;
            qim0Var2 = qim0Var;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new c7a(g7aVar);
                b0kVar3.s0(objT2);
            }
            c7a c7aVar = (c7a) objT2;
            boolean zG = b0kVar3.g(messageResponseToken);
            aqw aqwVarT = b0kVar3.T();
            if (zG || aqwVarT == m4cVar) {
                l4q l4qVar = g7aVar.b;
                switch (l4qVar.a) {
                    case 0:
                        v5q v5qVar = (v5q) ((thq) l4qVar.b).c;
                        c6aVar = new c6a((n4q) v5qVar.s3.get(), (o4q) v5qVar.t3.get(), h8aVar2, qim0Var2);
                        break;
                    case 1:
                        s7q s7qVar = (s7q) l4qVar.b.d;
                        c6aVar = new c6a((n4q) s7qVar.N0.get(), (o4q) s7qVar.O0.get(), h8aVar2, qim0Var2);
                        break;
                    case 2:
                        ai0 ai0Var = (ai0) ((obq) l4qVar.b).d;
                        c6aVar = new c6a((n4q) ((jly0) ai0Var.P0).get(), (o4q) ((jly0) ai0Var.Q0).get(), h8aVar2, qim0Var2);
                        break;
                    default:
                        teq teqVar = l4qVar.b.d;
                        c6aVar = new c6a((n4q) teqVar.R3.get(), (o4q) teqVar.S3.get(), h8aVar2, qim0Var2);
                        break;
                }
                BannerTemplate.BaseBanner baseBanner = (BannerTemplate) p3d1.i(messageResponseToken);
                if (baseBanner instanceof BannerTemplate.BaseBanner) {
                    BannerTemplate.BaseBanner baseBanner2 = baseBanner;
                    m231Var = new aqw(new b6a(c6aVar, b3), new o8j0(messageResponseToken, new g8j0(baseBanner2.getAlignment(), null, baseBanner2.getHeaderContent(), baseBanner2.getAccessoryContent(), baseBanner.standardizedBackground(), baseBanner2.getHeadline(), baseBanner2.getBody(), baseBanner2.getPrimaryButton(), baseBanner2.getSecondaryButton(), baseBanner2.getDismissButton(), baseBanner2.getContentButton(), baseBanner2.getDisclaimer(), 2)));
                } else if (baseBanner instanceof BannerTemplate.BasicBanner) {
                    BannerTemplate.BasicBanner basicBanner = (BannerTemplate.BasicBanner) baseBanner;
                    m231Var = new aqw(new b6a(c6aVar, b4), new o8j0(messageResponseToken, new g8j0(null, null, null, null, baseBanner.standardizedBackground(), basicBanner.getHeadline(), basicBanner.getBody(), basicBanner.getPrimaryButton(), basicBanner.getSecondaryButton(), basicBanner.getCloseButton(), null, null, 3087)));
                } else if (baseBanner instanceof BannerTemplate$CustomBanner) {
                    m231Var = ((BannerTemplate$CustomBanner) baseBanner).getElementAndProps();
                    if (m231Var == null) {
                        m231Var = new m231(new IllegalArgumentException("No custom element provider found for template: " + baseBanner));
                    }
                } else if (baseBanner instanceof BannerTemplate.JitBanner) {
                    BannerTemplate.JitBanner jitBanner = (BannerTemplate.JitBanner) baseBanner;
                    m231Var = new aqw(new b6a(c6aVar, b), new qgj0(messageResponseToken, jitBanner.getHtmlString(), jitBanner.getButtons(), false));
                } else if (baseBanner instanceof BannerTemplate.RichBanner) {
                    BannerTemplate.RichBanner richBanner = (BannerTemplate.RichBanner) baseBanner;
                    m231Var = new aqw(new b6a(c6aVar, (byte) 3), new o8j0(messageResponseToken, new g8j0(null, null, null, richBanner.getAccessoryContent(), baseBanner.standardizedBackground(), richBanner.getHeadline(), richBanner.getBody(), richBanner.getPrimaryButton(), richBanner.getSecondaryButton(), richBanner.getCloseButton(), null, null, 3079)));
                } else if (baseBanner instanceof BannerTemplate.SignifierBanner) {
                    b6a b6aVar = new b6a(c6aVar, b2);
                    BannerTemplate.SignifierBanner signifierBanner = (BannerTemplate.SignifierBanner) baseBanner;
                    m231Var = new aqw(b6aVar, new o8j0(messageResponseToken, new g8j0(null, signifierBanner.getSignifier(), null, null, baseBanner.standardizedBackground(), signifierBanner.getHeadline(), signifierBanner.getBody(), signifierBanner.getPrimaryButton(), signifierBanner.getSecondaryButton(), signifierBanner.getCloseButton(), null, null, 3085)));
                } else if (baseBanner instanceof BannerTemplate.Undefined) {
                    m231Var = new m231(new IllegalArgumentException("Undefined template cannot be used to create an element"));
                } else {
                    eg.o();
                    m231Var = null;
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    aqwVar = m231Var;
                } else {
                    c7aVar.a(messageResponseToken, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for BannerTemplate: ", thA.getMessage())));
                }
                aqwVarT = aqwVar;
                b0kVar3.s0(aqwVarT);
            }
            aqw aqwVar2 = (aqw) aqwVarT;
            if (aqwVar2 != null) {
                b0kVar3.i0(-464504360);
                qim0 qim0VarD = p3d1.i(messageResponseToken) instanceof BannerTemplate.JitBanner ? sgc1.D(1, qim0Var2) : u291.j(0.0f, ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.5f, 1, qim0Var2);
                BackgroundColor backgroundColorStandardizedBackground = p3d1.i(messageResponseToken).standardizedBackground();
                if (backgroundColorStandardizedBackground != null) {
                    qim0VarD = y9j0.r(qim0VarD, messageResponseToken.getMessageData().getFormat().getTemplate(), backgroundColorStandardizedBackground, 0.0f);
                }
                MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
                if (messageTemplateI instanceof BannerTemplate.BasicBanner) {
                    str = "messaging_banner_basic_type_tag";
                } else if (messageTemplateI instanceof BannerTemplate.BaseBanner) {
                    str = "messaging_banner_base_type_tag";
                } else if (messageTemplateI instanceof BannerTemplate$CustomBanner) {
                    str = "messaging_banner_custom_type_tag";
                } else if (messageTemplateI instanceof BannerTemplate.JitBanner) {
                    str = "messaging_banner_jit_type_tag";
                } else if (messageTemplateI instanceof BannerTemplate.RichBanner) {
                    str = "messaging_banner_rich_type_tag";
                } else {
                    if (!(messageTemplateI instanceof BannerTemplate.SignifierBanner)) {
                        hhg1.n("Unknown BannerTemplate type");
                        return;
                    }
                    str = "messaging_banner_signifier_type_tag";
                }
                qim0 qim0Var3 = qim0VarD;
                String str2 = str;
                b0kVar2 = b0kVar3;
                g7aVar.c(6, str2, apo.r(1438580174, new hj8(aqwVar2, c7aVar, (byte) 10), b0kVar3), b0kVar2, qim0Var3);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-462575633);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            h8aVar2 = h8aVar;
            qim0Var2 = qim0Var;
            b0kVar2.b0();
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new a7a(this, h8aVar2, qim0Var2, i, (byte) 0);
        }
    }
}
