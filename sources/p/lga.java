package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lga extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zjd1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(iu30 iu30Var, zjd1 zjd1Var) {
        super(1);
        this.a = (byte) 0;
        this.c = iu30Var;
        this.b = zjd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        iu30 iu30Var = this.c;
        zjd1 zjd1Var = this.b;
        switch (b) {
            case 0:
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jh5) it.next()).b);
                }
                return new c64((mr20) iu30Var.invoke(o7h.p1(arrayList)), zjd1Var, (byte) 25);
            case 1:
                jh5 jh5Var = (jh5) obj;
                if (u890.j(jh5Var.a, zjd1Var) && ((Boolean) iu30Var.invoke(jh5Var.b)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                jh5 jh5Var2 = (jh5) obj;
                if (u890.j(jh5Var2.a, zjd1Var) && ((Boolean) iu30Var.invoke(jh5Var2.b)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lga(zjd1 zjd1Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = zjd1Var;
        this.c = iu30Var;
    }
}
