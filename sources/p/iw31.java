package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class iw31 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ iw31(j6m1 j6m1Var, int i, q5t0 q5t0Var, int i2, ifh0 ifh0Var) {
        this.d = j6m1Var;
        this.b = i;
        this.e = q5t0Var;
        this.c = i2;
        this.f = ifh0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                q5t0[] q5t0VarArr = (q5t0[]) obj4;
                jw31 jw31Var = (jw31) obj3;
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
                    buo1 buo1Var = it31VarU != null ? it31VarU.c : null;
                    int i4 = this.b;
                    p5t0.g(iArr[i2], buo1Var != null ? buo1Var.r(i4, q5t0Var.b, flb0.a, q5t0Var, this.c) : jw31Var.b.c(q5t0Var.b, i4), p5t0Var, q5t0Var);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                q5t0 q5t0Var2 = (q5t0) obj3;
                p5t0.i((p5t0) obj, q5t0Var2, ((qr80) ((j6m1) obj4).Q0.invoke(new yr80((((long) (this.b - q5t0Var2.a)) << 32) | (((long) (this.c - q5t0Var2.b)) & 4294967295L)), ((ifh0) obj2).getLayoutDirection())).a);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ iw31(q5t0[] q5t0VarArr, jw31 jw31Var, int i, int i2, int[] iArr) {
        this.d = q5t0VarArr;
        this.e = jw31Var;
        this.b = i;
        this.c = i2;
        this.f = iArr;
    }
}
