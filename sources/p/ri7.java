package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ri7 {
    public static final ri7 a = new ri7();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rf01 rf01Var, zy70 zy70Var, onm onmVar) throws NoWhenBranchMatchedException {
        qi7 qi7Var;
        if (onmVar instanceof qi7) {
            qi7Var = (qi7) onmVar;
            int i = qi7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi7Var.d = i - Integer.MIN_VALUE;
            } else {
                qi7Var = new qi7(this, onmVar);
            }
        } else {
            qi7Var = new qi7(this, onmVar);
        }
        Object objC = qi7Var.b;
        int i2 = qi7Var.d;
        if (i2 == 0) {
            hm5.M(objC);
            qi7Var.a = zy70Var;
            qi7Var.d = 1;
            objC = rf01Var.c(zy70Var, qi7Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zy70Var = qi7Var.a;
            hm5.M(objC);
        }
        iz70 iz70Var = (iz70) objC;
        if (iz70Var instanceof tsc1) {
            tsc1 tsc1Var = (tsc1) iz70Var;
            return new li7(b2p1.v(tsc1Var.a, zy70Var.a), tsc1Var);
        }
        if (!(iz70Var instanceof viz)) {
            eg.o();
            return null;
        }
        viz vizVar = (viz) iz70Var;
        oq70 oq70Var = vizVar.a;
        return new ji7(oq70Var != null ? b2p1.v(oq70Var, zy70Var.a) : null, vizVar);
    }
}
