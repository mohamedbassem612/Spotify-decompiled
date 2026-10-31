package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vic implements tic {
    public final zwz0 a;
    public final qlc b;
    public final ifl1 c;

    public vic(zwz0 zwz0Var, ulc ulcVar, qlc qlcVar, ifl1 ifl1Var) {
        this.a = zwz0Var;
        this.b = qlcVar;
        this.c = ifl1Var;
    }

    public final Observable a() {
        if (!((ht4) ((dsp) this.c.b).get()).b()) {
            return Observable.empty();
        }
        return yoi1.i(this.a.c(), o6x.a).buffer(2, 1).filter(t9w.O0).withLatestFrom(this.b.e.hide().distinctUntilChanged(), e4y.O0).map(new uic(this, (byte) 0));
    }
}
