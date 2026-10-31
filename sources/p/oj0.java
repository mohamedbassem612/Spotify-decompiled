package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj0(ao0 ao0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ao0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ao0.a(this.b, co0.f1, ((jk0) obj).a.a.a, (Long) null, (String) null, (String) null, 124);
                break;
            case 1:
                cas casVar = (a7m0) obj;
                casVar.a = e3.P0;
                casVar.h = new oj0(this.b, (byte) 0);
                break;
            default:
                ziu ziuVar = (ziu) obj;
                if (ziuVar.e) {
                    ao0.a(this.b, co0.f1, ziuVar.f.a.a(), (Long) null, (String) null, (String) null, 124);
                }
                break;
        }
        return rih1Var;
    }
}
