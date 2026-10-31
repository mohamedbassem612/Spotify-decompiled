package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zrn1 extends dsn1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ dsn1 e;

    public zrn1(dsn1 dsn1Var, int i, int i2) {
        this.e = dsn1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // p.srn1
    public final int c() {
        return this.e.d() + this.c + this.d;
    }

    @Override // p.srn1
    public final int d() {
        return this.e.d() + this.c;
    }

    @Override // p.srn1
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        r4o1.Y(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // p.srn1
    public final Object[] i() {
        return this.e.i();
    }

    @Override // p.dsn1, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final dsn1 subList(int i, int i2) {
        r4o1.a0(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
