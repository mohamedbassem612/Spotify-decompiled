package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w441 implements znb0, Serializable {
    public static final /* synthetic */ long c = avg.a.objectFieldOffset(w441.class.getDeclaredField("b"));
    public volatile Function0 a;
    public volatile Object b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new bd80(getValue());
    }

    @Override // p.znb0
    public final Object getValue() {
        w441 w441Var;
        Object obj = this.b;
        kuw0 kuw0Var = kuw0.i;
        if (obj != kuw0Var) {
            return obj;
        }
        Function0 function0 = this.a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            while (true) {
                w441Var = this;
                if (avg.a.compareAndSwapObject(w441Var, c, kuw0Var, objInvoke)) {
                    w441Var.a = null;
                    return objInvoke;
                }
                if (avg.a.getObjectVolatile(w441Var, c) == kuw0Var) {
                    this = w441Var;
                }
            }
        } else {
            w441Var = this;
        }
        return w441Var.b;
    }

    @Override // p.znb0
    public final boolean isInitialized() {
        return this.b != kuw0.i;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
