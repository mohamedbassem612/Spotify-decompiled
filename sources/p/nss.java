package p;

import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nss implements pta1 {
    public final bqz a;
    public final c3s b;

    public nss(bqz bqzVar, c3s c3sVar) {
        this.a = bqzVar;
        this.b = c3sVar;
    }

    public final Observable a() {
        c3s c3sVar = this.b;
        return c3sVar.e.startWithItem(Boolean.valueOf(c3sVar.d())).map(y580.X0).distinctUntilChanged();
    }

    public final Observable b() {
        return this.a.c("audio.episode.speed").map(uh21.d1).map(zhm0.V0);
    }

    public final Completable c(suz suzVar, int i) {
        bqz bqzVar = this.a;
        bqzVar.getClass();
        iqz iqzVarR = EsPrefs.Value.r();
        iqzVarR.q(i);
        EsPrefs.Value valueBuild = iqzVarR.build();
        valueBuild.getClass();
        return bqzVar.d("audio.episode.speed", valueBuild);
    }
}
