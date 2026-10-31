package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a4f0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final psw b;
    public final Object c;
    public final mqw d;
    public final rqw e;

    public a4f0(ynb0 ynb0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = ynb0Var;
                this.d = k1o1.p();
                this.e = f3o1.u();
                j2i j2iVarJ = apo.j(-722117548, new vsb1(this, (byte) 23), true);
                ien0 ien0Var = qsw.a;
                this.b = new psw(j2iVarJ, (byte) 0);
                break;
            default:
                this.c = ynb0Var;
                this.d = x3p1.n(z1f0.d, z1f0.e, x5d0.a1, (o8n) null, new l6d0(this, (byte) 29), 8);
                this.e = n3o1.r(this).c(wud0.V0, wud0.W0);
                j2i j2iVar = wxi.b;
                ien0 ien0Var2 = qsw.a;
                this.b = new psw(j2iVar, (byte) 0);
                break;
        }
    }

    @Override // p.avl1
    public final rqw a() {
        switch (this.a) {
            case 0:
                return this.e;
            case 1:
                return (ia00) this.e;
            case 2:
                return (ia00) this.e;
            default:
                return (eih1) this.e;
        }
    }

    @Override // p.maa
    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public void e(int i, int i2, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-422611210);
        int i3 = i2 | (x340Var.i(function0) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131962540);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 15);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function1), new idx(i), anm1.N("skip_ad_element_button", nim0.a), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, gij.a, (vu30) null, gij.b, x340Var, 805306368, 48, 1496);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r491(this, function0, i, i2, (byte) 0);
        }
    }

    public void f(int i, int i2, Function0 function0, b0k b0kVar) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(682840592);
        int i3 = i2 | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.e(l1d.C(i)) ? 32 : 16);
        if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var2, 2131962541);
            String strO1 = cwl1.o0(x340Var2, 2131962540);
            if (ihc1.y0(strO1)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO1), function0);
            pex nexVar = s491.a[l1d.C(i)] == 1 ? pex.b : new nex(18);
            lex lexVarZ = yoo1.z(x340Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            x340Var = x340Var2;
            poo1.e(gbxVar, nexVar, lexVarZ, anm1.N("skip_ad_element_button", nim0.a), 0, strO0, (max) null, gij.c, (vu30) null, (idn0) null, (ga80) null, false, uyn1.h(2, 12.0f, 0.0f), apo.r(-1272649579, new nl41(strO0, (byte) 15), x340Var2), x340Var, 12582912, 3072, 3920);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r491(this, function0, i, i2, (byte) 1);
        }
    }

    @Override // p.maa
    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (js20) this.d;
            case 1:
                return (rey0) this.d;
            case 2:
                return this.d;
            default:
                return (rey0) this.d;
        }
    }

    public a4f0(Function0 function0) {
        this.a = (byte) 1;
        this.c = function0;
        this.d = k1o1.o(new f2z0(this, (byte) 19));
        this.e = n3o1.q(this).a(kxz0.T0, kxz0.U0);
        j2i j2iVarJ = apo.j(532845537, new zyy0(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVarJ, (byte) 0);
    }

    public a4f0(Flowable flowable, Flowable flowable2, w9u0 w9u0Var) {
        this.a = (byte) 2;
        this.c = w9u0Var;
        this.d = d4o1.g(Flowable.h(flowable.t(Functions.a), flowable2, r5x0.N0), new qd81(this, (byte) 4), new t491(this, (byte) 0), new d781(this, (byte) 18), 8);
        j2i j2iVarJ = apo.j(128946859, new u491(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVarJ, (byte) 0);
        this.e = n3o1.q(this).a(c781.U0, c781.V0);
    }
}
