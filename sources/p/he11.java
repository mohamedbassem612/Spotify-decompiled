package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class he11 {
    public final bfd a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        ge11 ge11Var;
        if (onmVar instanceof ge11) {
            ge11Var = (ge11) onmVar;
            int i = ge11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge11Var.c = i - Integer.MIN_VALUE;
            } else {
                ge11Var = new ge11(this, onmVar);
            }
        } else {
            ge11Var = new ge11(this, onmVar);
        }
        Object obj = ge11Var.a;
        int i2 = ge11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bfd bfdVar = this.a;
                ge11Var.c = 1;
                Object objD = bfdVar.D(ge11Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        n261 n261Var;
        if (onmVar instanceof n261) {
            n261Var = (n261) onmVar;
            int i = n261Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n261Var.c = i - Integer.MIN_VALUE;
            } else {
                n261Var = new n261(this, onmVar);
            }
        } else {
            n261Var = new n261(this, onmVar);
        }
        Object obj = n261Var.a;
        int i2 = n261Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bfd bfdVar = this.a;
                n261Var.c = 1;
                Object objI = bfdVar.I(str, n261Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
