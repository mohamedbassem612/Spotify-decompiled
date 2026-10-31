package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jia0 implements Function0 {
    public final /* synthetic */ byte a;
    public final ajm0 b;

    public /* synthetic */ jia0(ajm0 ajm0Var, byte b) {
        this.a = b;
        this.b = ajm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ajm0 ajm0Var = this.b;
        switch (b) {
            case 0:
                return new kia0(ajm0Var);
            case 1:
                yim0 yim0Var = ajm0Var.h;
                if (yim0Var == null) {
                    eg.f(l1d.n(ajm0Var.getName().a, " were not set before querying module content", new StringBuilder("Dependencies of module ")));
                    return null;
                }
                List list = yim0Var.a;
                ajm0Var.w1();
                list.contains(ajm0Var);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((ajm0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    fzq0 fzq0Var = ((ajm0) it2.next()).i;
                    fzq0Var.getClass();
                    arrayList.add(fzq0Var);
                }
                return new j2k(arrayList, "CompositeProvider@ModuleDescriptor for " + ajm0Var.getName());
            default:
                return ajm0Var.D(sfb1.i).h;
        }
    }
}
