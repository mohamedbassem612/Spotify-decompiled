package p;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hgu0 extends a96 {
    public final i5y0 a;
    public final Set b = f46.S0(new blc0[]{blc0.Ra, blc0.Be});

    public hgu0(i5y0 i5y0Var) {
        this.a = i5y0Var;
    }

    public final Set a() {
        return this.b;
    }

    @Override // p.a96
    public final chr0 f() {
        return chr0.a;
    }

    public final String getDescription() {
        return "this page will show user prompts that they can edit";
    }

    @Override // p.a96
    public final psk h(String str, String str2) {
        psk pskVarValueOf;
        i5y0 i5y0Var = this.a;
        if (!i5y0Var.e() && i5y0Var.g()) {
            return psk.a;
        }
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return psk.b;
        }
        return (str2 == null || (pskVarValueOf = psk.valueOf(str2.toUpperCase(Locale.ROOT))) == null) ? psk.c : pskVarValueOf;
    }

    public final boolean isEnabled() {
        return this.a.g();
    }
}
