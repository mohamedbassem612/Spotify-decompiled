package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v77 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b87 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ String e;
    public final /* synthetic */ xtb0 f;
    public final /* synthetic */ vu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v77(b87 b87Var, boolean z, List list, String str, xtb0 xtb0Var, vu30 vu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = b87Var;
        this.c = z;
        this.d = list;
        this.e = str;
        this.f = xtb0Var;
        this.g = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vu30 vu30Var = this.g;
                int iP = czo1.p(1);
                this.b.i(this.c, this.d, this.e, this.f, vu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                vu30 vu30Var2 = this.g;
                int iP2 = czo1.p(1);
                this.b.i(this.c, this.d, this.e, this.f, vu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
