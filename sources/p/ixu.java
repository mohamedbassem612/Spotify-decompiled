package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$DownloadCommand;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ixu implements Supplier {
    public final /* synthetic */ EsOfflinePlugin$DownloadCommand a;
    public final /* synthetic */ onf0 b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ pmf0 d;
    public final /* synthetic */ lpz e;

    public ixu(EsOfflinePlugin$DownloadCommand esOfflinePlugin$DownloadCommand, onf0 onf0Var, Scheduler scheduler, pmf0 pmf0Var, lpz lpzVar) {
        this.a = esOfflinePlugin$DownloadCommand;
        this.b = onf0Var;
        this.c = scheduler;
        this.d = pmf0Var;
        this.e = lpzVar;
    }

    public final Object get() {
        EsOfflinePlugin$DownloadCommand esOfflinePlugin$DownloadCommand = this.a;
        phc phcVarA = ckj0.a(esOfflinePlugin$DownloadCommand.getMetadataMap());
        String strConcat = phcVarA != null ? "spotify:track:".concat(g9a.a(phcVarA.t())) : esOfflinePlugin$DownloadCommand.getLink();
        strConcat.getClass();
        return this.b.a(strConcat).timeout(10L, TimeUnit.SECONDS).flatMapCompletable(new gmt(this.d, strConcat, (byte) 9)).x(Optional.empty()).onErrorReturn(drm0.Y0).observeOn(this.c).map(new otu(esOfflinePlugin$DownloadCommand, this.e, (byte) 2)).toObservable();
    }
}
