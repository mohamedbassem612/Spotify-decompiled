package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n0b1 {
    public final p0b1 a;
    public final String b;
    public final mr20 c;

    public n0b1(p0b1 p0b1Var, String str) {
        this.a = p0b1Var;
        this.b = str;
        this.c = rqt0.u(new g9i0(p0b1Var.a, str, (byte) 4));
    }

    public final void a(boolean z) {
        Object value;
        bpb1 bpb1Var = this.a.a;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, sqg0.P((Map) value, new mmr0(this.b, Boolean.valueOf(z)))));
    }
}
