package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lz81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ mz81 b;

    public lz81(p811 p811Var, mz81 mz81Var) {
        this.a = p811Var;
        this.b = mz81Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objB;
        w7x hashSet;
        Set setP1 = o7h.p1(((oz81) obj).a);
        p811 p811Var = this.a;
        rz81 rz81Var = null;
        if (!setP1.equals(p811Var.a)) {
            p811Var.a = setP1;
            mz81 mz81Var = this.b;
            rhg0 rhg0Var = mz81Var.b;
            ArrayList arrayList = mz81Var.e;
            ArrayList arrayList2 = mz81Var.d;
            rhg0Var.a(setP1, arrayList2, arrayList);
            d0r d0rVar = mz81Var.a;
            q8n q8nVar = zz81.a;
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                hashSet = w7x.a;
            } else {
                hashSet = new HashSet();
                zz81.a(arrayList2, hashSet);
                zz81.a(arrayList, hashSet);
            }
            mmr0 mmr0VarB = zz81.b(d0rVar);
            rz81Var = new rz81((ioj0) mmr0VarB.a, (d0r) mmr0VarB.b, hashSet, (kx70) null);
        }
        return (rz81Var == null || (objB = r261Var.b(rz81Var, onmVar)) != d9n.a) ? rih1.a : objB;
    }
}
