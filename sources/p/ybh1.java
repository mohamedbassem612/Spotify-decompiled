package p;

import com.spotify.p4p.ucp.agenticlist.v1.AgenticListError;
import com.spotify.p4p.ucp.agenticlist.v1.b;
import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ybh1 {
    public static final zah1 a(AgenticListError agenticListError) {
        String strQ = agenticListError.q();
        boolean zT = agenticListError.t();
        h290 h290VarR = agenticListError.r();
        int iP = agenticListError.p();
        hbh1 bbh1Var = null;
        switch (iP == 0 ? -1 : xbh1.a[l1d.C(iP)]) {
            case 1:
                bbh1Var = cbh1.a;
                break;
            case 2:
                bbh1Var = ebh1.a;
                break;
            case 3:
                bbh1Var = new bbh1(agenticListError.o().r() ? Long.valueOf(agenticListError.o().p()) : null, agenticListError.o().q() ? Instant.ofEpochSecond(agenticListError.o().o().q(), agenticListError.o().o().p()).toString() : null);
                break;
            case 4:
                bbh1Var = new fbh1(agenticListError.s().o());
                break;
            case 5:
                bbh1Var = dbh1.a;
                break;
            case 6:
                b bVarO = agenticListError.n().o();
                if (bVarO == b.d || bVarO == b.b) {
                    bVarO = null;
                }
                bbh1Var = new abh1(bVarO != null ? bVarO.name() : null);
                break;
            case 7:
                bbh1Var = gbh1.a;
                break;
        }
        return new zah1(strQ, zT, h290VarR, bbh1Var);
    }
}
