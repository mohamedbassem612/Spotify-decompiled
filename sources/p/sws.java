package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class sws implements bxs, m0g1 {
    public final /* synthetic */ zws a;

    public /* synthetic */ sws(zws zwsVar) {
        this.a = zwsVar;
    }

    public exs a(Context context) {
        exs exsVar = new exs(context);
        exsVar.p(this.a);
        return exsVar;
    }

    public bg11 b(int i, pnf1 pnf1Var, int[] iArr) {
        v280 v280VarM = b380.m();
        for (int i2 = 0; i2 < pnf1Var.a; i2++) {
            v280VarM.c(new wws(i, pnf1Var, i2, this.a, iArr[i2]));
        }
        return v280VarM.g();
    }
}
