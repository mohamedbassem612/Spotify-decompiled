package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class r6 implements m8n {
    public final n8n a;

    public r6(n8n n8nVar) {
        this.a = n8nVar;
    }

    @Override // p.o8n
    public /* bridge */ m8n A(n8n n8nVar) {
        return ilo1.u(this, n8nVar);
    }

    @Override // p.o8n
    public /* bridge */ o8n C(n8n n8nVar) {
        return ilo1.z(this, n8nVar);
    }

    @Override // p.m8n
    public final n8n getKey() {
        return this.a;
    }

    @Override // p.o8n
    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return ilo1.t(this, obj, vu30Var);
    }

    @Override // p.o8n
    public final /* bridge */ o8n y(o8n o8nVar) {
        return ilo1.B(this, o8nVar);
    }
}
