package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class szq {
    public static final ThreadLocal a = new ThreadLocal();

    public static d0r a() {
        d0r d0rVar = (d0r) a.get();
        if (d0rVar != null) {
            return d0rVar;
        }
        eg.m("DataPool accessed outside of data loading scope. Elements must be created within DataLoadingScope.withDataPool { } or attachDataElement { }.");
        return null;
    }

    public static Object b(d0r d0rVar, Function0 function0) {
        ThreadLocal threadLocal = a;
        d0r d0rVar2 = (d0r) threadLocal.get();
        threadLocal.set(d0rVar);
        try {
            Object objInvoke = function0.invoke();
        } finally {
            if (d0rVar2 != null) {
                threadLocal.set(d0rVar2);
            } else {
                threadLocal.remove();
            }
        }
    }
}
