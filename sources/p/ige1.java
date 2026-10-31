package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ige1 implements yfe1 {
    public final Object a;
    public final ThreadLocal b;
    public final kge1 c;

    public ige1(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new kge1(threadLocal);
    }

    public final m8n A(n8n n8nVar) {
        if (this.c.equals(n8nVar)) {
            return this;
        }
        return null;
    }

    public final o8n C(n8n n8nVar) {
        return this.c.equals(n8nVar) ? o6x.a : this;
    }

    public final Object G() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    public final n8n getKey() {
        return this.c;
    }

    public final Object o(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }

    public final void u(Object obj) {
        this.b.set(obj);
    }

    public final o8n y(o8n o8nVar) {
        return flo1.l(this, o8nVar);
    }
}
