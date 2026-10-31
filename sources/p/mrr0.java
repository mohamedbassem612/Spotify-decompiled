package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mrr0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qrr0 a;

    public mrr0(qrr0 qrr0Var) {
        this.a = qrr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qrr0 qrr0Var = this.a;
        rrr0 rrr0Var = qrr0Var.d;
        i8h1 i8h1Var = (i8h1) rrr0Var.b.getValue();
        txk0 txk0Var = rrr0Var.c;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        qrr0Var.a.e();
        return rih1.a;
    }
}
