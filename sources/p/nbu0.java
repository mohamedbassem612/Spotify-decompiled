package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nbu0 {
    public final b7r0 a;

    public nbu0(b7r0 b7r0Var) {
        this.a = b7r0Var;
    }

    public final EsLoggingParams.LoggingParams a(long j, tv80 tv80Var) {
        ou80 ou80Var;
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        y6r0 y6r0Var = this.a.get();
        String str = null;
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        cozVarR.q(str2);
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            str = ou80Var.a;
        }
        cozVarR.n(str != null ? str : "");
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(j);
        cozVarR.s(qpzVarP.build());
        return cozVarR.build();
    }
}
