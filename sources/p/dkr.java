package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dkr extends hab0 implements vu30 {
    public final /* synthetic */ y8j0 a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkr(hkr hkrVar, y8j0 y8j0Var, iu30 iu30Var) {
        super(2);
        this.a = y8j0Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarI = zr7.i(u291.f(nim0Var, 1.0f), new aw1((byte) 21, ((Boolean) ven0Var.getValue()).booleanValue()));
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
            y8j0 y8j0Var = this.a;
            eyo1 eyo1Var = y8j0Var.b;
            MessageResponseToken messageResponseToken = y8j0Var.a;
            if (!(eyo1Var instanceof q8j0)) {
                hhg1.n("Failed requirement.");
                return null;
            }
            q8j0 q8j0Var = (q8j0) eyo1Var;
            String str = q8j0Var.c;
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            boolean zI = x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new bzm(ven0Var, (byte) 16);
                x340Var2.s0(objT2);
            }
            bjc0 bjc0Var = bjc0.a;
            y9j0.j(0, 3, 0, 332, 0L, messageTemplateI, str, null, x340Var2, (iu30) objT2, bjc0Var, null, lee1Var);
            cvx cvxVar = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
            String str2 = q8j0Var.d;
            MessageTemplate messageTemplateI2 = p3d1.i(messageResponseToken);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            boolean zI2 = x340Var2.i(ven0Var);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new bzm(ven0Var, (byte) 17);
                x340Var2.s0(objT3);
            }
            y9j0.c(0, 3, 0, 588, 0L, messageTemplateI2, str2, null, x340Var2, (iu30) objT3, bjc0Var, null, lee1Var2);
            Button button = q8j0Var.e;
            iu30 iu30Var = this.b;
            if (button == null) {
                x340Var2.i0(-1565723101);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1565723100);
                op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.a));
                MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN = anm1.N("messaging_bottomsheet_primary_button_tag", nim0Var);
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(button);
                Object objT4 = x340Var2.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new u5a(iu30Var, button, (byte) 4);
                    x340Var2.s0(objT4);
                }
                y9j0.e(button, template, qim0VarN, null, null, bjc0Var, (Function0) objT4, x340Var2, Button.$stable, 24);
                x340Var2.r(false);
            }
            Button button2 = q8j0Var.f;
            byte b = 5;
            if (button2 == null) {
                x340Var2.i0(-1565216437);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1565216436);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                MessageTemplate template2 = messageResponseToken.getMessageData().getFormat().getTemplate();
                qim0 qim0VarN2 = anm1.N("messaging_bottomsheet_secondary_button_tag", nim0Var);
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.i(button2);
                Object objT5 = x340Var2.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new u5a(iu30Var, button2, b);
                    x340Var2.s0(objT5);
                }
                y9j0.e(button2, template2, qim0VarN2, null, null, null, (Function0) objT5, x340Var2, Button.$stable, 56);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            boolean zG3 = x340Var2.g(iu30Var);
            Object objT6 = x340Var2.T();
            if (zG3 || objT6 == m4cVar) {
                objT6 = new v5a(iu30Var, null, b);
                x340Var2.s0(objT6);
            }
            int i = MessageResponseToken.$stable;
            qxd0.s(y8j0Var, iu30Var, (vu30) objT6, x340Var2);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
