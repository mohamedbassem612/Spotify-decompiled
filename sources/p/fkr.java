package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fkr extends hab0 implements vu30 {
    public final /* synthetic */ y8j0 a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkr(y8j0 y8j0Var, iu30 iu30Var) {
        super(2);
        this.a = y8j0Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        r8j0 r8j0Var;
        MessageResponseToken messageResponseToken;
        float f;
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            if (!(eyo1Var instanceof r8j0)) {
                hhg1.n("Failed requirement.");
                return null;
            }
            b0kVar2.i0(-277413787);
            r8j0 r8j0Var2 = (r8j0) eyo1Var;
            AccessoryImage accessoryImage = r8j0Var2.e;
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            boolean z = ((Configuration) b0kVar2.k(kivVar)).smallestScreenWidthDp < 600;
            boolean z2 = ((Configuration) b0kVar2.k(kivVar)).orientation == 2;
            if (z && z2) {
                b0kVar2.i0(-1710286829);
                b0kVar2.r(false);
                r8j0Var = r8j0Var2;
                messageResponseToken = messageResponseToken2;
                f = 16.0f;
            } else {
                b0kVar2.i0(-1710605881);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                r8j0Var = r8j0Var2;
                messageResponseToken = messageResponseToken2;
                f = 16.0f;
                y9j0.m(accessoryImage, qim0VarF2, null, 0.0f, new ecx(375.0f, 152.0f), 0.0f, b0kVar2, AccessoryImage.$stable, 12);
                b0kVar2 = b0kVar2;
                cvx cvxVar = cbx.b(b0kVar2).b;
                x0d.s(nim0Var, 16.0f, b0kVar2, false);
            }
            b0kVar2.r(false);
            String str = r8j0Var.c;
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).e;
            boolean zI = b0kVar2.i(ven0Var);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new bzm(ven0Var, (byte) 18);
                b0kVar2.s0(objT2);
            }
            b0k b0kVar3 = b0kVar2;
            bjc0 bjc0Var = bjc0.a;
            y9j0.j(0, 3, 0, 332, 0L, messageTemplateI, str, null, b0kVar3, (iu30) objT2, bjc0Var, null, lee1Var);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.h(nim0Var, 8.0f));
            String str2 = r8j0Var.d;
            MessageTemplate messageTemplateI2 = p3d1.i(messageResponseToken);
            lee1 lee1Var2 = cbx.d(b0kVar3).j;
            boolean zI2 = b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new bzm(ven0Var, (byte) 19);
                b0kVar3.s0(objT3);
            }
            y9j0.c(0, 3, 0, 588, 0L, messageTemplateI2, str2, null, b0kVar3, (iu30) objT3, bjc0Var, null, lee1Var2);
            Button button = r8j0Var.f;
            byte b = 6;
            iu30 iu30Var = this.b;
            if (button == null) {
                b0kVar3.i0(-8328544);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-8328543);
                op71.g(b0kVar3, u291.h(nim0Var, cbx.b(b0kVar3).b.a));
                MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN = anm1.N("messaging_bottomsheet_primary_button_tag", nim0Var);
                boolean zG = b0kVar3.g(iu30Var) | b0kVar3.i(button);
                Object objT4 = b0kVar3.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new u5a(iu30Var, button, b);
                    b0kVar3.s0(objT4);
                }
                y9j0.e(button, template, qim0VarN, null, null, bjc0Var, (Function0) objT4, b0kVar3, Button.$stable, 24);
                b0kVar3.r(false);
            }
            Button button2 = r8j0Var.g;
            if (button2 == null) {
                b0kVar3.i0(-7821880);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-7821879);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                op71.g(b0kVar3, u291.h(nim0Var, f));
                MessageTemplate template2 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN2 = anm1.N("messaging_bottomsheet_secondary_button_tag", nim0Var);
                boolean zG2 = b0kVar3.g(iu30Var) | b0kVar3.i(button2);
                Object objT5 = b0kVar3.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new u5a(iu30Var, button2, (byte) 7);
                    b0kVar3.s0(objT5);
                }
                y9j0.e(button2, template2, qim0VarN2, null, null, null, (Function0) objT5, b0kVar3, Button.$stable, 56);
                b0kVar3.r(false);
            }
            b0kVar3.r(true);
            boolean zG3 = b0kVar3.g(iu30Var);
            Object objT6 = b0kVar3.T();
            if (zG3 || objT6 == m4cVar) {
                objT6 = new v5a(iu30Var, null, b);
                b0kVar3.s0(objT6);
            }
            int i = MessageResponseToken.$stable;
            qxd0.s(y8j0Var, iu30Var, (vu30) objT6, b0kVar3);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
