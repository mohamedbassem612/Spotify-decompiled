package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jor extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jor(kor korVar, String str, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = korVar;
        this.c = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        String str = this.c;
        kor korVar = this.b;
        switch (b) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                korVar.e.onNext(new z7l(true, str, Double.valueOf(dDoubleValue)));
                iu30Var.invoke(Double.valueOf(dDoubleValue));
                break;
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                korVar.e.onNext(new z7l(true, str, Double.valueOf(dDoubleValue2)));
                iu30Var.invoke(Double.valueOf(dDoubleValue2));
                break;
        }
        return rih1Var;
    }
}
