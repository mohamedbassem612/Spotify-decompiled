package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rb30 implements xpw {
    public final ipq a;
    public final ljm0 b = h7w.B(new sty(1, this, rb30.class, "propsToState", "propsToState(Lcom/spotify/settings/platform/api/items/SettingsFootnote;)Lcom/spotify/settings/platform/page/main/FootnoteSettingsElement$State;", 0, (byte) 29), null, null, new wx00(this, 13), 6);
    public final ia00 c = qro1.q(n3o1.q(this), j830.f, new kds(this, (byte) 12));
    public final psw d;

    public rb30(ipq ipqVar) {
        this.a = ipqVar;
        j2i j2iVar = new j2i(-1080138106, new yhy(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(ye5 ye5Var, kq61 kq61Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1680461381);
        int i2 = i | (x340Var.i(ye5Var) ? 4 : 2) | (x340Var.i(kq61Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            String strO0 = cwl1.o0(x340Var, kq61Var.g());
            if (kq61Var instanceof jq61) {
                x340Var.i0(15691024);
                String str = ((jq61) kq61Var).b;
                boolean zI = x340Var.i(kq61Var) | ((i2 & 896) == 256);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zf10(iu30Var, kq61Var, (byte) 17);
                    x340Var.s0(objT2);
                }
                vhg.d(ye5Var, strO0, str, (iu30) objT2);
                x340Var.r(false);
            } else {
                if (!(kq61Var instanceof iq61)) {
                    throw p3d1.k(x340Var, 15690142, false);
                }
                x340Var.i0(15694569);
                String str2 = ((iq61) kq61Var).b;
                boolean zI2 = x340Var.i(c9nVar) | ((i2 & 896) == 256) | x340Var.i(this) | x340Var.i(kq61Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    lhx lhxVar = new lhx(c9nVar, iu30Var, this, kq61Var, (byte) 10);
                    x340Var.s0(lhxVar);
                    objT3 = lhxVar;
                }
                vhg.b(ye5Var, strO0, str2, (iu30) objT3);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, this, ye5Var, kq61Var, iu30Var, (byte) 18);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
