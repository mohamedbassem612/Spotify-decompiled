package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o3p1 extends r3p1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ r3p1 e;

    public o3p1(r3p1 r3p1Var, int i, int i2) {
        this.e = r3p1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // p.j3p1
    public final Object[] c() {
        return this.e.c();
    }

    @Override // p.j3p1
    public final int d() {
        return this.e.d() + this.c;
    }

    @Override // p.j3p1
    public final int e() {
        return this.e.d() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ulo1.w(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // p.r3p1, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final r3p1 subList(int i, int i2) {
        ulo1.y(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
