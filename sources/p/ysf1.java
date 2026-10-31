package p;

import com.spotify.p4p.ucp.agenticlist.v1.AgenticListError;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ysf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysf1(String str, ffe1 ffe1Var) {
        super(1);
        this.a = (byte) 13;
        this.b = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object invoke(Object obj) {
        int i;
        zah1 m231Var;
        zah1 zah1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                ((qv00) obj).a(str, z1g1.class, false);
                return rih1Var;
            case 1:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, yo60.class, false);
                qv00Var.a(str, xkk1.class, false);
                return rih1Var;
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                ((qv00) obj).a(str, d7u0.class, false);
                return rih1Var;
            case 4:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 5:
                return ((l2l0) obj).a(str.concat(":dna"));
            case 6:
                b261.A((e261) obj, str);
                return rih1Var;
            case 7:
                ((qv00) obj).a(str, va81.class, false);
                return rih1Var;
            case 8:
                ((qv00) obj).a(str, mdz.class, false);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, ddz.class, false);
                return rih1Var;
            case 10:
                ((qv00) obj).a(str, ddz.class, true);
                return rih1Var;
            case 11:
                ((qv00) obj).b(mig1.class, Collections.singletonList(str), false);
                return rih1Var;
            case 12:
                e261 e261Var = (e261) obj;
                b261.t(e261Var, 0);
                b261.C(e261Var, new af5(str));
                return rih1Var;
            case 13:
                byc0 byc0Var = (byc0) ((Map) obj).get(str);
                if (byc0Var == null || (200 <= (i = byc0Var.a) && i < 300)) {
                    return mm81.a;
                }
                phc phcVar = byc0Var.c;
                if (phcVar != null) {
                    try {
                        m231Var = ybh1.a(AgenticListError.u(phcVar));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    zah1Var = m231Var;
                    break;
                } else {
                    zah1Var = null;
                }
                String str2 = byc0Var.b;
                switch (str2.hashCode()) {
                    case -1711692763:
                        if (str2.equals("INVALID_ARGUMENT")) {
                            return new hm81(zah1Var);
                        }
                        break;
                    case -485608986:
                        if (str2.equals("INTERNAL_ERROR")) {
                            return new gm81(zah1Var);
                        }
                        break;
                    case -113438152:
                        if (str2.equals("INVALID_SIGNAL_IDENTIFIER")) {
                            return new im81(zah1Var);
                        }
                        break;
                    case 399554809:
                        if (str2.equals("PROMPT_REJECTED")) {
                            return new jm81(zah1Var);
                        }
                        break;
                    case 481886586:
                        if (str2.equals("SIGNAL_PROCESSING_ABORTED")) {
                            return new lm81(zah1Var);
                        }
                        break;
                    case 626912539:
                        if (str2.equals("RATE_LIMITED")) {
                            return new km81(zah1Var);
                        }
                        break;
                }
                if (i == 400) {
                    return new im81(zah1Var);
                }
                if (i == 422) {
                    return (zah1Var != null ? zah1Var.d : null) instanceof fbh1 ? new jm81(zah1Var) : new hm81(zah1Var);
                }
                if (i != 429) {
                    return (zah1Var != null ? zah1Var.d : null) instanceof abh1 ? new lm81(zah1Var) : new gm81(zah1Var);
                }
                return new km81(zah1Var);
            case 14:
                return ((r2l0) obj).h(str);
            case 15:
                x2l0 x2l0Var = (x2l0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("unpin_item", 1, Collections.singletonMap("item_to_unpin", str)), x2l0Var.a, r6h1.c, System.currentTimeMillis());
            case 16:
                return ((q2l0) obj).e(str);
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case 18:
                b261.n((e261) obj, str);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                ((qv00) obj).a(str, zei1.class, false);
                return rih1Var;
            case 21:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.x(e261Var2, 0);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                ((qv00) obj).a(str, ldj1.class, false);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                return str;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new hnj1(str);
            case 28:
                return new hnj1(str);
            default:
                b261.n((e261) obj, str);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysf1(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }
}
