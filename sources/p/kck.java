package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kck extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kck(ngs0 ngs0Var, float f, float f2, int i) {
        super(2);
        this.a = (byte) 1;
        this.e = ngs0Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    u7h u7hVar = ((hdk) obj3).j;
                    if (u7hVar == null) {
                        x340Var2.i0(-1159605741);
                        uwr uwrVar = cbx.a;
                        j = cbx.a(x340Var2).b.a;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1159607012);
                        x340Var2.r(false);
                        j = u7hVar.a;
                    }
                    rck.a(this.d, j, this.b, this.c, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((ngs0) obj3).j(f2, f, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                k8b1 k8b1Var = (k8b1) obj3;
                if (i != k8b1Var.c) {
                    throw new CancellationException();
                }
                k8b1Var.e(f2 * fFloatValue >= 0.0f ? yoi1.o(fFloatValue / f, -1.0f, 1.0f) : 0.0f);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kck(int i, Object obj, float f, float f2, byte b) {
        super(2);
        this.a = b;
        this.d = i;
        this.e = obj;
        this.b = f;
        this.c = f2;
    }
}
