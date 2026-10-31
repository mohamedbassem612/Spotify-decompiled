package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class glv0 implements is80, klv0 {
    public final skv0 a;
    public MobiusLoop b;
    public final idd1 c = new idd1(new z6v0(this, (byte) 9));

    public glv0(skv0 skv0Var) {
        this.a = skv0Var;
    }

    public final zob1 a() {
        return (zob1) this.c.getValue();
    }

    public final void b(String str) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new wkv0(str));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public final void c(String str) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new alv0(str));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.is80
    public final r4u d(List list) {
        return r4u.d(new ilo(list, (byte) 2), r4u.a(new sks0(this, (byte) 11)));
    }

    @Override // p.is80
    public final void dispose() {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.is80
    public final void start() {
        xxb0 xxb0Var = xxb0.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        skv0 skv0Var = this.a;
        nkv0 nkv0Var = new nkv0(skv0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vjv0.class), cancelPrevious.a(nkv0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xjv0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fkv0(skv0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zjv0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jkv0(skv0Var)));
        this.b = l1d.g(Mobius.d(xxb0Var, new a(skv0Var.b, coroutinesSubtypeEffectHandlerBuilderI))).g(new elv0(b7x.a));
    }
}
