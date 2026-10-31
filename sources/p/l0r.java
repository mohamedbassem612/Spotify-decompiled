package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l0r implements Connectable {
    public final d0r a;
    public final iu30 b;
    public final iu30 c;
    public final xu30 d;
    public final iu30 e;
    public final iu30 f;
    public final qn g;

    public l0r(d0r d0rVar, iu30 iu30Var, iu30 iu30Var2, q8n q8nVar, xu30 xu30Var, iu30 iu30Var3, iu30 iu30Var4) {
        this.a = d0rVar;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = xu30Var;
        this.e = iu30Var3;
        this.f = iu30Var4;
        this.g = new qn(new fnn(this, (byte) 27), q8nVar, (byte) 7);
    }

    public final Connection L(Consumer consumer) {
        return this.g.L(consumer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, Object obj2, onm onmVar) throws Throwable {
        j0r j0rVar;
        if (onmVar instanceof j0r) {
            j0rVar = (j0r) onmVar;
            int i = j0rVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0rVar.c = i - Integer.MIN_VALUE;
            } else {
                j0rVar = new j0r(this, onmVar);
            }
        } else {
            j0rVar = new j0r(this, onmVar);
        }
        Object m231Var = j0rVar.a;
        int i2 = j0rVar.c;
        try {
            if (i2 == 0) {
                hm5.M(m231Var);
                xu30 xu30Var = this.d;
                j0rVar.c = 1;
                m231Var = xu30Var.invoke(obj, obj2, j0rVar);
                d9n d9nVar = d9n.a;
                if (m231Var == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(m231Var);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 == null) {
            return m231Var;
        }
        return this.e.invoke(new g0r(thA2));
    }
}
