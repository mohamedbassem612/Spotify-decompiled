package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class okh1 implements znb0, Serializable {
    public Function0 a;
    public Object b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new bd80(getValue());
    }

    @Override // p.znb0
    public final Object getValue() {
        Object obj = this.b;
        if (obj != kuw0.i) {
            return obj;
        }
        Function0 function0 = this.a;
        function0.getClass();
        Object objInvoke = function0.invoke();
        this.b = objInvoke;
        this.a = null;
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
