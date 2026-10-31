package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum sqp0 {
    NOT_DOWNLOADED(com.spotify.betamax.offlinecoordinator.proto.f.MISSING),
    DOWNLOADED(com.spotify.betamax.offlinecoordinator.proto.f.COMPLETE),
    INVALID(com.spotify.betamax.offlinecoordinator.proto.f.NOT_APPLICABLE);

    public final com.spotify.betamax.offlinecoordinator.proto.f a;

    sqp0(com.spotify.betamax.offlinecoordinator.proto.f fVar) {
        this.a = fVar;
    }
}
