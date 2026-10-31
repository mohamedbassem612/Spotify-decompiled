package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class orn0 implements qrg0 {
    public final /* synthetic */ byte a;
    public final lzn0 b;
    public final j2e0 c;
    public final String d;

    public /* synthetic */ orn0(lzn0 lzn0Var, j2e0 j2e0Var, String str, byte b) {
        this.a = b;
        this.b = lzn0Var;
        this.c = j2e0Var;
        this.d = str;
    }

    public final void b(int i) {
        byte b = this.a;
        lzn0 lzn0Var = this.b;
        String str = this.d;
        j2e0 j2e0Var = this.c;
        switch (b) {
            case 0:
                int iC = l1d.C(i);
                if (iC == 0) {
                    ((i8h1) j2e0Var.b).f(((gfl0) j2e0Var.c).e(), (Set) null);
                    break;
                } else if (iC == 3) {
                    String strConcat = str.concat(":markasplayed");
                    lzn0Var.a(strConcat, j2e0Var.m(strConcat), (Bundle) null);
                    break;
                }
                break;
            default:
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    ((i8h1) j2e0Var.b).f(((gfl0) j2e0Var.c).e(), (Set) null);
                    break;
                } else if (iC2 != 1 && iC2 != 2) {
                    if (iC2 != 3) {
                        eg.o();
                    } else {
                        String strConcat2 = str.concat(":markasplayed");
                        lzn0Var.a(strConcat2, j2e0Var.m(strConcat2), (Bundle) null);
                    }
                    break;
                }
                break;
        }
    }
}
