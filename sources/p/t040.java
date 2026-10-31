package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t040 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ u040 a;

    public t040(u040 u040Var) {
        this.a = u040Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s040 s040Var;
        Object b040Var;
        if (onmVar instanceof s040) {
            s040Var = (s040) onmVar;
            int i = s040Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s040Var.b = i - Integer.MIN_VALUE;
            } else {
                s040Var = new s040(this, onmVar);
            }
        } else {
            s040Var = new s040(this, onmVar);
        }
        Object obj2 = s040Var.a;
        int i2 = s040Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            try {
                Iterable<eww0> iterable = (Iterable) this.a.e.d(((qz30) obj).c).firstOrError().blockingGet();
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                for (eww0 eww0Var : iterable) {
                    arrayList.add(new e040(eww0Var.a, eww0Var.b, eww0Var.f));
                }
                b040Var = new b040(arrayList);
            } catch (Exception unused) {
                b040Var = a040.a;
            }
            s040Var.b = 1;
            Object objB = r261Var.b(b040Var, s040Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
