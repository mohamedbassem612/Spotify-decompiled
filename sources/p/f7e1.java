package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f7e1 implements vu30 {
    public final /* synthetic */ o811 a;
    public final /* synthetic */ r7e1 b;
    public final /* synthetic */ qr50 c;
    public final /* synthetic */ o811 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ f7e1(qr50 qr50Var, o811 o811Var, o811 o811Var2, r7e1 r7e1Var, boolean z) {
        this.a = o811Var;
        this.b = r7e1Var;
        this.c = qr50Var;
        this.d = o811Var2;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iG;
        int iG2;
        o811 o811Var = this.a;
        o811Var.a = Offset.g(o811Var.a, ((Offset) obj2).a);
        r7e1 r7e1Var = this.b;
        aae1 aae1Var = r7e1Var.b;
        ggg1 ggg1Var = r7e1Var.a;
        y9e1 y9e1VarC = aae1Var.c();
        rih1 rih1Var = rih1.a;
        if (y9e1VarC != null) {
            zrm0 zrm0Var = y9e1VarC.b;
            r7e1Var.A(this.c, Offset.g(this.d.a, o811Var.a));
            boolean z = this.e;
            if (z) {
                iG = zrm0Var.g(r7e1Var.n());
            } else {
                long j = ggg1Var.h().e;
                int i = nbe1.c;
                iG = (int) (j >> 32);
            }
            int i2 = iG;
            if (z) {
                long j2 = ggg1Var.h().e;
                int i3 = nbe1.c;
                iG2 = (int) (j2 & 4294967295L);
            } else {
                iG2 = zrm0Var.g(r7e1Var.n());
            }
            int i4 = iG2;
            long j3 = ggg1Var.h().e;
            long jB = r7e1Var.B(ggg1Var.h(), i2, i4, z, w1x0.O0, false, false, new vs50(9));
            if (nbe1.d(j3) || !nbe1.d(jB)) {
                ggg1Var.o(jB);
                return rih1Var;
            }
        }
        return rih1Var;
    }
}
