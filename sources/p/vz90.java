package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vz90 {
    public final q8n a;
    public final q8n b;
    public final ro30 c;

    public vz90(q8n q8nVar, q8n q8nVar2, ro30 ro30Var) {
        this.a = q8nVar;
        this.b = q8nVar2;
        this.c = ro30Var;
    }

    public final MobiusLoop a() {
        drm1 drm1Var = new drm1((byte) 22);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ro30 ro30Var = this.c;
        pz90 pz90Var = new pz90(ro30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lz90.class), runSequentially.a(pz90Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mz90.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nz90(ro30Var)));
        return Mobius.d(drm1Var, new a(this.b, coroutinesSubtypeEffectHandlerBuilderI)).b(new dg90(this, (byte) 1)).d(new h0y(this, (byte) 28)).a(new wz90(31), Collections.singleton(lz90.a));
    }
}
