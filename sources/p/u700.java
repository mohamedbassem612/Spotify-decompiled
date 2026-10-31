package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u700 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w700 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u700(w700 w700Var, byte b) {
        super(1);
        this.a = b;
        this.b = w700Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w700 w700Var = this.b;
        switch (b) {
            case 0:
                return w700Var.b;
            default:
                p800 p800Var = w700Var.a;
                List<q700> list = p800Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (q700 q700Var : list) {
                    arrayList.add(new pf3(q700Var.a, q700Var.b, new g07(q700Var.c), q700Var.d, q700Var.e, false, 96));
                }
                return new o800(null, arrayList, p800Var.b);
        }
    }
}
