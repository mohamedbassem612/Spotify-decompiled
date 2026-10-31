package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class rq implements dwo {
    public final jq a;

    public rq(jq jqVar) {
        this.a = jqVar;
        jqVar.start();
    }

    public final void shutdown() {
        this.a.stop();
    }
}
