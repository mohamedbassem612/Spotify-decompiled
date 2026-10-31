package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nas {
    public final void a(MessageResponseToken messageResponseToken, cdj0 cdj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1798245279);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(messageResponseToken) : x340Var.i(messageResponseToken) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(cdj0Var) : x340Var.i(cdj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ModalTemplate.BaseModal baseModalI = p3d1.i(messageResponseToken);
            int i3 = MessageResponseToken.$stable | (i2 & 14);
            int i4 = BackgroundColor.$stable | AccessoryContent.$stable;
            int i5 = MessageText.$stable;
            int i6 = i4 | i5 | i5;
            int i7 = Button.$stable;
            int i8 = i3 | ((((i6 | i7) | i7) | Disclaimer.$stable) << 3) | (i2 & 112);
            int i9 = i2 << 3;
            c(messageResponseToken, cdj0Var, baseModalI, iu30Var, x340Var, (i9 & 57344) | i8 | (i9 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jas(this, messageResponseToken, cdj0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void b(MessageResponseToken messageResponseToken, cdj0 cdj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(363875392);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(messageResponseToken) : x340Var.i(messageResponseToken) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(cdj0Var) : x340Var.i(cdj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ModalTemplate.BasicModal basicModalI = p3d1.i(messageResponseToken);
            int i3 = MessageResponseToken.$stable | (i2 & 14);
            int i4 = BackgroundColor.$stable | AccessoryContent.$stable;
            int i5 = MessageText.$stable;
            int i6 = i4 | i5 | i5;
            int i7 = Button.$stable;
            int i8 = i3 | ((((i6 | i7) | i7) | Disclaimer.$stable) << 3) | (i2 & 112);
            int i9 = i2 << 3;
            c(messageResponseToken, cdj0Var, basicModalI, iu30Var, x340Var, (i9 & 57344) | i8 | (i9 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jas(this, messageResponseToken, cdj0Var, iu30Var, i, (byte) 1);
        }
    }

    public final void c(MessageResponseToken messageResponseToken, cdj0 cdj0Var, ModalTemplate modalTemplate, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        iu30 iu30Var2;
        cdj0 cdj0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1033788203);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(messageResponseToken) : b0kVar3.i(messageResponseToken) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(cdj0Var) : b0kVar3.i(cdj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(modalTemplate) : b0kVar3.i(modalTemplate) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(this) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            float fU0 = ((wat) b0kVar3.k(t4k.h)).U0();
            b0kVar3.i0(1333029492);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            BackgroundColor backgroundColor = cdj0Var.a;
            if (backgroundColor != null) {
                b0kVar3.i0(-1445034535);
                MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                qim0VarD = y9j0.r(qim0VarD, template, backgroundColor, 8.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1847721422);
                b0kVar3.r(false);
            }
            b0kVar3.r(false);
            uwr uwrVar2 = cbx.a;
            float f = cbx.b(b0kVar3).b.d;
            float f2 = cbx.b(b0kVar3).b.d;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            iu30Var2 = iu30Var;
            cdj0Var2 = cdj0Var;
            b0kVar2 = b0kVar3;
            w2g0.c(uyn1.A(qim0VarD, 16.0f, f, 16.0f, f2), (tl3) null, apo.r(-41814783, new kas(es41VarC, cdj0Var, modalTemplate, fU0, this, iu30Var), b0kVar3), b0kVar2, 3072, 6);
            int i3 = i2 & 7168;
            boolean zI = b0kVar2.i(es41VarC) | (i3 == 2048);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new n5s(es41VarC, iu30Var2, (lnm) null, (byte) 3);
                b0kVar2.s0(objT);
            }
            qxd0.t(es41VarC, b0kVar2, (vu30) objT);
            boolean z = i3 == 2048;
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new v5a(iu30Var2, null, (byte) 9);
                b0kVar2.s0(objT2);
            }
            BackgroundColor.Companion companion = BackgroundColor.Companion;
            AccessoryContent.Companion companion2 = AccessoryContent.Companion;
            MessageText.Companion companion3 = MessageText.Companion;
            Button.Companion companion4 = Button.Companion;
            Disclaimer.Companion companion5 = Disclaimer.INSTANCE;
            qxd0.s(cdj0Var2, iu30Var2, (vu30) objT2, b0kVar2);
        } else {
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            cdj0Var2 = cdj0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 1, i, this, messageResponseToken, cdj0Var2, modalTemplate, iu30Var2);
        }
    }
}
