package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class j9e0 extends xbk1 {
    public static final gzs d = new gzs((byte) 1);
    public final ina1 b = new ina1(0);
    public boolean c = false;

    @Override // p.xbk1
    public final void S() {
        ina1 ina1Var = this.b;
        int iG = ina1Var.g();
        for (int i = 0; i < iG; i++) {
            ((h9e0) ina1Var.h(i)).n();
        }
        int i2 = ina1Var.d;
        Object[] objArr = ina1Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        ina1Var.d = 0;
        ina1Var.a = false;
    }
}
