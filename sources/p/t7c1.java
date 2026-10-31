package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7c1 {
    public final w4c1 a;
    public final Observable b;
    public final Observable c;
    public final r2a1 d;
    public final q8n e;
    public final q8n f;
    public final String g;

    public t7c1(w4c1 w4c1Var, Observable observable, Observable observable2, r2a1 r2a1Var, q8n q8nVar, q8n q8nVar2, String str) {
        this.a = w4c1Var;
        this.b = observable;
        this.c = observable2;
        this.d = r2a1Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = str;
    }

    public final MobiusLoop.Controller a(b9c1 b9c1Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        a7c1 a7c1Var = new a7c1(this.d);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(z6c1.class), runSequentially.a(a7c1Var));
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        q8n q8nVar = this.f;
        w4c1 w4c1Var = this.a;
        String str = this.g;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y6c1.class), runSequentially2.a(new c7c1(q8nVar, w4c1Var, str)));
        MobiusLoop.Builder builderB = Mobius.d(q7c1.a, new a(this.e, coroutinesSubtypeEffectHandlerBuilderI)).h(RxEventSources.a(new ObservableSource[]{this.b.map(i2x0.O0).onErrorResumeNext(new clv(str, (byte) 15)), this.c.map(r3x0.R0).onErrorResumeNext(new ljp1(str, (byte) 17))})).d(new r7c1(this)).b(new s7c1(this));
        "Story for ".concat(str);
        return Mobius.b(l1d.g(builderB), b9c1Var, p7c1.a, MainThreadWorkRunner.a());
    }
}
