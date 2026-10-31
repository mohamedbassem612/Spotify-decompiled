package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fnu0 implements gnu0 {
    public final knu0 a;
    public final ArrayList b;

    public fnu0(knu0 knu0Var, ArrayList arrayList) {
        this.a = knu0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnu0)) {
            return false;
        }
        fnu0 fnu0Var = (fnu0) obj;
        return this.a.equals(fnu0Var.a) && this.b.equals(fnu0Var.b);
    }

    public final knu0 getSender() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
