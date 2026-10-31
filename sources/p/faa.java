package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class faa implements lnm, e9n, Serializable {
    private final lnm<Object> completion;

    public faa(lnm lnmVar) {
        this.completion = lnmVar;
    }

    public lnm<rih1> create(lnm<?> lnmVar) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p.e9n
    public e9n getCallerFrame() {
        lnm<Object> lnmVar = this.completion;
        if (lnmVar instanceof e9n) {
            return (e9n) lnmVar;
        }
        return null;
    }

    public final lnm<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return f5p1.o(this);
    }

    public Object invokeSuspend(Object obj) {
        hm5.M(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p.lnm
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            faa faaVar = (faa) r2;
            lnm<Object> lnmVar = faaVar.completion;
            lnmVar.getClass();
            try {
                obj = faaVar.invokeSuspend(obj);
                if (obj == d9n.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new m231(th);
            }
            faaVar.releaseIntercepted();
            if (!(lnmVar instanceof faa)) {
                lnmVar.resumeWith(obj);
                return;
            }
            r2 = lnmVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
