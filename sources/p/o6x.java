package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o6x implements o8n, Serializable {
    public static final o6x a = new o6x();

    private final Object readResolve() {
        return a;
    }

    @Override // p.o8n
    public final m8n A(n8n n8nVar) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p.o8n
    public final o8n y(o8n o8nVar) {
        return o8nVar;
    }

    @Override // p.o8n
    public final o8n C(n8n n8nVar) {
        return this;
    }

    @Override // p.o8n
    public final Object o(Object obj, vu30 vu30Var) {
        return obj;
    }
}
