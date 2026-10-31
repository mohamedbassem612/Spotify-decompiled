package p;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jx4 implements c9n {
    public final View a;
    public final z8e1 b;
    public final c9n c;
    public final AtomicReference d = wpo1.k();

    public jx4(View view, z8e1 z8e1Var, c9n c9nVar) {
        this.a = view;
        this.b = z8e1Var;
        this.c = c9nVar;
    }

    public final o8n J() {
        return this.c.J();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(qdt0 qdt0Var, onm onmVar) throws KotlinNothingValueException {
        ix4 ix4Var;
        if (onmVar instanceof ix4) {
            ix4Var = (ix4) onmVar;
            int i = ix4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix4Var.c = i - Integer.MIN_VALUE;
            } else {
                ix4Var = new ix4(this, onmVar);
            }
        } else {
            ix4Var = new ix4(this, onmVar);
        }
        Object obj = ix4Var.a;
        int i2 = ix4Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            b6 b6Var = new b6(qdt0Var, this, (byte) 3);
            hi2 hi2Var = new hi2(this, (lnm) null, (byte) 21);
            ix4Var.c = 1;
            if (wpo1.z(this.d, b6Var, hi2Var, ix4Var) == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }
}
