package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bbb1 {
    public final um51 a;
    public final big0 b;

    public bbb1(um51 um51Var, big0 big0Var) {
        this.a = um51Var;
        this.b = big0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws IOException {
        abb1 abb1Var;
        nn51 nn51Var;
        if (onmVar instanceof abb1) {
            abb1Var = (abb1) onmVar;
            int i = abb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abb1Var.c = i - Integer.MIN_VALUE;
            } else {
                abb1Var = new abb1(this, onmVar);
            }
        } else {
            abb1Var = new abb1(this, onmVar);
        }
        Object objA = abb1Var.a;
        int i2 = abb1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            abb1Var.c = 1;
            objA = this.b.a(str, abb1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        d5b1 d5b1Var = (d5b1) objA;
        if (d5b1Var == null || (nn51Var = d5b1Var.d) == null) {
            return null;
        }
        return this.a.a(nn51Var);
    }
}
