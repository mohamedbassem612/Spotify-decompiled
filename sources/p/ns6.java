package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ns6 extends k9 {
    public ns6(uu00 uu00Var) {
        super(uu00Var, (byte) 7);
    }

    public final Observable f(String str) {
        return ((uu00) ((k9) this).b).b(new oi("save-for-later", false, new wk3(str, (byte) 12))).filter(fmv.d1).map(new km3(str, this, (byte) 16));
    }

    public final rmy h1(ez00 ez00Var) {
        vy6 vy6Var = (vy6) ez00Var;
        return new rmy(vy6Var.b, vy6Var.c.a, 2, "");
    }
}
