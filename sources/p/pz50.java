package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pz50 {
    public final o95 a = c97.b(0.0f);
    public final o95 b = c97.b(0.0f);
    public final o95 c = c97.b(0.0f);
    public final pxg1 d = irn1.o0(500, 0, new ceo(0.0f, 0.0f, 0.2f, 1.0f), 2);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(c9n c9nVar, onm onmVar) {
        mz50 mz50Var;
        if (onmVar instanceof mz50) {
            mz50Var = (mz50) onmVar;
            int i = mz50Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mz50Var.d = i - Integer.MIN_VALUE;
            } else {
                mz50Var = new mz50(this, onmVar);
            }
        } else {
            mz50Var = new mz50(this, onmVar);
        }
        Object obj = mz50Var.b;
        int i2 = mz50Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            Float f = new Float(1.0f);
            mz50Var.a = c9nVar;
            mz50Var.d = 1;
            Object objG = this.c.g(f, mz50Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar = mz50Var.a;
            hm5.M(obj);
        }
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 0), 3);
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 1), 3);
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 2), 3);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c9n c9nVar, onm onmVar) {
        oz50 oz50Var;
        if (onmVar instanceof oz50) {
            oz50Var = (oz50) onmVar;
            int i = oz50Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oz50Var.d = i - Integer.MIN_VALUE;
            } else {
                oz50Var = new oz50(this, onmVar);
            }
        } else {
            oz50Var = new oz50(this, onmVar);
        }
        Object obj = oz50Var.b;
        int i2 = oz50Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            Float f = new Float(1.0f);
            oz50Var.a = c9nVar;
            oz50Var.d = 1;
            Object objG = this.b.g(f, oz50Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9nVar = oz50Var.a;
            hm5.M(obj);
        }
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 3), 3);
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 4), 3);
        fn31.T(c9nVar, (o8n) null, 0, new nz50(this, null, (byte) 5), 3);
        return rih1.a;
    }
}
