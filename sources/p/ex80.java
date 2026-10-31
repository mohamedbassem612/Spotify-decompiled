package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ex80 {
    public final qmu a;
    public final qzn0 b;
    public final q8n c;
    public final q8n d;

    public ex80(qmu qmuVar, qzn0 qzn0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = qmuVar;
        this.b = qzn0Var;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    public final MobiusLoop a() {
        drm1 drm1Var = new drm1((byte) 21);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sw80 sw80Var = new sw80(this.a);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ow80.class), runSequentially.a(sw80Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pw80.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qw80(this.b)));
        return l1d.g(Mobius.d(drm1Var, new a(this.d, coroutinesSubtypeEffectHandlerBuilderI)).b(new hl00(this, (byte) 17)).d(new il00(this, (byte) 16))).a(new fx80(), Collections.singleton(ow80.a));
    }
}
