package p;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mc11 implements Function0 {
    public static final ytw0 c = new ytw0((byte) 18);
    public final Function0 a;
    public volatile SoftReference b;

    public mc11(Object obj, Function0 function0) {
        if (function0 == null) {
            hhg1.n("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.b = null;
        this.a = function0;
        if (obj != null) {
            this.b = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = c;
        SoftReference softReference = this.b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.b = new SoftReference(obj2);
        return objInvoke;
    }
}
