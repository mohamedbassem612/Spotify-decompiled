package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hrq0 extends hab0 implements vu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ irq0 a;
    public final /* synthetic */ vng b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ lz20 h;
    public final /* synthetic */ k6a1 i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrq0(irq0 irq0Var, vng vngVar, String str, ven0 ven0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, lz20 lz20Var, k6a1 k6a1Var, float f, float f2) {
        super(2);
        this.a = irq0Var;
        this.b = vngVar;
        this.c = str;
        this.d = ven0Var;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
        this.h = lz20Var;
        this.i = k6a1Var;
        this.t = f;
        this.X = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        irq0 irq0Var;
        irq0 irq0Var2;
        int i;
        long j;
        x340 x340Var;
        boolean z;
        hrq0 hrq0Var = this;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        uwr uwrVar = cbx.a;
        x340 x340Var2 = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var3 = x340Var2;
        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var3.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var3);
            }
            idn0 idn0Var = (idn0) objT;
            boolean zI = x340Var3.i(hrq0Var.b);
            irq0 irq0Var3 = hrq0Var.a;
            boolean zG = zI | x340Var3.g(irq0Var3);
            String str = hrq0Var.c;
            boolean zG2 = zG | x340Var3.g(str);
            ven0 ven0Var = hrq0Var.d;
            boolean zG3 = x340Var3.g(hrq0Var.e) | zG2 | x340Var3.i(ven0Var) | x340Var3.g(hrq0Var.f) | x340Var3.g(hrq0Var.g);
            Object objT2 = x340Var3.T();
            if (zG3 || objT2 == m4cVar) {
                objT2 = new kx70(hrq0Var.b, irq0Var3, hrq0Var.c, hrq0Var.e, hrq0Var.f, hrq0Var.g, ven0Var);
                irq0Var = irq0Var3;
                x340Var3.s0(objT2);
            } else {
                irq0Var = irq0Var3;
            }
            Function0 function0 = (Function0) objT2;
            lz20 lz20Var = hrq0Var.h;
            boolean zI2 = x340Var3.i(lz20Var);
            k6a1 k6a1Var = hrq0Var.i;
            boolean zI3 = zI2 | x340Var3.i(k6a1Var);
            Object objT3 = x340Var3.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new shq0(lz20Var, k6a1Var, (byte) 2);
                x340Var3.s0(objT3);
            }
            qim0 qim0VarY = bin.y(qim0VarF, idn0Var, (ga80) null, false, (String) null, (pm31) null, (String) null, function0, (Function0) objT3, 444);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z2 = x340Var3.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var3.l(function1);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var3, lljVar3);
            nko1.H(xos0VarM, x340Var3, lljVar2);
            x0d.q(iHashCode, x340Var3, lljVar, x340Var3);
            nko1.H(qim0VarE, x340Var3, vu30Var);
            x340Var3.i0(813380735);
            int i2 = irq0Var.a;
            int i3 = 0;
            while (i3 < i2) {
                Character chR0 = ihc1.r0(i3, str);
                boolean z3 = str.length() == i3;
                cr31 cr31VarB = er31.b(4.0f);
                boolean z4 = chR0 != null;
                if (irq0Var.b) {
                    x340Var3.i0(813389459);
                    uwr uwrVar2 = cbx.a;
                    irq0Var2 = irq0Var;
                    i = i2;
                    j = cbx.a(x340Var3).b.d;
                    x340Var3.r(false);
                } else {
                    irq0Var2 = irq0Var;
                    i = i2;
                    if (z3 || z4) {
                        x340Var3.i0(813391823);
                        uwr uwrVar3 = cbx.a;
                        j = cbx.a(x340Var3).b.a;
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(813393362);
                        uwr uwrVar4 = cbx.a;
                        j = cbx.a(x340Var3).b.b;
                        x340Var3.r(false);
                    }
                }
                qim0 qim0VarV = u291.v(nim0Var, hrq0Var.t);
                boolean z5 = z3;
                float f = hrq0Var.X;
                qim0 qim0VarE2 = d1u.E(1.0f, j, u291.h(qim0VarV, f), cr31VarB);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarE2);
                hzj.A.getClass();
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(function1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var3, lljVar3);
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                x0d.q(iHashCode2, x340Var3, lljVar, x340Var3);
                nko1.H(qim0VarE3, x340Var3, vu30Var);
                if (chR0 != null) {
                    x340Var3.i0(559672755);
                    x340 x340Var4 = x340Var3;
                    uwo1.e(String.valueOf(chR0.charValue()), (qim0) null, cbx.d(x340Var3).c, cbx.a(x340Var3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                    x340Var = x340Var4;
                    x340Var.r(false);
                    vu30Var = vu30Var;
                    z = true;
                } else {
                    x340Var = x340Var3;
                    if (z5) {
                        x340Var.i0(559900729);
                        t1c.a(dug.f(u291.h(u291.v(nim0Var, 2.0f), f / 2.0f), u7h.b(cbx.a(x340Var).b.c, ((Number) t5p1.g(t5p1.r("caret", x340Var, 0), 1.0f, 0.0f, irn1.Y(irn1.o0(500, 0, (dlv) null, 6), 2, 0L, 4), "caretAlpha", x340Var, 29112, 0).d.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(560613791);
                        x340Var.r(false);
                    }
                    z = true;
                }
                x340Var.r(z);
                i3++;
                hrq0Var = this;
                function1 = function1;
                str = str;
                x340Var3 = x340Var;
                vu30Var = vu30Var;
                irq0Var = irq0Var2;
                i2 = i;
            }
            x340 x340Var5 = x340Var3;
            x340Var5.r(false);
            x340Var5.r(true);
        } else {
            x340Var3.b0();
        }
        return rih1.a;
    }
}
