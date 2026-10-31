package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j26 implements Function, SingleOnSubscribe {
    public final /* synthetic */ m26 a;

    public /* synthetic */ j26(m26 m26Var) {
        this.a = m26Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        return Single.create(new l7m0((Object) this.a, (byte) 4));
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        luk lukVar;
        m26 m26Var = this.a;
        tgp0 tgp0Var = m26Var.r;
        if (tgp0Var == null || !tgp0Var.i("apps-music-libs-eventsender.send_full_ess2")) {
            lukVar = tgp0Var;
            lukVar = m26Var.s;
        }
        if (lukVar != null) {
        }
    }
}
