package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fo5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ho5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo5(ho5 ho5Var, byte b) {
        super(1);
        this.a = b;
        this.b = ho5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ho5 ho5Var = this.b;
        switch (b) {
            case 0:
                return ho5Var.c;
            default:
                dva dvaVar = ho5Var.d;
                do5 do5VarA = ho5Var.b.a();
                List listL1 = o7h.l1((Iterable) dvaVar.a.get());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listL1) {
                    ((mo5) obj2).getClass();
                    arrayList.add(obj2);
                }
                List<mo5> listA1 = o7h.a1(arrayList, new cvt((byte) 3));
                ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
                for (mo5 mo5Var : listA1) {
                    arrayList2.add(new tn5(mo5Var.a, mo5Var.b));
                }
                return new eo5(arrayList2, do5VarA);
        }
    }
}
