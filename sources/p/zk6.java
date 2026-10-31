package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk6(List list, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        List list = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ejo1.f(list, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                kto1.g(list, qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                kto1.h(list, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                qqn1.e(list, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
