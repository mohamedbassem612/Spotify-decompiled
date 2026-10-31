package p;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rhp0 {
    public static final rhp0 a = new rhp0();
    public static final List b;
    public static final List c;

    static {
        eqj0 eqj0Var = eqj0.a;
        nqj0 nqj0Var = new nqj0("network.bytes_received_wifi", new xoj0(eqj0Var, 300L), new sqj0(3600L));
        nqj0 nqj0Var2 = new nqj0("network.bytes_sent_wifi", new xoj0(eqj0Var, 300L), new sqj0(3600L));
        nqj0 nqj0Var3 = new nqj0("network.bytes_received_cellular", new xoj0(eqj0Var, 300L), new sqj0(3600L));
        nqj0 nqj0Var4 = new nqj0("network.bytes_sent_cellular", new xoj0(eqj0Var, 300L), new sqj0(3600L));
        nqj0 nqj0Var5 = new nqj0("http.total_request_latency", new xoj0(new cqj0(p7h.M(new Double[]{Double.valueOf(0.01d), Double.valueOf(0.025d), Double.valueOf(0.05d), Double.valueOf(0.1d), Double.valueOf(0.25d), Double.valueOf(0.5d), Double.valueOf(1.0d), Double.valueOf(2.5d), Double.valueOf(5.0d), Double.valueOf(10.0d)})), 300L), new sqj0(3600L));
        nqj0 nqj0Var6 = new nqj0("http.request_error_count", new xoj0(eqj0Var, 300L), new sqj0(3600L));
        yoj0.a.getClass();
        b = p7h.M(new nqj0[]{nqj0Var, nqj0Var2, nqj0Var3, nqj0Var4, nqj0Var5, nqj0Var6, new nqj0("device.cpu_time", woj0.b, new sqj0(60L)), new nqj0("device.battery_level", woj0.c, new sqj0(60L)), dkc1.b, dkc1.d, dkc1.f, dkc1.h});
        c = p7h.M(new nqj0[]{ehp0.a, ehp0.c, dkc1.a, dkc1.c, dkc1.e, dkc1.g});
    }

    public static double a(vgp0 vgp0Var) {
        SharedPreferences sharedPreferences = yiq0.c;
        if (sharedPreferences != null) {
            return ((double) sharedPreferences.getInt("OopsSamplingOverride:".concat(vgp0Var.a()), 0)) / 10000.0d;
        }
        return 0.0d;
    }
}
