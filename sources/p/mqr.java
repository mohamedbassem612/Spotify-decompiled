package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mqr implements Function {
    public final /* synthetic */ iu30 a;

    public Object apply(Object obj) {
        z310 z310Var = (z310) obj;
        List list = z310Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((u310) this.a.invoke((u310) it.next()));
        }
        return z310.a(z310Var, arrayList, (f410) null, 14);
    }
}
