package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vfk0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bgk0 a;

    public vfk0(bgk0 bgk0Var) {
        this.a = bgk0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cfd cfdVar = this.a.a;
        ((lzn0) cfdVar.b).e();
        yge0 yge0Var = (yge0) cfdVar.c;
        i8h1 i8h1Var = (i8h1) ((kly0) yge0Var.b).get();
        x6h1 x6h1VarC = ((yok0) yge0Var.c).b.c();
        x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
