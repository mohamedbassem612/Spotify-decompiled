package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class af80 {
    public final gw70 a;

    public /* synthetic */ af80(gw70 gw70Var) {
        this.a = gw70Var;
    }

    public void a(ksw kswVar, lbj0 lbj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-69459109);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(lbj0Var) : x340Var.i(lbj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b(kswVar, apo.r(-654844326, new ve80(lbj0Var, this, iu30Var), x340Var), anm1.N("messaging_inlinecard_compact", nim0.a), x340Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new we80(this, kswVar, lbj0Var, iu30Var, i, (byte) 0);
        }
    }

    public void b(ksw kswVar, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1636677144);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(kswVar, x340Var, Integer.valueOf(i2 & 126));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, kswVar, j2iVar, qim0Var, (byte) 21);
        }
    }

    public void c(ksw kswVar, lbj0 lbj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2062845459);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(lbj0Var) : x340Var.i(lbj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b(kswVar, apo.r(-1354706316, new xe80(lbj0Var, this, iu30Var), x340Var), anm1.N("messaging_inlinecard_micro_compact", nim0.a), x340Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new we80(this, kswVar, lbj0Var, iu30Var, i, (byte) 1);
        }
    }

    public void d(Button button, MessageTemplate messageTemplate, String str, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(374849411);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarN = anm1.N(str, nim0.a);
            z8j0 z8j0Var = new z8j0(yla.s(x340Var), 14);
            z8j0 z8j0Var2 = new z8j0(yla.s(x340Var).a(), 5, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), er31.b(0.0f));
            int i3 = i2 & 14;
            boolean z = ((i2 & 7168) == 2048) | (i3 == 4 || ((i2 & 8) != 0 && x340Var.i(button)));
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new u5a(iu30Var, button, (byte) 15);
                x340Var.s0(objT);
            }
            y9j0.e(button, messageTemplate, qim0VarN, z8j0Var, z8j0Var2, null, (Function0) objT, x340Var, Button.$stable | i3 | (i2 & 112), 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 20, i, this, button, messageTemplate, iu30Var, str);
        }
    }

    public void e(ksw kswVar, lbj0 lbj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(360398225);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(lbj0Var) : x340Var.i(lbj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b(kswVar, apo.r(-606674318, new ze80(lbj0Var, this, iu30Var), x340Var), anm1.N("messaging_inlinecard_standard", nim0.a), x340Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new we80(this, kswVar, lbj0Var, iu30Var, i, (byte) 2);
        }
    }
}
