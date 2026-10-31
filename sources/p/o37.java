package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o37 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o37(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                o37 o37Var = new o37(2, lnmVar, (byte) 0);
                o37Var.b = ((Number) obj).floatValue();
                return o37Var;
            case 1:
                o37 o37Var2 = new o37(2, lnmVar, (byte) 1);
                o37Var2.b = ((Number) obj).floatValue();
                return o37Var2;
            case 2:
                o37 o37Var3 = new o37(2, lnmVar, (byte) 2);
                o37Var3.b = ((Number) obj).floatValue();
                return o37Var3;
            default:
                o37 o37Var4 = new o37(2, lnmVar, (byte) 3);
                o37Var4.b = ((Number) obj).floatValue();
                return o37Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float fFloatValue = ((Number) obj).floatValue();
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(Float.valueOf(fFloatValue), lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                float f = this.b;
                hm5.M(obj);
                return Boolean.valueOf(f >= 0.99f);
            case 1:
                hm5.M(obj);
                return Boolean.valueOf(this.b > 0.0f);
            case 2:
                float f2 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(f2 >= 1.0f);
            default:
                float f3 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(f3 == 0.0f);
        }
    }
}
