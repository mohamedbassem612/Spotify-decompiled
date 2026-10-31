package p;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d741 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e741 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d741(e741 e741Var, byte b) {
        super(0);
        this.a = b;
        this.b = e741Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e741 e741Var = this.b;
        switch (b) {
            case 0:
                wdr wdrVar = e741Var.h;
                i8h1 i8h1Var = wdrVar.a;
                x6h1 x6h1VarC = ((xok0) wdrVar.b.b).b.c();
                x6h1VarC.i.add(new a7h1("container_nudge_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            default:
                eyh0 eyh0Var = e741Var.b;
                dma1 dma1Var = (dma1) eyh0Var.b;
                bma1 bma1Var = pm.b;
                int iL = dma1Var.l(bma1Var, 0);
                if (iL == 0) {
                    l1d.B((yqg) eyh0Var.c, dma1Var.edit(), pm.a);
                }
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.b(bma1Var, iL + 1);
                hma1VarEdit.g();
                slc0 slc0Var = new slc0(UUID.randomUUID().toString());
                zdr zdrVar = e741Var.g;
                fq7.C(zdrVar.d).flatMapCompletable(new ydr(zdrVar, slc0Var, 3, (byte) 1)).subscribe();
                e741Var.j = slc0Var;
                break;
        }
        return rih1Var;
    }
}
