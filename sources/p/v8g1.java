package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v8g1 {
    public final q8n a;
    public final xq81 b;

    public v8g1(q8n q8nVar, fza fzaVar, xq81 xq81Var) {
        this.a = q8nVar;
        this.b = xq81Var;
    }

    public final ku1 a() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        t8g1 t8g1Var = new t8g1();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y8g1.class), runSequentially.a(t8g1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x8g1.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new r8g1(this)));
        return new ku1(new a(this.a, coroutinesSubtypeEffectHandlerBuilderI), (byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(x8g1 x8g1Var, onm onmVar) {
        u8g1 u8g1Var;
        mwz0 m231Var;
        if (onmVar instanceof u8g1) {
            u8g1Var = (u8g1) onmVar;
            int i = u8g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8g1Var.c = i - Integer.MIN_VALUE;
            } else {
                u8g1Var = new u8g1(this, onmVar);
            }
        } else {
            u8g1Var = new u8g1(this, onmVar);
        }
        u8g1 u8g1Var2 = u8g1Var;
        Object objK = u8g1Var2.a;
        int i2 = u8g1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                xq81 xq81Var = this.b;
                String str = x8g1Var.a;
                long j = x8g1Var.b;
                Long l = x8g1Var.c;
                u8g1Var2.c = 1;
                objK = xq81Var.k(str, j, l, u8g1Var2);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            m231Var = (mwz0) objK;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        z8g1 z8g1Var = z8g1.a;
        if (thA != null) {
            Logger.e(thA, "Failed to fetch TimeSynced transcript", new Object[0]);
            return z8g1Var;
        }
        mwz0 mwz0Var = m231Var;
        if (!mwz0Var.a.isEmpty()) {
            return new b9g1(mwz0Var);
        }
        Logger.d("Received empty response from DataSource", new Object[0]);
        return z8g1Var;
    }
}
