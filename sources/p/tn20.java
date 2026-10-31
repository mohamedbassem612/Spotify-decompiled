package p;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tn20 implements wua {
    public final xn20 a;
    public final int b;
    public final n4t c = new n4t();

    public tn20(xn20 xn20Var, int i) {
        this.a = xn20Var;
        this.b = i;
    }

    public final long a(fc10 fc10Var) {
        n4t n4tVar;
        xn20 xn20Var;
        int iQ;
        while (true) {
            long j = fc10Var.j();
            long length = fc10Var.getLength() - 6;
            n4tVar = this.c;
            xn20Var = this.a;
            if (j >= length) {
                break;
            }
            long j2 = fc10Var.j();
            izr0 izr0Var = new izr0(17);
            int i = 0;
            boolean zI = false;
            fc10Var.h(0, izr0Var.a, 2);
            char cK = izr0Var.k(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (cK != i2) {
                fc10Var.f();
                fc10Var.k((int) (j2 - fc10Var.getPosition()));
            } else {
                byte[] bArr = izr0Var.a;
                while (i < 15 && (iQ = fc10Var.q(2 + i, bArr, 15 - i)) != -1) {
                    i += iQ;
                }
                izr0Var.Q(i + 2);
                fc10Var.f();
                fc10Var.k((int) (j2 - fc10Var.getPosition()));
                zI = r2p1.i(izr0Var, xn20Var, i2, n4tVar);
            }
            if (zI) {
                break;
            }
            fc10Var.k(1);
        }
        if (fc10Var.j() < fc10Var.getLength() - 6) {
            return n4tVar.b;
        }
        fc10Var.k((int) (fc10Var.getLength() - fc10Var.j()));
        return xn20Var.j;
    }

    public final vua c(fc10 fc10Var, long j) {
        long position = fc10Var.getPosition();
        long jA = a(fc10Var);
        long j2 = fc10Var.j();
        fc10Var.k(Math.max(6, this.a.c));
        long jA2 = a(fc10Var);
        long j3 = fc10Var.j();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new vua(-2, jA2, j3) : new vua(-1, jA, position);
        }
        return new vua(0, -9223372036854775807L, j2);
    }
}
