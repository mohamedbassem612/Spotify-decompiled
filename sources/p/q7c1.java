package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class q7c1 implements Update {
    public static final q7c1 a = new q7c1();

    public final Next a(Object obj, Object obj2) {
        long jPow;
        b9c1 b9c1Var = (b9c1) obj;
        h7c1 h7c1Var = (h7c1) obj2;
        int i = b9c1Var.c;
        if (h7c1Var instanceof d7c1) {
            b9c1 b9c1VarA = b9c1.a(b9c1Var, null, i + 1, null, null, 27);
            int i2 = b9c1Var.a;
            if (i > 0) {
                if (i > 5) {
                    i = 5;
                }
                jPow = (long) (Math.pow(2.0d, i - 1) * 200.0d);
            } else {
                jPow = 0;
            }
            return Next.i(b9c1VarA, f46.S0(new tho1[]{new y6c1(i2, jPow), z6c1.c}));
        }
        if (h7c1Var instanceof g7c1) {
            return Next.h(b9c1.a(b9c1Var, ((g7c1) h7c1Var).a, 0, null, null, 29));
        }
        if (h7c1Var instanceof e7c1) {
            return Next.h(b9c1.a(b9c1Var, null, 0, ((e7c1) h7c1Var).a, null, 23));
        }
        if (h7c1Var instanceof f7c1) {
            return Next.h(b9c1.a(b9c1Var, null, 0, null, ((f7c1) h7c1Var).a, 15));
        }
        eg.o();
        return null;
    }
}
