package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6e0 implements q6e0 {
    public final iu30 a;
    public final n561 b;

    public o6e0(iu30 iu30Var, n561 n561Var) {
        this.a = iu30Var;
        this.b = n561Var;
    }

    public final Observable b() {
        return yoi1.i(new m441(new k1e0(this, (lnm) null, (byte) 4)), o6x.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Object obj, onm onmVar) {
        n6e0 n6e0Var;
        if (onmVar instanceof n6e0) {
            n6e0Var = (n6e0) onmVar;
            int i = n6e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n6e0Var.c = i - Integer.MIN_VALUE;
            } else {
                n6e0Var = new n6e0(this, onmVar);
            }
        } else {
            n6e0Var = new n6e0(this, onmVar);
        }
        Object obj2 = n6e0Var.a;
        int i2 = n6e0Var.c;
        if (i2 == 0) {
            hm5.M(obj2);
            for (p6e0 p6e0Var : this.b) {
            }
            return obj;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            hm5.M(obj2);
            return obj2;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public final Bundle serialize() {
        return null;
    }

    public final void a(Bundle bundle) {
    }
}
