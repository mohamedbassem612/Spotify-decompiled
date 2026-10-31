package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lw6 implements xq91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(yq91 yq91Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((i8h1) ((mw6) obj2).d.get()).f(((wqk0) obj).e(), (Set) null);
                break;
            case 1:
                l7h1 l7h1Var = (l7h1) ((Function0) obj2).invoke();
                if (l7h1Var != null) {
                    ((i8h1) ((rm9) obj).j.get()).f(l7h1Var, (Set) null);
                }
                break;
            case 2:
                ((i8h1) ((mtm) obj2).j.get()).f(((sqk0) obj).e(), (Set) null);
                break;
            case 3:
                ((i8h1) ((rss) obj2).b.get()).f(((wqk0) obj).e(), (Set) null);
                break;
            default:
                q9t q9tVar = (q9t) obj2;
                kjo0 kjo0Var = q9tVar.a;
                y441 y441Var = (y441) obj;
                li9 li9Var = (li9) y441Var.c;
                String str = kjo0Var.a;
                String str2 = kjo0Var.i;
                bdj0 bdj0Var = kjo0Var.h;
                li9Var.c(str, "DELETE", "", str2, bdj0Var.b, bdj0Var.a);
                bym1 bym1Var = (bym1) y441Var.b;
                int i = q9tVar.c;
                rrk0 rrk0Var = (rrk0) bym1Var.c;
                String str3 = kjo0Var.a;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = rrk0Var.b.c();
                x6h1VarC.i.add(new a7h1("confirmation_snackbar", str3, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                ((i8h1) bym1Var.b).f(k7h1Var.a(), (Set) null);
                break;
        }
    }
}
