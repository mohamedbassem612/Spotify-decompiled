package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lfr0 implements qfr0, sfr0 {
    public final ArrayList a;
    public final String b;
    public final tfr0 c;

    public lfr0(ArrayList arrayList, String str, tfr0 tfr0Var) {
        this.a = arrayList;
        this.b = str;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfr0)) {
            return false;
        }
        lfr0 lfr0Var = (lfr0) obj;
        return this.a.equals(lfr0Var.a) && u890.j(this.b, lfr0Var.b) && this.c.equals(lfr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
