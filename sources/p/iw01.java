package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iw01 {
    public final zwm1 a;
    public final agc0 b;
    public final bx5 c;
    public final Context d;

    public iw01(zwm1 zwm1Var, agc0 agc0Var, bx5 bx5Var, Context context) {
        this.a = zwm1Var;
        this.b = agc0Var;
        this.c = bx5Var;
        this.d = context;
    }

    public static String a(String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : xcg1.i(str, " • ", str2);
    }

    public String b(String str, zuc0 zuc0Var, int i, boolean z) {
        return (str.length() <= 0 || i <= 0 || (z && g6p1.k(zuc0Var) == br01.d)) ? str : a(this.c.d(i, zuc0Var), str);
    }

    public iw01(zwm1 zwm1Var, bx5 bx5Var, Context context, agc0 agc0Var) {
        this.a = zwm1Var;
        this.c = bx5Var;
        this.d = context;
        this.b = agc0Var;
    }
}
