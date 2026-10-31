package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qtb extends hab0 implements Function0 {
    public final /* synthetic */ lub a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtb(lub lubVar, long j, boolean z) {
        super(0);
        this.a = lubVar;
        this.b = j;
        this.c = z;
    }

    public final Object invoke() {
        lub lubVar = this.a;
        hp80 hp80Var = lubVar.b;
        String strA = lubVar.a();
        if (strA != null) {
            mub mubVar = lubVar.a;
            long j = this.c ? 0L : this.b;
            uba ubaVar = mubVar.b;
            opl0 opl0VarA = mubVar.a(strA, hp80Var);
            String strValueOf = String.valueOf(j);
            x6h1 x6h1VarC = opl0VarA.c.c();
            x6h1VarC.i.add(new a7h1("progress_bar", (String) null, (Integer) null, (String) null, strValueOf));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = opl0VarA.b;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            lubVar.d = ubaVar.p(k7h1Var.a(), mub.d);
        }
        return rih1.a;
    }
}
