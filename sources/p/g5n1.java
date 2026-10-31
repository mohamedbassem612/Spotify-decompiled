package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g5n1 extends h5n1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ h5n1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5n1(h5n1 h5n1Var, int i, int i2) {
        super((byte) 0);
        this.t = h5n1Var;
        this.h = i;
        this.i = i2;
    }

    public final int c() {
        return this.t.d() + this.h + this.i;
    }

    public final int d() {
        return this.t.d() + this.h;
    }

    public final Object[] e() {
        return this.t.e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        ezn1.g(i, this.i);
        return this.t.get(i + this.h);
    }

    @Override // p.h5n1, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final h5n1 subList(int i, int i2) {
        ezn1.k(i, i2, this.i);
        int i3 = this.h;
        return this.t.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.i;
    }
}
