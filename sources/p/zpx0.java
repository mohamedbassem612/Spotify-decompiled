package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zpx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ rxx0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zpx0(Set set, rxx0 rxx0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = set;
        this.c = rxx0Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        rxx0 rxx0Var = this.c;
        Set set = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                kqn1.k(set, rxx0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                kqn1.k(set, rxx0Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
