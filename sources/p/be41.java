package p;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class be41 {
    public static final kl1 a;

    static {
        kl1 kl1Var = new kl1((byte) 16);
        re41 re41Var = re41.a;
        jd11 jd11Var = rc11.a;
        kl1Var.h(jd11Var.b(Bundle.class), re41Var);
        kl1 kl1VarF = kl1Var.f();
        kl1 kl1Var2 = new kl1((byte) 16);
        kl1Var2.h(jd11Var.b(Size.class), b391.a);
        kl1Var2.h(jd11Var.b(SizeF.class), t291.a);
        kl1Var2.k(jd11Var.b(SparseArray.class), new cix0((byte) 3));
        kl1 kl1VarF2 = kl1Var2.f();
        kl1 kl1Var3 = j761.a;
        kl1 kl1Var4 = new kl1((byte) 16);
        kl1VarF.n(kl1Var4);
        kl1VarF2.n(kl1Var4);
        a = kl1Var4.f();
    }
}
