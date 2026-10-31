package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dxj extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxj(int i, g891 g891Var, int i2, c891 c891Var) {
        super(3);
        this.b = i;
        this.d = g891Var;
        this.c = i2;
        this.e = c891Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj4 = this.d;
        int i2 = this.c;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((j2i) obj4).J((String) obj5, Integer.valueOf(i + i2), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                float f = ((c891) obj5).b;
                g891 g891Var = (g891) obj4;
                int iC = l1d.C(i);
                if (iC == 0) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-1890196568);
                    g891Var.g(i2, f, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var3, -1890197598, false);
                    }
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-1890194103);
                    g891Var.f(i2, f, x340Var5, 0);
                    x340Var5.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxj(j2i j2iVar, String str, int i, int i2) {
        super(3);
        this.d = j2iVar;
        this.e = str;
        this.b = i;
        this.c = i2;
    }
}
