package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b071 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b071(String str, String str2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        String str = this.c;
        String str2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                pwo1.g(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 1:
                xfo1.d(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 2:
                ilo1.d(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 3:
                qmo1.i(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 4:
                hyo1.g(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 5:
                jm5.c(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 6:
                aq8.i(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            case 7:
                aq8.p(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
            default:
                lcc.l(czo1.p(1), str2, str, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}
