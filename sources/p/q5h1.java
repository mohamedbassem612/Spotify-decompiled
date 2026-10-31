package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q5h1 extends jnw0 {
    public static final q5h1 c = new q5h1(r5h1.a);

    public final int d(Object obj) {
        return ((o5h1) obj).a.length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        p5h1 p5h1Var = (p5h1) obj;
        short sC = x1kVar.t(((jnw0) this).b, i).C();
        p5h1Var.b(p5h1Var.d() + 1);
        short[] sArr = p5h1Var.a;
        int i2 = p5h1Var.b;
        p5h1Var.b = i2 + 1;
        sArr[i2] = sC;
    }

    public final Object g(Object obj) {
        short[] sArr = ((o5h1) obj).a;
        p5h1 p5h1Var = new p5h1();
        p5h1Var.a = sArr;
        p5h1Var.b = sArr.length;
        p5h1Var.b(10);
        return p5h1Var;
    }

    public final Object j() {
        return new o5h1(new short[0]);
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        short[] sArr = ((o5h1) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.L(((jnw0) this).b, i2).O(sArr[i2]);
        }
    }
}
