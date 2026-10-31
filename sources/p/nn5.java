package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nn5 implements qw40 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ow3 ow3Var = ((pn5) obj).c;
                i8h1 i8h1Var = (i8h1) ow3Var.b;
                x6h1 x6h1VarC = ((rrk0) ow3Var.c).b.c();
                x6h1VarC.i.add(new a7h1("icon_change_confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            case 1:
                ((y0o) ((goq) obj).c).invoke(brg0.c);
                break;
            case 2:
                sgz sgzVar = ((q2u) obj).b;
                r6h1 r6h1VarA = sgzVar.b.a();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-error-dialog";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = "pin_item_in_folder";
                y6h1 y6h1VarA2 = x6h1VarI.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1VarA;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                ((i8h1) sgzVar.a.get()).f(k7h1Var2.a(), (Set) null);
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
