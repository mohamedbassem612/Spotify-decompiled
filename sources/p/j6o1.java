package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j6o1 extends n6o1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ n6o1 e;

    public j6o1(n6o1 n6o1Var, int i, int i2) {
        this.e = n6o1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // p.y5o1
    public final Object[] b() {
        return this.e.b();
    }

    @Override // p.y5o1
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // p.y5o1
    public final int d() {
        return this.e.c() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ila0.M(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // p.n6o1, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n6o1 subList(int i, int i2) {
        ila0.N(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
