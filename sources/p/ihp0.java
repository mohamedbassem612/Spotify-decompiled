package p;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface ihp0 {
    static /* synthetic */ nif1 l(ihp0 ihp0Var, String str, Object obj, int i) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return ihp0Var.k(str, obj, null);
    }

    mr20 a();

    void b(kj41 kj41Var, String str);

    void c(nif1 nif1Var, String str);

    nan e(String str, kqj0 kqj0Var);

    kj41 f(String str, UUID uuid);

    boolean g(oif1 oif1Var);

    kj41 h(String str);

    void i(ByteBuffer byteBuffer, long j);

    tga j(List list, iu30 iu30Var);

    nif1 k(String str, Object obj, Long l);

    nif1 m(String str);

    void n(yob1 yob1Var);

    boolean o(String str);

    x940 q(String str, kqj0 kqj0Var);

    egp0 r(String str, kqj0 kqj0Var, Function0 function0);

    void t(String str, String str2, Map map);

    kj41 u(String str);

    void unregisterObservableMetric(String str);

    void v(long j, long j2);

    wma1 w(String str, oif1 oif1Var, Long l);

    default void s() {
    }
}
