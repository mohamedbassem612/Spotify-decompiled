package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qno0 implements nve0 {
    public final String a;
    public final String b;
    public final mcs c;
    public final kt91 d;
    public final bw8 e;
    public final q8n f;
    public final a g;

    public qno0(String str, String str2, mcs mcsVar, kt91 kt91Var, bw8 bw8Var, q8n q8nVar, q8n q8nVar2) {
        this.a = str;
        this.b = str2;
        this.c = mcsVar;
        this.d = kt91Var;
        this.e = bw8Var;
        this.f = q8nVar2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently runConcurrently = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently();
        lno0 lno0Var = new lno0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qlo0.class), runConcurrently.a(lno0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rlo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new nno0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(slo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new pno0(this)));
        this.g = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    @Override // p.nve0
    public final Connectable a() {
        return this.g;
    }

    @Override // p.nve0
    public final Update b() {
        return xxb0.D;
    }
}
