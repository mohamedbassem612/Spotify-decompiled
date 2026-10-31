package p;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qd51 {
    public final va40 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, String str2, onm onmVar, boolean z) {
        dze1 dze1Var;
        if (onmVar instanceof dze1) {
            dze1Var = (dze1) onmVar;
            int i = dze1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dze1Var.d = i - Integer.MIN_VALUE;
            } else {
                dze1Var = new dze1(this, onmVar);
            }
        } else {
            dze1Var = new dze1(this, onmVar);
        }
        Object objG = dze1Var.b;
        int i2 = dze1Var.d;
        if (i2 == 0) {
            hm5.M(objG);
            Map mapSingletonMap = Collections.singletonMap(str, Boolean.valueOf(z));
            dze1Var.a = str2;
            dze1Var.d = 1;
            objG = this.a.g(str2, mapSingletonMap, dze1Var);
            Object obj = d9n.a;
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = dze1Var.a;
            hm5.M(objG);
        }
        List list = (List) objG;
        if (!list.isEmpty()) {
            return list;
        }
        eg.m(l1d.m("returned no affected entities for URI: ", str2));
        return null;
    }
}
