package p;

import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h6c0 implements mtm1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ h6c0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.mtm1
    public final String a(mhy mhyVar) {
        switch (this.a) {
            case 0:
                return l1d.m("library_import_match_result_", ((ehy) mhyVar).getId());
            case 1:
                return "dsa_banner";
            case 2:
                return l1d.m("hint_", ((ehy) mhyVar).getId());
            case 3:
                return l1d.m("inline_card_", ((fhy) mhyVar).b.getRequestId());
            case 4:
                return "onboarding_".concat(rjx.D(((ghy) mhyVar).a));
            case 5:
                return "onboarding_".concat(rjx.D(((ghy) mhyVar).a));
            case 6:
                return "pins_section";
            case 7:
                return l1d.m("header_", ((khy) mhyVar).a);
            default:
                return "sort_options";
        }
    }

    @Override // p.mtm1
    public final kpg0 b(ft30 ft30Var) {
        umf0 umf0Var;
        dtr dtrVar;
        ldo ldoVar;
        w2s w2sVar;
        br0 br0Var;
        umf0 umf0Var2;
        res resVar;
        res resVar2;
        dtr dtrVar2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zhp zhpVar = (zhp) obj;
                switch (zhpVar.a) {
                    case 0:
                        k6c0 k6c0VarR = ((fip) zhpVar.b.c).b.R();
                        c8o.l(k6c0VarR);
                        umf0Var = new umf0(k6c0VarR, ft30Var);
                        break;
                    case 1:
                        k6c0 k6c0VarR2 = ((lvq) ((tsq) zhpVar.b).c).b.R();
                        c8o.l(k6c0VarR2);
                        umf0Var = new umf0(k6c0VarR2, ft30Var);
                        break;
                    default:
                        k6c0 k6c0VarR3 = ((ovq) ((tsq) zhpVar.b).c).b.R();
                        c8o.l(k6c0VarR3);
                        umf0Var = new umf0(k6c0VarR3, ft30Var);
                        break;
                }
                return new kpg0(umf0Var, hyb0.Y);
            case 1:
                switch (((yhp) obj).a) {
                    case 0:
                        dtrVar = new dtr(ft30Var, (byte) 0);
                        break;
                    case 1:
                        dtrVar = new dtr(ft30Var, (byte) 0);
                        break;
                    default:
                        dtrVar = new dtr(ft30Var, (byte) 0);
                        break;
                }
                return new kpg0(dtrVar, tsm1.c);
            case 2:
                cip cipVar = (cip) obj;
                switch (cipVar.a) {
                    case 0:
                        ltm1 ltm1VarE0 = ((fip) cipVar.b.c).b.e0();
                        c8o.l(ltm1VarE0);
                        ldoVar = new ldo(ltm1VarE0, ft30Var);
                        break;
                    case 1:
                        ltm1 ltm1VarE1 = ((lvq) ((tsq) cipVar.b).c).b.e0();
                        c8o.l(ltm1VarE1);
                        ldoVar = new ldo(ltm1VarE1, ft30Var);
                        break;
                    default:
                        ltm1 ltm1VarE2 = ((ovq) ((tsq) cipVar.b).c).b.e0();
                        c8o.l(ltm1VarE2);
                        ldoVar = new ldo(ltm1VarE2, ft30Var);
                        break;
                }
                return new kpg0(ldoVar, new yvf1(this, (byte) 24));
            case 3:
                dip dipVar = (dip) obj;
                switch (dipVar.a) {
                    case 0:
                        fip fipVar = (fip) dipVar.b.c;
                        pd80 pd80VarB = fipVar.b.B();
                        c8o.l(pd80VarB);
                        iac0 iac0Var = (iac0) fipVar.n.get();
                        q130 q130Var = fipVar.b;
                        xfx xfxVarC0 = q130Var.c0();
                        c8o.l(xfxVarC0);
                        hjc hjcVar = new hjc(xfxVarC0.b, (byte) 0);
                        Scheduler schedulerD0 = q130Var.d0();
                        c8o.l(schedulerD0);
                        w2sVar = new w2s(pbo0.a, pd80VarB, iac0Var, hjcVar, schedulerD0, ft30Var);
                        break;
                    case 1:
                        lvq lvqVar = (lvq) ((tsq) dipVar.b).c;
                        z67 z67Var = (z67) lvqVar.N.get();
                        pd80 pd80VarB2 = lvqVar.b.B();
                        c8o.l(pd80VarB2);
                        iac0 iac0Var2 = (iac0) lvqVar.w.get();
                        kvm1 kvm1Var = lvqVar.b;
                        xfx xfxVarC1 = kvm1Var.c0();
                        c8o.l(xfxVarC1);
                        hjc hjcVar2 = new hjc(xfxVarC1.b, (byte) 0);
                        Scheduler schedulerD1 = kvm1Var.d0();
                        c8o.l(schedulerD1);
                        w2sVar = new w2s(z67Var, pd80VarB2, iac0Var2, hjcVar2, schedulerD1, ft30Var);
                        break;
                    default:
                        ovq ovqVar = (ovq) ((tsq) dipVar.b).c;
                        pd80 pd80Var = (pd80) ovqVar.b.d.get();
                        c8o.l(pd80Var);
                        iac0 iac0Var3 = (iac0) ovqVar.m.get();
                        xvm1 xvm1Var = ovqVar.b;
                        xfx xfxVarC2 = xvm1Var.c0();
                        c8o.l(xfxVarC2);
                        hjc hjcVar3 = new hjc(xfxVarC2.b, (byte) 0);
                        Scheduler schedulerD2 = xvm1Var.d0();
                        c8o.l(schedulerD2);
                        w2sVar = new w2s(pbo0.a, pd80Var, iac0Var3, hjcVar3, schedulerD2, ft30Var);
                        break;
                }
                return new kpg0(q1o1.u(w2sVar, (qim0) null, (FrameLayout.LayoutParams) null, 7), tsm1.g);
            case 4:
                switch (((eip) obj).a) {
                    case 0:
                        br0Var = new br0(ft30Var);
                        break;
                    case 1:
                        br0Var = new br0(ft30Var);
                        break;
                    default:
                        br0Var = new br0(ft30Var);
                        break;
                }
                return new kpg0(br0Var, new yvf1(this, (byte) 25));
            case 5:
                ohp ohpVar = (ohp) obj;
                switch (ohpVar.a) {
                    case 0:
                        umf0Var2 = new umf0(((fip) ohpVar.b.c).i(), ft30Var);
                        break;
                    case 1:
                        umf0Var2 = new umf0(((lvq) ((tsq) ohpVar.b).c).n(), ft30Var);
                        break;
                    default:
                        umf0Var2 = new umf0(((ovq) ((tsq) ohpVar.b).c).i(), ft30Var);
                        break;
                }
                return new kpg0(umf0Var2, new yvf1(this, (byte) 26));
            case 6:
                php phpVar = (php) obj;
                switch (phpVar.a) {
                    case 0:
                        fip fipVar2 = (fip) phpVar.b.c;
                        stm1 stm1VarH = fipVar2.h();
                        stm1 stm1VarG = fipVar2.g();
                        lqr lqrVar = new lqr(fipVar2.c(), (byte) 12);
                        z0t z0tVarA0 = fipVar2.b.a0();
                        c8o.l(z0tVarA0);
                        resVar = new res(stm1VarH, stm1VarG, lqrVar, z0tVarA0, ft30Var);
                        resVar2 = resVar;
                        break;
                    case 1:
                        lvq lvqVar2 = (lvq) ((tsq) phpVar.b).c;
                        stm1 stm1VarL = lvqVar2.l();
                        stm1 stm1VarK = lvqVar2.k();
                        lqr lqrVar2 = new lqr(lvqVar2.e(), (byte) 12);
                        z0t z0tVarA1 = lvqVar2.b.a0();
                        c8o.l(z0tVarA1);
                        resVar = new res(stm1VarL, stm1VarK, lqrVar2, z0tVarA1, ft30Var);
                        resVar2 = resVar;
                        break;
                    default:
                        ovq ovqVar2 = (ovq) ((tsq) phpVar.b).c;
                        stm1 stm1VarH2 = ovqVar2.h();
                        stm1 stm1VarG2 = ovqVar2.g();
                        lqr lqrVar3 = new lqr(ovqVar2.c(), (byte) 12);
                        z0t z0tVarA2 = ovqVar2.b.a0();
                        c8o.l(z0tVarA2);
                        resVar2 = new res(stm1VarH2, stm1VarG2, lqrVar3, z0tVarA2, ft30Var);
                        break;
                }
                return new kpg0(resVar2, tsm1.i);
            case 7:
                return new kpg0((nu) obj, tsm1.t);
            default:
                switch (((qhp) obj).a) {
                    case 0:
                        dtrVar2 = new dtr(ft30Var, (byte) 1);
                        break;
                    case 1:
                        dtrVar2 = new dtr(ft30Var, (byte) 1);
                        break;
                    default:
                        dtrVar2 = new dtr(ft30Var, (byte) 1);
                        break;
                }
                return new kpg0(dtrVar2, new yvf1(this, (byte) 27));
        }
    }
}
