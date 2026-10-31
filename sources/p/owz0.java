package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class owz0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pwz0 b;
    public final /* synthetic */ y341 c;

    public /* synthetic */ owz0(pwz0 pwz0Var, y341 y341Var, byte b) {
        this.a = b;
        this.b = pwz0Var;
        this.c = y341Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y341 y341Var = this.c;
        pwz0 pwz0Var = this.b;
        y36 y36Var = (y36) obj;
        switch (b) {
            case 0:
                pwz0Var.a(y341Var, y36Var);
                break;
            default:
                pwz0Var.b(y341Var, y36Var);
                break;
        }
        return rih1Var;
    }
}
