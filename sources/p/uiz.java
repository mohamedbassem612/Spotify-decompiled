package p;

import com.google.protobuf.Timestamp;
import com.spotify.p4p.v1.AgenticListError;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class uiz {
    public static final n4y0 a(AgenticListError agenticListError) {
        String string;
        int iP = agenticListError.p();
        int i = iP == 0 ? -1 : tiz.a[l1d.C(iP)];
        if (i == 1) {
            return new f4y0(agenticListError.q());
        }
        if (i == 2) {
            return new k4y0(agenticListError.q());
        }
        if (i != 3) {
            return new i4y0(agenticListError.q());
        }
        String strQ = agenticListError.q();
        if (agenticListError.o().p()) {
            Timestamp timestampO = agenticListError.o().o();
            string = Instant.ofEpochSecond(timestampO.q(), timestampO.p()).toString();
        } else {
            string = "";
        }
        string.getClass();
        return new h4y0(strQ, string);
    }

    public static final List b(String str, nfa0 nfa0Var) {
        ArrayList m231Var;
        try {
            pfa0 pfa0VarK = fga0.k(nfa0Var.c(str));
            m231Var = new ArrayList(q7h.U(pfa0VarK, 10));
            Iterator it = pfa0VarK.a.iterator();
            while (it.hasNext()) {
                uga0 uga0VarL = fga0.l((ega0) it.next());
                m231Var.add((!uga0VarL.containsKey("display_text") || uga0VarL.containsKey("promptable_playlist_error_type")) ? c((kzx0) hon1.z(nfa0Var, uga0VarL, kzx0.Companion.serializer())) : a(xx2.a(uga0VarL)));
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = z6x.a;
        }
        return m231Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final n4y0 c(kzx0 kzx0Var) {
        String str = kzx0Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = kzx0Var.a;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 1267083357:
                    if (str2.equals("BACKEND_ERROR")) {
                        return new f4y0(str);
                    }
                    break;
                case 1805601789:
                    if (str2.equals("TERMS_AND_SERVICES_CHECKER_ERROR")) {
                        return new m4y0(str);
                    }
                    break;
                case 1848051136:
                    if (str2.equals("PROMPT_VALIDATOR_ERROR")) {
                        return new k4y0(str);
                    }
                    break;
                case 1896073503:
                    if (str2.equals("RATE_LIMIT_EXCEEDED_ERROR")) {
                        return new h4y0(str, "");
                    }
                    break;
            }
        }
        return new i4y0(str);
    }
}
