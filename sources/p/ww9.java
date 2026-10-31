package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ww9 {
    public final Flowable a;
    public final qah b = new qah(new jc9(this, (byte) 1));
    public final rku c = new rku();
    public gah d;

    public ww9(Flowable flowable) {
        this.a = flowable;
    }

    public final void a(gah gahVar) {
        this.d = gahVar;
        this.c.b(this.a.c0(Flowable.O(0, Integer.MAX_VALUE), wcp1.X).subscribe(new tg((Object) this, (byte) 28)));
    }
}
