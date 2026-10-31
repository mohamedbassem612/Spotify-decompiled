package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jfr0 implements qfr0, sfr0 {
    public final ArrayList a;
    public final tfr0 b;

    public jfr0(ArrayList arrayList, tfr0 tfr0Var) {
        this.a = arrayList;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfr0)) {
            return false;
        }
        jfr0 jfr0Var = (jfr0) obj;
        return this.a.equals(jfr0Var.a) && this.b.equals(jfr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
