package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s241 {
    public final en80 a;

    public s241(en80 en80Var) {
        this.a = en80Var;
    }

    public final Observable a(String str) {
        return this.a.a(str).toObservable().map(new nkx0((byte) 29));
    }
}
