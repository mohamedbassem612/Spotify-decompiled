package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class luc {
    public final sja1 a;

    public luc(sja1 sja1Var) {
        this.a = sja1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        kuc kucVar;
        Object objC;
        if (onmVar instanceof kuc) {
            kucVar = (kuc) onmVar;
            int i = kucVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kucVar.c = i - Integer.MIN_VALUE;
            } else {
                kucVar = new kuc(this, onmVar);
            }
        } else {
            kucVar = new kuc(this, onmVar);
        }
        Object obj = kucVar.a;
        int i2 = kucVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            kucVar.c = 1;
            objC = this.a.c(str, kucVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objC = ((e331) obj).a;
        }
        if (objC instanceof m231) {
            return null;
        }
        return objC;
    }
}
