package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mxy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mxy(String str, gt40 gt40Var, kee1 kee1Var, int i, int i2, int i3) {
        super(2);
        this.b = str;
        this.f = gt40Var;
        this.g = kee1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.e;
                String str = this.b;
                j9k1.d((Set) obj4, str, (qim0) obj3, this.c, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                byte b3 = this.e;
                String str2 = this.b;
                o4p1.g(str2, (gt40) obj4, (kee1) obj3, this.c, (b0k) obj, s | 1, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mxy(Set set, String str, qim0 qim0Var, int i, int i2, int i3) {
        super(2);
        this.f = set;
        this.b = str;
        this.g = qim0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
