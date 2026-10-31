package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zr6 implements Function {
    public final Set a;

    public Object apply(Object obj) {
        ch90 ch90Var = (ch90) obj;
        String str = ch90Var.b;
        List list = ch90Var.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!this.a.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        return new tm6(str, arrayList);
    }
}
