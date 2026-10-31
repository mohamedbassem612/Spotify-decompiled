package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ua5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ va5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua5(va5 va5Var, byte b) {
        super(1);
        this.a = b;
        this.b = va5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        va5 va5Var = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0[] q5t0VarArr = va5Var.c;
                q5t0VarArr.getClass();
                int i2 = va5Var.e;
                int i3 = va5Var.g;
                int length = q5t0VarArr.length;
                while (i < length) {
                    q5t0 q5t0Var = q5t0VarArr[i];
                    if (q5t0Var != null) {
                        long jA = va5Var.a.b.a((((long) q5t0Var.a) << 32) | (((long) q5t0Var.b) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), flb0.a);
                        p5t0.g((int) (jA >> 32), (int) (jA & 4294967295L), p5t0Var, q5t0Var);
                    }
                    i++;
                    q5t0VarArr = q5t0VarArr;
                }
                break;
            default:
                p5t0 p5t0Var2 = (p5t0) obj;
                q5t0[] q5t0VarArr2 = va5Var.b;
                q5t0VarArr2.getClass();
                int i4 = va5Var.d;
                int i5 = va5Var.f;
                int length2 = q5t0VarArr2.length;
                while (i < length2) {
                    q5t0 q5t0Var2 = q5t0VarArr2[i];
                    if (q5t0Var2 != null) {
                        tl3 tl3Var = va5Var.a.b;
                        int i6 = q5t0Var2.a;
                        long jA2 = tl3Var.a((((long) q5t0Var2.b) & 4294967295L) | (((long) i6) << 32), (((long) i4) << 32) | (((long) i5) & 4294967295L), flb0.a);
                        p5t0.g((int) (jA2 >> 32), (int) (jA2 & 4294967295L), p5t0Var2, q5t0Var2);
                    }
                    i++;
                    rih1Var = rih1Var;
                }
                break;
        }
        return rih1Var;
    }
}
