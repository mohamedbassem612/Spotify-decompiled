package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ce70 implements de70 {
    public final /* synthetic */ de70 a;

    public ce70(de70 de70Var) {
        this.a = de70Var;
    }

    public final y570 b(y570 y570Var) {
        y570 y570VarB = this.a.b(y570Var);
        bg11 bg11VarS = y570Var.s();
        if (bg11VarS == Collections.EMPTY_LIST) {
            return y570VarB;
        }
        w280 w280Var = b380.b;
        return bg11VarS == bg11.e ? y570VarB : new be70(this, y570VarB);
    }
}
