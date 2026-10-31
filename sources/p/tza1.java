package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tza1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tza1(s24 s24Var, byte b) {
        super(1);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                ((hrr0) s24Var.h).setValue(Float.valueOf(((Number) obj).floatValue()));
                break;
            default:
                p3v p3vVar = (p3v) obj;
                float f = p3vVar.a;
                ((hrr0) s24Var.N0).setValue(p3vVar);
                break;
        }
        return rih1Var;
    }
}
