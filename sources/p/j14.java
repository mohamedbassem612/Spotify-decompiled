package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class j14 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n24 b;
    public final /* synthetic */ m811 c;

    public /* synthetic */ j14(n24 n24Var, m811 m811Var, byte b) {
        this.a = b;
        this.b = n24Var;
        this.c = m811Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m811 m811Var = this.c;
        n24 n24Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                s24 s24Var = n24Var.a;
                ((drr0) s24Var.Y).t(fFloatValue);
                ((drr0) s24Var.Z).t(fFloatValue2);
                m811Var.a = fFloatValue;
                break;
            default:
                s24 s24Var2 = n24Var.a;
                ((drr0) s24Var2.Y).t(fFloatValue);
                ((drr0) s24Var2.Z).t(fFloatValue2);
                m811Var.a = fFloatValue;
                break;
        }
        return rih1Var;
    }
}
