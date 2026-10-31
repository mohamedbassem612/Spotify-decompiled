package p;

import com.spotify.messages.AdUnlockedOnDemand;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ce31 {
    public final t2j0 a;
    public String b = UUID.randomUUID().toString();
    public int c = 6;

    public ce31(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void a(String str, String str2) {
        c01 c01VarN = AdUnlockedOnDemand.n();
        c01VarN.n(b01.CAP_REFRESH_FAILURE);
        c01VarN.s(this.b);
        c01VarN.r(str);
        c01VarN.q(str2);
        b(c01VarN);
        this.a.a(c01VarN.build());
    }

    public final void b(c01 c01Var) {
        d01 d01Var;
        int i = this.c;
        if (i != 6) {
            int iC = l1d.C(i);
            if (iC == 0) {
                d01Var = d01.ENTITY_PAGE;
            } else if (iC == 1) {
                d01Var = d01.SEARCH;
            } else if (iC == 2) {
                d01Var = d01.TRACK_SKIP;
            } else if (iC == 3) {
                d01Var = d01.HOME;
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        eg.o();
                        return;
                    } else {
                        eg.m("UNKNOWN source must not be converted to proto");
                        return;
                    }
                }
                d01Var = d01.NOW_PLAYING;
            }
            c01Var.t(d01Var);
        }
    }
}
