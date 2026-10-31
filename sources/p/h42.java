package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h42 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(boolean z, iu30 iu30Var, drr0 drr0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = z;
        this.d = iu30Var;
        this.e = drr0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h42 h42Var = new h42((i42) this.e, (lnm) obj3);
                h42Var.d = (vr20) obj;
                h42Var.c = zBooleanValue;
                return h42Var.invokeSuspend(rih1Var);
            case 1:
                ((Number) obj2).floatValue();
                return new h42(this.c, (iu30) this.d, (drr0) this.e, (lnm) obj3).invokeSuspend(rih1Var);
            default:
                h42 h42Var2 = new h42(this.c, (lnm) obj3);
                h42Var2.d = (vr20) obj;
                h42Var2.e = obj2;
                return h42Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i42 i42Var = (i42) this.e;
                vr20 vr20Var = (vr20) this.d;
                boolean z = this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!z) {
                    return rih1Var;
                }
                wt20 wt20VarF = z4p1.F(new gk(ezn1.o(i42Var.b.a).a(), i42Var, (byte) 12), 1);
                this.d = null;
                this.c = z;
                this.b = true;
                return l4p1.s(vr20Var, wt20VarF, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                drr0 drr0Var = (drr0) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!this.c ? drr0Var.s() <= 150.0f : (-drr0Var.s()) <= 150.0f) {
                    ((iu30) this.d).invoke(ipe.a);
                    drr0Var.t(0.0f);
                    return rih1Var;
                }
                float fS = drr0Var.s();
                n8b1 n8b1VarL0 = irn1.l0(0.5f, 1500.0f, null, 4);
                lb7 lb7Var = new lb7(drr0Var, (byte) 1);
                this.b = true;
                return wwo1.t(fS, 0.0f, n8b1VarL0, lb7Var, this, 4) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.d;
                Object obj2 = this.e;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    q0p0 q0p0Var = (q0p0) obj2;
                    int i = q0p0Var == null ? -1 : r0p0.a[q0p0Var.ordinal()];
                    if (i == -1) {
                        huzVar = new huz((Object) null, (byte) 10);
                    } else if (i == 1) {
                        tka0 tka0VarB = rc11.a.b(o0p0.class);
                        boolean z5 = this.c;
                        huzVar = new huz(new p0p0(tka0VarB, vhc.e(15, false, false, false, z5, !z5)), (byte) 10);
                    } else if (i == 2) {
                        huzVar = new huz(new p0p0(rc11.a.b(dqd0.class), pzm.g("large_screen_layout_enabled", this.c)), (byte) 10);
                    } else {
                        eg.o();
                    }
                    this.d = null;
                    this.e = null;
                    this.b = true;
                    return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(i42 i42Var, lnm lnmVar) {
        super(3, lnmVar);
        this.e = i42Var;
    }
}
