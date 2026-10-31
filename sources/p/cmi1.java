package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cmi1 implements fli1 {
    public final q8n X;
    public final v1k a;
    public final oj80 b;
    public final nn61 c;
    public final uqv0 d;
    public final uqv0 e;
    public final fna f;
    public final h9n g;
    public final dh30 h;
    public final nni1 i;
    public final ocu t;

    public cmi1(v1k v1kVar, oj80 oj80Var, nn61 nn61Var, uqv0 uqv0Var, uqv0 uqv0Var2, fna fnaVar, h9n h9nVar, dh30 dh30Var, nni1 nni1Var, ocu ocuVar, q8n q8nVar) {
        this.a = v1kVar;
        this.b = oj80Var;
        this.c = nn61Var;
        this.d = uqv0Var;
        this.e = uqv0Var2;
        this.f = fnaVar;
        this.g = h9nVar;
        this.h = dh30Var;
        this.i = nni1Var;
        this.t = ocuVar;
        this.X = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        jdu jduVar = (jdu) this.t;
        synchronized (jduVar) {
            if (jduVar.f == null) {
                jduVar.f = Mobius.d(new drm1((byte) 11), jduVar.a).c(jduVar.b, new EventSource[]{jduVar.e}).g(new kdu(((r65) jduVar.d.get()).b(), null, false, false, b7x.a));
            }
        }
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        zli1 zli1Var = new zli1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tki1.class), runSequentially.a(zli1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dli1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new vli1()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ali1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bli1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new pli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new rli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ili1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ski1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vki1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tli1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cli1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nli1(this)));
        return new pee0(new a(this.X, coroutinesSubtypeEffectHandlerBuilderI).L(consumer), this, (byte) 12);
    }
}
