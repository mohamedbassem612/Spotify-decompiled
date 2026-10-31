package p;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ria1 {
    public static final HashSet c = dm61.t0(new String[]{"name", "addTime", "frecencyScore", "recentlyPlayedRank"});
    public static final bma1 d = bma1.b.u("atp_sort_order_key");
    public final Context a;
    public final ut71 b;

    public ria1(Context context, ut71 ut71Var) {
        this.a = context;
        this.b = ut71Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static pia1 b(String str) {
        switch (str.hashCode()) {
            case -1148582130:
                if (str.equals("addTime")) {
                    return pia1.d;
                }
                break;
            case -1113428761:
                if (str.equals("recentlyPlayedRank")) {
                    return pia1.f;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    return pia1.c;
                }
                break;
            case 368455625:
                if (str.equals("frecencyScore")) {
                    return pia1.e;
                }
                break;
        }
        return pia1.a;
    }

    public static String c(pia1 pia1Var) {
        int iOrdinal = pia1Var.ordinal();
        if (iOrdinal == 0) {
            return "name";
        }
        if (iOrdinal == 1) {
            return "addTime";
        }
        if (iOrdinal == 2) {
            return "frecencyScore";
        }
        if (iOrdinal == 3) {
            return "recentlyPlayedRank";
        }
        eg.o();
        return null;
    }

    public final pia1 a(String str) {
        Object next;
        String strE = this.b.b(this.a, str).e(d, c(pia1.a));
        Iterator it = c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j((String) next, strE));
        String str2 = (String) next;
        return str2 == null ? pia1.a : b(str2);
    }
}
