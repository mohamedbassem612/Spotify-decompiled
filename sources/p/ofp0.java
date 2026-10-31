package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ofp0 {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public nfp0 e;
    public float f;

    public static synchronized ofp0 a(int i, nfp0 nfp0Var) {
        ofp0 ofp0Var;
        ofp0Var = new ofp0();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        ofp0Var.b = i;
        ofp0Var.c = new Object[i];
        ofp0Var.d = 0;
        ofp0Var.e = nfp0Var;
        ofp0Var.f = 1.0f;
        ofp0Var.d();
        int i2 = g;
        ofp0Var.a = i2;
        g = i2 + 1;
        return ofp0Var;
    }

    public final synchronized nfp0 b() {
        nfp0 nfp0Var;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            nfp0Var = (nfp0) objArr[i];
            nfp0Var.a = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return nfp0Var;
    }

    public final synchronized void c(nfp0 nfp0Var) {
        try {
            int i = nfp0Var.a;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + nfp0Var.a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            Object[] objArr = this.c;
            if (i2 >= objArr.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            nfp0Var.a = this.a;
            objArr[this.d] = nfp0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
