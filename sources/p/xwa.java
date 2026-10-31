package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwa {
    public uwa a;

    public final Object a(vwa[] vwaVarArr, lnm lnmVar) {
        if (vwaVarArr.length == 0) {
            return z6x.a;
        }
        uwa uwaVar = this.a;
        if (uwaVar != null) {
            return uwaVar.a(Arrays.asList(vwaVarArr), lnmVar);
        }
        ArrayList arrayList = new ArrayList(vwaVarArr.length);
        for (vwa vwaVar : vwaVarArr) {
            arrayList.add(new wwa(vwaVar, null));
        }
        return arrayList;
    }
}
