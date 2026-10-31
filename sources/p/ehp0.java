package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ehp0 {
    public static final nqj0 a;
    public static final nqj0 b;
    public static final nqj0 c;
    public static final nqj0 d;
    public static final nqj0 e;
    public static final nqj0 f;
    public static final nqj0 g;
    public static final nqj0 h;
    public static final nqj0 i;
    public static final nqj0 j;
    public static final nqj0 k;

    static {
        yoj0.a.getClass();
        xoj0 xoj0Var = woj0.b;
        tqj0 tqj0Var = tqj0.a;
        a = new nqj0("network.bytes_received_wifi", xoj0Var, tqj0Var);
        b = new nqj0("network.bytes_sent_wifi", xoj0Var, tqj0Var);
        c = new nqj0("network.bytes_received_cellular", xoj0Var, tqj0Var);
        d = new nqj0("network.bytes_sent_cellular", xoj0Var, tqj0Var);
        xoj0 xoj0Var2 = woj0.d;
        e = new nqj0("device.gc.count", xoj0Var2, tqj0Var);
        f = new nqj0("device.gc.time", xoj0Var2, tqj0Var);
        g = new nqj0("device.gc.count_blocking", xoj0Var2, tqj0Var);
        h = new nqj0("device.gc.time_blocking", xoj0Var2, tqj0Var);
        i = new nqj0("device.gc.count_pre_oom_error", xoj0Var2, tqj0Var);
        j = new nqj0("device.gc.time_threads_blocked", xoj0Var2, tqj0Var);
        k = new nqj0("device.memory.bytes_allocated", xoj0Var2, tqj0Var);
    }
}
