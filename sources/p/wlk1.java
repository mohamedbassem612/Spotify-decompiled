package p;

import com.spotify.karaoke.esperanto.proto.KaraokePostStatusRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wlk1 {
    public final g0l a;
    public final Flowable b;
    public final b7n c;
    public final be d;

    public wlk1(g0l g0lVar, Flowable flowable, b7n b7nVar, be beVar) {
        this.a = g0lVar;
        this.b = flowable;
        this.c = b7nVar;
        this.d = beVar;
    }

    public final CompletableFromSingle a(boa0 boa0Var) {
        zna0 zna0VarN = KaraokePostStatusRequest.n();
        zna0VarN.n(boa0Var);
        KaraokePostStatusRequest karaokePostStatusRequestBuild = zna0VarN.build();
        karaokePostStatusRequestBuild.getClass();
        return Completable.k(this.d.b(karaokePostStatusRequestBuild));
    }
}
