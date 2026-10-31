package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ql60 extends n541 {
    public final Map K;
    public x8v L;

    public ql60(hw3 hw3Var, f9v f9vVar, b9v b9vVar, Map map) {
        super(hw3Var, f9vVar, b9vVar);
        this.K = map;
    }

    @Override // p.n541
    public final ie30 n(ie30 ie30Var) {
        x8v x8vVar;
        x8v x8vVar2 = this.L;
        if (x8vVar2 == null) {
            x8vVar2 = ie30Var.t;
        }
        if (x8vVar2 != null && (x8vVar = (x8v) this.K.get(x8vVar2.c)) != null) {
            x8vVar2 = x8vVar;
        }
        hjj0 hjj0Var = ie30Var.m;
        hjj0 hjj0Var2 = null;
        if (hjj0Var == null) {
            hjj0Var = hjj0Var2;
        } else {
            rij0[] rij0VarArr = hjj0Var.a;
            int length = rij0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                rij0 rij0Var = rij0VarArr[i2];
                if ((rij0Var instanceof how0) && "com.apple.streaming.transportStreamTimestamp".equals(((how0) rij0Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    rij0[] rij0VarArr2 = new rij0[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            rij0VarArr2[i < i2 ? i : i - 1] = rij0VarArr[i];
                        }
                        i++;
                    }
                    hjj0Var2 = new hjj0(rij0VarArr2);
                }
                hjj0Var = hjj0Var2;
            }
        }
        if (x8vVar2 != ie30Var.t || hjj0Var != ie30Var.m) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.s = x8vVar2;
            ge30VarA.l = hjj0Var;
            ie30Var = new ie30(ge30VarA);
        }
        return super.n(ie30Var);
    }
}
