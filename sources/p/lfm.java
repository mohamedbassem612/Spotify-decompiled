package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lfm implements cvl1, xpw {
    public final /* synthetic */ byte a;
    public final rey0 b;
    public final hy00 c;
    public final psw d;

    public lfm(g210 g210Var) {
        this.a = (byte) 0;
        this.b = new rey0(new mgl(g210Var, this));
        this.c = n3o1.r(this).c(fdm.h, fdm.t);
        j2i j2iVar = new j2i(-786578600, new bfm(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void e(kem kemVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1602454267);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(kemVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iC = l1d.C(kemVar.a);
            if (iC == 0) {
                x340Var.i0(1934714441);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 1934711766, false);
                }
                x340Var.i0(1934716780);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            }
            qim0 qim0VarN = anm1.N("standard_header_action_context_menu", nim0.a);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131962900);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jzk(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1258007822, new sre((byte) 12, j), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, kemVar, iu30Var, i, (byte) 14);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.b;
    }

    public lfm(a9h a9hVar, dof1 dof1Var, pjf0 pjf0Var, vgb vgbVar) {
        this.a = (byte) 1;
        this.b = new rey0(new cex(pjf0Var, this, vgbVar));
        this.c = n3o1.r(this).c(new wh(dof1Var, a9hVar, (byte) 12), vn50.g);
        j2i j2iVar = pri.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
