package p;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b4d1 extends pim0 implements m7v {
    public boolean O0;
    public hw61 P0;
    public qqb Q0;
    public idn0 R0;
    public final ne S0 = new ne();
    public final y3d1 T0 = new y3d1(this, (byte) 1);
    public ne U0;
    public ne V0;
    public Function0 W0;
    public Shader X0;
    public Brush Y0;
    public be50 Z0;
    public z3d1 a1;
    public be50 b1;
    public z3d1 c1;
    public be50 d1;
    public z3d1 e1;
    public xab1 f1;
    public o95 g1;
    public o95 h1;
    public o95 i1;
    public xab1 j1;
    public xab1 k1;
    public boolean l1;
    public boolean m1;

    public b4d1(boolean z, hw61 hw61Var, qqb qqbVar, idn0 idn0Var) {
        this.O0 = z;
        this.P0 = hw61Var;
        this.Q0 = qqbVar;
        this.R0 = idn0Var;
    }

    public final void A1() {
        this.g1 = null;
        this.h1 = null;
        this.i1 = null;
        this.a1 = null;
        yd50 yd50VarY = oap1.y(this);
        be50 be50Var = this.Z0;
        if (be50Var != null) {
            yd50VarY.c(be50Var);
            this.Z0 = null;
        }
        this.c1 = null;
        be50 be50Var2 = this.b1;
        if (be50Var2 != null) {
            yd50VarY.c(be50Var2);
            this.b1 = null;
        }
        this.e1 = null;
        be50 be50Var3 = this.d1;
        if (be50Var3 != null) {
            yd50VarY.c(be50Var3);
            this.d1 = null;
        }
    }

    public final void H1() {
        xab1 xab1Var = this.f1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f1 = null;
        I1(false);
        J1(false);
        idn0 idn0Var = this.R0;
        if (idn0Var != null) {
            this.f1 = fn31.T(v1(), null, 4, new pec1(idn0Var, this, (lnm) null, (byte) 7), 1);
        }
    }

    public final void I1(boolean z) {
        if (this.l1 != z) {
            this.l1 = z;
            if (z) {
                o95 o95VarB = this.g1;
                if (o95VarB == null) {
                    o95VarB = c97.b(0.0f);
                }
                this.g1 = o95VarB;
                o95 o95VarB2 = this.h1;
                if (o95VarB2 == null) {
                    o95VarB2 = c97.b(0.0f);
                }
                this.h1 = o95VarB2;
                fn31.T(v1(), null, 4, new a4d1(this, null, (byte) 0), 1);
                fn31.T(v1(), null, 4, new a4d1(this, null, (byte) 1), 1);
            } else {
                fn31.T(v1(), null, 4, new w621(this, (lnm) null, (byte) 15), 1);
            }
            ha71.x(this);
        }
    }

    public final void J1(boolean z) {
        if (this.m1 != z) {
            this.m1 = z;
            o95 o95VarB = this.i1;
            if (z) {
                if (o95VarB == null) {
                    o95VarB = c97.b(0.0f);
                }
                this.i1 = o95VarB;
                xab1 xab1Var = this.k1;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                xab1 xab1Var2 = this.j1;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                this.j1 = fn31.T(v1(), null, 4, new hj61(2, (lnm) null, (byte) 1), 1);
                fn31.T(v1(), null, 4, new xba1(this, (lnm) null, (byte) 18), 1);
            } else if (o95VarB != null) {
                this.k1 = fn31.T(v1(), null, 4, new w621(this, o95VarB, (lnm) null, (byte) 14), 1);
            }
            ha71.x(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.z3d1] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.z3d1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [p.z3d1] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.jvm.functions.Function0] */
    public final void t0(lsl lslVar) {
        ?? r1;
        ?? r2;
        z1a1 z1a1VarA = this.P0.a(lslVar.j(), lslVar.getLayoutDirection(), lslVar);
        lslVar.s1();
        long j = x3d1.f;
        o95 o95Var = this.i1;
        DrawScope.d0(lslVar, u7h.b(j, o95Var != null ? ((Number) o95Var.e()).floatValue() : 0.0f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
        if (this.Q0 != null) {
            o95 o95Var2 = this.g1;
            float fFloatValue = o95Var2 != null ? ((Number) o95Var2.e()).floatValue() : 0.0f;
            final yd50 yd50VarY = oap1.y(this);
            if (fFloatValue > 0.0f) {
                if (Build.VERSION.SDK_INT >= 33) {
                    double d = x3d1.e;
                    double d2 = x3d1.d;
                    double d3 = d - d2;
                    o95 o95Var3 = this.h1;
                    Shader shaderA = gg.a(this.X0, lslVar.j(), (float) ((d3 * ((double) (o95Var3 != null ? ((Number) o95Var3.e()).floatValue() : 0.0f))) + d2), fFloatValue);
                    this.X0 = shaderA;
                    w9c w9cVar = this.Y0;
                    if (w9cVar == null) {
                        w9cVar = new w9c(shaderA);
                    }
                    this.Y0 = w9cVar;
                }
                ne neVar = this.U0;
                if (neVar == null) {
                    neVar = new ne();
                }
                ne neVar2 = neVar;
                this.U0 = neVar2;
                ne neVar3 = this.V0;
                if (neVar3 == null) {
                    neVar3 = new ne();
                }
                this.V0 = neVar3;
                Function0 y3d1Var = this.W0;
                final byte b = 0;
                if (y3d1Var == null) {
                    y3d1Var = new y3d1(this, (byte) 0);
                }
                Function0 function0 = y3d1Var;
                this.W0 = function0;
                qqb qqbVar = this.Q0;
                qqbVar.getClass();
                n6a1 n6a1Var = qqbVar.b;
                z3d1 z3d1Var = this.c1;
                ?? r3 = z3d1Var;
                if (z3d1Var == null) {
                    ?? r4 = new Function0(this) { // from class: p.z3d1
                        public final /* synthetic */ b4d1 b;

                        {
                            this.b = this;
                        }

                        public final Object invoke() {
                            byte b2 = b;
                            yd50 yd50Var = yd50VarY;
                            b4d1 b4d1Var = this.b;
                            switch (b2) {
                                case 0:
                                    be50 be50Var = b4d1Var.b1;
                                    if (be50Var != null) {
                                        return be50Var;
                                    }
                                    be50 be50VarB = yd50Var.b();
                                    b4d1Var.b1 = be50VarB;
                                    return be50VarB;
                                case 1:
                                    be50 be50Var2 = b4d1Var.d1;
                                    if (be50Var2 != null) {
                                        return be50Var2;
                                    }
                                    be50 be50VarB2 = yd50Var.b();
                                    b4d1Var.d1 = be50VarB2;
                                    return be50VarB2;
                                default:
                                    be50 be50Var3 = b4d1Var.Z0;
                                    if (be50Var3 != null) {
                                        return be50Var3;
                                    }
                                    be50 be50VarB3 = yd50Var.b();
                                    b4d1Var.Z0 = be50VarB3;
                                    return be50VarB3;
                            }
                        }
                    };
                    this.c1 = r4;
                    r3 = r4;
                }
                neVar2.o(lslVar, function0, n6a1Var, (Function0) r3, z1a1VarA);
                Brush brush = this.Y0;
                if (brush != null) {
                    ne neVar4 = this.V0;
                    neVar4.getClass();
                    Function0 function1 = this.W0;
                    function1.getClass();
                    z3d1 z3d1Var2 = this.e1;
                    if (z3d1Var2 == null) {
                        r2 = z3d1Var2;
                        final byte b2 = 1;
                        ?? r5 = new Function0(this) { // from class: p.z3d1
                            public final /* synthetic */ b4d1 b;

                            {
                                this.b = this;
                            }

                            public final Object invoke() {
                                byte b3 = b2;
                                yd50 yd50Var = yd50VarY;
                                b4d1 b4d1Var = this.b;
                                switch (b3) {
                                    case 0:
                                        be50 be50Var = b4d1Var.b1;
                                        if (be50Var != null) {
                                            return be50Var;
                                        }
                                        be50 be50VarB = yd50Var.b();
                                        b4d1Var.b1 = be50VarB;
                                        return be50VarB;
                                    case 1:
                                        be50 be50Var2 = b4d1Var.d1;
                                        if (be50Var2 != null) {
                                            return be50Var2;
                                        }
                                        be50 be50VarB2 = yd50Var.b();
                                        b4d1Var.d1 = be50VarB2;
                                        return be50VarB2;
                                    default:
                                        be50 be50Var3 = b4d1Var.Z0;
                                        if (be50Var3 != null) {
                                            return be50Var3;
                                        }
                                        be50 be50VarB3 = yd50Var.b();
                                        b4d1Var.Z0 = be50VarB3;
                                        return be50VarB3;
                                }
                            }
                        };
                        this.e1 = r5;
                        r2 = r5;
                    }
                    r2 = z3d1Var2;
                    neVar4.o(lslVar, function1, brush, (Function0) r2, z1a1VarA);
                }
            } else {
                qqb qqbVar2 = this.Q0;
                qqbVar2.getClass();
                n6a1 n6a1Var2 = qqbVar2.b;
                z3d1 z3d1Var3 = this.a1;
                if (z3d1Var3 == null) {
                    r1 = z3d1Var3;
                    final byte b3 = 2;
                    ?? r6 = new Function0(this) { // from class: p.z3d1
                        public final /* synthetic */ b4d1 b;

                        {
                            this.b = this;
                        }

                        public final Object invoke() {
                            byte b4 = b3;
                            yd50 yd50Var = yd50VarY;
                            b4d1 b4d1Var = this.b;
                            switch (b4) {
                                case 0:
                                    be50 be50Var = b4d1Var.b1;
                                    if (be50Var != null) {
                                        return be50Var;
                                    }
                                    be50 be50VarB = yd50Var.b();
                                    b4d1Var.b1 = be50VarB;
                                    return be50VarB;
                                case 1:
                                    be50 be50Var2 = b4d1Var.d1;
                                    if (be50Var2 != null) {
                                        return be50Var2;
                                    }
                                    be50 be50VarB2 = yd50Var.b();
                                    b4d1Var.d1 = be50VarB2;
                                    return be50VarB2;
                                default:
                                    be50 be50Var3 = b4d1Var.Z0;
                                    if (be50Var3 != null) {
                                        return be50Var3;
                                    }
                                    be50 be50VarB3 = yd50Var.b();
                                    b4d1Var.Z0 = be50VarB3;
                                    return be50VarB3;
                            }
                        }
                    };
                    this.a1 = r6;
                    r1 = r6;
                }
                r1 = z3d1Var3;
                this.S0.o(lslVar, this.T0, n6a1Var2, (Function0) r1, z1a1VarA);
            }
        }
        if (this.O0) {
            return;
        }
        DrawScope.d0(lslVar, x3d1.g, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        H1();
    }
}
