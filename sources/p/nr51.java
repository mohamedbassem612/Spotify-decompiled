package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nr51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ mr20 d;
    public final /* synthetic */ yzu e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ iu30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr51(List list, String str, mr20 mr20Var, yzu yzuVar, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, iu30 iu30Var2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = str;
        this.d = mr20Var;
        this.e = yzuVar;
        this.f = vu30Var;
        this.g = vu30Var2;
        this.h = iu30Var;
        this.i = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.i;
                int iP = czo1.p(1);
                rr51.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.i;
                int iP2 = czo1.p(1);
                rr51.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
