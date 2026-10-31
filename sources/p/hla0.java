package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class hla0 extends cey0 {
    public static final hla0 b = new hla0(ila0.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    public final Object get(Object obj) {
        List listD = ((tka0) obj).d();
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            tka0 tka0VarK = ((oma0) it.next()).k();
            tka0 tka0Var = tka0VarK instanceof tka0 ? tka0VarK : null;
            if (tka0Var != null) {
                arrayList.add(tka0Var);
            }
        }
        return arrayList;
    }
}
