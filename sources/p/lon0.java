package p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lon0 extends hab0 implements zu30 {
    public final /* synthetic */ kd41 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lon0(ld41 ld41Var, ven0 ven0Var, tob1 tob1Var) {
        super(4);
        this.a = ld41Var;
        this.b = ven0Var;
        this.c = tob1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        wa5 wa5Var = (wa5) obj;
        hnn0 hnn0Var = (hnn0) obj2;
        b0k b0kVar = (b0k) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.b.getValue()).booleanValue()) {
            List list = (List) this.c.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!u890.j(hnn0Var, (hnn0) objPrevious));
            hnn0Var = (hnn0) objPrevious;
        }
        if (hnn0Var != null) {
            hon1.c(hnn0Var, this.a, apo.r(-1263531443, new loi0(hnn0Var, wa5Var, (byte) 22), b0kVar), b0kVar, 384);
        }
        return rih1.a;
    }
}
