package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s6r {
    public final LocalDate a;
    public final LocalDate b;

    public s6r(LocalDate localDate, LocalDate localDate2) {
        this.a = localDate;
        this.b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6r)) {
            return false;
        }
        s6r s6rVar = (s6r) obj;
        return u890.j(this.a, s6rVar.a) && u890.j(this.b, s6rVar.b);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
