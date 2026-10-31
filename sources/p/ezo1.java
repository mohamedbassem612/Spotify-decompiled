package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ezo1 extends d1p1 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ d1p1 e;

    public ezo1(d1p1 d1p1Var, int i, int i2) {
        this.e = d1p1Var;
        this.c = i;
        this.d = i2;
    }

    public final int c() {
        return this.e.d() + this.c + this.d;
    }

    public final int d() {
        return this.e.d() + this.c;
    }

    public final Object[] e() {
        return this.e.e();
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d1p1 subList(int i, int i2) {
        gho1.w(i, i2, this.d);
        int i3 = this.c;
        return this.e.f(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        gho1.u(i, this.d);
        return this.e.get(i + this.c);
    }

    public final int size() {
        return this.d;
    }
}
