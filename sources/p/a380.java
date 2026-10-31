package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a380 extends g7 implements d380 {
    public final d380 a;
    public final int b;
    public final int c;

    public a380(d380 d380Var, int i, int i2) {
        this.a = d380Var;
        this.b = i;
        yxo1.t(i, i2, d380Var.size());
        this.c = i2 - i;
    }

    public final int b() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yxo1.r(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        yxo1.t(i, i2, this.c);
        int i3 = this.b;
        return new a380(this.a, i + i3, i3 + i2);
    }
}
