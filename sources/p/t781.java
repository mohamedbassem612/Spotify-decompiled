package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t781 extends k9 {
    public final bl3 c;

    public t781(uu00 uu00Var, bl3 bl3Var) {
        super(uu00Var, (byte) 7);
        this.c = bl3Var;
    }

    public final Observable f(String str) {
        return k9.t0(this).b(new oi("save-for-later", new pg61(str, (byte) 14))).filter(fmv.d1).map(new ke71(str, this, (byte) 8)).flatMapSingle(new n381(this, str, (byte) 1));
    }

    public final rmy h1(ez00 ez00Var) {
        va81 va81Var = (va81) ez00Var;
        return new rmy(va81Var.b, va81Var.g.a, va81Var.i ? 3 : 6, va81Var.c);
    }
}
