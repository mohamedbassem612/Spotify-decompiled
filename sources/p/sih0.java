package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sih0 implements oih0 {
    public final oih0 a;
    public final bm00 b;

    public sih0(oih0 oih0Var, bm00 bm00Var) {
        this.a = oih0Var;
        this.b = bm00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(nih0 nih0Var, onm onmVar) {
        rih0 rih0Var;
        if (onmVar instanceof rih0) {
            rih0Var = (rih0) onmVar;
            int i = rih0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rih0Var.c = i - Integer.MIN_VALUE;
            } else {
                rih0Var = new rih0(this, onmVar);
            }
        } else {
            rih0Var = new rih0(this, onmVar);
        }
        Object objA = rih0Var.a;
        int i2 = rih0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            rih0Var.c = 1;
            objA = this.a.a(nih0Var, rih0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        List<u310> list = (List) objA;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (u310 u310Var : list) {
            Set set = s4b1.f;
            arrayList.add(u310.b(u310Var, (String) null, (String) null, (Uri) null, this.b.n((m210) null, uic.x(String.valueOf(u310Var.j)).c), (Double) null, (String) null, 0, (y310) null, (String) null, (Map) null, (Uri) null, (q510) null, -65537, 15));
        }
        return arrayList;
    }
}
