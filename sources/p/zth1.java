package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zth1 implements Connectable {
    public final h3y0 a;
    public final e7y0 b;
    public final mie0 c;
    public final x1i1 d;
    public final u6y0 e;

    public zth1(h3y0 h3y0Var, e7y0 e7y0Var, mie0 mie0Var, x1i1 x1i1Var, u6y0 u6y0Var) {
        this.a = h3y0Var;
        this.b = e7y0Var;
        this.c = mie0Var;
        this.d = x1i1Var;
        this.e = u6y0Var;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xth1 xth1Var = new xth1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(auh1.class), runSequentially.a(xth1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(buh1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vth1(this)));
        return new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI).L(consumer);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r8 == r6) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.auh1 r8, p.onm r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zth1.a(p.auh1, p.onm):java.lang.Object");
    }
}
