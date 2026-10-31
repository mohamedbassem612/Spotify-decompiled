package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dvr implements xq91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dvr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(yq91 yq91Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iir iirVar = ((hvr) obj).e;
                i8h1 i8h1Var = (i8h1) ((kly0) iirVar.b).get();
                bqk0 bqk0Var = (bqk0) iirVar.c;
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = bqk0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            case 1:
                q8h1 q8h1Var = ((rj70) obj).j;
                i8h1 i8h1Var2 = q8h1Var.b;
                bbl0 bbl0Var = q8h1Var.a;
                x6h1 x6h1VarC2 = bbl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("host_approved_request_nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = bbl0Var.a;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                break;
            case 2:
                rok0 rok0Var = ((tjo0) obj).a;
                ((i8h1) rok0Var.b).f(((fvk0) rok0Var.c).e(), (Set) null);
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}
