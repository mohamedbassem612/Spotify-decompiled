package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s3h1 extends jnw0 {
    public static final s3h1 c = new s3h1(t3h1.a);

    public final int d(Object obj) {
        return ((q3h1) obj).a.length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        r3h1 r3h1Var = (r3h1) obj;
        byte bC0 = x1kVar.t(((jnw0) this).b, i).c0();
        r3h1Var.b(r3h1Var.d() + 1);
        byte[] bArr = r3h1Var.a;
        int i2 = r3h1Var.b;
        r3h1Var.b = i2 + 1;
        bArr[i2] = bC0;
    }

    public final Object g(Object obj) {
        byte[] bArr = ((q3h1) obj).a;
        r3h1 r3h1Var = new r3h1();
        r3h1Var.a = bArr;
        r3h1Var.b = bArr.length;
        r3h1Var.b(10);
        return r3h1Var;
    }

    public final Object j() {
        return new q3h1(new byte[0]);
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        byte[] bArr = ((q3h1) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.L(((jnw0) this).b, i2).j(bArr[i2]);
        }
    }
}
