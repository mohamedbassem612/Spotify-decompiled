package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cwg1 implements dk80 {
    public static final cwg1 a = new cwg1();

    public final void g(e261 e261Var) {
        mma0[] mma0VarArr = b261.a;
        d261 d261Var = z161.R;
        mma0 mma0Var = b261.a[29];
        d261Var.getClass();
        e261Var.b(d261Var, 500);
    }

    public final void i(h4e1 h4e1Var) {
        yzr0 yzr0Var = h4e1Var.c;
        if (yzr0Var.length() <= 500) {
            return;
        }
        long j = h4e1Var.g;
        int i = nbe1.c;
        int i2 = (int) (j & 4294967295L);
        int length = yzr0Var.length() - 500;
        if (length < 0) {
            length = 0;
        }
        int i3 = i2 - length;
        int i4 = i3 >= 0 ? i3 : 0;
        if (i4 > 0) {
            int i5 = i4 - 1;
            if (Character.isHighSurrogate(yzr0Var.charAt(i5))) {
                i4 = i5;
            }
        }
        h4e1Var.k(i4, i2, "");
        if (yzr0Var.length() <= 500) {
            return;
        }
        h4e1Var.m();
    }
}
