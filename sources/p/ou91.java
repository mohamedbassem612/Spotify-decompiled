package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class ou91 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m811 b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ ou91(m811 m811Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = m811Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        m811 m811Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                float f = m811Var.a - fFloatValue;
                m811Var.a = f;
                iu30Var.invoke(Float.valueOf(f));
                break;
            default:
                float f2 = m811Var.a - fFloatValue;
                m811Var.a = f2;
                iu30Var.invoke(Float.valueOf(f2));
                break;
        }
        return rih1Var;
    }
}
