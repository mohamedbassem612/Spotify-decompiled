package p;

import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xcs0 {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public static final bma1 j;
    public static final bma1 k;
    public final dma1 a;
    public final yqg b;
    public final nfa0 c;
    public final nlc0 d;
    public final r36 e;

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("payment_success_urls");
        g = nbcVar.u("payment_cancel_urls");
        h = nbcVar.u("payment_pending_error_timestamp");
        i = nbcVar.u("payment_pending_error_action");
        j = nbcVar.u("payment_pending_error_session_id");
        k = nbcVar.u("payment_selected_painted_door_methods");
    }

    public xcs0(dma1 dma1Var, yqg yqgVar, nfa0 nfa0Var) {
        this.a = dma1Var;
        this.b = yqgVar;
        this.c = nfa0Var;
        chc1 chc1Var = chc1.a;
        this.d = new nlc0(chc1Var, p3i1.Companion.serializer());
        this.e = new r36(chc1Var, (byte) 1);
    }

    public final Map a(bma1 bma1Var) {
        Map map;
        String strE = this.a.e(bma1Var, "{}");
        if (strE != null) {
            try {
                map = (Map) this.c.a(strE, this.d);
            } catch (Exception e) {
                Logger.e(e, "Invalid JSON in URLs prefs: %s", new Object[]{strE});
                map = null;
            }
            if (map != null) {
                return map;
            }
        }
        return b7x.a;
    }

    public final Set b() {
        Set set = null;
        String strE = this.a.e(k, (String) null);
        if (strE != null) {
            try {
                set = (Set) this.c.a(strE, this.e);
            } catch (Exception e) {
                Logger.e(e, "Invalid JSON in painted door providers prefs: %s", new Object[]{strE});
            }
            if (set != null) {
                return set;
            }
        }
        return w7x.a;
    }

    public final void c(String str, String str2) {
        bma1 bma1Var = g;
        LinkedHashMap linkedHashMapX = sqg0.X(a(bma1Var));
        linkedHashMapX.entrySet().removeIf(new wcs0(this));
        linkedHashMapX.put(str, new p3i1(str, str2, this.b.b()));
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(bma1Var, this.c.b(this.d, linkedHashMapX));
        hma1VarEdit.g();
    }

    public final void d(String str, rz21 rz21Var) {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(h, String.valueOf(this.b.b()));
        bma1 bma1Var = j;
        if (str != null) {
            hma1VarEdit.d(bma1Var, str);
        } else {
            hma1VarEdit.f(bma1Var);
        }
        i3c1 i3c1Var = null;
        if (rz21Var != null) {
            if (rz21Var instanceof iz21) {
                i3c1Var = new i3c1(((iz21) rz21Var).a());
            } else if (rz21Var instanceof az21) {
                az21 az21Var = (az21) rz21Var;
                i3c1Var = new i3c1("discount_blocker", az21Var.a(), az21Var.b());
            } else if (rz21Var instanceof mz21) {
                mz21 mz21Var = (mz21) rz21Var;
                i3c1Var = new i3c1("payment_method_discount_blocker", mz21Var.a(), mz21Var.b());
            } else if (rz21Var instanceof xy21) {
                xy21 xy21Var = (xy21) rz21Var;
                i3c1Var = new i3c1("country_mismatch", xy21Var.a(), xy21Var.b());
            }
        }
        bma1 bma1Var2 = i;
        if (i3c1Var != null) {
            hma1VarEdit.d(bma1Var2, this.c.b(i3c1.Companion.serializer(), i3c1Var));
        } else {
            hma1VarEdit.f(bma1Var2);
        }
        hma1VarEdit.g();
    }

    public final void e(String str, String str2) {
        bma1 bma1Var = f;
        LinkedHashMap linkedHashMapX = sqg0.X(a(bma1Var));
        linkedHashMapX.entrySet().removeIf(new wcs0(this));
        linkedHashMapX.put(str, new p3i1(str, str2, this.b.b()));
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(bma1Var, this.c.b(this.d, linkedHashMapX));
        hma1VarEdit.g();
    }
}
