package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vw {
    public final lmy0 a;

    public vw(lmy0 lmy0Var) {
        this.a = lmy0Var;
    }

    public final Observable a() {
        return this.a.b("kids-data-migration", new n5(1, this, vw.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/kidsdatamigration/v1/MigrationStatusPubsub;", 0, (byte) 4)).doOnNext(nm.d).map(new r5x0(this)).doOnNext(nm.e);
    }
}
