package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bjq0 {
    public static final List c;
    public final z6a0 a;
    public volatile tga b;

    static {
        hqj0 hqj0Var = new hqj0("frame");
        opj0 opj0Var = opj0.Gauge;
        npj0 npj0Var = new npj0("ui.stutter.frame_count", opj0Var, hqj0Var);
        jqj0 jqj0Var = jqj0.a;
        c = p7h.M(new npj0[]{npj0Var, new npj0("ui.stutter.frame_duration", opj0Var, jqj0Var), new npj0("ui.frame_count", opj0Var, new hqj0("frame")), new npj0("ui.frame_duration", opj0Var, jqj0Var)});
    }

    public bjq0(z6a0 z6a0Var) {
        hhp0 hhp0Var = hhp0.a;
        this.a = z6a0Var;
    }
}
