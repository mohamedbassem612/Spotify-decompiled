package p;

import com.spotify.p4p.v1.AgenticListError;
import com.spotify.p4p.v1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class xx2 {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0("internal_error", qx2.a), new mmr0("no_content", rx2.a), new mmr0("capping_exceeded", sx2.a), new mmr0("prompt_rejected", tx2.a), new mmr0("invalid_argument", ux2.a), new mmr0("aborted", vx2.a), new mmr0("rate_limited", wx2.a)});

    public static final AgenticListError a(uga0 uga0Var) {
        c cVarR = AgenticListError.r();
        ega0 ega0VarB = b(uga0Var, "display_text");
        if (ega0VarB != null) {
            cVarR.t(c(ega0VarB));
        }
        ega0 ega0VarB2 = b(uga0Var, "retryable");
        if (ega0VarB2 != null) {
            aha0 aha0VarM = fga0.m(ega0VarB2);
            if (aha0VarM.c()) {
                hhg1.n("Expected a JSON boolean");
                return null;
            }
            cVarR.z(fga0.e(aha0VarM));
        }
        ega0 ega0VarB3 = b(uga0Var, "prompt_ids");
        if (ega0VarB3 != null) {
            pfa0 pfa0VarK = fga0.k(ega0VarB3);
            ArrayList arrayList = new ArrayList(q7h.U(pfa0VarK, 10));
            Iterator it = pfa0VarK.a.iterator();
            while (it.hasNext()) {
                arrayList.add(c((ega0) it.next()));
            }
            cVarR.n(arrayList);
        }
        for (Map.Entry entry : uga0Var.a.entrySet()) {
            String str = (String) entry.getKey();
            ega0 ega0Var = (ega0) entry.getValue();
            vu30 vu30Var = (vu30) a.get(str);
            if (!u890.j(ega0Var, rga0.INSTANCE) && vu30Var != null) {
                if (cVarR.q() != 8) {
                    hhg1.n("AgenticListError must contain at most one details case");
                    return null;
                }
                vu30Var.invoke(cVarR, fga0.l(ega0Var));
            }
        }
        return (AgenticListError) cVarR.build();
    }

    public static final ega0 b(uga0 uga0Var, String str) {
        ega0 ega0Var = (ega0) uga0Var.get(str);
        if (ega0Var == null || ega0Var.equals(rga0.INSTANCE)) {
            return null;
        }
        return ega0Var;
    }

    public static final String c(ega0 ega0Var) {
        aha0 aha0VarM = fga0.m(ega0Var);
        if (aha0VarM.c()) {
            return aha0VarM.b();
        }
        hhg1.n("Expected a JSON string");
        return null;
    }
}
