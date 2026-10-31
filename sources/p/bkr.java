package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bkr extends hab0 implements vu30 {
    public final /* synthetic */ y8j0 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkr(hkr hkrVar, y8j0 y8j0Var, iu30 iu30Var, qim0 qim0Var, boolean z) {
        super(2);
        this.a = y8j0Var;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        y8j0 y8j0Var;
        p8j0 p8j0Var;
        float f;
        MessageResponseToken messageResponseToken;
        ecx ecxVarA;
        float f2;
        float f3;
        qim0 qim0Var;
        djc0 djc0Var;
        qim0 qim0Var2;
        lee1 lee1VarS;
        ButtonStyle style;
        uwr uwrVar = cbx.a;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarI = zr7.i(u291.f(qim0Var3, 1.0f), new aw1((byte) 21, ((Boolean) ven0Var.getValue()).booleanValue()));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarI);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            y8j0 y8j0Var2 = this.a;
            eyo1 eyo1Var = y8j0Var2.b;
            MessageResponseToken messageResponseToken2 = y8j0Var2.a;
            p8j0 p8j0Var2 = (p8j0) eyo1Var;
            HeaderContent headerContent = p8j0Var2.c;
            qim0 qim0Var4 = this.c;
            if (headerContent == null) {
                x340Var2.i0(101717327);
                x340Var2.r(false);
                p8j0Var = p8j0Var2;
                y8j0Var = y8j0Var2;
                messageResponseToken = messageResponseToken2;
                f = 16.0f;
            } else {
                x340Var2.i0(101717328);
                y8j0Var = y8j0Var2;
                p8j0Var = p8j0Var2;
                f = 16.0f;
                messageResponseToken = messageResponseToken2;
                y9j0.h(headerContent, messageResponseToken2.getMessageData().getFormat().getTemplate(), qim0Var4, 0, null, x340Var2, HeaderContent.$stable, 24);
                x340Var2 = x340Var2;
                cvx cvxVar = cbx.b(x340Var2).b;
                x0d.s(qim0Var3, 16.0f, x340Var2, false);
            }
            AccessoryContent accessoryContent = p8j0Var.d;
            if (accessoryContent == null) {
                x340Var2.i0(102106997);
                x340Var2.r(false);
                f3 = f;
            } else {
                x340Var2.i0(102106998);
                kiv kivVar = AndroidCompositionLocals_androidKt.a;
                boolean z = ((Configuration) x340Var2.k(kivVar)).smallestScreenWidthDp < 600;
                boolean z2 = ((Configuration) x340Var2.k(kivVar)).orientation == 2;
                if (z && z2) {
                    x340Var2.i0(-170180787);
                    x340Var2.r(false);
                    f3 = f;
                } else {
                    x340Var2.i0(-170866941);
                    MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
                    boolean z3 = this.d;
                    if (z3) {
                        cbx.a.getClass();
                        ecxVarA = (ecx) uwr.g.getValue();
                    } else {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                    }
                    ecx ecxVar = ecxVarA;
                    if (z3) {
                        x340Var2.i0(-144044937);
                        x340Var2.r(false);
                        f2 = 0.0f;
                    } else {
                        x340Var2.i0(-144043653);
                        cua cuaVar = cbx.b(x340Var2).f;
                        x340Var2.r(false);
                        f2 = 6.0f;
                    }
                    x340 x340Var3 = x340Var2;
                    f3 = f;
                    y9j0.a(accessoryContent, template, null, z3 ? u291.f(qim0Var3, 1.0f) : qim0Var3, 120.0f, 0.0f, ecxVar, f2, x340Var3, AccessoryContent.$stable, 36);
                    x340Var2 = x340Var3;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    x0d.s(qim0Var3, f3, x340Var2, false);
                }
                x340Var2.r(false);
            }
            MessageText messageText = p8j0Var.e;
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            lee1 lee1Var = cbx.d(x340Var2).e;
            boolean zI = x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new bzm(ven0Var, (byte) 13);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            int i = MessageText.$stable;
            djc0 djc0Var2 = bjc0.a;
            y9j0.i(0, 3, i, 160, messageTemplateI, messageText, null, x340Var2, iu30Var, djc0Var2, qim0Var4, lee1Var);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
            MessageText messageText2 = p8j0Var.f;
            MessageTemplate messageTemplateI2 = p3d1.i(messageResponseToken);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new bzm(ven0Var, (byte) 14);
                x340Var2.s0(objT3);
            }
            y9j0.b(0, 3, i, 288, messageTemplateI2, messageText2, null, x340Var2, (iu30) objT3, djc0Var2, qim0Var4, lee1Var2);
            Button button = p8j0Var.g;
            iu30 iu30Var2 = this.b;
            if (button == null) {
                x340Var2.i0(104170171);
                x340Var2.r(false);
                qim0Var = qim0Var4;
                djc0Var = djc0Var2;
            } else {
                x340Var2.i0(104170172);
                op71.g(x340Var2, u291.h(qim0Var3, cbx.b(x340Var2).b.a));
                MessageTemplate template2 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN = anm1.N("messaging_bottomsheet_primary_button_tag", qim0Var4);
                boolean zG = x340Var2.g(iu30Var2) | x340Var2.i(button);
                Object objT4 = x340Var2.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new u5a(iu30Var2, button, (byte) 2);
                    x340Var2.s0(objT4);
                }
                qim0Var = qim0Var4;
                y9j0.e(button, template2, qim0VarN, null, null, djc0Var2, (Function0) objT4, x340Var2, Button.$stable, 24);
                djc0Var = djc0Var2;
                x340Var2.r(false);
            }
            Button button2 = p8j0Var.h;
            if (button2 == null) {
                x340Var2.i0(104683779);
                x340Var2.r(false);
                qim0Var2 = qim0Var;
            } else {
                x340Var2.i0(104683780);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(qim0Var3, f3));
                MessageTemplate template3 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0Var5 = qim0Var;
                qim0 qim0VarN2 = anm1.N("messaging_bottomsheet_secondary_button_tag", qim0Var5);
                boolean zG2 = x340Var2.g(iu30Var2) | x340Var2.i(button2);
                Object objT5 = x340Var2.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new u5a(iu30Var2, button2, (byte) 3);
                    x340Var2.s0(objT5);
                }
                qim0Var2 = qim0Var5;
                y9j0.e(button2, template3, qim0VarN2, null, null, null, (Function0) objT5, x340Var2, Button.$stable, 56);
                x340Var2.r(false);
            }
            Disclaimer disclaimer = p8j0Var.i;
            if (disclaimer == null) {
                x340Var2.i0(105165333);
                x340Var2.r(false);
            } else {
                x340Var2.i0(105165334);
                op71.g(x340Var2, u291.h(qim0Var3, cbx.b(x340Var2).b.a));
                MessageTemplate template4 = messageResponseToken.getMessageData().getFormat().getTemplate();
                Button linkButton = disclaimer.getLinkButton();
                EncoreFont fontOverride = (linkButton == null || (style = linkButton.getStyle()) == null) ? null : style.getFontOverride();
                if (fontOverride == null) {
                    x340Var2.i0(-294557566);
                    x340Var2.r(false);
                    lee1VarS = null;
                } else {
                    x340Var2.i0(-9501857);
                    lee1VarS = y9j0.s(fontOverride, x340Var2);
                    x340Var2.r(false);
                }
                if (lee1VarS == null) {
                    x340Var2.i0(-9499980);
                    lee1VarS = cbx.d(x340Var2).m;
                } else {
                    x340Var2.i0(-9503173);
                }
                x340Var2.r(false);
                lee1 lee1Var3 = lee1VarS;
                boolean zI3 = x340Var2.i(ven0Var);
                Object objT6 = x340Var2.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new bzm(ven0Var, (byte) 15);
                    x340Var2.s0(objT6);
                }
                iu30 iu30Var3 = (iu30) objT6;
                boolean zI4 = x340Var2.i(disclaimer) | x340Var2.g(iu30Var2);
                Object objT7 = x340Var2.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new s5a(disclaimer, iu30Var2, (byte) 1);
                    x340Var2.s0(objT7);
                }
                djc0 djc0Var3 = djc0Var;
                x340 x340Var4 = x340Var2;
                y9j0.f(disclaimer, template4, qim0Var2, lee1Var3, djc0Var3, 0, 3, iu30Var3, (Function0) objT7, null, x340Var4, Disclaimer.$stable, 544);
                x340Var2 = x340Var4;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            boolean zG3 = x340Var2.g(iu30Var2);
            Object objT8 = x340Var2.T();
            if (zG3 || objT8 == m4cVar) {
                objT8 = new v5a(iu30Var2, null, (byte) 4);
                x340Var2.s0(objT8);
            }
            int i2 = MessageResponseToken.$stable;
            qxd0.s(y8j0Var, iu30Var2, (vu30) objT8, x340Var2);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
