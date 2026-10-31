package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hkr {
    public final void a(y8j0 y8j0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        hkr hkrVar;
        float f;
        qim0 qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1618743702);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(y8j0Var) : x340Var.i(y8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            hkrVar = this;
            i2 |= x340Var.g(hkrVar) ? 256 : 128;
        } else {
            hkrVar = this;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            eyo1 eyo1Var = y8j0Var.b;
            if (!(eyo1Var instanceof p8j0)) {
                hhg1.n("Failed requirement.");
                return;
            }
            AccessoryContent.Image image = ((p8j0) eyo1Var).d;
            boolean z = (image instanceof AccessoryContent.Image) && image.getAccessoryImage().getImageStyle() == ImageStyle.FULL_WIDTH;
            if (z) {
                x340Var.i0(834549208);
                x340Var.r(false);
                f = 0.0f;
            } else {
                x340Var.i0(834550332);
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            }
            float f2 = f;
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(101445463);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0Var2, cbx.b(x340Var).b.a, 0.0f, cbx.b(x340Var).b.a, 0.0f, 10);
                x340Var.r(false);
                qim0Var = qim0VarB;
            } else {
                x340Var.i0(101595410);
                x340Var.r(false);
                qim0Var = qim0Var2;
            }
            c(f2, ((i3 << 3) & 7168) | 6, 0, apo.r(1648823024, new bkr(hkrVar, y8j0Var, iu30Var, qim0Var, z), x340Var), x340Var, anm1.N("messaging_bottomsheet_base_tag", qim0Var2));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ckr(this, y8j0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void b(y8j0 y8j0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1790825781);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(y8j0Var) : x340Var.i(y8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c(0.0f, ((i2 << 3) & 7168) | 6, 4, apo.r(-1571682533, new dkr(this, y8j0Var, iu30Var), x340Var), x340Var, anm1.N("messaging_bottomsheet_basic_tag", nim0.a));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ckr(this, y8j0Var, iu30Var, i, (byte) 1);
        }
    }

    public final void c(float f, int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1565169129);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && x340Var.d(f)) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.a;
                i3 &= -897;
            }
            x340Var.s();
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0Var);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarP, f, 8.0f, f, cbx.b(x340Var).b.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            dv20.l(i3 & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        float f2 = f;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ekr(this, j2iVar, qim0Var, f2, i, i2, (byte) 0);
        }
    }

    public final void d(y8j0 y8j0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1082598856);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(y8j0Var) : x340Var.i(y8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c(0.0f, ((i2 << 3) & 7168) | 6, 0, apo.r(-868898530, new fkr(y8j0Var, iu30Var), x340Var), x340Var, anm1.N("messaging_bottomsheet_fullbleed_tag", nim0.a));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ckr(this, y8j0Var, iu30Var, i, (byte) 2);
        }
    }

    public final void e(y8j0 y8j0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(886655147);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(y8j0Var) : x340Var.i(y8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c(0.0f, ((i2 << 3) & 7168) | 6, 4, apo.r(916734469, new gkr(this, y8j0Var, iu30Var), x340Var), x340Var, anm1.N("messaging_bottomsheet_rich_tag", nim0.a));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ckr(this, y8j0Var, iu30Var, i, (byte) 3);
        }
    }
}
