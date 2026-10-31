package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9c implements r731, is80 {
    public final n731 a;
    public final idd1 b = new idd1(new ptb(this, 4));

    public b9c(a731 a731Var, bn70 bn70Var) {
        this.a = new n731(a731Var.a(bn70Var.a), "Browse Resume Point State Machine");
    }

    @Override // p.r731
    public final p731 a() {
        return (p731) this.b.getValue();
    }

    @Override // p.is80
    public final r4u d(List list) {
        return r4u.d(new z8c(list, (byte) 0), r4u.a(new i3b(this, (byte) 3)));
    }

    @Override // p.is80
    public final void dispose() {
        this.a.b();
    }

    @Override // p.is80
    public final void start() {
        this.a.e();
    }
}
