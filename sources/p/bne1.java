package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bne1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wj31 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ jfe d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bne1(wj31 wj31Var, ArrayList arrayList, jfe jfeVar, boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wj31Var;
        this.c = arrayList;
        this.d = jfeVar;
        this.e = z;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(199681);
                ine1.a(this.b, this.c, this.d, this.e, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                int iP2 = czo1.p(199681);
                ine1.a(this.b, this.c, this.d, this.e, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
