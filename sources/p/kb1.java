package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g5l0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb1(g5l0 g5l0Var, byte b) {
        super(1);
        this.a = b;
        this.b = g5l0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        g5l0 g5l0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj).intValue();
                return g5l0Var.b();
            case 1:
                return new h3h1(new kb1(g5l0Var, b2));
            default:
                ((Number) obj).intValue();
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("search_results", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = g5l0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1Var2.b);
        }
    }
}
