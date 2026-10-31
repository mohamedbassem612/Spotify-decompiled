package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class rcr {
    public final k9r a;
    public final xfb0 b;
    public final t8r0 c;
    public final gw70 d;
    public final m4r e = new m4r(this, (byte) 8);
    public final pcr f;

    public rcr(k9r k9rVar, xfb0 xfb0Var, t8r0 t8r0Var, gw70 gw70Var, pcr pcrVar) {
        this.a = k9rVar;
        this.b = xfb0Var;
        this.c = t8r0Var;
        this.d = gw70Var;
        this.f = pcrVar;
    }

    public static boolean c(hi hiVar, String str, String str2, String str3) {
        if (str.equalsIgnoreCase(((qi) hiVar).b)) {
            return true;
        }
        ii iiVarA = hiVar.a();
        if (!str2.equalsIgnoreCase(iiVarA != null ? iiVarA.c : null)) {
            return false;
        }
        ii iiVarA2 = hiVar.a();
        return str3.equalsIgnoreCase(iiVarA2 != null ? iiVarA2.d : null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    public boolean a(hi hiVar) {
        boolean zH;
        boolean z;
        boolean zK = this.a.k(hiVar);
        String str = ((qi) hiVar).b;
        if (str != null) {
            zH = this.b.a.h(bma1.b.n("tap_onboarding_dialog_shown_".concat(str)), false);
        } else {
            zH = false;
        }
        if (str != null) {
            long jG = ((dma1) this.c.a).g(bma1.b.n("last_tap_usage_timestamp_".concat(nhc1.W(str, " ", "_").toLowerCase(Locale.ROOT))), -1L);
            if ((jG != -1 ? Long.valueOf(jG) : null) != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return (!zK || zH || z) ? false : true;
    }

    public abstract iu30 b();
}
