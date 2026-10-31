package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class gge extends age {
    public final mr20 d;

    public gge(int i, int i2, o8n o8nVar, mr20 mr20Var) {
        super(o8nVar, i, i2);
        this.d = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b A[RETURN] */
    @Override // p.age, p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objCollect;
        int i = this.b;
        d9n d9nVar = d9n.a;
        if (i == -3) {
            o8n context = lnmVar.getContext();
            o8n o8nVarN = ulo1.n(context, this.a);
            if (u890.j(o8nVarN, context)) {
                Object objK = k(vr20Var, lnmVar);
                if (objK == d9nVar) {
                    return objK;
                }
            } else {
                wdu0 wdu0Var = wdu0.Y;
                if (u890.j(o8nVarN.A(wdu0Var), context.A(wdu0Var))) {
                    Object objY = blo1.y(o8nVarN, blo1.k(vr20Var, lnmVar.getContext()), new hsc(this, (lnm) null, (byte) 8), lnmVar);
                    if (objY == d9nVar) {
                        return objY;
                    }
                } else {
                    objCollect = super.collect(vr20Var, lnmVar);
                    if (objCollect == d9nVar) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(vr20Var, lnmVar);
            if (objCollect == d9nVar) {
                return objCollect;
            }
        }
        return rih1.a;
    }

    @Override // p.age
    public final Object g(ssw0 ssw0Var, lnm lnmVar) {
        Object objK = k(new d561(ssw0Var), lnmVar);
        return objK == d9n.a ? objK : rih1.a;
    }

    public Object k(vr20 vr20Var, lnm lnmVar) {
        Object objCollect = this.d.collect(vr20Var, lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    @Override // p.age
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
