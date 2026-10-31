package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s97 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yu3 a;

    public s97(yu3 yu3Var) {
        this.a = yu3Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e97 e97Var = (e97) obj;
        yu3 yu3Var = this.a;
        List list = e97Var.a;
        ou80 ou80Var = e97Var.b;
        try {
            List listJ = ((xb7) yu3Var.c).k().j(list);
            ArrayList arrayList = new ArrayList(q7h.U(listJ, 10));
            Iterator it = listJ.iterator();
            while (true) {
                List listM = null;
                if (!it.hasNext()) {
                    break;
                }
                int iOrdinal = ((gn90) it.next()).ordinal();
                if (iOrdinal == 0) {
                    listM = p7h.M(new gzy[]{gzy.b, gzy.c, gzy.d, gzy.g});
                } else if (iOrdinal == 1) {
                    listM = p7h.M(new gzy[]{gzy.e, gzy.a});
                } else if (iOrdinal == 2) {
                    listM = Collections.singletonList(gzy.f);
                } else {
                    eg.o();
                }
                arrayList.add(listM);
            }
            ArrayList arrayListV = q7h.V(arrayList);
            b431 b431Var = (b431) yu3Var.e;
            String str = ou80Var != null ? ou80Var.a : null;
            yb7 yb7Var = (yb7) yu3Var.b;
            b431Var.a(new re7(yb7Var.c, yb7Var.d == qb7.b ? me7.b : me7.a, arrayListV), str);
        } catch (UninitializedPropertyAccessException unused) {
        }
        return rih1.a;
    }
}
