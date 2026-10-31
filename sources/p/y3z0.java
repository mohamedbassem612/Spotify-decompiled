package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y3z0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ f6d1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3z0(ArrayList arrayList, iu30 iu30Var, int i, f6d1 f6d1Var, byte b) {
        super(3);
        this.a = b;
        this.b = arrayList;
        this.c = iu30Var;
        this.d = i;
        this.e = f6d1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                for (Object obj4 : this.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    nhf1 nhf1Var = (nhf1) obj4;
                    boolean z = nhf1Var.b;
                    x340 x340Var2 = x340Var;
                    iu30 iu30Var = this.c;
                    boolean zG = x340Var2.g(iu30Var);
                    int i3 = this.d;
                    boolean zE = zG | x340Var2.e(i3) | x340Var2.e(i);
                    Object objT = x340Var2.T();
                    if (zE || objT == fkj0.X) {
                        objT = new e90(iu30Var, i3, i, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    poo1.g(z, (iu30) objT, new nex(this.e.b), yoo1.z(x340Var2), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1005121892, new y6w0(nhf1Var, (byte) 23), x340Var2), x340Var2, 0, 196608, 32752);
                    i = i2;
                }
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                k5p1.d((qim0) null, new d36(8.0f, true, new um5(false)), new d36(8.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(712306052, new y3z0(this.b, this.c, this.d, this.e, (byte) 0), b0kVar), b0kVar, 1572864, 57);
                return rih1Var;
        }
    }
}
