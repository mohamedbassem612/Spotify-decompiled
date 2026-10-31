package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pnr0 {
    public final onr0 a;
    public final int b;

    public pnr0(onr0 onr0Var, int i) {
        this.a = onr0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnr0)) {
            return false;
        }
        pnr0 pnr0Var = (pnr0) obj;
        return this.a == pnr0Var.a && this.b == pnr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String strName = this.a.name();
        Locale locale = Locale.ROOT;
        return gvg.h(strName.toLowerCase(locale), "(", jup0.l(this.b).toLowerCase(locale), ")");
    }
}
