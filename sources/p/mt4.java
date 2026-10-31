package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mt4 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public mt4(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
        this.d = new idd1(new rq4(this, (byte) 25));
    }

    public final int a() {
        mt4 mt4Var = (mt4) this.d.getValue();
        return mt4Var != null ? mt4Var.a() : this.a;
    }

    public final int b() {
        mt4 mt4Var = (mt4) this.d.getValue();
        return mt4Var != null ? mt4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("google_callback_timeout_ms", "android-ml-based-device-suggestions", a(), 1000, 30000), new fpb("where_to_play_timeout_ms", "android-ml-based-device-suggestions", b(), 1000, 60000)});
    }

    public mt4(luk lukVar) {
        this(3000, 10000, lukVar);
    }
}
