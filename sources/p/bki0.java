package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bki0 implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final int d;

    public /* synthetic */ bki0(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
    }

    public final Object invoke() {
        List listL1;
        byte b = this.a;
        z6x z6xVar = z6x.a;
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                eki0 eki0Var = (eki0) obj2;
                t8 t8Var = (t8) obj;
                byp bypVar = eki0Var.a;
                o5 o5VarA = eki0Var.a((n9r) bypVar.a);
                listL1 = o5VarA != null ? o7h.l1(((kf5) ((ks6) bypVar.b).e).r(o5VarA, t8Var, i)) : null;
                return listL1 == null ? z6xVar : listL1;
            case 1:
                eki0 eki0Var2 = (eki0) obj2;
                t8 t8Var2 = (t8) obj;
                byp bypVar2 = eki0Var2.a;
                o5 o5VarA2 = eki0Var2.a((n9r) bypVar2.a);
                listL1 = o5VarA2 != null ? ((kf5) ((ks6) bypVar2.b).e).g(o5VarA2, t8Var2, i) : null;
                return listL1 == null ? z6xVar : listL1;
            default:
                uqs uqsVar = (uqs) obj2;
                fa faVar = (fa) ((ArrayList) obj).get(i);
                boolean z = faVar.c == null;
                wf5 wf5Var = (wf5) uqsVar.e;
                boolean z2 = wf5Var == wf5.TYPE_PARAMETER_BOUNDS;
                if (!z && !z2) {
                    wf5Var = wf5.TYPE_USE;
                }
                r8a0 r8a0Var = faVar.b;
                if (r8a0Var != null) {
                    return (v7a0) r8a0Var.a.get(wf5Var);
                }
                return null;
        }
    }
}
