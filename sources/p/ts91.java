package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ts91 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ xr91 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ts91(long j, xr91 xr91Var, String str) {
        this.a = j;
        this.b = xr91Var;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = tec.a;
            long j = u7h.j;
            kiv kivVar = cbh.a;
            long jA = ((bbh) x340Var2.k(kivVar)).a();
            long j2 = ((u7h) x340Var2.k(xrl.a)).a;
            if (((bbh) x340Var2.k(kivVar)).d()) {
                z4p1.B(j2);
            } else {
                z4p1.B(j2);
            }
            jkr jkrVar = new jkr(j, this.a, j, u7h.b(jA, 0.38f, 0.0f, 0.0f, 0.0f, 14));
            xr91 xr91Var = this.b;
            boolean zI = x340Var2.i(xr91Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new tr91(xr91Var, (byte) 1);
                x340Var2.s0(objT);
            }
            obg1.a((Function0) objT, nim0.a, (t6p1) null, ((ox61) x340Var2.k(qx61.a)).a, jkrVar, tec.c, apo.r(-929149933, new pea(this.c, (byte) 6), x340Var2), x340Var2, 805306368);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
