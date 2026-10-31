package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class psj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lsj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psj0(lsj0 lsj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = lsj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        lsj0 lsj0Var = this.b;
        switch (b) {
            case 0:
                k691 k691Var = lsj0Var.i;
                qzh qzhVarR = voo1.r(lsj0Var.b);
                ((gcs) qzhVarR).a.setPadding(0, 0, 0, 0);
                return k691Var.a(qzhVarR);
            case 1:
                return new jpg0((rt01) lsj0Var.U0, kmj0.S0);
            case 2:
                x6h1 x6h1VarC = lsj0Var.V0.b.c();
                x6h1VarC.i.add(new a7h1("podcast_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            default:
                x6h1 x6h1VarC2 = lsj0Var.V0.b.c();
                x6h1VarC2.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        }
    }
}
