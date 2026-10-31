package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class bge extends age {
    public final vu30 d;

    public bge(vu30 vu30Var, o8n o8nVar, int i, int i2) {
        super(o8nVar, i, i2);
        this.d = vu30Var;
    }

    @Override // p.age
    public Object g(ssw0 ssw0Var, lnm lnmVar) {
        Object objInvoke = this.d.invoke(ssw0Var, lnmVar);
        return objInvoke == d9n.a ? objInvoke : rih1.a;
    }

    @Override // p.age
    public age h(o8n o8nVar, int i, int i2) {
        return new bge(this.d, o8nVar, i, i2);
    }

    @Override // p.age
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
