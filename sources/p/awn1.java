package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class awn1 extends ewn1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ewn1 e;

    public awn1(ewn1 ewn1Var, int i, int i2) {
        this.e = ewn1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // p.lvn1
    public final int c() {
        return this.e.d() + this.c + this.d;
    }

    @Override // p.lvn1
    public final int d() {
        return this.e.d() + this.c;
    }

    @Override // p.lvn1
    public final Object[] e() {
        return this.e.e();
    }

    @Override // p.ewn1, java.util.List
    /* JADX INFO: renamed from: f */
    public final ewn1 subList(int i, int i2) {
        y3o1.m0(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        y3o1.l0(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
