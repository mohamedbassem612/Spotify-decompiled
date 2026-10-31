package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dah0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mah0 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dah0(ArrayList arrayList, mah0 mah0Var, iu30 iu30Var) {
        super(2);
        this.c = arrayList;
        this.b = mah0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        ArrayList arrayList = this.c;
        mah0 mah0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String strO0 = cwl1.o0(x340Var2, 2131957265);
                    Iterator it = arrayList.iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        z6x z6xVar = (List) mah0Var.a.get((bbh0) it.next());
                        if (z6xVar == null) {
                            z6xVar = z6x.a;
                        }
                        size += z6xVar.size();
                    }
                    String strN0 = cwl1.n0(2131957270, new Object[]{strO0, Integer.valueOf(size)}, x340Var2);
                    boolean z = mah0Var.d == null;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ebg0(iu30Var, (byte) 16);
                        x340Var2.s0(objT);
                    }
                    o4o1.d(0, strN0, (Function0) objT, x340Var2, z);
                }
                break;
            default:
                ((Number) obj2).intValue();
                o4o1.e(mah0Var, arrayList, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dah0(mah0 mah0Var, ArrayList arrayList, iu30 iu30Var, int i) {
        super(2);
        this.b = mah0Var;
        this.c = arrayList;
        this.d = iu30Var;
    }
}
