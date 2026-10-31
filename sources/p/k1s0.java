package p;

import com.spotify.messages.PartnerBannerSessionEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k1s0 {
    public final t2j0 a;

    public k1s0(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void a(String str, String str2, long j, String str3, List list, String str4) {
        j1s0 j1s0VarO = PartnerBannerSessionEvent.o();
        j1s0VarO.q(str);
        j1s0VarO.t("end");
        j1s0VarO.s(str2);
        j1s0VarO.u(j);
        j1s0VarO.v(str3);
        j1s0VarO.n(list);
        j1s0VarO.r(str4);
        this.a.a(j1s0VarO.build());
    }
}
