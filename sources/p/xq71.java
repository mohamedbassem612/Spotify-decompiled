package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xq71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ yq71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq71(yq71 yq71Var, q5t0 q5t0Var) {
        super(1);
        this.c = yq71Var;
        this.b = q5t0Var;
    }

    public final Object invoke(Object obj) {
        long j;
        long jB;
        long j2;
        elb0 elb0VarB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yq71 yq71Var = this.c;
        q5t0 q5t0Var = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                yq71Var.R0 = true;
                yq71Var.Q0 = null;
                vv71 vv71VarV = yq71Var.S0.k().c.v();
                if (!yq71Var.S0.q()) {
                    p5t0.g(0, 0, p5t0Var, q5t0Var);
                    return rih1Var;
                }
                if (!vv71VarV.d()) {
                    p5t0.g(0, 0, p5t0Var, q5t0Var);
                    return rih1Var;
                }
                ua91 ua91VarE = vv71VarV.e();
                if (ua91VarE != null) {
                    n511 n511VarC = vv71VarV.c();
                    if (n511VarC != null) {
                        if (!yq71Var.S0.k().b.c()) {
                            if (yq71Var.S0.c().b()) {
                                p5t0.g(0, 0, p5t0Var, q5t0Var);
                                return rih1Var;
                            }
                            elb0 elb0VarB2 = p5t0Var.b();
                            long jC0 = elb0VarB2 != null ? dm5.c0(Offset.f(n511VarC.h(), yq71Var.I1().K(elb0VarB2, 0L))) : 0L;
                            p5t0Var.f(q5t0Var, (int) (jC0 >> 32), (int) (jC0 & 4294967295L), 0.0f);
                            return rih1Var;
                        }
                        elb0 elb0VarB3 = p5t0Var.b();
                        if (elb0VarB3 == null) {
                            p5t0Var.f(q5t0Var, 0, 0, 0.0f);
                            return rih1Var;
                        }
                        boolean zB = yq71Var.S0.k().c.v().b();
                        long jK = yq71Var.I1().K(elb0VarB3, 0L);
                        f4p1.p(ua91VarE);
                        ys71 ys71Var = yq71Var.S0;
                        if (zB) {
                            j = jK;
                            ys71Var.c().a(n511VarC, f4p1.p(ua91VarE), null, yq71Var.O0, yq71Var.P0);
                        } else {
                            j = jK;
                            ys71Var.c().a(n511VarC, f4p1.p(ua91VarE), new wq71((byte) 0), yq71Var.O0, yq71Var.P0);
                        }
                        yq71Var.O0 = null;
                        yq71Var.P0 = null;
                        n511 n511VarC2 = yq71Var.S0.c().c();
                        Offset offset = n511VarC2 != null ? new Offset(Offset.g(Offset.f(n511VarC2.h(), ((Offset) ((hrr0) ua91VarE.c).getValue()).a), ((Offset) ((hrr0) ua91VarE.e).getValue()).a)) : null;
                        if (yq71Var.S0.c().b() || !zB) {
                            long j3 = offset != null ? offset.a : j;
                            yq71Var.S0.k().c.v().i(offset == null ? anm1.g(j, o0c.R(elb0VarB3.b())) : anm1.g(offset.a, n511VarC2.g()));
                            jB = j3;
                        } else {
                            jB = offset != null ? offset.a : n511VarC.h();
                        }
                        ft71 ft71VarA = yq71Var.S0.a();
                        if (ft71VarA == null || !ft71VarA.n()) {
                            j2 = jB;
                        } else {
                            j2 = !yq71Var.S0.c().d() ? j : jB;
                            elb0 elb0Var = ft71VarA.e;
                            if (elb0Var != null && elb0Var.a() && yq71Var.I1().a()) {
                                jB = vs71.b(jB, vs71.a(elb0Var, yq71Var.I1(), ft71VarA.f()), 0L, ft71VarA.e());
                                j2 = jB;
                            }
                        }
                        long jK2 = elb0VarB3.K(yq71Var.I1(), j2);
                        p5t0Var.f(q5t0Var, Math.round(Float.intBitsToFloat((int) (jK2 >> 32))), Math.round(Float.intBitsToFloat((int) (jK2 & 4294967295L))), 0.0f);
                        return rih1Var;
                    }
                    bhn0.s(vv71VarV, "Match State is configured, but current bounds is null. State = ");
                } else {
                    bhn0.s(vv71VarV, "Match State is configured, but target data is null. State = ");
                }
                return null;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0.g(0, 0, p5t0Var2, q5t0Var);
                xs71 xs71VarK = yq71Var.S0.k();
                ys71 ys71Var2 = yq71Var.S0;
                wv71 wv71Var = xs71VarK.c;
                wv71Var.x();
                if (u890.j(wv71Var.v(), lbo0.a) || !ys71Var2.q()) {
                    return rih1Var;
                }
                vv71 vv71VarV2 = wv71Var.v();
                if (!ys71Var2.c().b() || !vv71VarV2.b() || (elb0VarB = p5t0Var2.b()) == null) {
                    return rih1Var;
                }
                long jR = o0c.R(elb0VarB.b());
                pv71 pv71Var = ys71Var2.k().b;
                elb0 elb0Var2 = ys71Var2.k().b.f;
                if (elb0Var2 != null) {
                    long jB2 = pv71Var.a.b(elb0Var2, elb0VarB);
                    pv71 pv71Var2 = ys71Var2.k().b;
                    elb0 elb0Var3 = ys71Var2.k().b.f;
                    if (elb0Var3 != null) {
                        long jQ = elb0.Q(elb0Var3, elb0VarB, 2);
                        wv71 wv71Var2 = xs71VarK.c;
                        vv71 vv71VarV3 = wv71Var2.v();
                        xs71 xs71Var = (xs71) wv71Var2.d;
                        yq71 yq71Var2 = (yq71) wv71Var2.h;
                        yq71Var2.getClass();
                        ((hrr0) wv71Var2.e).setValue(vv71VarV3.a(xs71Var, yq71Var2, jR, jB2, jQ));
                        return rih1Var;
                    }
                    hhg1.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                } else {
                    hhg1.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq71(q5t0 q5t0Var, yq71 yq71Var) {
        super(1);
        this.b = q5t0Var;
        this.c = yq71Var;
    }
}
