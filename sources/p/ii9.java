package p;

import com.spotify.canvaslogger.events.proto.CanvasLoad;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ii9 {
    public final t2j0 a;

    public void a(ikd ikdVar, String str, String str2, String str3) {
        ujd ujdVarN = CanvasLoad.n();
        ujdVarN.q(ikdVar.a());
        ujdVarN.r(ikdVar.b());
        ujdVarN.s(str);
        ujdVarN.t();
        if (str2 != null && str2.length() != 0) {
            ujdVarN.n("error_reason", str2);
        }
        if (str3 != null && str3.length() != 0) {
            ujdVarN.n("error_detail", str3);
        }
        this.a.a(ujdVarN.build());
    }
}
