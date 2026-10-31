package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wn20 extends aec1 {
    public xn20 n;
    public z1c o;

    @Override // p.aec1
    public final boolean c(izr0 izr0Var, long j, r2a1 r2a1Var) {
        byte[] bArr = izr0Var.a;
        xn20 xn20Var = this.n;
        if (xn20Var == null) {
            xn20 xn20Var2 = new xn20(bArr, 17);
            this.n = xn20Var2;
            ge30 ge30VarA = xn20Var2.c(Arrays.copyOfRange(bArr, 9, izr0Var.c), null).a();
            ge30VarA.n = asj0.p("audio/ogg");
            r2a1Var.b = new ie30(ge30VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            z1c z1cVar = this.o;
            if (z1cVar != null) {
                z1cVar.a = j;
                r2a1Var.c = z1cVar;
            }
            ((ie30) r2a1Var.b).getClass();
            return false;
        }
        t7y t7yVarR = t2p1.r(izr0Var);
        xn20 xn20Var3 = new xn20(xn20Var.a, xn20Var.b, xn20Var.c, xn20Var.d, xn20Var.e, xn20Var.g, xn20Var.h, xn20Var.j, t7yVarR, xn20Var.l);
        this.n = xn20Var3;
        z1c z1cVar2 = new z1c();
        z1cVar2.c = xn20Var3;
        z1cVar2.d = t7yVarR;
        z1cVar2.a = -1L;
        z1cVar2.b = -1L;
        this.o = z1cVar2;
        return true;
    }

    @Override // p.aec1
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
