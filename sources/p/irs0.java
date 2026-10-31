package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class irs0 extends i7 {
    public final ers0 c;
    public int d;
    public iug1 e;
    public int f;

    public irs0(ers0 ers0Var, int i) {
        super(i, ers0Var.h);
        this.c = ers0Var;
        this.d = ers0Var.f();
        this.f = -1;
        d();
    }

    @Override // p.i7, java.util.ListIterator
    public final void add(Object obj) {
        c();
        int i = this.a;
        ers0 ers0Var = this.c;
        ers0Var.add(i, obj);
        this.a++;
        this.b = ers0Var.b();
        this.d = ers0Var.f();
        this.f = -1;
        d();
    }

    public final void c() {
        if (this.d == this.c.f()) {
            return;
        }
        eg.d();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void d() {
        ers0 ers0Var = this.c;
        Object[] objArr = ers0Var.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (ers0Var.h - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ers0Var.d / 5) + 1;
        iug1 iug1Var = this.e;
        if (iug1Var == null) {
            this.e = new iug1(objArr, i2, i, i3);
            return;
        }
        iug1Var.a = i2;
        iug1Var.b = i;
        iug1Var.c = i3;
        Object[] objArr2 = iug1Var.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            iug1Var.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        iug1Var.e = r0;
        iug1Var.d(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        int i = this.a;
        this.f = i;
        iug1 iug1Var = this.e;
        ers0 ers0Var = this.c;
        if (iug1Var == null) {
            Object[] objArr = ers0Var.g;
            this.a = i + 1;
            return objArr[i];
        }
        if (iug1Var.hasNext()) {
            this.a++;
            return iug1Var.next();
        }
        Object[] objArr2 = ers0Var.g;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - iug1Var.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        iug1 iug1Var = this.e;
        ers0 ers0Var = this.c;
        if (iug1Var == null) {
            Object[] objArr = ers0Var.g;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = iug1Var.b;
        if (i <= i3) {
            this.a = i - 1;
            return iug1Var.previous();
        }
        Object[] objArr2 = ers0Var.g;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // p.i7, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        int i = this.f;
        if (i == -1) {
            bhn0.w();
            return;
        }
        ers0 ers0Var = this.c;
        ers0Var.c(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = ers0Var.b();
        this.d = ers0Var.f();
        this.f = -1;
        d();
    }

    @Override // p.i7, java.util.ListIterator
    public final void set(Object obj) {
        c();
        int i = this.f;
        if (i == -1) {
            bhn0.w();
            return;
        }
        ers0 ers0Var = this.c;
        ers0Var.set(i, obj);
        this.d = ers0Var.f();
        d();
    }
}
