package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a3t implements o8n {
    public final o8n a;

    public a3t(o8n o8nVar) {
        this.a = o8nVar;
    }

    public final m8n A(n8n n8nVar) {
        return this.a.A(n8nVar);
    }

    public final o8n C(n8n n8nVar) {
        o8n o8nVarC = this.a.C(n8nVar);
        int i = xpi1.b;
        p8n p8nVar = q8n.b;
        q8n q8nVarA = A(p8nVar);
        q8n q8nVar = (q8n) o8nVarC.A(p8nVar);
        if ((q8nVarA instanceof b3t) && q8nVarA != q8nVar) {
            ((b3t) q8nVarA).d = 0;
        }
        return new a3t(o8nVarC);
    }

    public final boolean equals(Object obj) {
        return u890.j(this.a, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object o(Object obj, vu30 vu30Var) {
        return this.a.o(obj, vu30Var);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }

    public final o8n y(o8n o8nVar) {
        o8n o8nVarY = this.a.y(o8nVar);
        int i = xpi1.b;
        p8n p8nVar = q8n.b;
        q8n q8nVarA = A(p8nVar);
        q8n q8nVar = (q8n) o8nVarY.A(p8nVar);
        if ((q8nVarA instanceof b3t) && q8nVarA != q8nVar) {
            ((b3t) q8nVarA).d = 0;
        }
        return new a3t(o8nVarY);
    }
}
