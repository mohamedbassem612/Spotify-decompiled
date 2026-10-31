package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vn2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn2(long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                vn2 vn2Var = new vn2(this.c, lnmVar, (byte) 0);
                vn2Var.b = ((Number) obj).longValue();
                return vn2Var;
            default:
                vn2 vn2Var2 = new vn2(this.c, lnmVar, (byte) 1);
                vn2Var2.b = ((Number) obj).longValue();
                return vn2Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long jLongValue = ((Number) obj).longValue();
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(Long.valueOf(jLongValue), lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        long j = this.c;
        long j2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(j2 != j);
            default:
                hm5.M(obj);
                return Boolean.valueOf(j2 >= j);
        }
    }
}
