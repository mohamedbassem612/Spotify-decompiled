package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hn4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ in4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn4(in4 in4Var, byte b) {
        super(0);
        this.a = b;
        this.b = in4Var;
    }

    public final Object invoke() {
        byte b = this.a;
        in4 in4Var = this.b;
        switch (b) {
            case 0:
                luk lukVar = in4Var.e;
                if (lukVar != null) {
                    return (in4) lukVar.e(new en4(in4Var, (byte) 2));
                }
                return null;
            default:
                List list = jet0.a;
                ArrayList<het0> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((het0) obj).a.invoke(in4Var)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (het0 het0Var : arrayList) {
                    List list2 = het0Var.c;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new mmr0((String) it.next(), het0Var.b));
                    }
                    r7h.W(arrayList3, arrayList2);
                }
                return sqg0.T(arrayList2);
        }
    }
}
