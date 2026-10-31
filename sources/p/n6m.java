package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n6m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6m(int i, int i2, int i3, ArrayList arrayList) {
        super(1);
        this.a = (byte) 1;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                int i4 = 0;
                for (Object obj3 : (ArrayList) obj2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    q5t0 q5t0Var = (q5t0) obj3;
                    p5t0Var.f(q5t0Var, (i4 * i2) + i3, l1d.f(i - (i3 * 2), q5t0Var.b, 2, i3), 0.0f);
                    i4 = i5;
                }
                return rih1Var;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                for (q5t0 q5t0Var2 : (ArrayList) obj2) {
                    p5t0Var2.k(q5t0Var2, i3, i2, 0.0f);
                    i3 += q5t0Var2.a + i;
                }
                return rih1Var;
            default:
                q5t0 q5t0Var3 = (q5t0) obj2;
                ((p5t0) obj).k(q5t0Var3, i3, (i2 - q5t0Var3.b) + i, 0.0f);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6m(Object obj, int i, int i2, int i3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }
}
