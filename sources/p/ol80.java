package p;

import j$.time.Instant;
import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ol80 {
    public final LocalDate a;
    public final LocalDate b;
    public final Instant c;

    public ol80(LocalDate localDate, LocalDate localDate2, Instant instant) {
        this.a = localDate;
        this.b = localDate2;
        this.c = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol80)) {
            return false;
        }
        ol80 ol80Var = (ol80) obj;
        return this.a.equals(ol80Var.a) && this.b.equals(ol80Var.b) && this.c.equals(ol80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
