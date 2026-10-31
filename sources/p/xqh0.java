package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xqh0 implements skh0, o8u0 {
    public final d1i0 a;
    public final kph0 b;
    public final /* synthetic */ yqh0 c;

    public xqh0(yqh0 yqh0Var, d1i0 d1i0Var, kph0 kph0Var) {
        this.c = yqh0Var;
        this.a = d1i0Var;
        this.b = kph0Var;
    }

    public final void a() {
        this.a.o(false);
    }

    public final void f() {
        this.a.o(false);
    }

    public final f280 g(pa61 pa61Var) {
        int i;
        if (pa61Var.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            wqh0 wqh0Var = (wqh0) this.c.f.get(this.b);
            if (wqh0Var != null) {
                wqh0Var.b = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return fc11.J(new ch61(i));
    }

    public final void onDisconnected() {
        boolean zContainsKey;
        d1i0 d1i0Var = this.a;
        kph0 kph0Var = this.b;
        synchronized (d1i0Var.b) {
            zContainsKey = d1i0Var.g.containsKey(kph0Var.b());
        }
        if (zContainsKey) {
            d1i0Var.q(kph0Var);
        }
        d1i0Var.o(false);
    }

    public final void w0(n8u0 n8u0Var) {
        if (n8u0Var.a.a(4, 5, 14, 0)) {
            this.a.o(false);
        }
    }
}
