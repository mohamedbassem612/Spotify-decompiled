package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t8g1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s8g1 s8g1Var;
        jyv0 m231Var;
        if (onmVar instanceof s8g1) {
            s8g1Var = (s8g1) onmVar;
            int i = s8g1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8g1Var.b = i - Integer.MIN_VALUE;
            } else {
                s8g1Var = new s8g1(this, onmVar);
            }
        } else {
            s8g1Var = new s8g1(this, onmVar);
        }
        Object obj2 = s8g1Var.a;
        int i2 = s8g1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            y8g1 y8g1Var = (y8g1) obj;
            try {
                m231Var = fza.i(y8g1Var.a, y8g1Var.b);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            Throwable thA = e331.a(m231Var);
            Object a9g1Var = z8g1.a;
            if (thA == null) {
                jyv0 jyv0Var = m231Var;
                if (jyv0Var.a.isEmpty()) {
                    Logger.d("Received empty PreparedTranscript", new Object[0]);
                } else {
                    a9g1Var = new a9g1(jyv0Var);
                }
            } else {
                Logger.e(thA, "Failed to prepare transcript", new Object[0]);
            }
            s8g1Var.b = 1;
            Object objB = r261Var.b(a9g1Var, s8g1Var);
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
