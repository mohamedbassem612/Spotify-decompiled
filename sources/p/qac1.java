package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qac1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2a1 b;

    public /* synthetic */ qac1(r2a1 r2a1Var, byte b) {
        this.a = b;
        this.b = r2a1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        r2a1 r2a1Var = this.b;
        switch (b) {
            case 0:
                String str = ((aac1) obj).c;
                i8h1 i8h1Var = (i8h1) r2a1Var.b;
                x6h1 x6h1VarC = ((h4l0) r2a1Var.c).b.c();
                x6h1VarC.i.add(new a7h1("datastory", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("take_screenshot", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                String str2 = ((dac1) obj).c;
                i8h1 i8h1Var2 = (i8h1) r2a1Var.b;
                h4l0 h4l0Var = (h4l0) r2a1Var.c;
                x6h1 x6h1VarC2 = h4l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("datastory", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = h4l0Var.c;
                i8h1Var2.f(k7h1Var.a(), (Set) null);
                break;
        }
    }
}
