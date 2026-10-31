package p;

import com.spotify.performance.coldstartupmusicintegration.ColdStartupCppForwarder;
import com.spotify.playbacknative.AudioRenderer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mxg implements jxg {
    public final zle1 a;
    public final lxg b;
    public final ct6 c;
    public final ou7 d;
    public final q8n e;

    public mxg(zle1 zle1Var, lxg lxgVar, ct6 ct6Var, ou7 ou7Var, q8n q8nVar) {
        this.a = zle1Var;
        this.b = lxgVar;
        this.c = ct6Var;
        this.d = ou7Var;
        this.e = q8nVar;
    }

    public final Object a(bh bhVar) {
        AudioRenderer.INSTANCE.addListener(this.d);
        lxg lxgVar = this.b;
        ((i94) lxgVar).d(this);
        ColdStartupCppForwarder.INSTANCE.installTimeKeeper(this.a, lxgVar);
        Object objH = c921.H(this.e, new q82(this, null, (byte) 4), bhVar);
        return objH == d9n.a ? objH : rih1.a;
    }

    @Override // p.jxg
    public final void onColdStartupCompleted(String str) {
        c921.y(ov40.a, this.e, 0, new hzb(this, (lnm) null, (byte) 12), 2);
        AudioRenderer.INSTANCE.removeListener(this.d);
    }
}
