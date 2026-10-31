package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q3o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op80 b;
    public final /* synthetic */ y6h1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3o(op80 op80Var, y6h1 y6h1Var, byte b) {
        super(1);
        this.a = b;
        this.b = op80Var;
        this.c = y6h1Var;
    }

    public final Object invoke(Object obj) {
        r6h1 r6h1Var;
        iu30 iu30Var;
        r6h1 r6h1Var2;
        iu30 iu30Var2;
        r6h1 r6h1Var3;
        iu30 iu30Var3;
        byte b = this.a;
        y6h1 y6h1Var = this.c;
        op80 op80Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj).intValue();
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(0)) == null) {
                    r6h1Var = r6h1.c;
                }
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                ((Number) obj).intValue();
                h3h1 h3h1VarC2 = j0o1.C(op80Var);
                if (h3h1VarC2 == null || (iu30Var2 = h3h1VarC2.b) == null || (r6h1Var2 = (r6h1) iu30Var2.invoke(0)) == null) {
                    r6h1Var2 = r6h1.c;
                }
                r6h1 r6h1Var5 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var2.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var2.b);
            default:
                ((Number) obj).intValue();
                h3h1 h3h1VarC3 = j0o1.C(op80Var);
                if (h3h1VarC3 == null || (iu30Var3 = h3h1VarC3.b) == null || (r6h1Var3 = (r6h1) iu30Var3.invoke(0)) == null) {
                    r6h1Var3 = r6h1.c;
                }
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var3.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var3.b);
        }
    }
}
