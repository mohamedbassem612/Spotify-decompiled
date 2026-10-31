package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b8o0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8o0(c8o0 c8o0Var, byte b) {
        super(0);
        this.a = b;
        this.b = c8o0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gqj0 gqj0Var = gqj0.a;
        c8o0 c8o0Var = this.b;
        switch (b) {
            case 0:
                return c8o0Var.c.e("network.bytes_received_cellular", gqj0Var);
            case 1:
                return c8o0Var.c.e("network.bytes_received_wifi", gqj0Var);
            case 2:
                return c8o0Var.c.e("network.bytes_sent_cellular", gqj0Var);
            case 3:
                return c8o0Var.c.e("network.bytes_sent_wifi", gqj0Var);
            case 4:
                return c8o0Var.c.e("http.request_error_count", new hqj0("error"));
            default:
                return c8o0Var.c.q("http.total_request_latency", jqj0.a);
        }
    }
}
