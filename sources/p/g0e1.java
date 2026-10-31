package p;

import android.os.Trace;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g0e1 extends pim0 implements zlb0, m7v, t161 {
    public af5 O0;
    public lee1 P0;
    public f930 Q0;
    public iu30 R0;
    public int S0;
    public boolean T0;
    public int U0;
    public int V0;
    public List W0;
    public iu30 X0;
    public x9h Y0;
    public m0e1 Z0;
    public iu30 a1;
    public Map b1;
    public csm0 c1;
    public e0e1 d1;
    public f0e1 e1;

    public final csm0 H1() {
        csm0 csm0Var = this.c1;
        if (csm0Var == null) {
            csm0 csm0Var2 = new csm0(this.O0, this.P0, this.Q0, this.S0, this.T0, this.U0, this.V0, this.W0, this.Z0);
            this.c1 = csm0Var2;
            csm0Var = csm0Var2;
        }
        csm0Var.getClass();
        return csm0Var;
    }

    public final csm0 I1(wat watVar) {
        csm0 csm0VarA;
        f0e1 f0e1Var = this.e1;
        if (f0e1Var != null && f0e1Var.c() && (csm0VarA = f0e1Var.a()) != null) {
            csm0VarA.d(watVar);
            return csm0VarA;
        }
        csm0 csm0VarH1 = H1();
        csm0VarH1.d(watVar);
        return csm0VarH1;
    }

    @Override // p.zlb0
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return r2p1.h(I1(x5f0Var).e(x5f0Var.getLayoutDirection()).e());
    }

    @Override // p.zlb0
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return r2p1.h(I1(x5f0Var).e(x5f0Var.getLayoutDirection()).d());
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            csm0 csm0VarI1 = I1(ifh0Var);
            boolean zC = csm0VarI1.c(j, ifh0Var.getLayoutDirection());
            y9e1 y9e1Var = csm0VarI1.o;
            if (y9e1Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + csm0VarI1);
            }
            long j2 = y9e1Var.c;
            y9e1Var.b.a.a();
            if (zC) {
                dio1.x(this);
                iu30 iu30Var = this.R0;
                if (iu30Var != null) {
                    iu30Var.invoke(y9e1Var);
                }
                Map linkedHashMap = this.b1;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(xl3.a, Integer.valueOf(Math.round(y9e1Var.d)));
                linkedHashMap.put(xl3.b, Integer.valueOf(Math.round(y9e1Var.e)));
                this.b1 = linkedHashMap;
            }
            iu30 iu30Var2 = this.X0;
            if (iu30Var2 != null) {
                iu30Var2.invoke(y9e1Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            q5t0 q5t0VarH = afh0Var.H(m5n1.v(i, i, i2, i2));
            Map map = this.b1;
            map.getClass();
            hfh0 hfh0VarS = ifh0Var.S(i, i2, map, new p6(q5t0VarH, (byte) 16));
            Trace.endSection();
            return hfh0VarS;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        e0e1 e0e1Var = this.d1;
        if (e0e1Var == null) {
            e0e1Var = new e0e1(this, (byte) 0);
            this.d1 = e0e1Var;
        }
        b261.C(e261Var, this.O0);
        f0e1 f0e1Var = this.e1;
        if (f0e1Var != null) {
            af5 af5VarB = f0e1Var.b();
            d261 d261Var = z161.D;
            mma0[] mma0VarArr = b261.a;
            mma0 mma0Var = mma0VarArr[16];
            d261Var.getClass();
            e261Var.b(d261Var, af5VarB);
            boolean zC = f0e1Var.c();
            d261 d261Var2 = z161.E;
            mma0 mma0Var2 = mma0VarArr[17];
            Boolean boolValueOf = Boolean.valueOf(zC);
            d261Var2.getClass();
            e261Var.b(d261Var2, boolValueOf);
        }
        e261Var.b(m161.l, new we(null, new e0e1(this, (byte) 1)));
        e261Var.b(m161.m, new we(null, new e0e1(this, (byte) 2)));
        e261Var.b(m161.n, new we(null, new ww21(this, (byte) 17)));
        b261.b(e261Var, e0e1Var);
    }

    @Override // p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return I1(x5f0Var).a(i, x5f0Var.getLayoutDirection());
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        long jP;
        List list;
        if (this.N0) {
            fid fidVarP = lslVar.a1().p();
            csm0 csm0VarI1 = I1(lslVar);
            y9e1 y9e1Var = csm0VarI1.o;
            if (y9e1Var == null) {
                bhn0.A(csm0VarI1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                return;
            }
            zrm0 zrm0Var = y9e1Var.b;
            boolean z = y9e1Var.d() && this.S0 != 3;
            if (z) {
                long j = y9e1Var.c;
                n511 n511VarG = anm1.g(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
                fidVarP.q();
                fid.a(fidVarP, n511VarG);
            }
            try {
                zma1 zma1Var = this.P0.a;
                TextDecoration textDecoration = zma1Var.m;
                if (textDecoration == null) {
                    textDecoration = TextDecoration.b;
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadowM = zma1Var.n;
                if (shadowM == null) {
                    Shadow shadow = Shadow.d;
                    shadowM = oto1.m();
                }
                Shadow shadow2 = shadowM;
                lee1 lee1Var = this.P0;
                DrawStyle drawStyle = lee1Var.a.f155p;
                if (drawStyle == null) {
                    drawStyle = z520.a;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brushB = lee1Var.b();
                if (brushB != null) {
                    obg1.p(zrm0Var, fidVarP, brushB, this.P0.a.a.b(), shadow2, textDecoration2, drawStyle2);
                } else {
                    x9h x9hVar = this.Y0;
                    if (x9hVar != null) {
                        jP = x9hVar.a();
                    } else {
                        int i = u7h.l;
                        jP = nfb.p();
                    }
                    if (jP == 16) {
                        if (this.P0.c() != 16) {
                            jP = this.P0.c();
                        } else {
                            int i2 = u7h.l;
                            jP = nfb.i();
                        }
                    }
                    zrm0Var.j(fidVarP, jP, shadow2, textDecoration2, drawStyle2);
                }
                if (z) {
                    fidVarP.i();
                }
                f0e1 f0e1Var = this.e1;
                if (((f0e1Var == null || !f0e1Var.c()) ? f2p1.r(this.O0) : false) || !((list = this.W0) == null || list.isEmpty())) {
                    lslVar.s1();
                }
            } catch (Throwable th) {
                if (!z) {
                    throw th;
                }
                fidVarP.i();
                throw th;
            }
        }
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return I1(x5f0Var).a(i, x5f0Var.getLayoutDirection());
    }
}
