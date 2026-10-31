package p;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class idd1 implements znb0, Serializable {
    public Function0 a;
    public volatile Object b = kuw0.i;
    public final Object c = this;

    public idd1(Function0 function0) {
        this.a = function0;
    }

    private final Object writeReplace() {
        return new bd80(getValue());
    }

    @Override // p.znb0
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        kuw0 kuw0Var = kuw0.i;
        if (obj != kuw0Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == kuw0Var) {
                Function0 function0 = this.a;
                function0.getClass();
                objInvoke = function0.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // p.znb0
    public final boolean isInitialized() {
        return this.b != kuw0.i;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
