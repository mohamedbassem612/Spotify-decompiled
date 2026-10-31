package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class upd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spd1 b;
    public final /* synthetic */ ycm c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upd1(spd1 spd1Var, ycm ycmVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = spd1Var;
        this.c = ycmVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        ycm ycmVar = this.c;
        spd1 spd1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                g0p1.d(spd1Var, ycmVar, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                g0p1.d(spd1Var, ycmVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                g0p1.s(spd1Var, ycmVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
