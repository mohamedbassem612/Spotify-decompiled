package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v1c implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ifh0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v1c(q5t0 q5t0Var, afh0 afh0Var, ifh0 ifh0Var, int i, int i2, w1c w1cVar) {
        this.e = q5t0Var;
        this.f = afh0Var;
        this.d = ifh0Var;
        this.b = i;
        this.c = i2;
        this.g = w1cVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        ifh0 ifh0Var = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                t1c.d((p5t0) obj, (q5t0) obj4, (afh0) obj3, ifh0Var.getLayoutDirection(), this.b, this.c, ((w1c) obj2).a);
                break;
            default:
                q5t0[] q5t0VarArr = (q5t0[]) obj4;
                mbh mbhVar = (mbh) obj3;
                int[] iArr = (int[]) obj2;
                p5t0 p5t0Var = (p5t0) obj;
                int length = q5t0VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    q5t0 q5t0Var = q5t0VarArr[i];
                    int i3 = i2 + 1;
                    q5t0Var.getClass();
                    it31 it31VarU = x760.u(q5t0Var);
                    flb0 layoutDirection = ifh0Var.getLayoutDirection();
                    buo1 buo1Var = it31VarU != null ? it31VarU.c : null;
                    int i4 = this.b;
                    p5t0.g(buo1Var != null ? buo1Var.r(i4, q5t0Var.a, layoutDirection, q5t0Var, this.c) : mbhVar.b.a(q5t0Var.a, i4, layoutDirection), iArr[i2], p5t0Var, q5t0Var);
                    i++;
                    i2 = i3;
                }
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ v1c(q5t0[] q5t0VarArr, mbh mbhVar, int i, int i2, ifh0 ifh0Var, int[] iArr) {
        this.e = q5t0VarArr;
        this.f = mbhVar;
        this.b = i;
        this.c = i2;
        this.d = ifh0Var;
        this.g = iArr;
    }
}
