package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n6l1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k42 b;
    public final /* synthetic */ qau c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6l1(k42 k42Var, qau qauVar, tob1 tob1Var, tob1 tob1Var2, byte b) {
        super(2);
        this.a = b;
        this.b = k42Var;
        this.c = qauVar;
        this.d = tob1Var;
        this.e = tob1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    k42 k42Var = this.b;
                    sok.n((cce) k42Var.a, (dbp) k42Var.b, (hcl1) k42Var.j, (m0t) k42Var.l, (q9l1) k42Var.c, (q9l1) k42Var.d, (fbp) k42Var.e, (bcl1) k42Var.i, (fq10) k42Var.m, (n8l1) k42Var.n, (abu) k42Var.f, (hcl1) k42Var.k, this.c, (Consumer) this.d.getValue(), ((Boolean) this.e.getValue()).booleanValue(), (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = ef.a;
                    k42 k42Var2 = this.b;
                    mod.c(new ely0[]{kivVar.a((pe) k42Var2.g), oi7.a.a((gw70) k42Var2.h)}, apo.r(1533054273, new n6l1(k42Var2, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }
}
