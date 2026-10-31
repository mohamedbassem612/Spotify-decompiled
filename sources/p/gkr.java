package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gkr extends hab0 implements vu30 {
    public final /* synthetic */ y8j0 a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkr(hkr hkrVar, y8j0 y8j0Var, iu30 iu30Var) {
        super(2);
        this.a = y8j0Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        MessageResponseToken messageResponseToken;
        s8j0 s8j0Var;
        float f;
        nim0 nim0Var;
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        b0k b0kVar2 = (x340) b0kVar;
        if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarI = zr7.i(u291.f(nim0Var2, 1.0f), new aw1((byte) 21, ((Boolean) ven0Var.getValue()).booleanValue()));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarI);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            y8j0 y8j0Var = this.a;
            eyo1 eyo1Var = y8j0Var.b;
            MessageResponseToken messageResponseToken2 = y8j0Var.a;
            if (!(eyo1Var instanceof s8j0)) {
                hhg1.n("Failed requirement.");
                return null;
            }
            s8j0 s8j0Var2 = (s8j0) eyo1Var;
            Signifier signifier = s8j0Var2.c;
            if (signifier == null) {
                b0kVar2.i0(295582685);
                b0kVar2.r(false);
                s8j0Var = s8j0Var2;
                messageResponseToken = messageResponseToken2;
                nim0Var = nim0Var2;
                f = 16.0f;
            } else {
                b0kVar2.i0(295582686);
                MessageTemplate template = messageResponseToken2.getMessageData().getFormat().getTemplate();
                uwr uwrVar = cbx.a;
                messageResponseToken = messageResponseToken2;
                s8j0Var = s8j0Var2;
                f = 16.0f;
                nim0Var = nim0Var2;
                y9j0.o(signifier, template, null, 0, 0.0f, 0L, null, cbx.d(b0kVar2).k, b0kVar2, Signifier.$stable, 124);
                b0kVar2 = b0kVar2;
                cvx cvxVar = cbx.b(b0kVar2).b;
                x0d.s(nim0Var, 16.0f, b0kVar2, false);
            }
            AccessoryImage accessoryImage = s8j0Var.d;
            if (accessoryImage == null) {
                b0kVar2.i0(295946439);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(295946440);
                kiv kivVar = AndroidCompositionLocals_androidKt.a;
                boolean z = ((Configuration) b0kVar2.k(kivVar)).smallestScreenWidthDp < 600;
                boolean z2 = ((Configuration) b0kVar2.k(kivVar)).orientation == 2;
                if (z && z2) {
                    b0kVar2.i0(-1698015722);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(-1698336696);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(b0kVar2).f;
                    b0k b0kVar3 = b0kVar2;
                    y9j0.m(accessoryImage, null, null, 120.0f, null, 6.0f, b0kVar3, AccessoryImage.$stable, 22);
                    b0kVar2 = b0kVar3;
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    x0d.s(nim0Var, f, b0kVar2, false);
                }
                b0kVar2.r(false);
            }
            String str = s8j0Var.e;
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            uwr uwrVar3 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            boolean zI = b0kVar2.i(ven0Var);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new bzm(ven0Var, (byte) 20);
                b0kVar2.s0(objT2);
            }
            b0k b0kVar4 = b0kVar2;
            bjc0 bjc0Var = bjc0.a;
            y9j0.j(0, 3, 0, 332, 0L, messageTemplateI, str, null, b0kVar4, (iu30) objT2, bjc0Var, null, lee1Var);
            cvx cvxVar3 = cbx.b(b0kVar4).b;
            op71.g(b0kVar4, u291.h(nim0Var, 8.0f));
            String str2 = s8j0Var.f;
            MessageTemplate messageTemplateI2 = p3d1.i(messageResponseToken);
            lee1 lee1Var2 = cbx.d(b0kVar4).j;
            boolean zI2 = b0kVar4.i(ven0Var);
            Object objT3 = b0kVar4.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new bzm(ven0Var, (byte) 21);
                b0kVar4.s0(objT3);
            }
            y9j0.c(0, 3, 0, 588, 0L, messageTemplateI2, str2, null, b0kVar4, (iu30) objT3, bjc0Var, null, lee1Var2);
            Button button = s8j0Var.g;
            iu30 iu30Var = this.b;
            if (button == null) {
                b0kVar4.i0(297512621);
                b0kVar4.r(false);
            } else {
                b0kVar4.i0(297512622);
                op71.g(b0kVar4, u291.h(nim0Var, cbx.b(b0kVar4).b.a));
                MessageTemplate template2 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN = anm1.N("messaging_bottomsheet_primary_button_tag", nim0Var);
                boolean zG = b0kVar4.g(iu30Var) | b0kVar4.i(button);
                Object objT4 = b0kVar4.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new u5a(iu30Var, button, (byte) 8);
                    b0kVar4.s0(objT4);
                }
                y9j0.e(button, template2, qim0VarN, null, null, bjc0Var, (Function0) objT4, b0kVar4, Button.$stable, 24);
                b0kVar4.r(false);
            }
            Button button2 = s8j0Var.h;
            if (button2 == null) {
                b0kVar4.i0(298019285);
                b0kVar4.r(false);
            } else {
                b0kVar4.i0(298019286);
                cvx cvxVar4 = cbx.b(b0kVar4).b;
                op71.g(b0kVar4, u291.h(nim0Var, f));
                MessageTemplate template3 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN2 = anm1.N("messaging_bottomsheet_secondary_button_tag", nim0Var);
                boolean zG2 = b0kVar4.g(iu30Var) | b0kVar4.i(button2);
                Object objT5 = b0kVar4.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new u5a(iu30Var, button2, (byte) 9);
                    b0kVar4.s0(objT5);
                }
                y9j0.e(button2, template3, qim0VarN2, null, null, null, (Function0) objT5, b0kVar4, Button.$stable, 56);
                b0kVar4.r(false);
            }
            b0kVar4.r(true);
            boolean zG3 = b0kVar4.g(iu30Var);
            Object objT6 = b0kVar4.T();
            if (zG3 || objT6 == m4cVar) {
                objT6 = new v5a(iu30Var, null, (byte) 7);
                b0kVar4.s0(objT6);
            }
            int i = MessageResponseToken.$stable;
            qxd0.s(y8j0Var, iu30Var, (vu30) objT6, b0kVar4);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
