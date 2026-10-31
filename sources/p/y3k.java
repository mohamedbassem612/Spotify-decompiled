package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y3k implements llq0, m8n {
    public static final c9c b = new c9c((byte) 2);
    public final x340 a;

    public y3k(x340 x340Var) {
        this.a = x340Var;
    }

    public final /* bridge */ m8n A(n8n n8nVar) {
        return ilo1.u(this, n8nVar);
    }

    public final /* bridge */ o8n C(n8n n8nVar) {
        return ilo1.z(this, n8nVar);
    }

    @Override // p.llq0
    public final List b(Integer num) {
        return this.a.M();
    }

    @Override // p.llq0
    public final boolean c() {
        return this.a.C;
    }

    public final n8n getKey() {
        return b;
    }

    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return ilo1.t(this, obj, vu30Var);
    }

    public final /* bridge */ o8n y(o8n o8nVar) {
        return ilo1.B(this, o8nVar);
    }
}
