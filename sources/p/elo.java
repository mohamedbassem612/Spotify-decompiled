package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class elo implements kko {
    public final /* synthetic */ byte a;
    public final zob1 b;
    public final /* synthetic */ y1c1 c;

    public elo(y1c1 y1c1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = y1c1Var;
                this.b = ((w2c1) y1c1Var).U(ijo.class);
                break;
            default:
                this.c = y1c1Var;
                this.b = ((w2c1) y1c1Var).U(ijo.class);
                break;
        }
    }

    public final zob1 a() {
        byte b = this.a;
        return this.b;
    }

    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w2c1 w2c1Var = this.c;
        switch (b) {
            case 0:
                w2c1Var.T(new v450(str, tv80Var));
                break;
            default:
                w2c1Var.T(new v450(str, tv80Var));
                break;
        }
        return rih1Var;
    }
}
