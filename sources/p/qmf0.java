package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qmf0 extends nup0 {
    public final onf0 a;
    public final pmf0 b;
    public final nmf0 c;
    public final Scheduler d;

    public qmf0(onf0 onf0Var, pmf0 pmf0Var, nmf0 nmf0Var, Scheduler scheduler) {
        this.a = onf0Var;
        this.b = pmf0Var;
        this.c = nmf0Var;
        this.d = scheduler;
    }

    @Override // p.nup0
    public final Observable a(EsOfflinePlugin.DownloadCommand downloadCommand) {
        nmf0 nmf0Var = this.c;
        return cev0.t(downloadCommand, this.a, this.b, ((dr4) nmf0Var.a.get()).a(), this.d, ((dr4) nmf0Var.a.get()).c());
    }

    @Override // p.nup0
    public final Single b(EsOfflinePlugin.IdentifyCommand identifyCommand) {
        return pn70.b(identifyCommand, this.b, this.d);
    }

    @Override // p.nup0
    public final Single c(EsOfflinePlugin.RemoveCommand removeCommand) {
        return d7p1.o(removeCommand, this.b, this.d);
    }
}
