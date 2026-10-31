package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pr51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr51(List list, String str, String str2, String str3, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.f;
                int iP = czo1.p(1);
                rr51.e(this.b, this.c, this.d, this.e, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.f;
                int iP2 = czo1.p(1);
                rr51.e(this.b, this.c, this.d, this.e, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
