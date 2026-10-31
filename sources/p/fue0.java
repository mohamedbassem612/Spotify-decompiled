package p;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fue0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bab1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fue0(bab1 bab1Var, byte b) {
        super(0);
        this.a = b;
        this.b = bab1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        bab1 bab1Var = this.b;
        switch (b) {
            case 0:
                aab1.b(bab1Var.d);
                return rih1.a;
            case 1:
                bw91 bw91Var = bab1Var.a;
                HashSet hashSet = new HashSet();
                ek60 it = bw91Var.iterator();
                while (true) {
                    ek60 ek60Var = it;
                    if (!ek60Var.hasNext()) {
                        return hashSet;
                    }
                    hashSet.add(((z9b1) ek60Var.next()).a);
                }
                break;
            case 2:
                return (z9b1) o7h.A0(bab1Var.a);
            default:
                bw91 bw91Var2 = bab1Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(bw91Var2, 10));
                ek60 ek60VarListIterator = bw91Var2.listIterator();
                while (true) {
                    ek60 ek60Var2 = ek60VarListIterator;
                    if (!ek60Var2.hasNext()) {
                        return mqo1.A(arrayList);
                    }
                    arrayList.add(((z9b1) ek60Var2.next()).b);
                }
                break;
        }
    }
}
