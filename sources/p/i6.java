package p;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class i6 extends l5t implements mav0, hpa0, t161, j4k, sjp0, va80, pj40 {
    public idn0 Q0;
    public ga80 R0;
    public boolean S0;
    public String T0;
    public pm31 U0;
    public boolean V0;
    public Function0 W0;
    public final l030 X0;
    public ga80 Y0;
    public rj40 Z0;
    public String a1 = "idle";
    public x4t b1;
    public r9w0 c1;
    public dy60 d1;
    public final mdn0 e1;
    public long f1;
    public r9w0 g1;
    public idn0 h1;
    public boolean i1;
    public faa0 j1;

    public i6(idn0 idn0Var, ga80 ga80Var, boolean z, boolean z2, String str, pm31 pm31Var, Function0 function0) {
        this.Q0 = idn0Var;
        this.R0 = ga80Var;
        this.S0 = z;
        this.T0 = str;
        this.U0 = pm31Var;
        this.V0 = z2;
        this.W0 = function0;
        this.X0 = new l030(idn0Var, 0, (iu30) new n5(this));
        int i = a5f0.a;
        this.e1 = new mdn0(6);
        this.f1 = 0L;
        idn0 idn0Var2 = this.Q0;
        this.h1 = idn0Var2;
        this.i1 = idn0Var2 == null;
    }

    @Override // p.pim0
    public final void A1() {
        L1();
        if (this.h1 == null) {
            this.Q0 = null;
        }
        x4t x4tVar = this.b1;
        if (x4tVar != null) {
            I1(x4tVar);
        }
        this.b1 = null;
        rj40 rj40Var = this.Z0;
        if (rj40Var != null) {
            I1(rj40Var);
        }
        this.Z0 = null;
    }

    @Override // p.mav0
    public void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f1 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        R1();
        if (this.V0) {
            if (this.Z0 == null) {
                rj40 rj40VarX = crm0.x(this);
                H1(rj40VarX);
                this.Z0 = rj40VarX;
            }
            if (cav0Var == cav0.b) {
                int i = bav0Var.f;
                if (s8p1.o(i, 4)) {
                    c921.y(v1(), (o8n) null, 0, new h6(this, (lnm) null, (byte) 0), 3);
                } else if (s8p1.o(i, 5)) {
                    c921.y(v1(), (o8n) null, 0, new h6(this, (lnm) null, (byte) 1), 3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.hpa0
    public final boolean J0(KeyEvent keyEvent) {
        boolean z;
        R1();
        long jR = ern1.r(keyEvent);
        boolean z2 = this.V0;
        mdn0 mdn0Var = this.e1;
        if (!z2 || !bin.q(keyEvent)) {
            if (this.V0 && bin.p(keyEvent)) {
                r9w0 r9w0Var = (r9w0) mdn0Var.f(jR);
                if (r9w0Var != null) {
                    if (this.Q0 != null) {
                        c921.y(v1(), (o8n) null, 0, new g6(this, r9w0Var, (lnm) null, (byte) 3), 3);
                    }
                    U1(keyEvent);
                }
                if (r9w0Var != null) {
                    return true;
                }
            }
            return false;
        }
        if (mdn0Var.b(jR)) {
            z = false;
        } else {
            r9w0 r9w0Var2 = new r9w0(this.f1, 0);
            mdn0Var.g(jR, r9w0Var2);
            if (this.Q0 != null) {
                c921.y(v1(), (o8n) null, 0, new g6(this, r9w0Var2, (lnm) null, (byte) 2), 3);
            }
            z = true;
        }
        if (T1(keyEvent) || z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void L1() {
        idn0 idn0Var = this.Q0;
        mdn0 mdn0Var = this.e1;
        if (idn0Var != null) {
            r9w0 r9w0Var = this.c1;
            if (r9w0Var != null) {
                idn0Var.a(new q9w0(r9w0Var));
            }
            r9w0 r9w0Var2 = this.g1;
            if (r9w0Var2 != null) {
                idn0Var.a(new q9w0(r9w0Var2));
            }
            dy60 dy60Var = this.d1;
            if (dy60Var != null) {
                idn0Var.a(new ey60(dy60Var));
            }
            Object[] objArr = mdn0Var.c;
            long[] jArr = mdn0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                idn0Var.a(new q9w0((r9w0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.c1 = null;
        this.g1 = null;
        this.d1 = null;
        mdn0Var.a();
    }

    public final long M1(long j) {
        long jK1 = oap1.x(this).k1(((e8k1) lcc.z(this, t4k.t)).e());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jK1 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void N1(boolean z) {
        idn0 idn0Var = this.Q0;
        if (idn0Var != null) {
            faa0 faa0Var = this.j1;
            if (faa0Var == null || !faa0Var.isActive()) {
                r9w0 r9w0Var = z ? this.g1 : this.c1;
                if (r9w0Var != null) {
                    q9w0 q9w0Var = new q9w0(r9w0Var);
                    faa0 faa0VarA = v1().a.A(fkj0.W0);
                    c921.y(v1(), (o8n) null, 0, new c6(idn0Var, q9w0Var, faa0VarA != null ? faa0VarA.L(new b6(idn0Var, q9w0Var, (byte) 0)) : null, (lnm) null, (byte) 0), 3);
                }
            } else {
                faa0 faa0Var2 = this.j1;
                if (faa0Var2 != null) {
                    ha71.o(faa0Var2);
                }
            }
            if (z) {
                this.g1 = null;
            } else {
                this.c1 = null;
            }
        }
    }

    public final void O1(long j, boolean z) {
        idn0 idn0Var = this.Q0;
        if (idn0Var != null) {
            faa0 faa0Var = this.j1;
            if (faa0Var == null || !faa0Var.isActive()) {
                r9w0 r9w0Var = z ? this.g1 : this.c1;
                if (r9w0Var != null) {
                    c921.y(v1(), (o8n) null, 0, new e6(r9w0Var, idn0Var, (lnm) null), 3);
                }
            } else {
                ha71.o(faa0Var);
                c921.y(v1(), (o8n) null, 0, new d6(faa0Var, j, idn0Var, (lnm) null, (byte) 0), 3);
            }
            if (z) {
                this.g1 = null;
            } else {
                this.c1 = null;
            }
        }
    }

    public final void P1(oa80 oa80Var) {
        idn0 idn0Var = this.Q0;
        if (idn0Var != null) {
            r9w0 r9w0Var = new r9w0(oa80Var.b(), 0);
            if (bin.D(this) || yhg.a(this)) {
                this.j1 = c921.y(v1(), (o8n) null, 0, new f6(idn0Var, r9w0Var, this, (lnm) null, (byte) 0), 3);
            } else {
                this.g1 = r9w0Var;
                c921.y(v1(), (o8n) null, 0, new e6(idn0Var, r9w0Var, (lnm) null, (byte) 1), 3);
            }
        }
    }

    @Override // p.pj40
    public final String Q() {
        return this.a1;
    }

    public final void Q1(hav0 hav0Var) {
        idn0 idn0Var = this.Q0;
        if (idn0Var != null) {
            r9w0 r9w0Var = new r9w0(hav0Var.e(), 0);
            if (bin.D(this) || yhg.a(this)) {
                this.j1 = c921.y(v1(), (o8n) null, 0, new f6(idn0Var, r9w0Var, this, (lnm) null, (byte) 1), 3);
            } else {
                this.c1 = r9w0Var;
                c921.y(v1(), (o8n) null, 0, new e6(idn0Var, r9w0Var, (lnm) null, (byte) 2), 3);
            }
        }
    }

    public final void R1() {
        if (this.b1 != null) {
            return;
        }
        ga80 ga80Var = this.S0 ? this.Y0 : this.R0;
        if (ga80Var != null) {
            idn0 idn0VarD = this.Q0;
            if (idn0VarD == null) {
                idn0VarD = zr7.d();
                this.Q0 = idn0VarD;
            }
            this.X0.L1(idn0VarD);
            idn0 idn0Var = this.Q0;
            idn0Var.getClass();
            x4t x4tVarA = ga80Var.a(idn0Var);
            H1(x4tVarA);
            this.b1 = x4tVarA;
        }
    }

    public boolean T1(KeyEvent keyEvent) {
        return false;
    }

    public void U1(KeyEvent keyEvent) {
        V1();
    }

    public final void V1() {
        W1();
        this.W0.invoke();
    }

    public final void W1() {
        pja1 pja1Var = (pja1) lcc.z(this, t4k.v);
        if (pja1Var != null) {
            pja1Var.a();
        }
    }

    public final void X1(idn0 idn0Var, ga80 ga80Var, boolean z, boolean z2, String str, pm31 pm31Var, Function0 function0) {
        boolean z3;
        boolean z4;
        x4t x4tVar;
        boolean z5 = true;
        if (u890.j(this.h1, idn0Var)) {
            z3 = false;
        } else {
            L1();
            this.h1 = idn0Var;
            this.Q0 = idn0Var;
            z3 = true;
        }
        if (!u890.j(this.R0, ga80Var)) {
            this.R0 = ga80Var;
            z3 = true;
        }
        if (this.S0 != z) {
            this.S0 = z;
            if (z) {
                f0();
            }
            z3 = true;
        }
        boolean z6 = this.V0;
        l030 l030Var = this.X0;
        if (z6 != z2) {
            if (z2) {
                H1(l030Var);
            } else {
                I1(l030Var);
                L1();
            }
            nko1.C(this);
            if (!z2) {
                x4t x4tVar2 = this.Z0;
                if (x4tVar2 != null) {
                    I1(x4tVar2);
                }
                this.Z0 = null;
                this.a1 = "idle";
            }
            this.V0 = z2;
        }
        if (!u890.j(this.T0, str)) {
            this.T0 = str;
            nko1.C(this);
        }
        if (!u890.j(this.U0, pm31Var)) {
            this.U0 = pm31Var;
            nko1.C(this);
        }
        this.W0 = function0;
        boolean z7 = this.i1;
        idn0 idn0Var2 = this.h1;
        if (z7 == (idn0Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = idn0Var2 == null;
            this.i1 = z4;
            if (z4 || this.b1 != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((x4tVar = this.b1) != null || !z4)) {
            if (x4tVar != null) {
                I1(x4tVar);
            }
            this.b1 = null;
            R1();
        }
        l030Var.L1(this.Q0);
    }

    @Override // p.sjp0
    public final void f0() {
        if (this.S0) {
            p9p1.z(this, new a6(this, (byte) 0));
        }
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        pm31 pm31Var = this.U0;
        if (pm31Var != null) {
            b261.x(e261Var, pm31Var.a);
        }
        b261.g(e261Var, this.T0, new a6(this, (byte) 1));
        if (this.V0) {
            this.X0.g(e261Var);
        } else {
            b261.a(e261Var);
        }
        K1(e261Var);
    }

    @Override // p.t161
    public final boolean q1() {
        return true;
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.hpa0
    public final boolean x0(KeyEvent keyEvent) {
        return false;
    }

    @Override // p.pim0
    public final void z1() {
        f0();
        if (!this.i1) {
            R1();
        }
        if (this.V0) {
            H1(this.X0);
        }
    }

    public void S1() {
    }

    public void K1(e261 e261Var) {
    }
}
