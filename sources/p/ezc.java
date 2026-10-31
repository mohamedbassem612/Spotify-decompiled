package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ezc extends bge {
    public final vu30 e;

    public ezc(vu30 vu30Var, o8n o8nVar, int i, int i2) {
        super(vu30Var, o8nVar, i, i2);
        this.e = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.bge, p.age
    public final Object g(ssw0 ssw0Var, lnm lnmVar) {
        dzc dzcVar;
        if (lnmVar instanceof dzc) {
            dzcVar = (dzc) lnmVar;
            int i = dzcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dzcVar.d = i - Integer.MIN_VALUE;
            } else {
                dzcVar = new dzc(this, (onm) lnmVar);
            }
        } else {
            dzcVar = new dzc(this, (onm) lnmVar);
        }
        Object obj = dzcVar.b;
        int i2 = dzcVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            dzcVar.a = ssw0Var;
            dzcVar.d = 1;
            Object objG = super.g(ssw0Var, dzcVar);
            Object obj2 = d9n.a;
            if (objG == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ssw0Var = dzcVar.a;
            hm5.M(obj);
        }
        if (ssw0Var.K()) {
            return rih1.a;
        }
        eg.m("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // p.bge, p.age
    public final age h(o8n o8nVar, int i, int i2) {
        return new ezc(this.e, o8nVar, i, i2);
    }
}
