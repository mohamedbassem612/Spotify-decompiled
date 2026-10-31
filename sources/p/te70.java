package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class te70 implements j06 {
    public final int a;
    public int b;
    public final Object c;

    public te70(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public Object a() {
        return ((j06) this.c).a();
    }

    public void b(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((j06) this.c).b(i + i4, i2 + i4, i3);
    }

    public void c(int i, int i2) {
        ((j06) this.c).c(i + (this.b == 0 ? this.a : 0), i2);
    }

    public void clear() {
        g0k.a("Clear is not valid on OffsetApplier");
    }

    public void d(Object obj, vu30 vu30Var) {
        ((j06) this.c).d(obj, vu30Var);
    }

    public void e(int i, Object obj) {
        ((j06) this.c).e(i + (this.b == 0 ? this.a : 0), obj);
    }

    public void g(int i, Object obj) {
        ((j06) this.c).g(i + (this.b == 0 ? this.a : 0), obj);
    }

    public void h(Object obj) {
        this.b++;
        ((j06) this.c).h(obj);
    }

    public void i() {
        ((j06) this.c).i();
    }

    public void l() {
        if (this.b <= 0) {
            g0k.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((j06) this.c).l();
    }

    public te70() {
        this.c = new te70[256];
        this.a = 0;
        this.b = 0;
    }

    public te70(j06 j06Var, int i) {
        this.c = j06Var;
        this.a = i;
    }
}
