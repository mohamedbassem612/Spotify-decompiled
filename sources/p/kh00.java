package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kh00 extends mh00 {
    public final LocalDate a;
    public final LocalDate b;

    public kh00(LocalDate localDate, LocalDate localDate2) {
        this.a = localDate;
        this.b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh00)) {
            return false;
        }
        kh00 kh00Var = (kh00) obj;
        return u890.j(this.a, kh00Var.a) && u890.j(this.b, kh00Var.b);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
