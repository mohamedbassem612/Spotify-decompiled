package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b2h0 implements Connectable {
    public final gqb0 N0;
    public final cgd O0;
    public final jqb0 P0;
    public final kxv0 Q0;
    public final p631 R0;
    public final ek1 S0;
    public final d940 T0;
    public final n18 U0;
    public final ffr V0;
    public final p5 W0;
    public final w9f0 X;
    public final x94 X0;
    public final sip0 Y;
    public final h28 Y0;
    public final cgd Z;
    public final x94 Z0;
    public final d940 a;
    public final d940 a1;
    public final j4e0 b;
    public final kt91 b1;
    public final ek1 c;
    public final exg1 c1;
    public final d940 d;
    public final cgd e;
    public final cgd f;
    public final ek1 g;
    public final uyt0 h;
    public final g7t i;
    public final g7t t;

    public b2h0(d940 d940Var, j4e0 j4e0Var, ek1 ek1Var, d940 d940Var2, cgd cgdVar, cgd cgdVar2, ek1 ek1Var2, uyt0 uyt0Var, g7t g7tVar, g7t g7tVar2, w9f0 w9f0Var, sip0 sip0Var, cgd cgdVar3, gqb0 gqb0Var, cgd cgdVar4, jqb0 jqb0Var, kxv0 kxv0Var, p631 p631Var, ek1 ek1Var3, d940 d940Var3, n18 n18Var, ffr ffrVar, p5 p5Var, x94 x94Var, h28 h28Var, x94 x94Var2, d940 d940Var4, kt91 kt91Var, exg1 exg1Var) {
        this.a = d940Var;
        this.b = j4e0Var;
        this.c = ek1Var;
        this.d = d940Var2;
        this.e = cgdVar;
        this.f = cgdVar2;
        this.g = ek1Var2;
        this.h = uyt0Var;
        this.i = g7tVar;
        this.t = g7tVar2;
        this.X = w9f0Var;
        this.Y = sip0Var;
        this.Z = cgdVar3;
        this.N0 = gqb0Var;
        this.O0 = cgdVar4;
        this.P0 = jqb0Var;
        this.Q0 = kxv0Var;
        this.R0 = p631Var;
        this.S0 = ek1Var3;
        this.T0 = d940Var3;
        this.U0 = n18Var;
        this.V0 = ffrVar;
        this.W0 = p5Var;
        this.X0 = x94Var;
        this.Y0 = h28Var;
        this.Z0 = x94Var2;
        this.a1 = d940Var4;
        this.b1 = kt91Var;
        this.c1 = exg1Var;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        q0h0 q0h0Var = new q0h0(this.h);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xzg0.class), runSequentially.a(q0h0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r0h0(this.i)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s0h0(this.t)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(szg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new a1h0(this.X)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new k1h0(this.Y)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m1h0(this.c)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o1h0(this.d)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q1h0(this.a)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new c1h0(this.b)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t0h0(this.e)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u0h0(this.g)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ozg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s1h0(this.Z)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new e1h0(this.N0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v0h0(this.O0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w0h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u1h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x0h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new w1h0(this.S0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y1h0(this.T0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a2h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new g1h0(this.V0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(izg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y0h0(this.W0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new i1h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new l0h0(this.Z0)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new m0h0(this.a1)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n0h0(this.f)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f0h0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o0h0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wzg0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new p0h0(this)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
