package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mwq0 implements rdo0 {
    public final svq0 a;
    public final bw91 b;
    public final mdt c;
    public p9m d;
    public final lwq0 e;

    public mwq0(svq0 svq0Var, List list) {
        this.a = svq0Var;
        bw91 bw91Var = new bw91();
        bw91Var.addAll(list);
        this.b = bw91Var;
        this.c = yv91.a(new ka2(this, (byte) 3));
        this.d = smg1.a;
        this.e = new lwq0(this);
    }

    public final boolean a() {
        return !this.b.isEmpty();
    }

    @Override // p.rdo0
    public final void dispose() {
    }
}
