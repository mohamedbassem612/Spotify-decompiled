package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihv0 {
    public final ohv0 a;

    public ihv0(ohv0 ohv0Var) {
        this.a = ohv0Var;
    }

    public final void a(int i, Map map) {
        this.a.a(new khv0((String) null, 1, sqg0.P(map, oqn1.n("store", kk0.y(i))), "age_signal_raw_store_response"));
    }

    public final void b(int i, int i2, int i3) {
        this.a.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{oqn1.n("store", kk0.y(i)), oqn1.n("outcome", h4b1.o(i2)), oqn1.n("attempt", String.valueOf(i3))}), "age_signal_fetch_result"));
    }

    public final void c(int i, int i2, String str) {
        this.a.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{oqn1.n("flow", str), oqn1.n("outcome", xcg1.n(i)), oqn1.n("source", kk0.y(i2))}), "age_signal_verification_result"));
    }
}
