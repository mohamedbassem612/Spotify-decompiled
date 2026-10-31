package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zj81 {
    public final ok81 a;

    public zj81(ok81 ok81Var) {
        this.a = ok81Var;
    }

    public final MobiusLoop.Controller a() {
        bhm0 bhm0Var = new bhm0(ndh1.f, false, null);
        gk81 gk81Var = this.a.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ck81 ck81Var = new ck81(gk81Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ucw.class), runSequentially.a(ck81Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qaw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dk81(gk81Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(waw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fk81(gk81Var)));
        return MobiusAndroid.b(Mobius.d(nk81.a, new a(gk81Var.b, coroutinesSubtypeEffectHandlerBuilderI)), bhm0Var, yj81.a);
    }
}
