package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pn80 {
    public static final bma1 j;
    public static final bma1 k;
    public static final bma1 l;
    public static final bma1 m;
    public final Context a;
    public final String b;
    public final zwg c;
    public final onv0 d;
    public final em3 e;
    public final l6s f;
    public final c9n g;
    public final y7r h;
    public final dma1 i;

    static {
        nbc nbcVar = bma1.b;
        j = nbcVar.q("install_referrer_read");
        k = nbcVar.q("ddl_matching_attempted");
        l = nbcVar.q("ddl_referrer_param");
        m = nbcVar.q("ddl_match_attempt_count");
    }

    public pn80(Context context, ut71 ut71Var, String str, zwg zwgVar, onv0 onv0Var, em3 em3Var, l6s l6sVar, c9n c9nVar, y7r y7rVar) {
        this.a = context;
        this.b = str;
        this.c = zwgVar;
        this.d = onv0Var;
        this.e = em3Var;
        this.f = l6sVar;
        this.g = c9nVar;
        this.h = y7rVar;
        this.i = ut71Var.c(context);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[PHI: r1
      0x0062: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:12:0x0035, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[RETURN] */
    public static String b(String str) {
        Object next;
        String strU0;
        String strDecode;
        Object next2;
        String str2;
        List listP0 = ihc1.P0(str, new char[]{'&'}, 6);
        Iterator it = listP0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str2 = (String) next;
            if (u890.j(str2, "deep_link")) {
                break;
            }
        } while (!nhc1.Y(str2, "deep_link=", false));
        String strT0 = (String) next;
        if (strT0 == null) {
            Iterator it2 = listP0.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!nhc1.Y((String) next2, "?deep_link=", false));
            String str3 = (String) next2;
            strT0 = str3 != null ? ihc1.T0(str3, '?', str3) : null;
            if (strT0 != null) {
                if (strT0.equals("deep_link")) {
                    strU0 = "";
                } else {
                    strU0 = ihc1.U0(strT0, "deep_link=", strT0);
                }
                strDecode = Uri.decode(strU0);
                strDecode.getClass();
                if (strDecode.length() > 0) {
                    return strDecode;
                }
            }
        } else {
            if (strT0.equals("deep_link")) {
                strU0 = "";
            } else {
                strU0 = ihc1.U0(strT0, "deep_link=", strT0);
            }
            strDecode = Uri.decode(strU0);
            strDecode.getClass();
            if (strDecode.length() > 0) {
                return strDecode;
            }
        }
        return null;
    }

    public final void a(String str) {
        dma1 dma1Var = this.i;
        if (dma1Var.h(k, false)) {
            return;
        }
        String strB = str != null ? b(str) : dma1Var.e(l, (String) null);
        if (strB != null) {
            if (this.h.a(this.g, new fpo(this, strB, (lnm) null, (byte) 12))) {
                return;
            }
            Logger.g("Referrer matching already in flight", new Object[0]);
        } else if (str != null) {
            e(true);
        } else {
            c();
        }
    }

    public final void c() {
        dma1 dma1Var = this.i;
        bma1 bma1Var = k;
        if (dma1Var.h(bma1Var, false)) {
            return;
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.a(bma1Var, true);
        hma1VarEdit.f(l);
        hma1VarEdit.f(m);
        hma1VarEdit.h();
    }

    public final boolean d(String str) {
        dma1 dma1Var = this.i;
        bma1 bma1Var = m;
        int iL = dma1Var.l(bma1Var, 0) + 1;
        if (iL >= 3) {
            Logger.d("Referrer matching: %s failure, giving up after %d attempts", new Object[]{str, Integer.valueOf(iL)});
            return true;
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1Var, iL);
        hma1VarEdit.h();
        Logger.d("Referrer matching: %s failure on attempt %d, will retry", new Object[]{str, Integer.valueOf(iL)});
        return false;
    }

    public final void e(boolean z) {
        if (this.h.a(this.g, new on80(this, z, null))) {
            return;
        }
        Logger.g("Referrer matching already in flight", new Object[0]);
    }
}
