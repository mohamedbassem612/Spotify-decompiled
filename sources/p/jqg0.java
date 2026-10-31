package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqg0 implements u601 {
    public final u601 a;
    public final iu30 b;

    public jqg0(u601 u601Var, iu30 iu30Var) {
        this.a = u601Var;
        this.b = iu30Var;
    }

    @Override // p.u601
    public final mr20 a() {
        return new iib(this.a.a(), this, (byte) 8);
    }

    @Override // p.u601
    public final Object b(vu30 vu30Var, lnm lnmVar) {
        Object objB = this.a.b(new v4e0(vu30Var, this, (lnm) null, (byte) 15), lnmVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    @Override // p.u601
    public final Object getValue() {
        return this.b.invoke(this.a.getValue());
    }
}
