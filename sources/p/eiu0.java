package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eiu0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eiu0(List list, boolean z, boolean z2, boolean z3, Integer num, iu30 iu30Var, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = num;
        this.g = iu30Var;
        this.h = f;
        this.i = qim0Var;
        this.t = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                giu0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                giu0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
