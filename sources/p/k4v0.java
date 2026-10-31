package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k4v0 implements it80 {
    public final iyc0 a;
    public final kv00 b;
    public final ov20 c;
    public final x2z d;
    public final tjq e;
    public final dg30 f;

    public k4v0(iyc0 iyc0Var, kv00 kv00Var, ov20 ov20Var, x2z x2zVar, tjq tjqVar, dg30 dg30Var) {
        this.a = iyc0Var;
        this.b = kv00Var;
        this.c = ov20Var;
        this.d = x2zVar;
        this.e = tjqVar;
        this.f = dg30Var;
    }

    public static String c(s4b1 s4b1Var) {
        w6b1 w6b1VarA = f7b1.a(blc0.Pg);
        if (w6b1VarA == null) {
            eg.m("Creation of SpotifyUri LinkType.SHOW_EPISODE failed");
            return null;
        }
        String str = (String) o7h.s0(w6b1VarA.c);
        if (str == null) {
            eg.m("No patterns found for LinkType.SHOW_EPISODE");
            return null;
        }
        Pattern pattern = w6b1.j;
        ihc1.N0(0);
        return f4i1.f(o7h.y0(o7h.l0(1, Arrays.asList(pattern.split(str, -1))), ":", (String) null, (String) null, (iu30) null, 62), ":", s4b1Var.j());
    }

    public final void a(ajq0 ajq0Var) {
        Class<k4v0> cls = k4v0.class;
        wmo1.q(ajq0Var, new ebu(blc0.Pg, (byte) 7), "Handle show episode links", new lh2(3, this, cls, "openShowEpisodeNavigateAction", "openShowEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 9));
        int i = 0;
        int i2 = 3;
        wmo1.q(ajq0Var, new ebu(blc0.ld, (byte) 7), "Show podcast episode page", new lh2(i2, this, cls, "openEpisodeNavigateAction", "openEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 10));
        wmo1.q(ajq0Var, new ebu(blc0.z6, (byte) 7), "Handle episode autoplay links", new lh2(i2, this, cls, "openEpisodeNavigateAction", "openEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 11));
        wmo1.q(ajq0Var, new ebu(blc0.Qg, (byte) 7), "Handle episode autoplay links with show context", new lh2(i2, this, cls, "openEpisodeNavigateAction", "openEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 12));
        wmo1.q(ajq0Var, new ebu(blc0.Vg, (byte) 7), "Handle show episode timestamp links", new lh2(i2, this, cls, "openEpisodeNavigateAction", "openEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 13));
        wmo1.q(ajq0Var, new ebu(blc0.Rg, (byte) 7), "Handle episode autoplay links with timestamp", new lh2(i2, this, cls, "openEpisodeNavigateAction", "openEpisodeNavigateAction(Landroid/content/Intent;Lcom/spotify/connectivity/sessionstate/SessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        h4v0 h4v0Var;
        if (onmVar instanceof h4v0) {
            h4v0Var = (h4v0) onmVar;
            int i = h4v0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4v0Var.c = i - Integer.MIN_VALUE;
            } else {
                h4v0Var = new h4v0(this, onmVar);
            }
        } else {
            h4v0Var = new h4v0(this, onmVar);
        }
        Object objO = h4v0Var.a;
        int i2 = h4v0Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            k1e0 k1e0Var = new k1e0(this, str, str2, (lnm) null, (byte) 28);
            h4v0Var.c = 1;
            objO = rc2.O(5000L, k1e0Var, h4v0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        ly21 ly21Var = (py21) objO;
        if (!(ly21Var instanceof oy21)) {
            if (ly21Var instanceof ly21) {
                Logger.k("Episode invitation claim failed: %s", new Object[]{ly21Var.a.a()});
            } else {
                if (ly21Var != null) {
                    eg.o();
                    return null;
                }
                Logger.k("Episode invitation claim timed out", new Object[0]);
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        i4v0 i4v0Var;
        if (onmVar instanceof i4v0) {
            i4v0Var = (i4v0) onmVar;
            int i = i4v0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4v0Var.c = i - Integer.MIN_VALUE;
            } else {
                i4v0Var = new i4v0(this, onmVar);
            }
        } else {
            i4v0Var = new i4v0(this, onmVar);
        }
        Object objI = i4v0Var.a;
        int i2 = i4v0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVar = this.c.a;
            i4v0Var.c = 1;
            objI = b5p1.i(ezcVar, i4v0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        Map map = (Map) objI;
        if (!y7y0.t("has-podcasts-available", map) && !y7y0.x(map)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final irn0 e(String str, String str2, Intent intent, th61 th61Var, s4b1 s4b1Var) {
        if (u890.j(str, str2)) {
            Uri uri = s4b1Var.a;
            String queryParameter = uri != null ? uri.getQueryParameter("context") : null;
            if (!(queryParameter == null || queryParameter.length() == 0)) {
                s4b1 s4b1VarG = s4b1Var.g();
                return s4b1VarG == null ? new ern0(s4b1Var) : new ern0(s4b1VarG);
            }
        }
        return f(str, intent, th61Var, s4b1Var);
    }

    public final hrn0 f(String str, Intent intent, th61 th61Var, s4b1 s4b1Var) {
        String str2;
        String strJ;
        String str3;
        String string;
        String queryParameter;
        u9c0 u9c0VarQ = cto1.q(this.f);
        tjq tjqVar = this.e;
        if (((lh4) tjqVar.b).c()) {
            xab1 xab1Var = (xab1) tjqVar.e;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            str2 = str;
            tjqVar.e = fn31.T(u9c0VarQ, (o8n) null, 0, new og5(tjqVar, str2, (lnm) null, (byte) 15), 3);
        } else {
            str2 = str;
        }
        Bundle extras = intent.getExtras();
        String str4 = th61Var.a;
        blc0 blc0Var = s4b1Var.c;
        Uri uri = s4b1Var.a;
        int iOrdinal = blc0Var.ordinal();
        String str5 = "";
        if (iOrdinal == 846) {
            String strJ2 = s4b1Var.j();
            strJ = strJ2 != null ? (String) o7h.s0(ihc1.Q0(strJ2, new String[]{"&"}, 0, 6)) : null;
        } else if (iOrdinal != 850) {
            strJ = uri != null ? uri.getQueryParameter("t") : null;
            if (strJ == null) {
                strJ = "";
            }
        } else {
            strJ = s4b1Var.j();
        }
        Long lD0 = strJ != null ? nhc1.d0(10, strJ) : null;
        String queryParameter2 = uri != null ? uri.getQueryParameter("start_ms") : null;
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        Long lD1 = nhc1.d0(10, queryParameter2);
        int iOrdinal2 = s4b1Var.c.ordinal();
        if (iOrdinal2 == 846 || iOrdinal2 == 850) {
            String strJ3 = s4b1Var.j();
            if (strJ3 == null || (str3 = (String) o7h.C0(ihc1.Q0(strJ3, new String[]{"&"}, 0, 6))) == null || !ihc1.h0(str3, "he", false)) {
                str5 = null;
            } else {
                string = ihc1.I0(0, 3, str3).toString();
                str5 = string;
            }
        } else {
            string = uri != null ? uri.getQueryParameter("he") : null;
            if (string != null) {
                str5 = string;
            }
        }
        return new hrn0(c7z.class, new g7z(str2, extras, str4, lD0, lD1, str5 != null ? nhc1.d0(10, str5) : null, (uri == null || (queryParameter = uri.getQueryParameter("ct")) == null) ? null : nhc1.d0(10, queryParameter), true, true, true), a6w0.a);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[PHI: r1 r10 r11
      0x0120: PHI (r1v7 p.xu30) = (r1v6 p.xu30), (r1v6 p.xu30), (r1v8 p.xu30) binds: [B:62:0x00ff, B:67:0x0109, B:72:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r10v11 java.lang.String) = (r10v4 java.lang.String), (r10v4 java.lang.String), (r10v13 java.lang.String) binds: [B:62:0x00ff, B:67:0x0109, B:72:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r11v5 p.s4b1) = (r11v2 p.s4b1), (r11v2 p.s4b1), (r11v7 p.s4b1) binds: [B:62:0x00ff, B:67:0x0109, B:72:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Intent intent, xu30 xu30Var, lnm lnmVar) {
        j4v0 j4v0Var;
        String strE;
        s4b1 s4b1Var;
        String str;
        xu30 xu30Var2;
        String str2;
        s4b1 s4b1Var2;
        xu30 xu30Var3;
        Object objInvoke;
        if (lnmVar instanceof j4v0) {
            j4v0Var = (j4v0) lnmVar;
            int i = j4v0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4v0Var.f = i - Integer.MIN_VALUE;
            } else {
                j4v0Var = new j4v0(this, lnmVar);
            }
        } else {
            j4v0Var = new j4v0(this, lnmVar);
        }
        Object obj = j4v0Var.d;
        int i2 = j4v0Var.f;
        Object obj2 = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = j4v0Var.c;
                s4b1Var = j4v0Var.b;
                xu30Var2 = j4v0Var.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = j4v0Var.c;
                s4b1Var2 = j4v0Var.b;
                xu30Var3 = j4v0Var.a;
                hm5.M(obj);
            }
            xu30Var2 = xu30Var3;
            s4b1Var = s4b1Var2;
            str = str2;
            j4v0Var.a = null;
            j4v0Var.b = null;
            j4v0Var.c = null;
            j4v0Var.f = 3;
            objInvoke = xu30Var2.invoke(s4b1Var, str, j4v0Var);
            if (objInvoke != obj2) {
                return obj2;
            }
            return objInvoke;
        }
        hm5.M(obj);
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        blc0 blc0Var = s4b1VarX.c;
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 309) {
            strE = s4b1VarX.E();
        } else if (iOrdinal == 659) {
            strE = c(s4b1VarX);
        } else if (iOrdinal != 850) {
            switch (iOrdinal) {
                case 844:
                    strE = s4b1VarX.z();
                    break;
                case 845:
                    strE = c(s4b1VarX);
                    break;
                case 846:
                    s4b1 s4b1VarX2 = uic.x(s4b1VarX.E());
                    strE = s4b1VarX2.c != blc0.Vg ? s4b1VarX2.z() : s4b1VarX2.G(2, 2);
                    break;
                default:
                    hhg1.g(blc0Var, "Unexpected LinkType ");
                    return null;
            }
        } else {
            strE = blc0Var == blc0.Vg ? s4b1VarX.G(2, 2) : s4b1VarX.z();
        }
        if (strE == null) {
            hhg1.g(s4b1VarX, "null episode uri for SpotifyLink: ");
            return null;
        }
        j4v0Var.a = xu30Var;
        j4v0Var.b = s4b1VarX;
        j4v0Var.c = strE;
        j4v0Var.f = 1;
        Object objD = d(j4v0Var);
        if (objD != obj2) {
            s4b1Var = s4b1VarX;
            str = strE;
            obj = objD;
            xu30Var2 = xu30Var;
        }
        return obj2;
        if (!((Boolean) obj).booleanValue()) {
            blc0 blc0Var2 = blc0.L7;
            w6b1 w6b1VarA = f7b1.a(blc0Var2);
            List list = w6b1VarA != null ? w6b1VarA.c : null;
            if (list == null) {
                tw20.s(blc0Var2, " patterns not found. Can't navigate.");
                return null;
            }
            if (list.isEmpty()) {
                tw20.s(blc0Var2, " patterns not found. Can't navigate.");
                return null;
            }
            Set set2 = s4b1.f;
            return new ern0(uic.x((String) list.get(0)));
        }
        String strM = s4b1Var.m();
        if (strM == null) {
            j4v0Var.a = null;
            j4v0Var.b = null;
            j4v0Var.c = null;
            j4v0Var.f = 3;
            objInvoke = xu30Var2.invoke(s4b1Var, str, j4v0Var);
            if (objInvoke != obj2) {
                return objInvoke;
            }
        } else {
            if (ihc1.y0(strM)) {
                strM = null;
            }
            if (strM != null) {
                j4v0Var.a = xu30Var2;
                j4v0Var.b = s4b1Var;
                j4v0Var.c = str;
                j4v0Var.f = 2;
                if (b(str, strM, j4v0Var) != obj2) {
                    str2 = str;
                    s4b1Var2 = s4b1Var;
                    xu30Var3 = xu30Var2;
                    xu30Var2 = xu30Var3;
                    s4b1Var = s4b1Var2;
                    str = str2;
                    j4v0Var.a = null;
                    j4v0Var.b = null;
                    j4v0Var.c = null;
                    j4v0Var.f = 3;
                    objInvoke = xu30Var2.invoke(s4b1Var, str, j4v0Var);
                    if (objInvoke != obj2) {
                        return objInvoke;
                    }
                }
            } else {
                j4v0Var.a = null;
                j4v0Var.b = null;
                j4v0Var.c = null;
                j4v0Var.f = 3;
                objInvoke = xu30Var2.invoke(s4b1Var, str, j4v0Var);
                if (objInvoke != obj2) {
                    return objInvoke;
                }
            }
        }
        return obj2;
    }
}
