package p;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hhp0 implements ihp0 {
    public static SharedPreferences b;
    public static final hhp0 a = new hhp0();
    public static final idd1 c = new idd1(wso0.O0);
    public static final idd1 d = new idd1(w0n0.i);

    public static ihp0 x() {
        return y() ? (ihp0) c.getValue() : (ihp0) d.getValue();
    }

    public static boolean y() {
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("ObservabilityPlatformEnabledFromRCProperty", false);
        }
        return false;
    }

    @Override // p.ihp0
    public final mr20 a() {
        return x().a();
    }

    @Override // p.ihp0
    public final void b(kj41 kj41Var, String str) {
        x().b(kj41Var, str);
    }

    @Override // p.ihp0
    public final void c(nif1 nif1Var, String str) {
        x().c(nif1Var, str);
    }

    @Override // p.ihp0
    public final nan e(String str, kqj0 kqj0Var) {
        return x().e(str, kqj0Var);
    }

    @Override // p.ihp0
    public final kj41 f(String str, UUID uuid) {
        return x().f(str, uuid);
    }

    @Override // p.ihp0
    public final boolean g(oif1 oif1Var) {
        return x().g(oif1Var);
    }

    @Override // p.ihp0
    public final kj41 h(String str) {
        return x().h(str);
    }

    @Override // p.ihp0
    public final void i(ByteBuffer byteBuffer, long j) {
        x().i(byteBuffer, j);
    }

    @Override // p.ihp0
    public final tga j(List list, iu30 iu30Var) {
        return x().j(list, iu30Var);
    }

    @Override // p.ihp0
    public final nif1 k(String str, Object obj, Long l) {
        return x().k(str, obj, l);
    }

    @Override // p.ihp0
    public final nif1 m(String str) {
        return x().m(str);
    }

    @Override // p.ihp0
    public final void n(yob1 yob1Var) {
        x().n(yob1Var);
    }

    @Override // p.ihp0
    public final boolean o(String str) {
        return x().o(str);
    }

    @Override // p.ihp0
    public final x940 q(String str, kqj0 kqj0Var) {
        return x().q(str, kqj0Var);
    }

    @Override // p.ihp0
    public final egp0 r(String str, kqj0 kqj0Var, Function0 function0) {
        return x().r(str, kqj0Var, function0);
    }

    @Override // p.ihp0
    public final void s() {
        x().s();
    }

    @Override // p.ihp0
    public final void t(String str, String str2, Map map) {
        x().t(str, str2, map);
    }

    @Override // p.ihp0
    public final kj41 u(String str) {
        return x().u(str);
    }

    @Override // p.ihp0
    public final void unregisterObservableMetric(String str) {
        x().unregisterObservableMetric(str);
    }

    @Override // p.ihp0
    public final void v(long j, long j2) {
        x().v(j, j2);
    }

    @Override // p.ihp0
    public final wma1 w(String str, oif1 oif1Var, Long l) {
        return x().w(str, oif1Var, l);
    }
}
