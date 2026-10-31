package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o720 extends t720 {
    public final LocalDate a;
    public final LocalDate b;

    public o720(LocalDate localDate, LocalDate localDate2) {
        this.a = localDate;
        this.b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o720)) {
            return false;
        }
        o720 o720Var = (o720) obj;
        return u890.j(this.a, o720Var.a) && u890.j(this.b, o720Var.b);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
