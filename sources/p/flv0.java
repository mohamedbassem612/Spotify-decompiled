package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class flv0 implements hs80, klv0 {
    public final rkv0 a;
    public MobiusLoop b;
    public final idd1 c = new idd1(new z6v0(this, (byte) 8));

    public flv0(rkv0 rkv0Var) {
        this.a = rkv0Var;
    }

    @Override // p.klv0
    public final zob1 a() {
        return (zob1) this.c.getValue();
    }

    @Override // p.klv0
    public final void b(String str) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new vkv0(str));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.klv0
    public final void c(String str) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new zkv0(str));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new hlo(chm0Var, (byte) 1), r4u.a(new rut0(this, (byte) 7)));
    }

    @Override // p.hs80
    public final void dispose() {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final void start() {
        rve0 rve0Var = rve0.h;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious();
        rkv0 rkv0Var = this.a;
        mkv0 mkv0Var = new mkv0(rkv0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ujv0.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious.a(mkv0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wjv0.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new ekv0(rkv0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yjv0.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new ikv0(rkv0Var)));
        this.b = l1d.g(Mobius.d(rve0Var, new com.spotify.mobius.coroutines.a(rkv0Var.b, coroutinesSubtypeEffectHandlerBuilderI))).g(new elv0(b7x.a));
    }
}
