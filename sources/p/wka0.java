package p;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wka0 implements Function0 {
    public final /* synthetic */ byte a;
    public final yka0 b;

    public /* synthetic */ wka0(yka0 yka0Var, byte b) {
        this.a = b;
        this.b = yka0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        yka0 yka0Var = this.b;
        switch (b) {
            case 0:
                boolean zE = yka0Var.e();
                if (zE) {
                    mc11 mc11Var = yka0Var.n;
                    mma0[] mma0VarArr = yka0.w;
                    mma0 mma0Var = mma0VarArr[11];
                    Collection collection = (Collection) mc11Var.invoke();
                    mc11 mc11Var2 = yka0Var.p;
                    mma0 mma0Var2 = mma0VarArr[13];
                    return o7h.N0((Collection) mc11Var2.invoke(), collection);
                }
                if (zE) {
                    eg.o();
                    return null;
                }
                mc11 mc11Var3 = yka0Var.t;
                mma0 mma0Var3 = yka0.w[17];
                Collection collection2 = (Collection) mc11Var3.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection2) {
                    if (sh10.d((lft) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                Collection collectionA = yka0Var.a();
                mc11 mc11Var4 = yka0Var.n;
                mma0 mma0Var4 = yka0.w[11];
                return o7h.N0((Collection) mc11Var4.invoke(), collectionA);
        }
    }
}
