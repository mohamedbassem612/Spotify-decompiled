package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bz80 implements xpw {
    public static final String Q0 = nik1.w6.a;
    public final e7m0 N0;
    public final psw O0;
    public final ia00 P0;
    public final exg1 X;
    public final tra0 Y;
    public final fc3 Z;
    public final lo60 a;
    public final vz80 b;
    public final joe c;
    public final kvp d;
    public final w9u0 e;
    public final ty60 f;
    public final q8n g;
    public final pe h;
    public final yo2 i;
    public final mr4 t;

    public bz80(lo60 lo60Var, vz80 vz80Var, joe joeVar, kvp kvpVar, w9u0 w9u0Var, ty60 ty60Var, q8n q8nVar, pe peVar, yo2 yo2Var, mr4 mr4Var, exg1 exg1Var, tra0 tra0Var, fc3 fc3Var) {
        this.a = lo60Var;
        this.b = vz80Var;
        this.c = joeVar;
        this.d = kvpVar;
        this.e = w9u0Var;
        this.f = ty60Var;
        this.g = q8nVar;
        this.h = peVar;
        this.i = yo2Var;
        this.t = mr4Var;
        this.X = exg1Var;
        this.Y = tra0Var;
        this.Z = fc3Var;
        xy50 xy50Var = new xy50(this, (byte) 6);
        dq7 dq7Var = new dq7(this, (byte) 13);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially();
        my80 my80Var = new my80(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nx80.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially.a(my80Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ox80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new oy80(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rx80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new py80(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tx80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new ry80(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qx80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new wy80(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sx80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new ty80(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(px80.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new uy80(this)));
        this.N0 = sbl.C(xy50Var, dq7Var, new com.spotify.mobius.coroutines.a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), v30.a1, new ux70(this, (byte) 14));
        j2i j2iVarJ = apo.j(-1191971632, new wv60(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVarJ, (byte) 0);
        this.P0 = n3o1.q(this).a(h40.Q0, new bt70(this, (byte) 8));
    }

    public static jy80 e(jre jreVar) {
        if (jreVar instanceof ire) {
            return jy80.b;
        }
        if (jreVar instanceof gre) {
            return jy80.c;
        }
        if ((jreVar instanceof ere) || (jreVar instanceof dre) || (jreVar instanceof hre)) {
            return jy80.a;
        }
        if (jreVar instanceof fre) {
            return null;
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final mqw getBehavior() {
        return this.N0;
    }
}
