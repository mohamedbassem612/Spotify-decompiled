package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ga5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga5(int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.b = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                ga5 ga5Var = new ga5(2, lnmVar, (byte) 0);
                ga5Var.b = ((Number) obj).intValue();
                return ga5Var;
            case 1:
                ga5 ga5Var2 = new ga5(2, lnmVar, (byte) 1);
                ga5Var2.b = ((Number) obj).intValue();
                return ga5Var2;
            case 2:
                ga5 ga5Var3 = new ga5(2, lnmVar, (byte) 2);
                ga5Var3.b = ((Number) obj).intValue();
                return ga5Var3;
            case 3:
                ga5 ga5Var4 = new ga5(2, lnmVar, (byte) 3);
                ga5Var4.b = ((Number) obj).intValue();
                return ga5Var4;
            case 4:
                ga5 ga5Var5 = new ga5(2, lnmVar, (byte) 4);
                ga5Var5.b = ((Number) obj).intValue();
                return ga5Var5;
            case 5:
                ga5 ga5Var6 = new ga5(2, lnmVar, (byte) 5);
                ga5Var6.b = ((Number) obj).intValue();
                return ga5Var6;
            case 6:
                return new ga5(this.b, lnmVar);
            default:
                ga5 ga5Var7 = new ga5(2, lnmVar, (byte) 7);
                ga5Var7.b = ((Number) obj).intValue();
                return ga5Var7;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i > 0);
            case 1:
                int i2 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i2 != 0);
            case 2:
                int i3 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i3 > 0);
            case 3:
                int i4 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i4 == 0);
            case 4:
                int i5 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i5 > 0);
            case 5:
                int i6 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i6 == 0);
            case 6:
                hm5.M(obj);
                String strC = f4i1.c(this.b, "scene_reset=");
                dk30 dk30Var = tgp1.d;
                if (dk30Var != null) {
                    dk30Var.o1 = strC;
                }
                return rih1.a;
            default:
                int i7 = this.b;
                hm5.M(obj);
                return Boolean.valueOf(i7 != 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga5() {
        super(2, (lnm) null);
        this.a = (byte) 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga5(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
