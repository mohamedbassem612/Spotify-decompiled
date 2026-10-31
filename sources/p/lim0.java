package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lim0 implements njj0 {
    public final uu00 a;
    public final String b;

    public lim0(String str, uu00 uu00Var) {
        this.a = uu00Var;
        this.b = str;
    }

    @Override // p.njj0
    public final Observable a(g4r g4rVar) {
        return this.a.b(new oi(this.b, new kim0(g4rVar, (byte) 0))).takeUntil((Predicate) aj20.P0).map(new dg90(g4rVar, (byte) 29));
    }
}
