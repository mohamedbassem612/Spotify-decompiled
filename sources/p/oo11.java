package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oo11 {
    public final int a;
    public final LocalDate b;

    public oo11(int i, LocalDate localDate) {
        this.a = i;
        this.b = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo11)) {
            return false;
        }
        oo11 oo11Var = (oo11) obj;
        return this.a == oo11Var.a && this.b.equals(oo11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
