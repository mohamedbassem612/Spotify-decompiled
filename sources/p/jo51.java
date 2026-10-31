package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jo51 extends k9 {
    public static final ke5 T0 = new ke5(0.0f);
    public static final ke5 U0 = new ke5(1.0f);
    public long N0;
    public final wdn0 O0;
    public co51 P0;
    public final bo51 Q0;
    public float R0;
    public final bo51 S0;
    public ohd X;
    public final xgn0 Y;
    public final qfn0 Z;
    public final hrr0 c;
    public final hrr0 d;
    public Object e;
    public mhg1 f;
    public long g;
    public final ww21 h;
    public gw91 i;
    public final drr0 t;

    public jo51(hnn0 hnn0Var) {
        super((byte) 18);
        this.c = xto.t(hnn0Var);
        this.d = xto.t(hnn0Var);
        this.e = hnn0Var;
        this.h = new ww21(this, (byte) 6);
        this.t = exd0.u(0.0f);
        this.Y = ygn0.a();
        this.Z = new qfn0();
        this.N0 = Long.MIN_VALUE;
        this.O0 = new wdn0();
        this.Q0 = new bo51(this, (byte) 0);
        this.S0 = new bo51(this, (byte) 1);
    }

    public static void y1(co51 co51Var, long j) {
        long jE = co51Var.e() + j;
        co51Var.k(jE);
        long jB = co51Var.b();
        if (jE >= jB) {
            co51Var.l(1.0f);
            return;
        }
        fui1 fui1VarA = co51Var.a();
        if (fui1VarA == null) {
            float f = jE / jB;
            co51Var.l((f * 1.0f) + ((1.0f - f) * co51Var.f().a(0)));
            return;
        }
        ke5 ke5VarF = co51Var.f();
        ke5 ke5VarD = co51Var.d();
        if (ke5VarD == null) {
            ke5VarD = T0;
        }
        co51Var.l(yoi1.o(((ke5) fui1VarA.n(jE, ke5VarF, U0, ke5VarD)).a(0), 0.0f, 1.0f));
    }

    public final Object A1(float f, Object obj, a8d1 a8d1Var) {
        if (0.0f > f || f > 1.0f) {
            dmv0.a("Expecting fraction between 0 and 1. Got " + f);
        }
        mhg1 mhg1Var = this.f;
        if (mhg1Var != null) {
            Object objA = qfn0.a(this.Z, new go51(obj, this.c.getValue(), this, mhg1Var, f, (lnm) null), a8d1Var);
            if (objA == d9n.a) {
                return objA;
            }
        }
        return rih1.a;
    }

    public final void B1() {
        mhg1 mhg1Var = this.f;
        if (mhg1Var == null) {
            return;
        }
        mhg1Var.l(jch0.a0(((double) this.t.s()) * ((Number) mhg1Var.m.getValue()).longValue()));
    }

    public final void C1(float f) {
        this.t.t(f);
    }

    public final void D1(gw91 gw91Var) {
        if (u890.j(this.i, gw91Var)) {
            return;
        }
        gw91 gw91Var2 = this.i;
        if (gw91Var2 != null) {
            gw91Var2.b(this);
        }
        gw91 gw91Var3 = this.i;
        if (gw91Var3 != null) {
            gw91Var3.f();
        }
        this.i = gw91Var;
        if (gw91Var != null) {
            gw91Var.e();
        }
        gw91 gw91Var4 = this.i;
        if (gw91Var4 != null) {
            gw91Var4.d(this, bno1.a, this.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E1(onm onmVar) {
        ho51 ho51Var;
        Object value;
        Object obj;
        if (onmVar instanceof ho51) {
            ho51Var = (ho51) onmVar;
            int i = ho51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho51Var.d = i - Integer.MIN_VALUE;
            } else {
                ho51Var = new ho51(this, onmVar);
            }
        } else {
            ho51Var = new ho51(this, onmVar);
        }
        Object obj2 = ho51Var.b;
        int i2 = ho51Var.d;
        xgn0 xgn0Var = this.Y;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            value = this.c.getValue();
            ho51Var.a = value;
            ho51Var.d = 1;
            if (fdg1.S(xgn0Var, ho51Var) != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            Object obj3 = ho51Var.a;
            hm5.M(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ho51Var.a;
            hm5.M(obj2);
        }
        if (u890.j(obj2, obj)) {
            return rih1.a;
        }
        this.N0 = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        ho51Var.a = value;
        ho51Var.d = 2;
        ohd ohdVar = new ohd(1, aym.t(ho51Var));
        ohdVar.t();
        this.X = ohdVar;
        fdg1.o0(xgn0Var);
        Object objR = ohdVar.r();
        if (objR != d9nVar) {
            obj = value;
            obj2 = objR;
            if (u890.j(obj2, obj)) {
                return rih1.a;
            }
            this.N0 = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public final Object F1(onm onmVar) {
        io51 io51Var;
        Object value;
        Object obj;
        if (onmVar instanceof io51) {
            io51Var = (io51) onmVar;
            int i = io51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                io51Var.d = i - Integer.MIN_VALUE;
            } else {
                io51Var = new io51(this, onmVar);
            }
        } else {
            io51Var = new io51(this, onmVar);
        }
        Object obj2 = io51Var.b;
        int i2 = io51Var.d;
        xgn0 xgn0Var = this.Y;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            value = this.c.getValue();
            io51Var.a = value;
            io51Var.d = 1;
            if (fdg1.S(xgn0Var, io51Var) != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            Object obj3 = io51Var.a;
            hm5.M(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = io51Var.a;
            hm5.M(obj2);
        }
        if (!u890.j(obj2, obj)) {
            this.N0 = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return rih1.a;
        if (!u890.j(value, this.e)) {
            io51Var.a = value;
            io51Var.d = 2;
            ohd ohdVar = new ohd(1, aym.t(io51Var));
            ohdVar.t();
            this.X = ohdVar;
            fdg1.o0(xgn0Var);
            Object objR = ohdVar.r();
            if (objR != d9nVar) {
                obj = value;
                obj2 = objR;
                if (!u890.j(obj2, obj)) {
                    this.N0 = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return d9nVar;
        }
        fdg1.o0(xgn0Var);
        return rih1.a;
    }

    public final Object P0() {
        return this.d.getValue();
    }

    public final Object Y0() {
        return this.c.getValue();
    }

    public final void o1(Object obj) {
        this.d.setValue(obj);
    }

    public final void s1(mhg1 mhg1Var) {
        mhg1 mhg1Var2 = this.f;
        if (mhg1Var2 != null && !mhg1Var.equals(mhg1Var2)) {
            dmv0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f + ", new instance: " + mhg1Var);
        }
        this.f = mhg1Var;
    }

    public final void t1() {
        this.f = null;
        gw91 gw91Var = this.i;
        if (gw91Var != null) {
            gw91Var.b(this);
        }
    }

    public final Object v1(onm onmVar) {
        float fC = wwo1.C(onmVar.getContext());
        rih1 rih1Var = rih1.a;
        if (fC <= 0.0f) {
            w1();
            return rih1Var;
        }
        this.R0 = fC;
        Object objR = s110.r(this.S0, onmVar);
        return objR == d9n.a ? objR : rih1Var;
    }

    public final void w1() {
        mhg1 mhg1Var = this.f;
        if (mhg1Var != null) {
            mhg1Var.c();
        }
        this.O0.e();
        if (this.P0 != null) {
            this.P0 = null;
            C1(1.0f);
            B1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public final void x1() {
        mhg1 mhg1Var = this.f;
        if (mhg1Var == null) {
            return;
        }
        co51 co51Var = this.P0;
        if (co51Var == null) {
            if (this.g > 0) {
                drr0 drr0Var = this.t;
                if (drr0Var.s() == 1.0f || u890.j(this.d.getValue(), this.c.getValue())) {
                    co51Var = null;
                } else {
                    co51 co51Var2 = new co51();
                    co51Var2.l(drr0Var.s());
                    long j = this.g;
                    co51Var2.j(j);
                    co51Var2.h(jch0.a0((1.0d - ((double) drr0Var.s())) * j));
                    co51Var2.f().e(drr0Var.s(), 0);
                    co51Var = co51Var2;
                }
            } else {
                co51Var = null;
            }
        }
        if (co51Var != null) {
            co51Var.j(this.g);
            this.O0.b(co51Var);
            mhg1Var.m(co51Var);
        }
        this.P0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(onm onmVar) {
        eo51 eo51Var;
        if (onmVar instanceof eo51) {
            eo51Var = (eo51) onmVar;
            int i = eo51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo51Var.c = i - Integer.MIN_VALUE;
            } else {
                eo51Var = new eo51(this, onmVar);
            }
        } else {
            eo51Var = new eo51(this, onmVar);
        }
        Object obj = eo51Var.a;
        int i2 = eo51Var.c;
        wdn0 wdn0Var = this.O0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (wdn0Var.i() && this.P0 == null) {
                return rih1Var;
            }
            if (wwo1.C(eo51Var.getContext()) == 0.0f) {
                w1();
                this.N0 = Long.MIN_VALUE;
                return rih1Var;
            }
            if (this.N0 == Long.MIN_VALUE) {
                eo51Var.c = 1;
                if (s110.r(this.Q0, eo51Var) != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 != 1 && i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        do {
            if (!wdn0Var.j() && this.P0 == null) {
                this.N0 = Long.MIN_VALUE;
                return rih1Var;
            }
            eo51Var.c = 2;
        } while (v1(eo51Var) != d9nVar);
        return d9nVar;
    }
}
