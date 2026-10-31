package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q5t0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb5(q5t0 q5t0Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = q5t0Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        q5t0 q5t0Var = this.b;
        switch (b) {
            case 0:
                ((p5t0) obj).k(q5t0Var, i, 0, 0.0f);
                break;
            case 1:
                ((p5t0) obj).k(q5t0Var, 0, i - q5t0Var.b, 0.0f);
                break;
            case 2:
                ((p5t0) obj).f(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
                break;
            case 3:
                ((p5t0) obj).k(q5t0Var, -i, 0, 0.0f);
                break;
            case 4:
                ((p5t0) obj).f(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
                break;
            case 5:
                ((p5t0) obj).f(q5t0Var, i, i, 0.0f);
                break;
            case 6:
                ((p5t0) obj).f(q5t0Var, 0, i, 0.0f);
                break;
            case 7:
                ((p5t0) obj).k(q5t0Var, 0, i, 0.0f);
                break;
            case 8:
                ((p5t0) obj).k(q5t0Var, -i, 0, 0.0f);
                break;
            case 9:
                ((p5t0) obj).k(q5t0Var, -i, 0, 0.0f);
                break;
            case 10:
                ((p5t0) obj).k(q5t0Var, -i, 0, 0.0f);
                break;
            case 11:
                ((p5t0) obj).k(q5t0Var, 0, i, 0.0f);
                break;
            case 12:
                ((p5t0) obj).f(q5t0Var, -i, 0, 0.0f);
                break;
            case 13:
                ((p5t0) obj).k(q5t0Var, i, 0, 0.0f);
                break;
            case 14:
                ((p5t0) obj).k(q5t0Var, i, 0, 0.0f);
                break;
            case 15:
                ((p5t0) obj).k(q5t0Var, 0, i, 0.0f);
                break;
            case 16:
                ((p5t0) obj).f(q5t0Var, i, 0, 0.0f);
                break;
            case 17:
                ((p5t0) obj).f(q5t0Var, i, 0, 0.0f);
                break;
            case 18:
                ((p5t0) obj).k(q5t0Var, -i, 0, 0.0f);
                break;
            case 19:
                ((p5t0) obj).f(q5t0Var, 0, (i - q5t0Var.b) / 2, 0.0f);
                break;
            case 20:
                ((p5t0) obj).k(q5t0Var, (-q5t0Var.a) / 2, -(i + q5t0Var.b), 0.0f);
                break;
            default:
                ((p5t0) obj).k(q5t0Var, 0, i, 0.0f);
                break;
        }
        return rih1Var;
    }
}
