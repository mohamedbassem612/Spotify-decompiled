package p;

import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fty implements tyq {
    public final Flowable a;
    public final w9u0 b;
    public final d0r c;
    public final boolean d;
    public final boolean e;
    public final o3r f = w3p1.n(new l4r(new xv00(rc11.a.b(mtl.class)), 2, rqy.R0, new j4r(rqy.O0), rqy.S0), new l4r(pwc0.b, 2, rqy.T0, new j4r(rqy.P0), rqy.U0), lgx.b1);
    public final js20 g = x3p1.n(new dty(this, (byte) 0), new dty(this, (byte) 1), lgx.a1, (o8n) null, new dty(this, (byte) 2), 8);
    public final psw h;
    public final ia00 i;

    public fty(Flowable flowable, w9u0 w9u0Var, d0r d0rVar, boolean z, boolean z2) {
        this.a = flowable;
        this.b = w9u0Var;
        this.c = d0rVar;
        this.d = z;
        this.e = z2;
        j2i j2iVar = new j2i(1652161638, new yhy(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(c9x.Y0, c9x.Z0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.h;
    }

    public final d0r e() {
        return this.c;
    }

    public final void f(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1659797162);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48 | (x340Var.h(z) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new ivw(function0, (byte) 9);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(new y50(str), (Function0) objT);
            pex nexVar = z ? pex.b : new nex(18);
            lex lexVarZ = yoo1.z(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 12.0f, 0.0f);
            qim0Var2 = nim0.a;
            poo1.e(gbxVar, nexVar, lexVarZ, qim0Var2, 0, str, (max) null, nmi.a, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, apo.r(-1576360015, new qeu(str, (byte) 22), x340Var), x340Var, 12585984 | ((i2 << 6) & 458752), 3072, 3920);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(this, function0, qim0Var2, z, str, i);
        }
    }

    public final bty g(wsy wsyVar, String str, boolean z) {
        if (this.d) {
            String str2 = wsyVar.b;
            if (str2 != null && str2.length() != 0) {
                return new aty(str, str2, z);
            }
        } else if (wsyVar.a == ktl.c) {
            return new zsy(str, z);
        }
        return ysy.a;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
