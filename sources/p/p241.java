package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p241 implements o241 {
    public final Observable a;

    public p241(Observable observable) {
        this.a = observable;
    }

    public final Observable a(String str, String str2) {
        return this.a.map(new zpq0(str, str2)).distinctUntilChanged();
    }

    public final Observable b(String str) {
        return this.a.map(new hfr(str, (byte) 17)).filter(new nkx0((byte) 27)).map(new nkx0((byte) 28)).distinctUntilChanged();
    }
}
