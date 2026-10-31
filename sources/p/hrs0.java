package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hrs0 extends h7 {
    public final drs0 c;
    public int d;
    public hug1 e;
    public int f;

    public hrs0(drs0 drs0Var, int i) {
        super(i, drs0Var.h);
        this.c = drs0Var;
        this.d = drs0Var.f();
        this.f = -1;
        c();
    }

    public final void a() {
        if (this.d == this.c.f()) {
            return;
        }
        eg.d();
    }

    public final void add(Object obj) {
        a();
        this.c.add(((h7) this).a, obj);
        ((h7) this).a++;
        b();
    }

    public final void b() {
        drs0 drs0Var = this.c;
        ((h7) this).b = drs0Var.b();
        this.d = drs0Var.f();
        this.f = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        drs0 drs0Var = this.c;
        Object[] objArr = drs0Var.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (drs0Var.h - 1) & (-32);
        int i2 = ((h7) this).a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (drs0Var.d / 5) + 1;
        hug1 hug1Var = this.e;
        if (hug1Var == null) {
            this.e = new hug1(objArr, i2, i, i3);
            return;
        }
        ((h7) hug1Var).a = i2;
        ((h7) hug1Var).b = i;
        hug1Var.c = i3;
        Object[] objArr2 = hug1Var.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            hug1Var.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        hug1Var.e = r0;
        hug1Var.b(i2 - r0, 1);
    }

    public final Object next() {
        a();
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        int i = ((h7) this).a;
        this.f = i;
        hug1 hug1Var = this.e;
        drs0 drs0Var = this.c;
        if (hug1Var == null) {
            Object[] objArr = drs0Var.g;
            ((h7) this).a = i + 1;
            return objArr[i];
        }
        if (hug1Var.hasNext()) {
            ((h7) this).a++;
            return hug1Var.next();
        }
        Object[] objArr2 = drs0Var.g;
        int i2 = ((h7) this).a;
        ((h7) this).a = i2 + 1;
        return objArr2[i2 - ((h7) hug1Var).b];
    }

    public final Object previous() {
        a();
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        int i = ((h7) this).a;
        this.f = i - 1;
        hug1 hug1Var = this.e;
        drs0 drs0Var = this.c;
        if (hug1Var == null) {
            Object[] objArr = drs0Var.g;
            int i2 = i - 1;
            ((h7) this).a = i2;
            return objArr[i2];
        }
        int i3 = ((h7) hug1Var).b;
        if (i <= i3) {
            ((h7) this).a = i - 1;
            return hug1Var.previous();
        }
        Object[] objArr2 = drs0Var.g;
        int i4 = i - 1;
        ((h7) this).a = i4;
        return objArr2[i4 - i3];
    }

    public final void remove() {
        a();
        int i = this.f;
        if (i == -1) {
            bhn0.w();
            return;
        }
        this.c.c(i);
        int i2 = this.f;
        if (i2 < ((h7) this).a) {
            ((h7) this).a = i2;
        }
        b();
    }

    public final void set(Object obj) {
        a();
        int i = this.f;
        if (i == -1) {
            bhn0.w();
            return;
        }
        drs0 drs0Var = this.c;
        drs0Var.set(i, obj);
        this.d = drs0Var.f();
        c();
    }
}
