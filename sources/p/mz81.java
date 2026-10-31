package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mz81 implements Connectable {
    public final d0r a;
    public final rhg0 b;
    public final guh0 c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public mz81(d0r d0rVar, rhg0 rhg0Var, guh0 guh0Var) {
        this.a = d0rVar;
        this.b = rhg0Var;
        this.c = guh0Var;
    }

    public final Connection L(Consumer consumer) {
        p811 p811Var = new p811();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        zvg zvgVar = new zvg(zz81.a);
        lz81 lz81Var = new lz81(p811Var, this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oz81.class), new yvg(zvgVar, lz81Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nz81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kz81(this)));
        return new a(igu.b, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }
}
