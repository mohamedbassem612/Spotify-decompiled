package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ni60 implements xpw {
    public final bm00 a;
    public final mhg0 b;
    public final e7m0 c;
    public final eih1 d;
    public final psw e;

    public ni60(ii60 ii60Var, bm00 bm00Var, mhg0 mhg0Var) {
        this.a = bm00Var;
        this.b = mhg0Var;
        dq7 dq7Var = new dq7(this, (byte) 11);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ai60 ai60Var = new ai60(ii60Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ji60.class), runSequentially.a(ai60Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mi60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ci60(ii60Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ki60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ei60(ii60Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(li60.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gi60(ii60Var)));
        this.c = sbl.z(yh60.a, dq7Var, new a(ii60Var.a, coroutinesSubtypeEffectHandlerBuilderI), oq50.T0, hh60.d);
        this.d = new eih1();
        j2i j2iVar = new j2i(645020827, new zq30(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
