package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kyb extends dsa0 {
    public final LocalDate c;
    public final LocalDate d;

    public kyb(LocalDate localDate, LocalDate localDate2) {
        this.c = localDate;
        this.d = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyb)) {
            return false;
        }
        kyb kybVar = (kyb) obj;
        return u890.j(this.c, kybVar.c) && u890.j(this.d, kybVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.c;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.d;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
