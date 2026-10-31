package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v720 extends yzo1 {
    public final LocalDate c;
    public final LocalDate d;

    public v720(LocalDate localDate, LocalDate localDate2) {
        this.c = localDate;
        this.d = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v720)) {
            return false;
        }
        v720 v720Var = (v720) obj;
        return u890.j(this.c, v720Var.c) && u890.j(this.d, v720Var.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.c;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.d;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
