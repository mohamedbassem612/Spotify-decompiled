package p;

import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s7o extends RequestFinishedInfo.Listener {
    public final int a;
    public final /* synthetic */ v7o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7o(v7o v7oVar, int i) {
        super(v7oVar.b.b);
        this.b = v7oVar;
        this.a = i;
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        wqj0 wqj0Var = this.b.s;
        wqj0Var.getClass();
        wqj0Var.c.updateAndGet(new v87(new vqj0(this.a, requestFinishedInfo), (byte) 2));
        wqj0Var.c();
    }
}
