package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t551 {
    public final yjq a;
    public final qzn0 b;
    public final l7m0 c;
    public final dh30 d;
    public final q8n e;
    public final q8n f;

    public t551(yjq yjqVar, qzn0 qzn0Var, l7m0 l7m0Var, dh30 dh30Var, q8n q8nVar, q8n q8nVar2) {
        this.a = yjqVar;
        this.b = qzn0Var;
        this.c = l7m0Var;
        this.d = dh30Var;
        this.e = q8nVar;
        this.f = q8nVar2;
    }

    public final MobiusLoop a(String str) {
        String strO;
        if (str != null) {
            Set set = s4b1.f;
            strO = uic.x(str).o(1);
        } else {
            strO = null;
        }
        Set setSingleton = (strO == null || strO.length() == 0) ? w7x.a : Collections.singleton(new fx41(strO));
        wam0 wam0Var = new wam0((byte) 13);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        cy41 cy41Var = new cy41(this.b);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kx41.class), runSequentially.a(cy41Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tx41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gy41(this.d)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yx41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new ey41(this.a, this.c)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fx41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iy41()));
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(wam0Var, new a(this.f, coroutinesSubtypeEffectHandlerBuilderI)).b(new zgz0(this, (byte) 18)).d(new m7y0(this, (byte) 22)));
        i3o1 i3o1Var = strO != null ? gb51.c : eb51.c;
        if (strO == null) {
            strO = "";
        }
        return builderG.a(new a651(i3o1Var, strO, 3), setSingleton);
    }
}
