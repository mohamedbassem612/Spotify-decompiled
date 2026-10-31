package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tgr0 extends hab0 implements iu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q5t0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q5t0 e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgr0(List list, int i, q5t0 q5t0Var, int i2, q5t0 q5t0Var2, ArrayList arrayList, int i3) {
        super(1);
        this.a = list;
        this.b = i;
        this.c = q5t0Var;
        this.d = i2;
        this.e = q5t0Var2;
        this.f = arrayList;
        this.g = i3;
    }

    public static final void a(int i, int i2, p5t0 p5t0Var, q5t0 q5t0Var) {
        p5t0Var.k(q5t0Var, i2, (i - q5t0Var.b) / 2, 0.0f);
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        List list = this.a;
        q5t0 q5t0Var = (q5t0) o7h.s0(list);
        int i = this.b;
        int i2 = this.g;
        if (q5t0Var != null) {
            a(i2, i, p5t0Var, q5t0Var);
        }
        q5t0 q5t0Var2 = this.c;
        a(i2, i, p5t0Var, q5t0Var2);
        int i3 = i + q5t0Var2.a;
        int i4 = this.d;
        int i5 = 0;
        int i6 = i3 + (i4 < 0 ? 0 : i4);
        q5t0 q5t0Var3 = this.e;
        a(i2, i6, p5t0Var, q5t0Var3);
        int i7 = i6 + q5t0Var3.a;
        int i8 = -i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = i7 + i8;
        for (Object obj2 : this.f) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                p7h.T();
                throw null;
            }
            q5t0 q5t0Var4 = (q5t0) obj2;
            q5t0 q5t0Var5 = (q5t0) o7h.t0(i10, list);
            if (q5t0Var5 != null) {
                a(i2, i9, p5t0Var, q5t0Var5);
            }
            a(i2, i9, p5t0Var, q5t0Var4);
            i9 += q5t0Var4.a;
            i5 = i10;
        }
        return rih1.a;
    }
}
