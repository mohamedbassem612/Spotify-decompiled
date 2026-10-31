package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yim0 implements Function {
    public final List a;

    public yim0(e821 e821Var, List list) {
        this.a = list;
    }

    public Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            hi90 hi90Var = (hi90) obj2;
            boolean z = hi90Var instanceof vh90;
            List list = this.a;
            if (z ? list.contains(gzy.a) : hi90Var instanceof eh90 ? list.contains(gzy.f) : true) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public yim0(List list) {
        this.a = list;
    }
}
