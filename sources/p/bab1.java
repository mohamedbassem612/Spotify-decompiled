package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bab1 implements rdo0 {
    public final bw91 a;
    public final mdt b;
    public p9m c;
    public final aab1 d;

    public bab1(List list) {
        bw91 bw91Var = new bw91();
        bw91Var.addAll(list);
        this.a = bw91Var;
        this.b = yv91.a(new fue0(this, (byte) 3));
        this.c = smg1.a;
        this.d = new aab1(this);
    }

    public final boolean a() {
        return this.a.size() > 1;
    }

    @Override // p.rdo0
    public final void dispose() {
    }
}
