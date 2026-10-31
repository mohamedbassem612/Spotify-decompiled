package p;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f7 extends g7 implements RandomAccess {
    public final /* synthetic */ byte a = 1;
    public int b;
    public int c;
    public final List d;

    public f7(g7 g7Var, int i, int i2) {
        this.d = g7Var;
        this.b = i;
        eqr0.p(i, i2, g7Var.b());
        this.c = i2 - i;
    }

    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public void c(int i, int i2) {
        eqr0.p(i, i2, this.d.size());
        this.b = i;
        this.c = i2 - i;
    }

    public final Object get(int i) {
        byte b = this.a;
        g7 g7Var = this.d;
        switch (b) {
            case 0:
                int i2 = this.c;
                if (i >= 0 && i < i2) {
                    return g7Var.get(this.b + i);
                }
                eg.g(cy30.i(i, "index: ", i2, ", size: "));
                return null;
            default:
                int i3 = this.c;
                if (i >= 0 && i < i3) {
                    return g7Var.get(this.b + i);
                }
                eg.g(cy30.i(i, "index: ", i3, ", size: "));
                return null;
        }
    }

    public List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                eqr0.p(i, i2, this.c);
                g7 g7Var = this.d;
                int i3 = this.b;
                return new f7(g7Var, i + i3, i3 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public f7(List list) {
        this.d = list;
    }
}
