package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bej1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cej1 b;
    public final /* synthetic */ jb3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej1(jb3 jb3Var, cej1 cej1Var) {
        super(1);
        this.c = jb3Var;
        this.b = cej1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cej1 cej1Var = this.b;
        switch (b) {
            case 0:
                ((z2s) obj).R(gi90.class, this.c, new xaj1(cej1Var, (byte) 4), l6j1.t, l6j1.X, false, zhi1.Q0);
                break;
            default:
                o4o1.o((y2s) obj, cej1Var.f, new bej1(this.c, cej1Var));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej1(cej1 cej1Var, jb3 jb3Var) {
        super(1);
        this.b = cej1Var;
        this.c = jb3Var;
    }
}
