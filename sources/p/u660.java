package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u660 implements xpw {
    public final dlg1 a;
    public final z710 b;
    public final ia00 c = n3o1.q(this).a(vn50.S0, vn50.T0);
    public final rey0 d = new rey0(new gn50(this, (byte) 10));
    public final psw e;

    public u660(dlg1 dlg1Var, z710 z710Var) {
        this.a = dlg1Var;
        this.b = z710Var;
        j2i j2iVar = new j2i(776659458, new zq30(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(t660 t660Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-550712146);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(t660Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).a.c;
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.9f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                b0kVar3.s0(objT);
            }
            List list = (List) objT;
            qim0 qim0VarR = i1p1.r(u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3));
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = v160.T0;
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarR, true, (iu30) objT2);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131957188);
            boolean z = (i2 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z || objT3 == obj) {
                objT3 = new u460(iu30Var, (byte) 1);
                b0kVar3.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarB, (tl3) null, d4o1.a, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(1611550181, new cy00(t660Var, list, iu30Var, (byte) 12), b0kVar3), b0kVar2, 24960, 48, 1514);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(this, t660Var, iu30Var, i, (byte) 26);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
