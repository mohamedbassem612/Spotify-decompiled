package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ka2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mwq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka2(mwq0 mwq0Var, byte b) {
        super(0);
        this.a = b;
        this.b = mwq0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mwq0 mwq0Var = this.b;
        switch (b) {
            case 0:
                lwq0.a(mwq0Var.e);
                return rih1Var;
            case 1:
                lwq0.a(mwq0Var.e);
                return rih1Var;
            case 2:
                return (kwq0) o7h.C0(mwq0Var.b);
            default:
                bw91 bw91Var = mwq0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(bw91Var, 10));
                ek60 ek60VarListIterator = bw91Var.listIterator();
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        return mqo1.A(arrayList);
                    }
                    arrayList.add(((kwq0) ek60Var.next()).b);
                }
                break;
        }
    }
}
