package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lre0 implements f961 {
    public final nzf a;
    public final ybg b;
    public final zud0 c;

    public lre0(nzf nzfVar, ybg ybgVar, zud0 zud0Var) {
        this.a = nzfVar;
        this.b = ybgVar;
        this.c = zud0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        kre0 kre0Var;
        zud0 zud0Var;
        boolean z;
        zud0 zud0Var2;
        lik1 lik1VarP;
        if (onmVar instanceof kre0) {
            kre0Var = (kre0) onmVar;
            int i = kre0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kre0Var.e = i - Integer.MIN_VALUE;
            } else {
                kre0Var = new kre0(this, onmVar);
            }
        } else {
            kre0Var = new kre0(this, onmVar);
        }
        Object obj = kre0Var.c;
        int i2 = kre0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            s1g s1gVar = new s1g(f5p1.q(this.a.a.c("client-locked-state", ""), new fca0()), (byte) 5);
            zud0 zud0Var3 = this.c;
            kre0Var.a = zud0Var3;
            kre0Var.e = 1;
            Object objI = b5p1.i(s1gVar, kre0Var);
            if (objI != d9nVar) {
                zud0Var = zud0Var3;
                obj = objI;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            zud0Var = kre0Var.a;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = kre0Var.b;
            zud0Var2 = kre0Var.a;
            hm5.M(obj);
        }
        lik1VarP = uap1.p(zud0Var2, z, ((Boolean) obj).booleanValue());
        if (lik1VarP != null) {
            return uap1.h(lik1VarP);
        }
        return null;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        iib iibVarA = this.b.a();
        kre0Var.a = zud0Var;
        kre0Var.b = zBooleanValue;
        kre0Var.e = 2;
        Object objI2 = b5p1.i(iibVarA, kre0Var);
        if (objI2 != d9nVar) {
            obj = objI2;
            z = zBooleanValue;
            zud0Var2 = zud0Var;
            lik1VarP = uap1.p(zud0Var2, z, ((Boolean) obj).booleanValue());
            if (lik1VarP != null) {
                return uap1.h(lik1VarP);
            }
            return null;
        }
        return d9nVar;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
