package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ver0 implements qfr0 {
    public final List a;
    public final tfr0 b;

    public ver0(List list, tfr0 tfr0Var) {
        this.a = list;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ver0)) {
            return false;
        }
        ver0 ver0Var = (ver0) obj;
        return this.a.equals(ver0Var.a) && this.b.equals(ver0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
